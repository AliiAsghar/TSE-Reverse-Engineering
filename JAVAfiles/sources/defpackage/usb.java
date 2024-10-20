package defpackage;

import android.app.Notification;
import android.os.Build;
import com.google.android.apps.messaging.shared.datamodel.workqueue.foregroundservice.BugleDataSyncForegroundService;
import j$.util.Optional;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class usb {
    private static final xze b = xze.g("BugleWorkQueue", "WorkQueueWorkerRunner");
    public final usz a;
    private final xnv c;
    private final usk d;
    private final umz e;
    private final pqs f;
    private final arwe g;
    private final Map h;
    private final Map i;
    private final asgm j;
    private final asgm k;

    public usb(xnv xnvVar, usz uszVar, usk uskVar, umz umzVar, pqs pqsVar, arwe arweVar) {
        xnvVar.getClass();
        uskVar.getClass();
        umzVar.getClass();
        arweVar.getClass();
        this.c = xnvVar;
        this.a = uszVar;
        this.d = uskVar;
        this.e = umzVar;
        this.f = pqsVar;
        this.g = arweVar;
        this.j = new asgm();
        this.k = new asgm();
        this.h = new LinkedHashMap();
        this.i = new LinkedHashMap();
    }

    private final void g(akul akulVar, unf unfVar) {
        Notification notification = unfVar.h;
        if (notification != null) {
            Optional optional = unfVar.l;
            if (optional != null && !optional.isEmpty()) {
                int intValue = ((Number) optional.get()).intValue();
                Class<BugleDataSyncForegroundService> cls = null;
                if (intValue != 0) {
                    if (intValue != 1) {
                        if (intValue != 2048) {
                            throw new IllegalStateException(a.bV(intValue, "Unexpected foreground service type: "));
                        }
                    } else if (Build.VERSION.SDK_INT >= 29) {
                        cls = BugleDataSyncForegroundService.class;
                    }
                }
                if (cls == null) {
                    this.e.e(akulVar, notification, 13);
                    return;
                } else {
                    this.e.g(akulVar, notification, cls, ((Number) optional.get()).intValue());
                    return;
                }
            }
            throw new IllegalStateException("Foreground service type cannot be null or empty.");
        }
        throw new IllegalStateException("ForegroundServiceNotification cannot be null.");
    }

    private final void h(arwl arwlVar, unf unfVar) {
        akul a = qjh.a(arwlVar);
        unv unvVar = unfVar.c;
        if (unvVar != null) {
            int ordinal = unvVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1 && ordinal != 2) {
                    if (ordinal == 3) {
                        this.e.c(a);
                        g(a, unfVar);
                        return;
                    }
                } else {
                    try {
                        this.e.c(a);
                        this.e.a(a);
                        return;
                    } catch (IllegalStateException unused) {
                        b.o("unable to attach service - probably in background already");
                        if (unvVar == unv.BACKGROUND_SERVICE_FALLBACK_TO_FOREGROUND_SERVICE) {
                            g(a, unfVar);
                            return;
                        }
                        return;
                    }
                }
            } else {
                Objects.toString(unvVar);
                throw new IllegalStateException("Unexpected value: ".concat(unvVar.toString()));
            }
        }
        b.o("Unspecified KeepAliveStrategy.");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c3 A[Catch: all -> 0x00e0, TRY_LEAVE, TryCatch #0 {all -> 0x00e0, blocks: (B:36:0x00be, B:38:0x00c3, B:46:0x00dc, B:47:0x00df, B:55:0x0072, B:30:0x0086, B:32:0x0091, B:34:0x0097, B:42:0x00a5, B:44:0x00af), top: B:54:0x0072, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00af A[Catch: all -> 0x00db, TRY_LEAVE, TryCatch #2 {all -> 0x00db, blocks: (B:30:0x0086, B:32:0x0091, B:34:0x0097, B:42:0x00a5, B:44:0x00af), top: B:29:0x0086, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r11, defpackage.arpe r12) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.usb.a(java.lang.String, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.String r5, defpackage.arpe r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.urv
            if (r0 == 0) goto L13
            r0 = r6
            urv r0 = (defpackage.urv) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            urv r0 = new urv
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            asgm r5 = r0.f
            java.lang.String r1 = r0.e
            usb r0 = r0.d
            defpackage.aqil.P(r6)
            r6 = r5
            r5 = r1
            goto L4b
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            defpackage.aqil.P(r6)
            asgm r6 = r4.k
            r0.d = r4
            r0.e = r5
            r0.f = r6
            r0.c = r3
            java.lang.Object r0 = r6.b(r0)
            if (r0 == r1) goto L84
            r0 = r4
        L4b:
            java.util.Map r1 = r0.i     // Catch: java.lang.Throwable -> L7f
            r1.remove(r5)     // Catch: java.lang.Throwable -> L7f
            java.util.Map r0 = r0.h     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r0 = r0.remove(r5)     // Catch: java.lang.Throwable -> L7f
            arwl r0 = (defpackage.arwl) r0     // Catch: java.lang.Throwable -> L7f
            if (r0 == 0) goto L71
            boolean r1 = r0.x()     // Catch: java.lang.Throwable -> L7f
            if (r1 != r3) goto L71
            xze r0 = defpackage.usb.b     // Catch: java.lang.Throwable -> L7f
            java.lang.String r1 = " work has completed."
            java.lang.String r5 = defpackage.hht.h(r5, r1)     // Catch: java.lang.Throwable -> L7f
            r0.o(r5)     // Catch: java.lang.Throwable -> L7f
            arnb r5 = defpackage.arnb.a     // Catch: java.lang.Throwable -> L7f
            r6.d()
            return r5
        L71:
            java.lang.String r5 = "Invalid state: "
            java.lang.String r1 = " is not active when being completed"
            java.lang.String r5 = defpackage.a.cc(r0, r5, r1)     // Catch: java.lang.Throwable -> L7f
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L7f
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L7f
            throw r0     // Catch: java.lang.Throwable -> L7f
        L7f:
            r5 = move-exception
            r6.d()
            throw r5
        L84:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.usb.b(java.lang.String, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0059 A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:11:0x004f, B:13:0x0059, B:14:0x005c), top: B:10:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(java.lang.String r5, defpackage.urt r6, defpackage.arpe r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.urw
            if (r0 == 0) goto L13
            r0 = r7
            urw r0 = (defpackage.urw) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            urw r0 = new urw
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            asgm r5 = r0.g
            urt r6 = r0.f
            java.lang.String r1 = r0.e
            usb r0 = r0.d
            defpackage.aqil.P(r7)
            r7 = r5
            r5 = r1
            goto L4f
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            defpackage.aqil.P(r7)
            asgm r7 = r4.k
            r0.d = r4
            r0.e = r5
            r0.f = r6
            r0.g = r7
            r0.c = r3
            java.lang.Object r0 = r7.b(r0)
            if (r0 == r1) goto L67
            r0 = r4
        L4f:
            java.util.Map r0 = r0.i     // Catch: java.lang.Throwable -> L62
            java.lang.Object r5 = r0.get(r5)     // Catch: java.lang.Throwable -> L62
            java.util.EnumSet r5 = (java.util.EnumSet) r5     // Catch: java.lang.Throwable -> L62
            if (r5 == 0) goto L5c
            r5.remove(r6)     // Catch: java.lang.Throwable -> L62
        L5c:
            arnb r5 = defpackage.arnb.a     // Catch: java.lang.Throwable -> L62
            r7.d()
            return r5
        L62:
            r5 = move-exception
            r7.d()
            throw r5
        L67:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.usb.c(java.lang.String, urt, arpe):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00bb A[Catch: all -> 0x019e, Merged into TryCatch #0 {all -> 0x0045, all -> 0x019e, blocks: (B:12:0x003c, B:31:0x0191, B:44:0x019f, B:45:0x01a2, B:49:0x0090, B:15:0x00b3, B:17:0x00bb, B:18:0x00c7, B:20:0x00cf, B:22:0x00d7, B:24:0x0104, B:26:0x011b, B:29:0x0121, B:30:0x0186, B:35:0x0135, B:37:0x0172, B:40:0x0178, B:41:0x0198, B:42:0x019d), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00cf A[Catch: all -> 0x019e, Merged into TryCatch #0 {all -> 0x0045, all -> 0x019e, blocks: (B:12:0x003c, B:31:0x0191, B:44:0x019f, B:45:0x01a2, B:49:0x0090, B:15:0x00b3, B:17:0x00bb, B:18:0x00c7, B:20:0x00cf, B:22:0x00d7, B:24:0x0104, B:26:0x011b, B:29:0x0121, B:30:0x0186, B:35:0x0135, B:37:0x0172, B:40:0x0178, B:41:0x0198, B:42:0x019d), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0198 A[Catch: all -> 0x019e, Merged into TryCatch #0 {all -> 0x0045, all -> 0x019e, blocks: (B:12:0x003c, B:31:0x0191, B:44:0x019f, B:45:0x01a2, B:49:0x0090, B:15:0x00b3, B:17:0x00bb, B:18:0x00c7, B:20:0x00cf, B:22:0x00d7, B:24:0x0104, B:26:0x011b, B:29:0x0121, B:30:0x0186, B:35:0x0135, B:37:0x0172, B:40:0x0178, B:41:0x0198, B:42:0x019d), top: B:7:0x0026 }, TRY_ENTER] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1, types: [arwl] */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1, types: [java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1, types: [asgm] */
    /* JADX WARN: Type inference failed for: r5v5, types: [asgm] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(java.lang.String r22, defpackage.urt r23, defpackage.arwl r24, java.lang.Runnable r25, defpackage.unf r26, defpackage.arpe r27) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.usb.d(java.lang.String, urt, arwl, java.lang.Runnable, unf, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00d1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(java.lang.String r15, defpackage.urt r16, defpackage.arwl r17, java.lang.Runnable r18, defpackage.unf r19, defpackage.arpe r20) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.usb.e(java.lang.String, urt, arwl, java.lang.Runnable, unf, arpe):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(2:3|(9:5|6|7|(1:(1:(1:(1:(5:13|14|15|16|17)(2:19|20))(3:21|22|23))(6:24|25|26|27|(3:29|16|17)|30))(4:31|32|33|34))(14:49|50|51|52|53|54|55|56|57|58|59|60|(1:62)|30)|35|36|37|(3:39|27|(0))|30))|84|6|7|(0)(0)|35|36|37|(0)|30|(2:(0)|(1:80))) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0116, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0140, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Type inference failed for: r2v23, types: [int] */
    /* JADX WARN: Type inference failed for: r2v24, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [arpe, akrh] */
    /* JADX WARN: Type inference failed for: r3v6, types: [arpe, akrh] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(java.lang.String r23, defpackage.arwl r24, java.lang.Runnable r25, defpackage.arpe r26) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.usb.f(java.lang.String, arwl, java.lang.Runnable, arpe):java.lang.Object");
    }
}
