package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qjt extends arpw implements arqv {
    Object a;
    int b;
    final /* synthetic */ Object c;
    private /* synthetic */ Object d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qjt(arqv arqvVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.e = i;
        this.c = arqvVar;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.e != 0) {
            return ((qjt) c((alog) obj, (arpe) obj2)).b(arnb.a);
        }
        return ((qjt) c((asaj) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a8, code lost:
    
        if (r2.fv(r7, r6) == r0) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [asai, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, arqv] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0048 -> B:6:0x004b). Please report as a decompilation issue!!! */
    @Override // defpackage.arpq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.e
            r1 = 1
            if (r0 == 0) goto L59
            arpl r0 = defpackage.arpl.a
            int r2 = r6.b
            if (r2 == 0) goto L15
            java.lang.Object r2 = r6.a
            java.lang.Object r3 = r6.d
            arqv r3 = (defpackage.arqv) r3
            defpackage.aqil.P(r7)
            goto L4b
        L15:
            defpackage.aqil.P(r7)
            java.lang.Object r7 = r6.d
            alog r7 = (defpackage.alog) r7
            java.lang.Object r2 = r6.c
            boolean r3 = r7 instanceof java.util.Collection
            if (r3 == 0) goto L29
            boolean r3 = r7.isEmpty()
            if (r3 == 0) goto L29
            goto L54
        L29:
            java.util.Iterator r7 = r7.iterator()
            r3 = r2
            r2 = r7
        L2f:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L54
            java.lang.Object r7 = r2.next()
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r7 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r7
            r7.getClass()
            r6.d = r3
            r6.a = r2
            r6.b = r1
            java.lang.Object r7 = r3.a(r7, r6)
            if (r7 != r0) goto L4b
            goto L58
        L4b:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L2f
            r1 = 0
        L54:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
        L58:
            return r0
        L59:
            arpl r0 = defpackage.arpl.a
            int r2 = r6.b
            if (r2 == 0) goto L6f
            if (r2 == r1) goto L65
            defpackage.aqil.P(r7)
            goto Lab
        L65:
            java.lang.Object r1 = r6.a
            java.lang.Object r2 = r6.d
            asaj r2 = (defpackage.asaj) r2
            defpackage.aqil.P(r7)
            goto L92
        L6f:
            defpackage.aqil.P(r7)
            java.lang.Object r7 = r6.d
            r2 = r7
            asaj r2 = (defpackage.asaj) r2
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.lang.Object r3 = r6.c
            lfr r4 = new lfr
            r5 = 10
            r4.<init>(r7, r2, r5)
            r6.d = r2
            r6.a = r7
            r6.b = r1
            java.lang.Object r1 = r3.a(r4, r6)
            if (r1 == r0) goto Lae
            r1 = r7
        L92:
            boolean r7 = r1.isEmpty()
            if (r7 != 0) goto Lab
            java.util.List r7 = defpackage.aqjn.ax(r1)
            r1 = 0
            r6.d = r1
            r6.a = r1
            r1 = 2
            r6.b = r1
            java.lang.Object r7 = r2.fv(r7, r6)
            if (r7 != r0) goto Lab
            goto Lae
        Lab:
            arnb r7 = defpackage.arnb.a
            return r7
        Lae:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qjt.b(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [asai, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, arqv] */
    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        if (this.e != 0) {
            qjt qjtVar = new qjt((arqv) this.c, arpeVar, 1);
            qjtVar.d = obj;
            return qjtVar;
        }
        qjt qjtVar2 = new qjt((asai) this.c, arpeVar, 0);
        qjtVar2.d = obj;
        return qjtVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qjt(asai asaiVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.e = i;
        this.c = asaiVar;
    }
}
