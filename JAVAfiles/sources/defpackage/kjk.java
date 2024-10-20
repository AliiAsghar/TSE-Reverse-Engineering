package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kjk {
    public final String a;
    public final List b;
    public final Map c;

    public kjk(String str, List list) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = list;
        ArrayList arrayList = new ArrayList(aqjn.J(list, 10));
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            aqjn.q(arrayList);
            LinkedHashMap linkedHashMap = new LinkedHashMap(arrn.r(aqjn.i(aqjn.J(list, 10)), 16));
            Iterator it2 = list.iterator();
            if (!it2.hasNext()) {
                this.c = linkedHashMap;
                return;
            } else {
                throw null;
            }
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kjk)) {
            return false;
        }
        kjk kjkVar = (kjk) obj;
        if (d.F(this.a, kjkVar.a) && d.F(this.b, kjkVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "MessageSearchResults(searchQuery=" + this.a + ", hits=" + this.b + ")";
    }
}
