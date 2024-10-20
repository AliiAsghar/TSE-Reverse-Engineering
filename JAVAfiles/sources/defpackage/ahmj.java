package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class ahmj {
    public abstract apbt a(String str, Object obj);

    public abstract apbt b(apbt apbtVar, apbt apbtVar2);

    public abstract String c(apbt apbtVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List d(Map map) {
        apbt a;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() != null && (a = a((String) entry.getKey(), entry.getValue())) != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List e(List list, List list2) {
        apbt apbtVar;
        if (list.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            apbt apbtVar2 = (apbt) it.next();
            String c = c(apbtVar2);
            Iterator it2 = list2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    apbtVar = (apbt) it2.next();
                    if (c.equals(c(apbtVar))) {
                        break;
                    }
                } else {
                    apbtVar = null;
                    break;
                }
            }
            apbt b = b(apbtVar2, apbtVar);
            if (b != null) {
                arrayList.add(b);
            }
        }
        return arrayList;
    }
}
