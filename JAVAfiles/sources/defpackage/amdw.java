package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amdw extends ance {
    public static final Logger a = Logger.getLogger(amdw.class.getCanonicalName());
    public static final Object b = new Object();
    static final amdv c = new xdp(2);
    public final alhr d;
    public final amdr e;
    public final algy f;
    public final alhp g;
    public final aneo h;
    public final amdv i;
    private final Executor n;
    public volatile int j = 0;
    private final AtomicReference o = new AtomicReference(albo.bI(new Object()));

    public amdw(alhr alhrVar, amdr amdrVar, algy algyVar, Executor executor, ScheduledExecutorService scheduledExecutorService, alhz alhzVar, amdv amdvVar) {
        this.d = alhrVar;
        this.e = amdrVar;
        this.f = algyVar;
        this.n = new ajzt(this, executor, 3);
        this.h = albo.bC(scheduledExecutorService);
        this.i = amdvVar;
        this.g = alhp.b(alhzVar);
        d(0L, TimeUnit.MILLISECONDS);
        c(new akwm(amdvVar, 6, null), executor);
    }

    public final void d(long j, TimeUnit timeUnit) {
        AtomicReference atomicReference = this.o;
        SettableFuture create = SettableFuture.create();
        ListenableFuture listenableFuture = (ListenableFuture) atomicReference.getAndSet(create);
        if (j != 0) {
            listenableFuture = ancj.g(listenableFuture, new woq(this, j, timeUnit, 4), andi.a);
        }
        ListenableFuture g = ancj.g(listenableFuture, new akoq(this, 4), this.n);
        create.m(ancd.g(g, Exception.class, new akoz(this, g, 5), this.n));
        create.c(new amds(this, create), andi.a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ance
    public final String gs() {
        String bW;
        ListenableFuture listenableFuture = (ListenableFuture) this.o.get();
        String obj = listenableFuture.toString();
        amdr amdrVar = this.e;
        algy algyVar = this.f;
        String obj2 = this.d.toString();
        String obj3 = algyVar.toString();
        String obj4 = amdrVar.toString();
        int i = this.j;
        if (listenableFuture.isDone()) {
            bW = "";
        } else {
            bW = a.bW(obj, ", activeTry=[", "]");
        }
        return "futureSupplier=[" + obj2 + "], shouldContinue=[" + obj3 + "], strategy=[" + obj4 + "], tries=[" + i + "]" + bW;
    }

    @Override // defpackage.ance
    protected final void gt() {
        ListenableFuture listenableFuture = (ListenableFuture) this.o.getAndSet(albo.bG());
        if (listenableFuture != null) {
            boolean z = true;
            if (isCancelled() && !n()) {
                z = false;
            }
            listenableFuture.cancel(z);
        }
    }
}
