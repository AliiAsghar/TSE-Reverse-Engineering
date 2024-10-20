package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afcr extends arpv implements arqv {
    Object a;
    Object b;
    Object c;
    int d;
    final /* synthetic */ Class e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afcr(Class cls, arpe arpeVar) {
        super(arpeVar);
        this.e = cls;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((afcr) c((artz) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
    
        r9.f = r7;
        r9.a = r6;
        r9.b = r5;
        r9.c = r1;
        r9.d = 1;
        r5 = r5;
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005f, code lost:
    
        if (r7.a(r1, r9) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c6, code lost:
    
        if (r7.a(defpackage.afcq.class, r9) == r0) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b5 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x005f -> B:9:0x0061). Please report as a decompilation issue!!! */
    @Override // defpackage.arpq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r10) {
        /*
            r9 = this;
            arpl r0 = defpackage.arpl.a
            int r1 = r9.d
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L10
            defpackage.aqil.P(r10)
            goto Lc9
        L10:
            java.lang.Object r1 = r9.c
            java.lang.Object r5 = r9.b
            java.lang.Object r6 = r9.a
            java.lang.Object r7 = r9.f
            artz r7 = (defpackage.artz) r7
            defpackage.aqil.P(r10)
            goto L61
        L1e:
            defpackage.aqil.P(r10)
            java.lang.Object r10 = r9.f
            artz r10 = (defpackage.artz) r10
            arnr r1 = new arnr
            r1.<init>()
            java.lang.Class r5 = r9.e
            r1.add(r5)
            java.lang.Class[] r5 = new java.lang.Class[r4]
            java.lang.Class<afcq> r6 = defpackage.afcq.class
            r5[r3] = r6
            java.util.Set r5 = defpackage.aqjn.f(r5)
            r7 = r10
            r6 = r1
        L3b:
            boolean r10 = r6.isEmpty()
            if (r10 != 0) goto Lb5
            r10 = r6
            arnr r10 = (defpackage.arnr) r10
            java.lang.Object r10 = r10.removeFirst()
            r1 = r10
            java.lang.Class r1 = (java.lang.Class) r1
            boolean r10 = r5.contains(r1)
            if (r10 != 0) goto L3b
            r9.f = r7
            r9.a = r6
            r9.b = r5
            r9.c = r1
            r9.d = r4
            java.lang.Object r10 = r7.a(r1, r9)
            if (r10 == r0) goto Lc8
        L61:
            r5.add(r1)
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.Class r10 = r1.getSuperclass()
            java.lang.Class[] r8 = new java.lang.Class[r4]
            r8[r3] = r10
            een r10 = new een
            r10.<init>(r8, r2)
            java.lang.Class[] r1 = r1.getInterfaces()
            r1.getClass()
            java.util.List r1 = defpackage.aqil.c(r1)
            artx[] r8 = new defpackage.artx[r2]
            r8[r3] = r10
            artx r10 = defpackage.aqjn.aF(r1)
            r8[r4] = r10
            een r10 = new een
            r10.<init>(r8, r2)
            arua r1 = defpackage.arua.a
            artw r8 = new artw
            r8.<init>(r10, r1, r4)
            arua r10 = defpackage.arua.c
            artt r1 = new artt
            r1.<init>(r8, r3, r10)
            aezb r10 = new aezb
            r8 = 4
            r10.<init>(r5, r8)
            artt r8 = new artt
            r8.<init>(r1, r4, r10)
            aeys r10 = defpackage.aeys.i
            artx r10 = defpackage.arrn.i(r8, r10)
            arud r1 = new arud
            r1.<init>(r10, r3)
            defpackage.aqjn.S(r6, r1)
            goto L3b
        Lb5:
            r10 = 0
            r9.f = r10
            r9.a = r10
            r9.b = r10
            r9.c = r10
            r9.d = r2
            java.lang.Class<afcq> r10 = defpackage.afcq.class
            java.lang.Object r10 = r7.a(r10, r9)
            if (r10 != r0) goto Lc9
        Lc8:
            return r0
        Lc9:
            arnb r10 = defpackage.arnb.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afcr.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        afcr afcrVar = new afcr(this.e, arpeVar);
        afcrVar.f = obj;
        return afcrVar;
    }
}
