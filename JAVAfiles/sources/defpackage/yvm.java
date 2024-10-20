package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yvm {
    private static final arml a = armd.a(tzt.t);

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0027, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        r5 = defpackage.yvm.a.a();
        r5.getClass();
        ((defpackage.alvg) ((defpackage.alvi) r5).i().h("com/google/android/apps/messaging/shared/video/SafeDuoKitClientKt", "safeApiProviderAvailability", 16, "SafeDuoKitClient.kt")).t("Error calling getApiAvailabilityAsync. API availability unknown", r4);
        r4 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(defpackage.afxz r4, defpackage.arpe r5) {
        /*
            boolean r0 = r5 instanceof defpackage.yvl
            if (r0 == 0) goto L13
            r0 = r5
            yvl r0 = (defpackage.yvl) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            yvl r0 = new yvl
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            defpackage.aqil.P(r5)     // Catch: java.lang.Exception -> L27
            goto L45
        L27:
            r4 = move-exception
            goto L4a
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            defpackage.aqil.P(r5)
            acir r4 = r4.k()     // Catch: java.lang.Exception -> L27
            com.google.common.util.concurrent.ListenableFuture r4 = defpackage.agkx.f(r4)     // Catch: java.lang.Exception -> L27
            r0.b = r3     // Catch: java.lang.Exception -> L27
            java.lang.Object r5 = defpackage.arro.F(r4, r0)     // Catch: java.lang.Exception -> L27
            if (r5 != r1) goto L45
            return r1
        L45:
            com.google.android.gms.duokit.GetApiAvailabilityResponse r5 = (com.google.android.gms.duokit.GetApiAvailabilityResponse) r5     // Catch: java.lang.Exception -> L27
            int r4 = r5.a     // Catch: java.lang.Exception -> L27
            goto L6d
        L4a:
            arml r5 = defpackage.yvm.a
            java.lang.Object r5 = r5.a()
            r5.getClass()
            alvi r5 = (defpackage.alvi) r5
            alvw r5 = r5.i()
            java.lang.String r0 = "safeApiProviderAvailability"
            r1 = 16
            java.lang.String r2 = "com/google/android/apps/messaging/shared/video/SafeDuoKitClientKt"
            java.lang.String r3 = "SafeDuoKitClient.kt"
            alvw r5 = r5.h(r2, r0, r1, r3)
            alvg r5 = (defpackage.alvg) r5
            java.lang.String r0 = "Error calling getApiAvailabilityAsync. API availability unknown"
            r5.t(r0, r4)
            r4 = 0
        L6d:
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yvm.a(afxz, arpe):java.lang.Object");
    }
}
