package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public class acna extends ThreadPoolExecutor {
    private final ConcurrentHashMap a;

    public acna(TimeUnit timeUnit, BlockingQueue blockingQueue) {
        super(1, 3, 1L, timeUnit, blockingQueue);
        this.a = new ConcurrentHashMap();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(acmw acmwVar) {
        ConcurrentHashMap concurrentHashMap = this.a;
        String b = acmwVar.b();
        if (concurrentHashMap.putIfAbsent(b, acmwVar) == null) {
            advr.l(acnb.a, "Executing business info retrieval for key %s", advq.GENERIC.c(b));
            execute(acmwVar);
        } else {
            advr.l(acnb.a, "Business info retrieval is already active for key %s", advq.GENERIC.c(b));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // java.util.concurrent.ThreadPoolExecutor
    public void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        if (runnable instanceof acmw) {
            this.a.remove(((acmw) runnable).b());
        }
    }
}
