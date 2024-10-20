package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gdl {
    public final List a;
    public final Integer b;
    public final int c;
    private final gcn d;

    public gdl(List list, Integer num, gcn gcnVar, int i) {
        this.a = list;
        this.b = num;
        this.d = gcnVar;
        this.c = i;
    }

    public final gdj a(int i) {
        List list = this.a;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!((gdj) it.next()).b.isEmpty()) {
                    int i2 = i - this.c;
                    int i3 = 0;
                    while (i3 < aqjn.z(this.a) && i2 > aqjn.z(((gdj) this.a.get(i3)).b)) {
                        i2 -= ((gdj) this.a.get(i3)).b.size();
                        i3++;
                    }
                    if (i2 < 0) {
                        return (gdj) aqjn.X(this.a);
                    }
                    return (gdj) this.a.get(i3);
                }
            }
            return null;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gdl) {
            gdl gdlVar = (gdl) obj;
            if (d.F(this.a, gdlVar.a) && d.F(this.b, gdlVar.b) && d.F(this.d, gdlVar.d) && this.c == gdlVar.c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        Integer num = this.b;
        int hashCode = this.a.hashCode();
        if (num != null) {
            i = num.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i + this.d.hashCode() + this.c;
    }

    public final String toString() {
        return "PagingState(pages=" + this.a + ", anchorPosition=" + this.b + ", config=" + this.d + ", leadingPlaceholderCount=" + this.c + ')';
    }
}
