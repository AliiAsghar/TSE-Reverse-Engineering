package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class asct extends arpw implements arqw {
    int a;
    /* synthetic */ int b;
    final /* synthetic */ ascu c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public asct(ascu ascuVar, arpe arpeVar) {
        super(3, arpeVar);
        this.c = ascuVar;
    }

    @Override // defpackage.arqw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj2).intValue();
        asct asctVar = new asct(this.c, (arpe) obj3);
        asctVar.d = (asaj) obj;
        asctVar.b = intValue;
        return asctVar.b(arnb.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006c, code lost:
    
        if (defpackage.arwi.m(r9.c, r8) != r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
    
        if (r9 != r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003a, code lost:
    
        if (r9.fv(r1, r8) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x007a, code lost:
    
        if (r1.fv(r9, r8) == r0) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Type inference failed for: r9v1, types: [asaj, java.lang.Object] */
    @Override // defpackage.arpq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r9) {
        /*
            r8 = this;
            arpl r0 = defpackage.arpl.a
            int r1 = r8.a
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L29
            if (r1 == r5) goto L25
            if (r1 == r4) goto L1f
            if (r1 == r3) goto L19
            if (r1 == r2) goto L13
            goto L25
        L13:
            java.lang.Object r1 = r8.d
            defpackage.aqil.P(r9)
            goto L6e
        L19:
            java.lang.Object r1 = r8.d
            defpackage.aqil.P(r9)
            goto L60
        L1f:
            java.lang.Object r1 = r8.d
            defpackage.aqil.P(r9)
            goto L4a
        L25:
            defpackage.aqil.P(r9)
            goto L7d
        L29:
            defpackage.aqil.P(r9)
            java.lang.Object r9 = r8.d
            int r1 = r8.b
            if (r1 <= 0) goto L3d
            ascm r1 = defpackage.ascm.a
            r8.a = r5
            java.lang.Object r9 = r9.fv(r1, r8)
            if (r9 != r0) goto L7d
            goto L80
        L3d:
            ascu r1 = r8.c
            r8.a = r4
            long r4 = r1.b
            java.lang.Object r1 = defpackage.arwi.m(r4, r8)
            if (r1 == r0) goto L80
            r1 = r9
        L4a:
            ascu r9 = r8.c
            long r4 = r9.c
            r6 = 0
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 <= 0) goto L6e
            ascm r9 = defpackage.ascm.b
            r8.d = r1
            r8.a = r3
            java.lang.Object r9 = r1.fv(r9, r8)
            if (r9 == r0) goto L80
        L60:
            ascu r9 = r8.c
            r8.d = r1
            r8.a = r2
            long r2 = r9.c
            java.lang.Object r9 = defpackage.arwi.m(r2, r8)
            if (r9 == r0) goto L80
        L6e:
            ascm r9 = defpackage.ascm.c
            r2 = 0
            r8.d = r2
            r2 = 5
            r8.a = r2
            java.lang.Object r9 = r1.fv(r9, r8)
            if (r9 != r0) goto L7d
            goto L80
        L7d:
            arnb r9 = defpackage.arnb.a
            return r9
        L80:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asct.b(java.lang.Object):java.lang.Object");
    }
}
