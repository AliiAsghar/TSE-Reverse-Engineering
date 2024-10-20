package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gcr extends dyh {
    public final int a;
    public final List b;
    public final int c;
    public final int d;

    public gcr(int i, List list, int i2, int i3) {
        super(null);
        this.a = i;
        this.b = list;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gcr) {
            gcr gcrVar = (gcr) obj;
            if (this.a == gcrVar.a && d.F(this.b, gcrVar.b) && this.c == gcrVar.c && this.d == gcrVar.d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.a + this.b.hashCode() + this.c + this.d;
    }

    public final String toString() {
        return arsd.s("PagingDataEvent.Append loaded " + this.b.size() + " items (\n                    |   startIndex: " + this.a + "\n                    |   first item: " + aqjn.Z(this.b) + "\n                    |   last item: " + aqjn.ad(this.b) + "\n                    |   newPlaceholdersBefore: " + this.c + "\n                    |   oldPlaceholdersBefore: " + this.d + "\n                    |)\n                    |");
    }
}
