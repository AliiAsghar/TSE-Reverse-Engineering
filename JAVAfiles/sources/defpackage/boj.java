package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class boj {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public boj(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof boj)) {
            return false;
        }
        boj bojVar = (boj) obj;
        if (a.bB(this.a, bojVar.a) && a.bB(this.b, bojVar.b) && a.bB(this.c, bojVar.c) && a.bB(this.d, bojVar.d)) {
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
