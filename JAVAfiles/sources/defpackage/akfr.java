package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class akfr {
    public final long a;

    public akfr() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof akfr) && this.a == ((akfr) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return ((int) (j ^ (j >>> 32))) ^ 1000003;
    }

    public final String toString() {
        return "LoadTaskIdentifier{index=" + this.a + "}";
    }

    public akfr(long j) {
        this.a = j;
    }
}
