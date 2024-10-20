package defpackage;

import android.content.Context;
import android.net.Network;
import android.os.PowerManager;
import j$.util.Optional;
import java.io.IOException;
import java.io.OutputStream;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aipa implements aior {
    public static final acyz a = aczd.a(181030825);
    public final advp b;
    public aios c;
    public final PowerManager.WakeLock e;
    public asqc h;
    private final String j;
    private final String k;
    private final int l;
    private int m;
    private final ailh n;
    private final String o;
    private final aigy p;
    private final Network q;
    private final acnx r;
    private final UUID i = UUID.randomUUID();
    public aohs g = null;
    private aioz s = null;
    public long d = -1;
    final AtomicInteger f = new AtomicInteger(0);

    public aipa(Context context, Network network, String str, int i, String str2, int i2, String str3, acnx acnxVar, advp advpVar, aigy aigyVar, ailh ailhVar) {
        this.q = network;
        this.j = str;
        this.m = i;
        this.k = str2;
        this.l = i2;
        this.o = str3;
        this.r = acnxVar;
        this.b = advpVar;
        this.p = aigyVar;
        this.n = ailhVar;
        this.e = adwm.a(context).newWakeLock(1, "CarrierServices:SipTransport");
    }

    private final apjf t() {
        if (this.n == ailh.TCP) {
            return apjf.SOCKET_PROTOCOL_TYPE_TCP;
        }
        return apjf.SOCKET_PROTOCOL_TYPE_TLS;
    }

    @Override // defpackage.aior
    public final int a() {
        return this.m;
    }

    @Override // defpackage.aior
    public final int b() {
        return this.l;
    }

    @Override // defpackage.aior
    public final String c() {
        return this.o;
    }

    @Override // defpackage.aior
    public final String d() {
        return this.i.toString();
    }

    @Override // defpackage.aior
    public final String e() {
        return this.j;
    }

    @Override // defpackage.aior
    public final String f() {
        return this.k;
    }

    final synchronized void g(Network network) {
        aohs aohsVar;
        try {
            apjf t = t();
            acnx acnxVar = this.r;
            String str = this.j;
            String str2 = this.k;
            int i = this.l;
            int i2 = 1;
            if (!acnxVar.o()) {
                advr.o("Logging socket opening event, protocol type = %s", t);
                aozy s = acnxVar.s(t, acnx.p(str), str2, i, acnx.p(str2));
                if (!s.b.isMutable()) {
                    s.u();
                }
                apjg apjgVar = (apjg) s.b;
                apjg apjgVar2 = apjg.a;
                apjgVar.d = 1;
                apjgVar.b |= 2;
                acnxVar.l((apjg) s.s());
            }
            aioy aioyVar = new aioy(this, network, 0);
            String str3 = this.k;
            int i3 = this.l;
            if (m()) {
                advr.d(this.b, "Creating a TCP socket connection", new Object[0]);
                aohsVar = this.p.d(aioyVar, str3, i3, Optional.empty());
            } else {
                advr.c("Creating a TLS socket connection", new Object[0]);
                aohsVar = new aohs(new aigx(this.p, this.o, this, i2), aioyVar, str3, i3, Optional.empty());
            }
            this.g = aohsVar;
            aohsVar.H();
            this.g.F();
            advr.w(21, 3, "SIP connection established", new Object[0]);
            apjf t2 = t();
            acnx acnxVar2 = this.r;
            String str4 = this.j;
            String str5 = this.k;
            int i4 = this.l;
            if (acnxVar2.o()) {
                return;
            }
            advr.o("Logging socket opened event, protocol type = %s", t2);
            aozy s2 = acnxVar2.s(t2, acnx.p(str4), str5, i4, acnx.p(str5));
            if (!s2.b.isMutable()) {
                s2.u();
            }
            apjg apjgVar3 = (apjg) s2.b;
            apjg apjgVar4 = apjg.a;
            apjgVar3.d = 2;
            apjgVar3.b |= 2;
            acnxVar2.l((apjg) s2.s());
        } catch (IOException e) {
            k();
            q(apje.SOCKET_FAILURE_UNABLE_TO_OPEN);
            throw new aioq(e);
        }
    }

    @Override // defpackage.aior
    public final synchronized void h() {
        if (!this.f.compareAndSet(0, 1)) {
            return;
        }
        g(this.q);
        aioz aiozVar = new aioz(this);
        this.s = aiozVar;
        aiozVar.start();
    }

    @Override // defpackage.aior
    public final synchronized void i(ainh ainhVar) {
        aild aildVar;
        String bc = aetn.bc(ainhVar);
        try {
            this.h.getClass();
            if (this.s == null) {
                h();
            }
            byte[] b = ainhVar.b();
            if (b != null) {
                advr.d(this.b, ">>>>>>>>>> SIP send message[%s] started (%d bytes) [%s]", ahmc.ab(ainhVar.l), Integer.valueOf(b.length), bc);
                aohs aohsVar = this.g;
                if (aohsVar == null) {
                    s(2);
                    advr.h(this.b, "<<<<<<<<<< SIP message aborted [%s]: client socket is null", bc);
                    if (ainhVar.s() && bc != null) {
                        this.h.t(bc);
                        return;
                    }
                } else {
                    OutputStream F = aohsVar.F();
                    F.write(b);
                    F.flush();
                    advr.d(this.b, "<<<<<<<<<< SIP message[%s] sent [%s]", ahmc.ab(ainhVar.l), bc);
                    if (!ainhVar.r()) {
                        this.h.u(ainhVar);
                        return;
                    }
                }
                return;
            }
            throw new aild("SIP message to send is null");
        } catch (aioq | IOException e) {
            s(3);
            advr.j(e, this.b, "<<<<<<<<<< SIP message[%s] failed [%s]: %s", ahmc.ab(ainhVar.l), bc, e.getMessage());
            q(apje.SOCKET_FAILURE_WRITE_ERROR);
            p();
            if (e instanceof aild) {
                aildVar = (aild) e;
            } else {
                advp advpVar = this.b;
                aildVar = new aild(advpVar.a + ": Can't send message: " + e.getMessage(), e);
            }
            aios aiosVar = this.c;
            if (aiosVar != null) {
                aiosVar.a(d(), aildVar);
            } else {
                advr.r(this.b, "SipTransportErrorListener is null", new Object[0]);
            }
            throw aildVar;
        }
    }

    @Override // defpackage.aior
    public final void j(aios aiosVar) {
        this.c = aiosVar;
    }

    @Override // defpackage.aior
    public final synchronized void k() {
        if (!this.f.compareAndSet(1, 2)) {
            return;
        }
        aioz aiozVar = this.s;
        if (aiozVar != null) {
            aiozVar.interrupt();
        }
        r();
    }

    @Override // defpackage.aior
    public final void l(int i) {
        this.m = i;
    }

    @Override // defpackage.aior
    public final boolean m() {
        if (this.n == ailh.TCP) {
            return true;
        }
        return false;
    }

    @Override // defpackage.aior
    public final boolean n() {
        if (this.n == ailh.TLS) {
            return true;
        }
        return false;
    }

    @Override // defpackage.aior
    public final void o(asqc asqcVar) {
        this.h = asqcVar;
    }

    final synchronized void p() {
        try {
            aohs aohsVar = this.g;
            if (aohsVar != null) {
                aohsVar.G();
            }
            advr.w(22, 3, "SIP connection disconnected", new Object[0]);
            apjf t = t();
            acnx acnxVar = this.r;
            String str = this.j;
            String str2 = this.k;
            int i = this.l;
            if (!acnxVar.o()) {
                advr.o("Logging socket closed event, protocol type = %s", t);
                aozy s = acnxVar.s(t, acnx.p(str), str2, i, acnx.p(str2));
                if (!s.b.isMutable()) {
                    s.u();
                }
                apjg apjgVar = (apjg) s.b;
                apjg apjgVar2 = apjg.a;
                apjgVar.d = 4;
                apjgVar.b |= 2;
                acnxVar.l((apjg) s.s());
            }
        } catch (Exception e) {
            advr.t(e, this.b, "Unable to close socket", new Object[0]);
            q(apje.SOCKET_FAILURE_UNABLE_TO_CLOSE);
        }
        this.g = null;
    }

    public final void q(apje apjeVar) {
        acnx acnxVar = this.r;
        apjf t = t();
        long j = this.d;
        if (acnxVar.o()) {
            return;
        }
        int i = this.l;
        String str = this.k;
        String str2 = this.j;
        advr.o("Logging socket failure event, protocol type = %s, reason = %s", t, apjeVar);
        aozy s = acnxVar.s(t, acnx.p(str2), str, i, acnx.p(str));
        if (!s.b.isMutable()) {
            s.u();
        }
        apjg apjgVar = (apjg) s.b;
        apjg apjgVar2 = apjg.a;
        apjgVar.d = 3;
        apjgVar.b |= 2;
        if (!s.b.isMutable()) {
            s.u();
        }
        apag apagVar = s.b;
        apjg apjgVar3 = (apjg) apagVar;
        apjgVar3.e = apjeVar.j;
        apjgVar3.b |= 4;
        if (!apagVar.isMutable()) {
            s.u();
        }
        apjg apjgVar4 = (apjg) s.b;
        apjgVar4.b |= 512;
        apjgVar4.l = j;
        acnxVar.l((apjg) s.s());
    }

    public final void r() {
        p();
        this.s = null;
        try {
            this.h.w();
        } catch (Exception e) {
            s(4);
            advr.j(e, this.b, "caught exception in SipTransport#teardown", new Object[0]);
        }
    }

    public final void s(int i) {
        this.r.q(d(), i);
    }
}
