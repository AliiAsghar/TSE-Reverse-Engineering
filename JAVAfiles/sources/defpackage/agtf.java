package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agtf implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ SettableFuture b;
    final /* synthetic */ agtg c;
    final /* synthetic */ long d;
    final /* synthetic */ TimeUnit e;
    final /* synthetic */ agth f;

    public agtf(agth agthVar, Runnable runnable, SettableFuture settableFuture, agtg agtgVar, long j, TimeUnit timeUnit) {
        this.a = runnable;
        this.b = settableFuture;
        this.c = agtgVar;
        this.d = j;
        this.e = timeUnit;
        this.f = agthVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final Runnable runnable = this.a;
        final SettableFuture settableFuture = this.b;
        final agtg agtgVar = this.c;
        final long j = this.d;
        final TimeUnit timeUnit = this.e;
        this.f.execute(new Runnable() { // from class: agte
            @Override // java.lang.Runnable
            public final void run() {
                agtf agtfVar = agtf.this;
                long j2 = j;
                Runnable runnable2 = runnable;
                SettableFuture settableFuture2 = settableFuture;
                agtg agtgVar2 = agtgVar;
                TimeUnit timeUnit2 = timeUnit;
                try {
                    runnable2.run();
                    if (!settableFuture2.isDone()) {
                        anem schedule = agtfVar.f.a.schedule(agtfVar, j2, timeUnit2);
                        agtgVar2.a = schedule;
                        if (agtgVar2.isDone()) {
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
