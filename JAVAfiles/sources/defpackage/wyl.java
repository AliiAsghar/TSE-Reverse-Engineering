package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wyl {
    private static final alvi b = alvi.m("com/google/android/apps/messaging/shared/sms/EarlySendCache");
    public final ConcurrentHashMap a;
    private final armf c;

    public wyl(armf armfVar) {
        armfVar.getClass();
        this.c = armfVar;
        this.a = new ConcurrentHashMap();
    }

    public final akul a(rve rveVar, Executor executor, arqg arqgVar) {
        executor.getClass();
        return b(rveVar).h(new wxv(new wyk(arqgVar, 0), 7), executor);
    }

    public final akul b(rve rveVar) {
        arwl arwlVar;
        akul akulVar;
        if (rveVar == null) {
            arwlVar = null;
        } else {
            arwlVar = (arwl) this.a.get(rveVar);
            if (arwlVar != null && arwlVar.z()) {
                this.a.remove(rveVar, arwlVar);
            }
        }
        if (arwlVar != null) {
            akulVar = qjh.a(arwlVar);
        } else {
            akulVar = null;
        }
        if (akulVar == null) {
            ((alvg) b.d().h("com/google/android/apps/messaging/shared/sms/EarlySendCache", "getSaveFuture", 84, "EarlySendCache.kt")).t("No save future found for %s", String.valueOf(rveVar));
            akul ag = aktp.ag(null);
            ag.getClass();
            return ag;
        }
        return akulVar;
    }

    public final void c(rve rveVar, int i) {
        if (rve.l(rveVar) && !b(rveVar).isDone()) {
            ((mbl) this.c.b()).e("Bugle.EarlySend.SaveNotFinished.Count", i - 1);
        }
    }
}
