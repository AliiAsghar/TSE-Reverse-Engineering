package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jlz extends arpw implements arqv {
    int a;
    final /* synthetic */ jmc b;
    final /* synthetic */ List c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jlz(jmc jmcVar, List list, int i, arpe arpeVar) {
        super(2, arpeVar);
        this.b = jmcVar;
        this.c = list;
        this.d = i;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((jlz) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x014a, code lost:
    
        if (r2 == r1) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0181, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0135, code lost:
    
        if (r9 != r1) goto L54;
     */
    @Override // defpackage.arpq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jlz.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new jlz(this.b, this.c, this.d, arpeVar);
    }
}
