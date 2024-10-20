package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fxt {
    public static final fxt a = new abyc((byte[]) null).a();
    public final int b;
    public final int d;
    public final int e;
    public final int c = 1;
    public final float f = 1.0f;
    public final int g = -1;
    public final int h = -1;
    public final boolean i = false;

    public fxt(int i, int i2, int i3) {
        this.b = i;
        this.d = i2;
        this.e = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fxt)) {
            return false;
        }
        fxt fxtVar = (fxt) obj;
        if (this.b == fxtVar.b) {
            int i = fxtVar.c;
            if (this.d == fxtVar.d && this.e == fxtVar.e) {
                float f = fxtVar.f;
                int i2 = fxtVar.g;
                int i3 = fxtVar.h;
                boolean z = fxtVar.i;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((this.b + 217) * 31) + 1) * 31) + this.d) * 31) + this.e) * 31) + Float.floatToIntBits(1.0f)) * 31) - 1) * 31) - 1) * 31;
    }
}
