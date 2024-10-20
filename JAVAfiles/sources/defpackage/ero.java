package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ero {
    public static final ero a = new ero(1.0f, 1.0f);
    public final float b;
    public final float c;
    public final int d;

    static {
        eul.M(0);
        eul.M(1);
    }

    public ero(float f, float f2) {
        boolean z;
        if (f > brg.a) {
            z = true;
        } else {
            z = false;
        }
        d.s(z);
        d.s(f2 > brg.a);
        this.b = f;
        this.c = f2;
        this.d = Math.round(f * 1000.0f);
    }

    public final ero a(float f) {
        return new ero(f, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ero eroVar = (ero) obj;
            if (this.b == eroVar.b && this.c == eroVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.b) + 527) * 31) + Float.floatToRawIntBits(this.c);
    }

    public final String toString() {
        return eul.G("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.b), Float.valueOf(this.c));
    }
}
