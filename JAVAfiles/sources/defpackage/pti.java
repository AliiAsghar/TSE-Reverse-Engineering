package defpackage;

import android.util.LruCache;
import j$.util.Map;
import j$.util.Optional;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class pti implements ptg {
    private final armf a;

    public pti(armf armfVar) {
        this.a = armfVar;
    }

    @Override // defpackage.ptg
    public final akul a(qei qeiVar) {
        return aktp.ag(Optional.ofNullable((pto) ((LruCache) this.a.b()).get(qeiVar)));
    }

    @Override // defpackage.ptg
    public final akul b(Iterable iterable) {
        LruCache lruCache = (LruCache) this.a.b();
        HashMap hashMap = new HashMap();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            qei qeiVar = (qei) it.next();
            pto ptoVar = (pto) lruCache.get(qeiVar);
            if (ptoVar != null) {
                hashMap.put(qeiVar, ptoVar);
            }
        }
        return aktp.ag(hashMap);
    }

    @Override // defpackage.ptg
    public final akul c(Map map) {
        Map.EL.forEach(map, new lui(this, 3));
        return aktp.ag(null);
    }

    @Override // defpackage.ptg
    public final akul d(qei qeiVar, pto ptoVar) {
        e(qeiVar, ptoVar);
        return aktp.ag(null);
    }

    public final void e(qei qeiVar, pto ptoVar) {
        pto ptoVar2 = (pto) ((LruCache) this.a.b()).get(qeiVar);
        if (ptoVar2 != null && ptoVar2.b().compareTo(ptoVar.b()) > 0) {
            return;
        }
        ((LruCache) this.a.b()).put(qeiVar, ptoVar);
    }
}
