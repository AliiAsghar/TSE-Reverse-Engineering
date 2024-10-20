package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class eii extends arpw implements arqv {
    Object a;
    int b;
    final /* synthetic */ arrz c;
    final /* synthetic */ eij d;
    final /* synthetic */ Object e;
    final /* synthetic */ boolean f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eii(arrz arrzVar, eij eijVar, Object obj, boolean z, arpe arpeVar) {
        super(2, arpeVar);
        this.c = arrzVar;
        this.d = eijVar;
        this.e = obj;
        this.f = z;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((eii) c((eil) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
    
        if (r5 == r0) goto L23;
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
            int r1 = r4.b
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 == r2) goto Ld
            defpackage.aqil.P(r5)
            goto L6c
        Ld:
            java.lang.Object r1 = r4.a
            java.lang.Object r2 = r4.g
            eil r2 = (defpackage.eil) r2
            defpackage.aqil.P(r5)
            goto L41
        L17:
            defpackage.aqil.P(r5)
            java.lang.Object r5 = r4.g
            eil r5 = (defpackage.eil) r5
            arrz r1 = r4.c
            eij r3 = r4.d
            kkc r3 = r3.h()
            r4.g = r5
            r4.a = r1
            r4.b = r2
            java.lang.Object r2 = r3.b
            efu r2 = (defpackage.efu) r2
            java.lang.Object r2 = r2.a
            java.util.concurrent.atomic.AtomicInteger r2 = (java.util.concurrent.atomic.AtomicInteger) r2
            int r2 = r2.incrementAndGet()
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r2)
            if (r3 == r0) goto L8a
            r2 = r5
            r5 = r3
        L41:
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            arrz r1 = (defpackage.arrz) r1
            r1.a = r5
            java.lang.Object r5 = r4.e
            r1 = 0
            r4.g = r1
            r4.a = r1
            r3 = 2
            r4.b = r3
            r2.b()
            eir r3 = new eir
            r3.<init>(r2, r5, r1)
            java.io.File r5 = r2.a
            java.lang.Object r5 = defpackage.dyh.b(r5, r3, r4)
            arpl r1 = defpackage.arpl.a
            if (r5 == r1) goto L69
            arnb r5 = defpackage.arnb.a
        L69:
            if (r5 != r0) goto L6c
            goto L8a
        L6c:
            boolean r5 = r4.f
            if (r5 == 0) goto L87
            eij r5 = r4.d
            java.lang.Object r0 = r4.e
            ehn r1 = new ehn
            if (r0 == 0) goto L7b
            r0.hashCode()
        L7b:
            efu r5 = r5.h
            arrz r2 = r4.c
            int r2 = r2.a
            r1.<init>(r0, r2)
            r5.B(r1)
        L87:
            arnb r5 = defpackage.arnb.a
            return r5
        L8a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eii.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        eii eiiVar = new eii(this.c, this.d, this.e, this.f, arpeVar);
        eiiVar.g = obj;
        return eiiVar;
    }
}
