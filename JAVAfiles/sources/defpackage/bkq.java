package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class bkq extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
    int a;
    final /* synthetic */ zj b;
    final /* synthetic */ float c;
    final /* synthetic */ boolean d;
    final /* synthetic */ bkr e;
    final /* synthetic */ ajp f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bkq(zj zjVar, float f, boolean z, bkr bkrVar, ajp ajpVar, arpe arpeVar) {
        super(2, arpeVar);
        this.b = zjVar;
        this.c = f;
        this.d = z;
        this.e = bkrVar;
        this.f = ajpVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bkq) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x007e, code lost:
    
        if (defpackage.btb.a(r1, r2, r6, r3, r5) == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0031, code lost:
    
        if (r6.e(r3, r5) == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0080, code lost:
    
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
            goto L81
        Lc:
            zj r6 = r5.b
            java.lang.Object r6 = r6.c()
            dqy r6 = (defpackage.dqy) r6
            float r6 = r6.a
            float r1 = r5.c
            boolean r6 = defpackage.dqy.b(r6, r1)
            if (r6 != 0) goto L81
            boolean r6 = r5.d
            if (r6 != 0) goto L34
            zj r6 = r5.b
            float r1 = r5.c
            dqy r3 = new dqy
            r3.<init>(r1)
            r5.a = r2
            java.lang.Object r6 = r6.e(r3, r5)
            if (r6 != r0) goto L81
            goto L80
        L34:
            zj r6 = r5.b
            java.lang.Object r6 = r6.c()
            dqy r6 = (defpackage.dqy) r6
            float r6 = r6.a
            bkr r1 = r5.e
            float r1 = r1.b
            boolean r1 = defpackage.dqy.b(r6, r1)
            if (r1 == 0) goto L50
            ajt$b r6 = new ajt$b
            r1 = 0
            r6.<init>(r1)
            goto L71
        L50:
            bkr r1 = r5.e
            float r1 = r1.d
            boolean r1 = defpackage.dqy.b(r6, r1)
            if (r1 == 0) goto L60
            ajn r6 = new ajn
            r6.<init>()
            goto L71
        L60:
            bkr r1 = r5.e
            float r1 = r1.c
            boolean r6 = defpackage.dqy.b(r6, r1)
            if (r6 == 0) goto L70
            ajk r6 = new ajk
            r6.<init>()
            goto L71
        L70:
            r6 = 0
        L71:
            zj r1 = r5.b
            float r2 = r5.c
            ajp r3 = r5.f
            r4 = 2
            r5.a = r4
            java.lang.Object r6 = defpackage.btb.a(r1, r2, r6, r3, r5)
            if (r6 != r0) goto L81
        L80:
            return r0
        L81:
            arnb r6 = defpackage.arnb.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bkq.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new bkq(this.b, this.c, this.d, this.e, this.f, arpeVar);
    }
}
