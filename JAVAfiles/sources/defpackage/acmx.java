package defpackage;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class acmx extends acna {
    final /* synthetic */ acnb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acmx(acnb acnbVar, TimeUnit timeUnit, BlockingQueue blockingQueue) {
        super(timeUnit, blockingQueue);
        this.a = acnbVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.acna, java.util.concurrent.ThreadPoolExecutor
    public final void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        if (!(runnable instanceof acmw)) {
            advr.h(acnb.a, "Business metadata download executed: Runnable is not an instance of BusinessInfoRetrievalRunnable", new Object[0]);
            return;
        }
        acmw acmwVar = (acmw) runnable;
        String str = acmwVar.b;
        advr.l(acnb.a, "Business metadata download executed for botId %s", advq.GENERIC.c(str));
        if (acmwVar.d == acmz.INFO_LOCALLY_AVAILABLE) {
            advr.l(acnb.a, "Checking business media retrieval for botId %s", advq.GENERIC.c(str));
            this.a.e(str);
        } else {
            this.a.g(str);
            advr.h(acnb.a, "Unable to start business media retrieval for botId %s, business info is not locally available", advq.GENERIC.c(str));
        }
    }
}
