package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asdb implements asaj {
    private final asaj a;
    private final arqv b;

    public asdb(asaj asajVar, arqv arqvVar) {
        this.a = asajVar;
        this.b = arqvVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006f, code lost:
    
        if (((defpackage.asdb) r7).b(r0) == r1) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [asdz] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.arpe r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.asda
            if (r0 == 0) goto L13
            r0 = r7
            asda r0 = (defpackage.asda) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            asda r0 = new asda
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.aqil.P(r7)
            goto L72
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L32:
            asdz r2 = r0.e
            asdb r4 = r0.d
            defpackage.aqil.P(r7)     // Catch: java.lang.Throwable -> L3a
            goto L59
        L3a:
            r7 = move-exception
            goto L76
        L3c:
            defpackage.aqil.P(r7)
            asaj r7 = r6.a
            asdz r2 = new asdz
            arpi r5 = r0.u()
            r2.<init>(r7, r5)
            arqv r7 = r6.b     // Catch: java.lang.Throwable -> L3a
            r0.d = r6     // Catch: java.lang.Throwable -> L3a
            r0.e = r2     // Catch: java.lang.Throwable -> L3a
            r0.c = r4     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r7 = r7.a(r2, r0)     // Catch: java.lang.Throwable -> L3a
            if (r7 == r1) goto L75
            r4 = r6
        L59:
            r2.g()
            asaj r7 = r4.a
            boolean r2 = r7 instanceof defpackage.asdb
            if (r2 == 0) goto L72
            asdb r7 = (defpackage.asdb) r7
            r2 = 0
            r0.d = r2
            r0.e = r2
            r0.c = r3
            java.lang.Object r7 = r7.b(r0)
            if (r7 != r1) goto L72
            goto L75
        L72:
            arnb r7 = defpackage.arnb.a
            return r7
        L75:
            return r1
        L76:
            r2.g()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asdb.b(arpe):java.lang.Object");
    }

    @Override // defpackage.asaj
    public final Object fv(Object obj, arpe arpeVar) {
        return this.a.fv(obj, arpeVar);
    }
}
