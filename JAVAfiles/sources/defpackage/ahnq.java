package defpackage;

import android.app.Activity;
import android.os.Bundle;
import com.android.vcard.VCardConfig;
import com.google.android.libraries.performance.primes.metrics.crash.NativeCrashHandlerImpl;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahnq extends ahnn implements ahmw, ahlo, ahlj {
    public volatile ahka a;
    public final apwt b;
    public final armf d;
    public final armf e;
    public final ahrk f;
    public final atsg g;
    private final Executor i;
    private final ahmu j;
    private final algw k;
    private final ahlp l;
    private final ahlm m;
    private final armf r;
    private final ahmn s;
    private final AtomicBoolean h = new AtomicBoolean();
    private final AtomicInteger n = new AtomicInteger();
    private final AtomicInteger o = new AtomicInteger();
    private final AtomicInteger p = new AtomicInteger();
    private final AtomicBoolean q = new AtomicBoolean(false);
    public final AtomicBoolean c = new AtomicBoolean(false);

    public ahnq(ahmv ahmvVar, Executor executor, apwt apwtVar, algw algwVar, ahlp ahlpVar, ahlm ahlmVar, ahmn ahmnVar, armf armfVar, armf armfVar2, armf armfVar3, atsg atsgVar, ahrk ahrkVar) {
        this.b = apwtVar;
        this.k = algwVar;
        this.l = ahlpVar;
        this.m = ahlmVar;
        this.s = ahmnVar;
        this.j = ahmvVar.a(andi.a, apwtVar, null);
        this.i = executor;
        this.r = armfVar;
        this.d = armfVar2;
        this.e = armfVar3;
        this.g = atsgVar;
        this.f = ahrkVar;
    }

    private final void p(int i, AtomicInteger atomicInteger) {
        atomicInteger.getAndIncrement();
        albo.bN(new ahno(this, atomicInteger, i, 0), this.i);
    }

    @Override // defpackage.ahlo
    public final void a(Activity activity, Bundle bundle) {
        ((alvg) ((alvg) ahkh.a.d()).h("com/google/android/libraries/performance/primes/metrics/crash/CrashMetricServiceImpl", "onActivityCreated", 416, "CrashMetricServiceImpl.java")).q("onActivityCreated");
        if (!this.q.getAndSet(true)) {
            p(4, this.o);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [armf, java.lang.Object] */
    @Override // defpackage.ahmw
    public final void as() {
        ((NativeCrashHandlerImpl) ((alha) this.k).a.b()).a(this);
        this.l.a(this);
        this.m.a(this);
        p(3, this.n);
        albo.bN(new aarj(this, 6), this.i);
    }

    @Override // defpackage.ahlo
    public final void d(Activity activity) {
        albo.bN(new aarj(this, 7), this.i);
    }

    @Override // defpackage.ahlo
    public final void f(Activity activity) {
        this.a = ahka.b(activity.getClass());
    }

    @Override // defpackage.ahlj
    public final void i(ahka ahkaVar) {
        this.a = null;
    }

    @Override // defpackage.ahnn
    public final void k() {
        if (this.h.compareAndSet(false, true)) {
            Thread.setDefaultUncaughtExceptionHandler(new ahnp(this, Thread.getDefaultUncaughtExceptionHandler()));
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(25:3|(24:5|26|14|(4:132|133|134|(1:136))|16|(6:18|(3:20|(1:22)|23)(2:69|(3:71|(1:73)|74)(5:75|(2:77|(4:79|(1:81)|82|(3:84|(1:86)|87)(4:88|(4:90|(1:92)|93|(6:94|95|96|97|99|100))(0)|117|(3:119|(1:121)|122)(3:123|(1:125)|126))))|127|(1:129)|130))|24|(1:26)|27|(18:31|32|33|(1:35)(1:65)|36|(1:38)|39|41|(2:44|42)|45|46|(1:50)|51|(2:54|52)|55|(2:58|56)|59|(2:61|62)(1:64)))(1:131)|68|32|33|(0)(0)|36|(0)|39|41|(1:42)|45|46|(2:48|50)|51|(1:52)|55|(1:56)|59|(0)(0))(1:146)|13|14|(0)|16|(0)(0)|68|32|33|(0)(0)|36|(0)|39|41|(1:42)|45|46|(0)|51|(1:52)|55|(1:56)|59|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x02ce, code lost:
    
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0057 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0270 A[Catch: InterruptedException -> 0x02ce, all -> 0x02d5, TryCatch #7 {InterruptedException -> 0x02ce, all -> 0x02d5, blocks: (B:33:0x026a, B:35:0x0270, B:36:0x0285, B:38:0x029a, B:39:0x029d, B:65:0x027b), top: B:32:0x026a }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x029a A[Catch: InterruptedException -> 0x02ce, all -> 0x02d5, TryCatch #7 {InterruptedException -> 0x02ce, all -> 0x02d5, blocks: (B:33:0x026a, B:35:0x0270, B:36:0x0285, B:38:0x029a, B:39:0x029d, B:65:0x027b), top: B:32:0x026a }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02dd A[LOOP:0: B:42:0x02d5->B:44:0x02dd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0317 A[LOOP:1: B:52:0x02fd->B:54:0x0317, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x030d A[LOOP:2: B:56:0x0305->B:58:0x030d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x027b A[Catch: InterruptedException -> 0x02ce, all -> 0x02d5, TryCatch #7 {InterruptedException -> 0x02ce, all -> 0x02d5, blocks: (B:33:0x026a, B:35:0x0270, B:36:0x0285, B:38:0x029a, B:39:0x029d, B:65:0x027b), top: B:32:0x026a }] */
    /* JADX WARN: Type inference failed for: r0v44, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v13, types: [alhr, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(defpackage.asjg r26) {
        /*
            Method dump skipped, instructions count: 796
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahnq.l(asjg):void");
    }

    public final boolean m() {
        return ((ahnk) this.e.b()).b;
    }

    public final ListenableFuture n(int i, ahni ahniVar) {
        return o(i, ahniVar, ahniVar.a / 100.0f);
    }

    public final ListenableFuture o(int i, ahni ahniVar, float f) {
        if (!ahniVar.b()) {
            return aneh.a;
        }
        if (!this.s.a(f).a()) {
            return aneh.a;
        }
        ahmu ahmuVar = this.j;
        ahmq a = ahmr.a();
        aozy createBuilder = asjt.a.createBuilder();
        aozy createBuilder2 = asjr.a.createBuilder();
        float f2 = 1.0f / f;
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        int i2 = (int) f2;
        apag apagVar = createBuilder2.b;
        asjr asjrVar = (asjr) apagVar;
        asjrVar.b |= 2;
        asjrVar.d = i2;
        if (!apagVar.isMutable()) {
            createBuilder2.u();
        }
        asjr asjrVar2 = (asjr) createBuilder2.b;
        asjrVar2.c = i - 1;
        asjrVar2.b |= 1;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        asjt asjtVar = (asjt) createBuilder.b;
        asjr asjrVar3 = (asjr) createBuilder2.s();
        asjrVar3.getClass();
        asjtVar.w = asjrVar3;
        asjtVar.b |= VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        a.e((asjt) createBuilder.s());
        return ahmuVar.b(a.a());
    }

    @Override // defpackage.ahlo
    public final /* synthetic */ void b(Activity activity) {
    }

    @Override // defpackage.ahlo
    public final /* synthetic */ void c(Activity activity) {
    }

    @Override // defpackage.ahlo
    public final /* synthetic */ void g(Activity activity) {
    }

    @Override // defpackage.ahlo
    public final /* synthetic */ void h(int i) {
    }

    @Override // defpackage.ahlj
    public final /* synthetic */ void j(ahka ahkaVar) {
    }

    @Override // defpackage.ahlo
    public final /* synthetic */ void e(Activity activity, Bundle bundle) {
    }
}
