package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class area extends arbv {
    private final ardz e;
    private static final ReferenceQueue c = new ReferenceQueue();
    private static final ConcurrentMap d = new ConcurrentHashMap();
    public static final Logger b = Logger.getLogger(area.class.getName());

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public area(aquc aqucVar) {
        super(aqucVar);
        ReferenceQueue referenceQueue = c;
        ConcurrentMap concurrentMap = d;
        this.e = new ardz(this, aqucVar, referenceQueue, concurrentMap);
    }

    @Override // defpackage.arbv, defpackage.aquc
    public final aquc d() {
        int i = ardz.b;
        ardz ardzVar = this.e;
        if (!ardzVar.a.getAndSet(true)) {
            ardzVar.clear();
        }
        aquc aqucVar = this.a;
        ((ardr) aqucVar).p();
        return aqucVar;
    }
}
