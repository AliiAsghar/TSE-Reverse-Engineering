package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bph extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
    int a;
    final /* synthetic */ zj b;
    final /* synthetic */ float c;
    final /* synthetic */ boolean d;
    final /* synthetic */ ajp e;
    final /* synthetic */ byn f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bph(zj zjVar, float f, boolean z, ajp ajpVar, byn bynVar, arpe arpeVar) {
        super(2, arpeVar);
        this.b = zjVar;
        this.c = f;
        this.d = z;
        this.e = ajpVar;
        this.f = bynVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bph) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
    
        if (defpackage.btb.a(r1, r2, r6, r3, r5) == r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0030, code lost:
    
        if (r6.e(r3, r5) == r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004a, code lost:
    
        return r0;
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
            defpackage.aqil.P(r6)
            if (r1 == 0) goto Lb
            goto L4b
        Lb:
            zj r6 = r5.b
            java.lang.Object r6 = r6.c()
            dqy r6 = (defpackage.dqy) r6
            float r6 = r6.a
            float r1 = r5.c
            boolean r6 = defpackage.dqy.b(r6, r1)
            if (r6 != 0) goto L52
            boolean r6 = r5.d
            if (r6 != 0) goto L33
            zj r6 = r5.b
            float r1 = r5.c
            dqy r3 = new dqy
            r3.<init>(r1)
            r5.a = r2
            java.lang.Object r6 = r6.e(r3, r5)
            if (r6 != r0) goto L4b
            goto L4a
        L33:
            byn r6 = r5.f
            java.lang.Object r6 = r6.a()
            ajp r6 = (defpackage.ajp) r6
            zj r1 = r5.b
            float r2 = r5.c
            ajp r3 = r5.e
            r4 = 2
            r5.a = r4
            java.lang.Object r6 = defpackage.btb.a(r1, r2, r6, r3, r5)
            if (r6 != r0) goto L4b
        L4a:
            return r0
        L4b:
            byn r6 = r5.f
            ajp r0 = r5.e
            r6.h(r0)
        L52:
            arnb r6 = defpackage.arnb.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bph.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new bph(this.b, this.c, this.d, this.e, this.f, arpeVar);
    }
}
