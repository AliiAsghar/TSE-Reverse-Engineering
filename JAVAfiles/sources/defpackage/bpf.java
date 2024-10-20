package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpf {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final long k;
    public final long l;
    public final long m;

    public bpf(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
        this.i = j9;
        this.j = j10;
        this.k = j11;
        this.l = j12;
        this.m = j13;
    }

    public final bpf a(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13) {
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        long j20;
        long j21;
        long j22;
        long j23;
        long j24;
        long j25;
        long j26;
        if (j != 16) {
            j14 = j;
        } else {
            j14 = this.a;
        }
        if (j2 != 16) {
            j15 = j2;
        } else {
            j15 = this.b;
        }
        if (j3 != 16) {
            j16 = j3;
        } else {
            j16 = this.c;
        }
        if (j4 != 16) {
            j17 = j4;
        } else {
            j17 = this.d;
        }
        if (j5 != 16) {
            j18 = j5;
        } else {
            j18 = this.e;
        }
        if (j6 != 16) {
            j19 = j6;
        } else {
            j19 = this.f;
        }
        if (j7 != 16) {
            j20 = j7;
        } else {
            j20 = this.g;
        }
        if (j8 != 16) {
            j21 = j8;
        } else {
            j21 = this.h;
        }
        if (j9 != 16) {
            j22 = j9;
        } else {
            j22 = this.i;
        }
        if (j10 != 16) {
            j23 = j10;
        } else {
            j23 = this.j;
        }
        if (j11 != 16) {
            j24 = j11;
        } else {
            j24 = this.k;
        }
        if (j12 != 16) {
            j25 = j12;
        } else {
            j25 = this.l;
        }
        if (j13 != 16) {
            j26 = j13;
        } else {
            j26 = this.m;
        }
        return new bpf(j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof bpf)) {
            return false;
        }
        bpf bpfVar = (bpf) obj;
        if (a.bB(this.a, bpfVar.a) && a.bB(this.b, bpfVar.b) && a.bB(this.c, bpfVar.c) && a.bB(this.d, bpfVar.d) && a.bB(this.e, bpfVar.e) && a.bB(this.f, bpfVar.f) && a.bB(this.g, bpfVar.g) && a.bB(this.h, bpfVar.h) && a.bB(this.i, bpfVar.i) && a.bB(this.j, bpfVar.j) && a.bB(this.k, bpfVar.k) && a.bB(this.l, bpfVar.l) && a.bB(this.m, bpfVar.m)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int A = a.A(this.a) * 31;
        long j = this.m;
        long j2 = this.l;
        long j3 = this.k;
        long j4 = this.j;
        long j5 = this.i;
        long j6 = this.h;
        long j7 = this.g;
        long j8 = this.f;
        long j9 = this.e;
        long j10 = this.d;
        return ((((((((((((((((((((((A + a.A(this.b)) * 31) + a.A(this.c)) * 31) + a.A(j10)) * 31) + a.A(j9)) * 31) + a.A(j8)) * 31) + a.A(j7)) * 31) + a.A(j6)) * 31) + a.A(j5)) * 31) + a.A(j4)) * 31) + a.A(j3)) * 31) + a.A(j2)) * 31) + a.A(j);
    }
}
