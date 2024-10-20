package defpackage;

import android.content.Context;
import android.os.PowerManager;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import com.google.android.ims.provisioning.config.ImsConfiguration;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class adoz extends adon {
    public String A;
    public final adwe B;
    private aiks G;
    private String H;
    private final PowerManager.WakeLock I;
    private final acqj K;
    private final adsj L;
    public final adou i;
    public final armf j;
    public final aijw l;
    public final yjr m;
    public String o;
    public boolean p;
    public String q;
    public adoy s;
    public aion t;
    public final adpl v;
    protected ailw x;
    public String z;
    private static final acyz C = aczd.a(174556556);
    private static final acyz D = aczd.a(181136833);
    private static final acyz E = aczd.a(182436580);
    public static final advp f = new advp("ImsServiceSession");
    private static final int F = (int) TimeUnit.SECONDS.toMillis(5);
    public final CopyOnWriteArrayList g = new CopyOnWriteArrayList();
    public final Object h = new Object();
    public final String k = aikx.a();
    public int n = 0;
    public boolean r = false;
    public boolean u = false;
    public boolean w = false;
    protected int y = 0;
    private final Object J = new Object();

    public adoz(Context context, adou adouVar, armf armfVar, String str, aion aionVar, acqj acqjVar, adwe adweVar) {
        boolean z;
        this.q = "";
        yjr d = ((adox) acrk.a(adox.class)).d();
        this.m = d;
        this.i = adouVar;
        this.j = armfVar;
        this.K = acqjVar;
        this.B = adweVar;
        this.d = 0;
        this.e = 0;
        this.L = new adsj(adouVar.a.c());
        this.I = ((PowerManager) context.getSystemService("power")).newWakeLock(1, A());
        this.z = aikx.b();
        this.A = aikx.b();
        this.v = new adpl(this, t(), armfVar, adweVar);
        if (aionVar == null) {
            z = true;
        } else {
            z = false;
        }
        this.p = z;
        aikn aiknVar = null;
        if (z) {
            if (str != null) {
                ag(str, ((aikc) armfVar).a);
                this.x = null;
                try {
                    adew adewVar = adouVar.a;
                    aikb v = v();
                    String v2 = aikb.v();
                    ArrayList p = v.p();
                    String e = adewVar.e();
                    if (e != null) {
                        this.l = new aijw(v2, 1, y(), e, y(), p);
                    } else {
                        throw new aild("Public Identity is empty in ImsModule. Can't create dialog path");
                    }
                } catch (aild e2) {
                    throw new IllegalStateException(e2);
                }
            } else {
                throw new IllegalStateException("Remote contact cannot be null.");
            }
        } else {
            aiks b = adwf.b(aionVar, d);
            b.getClass();
            this.G = b;
            aw();
            String j = aionVar.j("P-Asserted-Identity");
            j = (j == null || j.length() == 0) ? aionVar.j("From") : j;
            if (j != null) {
                try {
                    aiknVar = ahji.h(j);
                } catch (ailb e3) {
                    advr.i(e3, "Error while parsing remote address: %s", e3.getMessage());
                }
            }
            if (aiknVar != null) {
                this.H = aiknVar.a;
            }
            ailw ailwVar = aionVar.a.j;
            if (ailwVar != null) {
                this.x = ailwVar;
                advr.d(f, "conference header from server: %s", ailwVar.a);
            }
            if (aionVar.y().q("Subject")) {
                this.q = aionVar.j("Subject");
            }
            try {
                String d2 = aionVar.d();
                if (d2 != null) {
                    String f2 = aionVar.f();
                    if (f2 != null) {
                        String l = aionVar.l();
                        if (l != null) {
                            String i = aionVar.i();
                            if (i != null) {
                                int a = aionVar.a();
                                ArrayList s = adwf.s(aionVar, false);
                                ailx ailxVar = (ailx) aionVar.a.c().f();
                                ailxVar.getClass();
                                aijw aijwVar = new aijw(d2, a, f2, l, i, s);
                                aijwVar.i = aionVar;
                                aijwVar.e = adwf.i(aionVar.i());
                                String d3 = ailxVar.e.d("+sip.instance");
                                if (d3 != null) {
                                    aijwVar.e(d3);
                                }
                                ailx ailxVar2 = (ailx) aionVar.a.c().f();
                                if (ailxVar2 != null) {
                                    aikn aiknVar2 = ailxVar2.a;
                                    if (aiknVar2.b.l()) {
                                        aikp aikpVar = (aikp) aiknVar2.b;
                                        if (aikpVar.b.a("gr") != null) {
                                            aijwVar.v = aikpVar.c();
                                        }
                                    }
                                    if (aijwVar.v == null) {
                                        String i2 = ailxVar2.i("pub-gruu");
                                        if (i2 != null) {
                                            aijwVar.v = i2;
                                        } else {
                                            String i3 = ailxVar2.i("temp-gruu");
                                            if (i3 != null) {
                                                aijwVar.v = i3;
                                            }
                                        }
                                    }
                                }
                                String g = aionVar.g();
                                if (g != null) {
                                    String h = aionVar.h();
                                    h.getClass();
                                    try {
                                        aijwVar.s = aiok.d(g, h);
                                    } catch (IOException e4) {
                                        advr.j(e4, f, "Could not set content: %s", e4.getMessage());
                                    }
                                }
                                this.l = aijwVar;
                            } else {
                                throw new aild("Null From header. Can't create dialog path");
                            }
                        } else {
                            throw new aild("Null To header. Can't create dialog path");
                        }
                    } else {
                        throw new aild("Null Contact. Can't create dialog path");
                    }
                } else {
                    throw new aild("Null CallId. Can't create dialog path");
                }
            } catch (aild e5) {
                throw new IllegalStateException(e5);
            }
        }
        advr.d(f, "session %s created", this.k);
    }

    private final void aw() {
        boolean z;
        String str;
        String j = adwf.j(this.G, this.m);
        if (this.G.l() && !PhoneNumberUtils.isGlobalPhoneNumber(j)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str = adwf.n(this.G.toString(), this.m);
        } else {
            str = j;
        }
        this.o = str;
        advr.l(f, "Updated remoteUserName: {remoteUserName: '%s', remoteUri: '%s', extractedUserName: '%s'}, isSipUriAndNotGlobalPhone: %s", advq.USER_ID.c(this.o), advq.URI_SIP.c(this.G), advq.USER_ID.c(j), Boolean.valueOf(z));
    }

    protected abstract String A();

    public String B() {
        ainh ainhVar;
        ainh ainhVar2;
        String adonVar = toString();
        StringBuilder sb = new StringBuilder("Sip history for Call ID ");
        aijw aijwVar = this.l;
        sb.append(aijwVar.a);
        sb.append("\r\n\r\n");
        aion aionVar = aijwVar.i;
        if (aionVar != null && aionVar.a != null) {
            sb.append(" --- Initial INVITE:\r\n\r\n");
            sb.append(aionVar.n());
            sb.append("\r\n\r\n");
        }
        aion aionVar2 = aijwVar.p;
        if (aionVar2 != null && (ainhVar2 = aionVar2.a) != null) {
            sb.append(" --- Last request, timestamp ");
            sb.append(ainhVar2.c);
            sb.append(":\r\n\r\n");
            sb.append(aijwVar.p.n());
            sb.append("\r\n\r\n");
        }
        aioo aiooVar = aijwVar.q;
        if (aiooVar != null && (ainhVar = aiooVar.a) != null) {
            sb.append(" --- Last response, timestamp ");
            sb.append(ainhVar.c);
            sb.append(":\r\n\r\n");
            sb.append(aijwVar.q.n());
            sb.append("\r\n\r\n");
        }
        return a.co(sb.toString(), adonVar, "\r\n\r\n");
    }

    public final synchronized void C() {
        if (this.p) {
            advr.d(f, "session %s cannot be accepted because it is originating", this.k);
            return;
        }
        advr.d(f, "session %s invitation has been accepted", this.k);
        this.n = 1;
        synchronized (this.h) {
            this.h.notifyAll();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void D(aiok[] aiokVarArr) {
        if (aiokVarArr != null) {
            aikb aikbVar = ((aikc) this.j).a;
            if (!aikbVar.u()) {
                String str = this.i.a.c().mUserName;
                if (((Boolean) D.a()).booleanValue() && TextUtils.isEmpty(str)) {
                    str = adwf.o(t().e(), this.m);
                }
                String k = aikbVar.k();
                if (!TextUtils.isEmpty(k)) {
                    aijd a = aijd.a(k);
                    for (aiok aiokVar : aiokVarArr) {
                        if (aiokVar != null && "application/sdp".equals(aiokVar.b)) {
                            String b = aiokVar.b();
                            b.getClass();
                            aijr n = ahji.n(b);
                            if (n.a.size() <= 0) {
                                n.c(aiju.a);
                            }
                            if (n.e == null) {
                                n.e = new aijl(str, aijk.a, a, k);
                            }
                            if (n.h == null) {
                                n.h = new aijf(aijk.a, a, aikbVar.k());
                            }
                            try {
                                aiokVar.a = n.f().getBytes("utf-8");
                            } catch (UnsupportedEncodingException unused) {
                            }
                        }
                    }
                    return;
                }
                throw new aijn("Unable to complete SDP. Local IP address not available!");
            }
            throw new aild("The sip stack is unavailable while completing the sdp");
        }
    }

    public final synchronized void E(acok acokVar) {
        this.u = true;
        n(2, adon.a(acokVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void F() {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            try {
                ((adpb) it.next()).d();
            } catch (Exception e) {
                advr.j(e, f, "handleSessionAborted: Call to listener failed with error: ", new Object[0]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void G(adug adugVar) {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            try {
                ((adpb) it.next()).f(adugVar);
            } catch (Exception e) {
                advr.j(e, f, "handleSessionStartFailed: Call to listener failed with error: ", new Object[0]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void H(int i, String str) {
        advr.d(f, "handleSessionStartFailed with reason: %s, due to: %s", ainj.y(i), str);
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            try {
                ((adpb) it.next()).g(i, str);
            } catch (Exception e) {
                advr.j(e, f, "handleSessionStartFailed: Call to listener failed with error: ", new Object[0]);
            }
        }
    }

    protected final void I() {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            try {
                ((adpb) it.next()).i();
            } catch (Exception e) {
                advr.j(e, f, "handleSessionStarting: Call to listener failed with error: ", new Object[0]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void J() {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            try {
                ((adpb) it.next()).j();
            } catch (Exception e) {
                advr.j(e, f, "handleSessionTerminated: Call to listener failed with error", new Object[0]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void K(ainj ainjVar) {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            adpb adpbVar = (adpb) it.next();
            try {
                if (adpbVar instanceof acnn) {
                    acnn acnnVar = (acnn) adpbVar;
                    ailt ailtVar = ainjVar.g;
                    if (ailtVar == null) {
                        advr.g("cSeqHeader is null", new Object[0]);
                    } else {
                        advr.c("Received response for session: %d method: %s status: %d", Long.valueOf(acnnVar.a), ailtVar.e(), Integer.valueOf(ainjVar.w()));
                        if ("BYE".equals(ailtVar.e())) {
                            if (ainjVar.w() == 200 && acnnVar.b.ay() == adpi.LEAVE) {
                                acnnVar.c.j.c(acnnVar.a);
                            }
                            acnnVar.b.aP(acnnVar);
                        }
                    }
                }
            } catch (Exception e) {
                advr.j(e, f, "responseReceived: Call to listener failed with error", new Object[0]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void L(adug adugVar) {
        this.r = false;
        advr.j(adugVar, f, "Error occurred - stopping session: %s", adugVar.getMessage());
        m(adugVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void M(aioo aiooVar) {
        throw null;
    }

    protected void N(aioo aiooVar) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void O(aioo aiooVar) {
        advr.d(f, "Provisional response received for INVITE: %d %s", Integer.valueOf(aiooVar.y()), aiooVar.A());
        aiok[] aiokVarArr = this.l.s;
        String h = aiooVar.h();
        if ((aiokVarArr == null || aiokVarArr.length == 0) && h != null) {
            try {
                String g = aiooVar.g();
                g.getClass();
                this.l.s = aiok.d(g, h);
            } catch (IOException e) {
                advr.d(f, "IOException: %s", e.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void P(aioo aiooVar) {
        String i = adwf.i(aiooVar.l());
        aijw aijwVar = this.l;
        aijwVar.e = i;
        aijwVar.q = aiooVar;
        advr.l(f, "Send ACK for 487 response", new Object[0]);
        ac(this.l);
        Q();
        n(1, 22);
        F();
    }

    public final void Q() {
        ai();
        if (this.a != adpk.STARTING) {
            Iterator it = this.g.iterator();
            while (it.hasNext()) {
                try {
                    ((adpb) it.next()).l();
                } catch (Exception e) {
                    advr.j(e, f, "handleSessionTerminatedByRemote: Call to listener failed with error", new Object[0]);
                }
            }
            return;
        }
        H(487, "Terminated by remote");
    }

    public void S(aion aionVar) {
        throw null;
    }

    protected void T(aioo aiooVar) {
        throw null;
    }

    protected void U(aion aionVar) {
        throw null;
    }

    protected void V(aion aionVar) {
        throw null;
    }

    public void X(aioo aiooVar) {
        throw null;
    }

    public final synchronized void Y() {
        Z(2, this.d, this.e);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void Z(int i, int i2, int i3) {
        advr.d(f, "session %s invitation is requested to be rejected: %s", this.k, Integer.valueOf(i));
        this.n = i;
        h(i2);
        i(i3);
        synchronized (this.h) {
            this.h.notifyAll();
        }
    }

    protected final void aa(int i, int i2) {
        advr.l(f, "Stop reason: %d subreason: %d", Integer.valueOf(i), Integer.valueOf(i2));
        String str = this.l.a;
        if (str != null) {
            this.K.a(str, str, i, i2, this.p);
        }
    }

    public final void ab(aion aionVar, String str) {
        adwe adweVar = this.B;
        aikb v = v();
        try {
            aioo h = adweVar.h(aionVar, str, 180);
            h.q(adwe.a(v, false, new String[0]));
            af(h);
        } catch (ailb e) {
            advr.i(e, "Can't create SIP message", new Object[0]);
            throw new aild("Can't create SIP response", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void ac(aijw aijwVar) {
        try {
            aikb v = v();
            adwe adweVar = this.B;
            t();
            af(adweVar.q(v, aijwVar));
        } catch (Exception e) {
            advr.j(e, f, "Can't send SIP ACK", new Object[0]);
        }
    }

    public final void ad() {
        try {
            aikb v = v();
            this.l.a();
            advr.l(f, "Send BYE", new Object[0]);
            adwe adweVar = this.B;
            aijw aijwVar = this.l;
            t();
            try {
                String str = aijwVar.f;
                String str2 = aijwVar.a;
                String str3 = aijwVar.g;
                String str4 = aijwVar.h;
                adwe.m(str2, str3, str4);
                advp advpVar = adwf.a;
                aiks j = ahji.j(str);
                ailu S = ahmc.S(str2);
                ailt R = ahmc.R(aijwVar.b, "BYE");
                aikn h = ahji.h(str3);
                aini f2 = ahji.f(j, "BYE", S, R, ahmc.W(h, aijwVar.d), ahmc.Z(ahji.h(str4), aijwVar.e), adwf.q(v), adwf.g());
                ArrayList arrayList = aijwVar.j;
                if (arrayList != null) {
                    adwe.l(f2, arrayList);
                }
                f2.k(ahmc.X("P-Preferred-Identity", h.c()));
                f2.k(adwf.f(adweVar.b.a()));
                f2.k(adwf.F());
                Optional optional = v.e;
                if (optional.isPresent()) {
                    adwe.k(f2, (String) optional.get());
                    adwe.i(f2, "sec-agree");
                    adwe.j(f2, "sec-agree");
                }
                aion aionVar = new aion(f2);
                if (ak()) {
                    aionVar.s("Conversation-ID", this.A);
                }
                adsj adsjVar = this.L;
                if (adsjVar != null) {
                    adsjVar.d(aionVar);
                }
                U(aionVar);
                v.d(aionVar, new adow(this));
                ai();
            } catch (Exception e) {
                advr.i(e, "Can't create SIP message", new Object[0]);
                throw new aild("Can't create SIP BYE message");
            }
        } catch (Exception e2) {
            advr.j(e2, f, "Error while sending bye: %s", e2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void ae(adug adugVar) {
        boolean z;
        adwe adweVar;
        aikb v;
        aijw aijwVar;
        aiks j;
        ailu S;
        ailt R;
        aimg W;
        aimy Z;
        aion aionVar;
        advr.l(f, "Send CANCEL", new Object[0]);
        aikh aikhVar = null;
        try {
            adweVar = this.B;
            v = v();
            aijwVar = this.l;
            t();
            try {
                String str = aijwVar.f;
                String str2 = aijwVar.a;
                String str3 = aijwVar.g;
                String str4 = aijwVar.h;
                adwe.m(str2, str3, str4);
                advp advpVar = adwf.a;
                j = ahji.j(str);
                S = ahmc.S(str2);
                R = ahmc.R(aijwVar.b, "CANCEL");
                W = ahmc.W(ahji.h(str3), aijwVar.d);
                Z = ahmc.Z(ahji.h(str4), null);
                aionVar = aijwVar.i;
            } catch (Exception e) {
                advr.i(e, "Can't create SIP message", new Object[0]);
                throw new aild("Can't create SIP CANCEL message");
            }
        } catch (Exception e2) {
            advr.j(e2, f, "Error while sending cancel: %s", e2.getMessage());
        }
        if (aionVar != null) {
            aini f2 = ahji.f(j, "CANCEL", S, R, W, Z, aionVar.p(), adwf.g());
            ArrayList arrayList = aijwVar.j;
            if (arrayList != null) {
                adwe.l(f2, arrayList);
            }
            f2.k(adwe.a(v, false, new String[0]));
            f2.k(adwf.f(adweVar.b.a()));
            f2.k(adwf.F());
            aion aionVar2 = new aion(f2);
            adsj adsjVar = this.L;
            if (adsjVar != null) {
                adsjVar.d(aionVar2);
            }
            aikh e3 = v().e(aionVar2);
            this.l.b();
            aikhVar = e3;
            if (aikhVar == null && !((Boolean) C.a()).booleanValue()) {
                return;
            }
            advp advpVar2 = f;
            if (aikhVar != null && aikhVar.b() != null) {
                z = true;
            } else {
                z = false;
            }
            advr.l(advpVar2, "Response of CANCEL is received: %b", Boolean.valueOf(z));
            if (adugVar != null) {
                G(adugVar);
                return;
            } else {
                F();
                return;
            }
        }
        throw new aild("INVITE is null.");
    }

    public final void af(aiom aiomVar) {
        v().r(aiomVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void ag(String str, aikb aikbVar) {
        String str2;
        advr.l(f, "Setting contact: %s", advq.USER_ID.c(str));
        ImsConfiguration c = this.i.a.c();
        if (((Boolean) D.a()).booleanValue()) {
            boolean y = adwf.y(c);
            if (!aikbVar.u()) {
                str2 = aikbVar.j();
            } else {
                str2 = "";
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = t().c().mDomain;
            }
            aiks d = adwf.d(str, str2, this.m, y);
            d.getClass();
            this.G = d;
        } else {
            aiks c2 = adwf.c(str, c, this.m);
            c2.getClass();
            this.G = c2;
        }
        aw();
    }

    public final void ah(int i, int i2) {
        h(i);
        i(i2);
        if (this.l.l) {
            l();
            advr.l(f, "Stopped session, reason: %d subreason: %d", Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            Y();
        }
    }

    public final void ai() {
        this.l.d();
    }

    public final void aj(adug adugVar) {
        advr.d(f, "Terminating session", new Object[0]);
        synchronized (this.J) {
            this.J.notify();
        }
        if (adugVar == null) {
            try {
                W();
            } catch (Exception e) {
                advr.h(f, "Error while calling onTerminating: %s", e.getMessage());
            }
        }
    }

    public boolean ak() {
        throw null;
    }

    public final boolean al() {
        if (!ak() && !adaa.v()) {
            return false;
        }
        return true;
    }

    protected aiok[] am() {
        throw null;
    }

    public String[] an() {
        throw null;
    }

    public final synchronized void ap() {
        advr.d(f, "Session invitation is requested to be declined", new Object[0]);
        this.n = 8;
        h(2);
        i(56);
        synchronized (this.h) {
            this.h.notifyAll();
        }
    }

    public final synchronized void aq() {
        this.u = true;
        n(2, 57);
    }

    protected final void ar(aion aionVar) {
        int indexOf;
        advr.w(24, 3, "Sending SIP INVITE with callid=%s", aionVar.d());
        this.l.k = false;
        aikh e = v().e(aionVar);
        String str = e.c;
        advp advpVar = f;
        advr.d(advpVar, "Created transaction: %s", str);
        advr.d(advpVar, "First invite message timeout value is %d seconds and later invite message timeout value is %d seconds", Long.valueOf(adaa.c()), Long.valueOf(adaa.c()));
        int i = e.i((int) adaa.c(), (int) adaa.c());
        if (e.g()) {
            aioo b = e.b();
            b.getClass();
            this.l.q = b;
            advr.w(27, 3, "SIP Response received with response code: %s", Integer.valueOf(b.y()));
            int a = e.a();
            if (a >= 100 && a < 200) {
                O(b);
                return;
            }
            if (a == 200) {
                try {
                    this.r = false;
                    advr.l(advpVar, "200 OK response received", new Object[0]);
                    aijw aijwVar = this.l;
                    aijwVar.q = b;
                    aijwVar.f();
                    this.l.e = adwf.i(b.l());
                    String f2 = b.f();
                    if (f2 != null) {
                        this.l.f = f2;
                    }
                    ArrayList s = adwf.s(b, true);
                    aijw aijwVar2 = this.l;
                    aijwVar2.j = s;
                    aijwVar2.s = aiok.d(b.g(), b.h());
                    ailx ailxVar = (ailx) b.z().c().f();
                    ailxVar.getClass();
                    String d = ailxVar.e.d("+sip.instance");
                    if (d != null) {
                        this.l.e(d);
                    }
                    String e2 = b.e();
                    if (e2 != null && this.H == null) {
                        int indexOf2 = e2.indexOf(34) + 1;
                        String str2 = null;
                        if (indexOf2 > 0 && (indexOf = e2.indexOf(34, indexOf2)) > indexOf2) {
                            str2 = e2.substring(indexOf2, indexOf);
                        }
                        this.H = str2;
                    }
                    this.l.c();
                    advr.l(advpVar, "Send ACK", new Object[0]);
                    adwe adweVar = this.B;
                    aikb v = v();
                    aijw aijwVar3 = this.l;
                    t();
                    af(adweVar.q(v, aijwVar3));
                    try {
                        T(b);
                        R();
                    } catch (Exception e3) {
                        advr.j(e3, f, "Session completion has failed: %s", e3.getMessage());
                        m(e3);
                    }
                    this.v.b(this.l, b);
                    return;
                } catch (Exception e4) {
                    advr.j(e4, f, "Session initiation has failed: %s", e4.getMessage());
                    L(new adug(e4));
                    return;
                }
            }
            if (a == 407) {
                try {
                    advr.l(advpVar, "407 response received", new Object[0]);
                    this.l.e = adwf.i(b.l());
                    this.l.q = b;
                    advr.l(advpVar, "Send ACK for 407 response", new Object[0]);
                    adwe adweVar2 = this.B;
                    aikb v2 = v();
                    aijw aijwVar4 = this.l;
                    t();
                    af(adweVar2.q(v2, aijwVar4));
                    this.L.c(b);
                    this.l.a();
                    advr.l(advpVar, "Send second INVITE", new Object[0]);
                    adwe adweVar3 = this.B;
                    aikb v3 = v();
                    aijw aijwVar5 = this.l;
                    t();
                    aion r = adweVar3.r(v3, aijwVar5);
                    String[] an = an();
                    if (an != null) {
                        adwf.u(r, x(), an);
                    }
                    this.l.i = r;
                    String str3 = this.q;
                    if (str3 != null) {
                        r.r(a.cp(str3, "Subject: "));
                    }
                    this.L.d(r);
                    V(r);
                    aimy aimyVar = r.y().f;
                    aimyVar.getClass();
                    aimyVar.e();
                    ar(r);
                    return;
                } catch (Exception e5) {
                    advr.j(e5, f, "Session initiation has failed", new Object[0]);
                    L(new adug(e5));
                    return;
                }
            }
            if (aczx.s()) {
                M(b);
                return;
            }
            if (a == 403) {
                M(b);
                adfa adfaVar = ((adet) t()).b;
                adfaVar.getClass();
                adfaVar.g(acok.REREGISTRATION_REQUIRED);
                return;
            }
            if (a == 404) {
                N(b);
                return;
            }
            if (a == 487) {
                P(b);
                return;
            }
            if (a == 503 && ((Integer) acqb.b.a()).intValue() > this.y) {
                advr.h(advpVar, "received 503 service unavailable", new Object[0]);
                String j = b.j("Retry-After");
                long j2 = 50;
                if (!TextUtils.isEmpty(j) && Pattern.matches("[0-9]+", j)) {
                    advr.d(advpVar, "has retry-after header", new Object[0]);
                    j2 = Long.parseLong(j) * 1000;
                }
                int i2 = F;
                if (j2 > i2) {
                    advr.q("the retry interval is too big: %d", Long.valueOf(j2));
                    j2 = i2;
                }
                advr.l(advpVar, "retry after %d", Long.valueOf(j2));
                long currentTimeMillis = System.currentTimeMillis();
                long j3 = j2 + currentTimeMillis;
                while (currentTimeMillis < j3) {
                    synchronized (this.J) {
                        try {
                            this.J.wait(j3 - currentTimeMillis);
                        } catch (InterruptedException e6) {
                            advr.j(e6, f, "send invite wait error", new Object[0]);
                        }
                    }
                    if (this.a != adpk.STOPPING && this.a != adpk.STOPPED) {
                        currentTimeMillis = System.currentTimeMillis();
                    } else {
                        advr.d(f, "session has been stopped, no need to retry sending invite", new Object[0]);
                        return;
                    }
                }
                this.y++;
                ar(aionVar);
                return;
            }
            M(b);
            return;
        }
        if (i == 2) {
            return;
        }
        this.l.k = true;
        if (i == 3) {
            n(1, 66);
            H(477, albo.ag(e.c()));
        } else {
            n(1, 21);
            H(408, "No response received for INVITE");
        }
    }

    public final void as(aion aionVar, String str, int i) {
        try {
            advr.l(f, "Send 486 Busy here", new Object[0]);
            af(this.B.p(aionVar, str, 486, i));
        } catch (Exception e) {
            advr.j(e, f, "Can't send 486 Busy Response", new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void at(aion aionVar, String str, int i) {
        try {
            advr.l(f, "Send 488 Not acceptable", new Object[0]);
            af(this.B.p(aionVar, str, 488, i));
        } catch (Exception e) {
            advr.j(e, f, "Can't send 488 Not acceptable", new Object[0]);
        }
    }

    public final void au(aion aionVar, String str, int i) {
        try {
            advr.l(f, "Sending 400 Bad Request", new Object[0]);
            af(this.B.p(aionVar, str, 400, i));
        } catch (Exception e) {
            advr.j(e, f, "Can't send 400 Bad Request", new Object[0]);
        }
    }

    public final void av() {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            adpb adpbVar = (adpb) it.next();
            try {
                if (adpbVar instanceof acnn) {
                }
            } catch (Exception e) {
                advr.j(e, f, "requestReceived: Call to listener failed with error", new Object[0]);
            }
        }
    }

    @Override // defpackage.adon
    public final void c() {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            try {
                ((adpb) it.next()).h();
            } catch (Exception e) {
                advr.j(e, f, "handleSessionStarted: Call to listener failed with error: ", new Object[0]);
            }
        }
    }

    @Override // defpackage.adon
    public final void d() {
        adoz b;
        adqg adqgVar = this.i.f;
        synchronized (adqgVar.c) {
            if (((ConcurrentHashMap) adqgVar.c).containsKey(this.k)) {
                advr.c("session %s is already tracked.", this.k);
            } else {
                advr.c("Add new session %s", this.k);
                ((ConcurrentHashMap) adqgVar.c).put(this.k, this);
                ((advn) adqgVar.d).a(this.i, this);
            }
        }
        advp advpVar = f;
        advr.d(advpVar, "Aquiring wake lock for session %s", this.k);
        this.I.acquire();
        try {
            String str = null;
            aikh aikhVar = null;
            if (this.p) {
                try {
                    advr.l(advpVar, "Initiate a new session as originating", new Object[0]);
                    try {
                        aiok[] am = am();
                        D(am);
                        aijw aijwVar = this.l;
                        aijwVar.r = am;
                        aijwVar.w = "uac";
                        ailw ailwVar = this.x;
                        if (ailwVar != null) {
                            aijwVar.c = ailwVar;
                        }
                        advr.l(advpVar, "Send INVITE", new Object[0]);
                        adwe adweVar = this.B;
                        aikb v = v();
                        aijw aijwVar2 = this.l;
                        t();
                        aion r = adweVar.r(v, aijwVar2);
                        advr.w(23, 4, "SIP INVITE created with callid=%s", r.d());
                        if (r.j("Contribution-ID") != null) {
                            advr.r(advpVar, "Contribution-ID was already added to INVITE header", new Object[0]);
                        } else {
                            try {
                                String str2 = this.z;
                                if (str2 != null) {
                                    r.s("Contribution-ID", str2);
                                }
                            } catch (ailb e) {
                                advr.j(e, f, "SIP INVITE can't accept Contribution-ID: %s", e.getMessage());
                            }
                        }
                        String y = y();
                        if (y == null) {
                            b = null;
                        } else {
                            b = this.i.f.b(y, this);
                        }
                        if (b != null) {
                            str = b.x();
                        }
                        adwf.u(r, str, an());
                        if (!agkx.ae(this.q)) {
                            r.s("Subject", this.q);
                        }
                        r.y().e.getClass();
                        V(r);
                        this.l.i = r;
                        I();
                        this.y = 0;
                        ar(r);
                    } catch (adpj e2) {
                        advr.j(e2, f, "Could not prepare sip body parts!", new Object[0]);
                        o(e2, 2, 18);
                    }
                } catch (Exception e3) {
                    advr.j(e3, f, "Error while starting session: %s", e3.getMessage());
                    o(e3, 2, 18);
                }
                advr.d(f, "Releasing wake lock for session %s", this.k);
                try {
                    this.I.release();
                    return;
                } catch (RuntimeException unused) {
                    return;
                }
            }
            aion aionVar = this.l.i;
            aionVar.getClass();
            try {
                advr.l(advpVar, "Initiate a new session as terminating", new Object[0]);
                ab(aionVar, this.l.d);
                if (s() != 1) {
                    if (((Boolean) E.a()).booleanValue()) {
                        h(1);
                        i(24);
                        l();
                    } else {
                        n(1, 24);
                    }
                    advr.l(advpVar, "Stopped session as the invitation was not acceptable.", new Object[0]);
                } else {
                    try {
                        aiok[] am2 = am();
                        D(am2);
                        this.l.r = am2;
                        advr.l(advpVar, "Send 200 OK", new Object[0]);
                        try {
                            aioo f2 = this.B.f(v(), this.l);
                            if (f2 == null) {
                                advr.h(advpVar, "Error generating 200 OK to INVITE.", new Object[0]);
                                n(9, 55);
                            } else {
                                adwf.u(f2, x(), an());
                                this.v.c(this.l, aionVar, f2);
                                I();
                                try {
                                    aikhVar = v().e(f2);
                                } catch (aild e4) {
                                    advr.j(e4, f, "Can't send 200 OK response, will retry", new Object[0]);
                                }
                                this.l.f();
                                aikhVar.getClass();
                                aikhVar.h(30);
                                int i = 0;
                                while (!aikhVar.f() && i < ((Integer) acqb.d.a()).intValue()) {
                                    if (this.a != adpk.STARTING) {
                                        advr.d(f, "No longer starting, aborting!", new Object[0]);
                                        break;
                                    }
                                    i++;
                                    advr.l(f, "Re-send 200 OK because ACK is not received", new Object[0]);
                                    try {
                                        aikhVar = v().e(f2);
                                    } catch (aild e5) {
                                        advr.j(e5, f, "Can't send 200 OK response, will retry", new Object[0]);
                                    }
                                    aikhVar.h(30);
                                }
                                if (this.a != adpk.STARTING) {
                                    advr.d(f, "No longer starting, aborting!", new Object[0]);
                                } else {
                                    this.l.c();
                                    if (aikhVar.f()) {
                                        advr.l(f, "ACK request received", new Object[0]);
                                        try {
                                            R();
                                        } catch (Exception e6) {
                                            advr.j(e6, f, "Error while completing session - stopping: %s", e6.getMessage());
                                            m(e6);
                                        }
                                    } else {
                                        advr.h(f, "No ACK received for INVITE", new Object[0]);
                                        m(new aduf(408, "Timeout"));
                                    }
                                }
                            }
                        } catch (Exception e7) {
                            advr.j(e7, f, "Sending response failed: %s", e7.getMessage());
                            m(e7);
                        }
                    } catch (Exception e8) {
                        advr.j(e8, f, "Error in preparing session: %s", e8.getMessage());
                        this.n = 4;
                        m(e8);
                    }
                }
            } catch (Exception e9) {
                advr.j(e9, f, "Error while processing incoming session", new Object[0]);
                m(e9);
            }
            advr.d(f, "Releasing wake lock for session %s", this.k);
            this.I.release();
            return;
        } catch (Throwable th) {
            advr.d(f, "Releasing wake lock for session %s", this.k);
            this.I.release();
            throw th;
        }
        advr.d(f, "Releasing wake lock for session %s", this.k);
        try {
            this.I.release();
        } catch (RuntimeException unused2) {
        }
        throw th;
    }

    @Override // defpackage.adon
    protected final void e() {
        this.i.i(this);
        aa(this.d, this.e);
    }

    @Override // defpackage.adon
    public void f() {
        throw null;
    }

    @Override // defpackage.adon
    public void g(Throwable th) {
        throw null;
    }

    @Override // defpackage.adon
    protected final void r() {
        this.i.i(this);
        aa(this.d, this.e);
    }

    public final int s() {
        int i;
        aion aionVar = this.l.i;
        aionVar.getClass();
        int i2 = this.n;
        if (i2 != 0) {
            return i2;
        }
        advr.d(f, "Wait session invitation answer", new Object[0]);
        synchronized (this.h) {
            i = 0;
            while (i < 60) {
                try {
                    this.h.wait(5000L);
                    if (this.n == 0) {
                        try {
                            ab(aionVar, this.l.d);
                            i += 5;
                        } catch (aild e) {
                            m(e);
                        }
                    }
                } catch (InterruptedException unused) {
                }
            }
        }
        if (i >= 60) {
            advr.l(f, "Timeout - Ringing period expired", new Object[0]);
            this.n = 0;
        }
        return this.n;
    }

    public final adew t() {
        return this.i.a;
    }

    @Override // defpackage.adon
    public String toString() {
        return " mSessionId: " + this.k + "\r\n remoteUri: " + advq.URI.c(this.G) + "\r\n invitationStatus: " + this.n + "\r\n disconnect: " + this.u + "\r\n isRinging: " + this.r + "\r\n originating: " + this.p + "\r\n updateOriginating: false\r\n" + (" State: " + String.valueOf(this.a) + "\r\n Error: " + String.valueOf(this.c));
    }

    public final ImsConfiguration u() {
        return t().c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final aikb v() {
        aikb aikbVar = ((aikc) this.j).a;
        if (!aikbVar.u()) {
            return aikbVar;
        }
        throw new aild("SipStack is not initialized.");
    }

    public final String w() {
        if (ak()) {
            return this.A;
        }
        return this.z;
    }

    public final String x() {
        return this.l.u;
    }

    public final String y() {
        aiks aiksVar = this.G;
        if (aiksVar != null) {
            return aiksVar.toString();
        }
        throw new IllegalStateException("remote URI was not initialized");
    }

    public final String z() {
        String str = this.o;
        str.getClass();
        return str;
    }

    protected void R() {
    }

    protected void W() {
    }
}
