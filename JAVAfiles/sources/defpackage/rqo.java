package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rqo {
    public static final Set a;
    public static final Map b;
    public static final rqn c;

    static {
        Object obj = rmq.e.a;
        agmh agmhVar = (agmh) obj;
        a = aqil.r(new rpn[]{new rpn(agmhVar, (agmh) svz.d.a, rpk.b), new rpn((agmh) rmq.e.b, (agmh) svz.d.b, rpk.b)});
        rmr rmrVar = rmr.a;
        Map map = rmr.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            rmk rmkVar = (rmk) entry.getKey();
            if (!d.F(rmkVar, rmq.e.a) && !d.F(rmkVar, rmq.e.b)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        b = linkedHashMap;
        c = new rqn();
    }
}
