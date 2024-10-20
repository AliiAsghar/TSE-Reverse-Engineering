package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class gca extends arpw implements arqv {
    Object a;
    Object b;
    int c;
    final /* synthetic */ gcc d;
    private /* synthetic */ Object e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gca(gcc gccVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.f = i;
        this.d = gccVar;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.f != 0) {
            return ((gca) c((gdt) obj, (arpe) obj2)).b(arnb.a);
        }
        return ((gca) c((asaj) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0124, code lost:
    
        if (r2.fv(r4, r8) == r0) goto L51;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00b6  */
    @Override // defpackage.arpq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gca.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        if (this.f != 0) {
            gca gcaVar = new gca(this.d, arpeVar, 1, null);
            gcaVar.e = obj;
            return gcaVar;
        }
        gca gcaVar2 = new gca(this.d, arpeVar, 0);
        gcaVar2.e = obj;
        return gcaVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gca(gcc gccVar, arpe arpeVar, int i, byte[] bArr) {
        super(2, arpeVar);
        this.f = i;
        this.d = gccVar;
    }
}
