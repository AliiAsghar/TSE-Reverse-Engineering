package defpackage;

import android.content.Context;
import j$.util.Optional;
import java.net.Inet6Address;
import java.net.InetSocketAddress;
import java.security.SecureRandom;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aiit {
    private static final advp g = new advp("MsrpManager");
    public final int a;
    public final aiim b;
    public final String c;
    public final advp d;
    public aijb e;
    public final aiij f;
    private final String h;
    private final String i;
    private final Context j;
    private final Optional k;
    private final int l;
    private int m;

    public aiit(Context context, Optional optional, String str, int i, aiim aiimVar, int i2) {
        String b = aikx.b();
        aiij x = ((aiis) acrk.a(aiis.class)).x();
        String c = aczx.c();
        this.e = null;
        this.m = 1;
        this.h = str;
        this.a = i;
        this.i = b;
        this.f = x;
        this.c = c;
        this.b = aiimVar;
        this.j = context.getApplicationContext();
        this.k = optional;
        this.d = new advp("MsrpManager[%s]", b);
        this.l = i2;
    }

    public static String f(aiji aijiVar) {
        String str;
        aijg a = aijiVar.a("setup");
        if (a == null) {
            str = "passive";
        } else {
            str = a.b;
        }
        advr.d(g, "Remote setup attribute is %s", str);
        if (str != null) {
            if (str.equals("active")) {
                return "passive";
            }
            return "active";
        }
        throw new IllegalStateException("expected non-null remoteSetup");
    }

    private final Optional j() {
        int i = 0;
        if (!((Boolean) aczx.a().b.p.a()).booleanValue()) {
            advr.r(this.d, "enableBindMsrpSocketLocalAddress is disabled, binding MSRP connection to any ip/port", new Object[0]);
            return Optional.empty();
        }
        if (aczx.p()) {
            i = this.a;
        }
        return Optional.of(new InetSocketAddress(this.h, i));
    }

    private final String k() {
        int i = this.m;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        return "UNKNOWN";
                    }
                    return "CLOSED";
                }
                return "SETUP";
            }
            return "NEW";
        }
        throw null;
    }

    public final aiji a() {
        int i;
        if (aczx.p()) {
            i = this.a;
        } else {
            i = 9;
        }
        return b(i, "TCP/MSRP", "msrp");
    }

    public final aiji b(int i, String str, String str2) {
        aiji aijiVar = new aiji(aijh.MESSAGE, i, 1, str, "*");
        aijiVar.e(new aijg("path", e(str2, i)));
        return aijiVar;
    }

    public final aiji c() {
        int i;
        String a = this.f.a();
        if (aczx.p()) {
            i = this.a;
        } else {
            i = 9;
        }
        return d(this.c, a, i);
    }

    public final aiji d(String str, String str2, int i) {
        aiji b = b(i, "TCP/TLS/MSRP", "msrps");
        b.e(new aijg("fingerprint", a.co(str2, str, " ")));
        return b;
    }

    final String e(String str, int i) {
        String str2 = this.h;
        if ((anbj.a(str2) instanceof Inet6Address) && str2.trim().charAt(0) != '[') {
            str2 = a.bW(str2, "[", "]");
        }
        return String.format(Locale.US, "%1$s://%2$s:%3$d/%4$s;tcp", str, str2, Integer.valueOf(i), this.i);
    }

    public final synchronized void g() {
        int i = 9;
        advr.w(9, 3, "MSRP connection disconnected", new Object[0]);
        aijb aijbVar = this.e;
        if (aijbVar != null) {
            try {
                advr.l(this.d, "Closing MSRP session for SIP call id:[%s] from state:[%s]", aijbVar.c, k());
                aijb aijbVar2 = this.e;
                advr.d(aijbVar2.f, "Closing msrp media session", new Object[0]);
                aijbVar2.h.ifPresent(new aihs(2));
                new Thread(new ahsa(aijbVar2.b, i)).start();
            } catch (Exception e) {
                advr.j(e, this.d, "Error while closing session", new Object[0]);
            }
            this.e = null;
        } else {
            advr.l(this.d, "Closing the MSRP session - session does not exist from state:[%s]", k());
        }
        this.m = 3;
    }

    public final void h(aiik aiikVar, String str, String str2, aiio aiioVar, Optional optional) {
        boolean z;
        String str3;
        String e;
        int i;
        int i2 = aiikVar.f;
        if (i2 != 3 && i2 != 4) {
            z = false;
        } else {
            z = true;
        }
        if (this.m != 3) {
            if (true != z) {
                str3 = "msrp";
            } else {
                str3 = "msrps";
            }
            String str4 = this.i;
            if (aiikVar.c()) {
                if (aczx.p()) {
                    i = this.a;
                } else {
                    i = 9;
                }
                e = e(str3, i);
            } else {
                e = e(str3, this.a);
            }
            aijb aijbVar = new aijb(str4, aiikVar, str, e, str2, new atal(this.l, (byte[]) null), alog.s(aiioVar, new aiiq(this.j, ((aija) acrk.a(aija.class)).k())), new SecureRandom(), optional);
            this.e = aijbVar;
            advr.l(this.d, "created msrp session for SIP call id:[%s] from state:[%s]", aijbVar.c, k());
            this.m = 2;
            return;
        }
        throw new IllegalStateException("state should not be CLOSED. did you call closeSession before calling setupSession?");
    }

    public final aijb i(String str, int i, String str2, String str3, String str4, aiio aiioVar) {
        aiik aiikVar;
        int i2 = 0;
        try {
            boolean startsWith = str3.startsWith("msrps");
            asqc asqcVar = new asqc(aiioVar);
            if (startsWith) {
                advr.l(this.d, "Creating secure MSRP client connection to %s on network[%s]", anbi.a(str, i).toString(), this.k);
                aiim aiimVar = this.b;
                Optional ofNullable = Optional.ofNullable(str2);
                Optional optional = this.k;
                Optional j = j();
                Object obj = aiimVar.a;
                Context context = (Context) obj;
                aiikVar = new aiik(context, new aohs(new aigx(((agxw) aiimVar.b).d(), ((aiij) aiimVar.d).b(), (String) ofNullable.orElse(null), i2), new aioy(j, optional, 1), str, i, Optional.of(((aigs) aiimVar.c).a(optional, asqcVar))), 3);
            } else {
                advr.l(this.d, "Creating insecure MSRP client connection to %s on network[%s]", anbi.a(str, i).toString(), this.k);
                aiim aiimVar2 = this.b;
                Optional optional2 = this.k;
                aiikVar = new aiik((Context) aiimVar2.a, ((agxw) aiimVar2.b).d().d(new aioy(j(), optional2, 1), str, i, Optional.of(((aigs) aiimVar2.c).a(optional2, asqcVar))), 1);
            }
            h(aiikVar, str3, str4, aiioVar, Optional.of(anbi.a(str, i)));
            aiikVar.b();
            advr.l(this.d, "MSRP client endpoint created and opened: %s", this.e);
            advr.w(8, 3, "MSRP client endpoint created and opened: %s", this.e);
            aijb aijbVar = this.e;
            aijbVar.getClass();
            return aijbVar;
        } catch (Exception e) {
            advr.j(e, this.d, "Couldn't create the MSRP client session", new Object[0]);
            String valueOf = String.valueOf(e.getMessage());
            Throwable cause = e.getCause();
            Throwable th = e;
            if (cause != null) {
                th = e.getCause();
            }
            throw new aiip("MSRP client session creation failed: ".concat(valueOf), th);
        }
    }
}
