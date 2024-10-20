package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ccd<K, V> extends ccc<K, V> implements Map.Entry<K, V>, arse {
    private final ccj b;
    private Object c;

    public ccd(ccj ccjVar, Object obj, Object obj2) {
        super(obj, obj2);
        this.b = ccjVar;
        this.c = obj2;
    }

    @Override // defpackage.ccc, java.util.Map.Entry
    public final Object getValue() {
        return this.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ccc, java.util.Map.Entry
    public final Object setValue(Object obj) {
        int i;
        Object obj2 = this.c;
        this.c = obj;
        cch cchVar = this.b.a;
        ccg ccgVar = cchVar.d;
        Object obj3 = this.a;
        if (ccgVar.containsKey(obj3)) {
            if (cchVar.c) {
                Object a = cchVar.a();
                cchVar.d.put(obj3, obj);
                if (a != null) {
                    i = a.hashCode();
                } else {
                    i = 0;
                }
                cchVar.b(i, cchVar.d.b, a, 0);
            } else {
                cchVar.d.put(obj3, obj);
            }
            cchVar.e = cchVar.d.d;
        }
        return obj2;
    }
}
