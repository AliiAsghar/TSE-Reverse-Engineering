package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class akfn {
    public final long a;

    public akfn() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof akfn) && this.a == ((akfn) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return ((int) (j ^ (j >>> 32))) ^ 1000003;
    }

    public final String toString() {
        return "FetchTaskIdentifier{index=" + this.a + "}";
    }

    public akfn(long j) {
        this.a = j;
    }
}
