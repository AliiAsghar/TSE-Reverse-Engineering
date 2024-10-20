package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rqq {
    public static final rpm a;
    private static final Set b;
    private static final Map c;

    static {
        Object obj = rmz.e.a;
        agmh agmhVar = (agmh) obj;
        b = aqjn.e(new rpn(agmhVar, (agmh) sxc.d.a, rpk.b));
        rna rnaVar = rna.a;
        Map map = rna.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            rmu rmuVar = (rmu) entry.getKey();
            if (!d.F(rmuVar, rmz.e.b) && !d.F(rmuVar, rmz.e.a)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        c = linkedHashMap;
        a = new rpm(rpp.h, rpr.h, rqp.a, linkedHashMap, null, b, 0, 80);
    }
}
