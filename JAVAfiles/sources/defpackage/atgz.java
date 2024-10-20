package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class atgz extends athw {
    private final atgv a;
    private final int c;
    private final int d;

    public atgz(atgv atgvVar) {
        super(atfy.h, 2629746000L);
        this.a = atgvVar;
        this.c = 12;
        this.d = 2;
    }

    @Override // defpackage.athq, defpackage.atfw
    public final int a(long j) {
        atgv atgvVar = this.a;
        return atgvVar.T(j, atgvVar.Y(j));
    }

    @Override // defpackage.athq, defpackage.atfw
    public final int c() {
        return this.c;
    }

    @Override // defpackage.atfw
    public final int d() {
        return 1;
    }

    @Override // defpackage.athq, defpackage.atfw
    public final long e(long j, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (i == 0) {
            return j;
        }
        long S = this.a.S(j);
        int Y = this.a.Y(j);
        int T = this.a.T(j, Y);
        int i7 = T - 1;
        int i8 = i7 + i;
        if (i8 < 0) {
            if (Math.signum(this.c + i) == Math.signum(i)) {
                i5 = Y - 1;
                i6 = i + this.c;
            } else {
                i5 = Y + 1;
                i6 = i - this.c;
            }
            int i9 = i5;
            i8 = i6 + i7;
            i2 = i9;
        } else {
            i2 = Y;
        }
        if (i8 >= 0) {
            int i10 = this.c;
            i3 = i2 + (i8 / i10);
            i4 = (i8 % i10) + 1;
        } else {
            int i11 = this.c;
            i3 = i2 + (i8 / i11);
            int i12 = i3 - 1;
            int abs = Math.abs(i8) % i11;
            if (abs == 0) {
                abs = this.c;
            }
            i4 = (this.c - abs) + 1;
            if (i4 != 1) {
                i3 = i12;
            }
        }
        int N = this.a.N(j, Y, T);
        int R = this.a.R(i3, i4);
        if (N > R) {
            N = R;
        }
        return this.a.ad(i3, i4, N) + S;
    }

    @Override // defpackage.athq, defpackage.atfw
    public final long f(long j) {
        return j - g(j);
    }

    @Override // defpackage.athq, defpackage.atfw
    public final long g(long j) {
        atgv atgvVar = this.a;
        int Y = atgvVar.Y(j);
        int T = atgvVar.T(j, Y);
        atgv atgvVar2 = this.a;
        return atgvVar2.ac(Y) + atgvVar2.ab(Y, T);
    }

    @Override // defpackage.athq, defpackage.atfw
    public final long h(long j, int i) {
        atow.q(this, i, 1, this.c);
        atgv atgvVar = this.a;
        int Y = atgvVar.Y(j);
        int N = atgvVar.N(j, Y, atgvVar.T(j, Y));
        int R = this.a.R(Y, i);
        if (N > R) {
            N = R;
        }
        return this.a.ad(Y, i, N) + this.a.S(j);
    }

    @Override // defpackage.athq, defpackage.atfw
    public final atgd r() {
        return this.a.c;
    }

    @Override // defpackage.atfw
    public final atgd s() {
        return this.a.g;
    }

    @Override // defpackage.athq, defpackage.atfw
    public final boolean t(long j) {
        atgv atgvVar = this.a;
        int Y = atgvVar.Y(j);
        if (!atgvVar.ag(Y) || this.a.T(j, Y) != this.d) {
            return false;
        }
        return true;
    }

    @Override // defpackage.athw
    public final long x(long j, long j2) {
        long j3;
        long j4;
        int i = (int) j2;
        if (i == j2) {
            return e(j, i);
        }
        long S = this.a.S(j);
        int Y = this.a.Y(j);
        long j5 = Y;
        int T = this.a.T(j, Y);
        long j6 = (T - 1) + j2;
        if (j6 >= 0) {
            long j7 = this.c;
            j3 = j5 + (j6 / j7);
            j4 = (j6 % j7) + 1;
        } else {
            long j8 = this.c;
            j3 = j5 + (j6 / j8);
            int abs = (int) (Math.abs(j6) % j8);
            if (abs == 0) {
                abs = this.c;
            }
            long j9 = (-1) + j3;
            long j10 = (this.c - abs) + 1;
            if (j10 != 1) {
                j3 = j9;
            }
            j4 = j10;
        }
        if (j3 >= -292275054 && j3 <= 292278993) {
            int i2 = (int) j4;
            int N = this.a.N(j, Y, T);
            int i3 = (int) j3;
            int R = this.a.R(i3, i2);
            if (N > R) {
                N = R;
            }
            return this.a.ad(i3, i2, N) + S;
        }
        throw new IllegalArgumentException(a.ck(j2, "Magnitude of add amount is too large: "));
    }

    @Override // defpackage.atfw
    public final void v() {
    }
}
