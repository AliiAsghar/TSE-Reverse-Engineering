package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeqy {
    public final float a;
    public final float b;
    public final float c;

    public aeqy(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aeqy)) {
            return false;
        }
        aeqy aeqyVar = (aeqy) obj;
        if (dqy.b(this.a, aeqyVar.a) && dqy.b(this.b, aeqyVar.b) && dqy.b(this.c, aeqyVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c);
    }

    public final String toString() {
        float f = this.c;
        float f2 = this.b;
        return "GalleryDimensions(smallItemSideLength=" + dqy.a(this.a) + ", bigItemWidth=" + dqy.a(f2) + ", bigItemHeight=" + dqy.a(f) + ")";
    }
}
