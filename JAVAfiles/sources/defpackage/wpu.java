package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wpu {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/shared/satelliteapi/incoming/IncomingSatelliteApiImpl");
    private final wpy b;
    private final rdg c;
    private final wsl d;

    public wpu(rdg rdgVar, wpy wpyVar, wsl wslVar) {
        rdgVar.getClass();
        wslVar.getClass();
        this.c = rdgVar;
        this.b = wpyVar;
        this.d = wslVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.wrn r10, defpackage.arpe r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.wpr
            if (r0 == 0) goto L13
            r0 = r11
            wpr r0 = (defpackage.wpr) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            wpr r0 = new wpr
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            akrh r10 = r0.d
            defpackage.aqil.P(r11)     // Catch: java.lang.Throwable -> L2a
            goto L8e
        L2a:
            r11 = move-exception
            goto Ld1
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L35:
            defpackage.aqil.P(r11)
            alvi r11 = defpackage.wpu.a
            alvw r11 = r11.g()
            alvz r2 = defpackage.alwp.a
            java.lang.String r5 = "BugleEmergencySOS"
            r11.X(r2, r5)
            alvg r11 = (defpackage.alvg) r11
            alvz r2 = defpackage.ydl.S
            wrd r5 = r10.e
            if (r5 != 0) goto L4f
            wrd r5 = defpackage.wrd.a
        L4f:
            java.lang.String r5 = r5.c
            ruz r6 = new ruz
            r6.<init>(r5)
            r11.X(r2, r6)
            java.lang.String r2 = "onReceiveSatelliteMessage"
            r5 = 59
            java.lang.String r6 = "com/google/android/apps/messaging/shared/satelliteapi/incoming/IncomingSatelliteApiImpl"
            java.lang.String r7 = "IncomingSatelliteApiImpl.kt"
            alvw r11 = r11.h(r6, r2, r5, r7)
            alvg r11 = (defpackage.alvg) r11
            java.lang.String r2 = "Calling IncomingSatelliteMessageProcessor"
            r11.q(r2)
            java.lang.String r11 = "IncomingSatelliteMessageProcessor#processIncomingMessage"
            akrh r11 = defpackage.aktp.e(r11)
            wpy r2 = r9.b     // Catch: java.lang.Throwable -> Lcd
            r0.d = r11     // Catch: java.lang.Throwable -> Lcd
            r0.c = r4     // Catch: java.lang.Throwable -> Lcd
            arpi r5 = r2.a     // Catch: java.lang.Throwable -> Lcd
            vpi r6 = new vpi     // Catch: java.lang.Throwable -> Lcd
            r7 = 17
            r6.<init>(r2, r10, r3, r7)     // Catch: java.lang.Throwable -> Lcd
            java.lang.Object r10 = defpackage.arro.q(r5, r6, r0)     // Catch: java.lang.Throwable -> Lcd
            arpl r0 = defpackage.arpl.a     // Catch: java.lang.Throwable -> Lcd
            if (r10 == r0) goto L8b
            arnb r10 = defpackage.arnb.a     // Catch: java.lang.Throwable -> Lcd
        L8b:
            if (r10 == r1) goto Lcc
            r10 = r11
        L8e:
            defpackage.armd.i(r10, r3)
            wro r10 = defpackage.wro.a
            aozy r10 = r10.createBuilder()
            r10.getClass()
            wsa r11 = defpackage.wsa.a
            aozy r11 = r11.createBuilder()
            r11.getClass()
            wrz r0 = defpackage.wrz.SUCCESS
            defpackage.wcm.F(r0, r11)
            wsa r11 = defpackage.wcm.E(r11)
            apag r0 = r10.b
            boolean r0 = r0.isMutable()
            if (r0 != 0) goto Lb7
            r10.u()
        Lb7:
            apag r0 = r10.b
            wro r0 = (defpackage.wro) r0
            r0.c = r11
            int r11 = r0.b
            r11 = r11 | r4
            r0.b = r11
            apag r10 = r10.s()
            r10.getClass()
            wro r10 = (defpackage.wro) r10
            return r10
        Lcc:
            return r1
        Lcd:
            r10 = move-exception
            r8 = r11
            r11 = r10
            r10 = r8
        Ld1:
            throw r11     // Catch: java.lang.Throwable -> Ld2
        Ld2:
            r0 = move-exception
            defpackage.armd.i(r10, r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wpu.a(wrn, arpe):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v18, types: [wrp] */
    /* JADX WARN: Type inference failed for: r0v2, types: [wps, arpe] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [wrp] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v10, types: [wsl] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.wrp r12, defpackage.arpe r13) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wpu.b(wrp, arpe):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Type inference failed for: r9v0, types: [wrr] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v15, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.wrr r9, defpackage.arpe r10) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wpu.c(wrr, arpe):java.lang.Object");
    }
}
