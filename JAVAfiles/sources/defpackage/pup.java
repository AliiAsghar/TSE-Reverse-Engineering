package defpackage;

import j$.lang.Iterable$EL;
import j$.time.Instant;
import java.util.HashMap;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class pup implements puu {
    private final Supplier a;

    public pup(Supplier supplier) {
        this.a = supplier;
    }

    private final pto c() {
        Object obj;
        pvm pvmVar = new pvm();
        pvmVar.i(ptz.a);
        obj = this.a.get();
        pvmVar.h((Instant) obj);
        return pvmVar.g();
    }

    @Override // defpackage.puu
    public final akul a(Iterable iterable) {
        pto c = c();
        HashMap hashMap = new HashMap();
        Iterable$EL.forEach(iterable, new ksn(hashMap, c, 11, null));
        return aktp.ag(hashMap);
    }

    @Override // defpackage.puu
    public final akul b(qei qeiVar) {
        return aktp.ag(c());
    }
}
