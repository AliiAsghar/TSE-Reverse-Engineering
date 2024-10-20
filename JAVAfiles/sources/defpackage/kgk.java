package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kgk {
    public final List a;
    public final aeqi b;

    public kgk(List list, aeqi aeqiVar) {
        this.a = list;
        this.b = aeqiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kgk)) {
            return false;
        }
        kgk kgkVar = (kgk) obj;
        if (d.F(this.a, kgkVar.a) && d.F(this.b, kgkVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ScheduledMessagesListUiData(listItemsUiData=" + this.a + ", listButtonUiData=" + this.b + ")";
    }
}
