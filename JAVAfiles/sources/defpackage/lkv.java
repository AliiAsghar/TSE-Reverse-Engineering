package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lkv implements lks {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/navigation/statemachine/RequestedOperation");
    private final lkd b;

    public lkv(lkd lkdVar) {
        lkdVar.getClass();
        this.b = lkdVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    @Override // defpackage.lks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(int r11, defpackage.lkh r12, defpackage.ljx r13, defpackage.arpe r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof defpackage.lku
            if (r0 == 0) goto L13
            r0 = r14
            lku r0 = (defpackage.lku) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            lku r0 = new lku
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.d
            java.lang.String r3 = "Marking navigation request as completed"
            r4 = 62
            r5 = 1
            java.lang.String r6 = "execute"
            java.lang.String r7 = "com/google/android/apps/messaging/navigation/statemachine/RequestedOperation"
            java.lang.String r8 = "RequestedState.kt"
            if (r2 == 0) goto L3f
            if (r2 != r5) goto L37
            int r11 = r0.a
            lkv r12 = r0.e
            defpackage.aqil.P(r14)     // Catch: java.lang.Throwable -> L35
            goto L81
        L35:
            r13 = move-exception
            goto L9b
        L37:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3f:
            defpackage.aqil.P(r14)
            boolean r14 = r13 instanceof defpackage.lju
            if (r14 == 0) goto Lb0
            alvi r14 = defpackage.lkv.a     // Catch: java.lang.Throwable -> L98
            alvw r2 = r14.g()     // Catch: java.lang.Throwable -> L98
            r9 = 57
            alvw r2 = r2.h(r7, r6, r9, r8)     // Catch: java.lang.Throwable -> L98
            alvg r2 = (defpackage.alvg) r2     // Catch: java.lang.Throwable -> L98
            java.lang.String r9 = "Marking navigation request as dispatched"
            r2.q(r9)     // Catch: java.lang.Throwable -> L98
            lkd r2 = r10.b     // Catch: java.lang.Throwable -> L98
            r2.e(r11)     // Catch: java.lang.Throwable -> L98
            alvw r14 = r14.g()     // Catch: java.lang.Throwable -> L98
            r2 = 59
            alvw r14 = r14.h(r7, r6, r2, r8)     // Catch: java.lang.Throwable -> L98
            alvg r14 = (defpackage.alvg) r14     // Catch: java.lang.Throwable -> L98
            java.lang.String r2 = "Invoking navigation handler for target %s"
            r14.t(r2, r12)     // Catch: java.lang.Throwable -> L98
            lju r13 = (defpackage.lju) r13     // Catch: java.lang.Throwable -> L98
            lkf r12 = (defpackage.lkf) r12     // Catch: java.lang.Throwable -> L98
            r0.e = r10     // Catch: java.lang.Throwable -> L98
            r0.a = r11     // Catch: java.lang.Throwable -> L98
            r0.d = r5     // Catch: java.lang.Throwable -> L98
            java.lang.Object r12 = r13.a(r12, r0)     // Catch: java.lang.Throwable -> L98
            if (r12 != r1) goto L80
            return r1
        L80:
            r12 = r10
        L81:
            alvi r13 = defpackage.lkv.a
            alvw r13 = r13.g()
            alvw r13 = r13.h(r7, r6, r4, r8)
            alvg r13 = (defpackage.alvg) r13
            r13.q(r3)
            lkd r12 = r12.b
            r12.c(r11)
            arnb r11 = defpackage.arnb.a
            return r11
        L98:
            r12 = move-exception
            r13 = r12
            r12 = r10
        L9b:
            alvi r14 = defpackage.lkv.a
            alvw r14 = r14.g()
            alvw r14 = r14.h(r7, r6, r4, r8)
            alvg r14 = (defpackage.alvg) r14
            r14.q(r3)
            lkd r12 = r12.b
            r12.c(r11)
            throw r13
        Lb0:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "RequestedOperation can only be executed for targets without a result."
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lkv.a(int, lkh, ljx, arpe):java.lang.Object");
    }
}
