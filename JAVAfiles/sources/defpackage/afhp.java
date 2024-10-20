package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afhp {
    public final float a;

    public afhp(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof afhp) && dqy.b(this.a, ((afhp) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "Default(availableHeightForSheetPeek=" + dqy.a(this.a) + ")";
    }
}
