package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class lxb extends arpw implements arqv {
    int a;
    final /* synthetic */ lxd b;
    final /* synthetic */ lwy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lxb(lxd lxdVar, lwy lwyVar, arpe arpeVar) {
        super(2, arpeVar);
        this.b = lxdVar;
        this.c = lwyVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((lxb) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a5, code lost:
    
        if (r12 != r1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00f0, code lost:
    
        if (r12 != defpackage.arpl.a) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0174, code lost:
    
        if (r12 != defpackage.arpl.a) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0197, code lost:
    
        if (r12 != defpackage.arpl.a) goto L50;
     */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.io.Closeable, java.lang.Object] */
    @Override // defpackage.arpq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lxb.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new lxb(this.b, this.c, arpeVar);
    }
}
