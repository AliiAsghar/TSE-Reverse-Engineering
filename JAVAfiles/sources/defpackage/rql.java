package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rql {
    public static final rpm a;
    private static final Set b;
    private static final Map c;

    static {
        Object obj = rmh.e.b;
        agmh agmhVar = (agmh) obj;
        b = aqil.r(new rpn[]{new rpn(agmhVar, (agmh) svq.d.c, rpk.b), new rpn((agmh) rmh.e.g, (agmh) svq.d.e, rpk.b, true)});
        rmi rmiVar = rmi.a;
        Map map = rmi.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            rlz rlzVar = (rlz) entry.getKey();
            if (!d.F(rlzVar, rmh.e.c) && !d.F(rlzVar, rmh.e.b) && !d.F(rlzVar, rmh.e.g)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        c = linkedHashMap;
        a = new rpm(rpp.f, rpr.f, rqk.a, linkedHashMap, null, b, 0, 80);
    }
}
