package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Locale;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahqt extends ahqr implements ahmw, ahqm {
    static final alpt a = alpt.v("Cold startup", "Cold startup interactive", "Cold startup interactive before onDraw", "Warm startup", "Warm startup interactive", "Warm startup interactive before onDraw", "Warm startup activity onStart", "Cold startup class loading", "Cold startup from process creation", "Cold startup interactive before onDraw from process creation", "Cold startup interactive from process creation");
    public static final /* synthetic */ int g = 0;
    public final ahmu b;
    final ConcurrentHashMap c = new ConcurrentHashMap();
    public final apwt d;
    public final apwt e;
    public final alhr f;
    private final Executor h;

    public ahqt(ahmv ahmvVar, Executor executor, apwt apwtVar, apwt apwtVar2, armf armfVar, ahmn ahmnVar) {
        this.b = ahmvVar.a(andi.a, apwtVar, armfVar);
        this.h = executor;
        this.d = apwtVar;
        this.e = apwtVar2;
        this.f = albo.D(new ylq(ahmnVar, apwtVar, 14));
    }

    private final ListenableFuture i(String str, long j, ahqq ahqqVar, ashu ashuVar) {
        return albo.bN(new ahqs(this, str, j, ahqqVar, ashuVar, 0), this.h);
    }

    private final synchronized ListenableFuture j(ahqq ahqqVar, String str, ashu ashuVar, ahqp ahqpVar) {
        ListenableFuture bH;
        if (ahqq.e(ahqqVar)) {
            return aneh.a;
        }
        long a2 = this.b.a(str);
        if (a2 != -1) {
            ahqqVar.c();
            ahqqVar.d(ahqpVar);
            if (!ahqq.e(ahqqVar) && !albo.ah(str)) {
                if (a.contains(str)) {
                    bH = albo.bH(new IllegalArgumentException(String.format(Locale.US, "%s is reserved event. Dropping timer.", str)));
                } else {
                    bH = i(str, a2, ahqqVar, ashuVar);
                }
                return bH;
            }
            bH = albo.bH(new IllegalArgumentException("Can't record an event that was never started or has been stopped already"));
            return bH;
        }
        return aneh.a;
    }

    private final synchronized ListenableFuture k(String str, ashu ashuVar, ahqp ahqpVar) {
        String str2;
        ahqq ahqqVar = (ahqq) this.c.remove(str);
        if (ahqq.e(ahqqVar)) {
            ((alvg) ((alvg) ahkh.a.e()).h("com/google/android/libraries/performance/primes/metrics/timer/TimerMetricServiceImpl", "stopGlobal", 308, "TimerMetricServiceImpl.java")).t("Can't stop global event '%s' that was never started or has already been stopped", str);
            return aneh.a;
        }
        long a2 = this.b.a(str);
        if (a2 != -1) {
            ahqqVar.c();
            ahqqVar.d(ahqpVar);
            ((alvg) ((alvg) ahkh.a.e()).h("com/google/android/libraries/performance/primes/metrics/timer/TimerMetricServiceImpl", "stopGlobal", 323, "TimerMetricServiceImpl.java")).J("Stopped global timer for event name %s. realtime: %d ms, uptime: %d ms", str, Long.valueOf(ahqqVar.a()), Long.valueOf(ahqqVar.b()));
            if (true != albo.ah(null)) {
                str2 = null;
            } else {
                str2 = str;
            }
            return i(str2, a2, ahqqVar, ashuVar);
        }
        return aneh.a;
    }

    @Override // defpackage.ahqm
    public final ListenableFuture a(ahka ahkaVar, long j, long j2, ashu ashuVar) {
        return h(ahkaVar.a, new ahqq(j, j2, ahqp.UNKNOWN), ashuVar);
    }

    @Override // defpackage.ahqm
    public final ListenableFuture b(ahka ahkaVar, long j, long j2, ahqp ahqpVar) {
        return h(ahkaVar.a, new ahqq(j, j2, ahqpVar), null);
    }

    @Override // defpackage.ahqr
    public final ahqq c(ahka ahkaVar) {
        ConcurrentHashMap concurrentHashMap = this.c;
        String str = ahkaVar.a;
        ahqq ahqqVar = (ahqq) concurrentHashMap.remove(str);
        if (ahqq.e(ahqqVar)) {
            ((alvg) ((alvg) ahkh.a.e()).h("com/google/android/libraries/performance/primes/metrics/timer/TimerMetricServiceImpl", "cancelGlobal", 388, "TimerMetricServiceImpl.java")).t("Can't cancel global event '%s' that was never started or has already been stopped", str);
            return ahqq.a;
        }
        ((alvg) ((alvg) ahkh.a.e()).h("com/google/android/libraries/performance/primes/metrics/timer/TimerMetricServiceImpl", "cancelGlobal", 393, "TimerMetricServiceImpl.java")).t("Cancelled global timer for event name %s", str);
        return ahqqVar;
    }

    @Override // defpackage.ahqr
    public final ahqq d() {
        if (!this.b.d()) {
            return ahqq.a;
        }
        return new ahqq();
    }

    @Override // defpackage.ahqr
    public final ahqq e(ahka ahkaVar) {
        alpt alptVar = a;
        String str = ahkaVar.a;
        if (alptVar.contains(str)) {
            ((alvg) ((alvg) ahkh.a.i()).h("com/google/android/libraries/performance/primes/metrics/timer/TimerMetricServiceImpl", "startGlobal", 133, "TimerMetricServiceImpl.java")).t("%s is reserved event. Dropping timer.", str);
            return ahqq.a;
        }
        if (!this.b.d()) {
            return ahqq.a;
        }
        ahqq ahqqVar = new ahqq();
        this.c.put(str, ahqqVar);
        return ahqqVar;
    }

    @Override // defpackage.ahqr
    public final ListenableFuture f(ahqq ahqqVar, ahka ahkaVar, ashu ashuVar, ahqp ahqpVar) {
        return j(ahqqVar, ahkaVar.a, ashuVar, ahqpVar);
    }

    @Override // defpackage.ahqr
    public final ListenableFuture g(ahka ahkaVar, ashu ashuVar, ahqp ahqpVar) {
        return k(ahkaVar.a, ashuVar, ahqpVar);
    }

    final ListenableFuture h(String str, ahqq ahqqVar, ashu ashuVar) {
        long a2 = this.b.a(str);
        if (a2 == -1) {
            return aneh.a;
        }
        return i(str, a2, ahqqVar, ashuVar);
    }

    @Override // defpackage.ahmw
    public final /* synthetic */ void as() {
    }
}
