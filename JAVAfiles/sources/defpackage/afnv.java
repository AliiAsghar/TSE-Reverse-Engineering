package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afnv {
    public final int a;
    public final int b;

    public afnv(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afnv)) {
            return false;
        }
        afnv afnvVar = (afnv) obj;
        if (this.a == afnvVar.a && this.b == afnvVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "EmojiCategoryResources(title=" + this.a + ", icon=" + this.b + ")";
    }
}
