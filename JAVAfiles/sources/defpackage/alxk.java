package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alxk {
    private static final alxg a = new alxi();
    private static final alxf b = new alxj();

    public static alxh a(Set set) {
        alxd alxdVar = new alxd(a);
        alxdVar.f = b;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            alvz alvzVar = (alvz) it.next();
            alvzVar.getClass();
            if (alvzVar.b) {
                alxf alxfVar = alxd.b;
                alzz.c(true, "key must be repeating");
                alxdVar.c.remove(alvzVar);
                alxdVar.d.put(alvzVar, alxfVar);
            } else {
                Map map = alxdVar.d;
                alxg alxgVar = alxd.a;
                map.remove(alvzVar);
                alxdVar.c.put(alvzVar, alxgVar);
            }
        }
        return new alxe(alxdVar);
    }
}
