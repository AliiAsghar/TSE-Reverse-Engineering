package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nha extends lga {
    private final int a;
    private final int b;

    public nha(int i, int i2) {
        super((short[]) null);
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nha)) {
            return false;
        }
        nha nhaVar = (nha) obj;
        if (this.a == nhaVar.a && this.b == nhaVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "MediaPlayerError(type=" + this.a + ", extra=" + this.b + ")";
    }
}
