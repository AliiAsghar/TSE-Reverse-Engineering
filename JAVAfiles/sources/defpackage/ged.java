package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ged extends gef {
    public final int a;
    public final int b;

    public ged(int i, int i2, int i3, int i4, int i5, int i6) {
        super(i3, i4, i5, i6);
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.gef
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ged)) {
            return false;
        }
        ged gedVar = (ged) obj;
        if (this.a == gedVar.a && this.b == gedVar.b && this.c == gedVar.c && this.d == gedVar.d && this.e == gedVar.e && this.f == gedVar.f) {
            return true;
        }
        return false;
    }

    @Override // defpackage.gef
    public final int hashCode() {
        return super.hashCode() + this.a + this.b;
    }

    public final String toString() {
        return arsd.s("ViewportHint.Access(\n            |    pageOffset=" + this.a + ",\n            |    indexInPage=" + this.b + ",\n            |    presentedItemsBefore=" + this.c + ",\n            |    presentedItemsAfter=" + this.d + ",\n            |    originalPageOffsetFirst=" + this.e + ",\n            |    originalPageOffsetLast=" + this.f + ",\n            |)");
    }
}
