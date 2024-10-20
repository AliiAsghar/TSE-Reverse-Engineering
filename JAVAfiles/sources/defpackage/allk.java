package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class allk implements alsv {
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof alsv) {
            return a().equals(((alsv) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a().toString();
    }
}
