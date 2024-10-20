package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mvw {
    public final long a;

    public mvw(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof mvw) && this.a == ((mvw) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return a.A(this.a);
    }

    public final String toString() {
        return "BugleAnalyticsId(value=" + this.a + ")";
    }
}
