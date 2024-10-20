package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jyz {
    public final float a;
    public final float b;

    public jyz(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jyz)) {
            return false;
        }
        jyz jyzVar = (jyz) obj;
        if (Float.compare(this.a, jyzVar.a) == 0 && Float.compare(this.b, jyzVar.b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "ContentOffset(previous=" + this.a + ", current=" + this.b + ")";
    }
}
