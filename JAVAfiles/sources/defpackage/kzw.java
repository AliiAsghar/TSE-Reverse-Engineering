package defpackage;

import android.graphics.Typeface;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kzw {
    public boolean A;
    public ryi B;
    public String C;
    public Integer D;
    public Integer E;
    public Integer F;
    public boolean G;
    public String H;
    public CharSequence I;
    public String J;
    public String K;
    public String L;
    public String M;
    public Integer N;
    public Integer O;
    public alpt P;
    public Boolean Q;
    public String R;
    public int S;
    private int T;
    private int U;
    private int V;
    private int W;
    private boolean X;
    private boolean Y;
    private boolean Z;
    public kzd a;
    private int aa;
    private boolean ab;
    private boolean ac;
    public String b;
    public Typeface c;
    public Integer d;
    public String e;
    public Integer f;
    public int g;
    public String h;
    public String i;
    public String j;
    public String k;
    public boolean l;
    public boolean m;
    public Typeface n;
    public Typeface o;
    public Typeface p;
    public boolean q;
    public Long r;
    public String s;
    public Integer t;
    public Integer u;
    public Integer v;
    public String w;
    public String x;
    public boolean y;
    public Integer z;

    public kzw() {
    }

    public final kzx a() {
        kzd kzdVar;
        if (this.S == 262143 && (kzdVar = this.a) != null) {
            return new kzx(kzdVar, this.b, this.c, this.d, this.e, this.f, this.T, this.g, this.h, this.i, this.j, this.k, this.U, this.l, this.m, this.V, this.W, this.n, this.o, this.p, this.q, this.r, this.X, this.Y, this.s, this.t, this.u, this.v, this.Z, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.aa, this.H, this.I, this.ab, this.ac, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" bindData");
        }
        if ((this.S & 1) == 0) {
            sb.append(" typefaceStyle");
        }
        if ((this.S & 2) == 0) {
            sb.append(" maxLines");
        }
        if ((this.S & 4) == 0) {
            sb.append(" subjectVisibility");
        }
        if ((this.S & 8) == 0) {
            sb.append(" incoming");
        }
        if ((this.S & 16) == 0) {
            sb.append(" read");
        }
        if ((this.S & 32) == 0) {
            sb.append(" notificationBellVisibility");
        }
        if ((this.S & 64) == 0) {
            sb.append(" workProfileIconVisibility");
        }
        if ((this.S & 128) == 0) {
            sb.append(" containsVerifiedSmsParticipant");
        }
        if ((this.S & 256) == 0) {
            sb.append(" isReminderTextVisible");
        }
        if ((this.S & 512) == 0) {
            sb.append(" isReminderIconVisible");
        }
        if ((this.S & 1024) == 0) {
            sb.append(" isNudged");
        }
        if ((this.S & 2048) == 0) {
            sb.append(" isDarkMode");
        }
        if ((this.S & 4096) == 0) {
            sb.append(" isAvatarCircleCropped");
        }
        if ((this.S & 8192) == 0) {
            sb.append(" addRtlPaddingAndShadow");
        }
        if ((this.S & 16384) == 0) {
            sb.append(" hasMediaPreviewVisible");
        }
        if ((this.S & 32768) == 0) {
            sb.append(" unreadBadgeVisibility");
        }
        if ((this.S & 65536) == 0) {
            sb.append(" pinIconVisibility");
        }
        if ((this.S & 131072) == 0) {
            sb.append(" isBirthday");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.ac = z;
        this.S |= 131072;
    }

    public final void c(boolean z) {
        this.Z = z;
        this.S |= 1024;
    }

    public final void d(boolean z) {
        this.Y = z;
        this.S |= 512;
    }

    public final void e(boolean z) {
        this.X = z;
        this.S |= 256;
    }

    public final void f() {
        this.V = 8;
        this.S |= 32;
    }

    public final void g(boolean z) {
        this.ab = z;
        this.S |= 65536;
    }

    public final void h(int i) {
        this.U = i;
        this.S |= 4;
    }

    public final void i(int i) {
        this.T = i;
        this.S |= 1;
    }

    public final void j(int i) {
        this.aa = i;
        this.S |= 32768;
    }

    public final void k(int i) {
        this.W = i;
        this.S |= 64;
    }

    public kzw(kzx kzxVar) {
        this.a = kzxVar.a;
        this.b = kzxVar.b;
        this.c = kzxVar.c;
        this.d = kzxVar.d;
        this.e = kzxVar.e;
        this.f = kzxVar.f;
        this.T = kzxVar.g;
        this.g = kzxVar.h;
        this.h = kzxVar.i;
        this.i = kzxVar.j;
        this.j = kzxVar.k;
        this.k = kzxVar.l;
        this.U = kzxVar.m;
        this.l = kzxVar.n;
        this.m = kzxVar.o;
        this.V = kzxVar.p;
        this.W = kzxVar.q;
        this.n = kzxVar.r;
        this.o = kzxVar.s;
        this.p = kzxVar.t;
        this.q = kzxVar.u;
        this.r = kzxVar.v;
        this.X = kzxVar.w;
        this.Y = kzxVar.x;
        this.s = kzxVar.y;
        this.t = kzxVar.z;
        this.u = kzxVar.A;
        this.v = kzxVar.B;
        this.Z = kzxVar.C;
        this.w = kzxVar.D;
        this.x = kzxVar.E;
        this.y = kzxVar.F;
        this.z = kzxVar.G;
        this.A = kzxVar.H;
        this.B = kzxVar.I;
        this.C = kzxVar.J;
        this.D = kzxVar.K;
        this.E = kzxVar.L;
        this.F = kzxVar.M;
        this.G = kzxVar.N;
        this.aa = kzxVar.O;
        this.H = kzxVar.P;
        this.I = kzxVar.Q;
        this.ab = kzxVar.R;
        this.ac = kzxVar.S;
        this.J = kzxVar.T;
        this.K = kzxVar.U;
        this.L = kzxVar.V;
        this.M = kzxVar.W;
        this.N = kzxVar.X;
        this.O = kzxVar.Y;
        this.P = kzxVar.Z;
        this.Q = kzxVar.aa;
        this.R = kzxVar.ab;
        this.S = 262143;
    }
}
