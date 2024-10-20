package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class affw {
    public final List a;
    public final List b;

    public affw(List list, List list2) {
        list.getClass();
        list2.getClass();
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof affw)) {
            return false;
        }
        affw affwVar = (affw) obj;
        if (d.F(this.a, affwVar.a) && d.F(this.b, affwVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "LoadResult(media=" + this.a + ", errors=" + this.b + ")";
    }
}
