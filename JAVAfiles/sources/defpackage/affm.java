package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class affm extends arpw implements arqv {
    int a;
    int b;
    final /* synthetic */ affq c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public affm(affq affqVar, arpe arpeVar) {
        super(2, arpeVar);
        this.c = affqVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((affm) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0056, code lost:
    
        if (r11 != r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d9, code lost:
    
        if (defpackage.arwi.q(r17) == r0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00db, code lost:
    
        return r0;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00d9 -> B:7:0x003a). Please report as a decompilation issue!!! */
    @Override // defpackage.arpq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.affm.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new affm(this.c, arpeVar);
    }
}
