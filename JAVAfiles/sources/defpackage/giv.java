package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class giv extends arpw implements arqv {
    Object a;
    Object b;
    Object c;
    int d;
    int e;
    int f;
    int g;
    final /* synthetic */ giw h;
    final /* synthetic */ gjf i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public giv(giw giwVar, gjf gjfVar, arpe arpeVar) {
        super(2, arpeVar);
        this.h = giwVar;
        this.i = gjfVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((giv) c((gjd) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00af, code lost:
    
        if (((defpackage.giw) r6).d(r13, r5, r12) != r0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00ce, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00c9, code lost:
    
        if (((defpackage.giw) r6).c(r13, r5, r12) != r0) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0087  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x00cb -> B:6:0x00cc). Please report as a decompilation issue!!! */
    @Override // defpackage.arpq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.giv.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new giv(this.h, this.i, arpeVar);
    }
}
