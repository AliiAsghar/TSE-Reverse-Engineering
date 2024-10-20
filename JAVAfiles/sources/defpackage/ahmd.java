package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahmd extends ahmc implements ahlo, ahlj, ahmw {
    final AtomicBoolean a = new AtomicBoolean();
    private final Context b;
    private final ahlp c;
    private final Executor d;
    private final ahmn e;
    private final armf f;
    private final ahmu g;
    private final AtomicBoolean h;
    private final ahlm i;

    /* JADX WARN: Multi-variable type inference failed */
    public ahmd(ahmv ahmvVar, Context context, ahlp ahlpVar, ahlm ahlmVar, aneo aneoVar, apwt<ahma> apwtVar, ahmn ahmnVar, armf<ahoq> armfVar, armf<asja> armfVar2, Executor executor) {
        new ConcurrentHashMap();
        this.h = new AtomicBoolean(false);
        this.i = ahlmVar;
        this.g = ahmvVar.a(executor, apwtVar, armfVar2);
        this.b = context;
        this.c = ahlpVar;
        this.d = Build.VERSION.SDK_INT < 31 ? executor : aneoVar;
        this.e = ahmnVar;
        this.f = armfVar;
    }

    private final ListenableFuture at(ashd ashdVar) {
        return albo.bN(new xpx(this, ashdVar, 11), this.d);
    }

    @Override // defpackage.ahlo
    public void a(Activity activity, Bundle bundle) {
        if (!this.h.getAndSet(true)) {
            j(null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x0391, code lost:
    
        if ((r6 / r12) <= 3.472222222222222E-5d) goto L171;
     */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0675  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0678  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0096 A[Catch: all -> 0x0698, TryCatch #2 {, blocks: (B:9:0x0014, B:14:0x004a, B:17:0x004e, B:21:0x0054, B:22:0x008f, B:25:0x011d, B:234:0x0096, B:236:0x009c, B:238:0x00a4, B:240:0x00a9, B:242:0x00af, B:243:0x00b1, B:245:0x00b8, B:246:0x00c1, B:248:0x00c7, B:249:0x00d0, B:251:0x00d6, B:252:0x00df, B:254:0x00e5, B:255:0x00ee, B:257:0x00f4, B:258:0x00f9, B:260:0x00fd, B:262:0x0101, B:264:0x0108, B:266:0x010e, B:267:0x0119, B:279:0x005f, B:280:0x0073, B:282:0x0033), top: B:8:0x0014, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0093  */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, aegu] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, aegu] */
    /* JADX WARN: Type inference failed for: r0v47, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [armf, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ com.google.common.util.concurrent.ListenableFuture ap(defpackage.ashd r19, defpackage.ahka r20) {
        /*
            Method dump skipped, instructions count: 1691
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahmd.ap(ashd, ahka):com.google.common.util.concurrent.ListenableFuture");
    }

    public ListenableFuture<Void> aq() {
        if (!agqa.e(this.b)) {
            return aneh.a;
        }
        try {
            albo.T(this.a.getAndSet(false));
            return at(ashd.FOREGROUND_TO_BACKGROUND);
        } catch (Exception e) {
            return albo.bH(e);
        }
    }

    public ListenableFuture<Void> ar() {
        if (!agqa.e(this.b)) {
            return aneh.a;
        }
        if (this.a.getAndSet(true)) {
            ((alvg) ((alvg) ahkh.a.i()).h("com/google/android/libraries/performance/primes/metrics/battery/BatteryMetricServiceImpl", "onAppToForeground", 141, "BatteryMetricServiceImpl.java")).q("App is already in the foreground.");
            return albo.bG();
        }
        return at(ashd.BACKGROUND_TO_FOREGROUND);
    }

    @Override // defpackage.ahmw
    public void as() {
        this.i.a(this);
        this.c.a(this);
    }

    @Override // defpackage.ahlj
    public void i(ahka ahkaVar) {
        aq();
    }

    @Override // defpackage.ahlj
    public void j(ahka ahkaVar) {
        if (!this.a.get()) {
            ar();
        }
    }

    @Override // defpackage.ahlo
    public /* synthetic */ void b(Activity activity) {
    }

    @Override // defpackage.ahlo
    public /* synthetic */ void c(Activity activity) {
    }

    @Override // defpackage.ahlo
    public /* synthetic */ void d(Activity activity) {
    }

    @Override // defpackage.ahlo
    public /* synthetic */ void f(Activity activity) {
    }

    @Override // defpackage.ahlo
    public /* synthetic */ void g(Activity activity) {
    }

    @Override // defpackage.ahlo
    public /* synthetic */ void h(int i) {
    }

    @Override // defpackage.ahlo
    public /* synthetic */ void e(Activity activity, Bundle bundle) {
    }
}
