package defpackage;

import android.os.Bundle;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lxs {
    public Object a;
    public Object b;
    public final Object c;

    public lxs(flx flxVar) {
        this.c = flxVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005d A[Catch: all -> 0x0074, TryCatch #0 {all -> 0x0074, blocks: (B:11:0x0055, B:13:0x005d, B:15:0x0061, B:16:0x0064), top: B:10:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, arxm] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.util.UUID r5, defpackage.arqr r6, defpackage.arpe r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.lxr
            if (r0 == 0) goto L13
            r0 = r7
            lxr r0 = (defpackage.lxr) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            lxr r0 = new lxr
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            asgm r5 = r0.f
            ncd r6 = r0.g
            java.util.UUID r1 = r0.e
            lxs r0 = r0.d
            defpackage.aqil.P(r7)
            r7 = r5
            r5 = r1
            goto L55
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            defpackage.aqil.P(r7)
            java.lang.Object r7 = r4.c
            r0.d = r4
            r0.e = r5
            r2 = r6
            ncd r2 = (defpackage.ncd) r2
            r0.g = r2
            r2 = r7
            asgm r2 = (defpackage.asgm) r2
            r0.f = r2
            r0.c = r3
            java.lang.Object r0 = r2.b(r0)
            if (r0 == r1) goto L7b
            r0 = r4
        L55:
            java.lang.Object r1 = r0.a     // Catch: java.lang.Throwable -> L74
            boolean r1 = defpackage.d.F(r1, r5)     // Catch: java.lang.Throwable -> L74
            if (r1 != 0) goto L6c
            java.lang.Object r1 = r0.b     // Catch: java.lang.Throwable -> L74
            if (r1 == 0) goto L64
            defpackage.arsd.am(r1)     // Catch: java.lang.Throwable -> L74
        L64:
            r0.a = r5     // Catch: java.lang.Throwable -> L74
            java.lang.Object r5 = r6.a(r5)     // Catch: java.lang.Throwable -> L74
            r0.b = r5     // Catch: java.lang.Throwable -> L74
        L6c:
            asgm r7 = (defpackage.asgm) r7
            r7.d()
            arnb r5 = defpackage.arnb.a
            return r5
        L74:
            r5 = move-exception
            asgm r7 = (defpackage.asgm) r7
            r7.d()
            throw r5
        L7b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lxs.a(java.util.UUID, arqr, arpe):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.time.temporal.Temporal, java.lang.Object] */
    public final Duration b() {
        Duration duration;
        ?? r0 = this.a;
        if (r0 != 0) {
            duration = Duration.between(r0, ((xnv) this.c).f());
        } else {
            duration = Duration.ZERO;
        }
        return duration.plus((Duration) this.b);
    }

    public final void c(Bundle bundle) {
        if (bundle != null && bundle.containsKey("usage_time")) {
            this.b = Duration.ofMillis(bundle.getLong("usage_time"));
            e();
        } else {
            e();
        }
    }

    public final void d(Bundle bundle) {
        Duration b = b();
        if (!b.isZero()) {
            bundle.putLong("usage_time", b.toMillis());
        }
    }

    public final void e() {
        this.a = ((xnv) this.c).f();
    }

    public final long f() {
        Object obj = this.a;
        if (obj != null) {
            return ((fln) obj).c;
        }
        return -1L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0050, code lost:
    
        if (r6.c != r11) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0071, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x006e, code lost:
    
        if (r6.c != r11) goto L38;
     */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.lang.Object, flu] */
    /* JADX WARN: Type inference failed for: r8v2, types: [flx, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(defpackage.eqe r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, defpackage.flw r15) {
        /*
            r7 = this;
            fln r6 = new fln
            r0 = r6
            r1 = r8
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4)
            r7.a = r6
            java.lang.Object r8 = r7.b
            if (r8 == 0) goto L10
            return
        L10:
            java.lang.Object r8 = r7.c
            flu[] r8 = r8.a(r9, r10)
            int r9 = r8.length
            alob r10 = defpackage.alog.d(r9)
            r13 = 0
            r14 = 1
            if (r9 != r14) goto L24
            r8 = r8[r13]
            r7.b = r8
            goto L81
        L24:
            r0 = r13
        L25:
            if (r0 >= r9) goto L7d
            r1 = r8[r0]
            boolean r2 = r1.g(r6)     // Catch: java.lang.Throwable -> L53 java.io.EOFException -> L66
            if (r2 == 0) goto L41
            r7.b = r1     // Catch: java.lang.Throwable -> L53 java.io.EOFException -> L66
            if (r1 != 0) goto L39
            long r0 = r6.c
            int r9 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r9 != 0) goto L3a
        L39:
            r13 = r14
        L3a:
            defpackage.dzg.d(r13)
            r6.l()
            goto L7d
        L41:
            java.util.List r1 = r1.d()     // Catch: java.lang.Throwable -> L53 java.io.EOFException -> L66
            r10.j(r1)     // Catch: java.lang.Throwable -> L53 java.io.EOFException -> L66
            java.lang.Object r1 = r7.b
            if (r1 != 0) goto L73
            long r1 = r6.c
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 != 0) goto L71
            goto L73
        L53:
            r8 = move-exception
            java.lang.Object r9 = r7.b
            if (r9 != 0) goto L5e
            long r9 = r6.c
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto L5f
        L5e:
            r13 = r14
        L5f:
            defpackage.dzg.d(r13)
            r6.l()
            throw r8
        L66:
            java.lang.Object r1 = r7.b
            if (r1 != 0) goto L73
            long r1 = r6.c
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 != 0) goto L71
            goto L73
        L71:
            r1 = r13
            goto L74
        L73:
            r1 = r14
        L74:
            defpackage.dzg.d(r1)
            r6.l()
            int r0 = r0 + 1
            goto L25
        L7d:
            java.lang.Object r9 = r7.b
            if (r9 == 0) goto L87
        L81:
            java.lang.Object r8 = r7.b
            r8.e(r15)
            return
        L87:
            fie r9 = new fie
            algs r11 = new algs
            java.lang.String r12 = ", "
            r11.<init>(r12)
            alog r8 = defpackage.alog.p(r8)
            ezr r12 = new ezr
            r13 = 2
            r12.<init>(r13)
            java.util.List r8 = defpackage.alzz.as(r8, r12)
            java.lang.String r8 = r11.d(r8)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "None of the available extractors ("
            r11.<init>(r12)
            r11.append(r8)
            java.lang.String r8 = ") could read the stream."
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            alog r10 = r10.g()
            r9.<init>(r8, r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lxs.g(eqe, android.net.Uri, java.util.Map, long, long, flw):void");
    }

    public lxs(mjd mjdVar) {
        this.c = mjdVar;
    }

    public lxs(byte[] bArr) {
        this.c = new Object();
    }

    public lxs() {
        this.c = new asgm();
    }

    public lxs(xnv xnvVar) {
        this.b = Duration.ZERO;
        this.c = xnvVar;
    }
}
