package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anli extends arpw implements arqr {
    Object a;
    int b;
    final /* synthetic */ String c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    final /* synthetic */ Object f;
    private final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anli(aogy aogyVar, String str, anji anjiVar, anky ankyVar, arpe arpeVar, int i) {
        super(1, arpeVar);
        this.g = i;
        this.e = aogyVar;
        this.c = str;
        this.f = anjiVar;
        this.d = ankyVar;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [anky, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.lang.Iterable] */
    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        int i = this.g;
        if (i != 0) {
            if (i != 1) {
                arpe arpeVar = (arpe) obj;
                return new anli((aogy) this.d, this.c, (Iterable) this.e, (anld) this.f, arpeVar, 2).b(arnb.a);
            }
            arpe arpeVar2 = (arpe) obj;
            Object obj2 = this.e;
            return new anli((aogy) obj2, this.c, (anji) this.f, (anky) this.d, arpeVar2, 1).b(arnb.a);
        }
        arpe arpeVar3 = (arpe) obj;
        Object obj3 = this.d;
        String str = this.c;
        Object obj4 = this.e;
        return new anli((aogy) obj3, str, (aqfn) obj4, (anld) this.f, arpeVar3, 0).b(arnb.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0054, code lost:
    
        return defpackage.aogy.n((defpackage.aqdw) r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0020, code lost:
    
        if (r8 != r0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0143, code lost:
    
        if (r8 == r0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0151, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0114, code lost:
    
        if (r8 != r0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0011, code lost:
    
        if (r3 != 1) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x004b, code lost:
    
        if (r8 == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0055, code lost:
    
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ea  */
    /* JADX WARN: Type inference failed for: r2v13, types: [anjr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v19, types: [anjr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [anjr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [anky, java.lang.Object] */
    @Override // defpackage.arpq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anli.b(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anli(aogy aogyVar, String str, aqfn aqfnVar, anld anldVar, arpe arpeVar, int i) {
        super(1, arpeVar);
        this.g = i;
        this.d = aogyVar;
        this.c = str;
        this.e = aqfnVar;
        this.f = anldVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anli(aogy aogyVar, String str, Iterable iterable, anld anldVar, arpe arpeVar, int i) {
        super(1, arpeVar);
        this.g = i;
        this.d = aogyVar;
        this.c = str;
        this.e = iterable;
        this.f = anldVar;
    }
}
