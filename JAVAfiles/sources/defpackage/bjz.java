package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bjz extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
    int a;
    final /* synthetic */ bpq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bjz(bpq bpqVar, arpe arpeVar) {
        super(2, arpeVar);
        this.b = bpqVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bjz) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        if (r4.f(r3) == r0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if (r4.e(r3) == r0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
    
        return r0;
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
            int r1 = r3.a
            r2 = 1
            defpackage.aqil.P(r4)
            if (r1 == 0) goto Lb
            goto L24
        Lb:
            bpq r4 = r3.b
            boolean r1 = r4.b
            if (r1 != 0) goto L1a
            r3.a = r2
            java.lang.Object r4 = r4.e(r3)
            if (r4 != r0) goto L24
            goto L23
        L1a:
            r1 = 2
            r3.a = r1
            java.lang.Object r4 = r4.f(r3)
            if (r4 != r0) goto L24
        L23:
            return r0
        L24:
            arnb r4 = defpackage.arnb.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bjz.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new bjz(this.b, arpeVar);
    }
}
