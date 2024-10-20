package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class qkn extends arpw implements arqv {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ arrz c;
    final /* synthetic */ asaj d;
    final /* synthetic */ arqw e;
    final /* synthetic */ arrx f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qkn(arrz arrzVar, asaj asajVar, arqw arqwVar, arrx arrxVar, arpe arpeVar) {
        super(2, arpeVar);
        this.c = arrzVar;
        this.d = asajVar;
        this.e = arqwVar;
        this.f = arrxVar;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        return ((qkn) c(new arzn(((arzn) obj).b), (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0035, code lost:
    
        if (r7.fv(r1, r6) != r0) goto L11;
     */
    @Override // defpackage.arpq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r7) {
        /*
            r6 = this;
            arpl r0 = defpackage.arpl.a
            int r1 = r6.a
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 == r2) goto L11
            java.lang.Object r0 = r6.b
            arrx r0 = (defpackage.arrx) r0
            defpackage.aqil.P(r7)
            goto L53
        L11:
            java.lang.Object r1 = r6.b
            defpackage.aqil.P(r7)
            goto L37
        L17:
            defpackage.aqil.P(r7)
            java.lang.Object r7 = r6.b
            arzn r7 = (defpackage.arzn) r7
            java.lang.Object r1 = r7.b
            arrz r7 = r6.c
            int r3 = r7.a
            int r3 = r3 + r2
            r7.a = r3
            asaj r7 = r6.d
            boolean r3 = r1 instanceof defpackage.arzm
            if (r3 != 0) goto L37
            r6.b = r1
            r6.a = r2
            java.lang.Object r7 = r7.fv(r1, r6)
            if (r7 == r0) goto L56
        L37:
            arqw r7 = r6.e
            asaj r3 = r6.d
            arrx r4 = r6.f
            boolean r5 = r1 instanceof defpackage.arzl
            if (r5 == 0) goto L5d
            java.lang.Throwable r1 = defpackage.arzn.b(r1)
            if (r1 == 0) goto L57
            r6.b = r4
            r5 = 2
            r6.a = r5
            java.lang.Object r7 = r7.a(r3, r1, r6)
            if (r7 == r0) goto L56
            r0 = r4
        L53:
            r0.a = r2
            goto L57
        L56:
            return r0
        L57:
            r7 = 0
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            return r7
        L5d:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qkn.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        qkn qknVar = new qkn(this.c, this.d, this.e, this.f, arpeVar);
        qknVar.b = obj;
        return qknVar;
    }
}
