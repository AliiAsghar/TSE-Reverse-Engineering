package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gpb extends gpc {
    private final float b;
    private final float c;

    public gpb(float f, float f2) {
        this.b = f;
        this.c = f2;
        double d = f;
        if (d > 0.0d && d < 1.0d) {
            double d2 = f2;
            if (d2 > 0.0d && d2 < 1.0d) {
                if (f <= f2) {
                    return;
                } else {
                    throw new IllegalArgumentException("minRatio must be less than or equal to maxRatio");
                }
            }
            throw new IllegalArgumentException("maxRatio must be in the interval (0.0, 1.0)");
        }
        throw new IllegalArgumentException("minRatio must be in the interval (0.0, 1.0)");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gpb)) {
            return false;
        }
        gpb gpbVar = (gpb) obj;
        if (this.b == gpbVar.b && this.c == gpbVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.b) * 31) + Float.floatToIntBits(this.c);
    }

    public final String toString() {
        return "SplitRatioDragRange[" + this.b + ", " + this.c + ']';
    }
}
