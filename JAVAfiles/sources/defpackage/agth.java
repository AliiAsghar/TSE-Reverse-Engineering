package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agth extends andx implements aneo {
    public static final /* synthetic */ int b = 0;
    public final aneo a;
    private final anen c;
    private final /* synthetic */ int d;

    public agth(anen anenVar, aneo aneoVar, int i) {
        this.d = i;
        this.c = anenVar;
        this.a = aneoVar;
    }

    @Override // defpackage.andx
    protected final anen d() {
        if (this.d != 0) {
            return this.c;
        }
        return this.c;
    }

    @Override // defpackage.andx, defpackage.andt
    protected final /* synthetic */ ExecutorService f() {
        if (this.d != 0) {
            return this.c;
        }
        return this.c;
    }

    @Override // defpackage.aneo
    /* renamed from: g */
    public final anem schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        byte[] bArr = null;
        if (this.d != 0) {
            anel anelVar = new anel(runnable);
            if (j <= 0) {
                return new agjt(this.c.submit(runnable), System.nanoTime());
            }
            return new agjs(anelVar, this.a.schedule(new adhc(this, anelVar, 7, bArr), j, timeUnit));
        }
        anel anelVar2 = new anel(runnable);
        return new agtg(anelVar2, this.a.schedule(new adhc(this, anelVar2, 16, bArr), j, timeUnit));
    }

    @Override // defpackage.alna
    protected final /* synthetic */ Object gV() {
        if (this.d != 0) {
            return this.c;
        }
        return this.c;
    }

    @Override // defpackage.aneo
    /* renamed from: h */
    public final anem schedule(Callable callable, long j, TimeUnit timeUnit) {
        byte[] bArr = null;
        if (this.d != 0) {
            if (j <= 0) {
                return new agjt(this.c.submit(callable), System.nanoTime());
            }
            anel anelVar = new anel(callable);
            return new agjs(anelVar, this.a.schedule(new adhc(this, anelVar, 8, bArr), j, timeUnit));
        }
        anel anelVar2 = new anel(callable);
        return new agtg(anelVar2, this.a.schedule(new adhc(this, anelVar2, 17, bArr), j, timeUnit));
    }

    @Override // defpackage.aneo
    /* renamed from: i */
    public final anem scheduleAtFixedRate(final Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        if (this.d != 0) {
            final anew anewVar = new anew(this);
            final SettableFuture create = SettableFuture.create();
            return new agjs(create, this.a.scheduleAtFixedRate(new Runnable() { // from class: agjp
                @Override // java.lang.Runnable
                public final void run() {
                    final Runnable runnable2 = runnable;
                    final SettableFuture settableFuture = create;
                    anewVar.execute(new Runnable() { // from class: agjo
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i = agth.b;
                            try {
                                runnable2.run();
                            } catch (Throwable th) {
                                settableFuture.setException(th);
                            }
                        }
                    });
                }
            }, j, j2, timeUnit));
        }
        final Executor b2 = agtj.b(this);
        final SettableFuture create2 = SettableFuture.create();
        return new agtg(create2, this.a.scheduleAtFixedRate(new Runnable() { // from class: agtd
            @Override // java.lang.Runnable
            public final void run() {
                final Runnable runnable2 = runnable;
                final SettableFuture settableFuture = create2;
                b2.execute(new Runnable() { // from class: agtc
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i = agth.b;
                        try {
                            runnable2.run();
                        } catch (Throwable th) {
                            settableFuture.setException(th);
                        }
                    }
                });
            }
        }, j, j2, timeUnit));
    }

    @Override // defpackage.aneo
    /* renamed from: j */
    public final anem scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        if (this.d != 0) {
            SettableFuture create = SettableFuture.create();
            agjs agjsVar = new agjs(create, null);
            agjsVar.a = this.a.schedule(new agjr(this, runnable, create, agjsVar, j2, timeUnit), j, timeUnit);
            return agjsVar;
        }
        SettableFuture create2 = SettableFuture.create();
        agtg agtgVar = new agtg(create2, null);
        agtgVar.a = this.a.schedule(new agtf(this, runnable, create2, agtgVar, j2, timeUnit), j, timeUnit);
        return agtgVar;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.d != 0 ? schedule(runnable, j, timeUnit) : schedule(runnable, j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        if (this.d != 0) {
            return scheduleAtFixedRate(runnable, j, j2, timeUnit);
        }
        return scheduleAtFixedRate(runnable, j, j2, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        if (this.d != 0) {
            return scheduleWithFixedDelay(runnable, j, j2, timeUnit);
        }
        return scheduleWithFixedDelay(runnable, j, j2, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* synthetic */ ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        return this.d != 0 ? schedule(callable, j, timeUnit) : schedule(callable, j, timeUnit);
    }
}
