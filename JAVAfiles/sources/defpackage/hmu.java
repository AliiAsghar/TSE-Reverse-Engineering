package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hmu {
    public final int a;
    public final int b;

    public hmu(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (hyv.m(i)) {
            if (hyv.m(i2)) {
                return;
            } else {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hmu)) {
            return false;
        }
        hmu hmuVar = (hmu) obj;
        if (this.a == hmuVar.a && this.b == hmuVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "Size(width=" + this.a + ", height=" + this.b + ")";
    }
}
