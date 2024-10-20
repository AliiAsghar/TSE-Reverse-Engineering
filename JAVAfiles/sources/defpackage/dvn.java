package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum dvn {
    NONE,
    CHAIN,
    ALIGNED;

    public static final Map d;
    public static final Map e;

    static {
        dvn dvnVar = NONE;
        dvn dvnVar2 = CHAIN;
        dvn dvnVar3 = ALIGNED;
        HashMap hashMap = new HashMap();
        d = hashMap;
        HashMap hashMap2 = new HashMap();
        e = hashMap2;
        hashMap.put("none", dvnVar);
        hashMap.put("chain", dvnVar2);
        hashMap.put("aligned", dvnVar3);
        hashMap2.put("none", 0);
        hashMap2.put("chain", 3);
        hashMap2.put("aligned", 2);
    }
}
