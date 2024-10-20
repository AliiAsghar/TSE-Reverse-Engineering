package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class esn {
    public static final esn a = new esn(0, 0);
    public final int b;
    public final int c;
    public final float d;

    static {
        eul.M(0);
        eul.M(1);
        eul.M(3);
    }

    public esn(int i, int i2, float f) {
        this.b = i;
        this.c = i2;
        this.d = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof esn) {
            esn esnVar = (esn) obj;
            if (this.b == esnVar.b && this.c == esnVar.c && this.d == esnVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.b + 217) * 31) + this.c) * 31) + Float.floatToRawIntBits(this.d);
    }

    public esn(int i, int i2) {
        this(i, i2, 1.0f);
    }
}
