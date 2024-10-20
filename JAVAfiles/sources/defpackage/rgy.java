package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rgy {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/datamodel/action/WaitForRcsServiceConnectionAsyncAction");
    public final arwe b;
    private final wfe c;
    private final Optional d;

    public rgy(arwe arweVar, wfe wfeVar, Optional optional) {
        this.b = arweVar;
        this.c = wfeVar;
        this.d = optional;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.arpe r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof defpackage.rgv
            if (r0 == 0) goto L13
            r0 = r14
            rgv r0 = (defpackage.rgv) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            rgv r0 = new rgv
            r0.<init>(r13, r14)
        L18:
            java.lang.Object r14 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            java.lang.String r3 = "WaitForRcsServiceConnectionAsyncAction.kt"
            r4 = 0
            java.lang.String r5 = "execute"
            java.lang.String r6 = "com/google/android/apps/messaging/shared/datamodel/action/WaitForRcsServiceConnectionAsyncAction"
            java.lang.String r7 = "Bugle"
            r8 = 1
            if (r2 == 0) goto L3d
            if (r2 != r8) goto L35
            akrh r0 = r0.d
            defpackage.aqil.P(r14)     // Catch: java.lang.Throwable -> L32 defpackage.arym -> L91
            goto L88
        L32:
            r14 = move-exception
            goto Lb6
        L35:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L3d:
            defpackage.aqil.P(r14)
            java.lang.String r14 = "WaitForRcsServiceConnectionAction.executeAction"
            akrh r14 = defpackage.aktp.e(r14)
            alvi r2 = defpackage.rgy.a     // Catch: java.lang.Throwable -> Lb2
            alvw r2 = r2.f()     // Catch: java.lang.Throwable -> Lb2
            alvz r9 = defpackage.alwp.a     // Catch: java.lang.Throwable -> Lb2
            r2.X(r9, r7)     // Catch: java.lang.Throwable -> Lb2
            r9 = 42
            alvw r2 = r2.h(r6, r5, r9, r3)     // Catch: java.lang.Throwable -> Lb2
            alvg r2 = (defpackage.alvg) r2     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r9 = "Waiting for Rcs services connection"
            r2.q(r9)     // Catch: java.lang.Throwable -> Lb2
            j$.util.Optional r2 = r13.d     // Catch: defpackage.arym -> L90 java.lang.Throwable -> Lb2
            java.lang.Long r9 = new java.lang.Long     // Catch: defpackage.arym -> L90 java.lang.Throwable -> Lb2
            r10 = 3000(0xbb8, double:1.482E-320)
            r9.<init>(r10)     // Catch: defpackage.arym -> L90 java.lang.Throwable -> Lb2
            java.lang.Object r2 = r2.orElse(r9)     // Catch: defpackage.arym -> L90 java.lang.Throwable -> Lb2
            r2.getClass()     // Catch: defpackage.arym -> L90 java.lang.Throwable -> Lb2
            java.lang.Number r2 = (java.lang.Number) r2     // Catch: defpackage.arym -> L90 java.lang.Throwable -> Lb2
            long r9 = r2.longValue()     // Catch: defpackage.arym -> L90 java.lang.Throwable -> Lb2
            qrr r2 = new qrr     // Catch: defpackage.arym -> L90 java.lang.Throwable -> Lb2
            r11 = 15
            r2.<init>(r13, r4, r11)     // Catch: defpackage.arym -> L90 java.lang.Throwable -> Lb2
            r0.d = r14     // Catch: defpackage.arym -> L90 java.lang.Throwable -> Lb2
            r0.c = r8     // Catch: defpackage.arym -> L90 java.lang.Throwable -> Lb2
            java.lang.Object r0 = defpackage.arwi.r(r9, r2, r0)     // Catch: defpackage.arym -> L90 java.lang.Throwable -> Lb2
            if (r0 == r1) goto L8f
            r12 = r0
            r0 = r14
            r14 = r12
        L88:
            java.lang.Boolean r14 = (java.lang.Boolean) r14     // Catch: java.lang.Throwable -> L32 defpackage.arym -> L91
            boolean r14 = r14.booleanValue()     // Catch: java.lang.Throwable -> L32 defpackage.arym -> L91
            goto Laa
        L8f:
            return r1
        L90:
            r0 = r14
        L91:
            alvi r14 = defpackage.rgy.a     // Catch: java.lang.Throwable -> L32
            alvw r14 = r14.i()     // Catch: java.lang.Throwable -> L32
            alvz r1 = defpackage.alwp.a     // Catch: java.lang.Throwable -> L32
            r14.X(r1, r7)     // Catch: java.lang.Throwable -> L32
            r1 = 51
            alvw r14 = r14.h(r6, r5, r1, r3)     // Catch: java.lang.Throwable -> L32
            alvg r14 = (defpackage.alvg) r14     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "Waiting for Rcs services connection timed out"
            r14.q(r1)     // Catch: java.lang.Throwable -> L32
            r14 = 0
        Laa:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)     // Catch: java.lang.Throwable -> L32
            defpackage.armd.i(r0, r4)
            return r14
        Lb2:
            r0 = move-exception
            r12 = r0
            r0 = r14
            r14 = r12
        Lb6:
            throw r14     // Catch: java.lang.Throwable -> Lb7
        Lb7:
            r1 = move-exception
            defpackage.armd.i(r0, r14)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rgy.a(arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.arpe r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.rgw
            if (r0 == 0) goto L13
            r0 = r5
            rgw r0 = (defpackage.rgw) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            rgw r0 = new rgw
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            arsb r1 = r0.e
            rgy r0 = r0.d
            defpackage.aqil.P(r5)     // Catch: java.lang.Throwable -> L2b
            goto L68
        L2b:
            r5 = move-exception
            goto L7b
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            defpackage.aqil.P(r5)
            arsb r5 = new arsb
            r5.<init>()
            r0.d = r4     // Catch: java.lang.Throwable -> L77
            r0.e = r5     // Catch: java.lang.Throwable -> L77
            r0.c = r3     // Catch: java.lang.Throwable -> L77
            arvp r2 = new arvp     // Catch: java.lang.Throwable -> L77
            arpe r0 = defpackage.arhi.i(r0)     // Catch: java.lang.Throwable -> L77
            r2.<init>(r0, r3)     // Catch: java.lang.Throwable -> L77
            r2.A()     // Catch: java.lang.Throwable -> L77
            rgx r0 = new rgx     // Catch: java.lang.Throwable -> L77
            r3 = 0
            r0.<init>(r2, r3)     // Catch: java.lang.Throwable -> L77
            r5.a = r0     // Catch: java.lang.Throwable -> L77
            wfe r0 = r4.c     // Catch: java.lang.Throwable -> L77
            java.lang.Object r3 = r5.a     // Catch: java.lang.Throwable -> L77
            wfd r3 = (defpackage.wfd) r3     // Catch: java.lang.Throwable -> L77
            r0.i(r3)     // Catch: java.lang.Throwable -> L77
            java.lang.Object r0 = r2.l()     // Catch: java.lang.Throwable -> L77
            if (r0 == r1) goto L76
            r0 = r4
            r1 = r5
        L68:
            java.lang.Object r5 = r1.a
            wfd r5 = (defpackage.wfd) r5
            if (r5 == 0) goto L73
            wfe r0 = r0.c
            r0.j(r5)
        L73:
            arnb r5 = defpackage.arnb.a
            return r5
        L76:
            return r1
        L77:
            r0 = move-exception
            r1 = r5
            r5 = r0
            r0 = r4
        L7b:
            java.lang.Object r1 = r1.a
            wfd r1 = (defpackage.wfd) r1
            if (r1 == 0) goto L86
            wfe r0 = r0.c
            r0.j(r1)
        L86:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rgy.b(arpe):java.lang.Object");
    }
}
