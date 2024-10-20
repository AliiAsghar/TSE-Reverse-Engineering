package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lky implements lks {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/navigation/statemachine/RequestedWithResultOperation");
    private final lkd b;

    public lky(lkd lkdVar) {
        lkdVar.getClass();
        this.b = lkdVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(7:5|6|7|(1:(3:10|11|12)(2:24|25))(2:26|(5:30|31|32|33|(1:35)(1:36))(2:28|29))|13|14|15))|44|6|7|(0)(0)|13|14|15|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0033, code lost:
    
        r10 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006d A[Catch: Exception -> 0x0033, TryCatch #1 {Exception -> 0x0033, blocks: (B:12:0x002f, B:13:0x0060, B:19:0x0069, B:21:0x006d, B:23:0x0089), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0089 A[Catch: Exception -> 0x0033, TRY_LEAVE, TryCatch #1 {Exception -> 0x0033, blocks: (B:12:0x002f, B:13:0x0060, B:19:0x0069, B:21:0x006d, B:23:0x0089), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, ljx] */
    /* JADX WARN: Type inference failed for: r10v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r9v0, types: [lkh] */
    /* JADX WARN: Type inference failed for: r9v1, types: [lky] */
    /* JADX WARN: Type inference failed for: r9v4 */
    @Override // defpackage.lks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(int r8, defpackage.lkh r9, defpackage.ljx r10, defpackage.arpe r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof defpackage.lkx
            if (r0 == 0) goto L13
            r0 = r11
            lkx r0 = (defpackage.lkx) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            lkx r0 = new lkx
            r0.<init>(r7, r11)
        L18:
            java.lang.Object r11 = r0.c
            arpl r1 = defpackage.arpl.a
            int r2 = r0.e
            java.lang.String r3 = "execute"
            java.lang.String r4 = "com/google/android/apps/messaging/navigation/statemachine/RequestedWithResultOperation"
            java.lang.String r5 = "RequestedWithResultState.kt"
            r6 = 1
            if (r2 == 0) goto L3f
            if (r2 != r6) goto L37
            int r8 = r0.b
            java.lang.Object r10 = r0.a
            lky r9 = r0.f
            defpackage.aqil.P(r11)     // Catch: java.lang.Exception -> L33 java.util.concurrent.CancellationException -> L35
            goto L60
        L33:
            r10 = move-exception
            goto L8d
        L35:
            r11 = move-exception
            goto L69
        L37:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3f:
            defpackage.aqil.P(r11)
            boolean r11 = r10 instanceof defpackage.ljw
            if (r11 == 0) goto Lb2
            lkd r11 = r7.b     // Catch: java.lang.Exception -> L8a
            r11.e(r8)     // Catch: java.lang.Exception -> L8a
            r11 = r10
            ljw r11 = (defpackage.ljw) r11     // Catch: java.util.concurrent.CancellationException -> L66 java.lang.Exception -> L8a
            lkg r9 = (defpackage.lkg) r9     // Catch: java.util.concurrent.CancellationException -> L66 java.lang.Exception -> L8a
            r0.f = r7     // Catch: java.util.concurrent.CancellationException -> L66 java.lang.Exception -> L8a
            r0.a = r10     // Catch: java.util.concurrent.CancellationException -> L66 java.lang.Exception -> L8a
            r0.b = r8     // Catch: java.util.concurrent.CancellationException -> L66 java.lang.Exception -> L8a
            r0.e = r6     // Catch: java.util.concurrent.CancellationException -> L66 java.lang.Exception -> L8a
            java.lang.Object r11 = r11.b(r9, r0)     // Catch: java.util.concurrent.CancellationException -> L66 java.lang.Exception -> L8a
            if (r11 != r1) goto L5f
            return r1
        L5f:
            r9 = r7
        L60:
            lkd r10 = r9.b     // Catch: java.lang.Exception -> L33
            r10.d(r8, r11)     // Catch: java.lang.Exception -> L33
            goto Laf
        L66:
            r9 = move-exception
            r11 = r9
            r9 = r7
        L69:
            boolean r10 = r10 instanceof defpackage.ljv     // Catch: java.lang.Exception -> L33
            if (r10 == 0) goto L89
            alvi r10 = defpackage.lky.a     // Catch: java.lang.Exception -> L33
            alvw r10 = r10.d()     // Catch: java.lang.Exception -> L33
            alvg r10 = (defpackage.alvg) r10     // Catch: java.lang.Exception -> L33
            alvw r10 = r10.g(r11)     // Catch: java.lang.Exception -> L33
            r11 = 69
            alvw r10 = r10.h(r4, r3, r11, r5)     // Catch: java.lang.Exception -> L33
            alvg r10 = (defpackage.alvg) r10     // Catch: java.lang.Exception -> L33
            java.lang.String r11 = "Ignoring cancellation exception from NavigationHandler#navigate to allow resuming navigation."
            r10.q(r11)     // Catch: java.lang.Exception -> L33
            arnb r8 = defpackage.arnb.a     // Catch: java.lang.Exception -> L33
            return r8
        L89:
            throw r11     // Catch: java.lang.Exception -> L33
        L8a:
            r9 = move-exception
            r10 = r9
            r9 = r7
        L8d:
            alvi r11 = defpackage.lky.a
            alvw r11 = r11.d()
            alvg r11 = (defpackage.alvg) r11
            alvw r11 = r11.g(r10)
            r0 = 82
            alvw r11 = r11.h(r4, r3, r0, r5)
            alvg r11 = (defpackage.alvg) r11
            java.lang.String r0 = "Navigation handler or navigation completion threw, completing navigation with failure."
            r11.q(r0)
            lkd r9 = r9.b
            java.lang.Object r10 = defpackage.aqil.O(r10)
            r9.d(r8, r10)
        Laf:
            arnb r8 = defpackage.arnb.a
            return r8
        Lb2:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "RequestedWithResultOperation can only be executed for targets with a result."
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lky.a(int, lkh, ljx, arpe):java.lang.Object");
    }
}
