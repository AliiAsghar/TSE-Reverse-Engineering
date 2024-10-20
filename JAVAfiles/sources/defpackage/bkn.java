package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bkn {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public bkn(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final bkn a(long j, long j2, long j3, long j4) {
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
        return new bkn(j5, j6, j7, j8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof bkn)) {
            return false;
        }
        bkn bknVar = (bkn) obj;
        if (a.bB(this.a, bknVar.a) && a.bB(this.b, bknVar.b) && a.bB(this.c, bknVar.c) && a.bB(this.d, bknVar.d)) {
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
