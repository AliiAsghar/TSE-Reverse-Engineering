package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class quu implements qvv {
    public static final /* synthetic */ int f = 0;
    public final armf a;
    public final msk b;
    public final oep c;
    public final arwe d;
    public final lgg e;
    private final armf g;
    private final arwe h;

    static {
        alwo.o("BugleCME");
    }

    public quu(armf armfVar, armf armfVar2, lgg lggVar, msk mskVar, oep oepVar, arwe arweVar, arwe arweVar2) {
        armfVar.getClass();
        armfVar2.getClass();
        lggVar.getClass();
        mskVar.getClass();
        oepVar.getClass();
        arweVar.getClass();
        arweVar2.getClass();
        this.a = armfVar;
        this.g = armfVar2;
        this.e = lggVar;
        this.b = mskVar;
        this.c = oepVar;
        this.h = arweVar;
        this.d = arweVar2;
    }

    @Override // defpackage.qvv
    public final akul a() {
        akul c;
        c = qjh.c(this.h, arpj.a, arwf.a, new qrr(this, (arpe) null, 3));
        return c;
    }

    @Override // defpackage.qvv
    @armg
    public final akul b(qwe qweVar) {
        akul c;
        qweVar.getClass();
        c = qjh.c(this.h, arpj.a, arwf.a, new qsk(this, qweVar, (arpe) null, 3));
        return c;
    }

    @Override // defpackage.qvv
    @armg
    public final akul c() {
        akul c;
        c = qjh.c(this.h, arpj.a, arwf.a, new qrr(this, (arpe) null, 4, (byte[]) null));
        return c;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005e A[PHI: r6
  0x005e: PHI (r6v7 java.lang.Object) = (r6v6 java.lang.Object), (r6v1 java.lang.Object) binds: [B:17:0x005b, B:10:0x0026] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.qvv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.arpe r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.qup
            if (r0 == 0) goto L13
            r0 = r6
            qup r0 = (defpackage.qup) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            qup r0 = new qup
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
            goto L5e
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            quu r2 = r0.d
            defpackage.aqil.P(r6)
            goto L46
        L38:
            defpackage.aqil.P(r6)
            r0.d = r5
            r0.c = r4
            java.lang.Object r6 = r5.h(r0)
            if (r6 == r1) goto L5f
            r2 = r5
        L46:
            qvl r6 = (defpackage.qvl) r6
            armf r2 = r2.a
            java.lang.Object r2 = r2.b()
            qvb r2 = (defpackage.qvb) r2
            java.util.Set r6 = r6.a
            r4 = 0
            r0.d = r4
            r0.c = r3
            java.lang.Object r6 = r2.c(r6, r0)
            if (r6 != r1) goto L5e
            return r1
        L5e:
            return r6
        L5f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.quu.d(arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.qvv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.arpe r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.quq
            if (r0 == 0) goto L13
            r0 = r6
            quq r0 = (defpackage.quq) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            quq r0 = new quq
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            akrh r0 = r0.d
            defpackage.aqil.P(r6)     // Catch: java.lang.Throwable -> L29
            goto L51
        L29:
            r6 = move-exception
            goto L5b
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L33:
            defpackage.aqil.P(r6)
            java.lang.String r6 = "BaseMyIdentityManager::getAll"
            akrh r6 = defpackage.aktp.e(r6)
            armf r2 = r5.a     // Catch: java.lang.Throwable -> L57
            java.lang.Object r2 = r2.b()     // Catch: java.lang.Throwable -> L57
            qvb r2 = (defpackage.qvb) r2     // Catch: java.lang.Throwable -> L57
            r0.d = r6     // Catch: java.lang.Throwable -> L57
            r0.c = r3     // Catch: java.lang.Throwable -> L57
            java.lang.Object r0 = r2.b(r0)     // Catch: java.lang.Throwable -> L57
            if (r0 == r1) goto L56
            r4 = r0
            r0 = r6
            r6 = r4
        L51:
            r1 = 0
            defpackage.armd.i(r0, r1)
            return r6
        L56:
            return r1
        L57:
            r0 = move-exception
            r4 = r0
            r0 = r6
            r6 = r4
        L5b:
            throw r6     // Catch: java.lang.Throwable -> L5c
        L5c:
            r1 = move-exception
            defpackage.armd.i(r0, r6)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.quu.e(arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.qvv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(defpackage.qwe r6, defpackage.arpe r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.qur
            if (r0 == 0) goto L13
            r0 = r7
            qur r0 = (defpackage.qur) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            qur r0 = new qur
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            akrh r6 = r0.d
            defpackage.aqil.P(r7)     // Catch: java.lang.Throwable -> L29
            goto L51
        L29:
            r7 = move-exception
            goto L5b
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            defpackage.aqil.P(r7)
            java.lang.String r7 = "BaseMyIdentityManager::getMyIdentity"
            akrh r7 = defpackage.aktp.e(r7)
            armf r2 = r5.a     // Catch: java.lang.Throwable -> L57
            java.lang.Object r2 = r2.b()     // Catch: java.lang.Throwable -> L57
            qvb r2 = (defpackage.qvb) r2     // Catch: java.lang.Throwable -> L57
            r0.d = r7     // Catch: java.lang.Throwable -> L57
            r0.c = r3     // Catch: java.lang.Throwable -> L57
            java.lang.Object r6 = r2.d(r6, r0)     // Catch: java.lang.Throwable -> L57
            if (r6 == r1) goto L56
            r4 = r7
            r7 = r6
            r6 = r4
        L51:
            r0 = 0
            defpackage.armd.i(r6, r0)
            return r7
        L56:
            return r1
        L57:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L5b:
            throw r7     // Catch: java.lang.Throwable -> L5c
        L5c:
            r0 = move-exception
            defpackage.armd.i(r6, r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.quu.f(qwe, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.qvv
    @defpackage.armg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(defpackage.arpe r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.qus
            if (r0 == 0) goto L13
            r0 = r5
            qus r0 = (defpackage.qus) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            qus r0 = new qus
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            quu r0 = r0.d
            defpackage.aqil.P(r5)
            goto L40
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            defpackage.aqil.P(r5)
            r0.d = r4
            r0.c = r3
            java.lang.Object r5 = r4.h(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            r0 = r4
        L40:
            qvl r5 = (defpackage.qvl) r5
            lgg r5 = r0.e
            qab r0 = new qab
            r1 = 14
            r0.<init>(r1)
            r5.g(r0)
            arnb r5 = defpackage.arnb.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.quu.g(arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(defpackage.arpe r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.qut
            if (r0 == 0) goto L13
            r0 = r7
            qut r0 = (defpackage.qut) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            qut r0 = new qut
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            akrh r0 = r0.d
            defpackage.aqil.P(r7)     // Catch: java.lang.Throwable -> L29
            goto L5d
        L29:
            r7 = move-exception
            goto L67
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L33:
            defpackage.aqil.P(r7)
            java.lang.String r7 = "BaseMyIdentityManager::updateMyIdentities"
            akrh r7 = defpackage.aktp.e(r7)
            armf r2 = r6.a     // Catch: java.lang.Throwable -> L63
            java.lang.Object r2 = r2.b()     // Catch: java.lang.Throwable -> L63
            qvb r2 = (defpackage.qvb) r2     // Catch: java.lang.Throwable -> L63
            armf r4 = r6.g     // Catch: java.lang.Throwable -> L63
            java.lang.Object r4 = r4.b()     // Catch: java.lang.Throwable -> L63
            yjy r4 = (defpackage.yjy) r4     // Catch: java.lang.Throwable -> L63
            java.util.List r4 = r4.l()     // Catch: java.lang.Throwable -> L63
            r0.d = r7     // Catch: java.lang.Throwable -> L63
            r0.c = r3     // Catch: java.lang.Throwable -> L63
            java.lang.Object r0 = r2.f(r4, r0)     // Catch: java.lang.Throwable -> L63
            if (r0 == r1) goto L62
            r5 = r0
            r0 = r7
            r7 = r5
        L5d:
            r1 = 0
            defpackage.armd.i(r0, r1)
            return r7
        L62:
            return r1
        L63:
            r0 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
        L67:
            throw r7     // Catch: java.lang.Throwable -> L68
        L68:
            r1 = move-exception
            defpackage.armd.i(r0, r7)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.quu.h(arpe):java.lang.Object");
    }
}
