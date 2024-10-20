package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qmd extends arpw implements arqv {
    int a;
    final /* synthetic */ qmj b;
    final /* synthetic */ int c;
    final /* synthetic */ akmy d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qmd(qmj qmjVar, akmy akmyVar, int i, arpe arpeVar) {
        super(2, arpeVar);
        this.b = qmjVar;
        this.d = akmyVar;
        this.c = i;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((qmd) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a7, code lost:
    
        if (r2 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c8, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0050, code lost:
    
        if (r4 != r1) goto L16;
     */
    @Override // defpackage.arpq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qmd.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        qmd qmdVar = new qmd(this.b, this.d, this.c, arpeVar);
        qmdVar.e = obj;
        return qmdVar;
    }
}
