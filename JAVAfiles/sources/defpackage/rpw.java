package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rpw {
    public static final rpm a;
    private static final Set b;
    private static final Map c;

    static {
        Object obj = rkz.e.c;
        agmh agmhVar = (agmh) obj;
        b = aqjn.e(new rpn(agmhVar, (agmh) slm.d.d, rpk.a));
        rla rlaVar = rla.a;
        Map map = rla.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            rku rkuVar = (rku) entry.getKey();
            if (!d.F(rkuVar, rkz.e.a) && !d.F(rkuVar, rkz.e.c)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        c = linkedHashMap;
        a = new rpm(rpp.a, rpr.a, rpv.a, linkedHashMap, null, b, 0, 80);
    }
}
