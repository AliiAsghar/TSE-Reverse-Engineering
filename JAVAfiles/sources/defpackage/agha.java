package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agha extends arpw implements arqw {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ aghe c;
    final /* synthetic */ arqw d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agha(aghe agheVar, arqw arqwVar, arpe arpeVar) {
        super(3, arpeVar);
        this.c = agheVar;
        this.d = arqwVar;
    }

    @Override // defpackage.arqw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        agha aghaVar = new agha(this.c, this.d, (arpe) obj3);
        aghaVar.b = (Exception) obj2;
        return aghaVar.b(arnb.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        if (r5.a(r2, r1, r4) == r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0020, code lost:
    
        if (r5 != r0) goto L9;
     */
    @Override // defpackage.arpq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r5) {
        /*
            r4 = this;
            arpl r0 = defpackage.arpl.a
            int r1 = r4.a
            r2 = 1
            if (r1 == 0) goto L13
            if (r1 == r2) goto Ld
            defpackage.aqil.P(r5)
            goto L35
        Ld:
            java.lang.Object r1 = r4.b
            defpackage.aqil.P(r5)
            goto L22
        L13:
            defpackage.aqil.P(r5)
            java.lang.Object r1 = r4.b
            aghe r5 = r4.c
            r4.a = r2
            java.lang.Object r5 = r5.d(r4)
            if (r5 == r0) goto L38
        L22:
            android.net.Uri r5 = (android.net.Uri) r5
            arqw r5 = r4.d
            aghe r2 = r4.c
            r3 = 0
            r4.b = r3
            r3 = 2
            r4.a = r3
            java.lang.Object r5 = r5.a(r2, r1, r4)
            if (r5 != r0) goto L35
            goto L38
        L35:
            arnb r5 = defpackage.arnb.a
            return r5
        L38:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agha.b(java.lang.Object):java.lang.Object");
    }
}
