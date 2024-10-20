package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bma {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public bma(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final long a(boolean z) {
        if (z) {
            return this.a;
        }
        return this.c;
    }

    public final long b(boolean z) {
        if (z) {
            return this.b;
        }
        return this.d;
    }

    public final bma c(long j, long j2, long j3, long j4) {
        long j5;
        long j6;
        long j7;
        long j8;
        if (j != 16) {
            j5 = j;
        } else {
            j5 = this.a;
        }
        if (j2 != 16) {
            j6 = j2;
        } else {
            j6 = this.b;
        }
        if (j3 != 16) {
            j7 = j3;
        } else {
            j7 = this.c;
        }
        if (j4 != 16) {
            j8 = j4;
        } else {
            j8 = this.d;
        }
        return new bma(j5, j6, j7, j8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof bma)) {
            return false;
        }
        bma bmaVar = (bma) obj;
        if (a.bB(this.a, bmaVar.a) && a.bB(this.b, bmaVar.b) && a.bB(this.c, bmaVar.c) && a.bB(this.d, bmaVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int A = a.A(this.a) * 31;
        long j = this.d;
        return ((((A + a.A(this.b)) * 31) + a.A(this.c)) * 31) + a.A(j);
    }
}
