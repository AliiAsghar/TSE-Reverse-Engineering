package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rqj {
    public static final rpm a;
    private static final Set b = aqjn.e(new rpn((agmh) rlv.d.e, sss.d.b, rpk.b));
    private static final Map c;

    static {
        rlw rlwVar = rlw.a;
        Map map = rlw.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            rlp rlpVar = (rlp) entry.getKey();
            if (!d.F(rlpVar, rlv.d.c) && !d.F(rlpVar, rlv.d.e)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        c = linkedHashMap;
        a = new rpm(rpp.e, rpr.e, rqi.a, linkedHashMap, null, b, 0, 80);
    }
}
