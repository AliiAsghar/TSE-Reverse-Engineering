package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adjt {
    private String A;
    private boolean B;
    private short C;
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private int g;
    private int h;
    private int i;
    private int j;
    private String k;
    private String l;
    private String m;
    private String n;
    private float o;
    private String p;
    private int q;
    private boolean r;
    private String s;
    private String t;
    private String u;
    private String v;
    private String w;
    private int x;
    private int y;
    private String z;

    public adjt() {
    }

    public final void A(String str) {
        if (str != null) {
            this.e = str;
            return;
        }
        throw new NullPointerException("Null wifiMediaTransport");
    }

    public final void B(String str) {
        if (str != null) {
            this.f = str;
            return;
        }
        throw new NullPointerException("Null wifiRtpTransport");
    }

    public final void C(String str) {
        if (str != null) {
            this.d = str;
            return;
        }
        throw new NullPointerException("Null wifiSipTransport");
    }

    public final adju a() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        if (this.C == 1023 && (str = this.a) != null && (str2 = this.b) != null && (str3 = this.c) != null && (str4 = this.d) != null && (str5 = this.e) != null && (str6 = this.f) != null && (str7 = this.k) != null && (str8 = this.l) != null && (str9 = this.m) != null && (str10 = this.n) != null && (str11 = this.p) != null && (str12 = this.s) != null && (str13 = this.t) != null && (str14 = this.u) != null && (str15 = this.v) != null && (str16 = this.w) != null && (str17 = this.z) != null && (str18 = this.A) != null) {
            return new adju(str, str2, str3, str4, str5, str6, this.g, this.h, this.i, this.j, str7, str8, str9, str10, this.o, str11, this.q, this.r, str12, str13, str14, str15, str16, this.x, this.y, str17, str18, this.B);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" psSipTransport");
        }
        if (this.b == null) {
            sb.append(" psMediaTransport");
        }
        if (this.c == null) {
            sb.append(" psRtpTransport");
        }
        if (this.d == null) {
            sb.append(" wifiSipTransport");
        }
        if (this.e == null) {
            sb.append(" wifiMediaTransport");
        }
        if (this.f == null) {
            sb.append(" wifiRtpTransport");
        }
        if ((this.C & 1) == 0) {
            sb.append(" timerT1");
        }
        if ((this.C & 2) == 0) {
            sb.append(" timerT2");
        }
        if ((this.C & 4) == 0) {
            sb.append(" timerT4");
        }
        if ((this.C & 8) == 0) {
            sb.append(" localSipPort");
        }
        if (this.k == null) {
            sb.append(" privateIdentity");
        }
        if (this.l == null) {
            sb.append(" publicIdentity");
        }
        if (this.m == null) {
            sb.append(" username");
        }
        if (this.n == null) {
            sb.append(" domain");
        }
        if ((this.C & 16) == 0) {
            sb.append(" q");
        }
        if (this.p == null) {
            sb.append(" pcscfAddress");
        }
        if ((this.C & 32) == 0) {
            sb.append(" pcscfPort");
        }
        if ((this.C & 64) == 0) {
            sb.append(" keepAlive");
        }
        if (this.s == null) {
            sb.append(" phoneContext");
        }
        if (this.t == null) {
            sb.append(" authenticationScheme");
        }
        if (this.u == null) {
            sb.append(" authDigestUsername");
        }
        if (this.v == null) {
            sb.append(" authDigestPassword");
        }
        if (this.w == null) {
            sb.append(" authDigestRealm");
        }
        if ((this.C & 128) == 0) {
            sb.append(" regRetryBaseTime");
        }
        if ((this.C & 256) == 0) {
            sb.append(" regRetryMaxTime");
        }
        if (this.z == null) {
            sb.append(" natUrlFmt");
        }
        if (this.A == null) {
            sb.append(" intUrlFmt");
        }
        if ((this.C & 512) == 0) {
            sb.append(" rcsVolteSingleRegistration");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(String str) {
        if (str != null) {
            this.v = str;
            return;
        }
        throw new NullPointerException("Null authDigestPassword");
    }

    public final void c(String str) {
        if (str != null) {
            this.w = str;
            return;
        }
        throw new NullPointerException("Null authDigestRealm");
    }

    public final void d(String str) {
        if (str != null) {
            this.u = str;
            return;
        }
        throw new NullPointerException("Null authDigestUsername");
    }

    public final void e(String str) {
        if (str != null) {
            this.t = str;
            return;
        }
        throw new NullPointerException("Null authenticationScheme");
    }

    public final void f(String str) {
        if (str != null) {
            this.n = str;
            return;
        }
        throw new NullPointerException("Null domain");
    }

    public final void g(String str) {
        if (str != null) {
            this.A = str;
            return;
        }
        throw new NullPointerException("Null intUrlFmt");
    }

    public final void h(boolean z) {
        this.r = z;
        this.C = (short) (this.C | 64);
    }

    public final void i(int i) {
        this.j = i;
        this.C = (short) (this.C | 8);
    }

    public final void j(String str) {
        if (str != null) {
            this.z = str;
            return;
        }
        throw new NullPointerException("Null natUrlFmt");
    }

    public final void k(String str) {
        if (str != null) {
            this.p = str;
            return;
        }
        throw new NullPointerException("Null pcscfAddress");
    }

    public final void l(int i) {
        this.q = i;
        this.C = (short) (this.C | 32);
    }

    public final void m(String str) {
        if (str != null) {
            this.s = str;
            return;
        }
        throw new NullPointerException("Null phoneContext");
    }

    public final void n(String str) {
        if (str != null) {
            this.k = str;
            return;
        }
        throw new NullPointerException("Null privateIdentity");
    }

    public final void o(String str) {
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null psMediaTransport");
    }

    public final void p(String str) {
        if (str != null) {
            this.c = str;
            return;
        }
        throw new NullPointerException("Null psRtpTransport");
    }

    public final void q(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null psSipTransport");
    }

    public final void r(String str) {
        if (str != null) {
            this.l = str;
            return;
        }
        throw new NullPointerException("Null publicIdentity");
    }

    public final void s(float f) {
        this.o = f;
        this.C = (short) (this.C | 16);
    }

    public final void t(boolean z) {
        this.B = z;
        this.C = (short) (this.C | 512);
    }

    public final void u(int i) {
        this.x = i;
        this.C = (short) (this.C | 128);
    }

    public final void v(int i) {
        this.y = i;
        this.C = (short) (this.C | 256);
    }

    public final void w(int i) {
        this.g = i;
        this.C = (short) (this.C | 1);
    }

    public final void x(int i) {
        this.h = i;
        this.C = (short) (this.C | 2);
    }

    public final void y(int i) {
        this.i = i;
        this.C = (short) (this.C | 4);
    }

    public final void z(String str) {
        if (str != null) {
            this.m = str;
            return;
        }
        throw new NullPointerException("Null username");
    }

    public adjt(adju adjuVar) {
        this.a = adjuVar.a;
        this.b = adjuVar.b;
        this.c = adjuVar.c;
        this.d = adjuVar.d;
        this.e = adjuVar.e;
        this.f = adjuVar.f;
        this.g = adjuVar.g;
        this.h = adjuVar.h;
        this.i = adjuVar.i;
        this.j = adjuVar.j;
        this.k = adjuVar.k;
        this.l = adjuVar.l;
        this.m = adjuVar.m;
        this.n = adjuVar.n;
        this.o = adjuVar.o;
        this.p = adjuVar.p;
        this.q = adjuVar.q;
        this.r = adjuVar.r;
        this.s = adjuVar.s;
        this.t = adjuVar.t;
        this.u = adjuVar.u;
        this.v = adjuVar.v;
        this.w = adjuVar.w;
        this.x = adjuVar.x;
        this.y = adjuVar.y;
        this.z = adjuVar.z;
        this.A = adjuVar.A;
        this.B = adjuVar.B;
        this.C = (short) 1023;
    }
}
