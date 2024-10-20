package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lhc extends arpw implements arqv {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ lhe c;
    final /* synthetic */ jhc d;
    final /* synthetic */ atok e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lhc(lhe lheVar, jhc jhcVar, atok atokVar, arpe arpeVar) {
        super(2, arpeVar);
        this.c = lheVar;
        this.d = jhcVar;
        this.e = atokVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((lhc) c((arny) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0068, code lost:
    
        if (r2.c(r7, r1, r3, r6) != r0) goto L21;
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
            if (r1 == 0) goto L15
            if (r1 == r2) goto Ld
            defpackage.aqil.P(r7)
            goto L6b
        Ld:
            java.lang.Object r1 = r6.b
            com.google.android.apps.messaging.shared.api.messaging.Conversation r1 = (com.google.android.apps.messaging.shared.api.messaging.Conversation) r1
            defpackage.aqil.P(r7)
            goto L37
        L15:
            defpackage.aqil.P(r7)
            java.lang.Object r7 = r6.b
            arny r7 = (defpackage.arny) r7
            int r1 = r7.a
            java.lang.Object r7 = r7.b
            com.google.android.apps.messaging.shared.api.messaging.Conversation r7 = (com.google.android.apps.messaging.shared.api.messaging.Conversation) r7
            if (r1 <= 0) goto L55
            lhe r1 = r6.c
            jhc r3 = r6.d
            r6.b = r7
            r6.a = r2
            lgt r1 = r1.j
            java.lang.Object r1 = r1.a(r3, r6)
            if (r1 == r0) goto L6a
            r5 = r1
            r1 = r7
            r7 = r5
        L37:
            jhc r7 = (defpackage.jhc) r7
            if (r7 == 0) goto L3f
            r5 = r1
            r1 = r7
            r7 = r5
            goto L57
        L3f:
            lhe r7 = r6.c
            android.content.Context r0 = r7.e
            r1 = 2132018710(0x7f140616, float:1.9675734E38)
            java.lang.String r0 = r0.getString(r1)
            r0.getClass()
            zge r7 = r7.n
            r7.a(r0)
            arnb r7 = defpackage.arnb.a
            return r7
        L55:
            jhc r1 = r6.d
        L57:
            lhe r2 = r6.c
            atok r3 = r6.e
            r3.getClass()
            r4 = 0
            r6.b = r4
            r4 = 2
            r6.a = r4
            java.lang.Object r7 = r2.c(r7, r1, r3, r6)
            if (r7 != r0) goto L6b
        L6a:
            return r0
        L6b:
            arnb r7 = defpackage.arnb.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lhc.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        lhc lhcVar = new lhc(this.c, this.d, this.e, arpeVar);
        lhcVar.b = obj;
        return lhcVar;
    }
}
