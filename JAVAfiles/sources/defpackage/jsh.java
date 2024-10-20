package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jsh extends arpw implements arqv {
    Object a;
    int b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    final /* synthetic */ Object f;
    private final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jsh(jgu jguVar, mvw mvwVar, jgp jgpVar, jgt jgtVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.g = i;
        this.e = jguVar;
        this.f = mvwVar;
        this.d = jgpVar;
        this.c = jgtVar;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.g != 0) {
            return ((jsh) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }
        return ((jsh) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x017f  */
    /* JADX WARN: Type inference failed for: r5v1, types: [jhe, java.lang.Object] */
    @Override // defpackage.arpq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r16) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jsh.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        if (this.g != 0) {
            Object obj2 = this.e;
            Object obj3 = this.f;
            return new jsh((jgu) obj2, (mvw) obj3, (jgp) this.d, (jgt) this.c, arpeVar, 1);
        }
        Object obj4 = this.c;
        Object obj5 = this.d;
        return new jsh((jhc) obj4, (jgi) obj5, (jhm) this.e, (jsm) this.f, arpeVar, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jsh(jhc jhcVar, jgi jgiVar, jhm jhmVar, jsm jsmVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.g = i;
        this.c = jhcVar;
        this.d = jgiVar;
        this.e = jhmVar;
        this.f = jsmVar;
    }
}
