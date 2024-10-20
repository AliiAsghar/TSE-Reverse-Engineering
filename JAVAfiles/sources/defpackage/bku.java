package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bku {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public bku(long j, long j2, long j3, long j4) {
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof bku)) {
            return false;
        }
        bku bkuVar = (bku) obj;
        if (a.bB(this.a, bkuVar.a) && a.bB(this.b, bkuVar.b) && a.bB(this.c, bkuVar.c) && a.bB(this.d, bkuVar.d)) {
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
