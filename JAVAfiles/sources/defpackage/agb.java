package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class agb extends arpv implements arqv<cqg, arpe<? super arnb>, Object> {
    int a;
    final /* synthetic */ arqr b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agb(arqr arqrVar, arpe arpeVar) {
        super(arpeVar);
        this.b = arqrVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((agb) c((cqg) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        if (r6 == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0025, code lost:
    
        if (r6 != r0) goto L9;
     */
    @Override // defpackage.arpq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r6) {
        /*
            r5 = this;
            arpl r0 = defpackage.arpl.a
            int r1 = r5.a
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 == r2) goto Ld
            defpackage.aqil.P(r6)
            goto L45
        Ld:
            java.lang.Object r1 = r5.c
            cqg r1 = (defpackage.cqg) r1
            defpackage.aqil.P(r6)
            goto L27
        L15:
            defpackage.aqil.P(r6)
            java.lang.Object r6 = r5.c
            r1 = r6
            cqg r1 = (defpackage.cqg) r1
            r5.c = r1
            r5.a = r2
            java.lang.Object r6 = defpackage.afz.a(r1, r5)
            if (r6 == r0) goto L4f
        L27:
            crc r6 = (defpackage.crc) r6
            r6.b()
            arqr r2 = r5.b
            long r3 = r6.c
            cjn r6 = new cjn
            r6.<init>(r3)
            r2.a(r6)
            r6 = 0
            r5.c = r6
            r6 = 2
            r5.a = r6
            java.lang.Object r6 = defpackage.aik.i(r1, r5)
            if (r6 != r0) goto L45
            goto L4f
        L45:
            crc r6 = (defpackage.crc) r6
            if (r6 == 0) goto L4c
            r6.b()
        L4c:
            arnb r6 = defpackage.arnb.a
            return r6
        L4f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agb.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        agb agbVar = new agb(this.b, arpeVar);
        agbVar.c = obj;
        return agbVar;
    }
}
