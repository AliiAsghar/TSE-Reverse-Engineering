package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qir extends arpw implements arqv {
    Object a;
    Object b;
    int c;
    final /* synthetic */ arqr d;
    final /* synthetic */ arzu e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qir(arzu arzuVar, arqr arqrVar, arpe arpeVar) {
        super(2, arpeVar);
        this.e = arzuVar;
        this.d = arqrVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((qir) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        if (((defpackage.arzk) r1).a(r2, r3) != r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0029, code lost:
    
        if (r4 == r0) goto L19;
     */
    @Override // defpackage.arpq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r4) {
        /*
            r3 = this;
            arpl r0 = defpackage.arpl.a
            int r1 = r3.c
            r2 = 1
            if (r1 == 0) goto L18
            if (r1 == r2) goto Ld
            defpackage.aqil.P(r4)
            goto L47
        Ld:
            java.lang.Object r1 = r3.b
            java.lang.Object r2 = r3.a
            defpackage.aqil.P(r4)     // Catch: java.lang.Throwable -> L15
            goto L31
        L15:
            r4 = move-exception
            r1 = r2
            goto L2d
        L18:
            defpackage.aqil.P(r4)
            arzu r1 = r3.e
            arqr r4 = r3.d     // Catch: java.lang.Throwable -> L2c
            r3.a = r1     // Catch: java.lang.Throwable -> L2c
            r3.b = r1     // Catch: java.lang.Throwable -> L2c
            r3.c = r2     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r4 = r4.a(r3)     // Catch: java.lang.Throwable -> L2c
            if (r4 != r0) goto L31
            goto L46
        L2c:
            r4 = move-exception
        L2d:
            java.lang.Object r4 = defpackage.aqil.O(r4)
        L31:
            armq r2 = new armq
            r2.<init>(r4)
            r4 = 0
            r3.a = r4
            r3.b = r4
            r4 = 2
            r3.c = r4
            arzk r1 = (defpackage.arzk) r1
            java.lang.Object r4 = r1.a(r2, r3)
            if (r4 != r0) goto L47
        L46:
            return r0
        L47:
            arnb r4 = defpackage.arnb.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qir.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new qir(this.e, this.d, arpeVar);
    }
}
