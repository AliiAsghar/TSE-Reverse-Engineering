package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afri {
    public static final arml a = armd.a(afrg.c);
    private final float b;

    public afri(float f) {
        this.b = f;
    }

    public final int a(int i) {
        return arsk.g(i / this.b);
    }

    public final int b(int i) {
        return arsk.g(i * this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof afri) && Float.compare(this.b, ((afri) obj).b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "AspectRatio(value=" + this.b + ")";
    }
}
