package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rpu {
    public static final rpm a;
    private static final Set b;
    private static final Map c;

    static {
        Object obj = rkq.e.d;
        agmh agmhVar = (agmh) obj;
        b = aqil.r(new rpn[]{new rpn(agmhVar, (agmh) sld.e.d, rpk.a), new rpn((agmh) rkq.e.e, (agmh) sld.e.e, rpk.c)});
        Map map = rks.a;
        Map map2 = rks.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map2.entrySet()) {
            rkk rkkVar = (rkk) entry.getKey();
            if (!d.F(rkkVar, rkq.e.c) && !d.F(rkkVar, rkq.e.d) && !d.F(rkkVar, rkq.e.e)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        c = linkedHashMap;
        a = new rpm(rpp.b, rpr.b, rpt.a, linkedHashMap, null, b, 0, 80);
    }
}
