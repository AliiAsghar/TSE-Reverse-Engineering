package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class drl implements drq {
    private final float a;

    public drl(float f) {
        this.a = f;
    }

    @Override // defpackage.drq
    public final float a(float f) {
        return f / this.a;
    }

    @Override // defpackage.drq
    public final float b(float f) {
        return f * this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof drl) && Float.compare(this.a, ((drl) obj).a) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "LinearFontScaleConverter(fontScale=" + this.a + ')';
    }
}
