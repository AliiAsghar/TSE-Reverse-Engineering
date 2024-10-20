package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gja implements asaj {
    final /* synthetic */ asaj a;
    final /* synthetic */ gid b;
    final /* synthetic */ arqr c;

    public gja(asaj asajVar, gid gidVar, arqr arqrVar) {
        this.a = asajVar;
        this.b = gidVar;
        this.c = arqrVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
    
        if (r7.fv(r8, r0) != r1) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.asaj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object fv(java.lang.Object r7, defpackage.arpe r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.giz
            if (r0 == 0) goto L13
            r0 = r8
            giz r0 = (defpackage.giz) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            giz r0 = new giz
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.aqil.P(r8)
            goto L5c
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            java.lang.Object r7 = r0.c
            defpackage.aqil.P(r8)
            goto L50
        L38:
            defpackage.aqil.P(r8)
            asaj r8 = r6.a
            java.util.Set r7 = (java.util.Set) r7
            gid r7 = r6.b
            arqr r2 = r6.c
            r0.c = r8
            r0.b = r4
            java.lang.Object r7 = defpackage.gvf.bB(r7, r4, r2, r0)
            if (r7 == r1) goto L5f
            r5 = r8
            r8 = r7
            r7 = r5
        L50:
            r2 = 0
            r0.c = r2
            r0.b = r3
            java.lang.Object r7 = r7.fv(r8, r0)
            if (r7 != r1) goto L5c
            goto L5f
        L5c:
            arnb r7 = defpackage.arnb.a
            return r7
        L5f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gja.fv(java.lang.Object, arpe):java.lang.Object");
    }
}
