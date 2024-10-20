package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class alvt {
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    protected abstract Object a();

    public final Object b(alvs alvsVar, alxa alxaVar) {
        Object obj = this.a.get(alvsVar);
        if (obj != null) {
            return obj;
        }
        Object a = a();
        Object putIfAbsent = this.a.putIfAbsent(alvsVar, a);
        if (putIfAbsent == null) {
            int i = ((alvn) alxaVar).b;
            ajnt ajntVar = null;
            for (int i2 = 0; i2 < i; i2++) {
                if (alvm.f.equals(alxaVar.c(i2))) {
                    Object e = alxaVar.e(i2);
                    if (e instanceof alvx) {
                        if (ajntVar == null) {
                            ajntVar = new ajnt(this, alvsVar, 17, (char[]) null);
                        }
                        ((alvx) e).a();
                    }
                }
            }
            return a;
        }
        return putIfAbsent;
    }
}
