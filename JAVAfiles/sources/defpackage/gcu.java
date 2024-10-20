package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gcu extends dyh {
    public final List a;
    public final int b;
    public final int c;

    public gcu(List list, int i, int i2) {
        super(null);
        this.a = list;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gcu) {
            gcu gcuVar = (gcu) obj;
            if (d.F(this.a, gcuVar.a) && this.b == gcuVar.b && this.c == gcuVar.c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + this.b + this.c;
    }

    public final String toString() {
        return arsd.s("PagingDataEvent.Prepend loaded " + this.a.size() + " items (\n                    |   first item: " + aqjn.Z(this.a) + "\n                    |   last item: " + aqjn.ad(this.a) + "\n                    |   newPlaceholdersBefore: " + this.b + "\n                    |   oldPlaceholdersBefore: " + this.c + "\n                    |)\n                    |");
    }
}
