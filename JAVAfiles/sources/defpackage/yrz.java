package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yrz implements yoz {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/util/spam/strangerdanger/StrangerDangerSpamProtection");
    public static final uuf b;
    private final armf c;
    private final armf d;
    private final armf e;
    private final arpi f;

    static {
        ahtn ahtnVar = uuh.b;
        aozy createBuilder = aplf.a.createBuilder();
        createBuilder.bf(30);
        createBuilder.bf(30);
        createBuilder.bf(30);
        b = uuh.u(ahtnVar, "stranger_danger_recheck_delay_array_seconds", createBuilder.s(), new mdd(12));
    }

    public yrz(armf armfVar, armf armfVar2, armf armfVar3, arpi arpiVar) {
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        arpiVar.getClass();
        this.c = armfVar;
        this.d = armfVar2;
        this.e = armfVar3;
        this.f = arpiVar;
    }

    @Override // defpackage.yoz
    public final ypi a() {
        return ypi.f;
    }

    @Override // defpackage.yoz
    public final akrh b() {
        return aktp.e("StrangerDangerSpamProtection.classify");
    }

    @Override // defpackage.yoz
    public final akrh c() {
        return aktp.e("StrangerDangerSpamProtection.reclassify");
    }

    @Override // defpackage.yoz
    public final Object d(you youVar, arpe arpeVar) {
        return arro.q(this.f, new yqs(this, youVar, (arpe) null, 7), arpeVar);
    }

    @Override // defpackage.yoz
    public final Object e(you youVar, int i, arpe arpeVar) {
        return arro.q(this.f, new mdi(this, youVar, i, (arpe) null, 12), arpeVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(defpackage.you r11, defpackage.amzf r12, java.lang.Integer r13, defpackage.arpe r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof defpackage.yrw
            if (r0 == 0) goto L13
            r0 = r14
            yrw r0 = (defpackage.yrw) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            yrw r0 = new yrw
            r0.<init>(r10, r14)
        L18:
            r8 = r0
            java.lang.Object r14 = r8.a
            arpl r0 = defpackage.arpl.a
            int r1 = r8.c
            r9 = 1
            if (r1 == 0) goto L30
            if (r1 != r9) goto L28
            defpackage.aqil.P(r14)
            goto L5c
        L28:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L30:
            defpackage.aqil.P(r14)
            armf r14 = r10.d
            java.lang.Object r14 = r14.b()
            r1 = r14
            ypw r1 = (defpackage.ypw) r1
            ypi r3 = defpackage.ypi.f
            if (r13 == 0) goto L45
            int r13 = r13.intValue()
            goto L46
        L45:
            r13 = 0
        L46:
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r13)
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r9)
            r8.c = r9
            r7 = 0
            r2 = r11
            r4 = r12
            java.lang.Object r14 = r1.a(r2, r3, r4, r5, r6, r7, r8)
            if (r14 != r0) goto L5c
            return r0
        L5c:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r11 = r14.booleanValue()
            r11 = r11 ^ r9
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yrz.f(you, amzf, java.lang.Integer, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(defpackage.you r12, java.lang.String r13, int r14, defpackage.arpe r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof defpackage.yry
            if (r0 == 0) goto L13
            r0 = r15
            yry r0 = (defpackage.yry) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            yry r0 = new yry
            r0.<init>(r11, r15)
        L18:
            java.lang.Object r15 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            int r14 = r0.a
            you r12 = r0.f
            yrz r13 = r0.e
            defpackage.aqil.P(r15)     // Catch: java.lang.Throwable -> L2e
            goto L5b
        L2e:
            r15 = move-exception
            goto L81
        L30:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L38:
            defpackage.aqil.P(r15)
            armf r15 = r11.c     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r15 = r15.b()     // Catch: java.lang.Throwable -> L7e
            ysj r15 = (defpackage.ysj) r15     // Catch: java.lang.Throwable -> L7e
            r0.e = r11     // Catch: java.lang.Throwable -> L7e
            r0.f = r12     // Catch: java.lang.Throwable -> L7e
            r0.a = r14     // Catch: java.lang.Throwable -> L7e
            r0.d = r3     // Catch: java.lang.Throwable -> L7e
            arpi r2 = r15.l     // Catch: java.lang.Throwable -> L7e
            lxi r5 = new lxi     // Catch: java.lang.Throwable -> L7e
            r6 = 6
            r5.<init>(r13, r15, r4, r6)     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r15 = defpackage.arro.q(r2, r5, r0)     // Catch: java.lang.Throwable -> L7e
            if (r15 != r1) goto L5a
            return r1
        L5a:
            r13 = r11
        L5b:
            aqho r15 = (defpackage.aqho) r15     // Catch: java.lang.Throwable -> L2e
            if (r15 != 0) goto L60
            goto L7d
        L60:
            java.lang.String r12 = r15.c
            r12.getClass()
            int r12 = r12.length()
            if (r12 <= 0) goto L6d
            java.lang.String r4 = r15.c
        L6d:
            yrv r12 = new yrv
            int r13 = r15.b
            int r13 = defpackage.a.aK(r13)
            if (r13 != 0) goto L78
            goto L79
        L78:
            r3 = r13
        L79:
            r12.<init>(r3, r4)
            r4 = r12
        L7d:
            return r4
        L7e:
            r13 = move-exception
            r15 = r13
            r13 = r11
        L81:
            r10 = r14
            r7 = r15
            armf r13 = r13.e
            java.lang.Object r13 = r13.b()
            r5 = r13
            ypt r5 = (defpackage.ypt) r5
            ypn r12 = r12.e
            ypm r6 = r12.a
            ypi r8 = defpackage.ypi.f
            amzf r9 = defpackage.amzf.RECLASSIFICATION
            r5.b(r6, r7, r8, r9, r10)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yrz.g(you, java.lang.String, int, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(defpackage.you r12, java.lang.String r13, int r14, defpackage.arpe r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof defpackage.yrx
            if (r0 == 0) goto L13
            r0 = r15
            yrx r0 = (defpackage.yrx) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            yrx r0 = new yrx
            r0.<init>(r11, r15)
        L18:
            java.lang.Object r15 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            you r12 = r0.e
            yrz r13 = r0.d
            defpackage.aqil.P(r15)     // Catch: java.lang.Throwable -> L2c
            goto L5d
        L2c:
            r14 = move-exception
            goto L83
        L2e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L36:
            defpackage.aqil.P(r15)
            armf r15 = r11.c     // Catch: java.lang.Throwable -> L80
            java.lang.Object r15 = r15.b()     // Catch: java.lang.Throwable -> L80
            r7 = r15
            ysj r7 = (defpackage.ysj) r7     // Catch: java.lang.Throwable -> L80
            ypn r9 = r12.e     // Catch: java.lang.Throwable -> L80
            r0.d = r11     // Catch: java.lang.Throwable -> L80
            r0.e = r12     // Catch: java.lang.Throwable -> L80
            r0.c = r4     // Catch: java.lang.Throwable -> L80
            arpi r15 = r7.l     // Catch: java.lang.Throwable -> L80
            ysg r2 = new ysg     // Catch: java.lang.Throwable -> L80
            r10 = 0
            r5 = r2
            r6 = r13
            r8 = r14
            r5.<init>(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L80
            java.lang.Object r15 = defpackage.arro.q(r15, r2, r0)     // Catch: java.lang.Throwable -> L80
            if (r15 != r1) goto L5c
            return r1
        L5c:
            r13 = r11
        L5d:
            aqhi r15 = (defpackage.aqhi) r15     // Catch: java.lang.Throwable -> L2c
            if (r15 != 0) goto L62
            goto L7f
        L62:
            java.lang.String r12 = r15.c
            r12.getClass()
            int r12 = r12.length()
            if (r12 <= 0) goto L6f
            java.lang.String r3 = r15.c
        L6f:
            yrv r12 = new yrv
            int r13 = r15.b
            int r13 = defpackage.a.aK(r13)
            if (r13 != 0) goto L7a
            goto L7b
        L7a:
            r4 = r13
        L7b:
            r12.<init>(r4, r3)
            r3 = r12
        L7f:
            return r3
        L80:
            r13 = move-exception
            r14 = r13
            r13 = r11
        L83:
            armf r13 = r13.e
            java.lang.Object r13 = r13.b()
            ypt r13 = (defpackage.ypt) r13
            ypn r12 = r12.e
            ypm r12 = r12.a
            ypi r15 = defpackage.ypi.f
            amzf r0 = defpackage.amzf.MESSAGE_RECEIPT
            defpackage.ypt.d(r13, r12, r14, r15, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yrz.h(you, java.lang.String, int, arpe):java.lang.Object");
    }
}
