package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gcs extends dyh {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public gcs(int i, int i2, int i3, int i4) {
        super(null);
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gcs) {
            gcs gcsVar = (gcs) obj;
            if (this.a == gcsVar.a && this.b == gcsVar.b && this.c == gcsVar.c && this.d == gcsVar.d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.a + this.b + this.c + this.d;
    }

    public final String toString() {
        return arsd.s("PagingDataEvent.DropAppend dropped " + this.b + " items (\n                    |   startIndex: " + this.a + "\n                    |   dropCount: " + this.b + "\n                    |   newPlaceholdersBefore: " + this.c + "\n                    |   oldPlaceholdersBefore: " + this.d + "\n                    |)\n                    |");
    }
}
