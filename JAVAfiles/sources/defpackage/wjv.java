package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wjv {
    public static final alwo a = alwo.p();
    public static final alvi b = alvi.m("com/google/android/apps/messaging/shared/rcsprovisioning/RcsProvisioningSchedulerMediatorImpl");
    public final arwe c;
    public final armf d;
    public final armf e;
    public final adwu f;
    public final okr g;
    public final okw h;
    public final pmm i;
    private final lta j;
    private final armf k;

    public wjv(arwe arweVar, armf armfVar, armf armfVar2, adwu adwuVar, okr okrVar, lta ltaVar, okw okwVar, armf armfVar3, pmm pmmVar) {
        arweVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        adwuVar.getClass();
        okrVar.getClass();
        ltaVar.getClass();
        okwVar.getClass();
        armfVar3.getClass();
        this.c = arweVar;
        this.d = armfVar;
        this.e = armfVar2;
        this.f = adwuVar;
        this.g = okrVar;
        this.j = ltaVar;
        this.h = okwVar;
        this.k = armfVar3;
        this.i = pmmVar;
    }

    public final Object a(int i, aphg aphgVar, arpe arpeVar) {
        ((alwl) a.g()).r("[SR]: Single Registration is enabled. Setting up vendor ims for subId: %s", i);
        akul a2 = this.j.a(i, aphgVar);
        a2.getClass();
        Object F = arro.F(a2, arpeVar);
        if (F == arpl.a) {
            return F;
        }
        return arnb.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00c2, code lost:
    
        if (r2.c(r8, r6, r7, r0) != r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.aphg r6, defpackage.amww r7, defpackage.arpe r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.wjs
            if (r0 == 0) goto L13
            r0 = r8
            wjs r0 = (defpackage.wjs) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            wjs r0 = new wjs
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            defpackage.aqil.P(r8)
            goto Lc5
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            amww r7 = r0.f
            aphg r6 = r0.e
            wjv r2 = r0.d
            defpackage.aqil.P(r8)
            goto Lb3
        L3e:
            defpackage.aqil.P(r8)
            alwo r8 = defpackage.wjv.a
            alvw r8 = r8.g()
            alwl r8 = (defpackage.alwl) r8
            java.lang.String r2 = "scheduleProvisioningForAllEligibleSims: operationTrigger: %s bugle trigger event: %s"
            r8.D(r2, r6, r7)
            okw r8 = r5.h
            boolean r8 = r8.a()
            if (r8 == 0) goto La2
            armf r8 = r5.d
            java.lang.Object r8 = r8.b()
            wwn r8 = (defpackage.wwn) r8
            java.util.Set r8 = r8.n()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r8 = r8.iterator()
        L6b:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L8a
            java.lang.Object r1 = r8.next()
            r2 = r1
            adiv r2 = (defpackage.adiv) r2
            armf r3 = r5.k
            java.lang.Object r3 = r3.b()
            wpp r3 = (defpackage.wpp) r3
            int r2 = r3.C(r2)
            if (r2 != r4) goto L6b
            r0.add(r1)
            goto L6b
        L8a:
            java.util.Set r8 = defpackage.aqjn.aE(r0)
            java.util.Iterator r8 = r8.iterator()
        L92:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto Lc5
            java.lang.Object r0 = r8.next()
            adiv r0 = (defpackage.adiv) r0
            r5.f(r0, r6, r7)
            goto L92
        La2:
            wwm r8 = defpackage.wwm.a
            r0.d = r5
            r0.e = r6
            r0.f = r7
            r0.c = r4
            java.lang.Object r8 = r5.c(r8, r6, r7, r0)
            if (r8 == r1) goto Lc8
            r2 = r5
        Lb3:
            wwm r8 = defpackage.wwm.b
            r4 = 0
            r0.d = r4
            r0.e = r4
            r0.f = r4
            r0.c = r3
            java.lang.Object r6 = r2.c(r8, r6, r7, r0)
            if (r6 != r1) goto Lc5
            goto Lc8
        Lc5:
            arnb r6 = defpackage.arnb.a
            return r6
        Lc8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wjv.b(aphg, amww, arpe):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0086, code lost:
    
        if (r2.d(r9, r7, r8, r0) == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.wwm r6, defpackage.aphg r7, defpackage.amww r8, defpackage.arpe r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof defpackage.wjt
            if (r0 == 0) goto L13
            r0 = r9
            wjt r0 = (defpackage.wjt) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            wjt r0 = new wjt
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.aqil.P(r9)
            goto L89
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            amww r8 = r0.g
            aphg r7 = r0.f
            wwm r6 = r0.e
            wjv r2 = r0.d
            defpackage.aqil.P(r9)
            goto L67
        L3e:
            defpackage.aqil.P(r9)
            alwo r9 = defpackage.wjv.a
            alvw r9 = r9.g()
            alwl r9 = (defpackage.alwl) r9
            java.lang.String r2 = "scheduleProvisioningForDefaultSimIfEligible: defaultSimType: %s operationTrigger: %s bugle trigger event: %s"
            r9.J(r2, r6, r7, r8)
            armf r9 = r5.d
            java.lang.Object r9 = r9.b()
            wwn r9 = (defpackage.wwn) r9
            r0.d = r5
            r0.e = r6
            r0.f = r7
            r0.g = r8
            r0.c = r4
            java.lang.Object r9 = r9.l(r6, r0)
            if (r9 == r1) goto La8
            r2 = r5
        L67:
            wxb r9 = (defpackage.wxb) r9
            if (r9 == 0) goto L8c
            java.lang.String r4 = r9.c
            r4.getClass()
            int r4 = r4.length()
            if (r4 != 0) goto L77
            goto L8c
        L77:
            r6 = 0
            r0.d = r6
            r0.e = r6
            r0.f = r6
            r0.g = r6
            r0.c = r3
            java.lang.Object r6 = r2.d(r9, r7, r8, r0)
            if (r6 != r1) goto L89
            goto La8
        L89:
            arnb r6 = defpackage.arnb.a
            return r6
        L8c:
            alvi r7 = defpackage.wjv.b
            alvw r7 = r7.g()
            java.lang.String r8 = "scheduleProvisioningForDefaultSimIfEligible"
            r9 = 204(0xcc, float:2.86E-43)
            java.lang.String r0 = "com/google/android/apps/messaging/shared/rcsprovisioning/RcsProvisioningSchedulerMediatorImpl"
            java.lang.String r1 = "RcsProvisioningSchedulerMediatorImpl.kt"
            alvw r7 = r7.h(r0, r8, r9, r1)
            alvg r7 = (defpackage.alvg) r7
            java.lang.String r8 = "No SimSubscriptionInfo for default sim type: %s"
            r7.t(r8, r6)
            arnb r6 = defpackage.arnb.a
            return r6
        La8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wjv.c(wwm, aphg, amww, arpe):java.lang.Object");
    }

    public final Object d(wxb wxbVar, aphg aphgVar, amww amwwVar, arpe arpeVar) {
        Object a2;
        String str = wxbVar.c;
        str.getClass();
        adwu adwuVar = this.f;
        int i = wxbVar.d;
        adwl a3 = adwuVar.a(i);
        a3.getClass();
        int ordinal = a3.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                ((alwl) a.i()).t("RcsProvisioningTrigger: Provisioning Engine version is unknown due to temporary Telephony platform unavailability. %s", a3.name());
            } else {
                ((alwl) a.g()).t("RcsProvisioningTrigger: DR is active, initializing DR provisioning. %s", a3.name());
                ((wjr) this.e.b()).j(str, amwwVar);
            }
            a2 = arnb.a;
        } else {
            ((alwl) a.g()).t("RcsProvisioningTrigger: Single Registration Provisioning Engine is active, initializing SR provisioning. %s", a3.name());
            a2 = a(i, aphgVar, arpeVar);
            if (a2 != arpl.a) {
                a2 = arnb.a;
            }
        }
        if (a2 == arpl.a) {
            return a2;
        }
        return arnb.a;
    }

    public final void e(aphg aphgVar, amww amwwVar) {
        aphgVar.getClass();
        amwwVar.getClass();
        qjh.l(this.c, null, new wiu(aphgVar, amwwVar, this, (arpe) null, 3), 3);
    }

    public final void f(adiv adivVar, aphg aphgVar, amww amwwVar) {
        adivVar.getClass();
        aphgVar.getClass();
        amwwVar.getClass();
        qjh.l(this.c, null, new wju(this, adivVar, aphgVar, amwwVar, (arpe) null, 0), 3);
    }
}
