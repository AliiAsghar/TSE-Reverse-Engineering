package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yso {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/util/spam/tachyon/TachyonSpamGrpcProxyImpl");
    public final Context b;
    private final arpi c;

    public yso(Context context, arpi arpiVar) {
        context.getClass();
        arpiVar.getClass();
        this.b = context;
        this.c = arpiVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.apzi r8, defpackage.aqhh r9, defpackage.arpe r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.ysk
            if (r0 == 0) goto L13
            r0 = r10
            ysk r0 = (defpackage.ysk) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ysk r0 = new ysk
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r10)
            goto L86
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            defpackage.aqil.P(r10)
            aqrs r10 = r8.a
            aqux r2 = defpackage.apzj.a
            if (r2 != 0) goto L73
            java.lang.Class<apzj> r4 = defpackage.apzj.class
            monitor-enter(r4)
            aqux r2 = defpackage.apzj.a     // Catch: java.lang.Throwable -> L70
            if (r2 != 0) goto L6e
            aquu r2 = defpackage.aqux.a()     // Catch: java.lang.Throwable -> L70
            aquw r5 = defpackage.aquw.UNARY     // Catch: java.lang.Throwable -> L70
            r2.e = r5     // Catch: java.lang.Throwable -> L70
            java.lang.String r5 = "google.internal.communications.instantmessaging.v1.Abuse"
            java.lang.String r6 = "AddSpamSignalV2"
            java.lang.String r5 = defpackage.aqux.c(r5, r6)     // Catch: java.lang.Throwable -> L70
            r2.a = r5     // Catch: java.lang.Throwable -> L70
            r2.b()     // Catch: java.lang.Throwable -> L70
            aqhh r5 = defpackage.aqhh.a     // Catch: java.lang.Throwable -> L70
            aozs r6 = defpackage.arkx.a     // Catch: java.lang.Throwable -> L70
            arkw r6 = new arkw     // Catch: java.lang.Throwable -> L70
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L70
            r2.c = r6     // Catch: java.lang.Throwable -> L70
            aqhi r5 = defpackage.aqhi.a     // Catch: java.lang.Throwable -> L70
            arkw r6 = new arkw     // Catch: java.lang.Throwable -> L70
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L70
            r2.d = r6     // Catch: java.lang.Throwable -> L70
            aqux r2 = r2.a()     // Catch: java.lang.Throwable -> L70
            defpackage.apzj.a = r2     // Catch: java.lang.Throwable -> L70
        L6e:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L70
            goto L73
        L70:
            r8 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L70
            throw r8
        L73:
            aqrr r8 = r8.b
            aqru r8 = r10.a(r2, r8)
            com.google.common.util.concurrent.ListenableFuture r8 = defpackage.arlj.a(r8, r9)
            r0.c = r3
            java.lang.Object r10 = defpackage.arro.F(r8, r0)
            if (r10 != r1) goto L86
            return r1
        L86:
            r10.getClass()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yso.a(apzi, aqhh, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.util.Map r10, java.lang.String r11, defpackage.arpe r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof defpackage.ysl
            if (r0 == 0) goto L13
            r0 = r12
            ysl r0 = (defpackage.ysl) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ysl r0 = new ysl
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r12)
            goto L48
        L27:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L2f:
            defpackage.aqil.P(r12)
            r0.c = r3
            arpi r12 = r9.c
            wiu r8 = new wiu
            r6 = 0
            r7 = 14
            r2 = r8
            r3 = r9
            r4 = r11
            r5 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            java.lang.Object r12 = defpackage.arro.q(r12, r8, r0)
            if (r12 == r1) goto L5b
        L48:
            java.lang.String r12 = (java.lang.String) r12
            if (r12 == 0) goto L53
            int r10 = r12.length()
            if (r10 == 0) goto L53
            return r12
        L53:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "DroidGuard result is null or empty"
            r10.<init>(r11)
            throw r10
        L5b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yso.b(java.util.Map, java.lang.String, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.apzi r8, defpackage.aqhn r9, defpackage.arpe r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.ysm
            if (r0 == 0) goto L13
            r0 = r10
            ysm r0 = (defpackage.ysm) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ysm r0 = new ysm
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r10)
            goto L86
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            defpackage.aqil.P(r10)
            aqrs r10 = r8.a
            aqux r2 = defpackage.apzj.b
            if (r2 != 0) goto L73
            java.lang.Class<apzj> r4 = defpackage.apzj.class
            monitor-enter(r4)
            aqux r2 = defpackage.apzj.b     // Catch: java.lang.Throwable -> L70
            if (r2 != 0) goto L6e
            aquu r2 = defpackage.aqux.a()     // Catch: java.lang.Throwable -> L70
            aquw r5 = defpackage.aquw.UNARY     // Catch: java.lang.Throwable -> L70
            r2.e = r5     // Catch: java.lang.Throwable -> L70
            java.lang.String r5 = "google.internal.communications.instantmessaging.v1.Abuse"
            java.lang.String r6 = "GetSpamState"
            java.lang.String r5 = defpackage.aqux.c(r5, r6)     // Catch: java.lang.Throwable -> L70
            r2.a = r5     // Catch: java.lang.Throwable -> L70
            r2.b()     // Catch: java.lang.Throwable -> L70
            aqhn r5 = defpackage.aqhn.a     // Catch: java.lang.Throwable -> L70
            aozs r6 = defpackage.arkx.a     // Catch: java.lang.Throwable -> L70
            arkw r6 = new arkw     // Catch: java.lang.Throwable -> L70
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L70
            r2.c = r6     // Catch: java.lang.Throwable -> L70
            aqho r5 = defpackage.aqho.a     // Catch: java.lang.Throwable -> L70
            arkw r6 = new arkw     // Catch: java.lang.Throwable -> L70
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L70
            r2.d = r6     // Catch: java.lang.Throwable -> L70
            aqux r2 = r2.a()     // Catch: java.lang.Throwable -> L70
            defpackage.apzj.b = r2     // Catch: java.lang.Throwable -> L70
        L6e:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L70
            goto L73
        L70:
            r8 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L70
            throw r8
        L73:
            aqrr r8 = r8.b
            aqru r8 = r10.a(r2, r8)
            com.google.common.util.concurrent.ListenableFuture r8 = defpackage.arlj.a(r8, r9)
            r0.c = r3
            java.lang.Object r10 = defpackage.arro.F(r8, r0)
            if (r10 != r1) goto L86
            return r1
        L86:
            r10.getClass()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yso.c(apzi, aqhn, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.apzi r8, defpackage.aqhp r9, defpackage.arpe r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.ysn
            if (r0 == 0) goto L13
            r0 = r10
            ysn r0 = (defpackage.ysn) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ysn r0 = new ysn
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r10)
            goto L86
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            defpackage.aqil.P(r10)
            aqrs r10 = r8.a
            aqux r2 = defpackage.apzj.c
            if (r2 != 0) goto L73
            java.lang.Class<apzj> r4 = defpackage.apzj.class
            monitor-enter(r4)
            aqux r2 = defpackage.apzj.c     // Catch: java.lang.Throwable -> L70
            if (r2 != 0) goto L6e
            aquu r2 = defpackage.aqux.a()     // Catch: java.lang.Throwable -> L70
            aquw r5 = defpackage.aquw.UNARY     // Catch: java.lang.Throwable -> L70
            r2.e = r5     // Catch: java.lang.Throwable -> L70
            java.lang.String r5 = "google.internal.communications.instantmessaging.v1.Abuse"
            java.lang.String r6 = "GetURLState"
            java.lang.String r5 = defpackage.aqux.c(r5, r6)     // Catch: java.lang.Throwable -> L70
            r2.a = r5     // Catch: java.lang.Throwable -> L70
            r2.b()     // Catch: java.lang.Throwable -> L70
            aqhp r5 = defpackage.aqhp.a     // Catch: java.lang.Throwable -> L70
            aozs r6 = defpackage.arkx.a     // Catch: java.lang.Throwable -> L70
            arkw r6 = new arkw     // Catch: java.lang.Throwable -> L70
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L70
            r2.c = r6     // Catch: java.lang.Throwable -> L70
            aqhq r5 = defpackage.aqhq.a     // Catch: java.lang.Throwable -> L70
            arkw r6 = new arkw     // Catch: java.lang.Throwable -> L70
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L70
            r2.d = r6     // Catch: java.lang.Throwable -> L70
            aqux r2 = r2.a()     // Catch: java.lang.Throwable -> L70
            defpackage.apzj.c = r2     // Catch: java.lang.Throwable -> L70
        L6e:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L70
            goto L73
        L70:
            r8 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L70
            throw r8
        L73:
            aqrr r8 = r8.b
            aqru r8 = r10.a(r2, r8)
            com.google.common.util.concurrent.ListenableFuture r8 = defpackage.arlj.a(r8, r9)
            r0.c = r3
            java.lang.Object r10 = defpackage.arro.F(r8, r0)
            if (r10 != r1) goto L86
            return r1
        L86:
            r10.getClass()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yso.d(apzi, aqhp, arpe):java.lang.Object");
    }
}
