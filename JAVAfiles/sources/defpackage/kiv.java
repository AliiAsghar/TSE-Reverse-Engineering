package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kiv implements kix {
    public final float a;

    public kiv(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof kiv) && Float.compare(this.a, ((kiv) obj).a) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "Changed(value=" + this.a + ")";
    }
}
