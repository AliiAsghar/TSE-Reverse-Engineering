package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uwo extends unp {
    public final Optional b;
    public final armf c;
    public final oat d;
    private final arwe f;
    private final uwu g;
    private final armf h;
    private final ahiy i;
    private final ansy j;
    private static final utz e = uuh.e(uuh.b, "gaia_auth_check_result_max_retry", 3);
    public static final xze a = xze.g("BugleGaia", "GaiaAuthCheckResultHandler");

    public uwo(arwe arweVar, Optional optional, ahiy ahiyVar, ansy ansyVar, uwu uwuVar, armf armfVar, armf armfVar2, oat oatVar) {
        arweVar.getClass();
        ahiyVar.getClass();
        ansyVar.getClass();
        uwuVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        this.f = arweVar;
        this.b = optional;
        this.i = ahiyVar;
        this.j = ansyVar;
        this.g = uwuVar;
        this.h = armfVar;
        this.c = armfVar2;
        this.d = oatVar;
    }

    @Override // defpackage.unp, defpackage.unx
    public final unf a() {
        une a2 = unf.a();
        Object e2 = e.e();
        e2.getClass();
        a2.d(((Number) e2).intValue());
        a2.c(unv.WORKMANAGER_ONLY);
        a2.g(gry.LINEAR);
        gsd gsdVar = new gsd();
        gsdVar.c(2);
        a2.a = gsdVar.a();
        return a2.a();
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("GaiaAuthCheckResultHandler");
    }

    @Override // defpackage.unp
    public final /* bridge */ /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        akul c;
        ulh ulhVar = (ulh) apbtVar;
        ulhVar.getClass();
        c = qjh.c(this.f, arpj.a, arwf.a, new qka(this, ulhVar, unsVar, (arpe) null, 13));
        return c;
    }

    @Override // defpackage.unx
    public final apca e() {
        apca parserForType = ulh.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00aa, code lost:
    
        if (r10 != r1) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00b1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(int r8, defpackage.uns r9, defpackage.arpe r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.uwl
            if (r0 == 0) goto L13
            r0 = r10
            uwl r0 = (defpackage.uwl) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            uwl r0 = new uwl
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.c
            arpl r1 = defpackage.arpl.a
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            int r8 = r0.b
            defpackage.aqil.P(r10)
            goto Lac
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            int r8 = r0.b
            java.lang.Object r9 = r0.a
            uwo r2 = r0.f
            defpackage.aqil.P(r10)
            goto L62
        L3f:
            defpackage.aqil.P(r10)
            ansy r10 = r7.j
            ahiy r2 = r7.i
            akfb r2 = r2.B()
            akgd r5 = defpackage.akgd.DONT_CARE
            com.google.common.util.concurrent.ListenableFuture r10 = r10.k(r2, r5)
            r10.getClass()
            r0.f = r7
            r0.a = r9
            r0.b = r8
            r0.e = r4
            java.lang.Object r10 = defpackage.arro.F(r10, r0)
            if (r10 == r1) goto Lc4
            r2 = r7
        L62:
            java.util.List r10 = (java.util.List) r10
            if (r10 == 0) goto Lb2
            java.util.Iterator r10 = r10.iterator()
        L6a:
            boolean r4 = r10.hasNext()
            r5 = 0
            if (r4 == 0) goto L7f
            java.lang.Object r4 = r10.next()
            r6 = r4
            ajza r6 = (defpackage.ajza) r6
            ajwt r6 = r6.a
            int r6 = r6.a
            if (r6 != r8) goto L6a
            goto L80
        L7f:
            r4 = r5
        L80:
            ajza r4 = (defpackage.ajza) r4
            if (r4 == 0) goto Lb2
            ajzb r10 = r4.b
            java.lang.String r10 = r10.i
            java.lang.String r6 = "pseudonymous"
            boolean r10 = defpackage.d.F(r10, r6)
            if (r10 == 0) goto L9c
            xze r9 = defpackage.uwo.a
            java.lang.String r10 = "Gaia authentication not performed because account is pseudonymous"
            r9.q(r10)
            upm r9 = defpackage.upm.d()
            goto Laf
        L9c:
            ajwt r10 = r4.a
            r0.f = r2
            r0.a = r5
            r0.b = r8
            r0.e = r3
            java.lang.Object r10 = r2.k(r10, r9, r0)
            if (r10 == r1) goto Lc4
        Lac:
            r9 = r10
            upm r9 = (defpackage.upm) r9
        Laf:
            if (r9 == 0) goto Lb2
            return r9
        Lb2:
            xze r9 = defpackage.uwo.a
            java.lang.String r10 = "Get GaiaAuthCheckResult failed because unable to find account for Id "
            java.lang.String r0 = "."
            java.lang.String r8 = defpackage.a.cb(r8, r10, r0)
            r9.q(r8)
            upm r8 = defpackage.upm.d()
            return r8
        Lc4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uwo.j(int, uns, arpe):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0072 A[Catch: Exception -> 0x002e, TryCatch #0 {Exception -> 0x002e, blocks: (B:11:0x002a, B:12:0x0057, B:14:0x0072, B:15:0x007d, B:17:0x0081, B:18:0x0097), top: B:10:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0081 A[Catch: Exception -> 0x002e, TryCatch #0 {Exception -> 0x002e, blocks: (B:11:0x002a, B:12:0x0057, B:14:0x0072, B:15:0x007d, B:17:0x0081, B:18:0x0097), top: B:10:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v16, types: [java.util.Set, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(defpackage.ajwt r6, defpackage.uns r7, defpackage.arpe r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.uwm
            if (r0 == 0) goto L13
            r0 = r8
            uwm r0 = (defpackage.uwm) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            uwm r0 = new uwm
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r7 = r0.a
            ajwt r6 = r0.f
            uwo r0 = r0.e
            defpackage.aqil.P(r8)     // Catch: java.lang.Exception -> L2e
            goto L57
        L2e:
            r6 = move-exception
            goto L9e
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            defpackage.aqil.P(r8)
            j$.util.Optional r8 = r5.b     // Catch: java.lang.Exception -> L9c
            java.lang.Object r8 = r8.orElseThrow()     // Catch: java.lang.Exception -> L9c
            uwh r8 = (defpackage.uwh) r8     // Catch: java.lang.Exception -> L9c
            akul r8 = r8.a()     // Catch: java.lang.Exception -> L9c
            r0.e = r5     // Catch: java.lang.Exception -> L9c
            r0.f = r6     // Catch: java.lang.Exception -> L9c
            r0.a = r7     // Catch: java.lang.Exception -> L9c
            r0.d = r3     // Catch: java.lang.Exception -> L9c
            java.lang.Object r8 = defpackage.arro.F(r8, r0)     // Catch: java.lang.Exception -> L9c
            if (r8 != r1) goto L56
            return r1
        L56:
            r0 = r5
        L57:
            uxi r8 = (defpackage.uxi) r8     // Catch: java.lang.Exception -> L2e
            uwu r1 = r0.g     // Catch: java.lang.Exception -> L2e
            armf r2 = r1.d     // Catch: java.lang.Exception -> L2e
            java.lang.Object r2 = r2.b()     // Catch: java.lang.Exception -> L2e
            uac r2 = (defpackage.uac) r2     // Catch: java.lang.Exception -> L2e
            java.lang.Object r2 = r2.b     // Catch: java.lang.Exception -> L2e
            j$.util.Optional r3 = j$.util.Optional.of(r8)     // Catch: java.lang.Exception -> L2e
            java.util.concurrent.atomic.AtomicReference r2 = (java.util.concurrent.atomic.AtomicReference) r2     // Catch: java.lang.Exception -> L2e
            r2.set(r3)     // Catch: java.lang.Exception -> L2e
            boolean r2 = r8 instanceof defpackage.uwk     // Catch: java.lang.Exception -> L2e
            if (r2 == 0) goto L7d
            ahiy r1 = r1.e     // Catch: java.lang.Exception -> L2e
            akul r2 = defpackage.aktp.ag(r4)     // Catch: java.lang.Exception -> L2e
            akfc r3 = defpackage.uwu.a     // Catch: java.lang.Exception -> L2e
            r1.q(r2, r3)     // Catch: java.lang.Exception -> L2e
        L7d:
            boolean r8 = r8 instanceof defpackage.uwj     // Catch: java.lang.Exception -> L2e
            if (r8 == 0) goto L97
            armf r8 = r0.h     // Catch: java.lang.Exception -> L2e
            java.lang.Object r8 = r8.b()     // Catch: java.lang.Exception -> L2e
            uac r8 = (defpackage.uac) r8     // Catch: java.lang.Exception -> L2e
            r6.getClass()     // Catch: java.lang.Exception -> L2e
            java.lang.Object r8 = r8.a     // Catch: java.lang.Exception -> L2e
            int r6 = r6.a     // Catch: java.lang.Exception -> L2e
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Exception -> L2e
            r8.add(r6)     // Catch: java.lang.Exception -> L2e
        L97:
            upm r6 = defpackage.upm.b()     // Catch: java.lang.Exception -> L2e
            goto Lc3
        L9c:
            r6 = move-exception
            r0 = r5
        L9e:
            boolean r7 = r7.c()
            if (r7 == 0) goto Lac
            xze r7 = defpackage.uwo.a
            java.lang.String r8 = "Getting gaia auth check result failed, will retry"
            r7.r(r8, r6)
            goto Lbf
        Lac:
            arwe r7 = r0.f
            uwn r8 = new uwn
            r1 = 0
            r8.<init>(r0, r6, r4, r1)
            r0 = 3
            defpackage.qjh.l(r7, r4, r8, r0)
            xze r7 = defpackage.uwo.a
            java.lang.String r8 = "Getting gaia auth check result failed, no retries left"
            r7.r(r8, r6)
        Lbf:
            upm r6 = defpackage.upm.e()
        Lc3:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uwo.k(ajwt, uns, arpe):java.lang.Object");
    }
}
