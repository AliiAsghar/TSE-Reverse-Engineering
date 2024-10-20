package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dlw {
    public final List a;

    public dlw(dlv... dlvVarArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.size() == 1) {
                aqjn.S(arrayList, list);
            } else {
                throw new IllegalArgumentException("'" + str + "' must be unique. Actual [ [" + aqjn.aK(list, null, null, null, null, 63) + ']');
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.a = arrayList2;
        int size = arrayList2.size();
        for (int i = 0; i < size && !((dlv) arrayList2.get(i)).b(); i++) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof dlw) && d.F(this.a, ((dlw) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
