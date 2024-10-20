package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lgh {
    public final boolean a;
    public final List b;
    public final lgj c;
    public final afaw d;

    public lgh(boolean z, List list, lgj lgjVar, afaw afawVar) {
        list.getClass();
        afawVar.getClass();
        this.a = z;
        this.b = list;
        this.c = lgjVar;
        this.d = afawVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lgh)) {
            return false;
        }
        lgh lghVar = (lgh) obj;
        if (this.a == lghVar.a && d.F(this.b, lghVar.b) && d.F(this.c, lghVar.c) && d.F(this.d, lghVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((a.v(this.a) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "EditMessageUiData(isOpened=" + this.a + ", selectedRecipients=" + this.b + ", bottomContentUiData=" + this.c + ", topAppBarUiData=" + this.d + ")";
    }
}
