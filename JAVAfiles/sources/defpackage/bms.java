package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bms {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public bms(long j, long j2, long j3, long j4, long j5, long j6) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof bms)) {
            return false;
        }
        bms bmsVar = (bms) obj;
        if (a.bB(this.a, bmsVar.a) && a.bB(this.b, bmsVar.b) && a.bB(this.c, bmsVar.c) && a.bB(this.d, bmsVar.d) && a.bB(this.e, bmsVar.e) && a.bB(this.f, bmsVar.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int A = a.A(this.a) * 31;
        long j = this.f;
        long j2 = this.e;
        long j3 = this.d;
        return ((((((((A + a.A(this.b)) * 31) + a.A(this.c)) * 31) + a.A(j3)) * 31) + a.A(j2)) * 31) + a.A(j);
    }
}
