package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afcd extends adom {
    private final float a;

    public afcd(float f) {
        super(null);
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof afcd) && Float.compare(this.a, ((afcd) obj).a) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "Loading(progress=" + this.a + ")";
    }
}
