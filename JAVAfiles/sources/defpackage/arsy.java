package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arsy implements arsz {
    private final float a;
    private final float b;

    public arsy(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* bridge */ /* synthetic */ boolean e(Comparable comparable, Comparable comparable2) {
        if (((Number) comparable).floatValue() <= ((Number) comparable2).floatValue()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.arsz
    public final boolean a() {
        if (this.a > this.b) {
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ Comparable b() {
        return Float.valueOf(this.b);
    }

    public final /* bridge */ /* synthetic */ Comparable c() {
        return Float.valueOf(this.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* bridge */ /* synthetic */ boolean d(Comparable comparable) {
        float floatValue = ((Number) comparable).floatValue();
        if (floatValue >= this.a && floatValue <= this.b) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof arsy)) {
            return false;
        }
        if (a() && ((arsy) obj).a()) {
            return true;
        }
        arsy arsyVar = (arsy) obj;
        if (this.a != arsyVar.a || this.b != arsyVar.b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (a()) {
            return -1;
        }
        return (Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return this.a + ".." + this.b;
    }
}
