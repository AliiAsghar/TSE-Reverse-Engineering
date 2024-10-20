package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hnx {
    private static final hnt a = new hnv();
    private final Map b = new HashMap();

    public final synchronized hnu a(Object obj) {
        hnt hntVar;
        hwr.i(obj);
        hntVar = (hnt) this.b.get(obj.getClass());
        if (hntVar == null) {
            Iterator it = this.b.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                hnt hntVar2 = (hnt) it.next();
                if (hntVar2.b().isAssignableFrom(obj.getClass())) {
                    hntVar = hntVar2;
                    break;
                }
            }
        }
        if (hntVar == null) {
            hntVar = a;
        }
        return hntVar.a(obj);
    }

    public final synchronized void b(hnt hntVar) {
        this.b.put(hntVar.b(), hntVar);
    }
}
