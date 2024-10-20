package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gct extends dyh {
    public final int a;
    public final int b;
    public final int c;

    public gct(int i, int i2, int i3) {
        super(null);
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gct) {
            gct gctVar = (gct) obj;
            if (this.a == gctVar.a && this.b == gctVar.b && this.c == gctVar.c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.a + this.b + this.c;
    }

    public final String toString() {
        return arsd.s("PagingDataEvent.DropPrepend dropped " + this.a + " items (\n                    |   dropCount: " + this.a + "\n                    |   newPlaceholdersBefore: " + this.b + "\n                    |   oldPlaceholdersBefore: " + this.c + "\n                    |)\n                    |");
    }
}
