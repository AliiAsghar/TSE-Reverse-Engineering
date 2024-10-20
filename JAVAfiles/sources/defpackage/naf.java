package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class naf {
    public final long a;
    public final long b;

    public naf(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof naf)) {
            return false;
        }
        naf nafVar = (naf) obj;
        if (this.a == nafVar.a && this.b == nafVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (a.A(this.a) * 31) + a.A(this.b);
    }

    public final String toString() {
        return "PlaceholdersCount(itemsBefore=" + this.a + ", itemsAfter=" + this.b + ")";
    }
}
