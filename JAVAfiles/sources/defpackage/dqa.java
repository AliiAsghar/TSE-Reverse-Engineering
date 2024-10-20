package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dqa {
    public final float a;

    public final boolean equals(Object obj) {
        if ((obj instanceof dqa) && Float.compare(this.a, ((dqa) obj).a) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "BaselineShift(multiplier=" + this.a + ')';
    }
}
