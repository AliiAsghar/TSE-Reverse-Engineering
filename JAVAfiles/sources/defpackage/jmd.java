package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jmd extends arpw implements arqv {
    int a;
    final /* synthetic */ afcw b;
    final /* synthetic */ jmf c;
    final /* synthetic */ String d;
    final /* synthetic */ aekf e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jmd(afcw afcwVar, jmf jmfVar, String str, aekf aekfVar, arpe arpeVar) {
        super(2, arpeVar);
        this.b = afcwVar;
        this.c = jmfVar;
        this.d = str;
        this.e = aekfVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((jmd) c((asaj) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006a, code lost:
    
        if (r1.fv(r6, r9) != r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0039, code lost:
    
        if (r10 != r0) goto L11;
     */
    @Override // defpackage.arpq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r10) {
        /*
            r9 = this;
            arpl r0 = defpackage.arpl.a
            int r1 = r9.a
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L16
            if (r1 == r2) goto Le
            defpackage.aqil.P(r10)
            goto L6d
        Le:
            java.lang.Object r1 = r9.f
            asaj r1 = (defpackage.asaj) r1
            defpackage.aqil.P(r10)
            goto L3b
        L16:
            defpackage.aqil.P(r10)
            java.lang.Object r10 = r9.f
            r1 = r10
            asaj r1 = (defpackage.asaj) r1
            afcw r10 = r9.b
            java.lang.String r10 = r10.d
            if (r10 != 0) goto L4e
            jmf r10 = r9.c
            java.lang.String r4 = r9.d
            gau r5 = new gau
            r6 = 16
            r5.<init>(r4, r3, r6)
            r9.f = r1
            r9.a = r2
            arpi r10 = r10.c
            java.lang.Object r10 = defpackage.arro.q(r10, r5, r9)
            if (r10 == r0) goto L6c
        L3b:
            java.lang.String r10 = (java.lang.String) r10
            if (r10 == 0) goto L49
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r10 = r10.toUpperCase(r2)
            r10.getClass()
            goto L4a
        L49:
            r10 = r3
        L4a:
            if (r10 != 0) goto L4e
            java.lang.String r10 = r9.d
        L4e:
            aekf r2 = r9.e
            jmf r4 = r9.c
            afcw r5 = r9.b
            android.content.Context r4 = r4.b
            aejh r6 = new aejh
            long r7 = r5.c
            java.lang.String r4 = android.text.format.Formatter.formatFileSize(r4, r7)
            r6.<init>(r2, r10, r4, r10)
            r9.f = r3
            r10 = 2
            r9.a = r10
            java.lang.Object r10 = r1.fv(r6, r9)
            if (r10 != r0) goto L6d
        L6c:
            return r0
        L6d:
            arnb r10 = defpackage.arnb.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jmd.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        jmd jmdVar = new jmd(this.b, this.c, this.d, this.e, arpeVar);
        jmdVar.f = obj;
        return jmdVar;
    }
}
