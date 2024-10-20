package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yrr {
    private static final alvi b = alvi.m("com/google/android/apps/messaging/shared/util/spam/spatula/HaasProxyImpl");
    public final arpi a;
    private final Context c;
    private final armf d;
    private final String e;

    public yrr(Context context, arwe arweVar, arpi arpiVar, armf armfVar) {
        context.getClass();
        arweVar.getClass();
        arpiVar.getClass();
        armfVar.getClass();
        this.c = context;
        this.a = arpiVar;
        this.d = armfVar;
        this.e = "com.android.providers.telephony";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.io.Closeable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(android.net.Uri r8, defpackage.arpe r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.yrq
            if (r0 == 0) goto L13
            r0 = r9
            yrq r0 = (defpackage.yrq) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            yrq r0 = new yrq
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            java.lang.Object r8 = r0.a
            defpackage.aqil.P(r9)     // Catch: java.lang.Throwable -> L2a
            goto L77
        L2a:
            r9 = move-exception
            goto L7c
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            defpackage.aqil.P(r9)
            android.content.Context r9 = r7.c     // Catch: java.lang.Exception -> L82
            java.lang.String r2 = "r"
            java.lang.String r5 = r8.toString()     // Catch: java.lang.Exception -> L82
            r5.getClass()     // Catch: java.lang.Exception -> L82
            android.net.Uri r6 = android.provider.Telephony.Mms.CONTENT_URI     // Catch: java.lang.Exception -> L82
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Exception -> L82
            r6.getClass()     // Catch: java.lang.Exception -> L82
            boolean r5 = defpackage.arsd.ad(r5, r6)     // Catch: java.lang.Exception -> L82
            if (r5 == 0) goto L54
            java.lang.String r5 = r7.e     // Catch: java.lang.Exception -> L82
            goto L56
        L54:
            java.lang.String r5 = "com.google.android.apps.messaging"
        L56:
            aipw r5 = defpackage.aipw.a(r5)     // Catch: java.lang.Exception -> L82
            android.content.res.AssetFileDescriptor r8 = defpackage.aipx.a(r9, r8, r2, r5)     // Catch: java.lang.Exception -> L82
            armf r9 = r7.d     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r9 = r9.b()     // Catch: java.lang.Throwable -> L2a
            adxs r9 = (defpackage.adxs) r9     // Catch: java.lang.Throwable -> L2a
            android.os.ParcelFileDescriptor r2 = r8.getParcelFileDescriptor()     // Catch: java.lang.Throwable -> L2a
            r2.getClass()     // Catch: java.lang.Throwable -> L2a
            r0.a = r8     // Catch: java.lang.Throwable -> L2a
            r0.d = r4     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r9 = r9.c(r4, r2, r0)     // Catch: java.lang.Throwable -> L2a
            if (r9 == r1) goto L7b
        L77:
            defpackage.armd.i(r8, r3)     // Catch: java.lang.Exception -> L82
            return r9
        L7b:
            return r1
        L7c:
            throw r9     // Catch: java.lang.Throwable -> L7d
        L7d:
            r0 = move-exception
            defpackage.armd.i(r8, r9)     // Catch: java.lang.Exception -> L82
            throw r0     // Catch: java.lang.Exception -> L82
        L82:
            r8 = move-exception
            alvi r9 = defpackage.yrr.b
            alvw r9 = r9.f()
            alvg r9 = (defpackage.alvg) r9
            alvw r8 = r9.g(r8)
            alvg r8 = (defpackage.alvg) r8
            alwk r9 = defpackage.alwk.FULL
            r8.Z(r9)
            java.lang.String r9 = "classifyImageWithSafetyCore"
            r0 = 80
            java.lang.String r1 = "com/google/android/apps/messaging/shared/util/spam/spatula/HaasProxyImpl"
            java.lang.String r2 = "HaasProxyImpl.kt"
            alvw r8 = r8.h(r1, r9, r0, r2)
            alvg r8 = (defpackage.alvg) r8
            java.lang.String r9 = "SafetyCore classification failed. Assuming negative verdict."
            r8.q(r9)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yrr.a(android.net.Uri, arpe):java.lang.Object");
    }
}
