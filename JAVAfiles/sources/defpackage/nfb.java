package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nfb {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    private final boolean i;
    private final boolean j;
    private final int k;
    private final boolean l;
    private final boolean m;
    private final boolean n;
    private final boolean o;
    private final boolean p;
    private final boolean q;

    public nfb(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
        this.h = z8;
        this.i = z9;
        this.j = z10;
        this.k = i;
        this.l = z11;
        this.m = z12;
        this.n = z13;
        this.o = z14;
        this.p = z15;
        this.q = z16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nfb)) {
            return false;
        }
        nfb nfbVar = (nfb) obj;
        if (this.a == nfbVar.a && this.b == nfbVar.b && this.c == nfbVar.c && this.d == nfbVar.d && this.e == nfbVar.e && this.f == nfbVar.f && this.g == nfbVar.g && this.h == nfbVar.h && this.i == nfbVar.i && this.j == nfbVar.j && this.k == nfbVar.k && this.l == nfbVar.l && this.m == nfbVar.m && this.n == nfbVar.n && this.o == nfbVar.o && this.p == nfbVar.p && this.q == nfbVar.q) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int v = a.v(this.a);
        boolean z = this.q;
        boolean z2 = this.p;
        boolean z3 = this.o;
        boolean z4 = this.n;
        boolean z5 = this.m;
        boolean z6 = this.l;
        boolean z7 = this.j;
        boolean z8 = this.i;
        boolean z9 = this.h;
        boolean z10 = this.g;
        boolean z11 = this.f;
        boolean z12 = this.e;
        boolean z13 = this.d;
        return (((((((((((((((((((((((((((((((v * 31) + a.v(this.b)) * 31) + a.v(this.c)) * 31) + a.v(z13)) * 31) + a.v(z12)) * 31) + a.v(z11)) * 31) + a.v(z10)) * 31) + a.v(z9)) * 31) + a.v(z8)) * 31) + a.v(z7)) * 31) + this.k) * 31) + a.v(z6)) * 31) + a.v(z5)) * 31) + a.v(z4)) * 31) + a.v(z3)) * 31) + a.v(z2)) * 31) + a.v(z);
    }

    public nfb() {
        this(false, false, false, false, false, false, false, false, false, false, 0, false, false, false, false, false, false);
    }
}
