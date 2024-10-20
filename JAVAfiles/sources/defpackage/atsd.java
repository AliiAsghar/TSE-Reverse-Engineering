package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class atsd extends arpw implements arqv {
    Object a;
    int b;
    final /* synthetic */ atsg c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atsd(atsg atsgVar, arpe arpeVar) {
        super(2, arpeVar);
        this.c = atsgVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((atsd) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
    
        if (r5 != r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002d, code lost:
    
        if (r5 != r0) goto L13;
     */
    @Override // defpackage.arpq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r5) {
        /*
            r4 = this;
            arpl r0 = defpackage.arpl.a
            int r1 = r4.b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1a
            if (r1 == r3) goto L16
            if (r1 == r2) goto L12
            java.lang.Object r0 = r4.a
            defpackage.aqil.P(r5)
            goto L5f
        L12:
            defpackage.aqil.P(r5)     // Catch: defpackage.qyp -> L4a
            goto L43
        L16:
            defpackage.aqil.P(r5)     // Catch: defpackage.qyp -> L4a
            goto L2f
        L1a:
            defpackage.aqil.P(r5)
            atsg r5 = r4.c     // Catch: defpackage.qyp -> L4a
            java.lang.Object r5 = r5.d     // Catch: defpackage.qyp -> L4a
            qyo r5 = (defpackage.qyo) r5     // Catch: defpackage.qyp -> L4a
            akul r5 = r5.a()     // Catch: defpackage.qyp -> L4a
            r4.b = r3     // Catch: defpackage.qyp -> L4a
            java.lang.Object r5 = defpackage.arro.F(r5, r4)     // Catch: defpackage.qyp -> L4a
            if (r5 == r0) goto L6d
        L2f:
            ajwt r5 = (defpackage.ajwt) r5     // Catch: defpackage.qyp -> L4a
            atsg r1 = r4.c     // Catch: defpackage.qyp -> L4a
            java.lang.Object r1 = r1.c     // Catch: defpackage.qyp -> L4a
            ahiy r1 = (defpackage.ahiy) r1     // Catch: defpackage.qyp -> L4a
            com.google.common.util.concurrent.ListenableFuture r5 = r1.C(r5)     // Catch: defpackage.qyp -> L4a
            r4.b = r2     // Catch: defpackage.qyp -> L4a
            java.lang.Object r5 = defpackage.arro.F(r5, r4)     // Catch: defpackage.qyp -> L4a
            if (r5 == r0) goto L6d
        L43:
            ajza r5 = (defpackage.ajza) r5     // Catch: defpackage.qyp -> L4a
            ajzb r5 = r5.b     // Catch: defpackage.qyp -> L4a
            java.lang.String r5 = r5.e     // Catch: defpackage.qyp -> L4a
            goto L4c
        L4a:
            java.lang.String r5 = ""
        L4c:
            atsg r1 = r4.c
            r4.a = r5
            r2 = 3
            r4.b = r2
            java.lang.Object r2 = r1.e
            ajwt r2 = (defpackage.ajwt) r2
            java.lang.Object r1 = r1.a(r2, r4)
            if (r1 == r0) goto L6d
            r0 = r5
            r5 = r1
        L5f:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            atsh r1 = new atsh
            java.lang.String r0 = (java.lang.String) r0
            r1.<init>(r0, r5)
            return r1
        L6d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atsd.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new atsd(this.c, arpeVar);
    }
}
