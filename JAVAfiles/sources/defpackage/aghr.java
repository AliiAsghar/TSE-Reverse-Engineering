package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aghr extends arpw implements arqv {
    int a;
    final /* synthetic */ boolean b;
    final /* synthetic */ aggp c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aghr(boolean z, aggp aggpVar, arpe arpeVar) {
        super(2, arpeVar);
        this.b = z;
        this.c = aggpVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aghr) c((aghp) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        if (r4.d(r3) == r0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if (r4.c(r1, r3) == r0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0027, code lost:
    
        return r0;
     */
    @Override // defpackage.arpq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r4) {
        /*
            r3 = this;
            arpl r0 = defpackage.arpl.a
            int r1 = r3.a
            r2 = 1
            defpackage.aqil.P(r4)
            if (r1 == 0) goto Lb
            goto L28
        Lb:
            java.lang.Object r4 = r3.d
            aghp r4 = (defpackage.aghp) r4
            boolean r1 = r3.b
            if (r1 == 0) goto L1e
            aggp r1 = r3.c
            r3.a = r2
            java.lang.Object r4 = r4.c(r1, r3)
            if (r4 != r0) goto L28
            goto L27
        L1e:
            r1 = 2
            r3.a = r1
            java.lang.Object r4 = r4.d(r3)
            if (r4 != r0) goto L28
        L27:
            return r0
        L28:
            arnb r4 = defpackage.arnb.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aghr.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        aghr aghrVar = new aghr(this.b, this.c, arpeVar);
        aghrVar.d = obj;
        return aghrVar;
    }
}
