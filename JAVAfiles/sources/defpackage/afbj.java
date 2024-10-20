package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class afbj extends arpv implements arqv {
    int a;
    final /* synthetic */ arwe b;
    final /* synthetic */ boolean c;
    final /* synthetic */ arqr d;
    final /* synthetic */ afbo e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afbj(arwe arweVar, boolean z, arqr arqrVar, afbo afboVar, arpe arpeVar) {
        super(arpeVar);
        this.b = arweVar;
        this.c = z;
        this.d = arqrVar;
        this.e = afboVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((afbj) c((cqg) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
    
        if (r9 != r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003a, code lost:
    
        if (defpackage.aik.j(r1, r8, 2) != r0) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0077 A[Catch: cqt -> 0x009b, TryCatch #0 {cqt -> 0x009b, blocks: (B:6:0x000e, B:7:0x0065, B:9:0x0069, B:13:0x0077, B:15:0x0098, B:16:0x0012, B:17:0x0057, B:19:0x003c, B:21:0x0040, B:24:0x005a), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0069 A[Catch: cqt -> 0x009b, TryCatch #0 {cqt -> 0x009b, blocks: (B:6:0x000e, B:7:0x0065, B:9:0x0069, B:13:0x0077, B:15:0x0098, B:16:0x0012, B:17:0x0057, B:19:0x003c, B:21:0x0040, B:24:0x005a), top: B:2:0x0008 }] */
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
            r2 = 1
            r3 = 3
            r4 = 2
            r5 = 0
            if (r1 == 0) goto L1e
            if (r1 == r2) goto L16
            if (r1 == r4) goto L12
            defpackage.aqil.P(r9)     // Catch: defpackage.cqt -> L9b
            goto L65
        L12:
            defpackage.aqil.P(r9)     // Catch: defpackage.cqt -> L9b
            goto L57
        L16:
            java.lang.Object r1 = r8.f
            cqg r1 = (defpackage.cqg) r1
            defpackage.aqil.P(r9)
            goto L3c
        L1e:
            defpackage.aqil.P(r9)
            java.lang.Object r9 = r8.f
            r1 = r9
            cqg r1 = (defpackage.cqg) r1
            arwe r9 = r8.b
            afbo r6 = r8.e
            aely r7 = new aely
            r7.<init>(r6, r5, r4)
            defpackage.arrn.J(r9, r5, r5, r7, r3)
            r8.f = r1
            r8.a = r2
            java.lang.Object r9 = defpackage.aik.j(r1, r8, r4)
            if (r9 == r0) goto L9e
        L3c:
            boolean r9 = r8.c     // Catch: defpackage.cqt -> L9b
            if (r9 == 0) goto L5a
            deo r9 = r1.q()     // Catch: defpackage.cqt -> L9b
            long r6 = r9.f()     // Catch: defpackage.cqt -> L9b
            afbi r9 = new afbi     // Catch: defpackage.cqt -> L9b
            r9.<init>(r5)     // Catch: defpackage.cqt -> L9b
            r8.f = r5     // Catch: defpackage.cqt -> L9b
            r8.a = r4     // Catch: defpackage.cqt -> L9b
            java.lang.Object r9 = r1.s(r6, r9, r8)     // Catch: defpackage.cqt -> L9b
            if (r9 == r0) goto L9e
        L57:
            crc r9 = (defpackage.crc) r9     // Catch: defpackage.cqt -> L9b
            goto L67
        L5a:
            r8.f = r5     // Catch: defpackage.cqt -> L9b
            r8.a = r3     // Catch: defpackage.cqt -> L9b
            java.lang.Object r9 = defpackage.adom.bo(r1, r8)     // Catch: defpackage.cqt -> L9b
            if (r9 != r0) goto L65
            goto L9e
        L65:
            crc r9 = (defpackage.crc) r9     // Catch: defpackage.cqt -> L9b
        L67:
            if (r9 != 0) goto L77
            arwe r9 = r8.b     // Catch: defpackage.cqt -> L9b
            afbh r0 = new afbh     // Catch: defpackage.cqt -> L9b
            afbo r1 = r8.e     // Catch: defpackage.cqt -> L9b
            r2 = 0
            r0.<init>(r1, r5, r2)     // Catch: defpackage.cqt -> L9b
            defpackage.arrn.J(r9, r5, r5, r0, r3)     // Catch: defpackage.cqt -> L9b
            goto L9b
        L77:
            arwe r0 = r8.b     // Catch: defpackage.cqt -> L9b
            afbh r1 = new afbh     // Catch: defpackage.cqt -> L9b
            afbo r2 = r8.e     // Catch: defpackage.cqt -> L9b
            r1.<init>(r2, r5, r4, r5)     // Catch: defpackage.cqt -> L9b
            defpackage.arrn.J(r0, r5, r5, r1, r3)     // Catch: defpackage.cqt -> L9b
            arqr r0 = r8.d     // Catch: defpackage.cqt -> L9b
            long r1 = r9.c     // Catch: defpackage.cqt -> L9b
            cjn r3 = new cjn     // Catch: defpackage.cqt -> L9b
            r3.<init>(r1)     // Catch: defpackage.cqt -> L9b
            java.lang.Object r0 = r0.a(r3)     // Catch: defpackage.cqt -> L9b
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: defpackage.cqt -> L9b
            boolean r0 = r0.booleanValue()     // Catch: defpackage.cqt -> L9b
            if (r0 == 0) goto L9b
            r9.b()     // Catch: defpackage.cqt -> L9b
        L9b:
            arnb r9 = defpackage.arnb.a
            return r9
        L9e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afbj.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        afbj afbjVar = new afbj(this.b, this.c, this.d, this.e, arpeVar);
        afbjVar.f = obj;
        return afbjVar;
    }
}
