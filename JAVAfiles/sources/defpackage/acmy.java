package defpackage;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class acmy extends acna {
    final /* synthetic */ acnb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acmy(acnb acnbVar, TimeUnit timeUnit, BlockingQueue blockingQueue) {
        super(timeUnit, blockingQueue);
        this.a = acnbVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.acna, java.util.concurrent.ThreadPoolExecutor
    public final void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        if (!(runnable instanceof acmu)) {
            advr.h(acnb.a, "Business media download executed: Runnable is not an instance of BusinessInfoMediaRetrievalRunnable", new Object[0]);
            return;
        }
        acmu acmuVar = (acmu) runnable;
        String str = acmuVar.b;
        advr.l(acnb.a, "Business media download executed for botId %s", advq.GENERIC.c(str));
        int i = acmuVar.a;
        if (i != 0 && i != 2) {
            return;
        }
        acnb acnbVar = this.a;
        acmz acmzVar = acmuVar.d;
        acnbVar.g(str);
    }
}
