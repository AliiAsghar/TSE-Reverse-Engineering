package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bsa {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public bsa(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof bsa)) {
            return false;
        }
        bsa bsaVar = (bsa) obj;
        if (a.bB(this.a, bsaVar.a) && a.bB(this.b, bsaVar.b) && a.bB(this.c, bsaVar.c) && a.bB(this.d, bsaVar.d) && a.bB(this.e, bsaVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int A = a.A(this.a) * 31;
        long j = this.e;
        long j2 = this.d;
        return ((((((A + a.A(this.b)) * 31) + a.A(this.c)) * 31) + a.A(j2)) * 31) + a.A(j);
    }
}
