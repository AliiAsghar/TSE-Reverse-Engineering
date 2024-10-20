package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aslh {
    public static final aslh a = new aslh(aqjn.aE(new ArrayList()), null);
    public final Set b;
    public final asql c;

    public aslh(Set set, asql asqlVar) {
        this.b = set;
        this.c = asqlVar;
    }

    public final void a() {
        Iterator it = this.b.iterator();
        if (!it.hasNext()) {
            return;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aslh) {
            aslh aslhVar = (aslh) obj;
            if (d.F(aslhVar.b, this.b) && d.F(aslhVar.c, this.c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.b.hashCode() + 1517;
        asql asqlVar = this.c;
        if (asqlVar != null) {
            i = asqlVar.hashCode();
        } else {
            i = 0;
        }
        return (hashCode * 41) + i;
    }
}
