package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoss implements aost {
    public final aosr a;
    private final ConcurrentMap b = new ConcurrentHashMap();

    private aoss(aosr aosrVar) {
        this.a = aosrVar;
    }

    public static aoss c() {
        return new aoss(new aosq(0));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static aoss d() {
        return new aoss(new aosq(1));
    }

    @Override // defpackage.aost
    public final void a(aosc aoscVar) {
        this.b.put(this.a.a(aoscVar), aoscVar);
    }

    public final aosc b(Object obj) {
        if (obj != null) {
            return (aosc) this.b.get(obj);
        }
        return null;
    }
}
