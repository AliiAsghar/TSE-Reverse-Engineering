package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agjr implements Runnable {
    final Runnable a = this;
    final /* synthetic */ Runnable b;
    final /* synthetic */ SettableFuture c;
    final /* synthetic */ agjs d;
    final /* synthetic */ long e;
    final /* synthetic */ TimeUnit f;
    final /* synthetic */ agth g;

    public agjr(agth agthVar, Runnable runnable, SettableFuture settableFuture, agjs agjsVar, long j, TimeUnit timeUnit) {
        this.b = runnable;
        this.c = settableFuture;
        this.d = agjsVar;
        this.e = j;
        this.f = timeUnit;
        this.g = agthVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final Runnable runnable = this.b;
        final SettableFuture settableFuture = this.c;
        final agjs agjsVar = this.d;
        final long j = this.e;
        final TimeUnit timeUnit = this.f;
        this.g.execute(new Runnable() { // from class: agjq
            @Override // java.lang.Runnable
            public final void run() {
                long j2 = j;
                agjr agjrVar = agjr.this;
                Runnable runnable2 = runnable;
                SettableFuture settableFuture2 = settableFuture;
                agjs agjsVar2 = agjsVar;
                TimeUnit timeUnit2 = timeUnit;
                try {
                    runnable2.run();
                    if (!settableFuture2.isDone()) {
                        anem schedule = agjrVar.g.a.schedule(agjrVar.a, j2, timeUnit2);
                        agjsVar2.a = schedule;
                        if (agjsVar2.isDone()) {
                            schedule.cancel(false);
                        }
                    }
                } catch (Throwable th) {
                    settableFuture2.setException(th);
                }
            }
        });
    }
}
