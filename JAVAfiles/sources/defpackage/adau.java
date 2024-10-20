package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adau implements adri {
    private final anen a;
    private final adri b;
    private final aduw c;
    private final adba d;
    private final armf e;

    public adau(aduw aduwVar, anen anenVar, adba adbaVar, adri adriVar, armf armfVar) {
        this.c = aduwVar;
        this.a = anenVar;
        this.d = adbaVar;
        this.b = adriVar;
        this.e = armfVar;
    }

    private final void g(ListenableFuture listenableFuture) {
        albo.bR(listenableFuture, new pum(11), this.a);
    }

    private final void h(adrt adrtVar) {
        adxq adxqVar = new adxq(null, null, null);
        adxqVar.h(adrtVar);
        g(a(adxqVar.f()));
    }

    private final void i(adrv adrvVar) {
        adxq adxqVar = new adxq(null, null, null);
        adxqVar.h(adrvVar);
        g(a(adxqVar.f()));
    }

    public final ListenableFuture a(adcc adccVar) {
        return this.d.a(adccVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        if (r5.F == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r4.c.l("enable_chat_api_for_groups", false, "BuglePhenotypeFlagsRelay") == false) goto L9;
     */
    @Override // defpackage.adri
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(defpackage.adrc r5) {
        /*
            r4 = this;
            armf r0 = r4.e
            java.lang.Object r0 = r0.b()
            acya r0 = (defpackage.acya) r0
            boolean r0 = r0.a()
            if (r0 != 0) goto L2e
            aduw r0 = r4.c
            boolean r0 = r0.d()
            if (r0 == 0) goto L28
            aduw r0 = r4.c
            java.lang.String r1 = "enable_chat_api_for_groups"
            java.lang.String r2 = "BuglePhenotypeFlagsRelay"
            r3 = 0
            boolean r0 = r0.l(r1, r3, r2)     // Catch: defpackage.adux -> L23
            if (r0 != 0) goto L2e
        L23:
            boolean r0 = r5.F
            if (r0 != 0) goto L28
            goto L2e
        L28:
            adri r0 = r4.b
            r0.b(r5)
            return
        L2e:
            adrv r5 = (defpackage.adrv) r5
            r4.i(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adau.b(adrc):void");
    }

    @Override // defpackage.adri
    public final void c(adrc adrcVar) {
        if (!((acya) this.e.b()).a() && !this.c.d()) {
            this.b.c(adrcVar);
        } else {
            h((adrt) adrcVar);
        }
    }

    @Override // defpackage.adri
    public final void d(adrc adrcVar) {
        if (!((acya) this.e.b()).a() && !this.c.d()) {
            this.b.d(adrcVar);
        } else {
            h((adrt) adrcVar);
        }
    }

    @Override // defpackage.adri
    public final void e(adrc adrcVar) {
        if (!((acya) this.e.b()).a() && !this.c.d()) {
            this.b.e(adrcVar);
        } else {
            i((adrv) adrcVar);
        }
    }

    @Override // defpackage.adri
    public final void f(adqu adquVar) {
        if (!((acya) this.e.b()).a() && !this.c.d()) {
            this.b.f(adquVar);
            return;
        }
        adxq adxqVar = new adxq(null, null, null);
        adxqVar.g(adquVar);
        g(a(adxqVar.f()));
    }
}
