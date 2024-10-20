package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum dvm {
    SPREAD,
    SPREAD_INSIDE,
    PACKED;

    public static final Map d;
    public static final Map e;

    static {
        dvm dvmVar = SPREAD;
        dvm dvmVar2 = SPREAD_INSIDE;
        dvm dvmVar3 = PACKED;
        HashMap hashMap = new HashMap();
        d = hashMap;
        HashMap hashMap2 = new HashMap();
        e = hashMap2;
        hashMap.put("packed", dvmVar3);
        hashMap.put("spread_inside", dvmVar2);
        hashMap.put("spread", dvmVar);
        hashMap2.put("packed", 2);
        hashMap2.put("spread_inside", 1);
        hashMap2.put("spread", 0);
    }

    public static int a(String str) {
        Map map = e;
        if (map.containsKey(str)) {
            return ((Integer) map.get(str)).intValue();
        }
        return -1;
    }
}
