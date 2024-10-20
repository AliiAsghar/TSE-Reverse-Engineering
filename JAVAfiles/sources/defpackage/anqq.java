package defpackage;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anqq {
    public static final antv a;
    public static final antv b;
    public static final antv c;
    public static final antv d;
    private static final aocj e;
    private static final Map f;
    private static final Map g;

    static {
        aocj b2 = anuk.b("type.googleapis.com/google.crypto.tink.AesSivKey");
        e = b2;
        int i = 9;
        a = new antv(anqm.class, anub.class, new anoy(i));
        b = new antv(b2, anub.class, new anoz(i));
        c = new antv(anqj.class, anua.class, new anpa(i));
        d = new antv(b2, anua.class, new anpb(i));
        HashMap hashMap = new HashMap();
        hashMap.put(anql.c, anxp.RAW);
        hashMap.put(anql.a, anxp.TINK);
        hashMap.put(anql.b, anxp.CRUNCHY);
        f = DesugarCollections.unmodifiableMap(hashMap);
        EnumMap enumMap = new EnumMap(anxp.class);
        enumMap.put((EnumMap) anxp.RAW, (anxp) anql.c);
        enumMap.put((EnumMap) anxp.TINK, (anxp) anql.a);
        enumMap.put((EnumMap) anxp.CRUNCHY, (anxp) anql.b);
        enumMap.put((EnumMap) anxp.LEGACY, (anxp) anql.b);
        g = DesugarCollections.unmodifiableMap(enumMap);
    }

    public static anql a(anxp anxpVar) {
        Map map = g;
        if (map.containsKey(anxpVar)) {
            return (anql) map.get(anxpVar);
        }
        throw new GeneralSecurityException(hht.i(anxpVar, "Unable to parse OutputPrefixType: "));
    }

    public static anxp b(anql anqlVar) {
        Map map = f;
        if (map.containsKey(anqlVar)) {
            return (anxp) map.get(anqlVar);
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(String.valueOf(anqlVar))));
    }
}
