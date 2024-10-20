package defpackage;

import android.net.ConnectivityManager;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uph {
    public static final uuf a = uuh.l(uuh.b, "network_callback_no_network_timeout_millis", 400);
    public final pqr b;
    public final ascd c;
    public final ascc d;
    private final upg e;

    public uph(ConnectivityManager connectivityManager, pqr pqrVar, arwe arweVar) {
        connectivityManager.getClass();
        arweVar.getClass();
        this.b = pqrVar;
        this.c = ascy.a(arnw.a);
        this.d = asck.e(1, 0, 0, 6);
        upg upgVar = new upg(this, connectivityManager);
        this.e = upgVar;
        connectivityManager.registerDefaultNetworkCallback(upgVar);
        qjh.l(arweVar, null, new txt(this, (arpe) null, 7), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
    
        if (r6 != r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.arpe r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.upd
            if (r0 == 0) goto L13
            r0 = r6
            upd r0 = (defpackage.upd) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            upd r0 = new upd
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.aqil.P(r6)
            goto L56
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            uph r2 = r0.d
            defpackage.aqil.P(r6)
            goto L48
        L38:
            defpackage.aqil.P(r6)
            ascc r6 = r5.d
            r0.d = r5
            r0.c = r4
            java.lang.Object r6 = defpackage.arrn.U(r6, r0)
            if (r6 == r1) goto L62
            r2 = r5
        L48:
            ascd r6 = r2.c
            r2 = 0
            r0.d = r2
            r0.c = r3
            java.lang.Object r6 = defpackage.arrn.U(r6, r0)
            if (r6 != r1) goto L56
            goto L62
        L56:
            java.util.Map r6 = (java.util.Map) r6
            boolean r6 = r6.isEmpty()
            r6 = r6 ^ r4
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        L62:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uph.a(arpe):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0053, code lost:
    
        if (r6 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.arpe r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.upe
            if (r0 == 0) goto L13
            r0 = r6
            upe r0 = (defpackage.upe) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            upe r0 = new upe
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.aqil.P(r6)
            goto L55
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            uph r2 = r0.d
            defpackage.aqil.P(r6)
            goto L48
        L38:
            defpackage.aqil.P(r6)
            ascc r6 = r5.d
            r0.d = r5
            r0.c = r4
            java.lang.Object r6 = defpackage.arrn.U(r6, r0)
            if (r6 == r1) goto L87
            r2 = r5
        L48:
            ascd r6 = r2.c
            r2 = 0
            r0.d = r2
            r0.c = r3
            java.lang.Object r6 = defpackage.arrn.U(r6, r0)
            if (r6 == r1) goto L87
        L55:
            java.util.Map r6 = (java.util.Map) r6
            boolean r0 = r6.isEmpty()
            r1 = 0
            if (r0 == 0) goto L60
        L5e:
            r4 = r1
            goto L82
        L60:
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L68:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L5e
            java.lang.Object r0 = r6.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getValue()
            android.net.NetworkCapabilities r0 = (android.net.NetworkCapabilities) r0
            r2 = 18
            boolean r0 = r0.hasCapability(r2)
            if (r0 == 0) goto L68
        L82:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            return r6
        L87:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uph.b(arpe):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0053, code lost:
    
        if (r6 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.arpe r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.upf
            if (r0 == 0) goto L13
            r0 = r6
            upf r0 = (defpackage.upf) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            upf r0 = new upf
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.aqil.P(r6)
            goto L55
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            uph r2 = r0.d
            defpackage.aqil.P(r6)
            goto L48
        L38:
            defpackage.aqil.P(r6)
            ascc r6 = r5.d
            r0.d = r5
            r0.c = r4
            java.lang.Object r6 = defpackage.arrn.U(r6, r0)
            if (r6 == r1) goto L87
            r2 = r5
        L48:
            ascd r6 = r2.c
            r2 = 0
            r0.d = r2
            r0.c = r3
            java.lang.Object r6 = defpackage.arrn.U(r6, r0)
            if (r6 == r1) goto L87
        L55:
            java.util.Map r6 = (java.util.Map) r6
            boolean r0 = r6.isEmpty()
            r1 = 0
            if (r0 == 0) goto L60
        L5e:
            r4 = r1
            goto L82
        L60:
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L68:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L5e
            java.lang.Object r0 = r6.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getValue()
            android.net.NetworkCapabilities r0 = (android.net.NetworkCapabilities) r0
            r2 = 11
            boolean r0 = r0.hasCapability(r2)
            if (r0 == 0) goto L68
        L82:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            return r6
        L87:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uph.c(arpe):java.lang.Object");
    }
}
