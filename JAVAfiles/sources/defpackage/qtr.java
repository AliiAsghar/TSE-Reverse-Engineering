package defpackage;

import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qtr {
    public final Set a;
    public final Map b;

    public qtr(Set set, Map map) {
        set.getClass();
        this.a = set;
        this.b = map;
        armd.a(new qtq(this, 0));
        armd.a(new qtq(this, 1));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qtr)) {
            return false;
        }
        qtr qtrVar = (qtr) obj;
        if (d.F(this.a, qtrVar.a) && d.F(this.b, qtrVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "GroupMembers(members=" + this.a + ", activeMyIdentitiesInGroup=" + this.b + ")";
    }
}
