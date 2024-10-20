package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bkx extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
    int a;
    final /* synthetic */ zj b;
    final /* synthetic */ float c;
    final /* synthetic */ boolean d;
    final /* synthetic */ bky e;
    final /* synthetic */ ajp f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bkx(zj zjVar, float f, boolean z, bky bkyVar, ajp ajpVar, arpe arpeVar) {
        super(2, arpeVar);
        this.b = zjVar;
        this.c = f;
        this.d = z;
        this.e = bkyVar;
        this.f = ajpVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bkx) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0085, code lost:
    
        if (defpackage.btb.a(r1, r2, r6, r3, r5) == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0031, code lost:
    
        if (r6.e(r3, r5) == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0087, code lost:
    
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
            if (r1 == 0) goto Lc
            goto L88
        Lc:
            zj r6 = r5.b
            java.lang.Object r6 = r6.c()
            dqy r6 = (defpackage.dqy) r6
            float r6 = r6.a
            float r1 = r5.c
            boolean r6 = defpackage.dqy.b(r6, r1)
            if (r6 != 0) goto L88
            boolean r6 = r5.d
            if (r6 != 0) goto L34
            zj r6 = r5.b
            float r1 = r5.c
            dqy r3 = new dqy
            r3.<init>(r1)
            r5.a = r2
            java.lang.Object r6 = r6.e(r3, r5)
            if (r6 != r0) goto L88
            goto L87
        L34:
            zj r6 = r5.b
            java.lang.Object r6 = r6.c()
            dqy r6 = (defpackage.dqy) r6
            float r6 = r6.a
            r1 = 0
            boolean r2 = defpackage.dqy.b(r6, r1)
            if (r2 == 0) goto L4d
            ajt$b r6 = new ajt$b
            r1 = 0
            r6.<init>(r1)
            goto L78
        L4d:
            bky r2 = r5.e
            float r2 = r2.a
            boolean r2 = defpackage.dqy.b(r6, r2)
            if (r2 == 0) goto L5d
            ajn r6 = new ajn
            r6.<init>()
            goto L78
        L5d:
            boolean r1 = defpackage.dqy.b(r6, r1)
            if (r1 == 0) goto L69
            ajk r6 = new ajk
            r6.<init>()
            goto L78
        L69:
            r1 = 1086324736(0x40c00000, float:6.0)
            boolean r6 = defpackage.dqy.b(r6, r1)
            if (r6 == 0) goto L77
            aji r6 = new aji
            r6.<init>()
            goto L78
        L77:
            r6 = 0
        L78:
            zj r1 = r5.b
            float r2 = r5.c
            ajp r3 = r5.f
            r4 = 2
            r5.a = r4
            java.lang.Object r6 = defpackage.btb.a(r1, r2, r6, r3, r5)
            if (r6 != r0) goto L88
        L87:
            return r0
        L88:
            arnb r6 = defpackage.arnb.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bkx.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new bkx(this.b, this.c, this.d, this.e, this.f, arpeVar);
    }
}
