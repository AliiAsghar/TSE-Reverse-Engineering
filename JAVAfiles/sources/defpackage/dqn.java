package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dqn {
    public static final dqn a = new dqn(1.0f, brg.a);
    public final float b;
    public final float c;

    public dqn(float f, float f2) {
        this.b = f;
        this.c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqn)) {
            return false;
        }
        dqn dqnVar = (dqn) obj;
        if (this.b == dqnVar.b && this.c == dqnVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.b) * 31) + Float.floatToIntBits(this.c);
    }

    public final String toString() {
        return "TextGeometricTransform(scaleX=" + this.b + ", skewX=" + this.c + ')';
    }

    public dqn() {
        this(1.0f, brg.a);
    }
}
