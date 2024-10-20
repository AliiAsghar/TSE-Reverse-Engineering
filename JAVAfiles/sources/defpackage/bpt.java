package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpt {
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

    public bpt(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
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
    }

    public final long a(boolean z, boolean z2) {
        if (z) {
            if (z2) {
                return this.c;
            }
            return this.e;
        }
        if (z2) {
            return this.h;
        }
        return this.j;
    }

    public final long b(boolean z, boolean z2) {
        if (z) {
            if (z2) {
                return this.b;
            }
            return this.d;
        }
        if (z2) {
            return this.g;
        }
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof bpt)) {
            return false;
        }
        bpt bptVar = (bpt) obj;
        if (a.bB(this.a, bptVar.a) && a.bB(this.b, bptVar.b) && a.bB(this.c, bptVar.c) && a.bB(this.d, bptVar.d) && a.bB(this.e, bptVar.e) && a.bB(this.f, bptVar.f) && a.bB(this.g, bptVar.g) && a.bB(this.h, bptVar.h) && a.bB(this.i, bptVar.i) && a.bB(this.j, bptVar.j)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int A = a.A(this.a) * 31;
        long j = this.j;
        long j2 = this.i;
        long j3 = this.h;
        long j4 = this.g;
        long j5 = this.f;
        long j6 = this.e;
        long j7 = this.d;
        return ((((((((((((((((A + a.A(this.b)) * 31) + a.A(this.c)) * 31) + a.A(j7)) * 31) + a.A(j6)) * 31) + a.A(j5)) * 31) + a.A(j4)) * 31) + a.A(j3)) * 31) + a.A(j2)) * 31) + a.A(j);
    }
}
