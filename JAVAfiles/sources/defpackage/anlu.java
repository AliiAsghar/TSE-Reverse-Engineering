package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anlu {
    public final aqfn a;
    public final Iterable b;

    public anlu(aqfn aqfnVar, Iterable iterable) {
        this.a = aqfnVar;
        this.b = iterable;
    }

    public final Set a() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            aqjn.S(arrayList, ((anls) it.next()).a);
        }
        return aqjn.aE(arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof anlu)) {
            return false;
        }
        anlu anluVar = (anlu) obj;
        if (d.F(this.a, anluVar.a) && d.F(this.b, anluVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "UserRegistration(id=" + this.a + ", devices=" + this.b + ")";
    }
}
