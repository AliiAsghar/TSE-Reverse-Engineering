package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aepm extends arpw implements arqw {
    int a;
    final /* synthetic */ arsb b;
    final /* synthetic */ byn c;
    final /* synthetic */ byn d;
    final /* synthetic */ byn e;
    final /* synthetic */ aepp f;
    final /* synthetic */ cpm g;
    private /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aepm(arsb arsbVar, byn bynVar, byn bynVar2, byn bynVar3, aepp aeppVar, cpm cpmVar, arpe arpeVar) {
        super(3, arpeVar);
        this.b = arsbVar;
        this.c = bynVar;
        this.d = bynVar2;
        this.e = bynVar3;
        this.f = aeppVar;
        this.g = cpmVar;
    }

    @Override // defpackage.arqw
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        long j = ((cjn) obj2).a;
        aepm aepmVar = new aepm(this.b, this.c, this.d, this.e, this.f, this.g, (arpe) obj3);
        aepmVar.h = (ahq) obj;
        return aepmVar.b(arnb.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0029, code lost:
    
        r4 = (java.lang.Boolean) r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0015, code lost:
    
        if (r4.a(r3) != r0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r1 != 1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0026, code lost:
    
        if (r4 == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x006e, code lost:
    
        return r0;
     */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, ahq] */
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
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L17
            goto L29
        Ld:
            java.lang.Object r4 = r3.h
            r3.a = r2
            java.lang.Object r4 = r4.a(r3)
            if (r4 == r0) goto L6e
        L17:
            arsb r4 = r3.b
            java.lang.Object r4 = r4.a
            arwl r4 = (defpackage.arwl) r4
            if (r4 == 0) goto L2b
            r1 = 2
            r3.a = r1
            java.lang.Object r4 = r4.n(r3)
            if (r4 != r0) goto L29
            goto L6e
        L29:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
        L2b:
            byn r4 = r3.c
            java.lang.Object r4 = r4.a()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r0 = 0
            if (r4 != 0) goto L62
            byn r4 = r3.d
            java.lang.Object r4 = r4.a()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L62
            byn r4 = r3.e
            java.lang.Object r4 = r4.a()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L62
            aepp r4 = r3.f
            arqg r4 = r4.e
            r4.a()
            cpm r4 = r3.g
            r4.a(r0)
        L62:
            byn r4 = r3.e
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.h(r0)
            arnb r4 = defpackage.arnb.a
            return r4
        L6e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aepm.b(java.lang.Object):java.lang.Object");
    }
}
