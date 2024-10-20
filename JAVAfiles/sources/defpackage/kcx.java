package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kcx extends arpw implements arqv {
    boolean a;
    int b;
    final /* synthetic */ kcy c;
    final /* synthetic */ miz d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kcx(kcy kcyVar, miz mizVar, arpe arpeVar) {
        super(2, arpeVar);
        this.c = kcyVar;
        this.d = mizVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((kcx) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0021, code lost:
    
        if (r8 != r0) goto L9;
     */
    @Override // defpackage.arpq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r8) {
        /*
            r7 = this;
            arpl r0 = defpackage.arpl.a
            int r1 = r7.b
            r2 = 1
            if (r1 == 0) goto L14
            if (r1 == r2) goto L10
            boolean r0 = r7.a
            defpackage.aqil.P(r8)
            r4 = r0
            goto L3a
        L10:
            defpackage.aqil.P(r8)
            goto L23
        L14:
            defpackage.aqil.P(r8)
            kcy r8 = r7.c
            miz r1 = r7.d
            r7.b = r2
            java.lang.Object r8 = r8.c(r1, r7)
            if (r8 == r0) goto L51
        L23:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            kcy r1 = r7.c
            miz r2 = r7.d
            r7.a = r8
            r3 = 2
            r7.b = r3
            java.lang.Object r1 = r1.b(r2, r7)
            if (r1 == r0) goto L51
            r4 = r8
            r8 = r1
        L3a:
            kcy r6 = r7.c
            miz r2 = r7.d
            r3 = r8
            java.lang.String r3 = (java.lang.String) r3
            jmq r8 = new jmq
            r5 = 2
            r0 = r8
            r1 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            lre r0 = r6.g
            r0.c(r8)
            arnb r8 = defpackage.arnb.a
            return r8
        L51:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kcx.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new kcx(this.c, this.d, arpeVar);
    }
}
