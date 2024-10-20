package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mgd extends arpw implements arqv {
    int a;
    int b;
    final /* synthetic */ lfl c;
    private /* synthetic */ Object d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mgd(arpe arpeVar, lfl lflVar, int i) {
        super(2, arpeVar);
        this.e = i;
        this.c = lflVar;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.e;
        if (i != 0) {
            if (i != 1) {
                return ((mgd) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            }
            return ((mgd) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }
        return ((mgd) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x007d, code lost:
    
        if (defpackage.yyb.al((defpackage.aiwu) r4.b, r5, r8) != r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0035, code lost:
    
        if (r9 != r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f8, code lost:
    
        if (defpackage.yyb.al((defpackage.aiwu) r4.b, r5, r8) != r0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00af, code lost:
    
        if (r9 != r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0172, code lost:
    
        if (defpackage.yyb.al((defpackage.aiwu) r5.b, r6, r8) != r0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x012a, code lost:
    
        if (r9 != r0) goto L54;
     */
    @Override // defpackage.arpq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mgd.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        int i = this.e;
        if (i != 0) {
            if (i != 1) {
                mgd mgdVar = new mgd(arpeVar, this.c, 2, (char[]) null);
                mgdVar.d = obj;
                return mgdVar;
            }
            mgd mgdVar2 = new mgd(arpeVar, this.c, 1, (byte[]) null);
            mgdVar2.d = obj;
            return mgdVar2;
        }
        mgd mgdVar3 = new mgd(arpeVar, this.c, 0);
        mgdVar3.d = obj;
        return mgdVar3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mgd(arpe arpeVar, lfl lflVar, int i, byte[] bArr) {
        super(2, arpeVar);
        this.e = i;
        this.c = lflVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mgd(arpe arpeVar, lfl lflVar, int i, char[] cArr) {
        super(2, arpeVar);
        this.e = i;
        this.c = lflVar;
    }
}
