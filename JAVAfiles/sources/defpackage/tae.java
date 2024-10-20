package defpackage;

import android.net.Uri;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tae extends agmb {
    public int A;
    public String B;
    public int C;
    public int D;
    public String E;
    public boolean F;
    public int G;
    public String H;
    public tqr I;
    public String J;
    public byte[] K;
    public long L;
    public boolean M;
    public boolean N;
    public String O;
    public xxw P;
    public mta Q;
    public rxg R;
    public vox S;
    public vox T;
    public vov U;
    public ndp V;
    public String a;
    public Instant b;
    public long c;
    public String d;
    public qwe e;
    public qwe f;
    public int g;
    public int h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public long n;
    public String o;
    public String p;
    public String q;
    public Uri r;
    public Uri s;
    public long t;
    public String u;
    public int v;
    public int w;
    public int x;
    public boolean y;
    public String z;

    public tae() {
        super(a.bp());
        this.b = Instant.EPOCH;
        this.e = null;
        this.f = null;
        this.Q = mta.b(0);
        this.R = rxg.a;
        this.S = vox.b(0);
        this.T = vox.b(0);
        this.U = vov.b(0);
    }

    public final void A(String str) {
        aC(20);
        this.u = str;
    }

    public final void B(qwe qweVar) {
        int i = this.az;
        if (i < 59930) {
            agnc.t("my_identity_token", i);
        }
        aC(4);
        this.e = qweVar;
    }

    public final void C(qwe qweVar) {
        int i = this.az;
        if (i < 60160) {
            agnc.t("my_identity_token_foreign_key", i);
        }
        aC(5);
        this.f = qweVar;
    }

    public final void D(vox voxVar) {
        int i = this.az;
        if (i < 59550) {
            agnc.t("name_source", i);
        }
        aC(44);
        this.S = voxVar;
    }

    public final void E(mta mtaVar) {
        aC(42);
        this.Q = mtaVar;
    }

    public final void F(String str) {
        aC(8);
        this.i = str;
    }

    public final void G(Instant instant) {
        aC(1);
        this.b = instant;
    }

    public final void H(long j) {
        aC(2);
        this.c = j;
    }

    public final void I(String str) {
        aC(3);
        this.d = str;
    }

    public final void J(int i) {
        aC(28);
        this.C = i;
    }

    public final void K(vox voxVar) {
        int i = this.az;
        if (i < 59550) {
            agnc.t("photo_source", i);
        }
        aC(45);
        this.T = voxVar;
    }

    public final void L(String str) {
        aC(35);
        this.J = str;
    }

    public final void M(byte[] bArr) {
        aC(36);
        this.K = bArr;
    }

    public final void N(Uri uri) {
        aC(17);
        this.r = uri;
    }

    public final void O(vov vovVar) {
        int i = this.az;
        if (i < 60060) {
            agnc.t("profile_photo_user_preference", i);
        }
        aC(46);
        this.U = vovVar;
    }

    public final void P(String str) {
        aC(14);
        this.o = str;
    }

    public final void Q(long j) {
        aC(13);
        this.n = j;
    }

    public final void R(String str) {
        aC(9);
        this.j = str;
    }

    public final void S(int i) {
        aC(7);
        this.h = i;
    }

    public final void T(int i) {
        aC(6);
        this.g = i;
    }

    public final void U(int i) {
        aC(26);
        this.A = i;
    }

    public final tad a() {
        int i = sym.a;
        tad tadVar = new tad();
        tadVar.ar(az());
        tadVar.a = this.a;
        tadVar.b = this.b;
        tadVar.c = this.c;
        tadVar.d = this.d;
        tadVar.e = this.e;
        tadVar.f = this.f;
        tadVar.g = this.g;
        tadVar.h = this.h;
        tadVar.i = this.i;
        tadVar.j = this.j;
        tadVar.k = this.k;
        tadVar.l = this.l;
        tadVar.m = this.m;
        tadVar.n = this.n;
        tadVar.o = this.o;
        tadVar.p = this.p;
        tadVar.q = this.q;
        tadVar.r = this.r;
        tadVar.s = this.s;
        tadVar.t = this.t;
        tadVar.u = this.u;
        tadVar.v = this.v;
        tadVar.w = this.w;
        tadVar.x = this.x;
        tadVar.y = this.y;
        tadVar.z = this.z;
        tadVar.A = this.A;
        tadVar.B = this.B;
        tadVar.C = this.C;
        tadVar.D = this.D;
        tadVar.E = this.E;
        tadVar.F = this.F;
        tadVar.G = this.G;
        tadVar.H = this.H;
        tadVar.I = this.I;
        tadVar.J = this.J;
        tadVar.K = this.K;
        tadVar.L = this.L;
        tadVar.M = this.M;
        tadVar.N = this.N;
        tadVar.O = this.O;
        tadVar.P = this.P;
        tadVar.Q = this.Q;
        tadVar.R = this.R;
        tadVar.S = this.S;
        tadVar.T = this.T;
        tadVar.U = this.U;
        tadVar.V = this.V;
        tadVar.cF = aA();
        return tadVar;
    }

    public final void b(String str) {
        aC(30);
        this.E = str;
    }

    public final void c(boolean z) {
        aC(24);
        this.y = z;
    }

    public final void d(String str) {
        aC(33);
        this.H = str;
    }

    public final void e(xxw xxwVar) {
        aC(41);
        this.P = xxwVar;
    }

    public final void f(int i) {
        aC(21);
        this.v = i;
    }

    public final void g(int i) {
        aC(22);
        this.w = i;
    }

    public final void h(String str) {
        aC(11);
        this.l = str;
    }

    public final void i(String str) {
        aC(27);
        this.B = str;
    }

    public final void j(long j) {
        aC(19);
        this.t = j;
    }

    public final void k(ndp ndpVar) {
        int i = this.az;
        if (i < 60070) {
            agnc.t("contact_metadata", i);
        }
        aC(47);
        this.V = ndpVar;
    }

    public final void l(Uri uri) {
        int i = this.az;
        if (i < 59850) {
            agnc.t("contact_photo_uri", i);
        }
        aC(18);
        this.s = uri;
    }

    public final void m(String str) {
        aC(12);
        this.m = str;
    }

    public final void n(long j) {
        aC(37);
        this.L = j;
    }

    public final void o(String str) {
        aC(10);
        this.k = str;
    }

    public final void p(String str) {
        aC(40);
        this.O = str;
    }

    public final void q(int i) {
        aC(23);
        this.x = i;
    }

    public final void r(String str) {
        aC(16);
        this.q = str;
    }

    public final void s(String str) {
        aC(15);
        this.p = str;
    }

    public final void t(String str) {
        aC(0);
        this.a = str;
    }

    public final void u(boolean z) {
        aC(38);
        this.M = z;
    }

    public final void v(boolean z) {
        aC(31);
        this.F = z;
    }

    public final void w(int i) {
        aC(32);
        this.G = i;
    }

    public final void x(boolean z) {
        aC(39);
        this.N = z;
    }

    public final void y(rxg rxgVar) {
        int i = this.az;
        if (i < 59440) {
            agnc.t("last_modified_by_key", i);
        }
        aC(43);
        this.R = rxgVar;
    }

    public final void z(tqr tqrVar) {
        aC(34);
        this.I = tqrVar;
    }
}
