package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jls extends arpw implements arqv {
    boolean a;
    Object b;
    int c;
    final /* synthetic */ afcq d;
    final /* synthetic */ jlw e;
    final /* synthetic */ jlt f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jls(afcq afcqVar, jlw jlwVar, jlt jltVar, arpe arpeVar) {
        super(2, arpeVar);
        this.d = afcqVar;
        this.e = jlwVar;
        this.f = jltVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((jls) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ca, code lost:
    
        if (r1 != r7) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x017b, code lost:
    
        if (r0 == r7) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x011a  */
    /* JADX WARN: Type inference failed for: r3v2, types: [ascv, java.lang.Object] */
    @Override // defpackage.arpq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jls.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new jls(this.d, this.e, this.f, arpeVar);
    }
}
