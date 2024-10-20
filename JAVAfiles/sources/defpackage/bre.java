package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bre {
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
    private final long m;
    private final long n;
    private final long o;
    private final long p;

    public bre(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.m = j4;
        this.d = j5;
        this.e = j6;
        this.f = j7;
        this.n = j8;
        this.g = j9;
        this.h = j10;
        this.i = j11;
        this.o = j12;
        this.j = j13;
        this.k = j14;
        this.l = j15;
        this.p = j16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof bre)) {
            return false;
        }
        bre breVar = (bre) obj;
        if (a.bB(this.a, breVar.a) && a.bB(this.b, breVar.b) && a.bB(this.c, breVar.c) && a.bB(this.m, breVar.m) && a.bB(this.d, breVar.d) && a.bB(this.e, breVar.e) && a.bB(this.f, breVar.f) && a.bB(this.n, breVar.n) && a.bB(this.g, breVar.g) && a.bB(this.h, breVar.h) && a.bB(this.i, breVar.i) && a.bB(this.o, breVar.o) && a.bB(this.j, breVar.j) && a.bB(this.k, breVar.k) && a.bB(this.l, breVar.l) && a.bB(this.p, breVar.p)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int A = a.A(this.a) * 31;
        long j = this.p;
        long j2 = this.l;
        long j3 = this.k;
        long j4 = this.j;
        long j5 = this.o;
        long j6 = this.i;
        long j7 = this.h;
        long j8 = this.g;
        long j9 = this.n;
        long j10 = this.f;
        long j11 = this.e;
        long j12 = this.d;
        long j13 = this.m;
        return ((((((((((((((((((((((((((((A + a.A(this.b)) * 31) + a.A(this.c)) * 31) + a.A(j13)) * 31) + a.A(j12)) * 31) + a.A(j11)) * 31) + a.A(j10)) * 31) + a.A(j9)) * 31) + a.A(j8)) * 31) + a.A(j7)) * 31) + a.A(j6)) * 31) + a.A(j5)) * 31) + a.A(j4)) * 31) + a.A(j3)) * 31) + a.A(j2)) * 31) + a.A(j);
    }
}
