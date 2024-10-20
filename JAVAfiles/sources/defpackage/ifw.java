package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ifw extends hld {
    public final List a;
    public final boolean b;
    public final arqg c;

    public ifw(List list, boolean z, arqg arqgVar) {
        super(null);
        this.a = list;
        this.b = z;
        this.c = arqgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ifw)) {
            return false;
        }
        ifw ifwVar = (ifw) obj;
        if (d.F(this.a, ifwVar.a) && this.b == ifwVar.b && d.F(this.c, ifwVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + a.v(this.b)) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "Success(blockedParticipantListItems=" + this.a + ", measureListInteractive=" + this.b + ", onListInteractive=" + this.c + ")";
    }
}
