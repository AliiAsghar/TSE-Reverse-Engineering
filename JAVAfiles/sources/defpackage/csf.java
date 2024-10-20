package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class csf {
    private final float a;
    private final float b;
    private final long c;
    private final int d;

    public csf(float f, float f2, long j, int i) {
        this.a = f;
        this.b = f2;
        this.c = j;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof csf) {
            csf csfVar = (csf) obj;
            if (csfVar.a == this.a && csfVar.b == this.b && csfVar.c == this.c && csfVar.d == this.d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + a.A(this.c)) * 31) + this.d;
    }

    public final String toString() {
        return "RotaryScrollEvent(verticalScrollPixels=" + this.a + ",horizontalScrollPixels=" + this.b + ",uptimeMillis=" + this.c + ",deviceId=" + this.d + ')';
    }
}
