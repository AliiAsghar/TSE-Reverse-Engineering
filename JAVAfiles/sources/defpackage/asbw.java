package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asbw extends arpw implements arqv {
    int a;
    final /* synthetic */ ascp b;
    final /* synthetic */ asai c;
    final /* synthetic */ ascc d;
    final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public asbw(ascp ascpVar, asai asaiVar, ascc asccVar, Object obj, arpe arpeVar) {
        super(2, arpeVar);
        this.b = ascpVar;
        this.c = asaiVar;
        this.d = asccVar;
        this.e = obj;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((asbw) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0029, code lost:
    
        if (r9.a(r1, r8) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
    
        if (defpackage.arrn.V(r9, r1, r8) != r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0074, code lost:
    
        if (defpackage.armd.q(r9, r7, r8) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x004e, code lost:
    
        if (r9.a(r1, r8) == r0) goto L23;
     */
    @Override // defpackage.arpq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r9) {
        /*
            r8 = this;
            arpl r0 = defpackage.arpl.a
            int r1 = r8.a
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L16
            if (r1 == r4) goto L12
            if (r1 == r3) goto Le
            goto L12
        Le:
            defpackage.aqil.P(r9)
            goto L44
        L12:
            defpackage.aqil.P(r9)
            goto L77
        L16:
            defpackage.aqil.P(r9)
            ascp r9 = r8.b
            ascp r1 = defpackage.asco.a
            if (r9 != r1) goto L2c
            asai r9 = r8.c
            ascc r1 = r8.d
            r8.a = r4
            java.lang.Object r9 = r9.a(r1, r8)
            if (r9 != r0) goto L77
            goto L76
        L2c:
            ascp r1 = defpackage.asco.b
            if (r9 != r1) goto L51
            ascc r9 = r8.d
            ascv r9 = r9.b()
            asbu r1 = new asbu
            r4 = 0
            r1.<init>(r4)
            r8.a = r3
            java.lang.Object r9 = defpackage.arrn.V(r9, r1, r8)
            if (r9 == r0) goto L76
        L44:
            asai r9 = r8.c
            ascc r1 = r8.d
            r8.a = r2
            java.lang.Object r9 = r9.a(r1, r8)
            if (r9 != r0) goto L77
            goto L76
        L51:
            ascc r1 = r8.d
            ascv r1 = r1.b()
            asai r9 = r9.a(r1)
            asai r9 = defpackage.asar.a(r9)
            asai r2 = r8.c
            ascc r3 = r8.d
            java.lang.Object r4 = r8.e
            asbv r7 = new asbv
            r5 = 0
            r6 = 0
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            r1 = 4
            r8.a = r1
            java.lang.Object r9 = defpackage.armd.q(r9, r7, r8)
            if (r9 != r0) goto L77
        L76:
            return r0
        L77:
            arnb r9 = defpackage.arnb.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asbw.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new asbw(this.b, this.c, this.d, this.e, arpeVar);
    }
}
