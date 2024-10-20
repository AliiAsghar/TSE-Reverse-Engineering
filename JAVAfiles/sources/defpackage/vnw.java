package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class vnw extends arpw implements arqw {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ pnl c;
    final /* synthetic */ qhd d;
    final /* synthetic */ qdx e;
    private /* synthetic */ Object f;
    private final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vnw(pnl pnlVar, qhd qhdVar, qdx qdxVar, arpe arpeVar, int i) {
        super(3, arpeVar);
        this.g = i;
        this.c = pnlVar;
        this.d = qhdVar;
        this.e = qdxVar;
    }

    @Override // defpackage.arqw
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        if (this.g != 0) {
            vnw vnwVar = new vnw(this.c, this.d, this.e, (arpe) obj3, 1, null);
            vnwVar.f = (mnu) obj;
            vnwVar.b = (uns) obj2;
            return vnwVar.b(arnb.a);
        }
        vnw vnwVar2 = new vnw(this.c, this.d, this.e, (arpe) obj3, 0);
        vnwVar2.f = (vny) obj;
        vnwVar2.b = (uns) obj2;
        return vnwVar2.b(arnb.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0010, code lost:
    
        if (r4 != 1) goto L23;
     */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, uns] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, uns] */
    @Override // defpackage.arpq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 449
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vnw.b(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vnw(pnl pnlVar, qhd qhdVar, qdx qdxVar, arpe arpeVar, int i, byte[] bArr) {
        super(3, arpeVar);
        this.g = i;
        this.c = pnlVar;
        this.d = qhdVar;
        this.e = qdxVar;
    }
}
