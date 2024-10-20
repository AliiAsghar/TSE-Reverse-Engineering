package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aixv {
    long a = 0;

    public final boolean equals(Object obj) {
        if ((obj instanceof aixv) && this.a == ((aixv) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.valueOf(this.a).hashCode();
    }

    public final String toString() {
        return Long.toString(this.a);
    }
}
