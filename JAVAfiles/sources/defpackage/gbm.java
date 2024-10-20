package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gbm extends arpw implements arqw {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ gcc c;
    final /* synthetic */ gbb d;
    Object e;
    int f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gbm(arpe arpeVar, gcc gccVar, gbb gbbVar) {
        super(3, arpeVar);
        this.c = gccVar;
        this.d = gbbVar;
    }

    @Override // defpackage.arqw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        gbm gbmVar = new gbm((arpe) obj3, this.c, this.d);
        gbmVar.g = (asaj) obj;
        gbmVar.b = obj2;
        return gbmVar.b(arnb.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00ad, code lost:
    
        if (defpackage.armd.r(r5, r1, r8) == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ba, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0040, code lost:
    
        if (((defpackage.asgm) r3).b(r8) != r0) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [asaj] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
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
            r2 = 1
            if (r1 == 0) goto L1c
            if (r1 == r2) goto Le
            defpackage.aqil.P(r9)
            goto Lb0
        Le:
            int r1 = r8.f
            java.lang.Object r3 = r8.e
            java.lang.Object r4 = r8.b
            kkc r4 = (defpackage.kkc) r4
            java.lang.Object r5 = r8.g
            defpackage.aqil.P(r9)
            goto L42
        L1c:
            defpackage.aqil.P(r9)
            java.lang.Object r5 = r8.g
            java.lang.Object r9 = r8.b
            java.lang.Number r9 = (java.lang.Number) r9
            int r1 = r9.intValue()
            gcc r9 = r8.c
            r8.g = r5
            kkc r4 = r9.j
            r8.b = r4
            java.lang.Object r3 = r4.c
            r8.e = r3
            r8.f = r1
            r8.a = r2
            r9 = r3
            asgm r9 = (defpackage.asgm) r9
            java.lang.Object r9 = r9.b(r8)
            if (r9 == r0) goto Lba
        L42:
            java.lang.Object r9 = r4.a     // Catch: java.lang.Throwable -> Lb3
            r4 = r9
            gcd r4 = (defpackage.gcd) r4     // Catch: java.lang.Throwable -> Lb3
            pa r4 = r4.j     // Catch: java.lang.Throwable -> Lb3
            gbb r6 = r8.d     // Catch: java.lang.Throwable -> Lb3
            gaz r4 = r4.b(r6)     // Catch: java.lang.Throwable -> Lb3
            gay r6 = defpackage.gay.a     // Catch: java.lang.Throwable -> Lb3
            boolean r4 = defpackage.d.F(r4, r6)     // Catch: java.lang.Throwable -> Lb3
            r6 = 0
            if (r4 == 0) goto L67
            gaj[] r9 = new defpackage.gaj[r6]     // Catch: java.lang.Throwable -> Lb3
            aghw r1 = new aghw     // Catch: java.lang.Throwable -> Lb3
            r2 = 8
            r1.<init>(r9, r2)     // Catch: java.lang.Throwable -> Lb3
            asgm r3 = (defpackage.asgm) r3
            r3.d()
            goto L9f
        L67:
            r4 = r9
            gcd r4 = (defpackage.gcd) r4     // Catch: java.lang.Throwable -> Lb3
            pa r4 = r4.j     // Catch: java.lang.Throwable -> Lb3
            gbb r7 = r8.d     // Catch: java.lang.Throwable -> Lb3
            gaz r4 = r4.b(r7)     // Catch: java.lang.Throwable -> Lb3
            boolean r4 = r4 instanceof defpackage.gaw     // Catch: java.lang.Throwable -> Lb3
            if (r4 != 0) goto L81
            gcd r9 = (defpackage.gcd) r9     // Catch: java.lang.Throwable -> Lb3
            pa r9 = r9.j     // Catch: java.lang.Throwable -> Lb3
            gbb r4 = r8.d     // Catch: java.lang.Throwable -> Lb3
            gay r7 = defpackage.gay.b     // Catch: java.lang.Throwable -> Lb3
            r9.e(r4, r7)     // Catch: java.lang.Throwable -> Lb3
        L81:
            asgm r3 = (defpackage.asgm) r3
            r3.d()
            gcc r9 = r8.c
            gbb r3 = r8.d
            if (r1 != 0) goto L8d
            goto L8e
        L8d:
            r6 = r2
        L8e:
            ghw r9 = r9.i
            asai r9 = r9.j(r3)
            asbe r3 = new asbe
            r3.<init>(r9, r6, r2)
            gbp r9 = new gbp
            r9.<init>(r3, r1)
            r1 = r9
        L9f:
            r9 = 0
            r8.g = r9
            r8.b = r9
            r8.e = r9
            r9 = 2
            r8.a = r9
            java.lang.Object r9 = defpackage.armd.r(r5, r1, r8)
            if (r9 != r0) goto Lb0
            goto Lba
        Lb0:
            arnb r9 = defpackage.arnb.a
            return r9
        Lb3:
            r9 = move-exception
            asgm r3 = (defpackage.asgm) r3
            r3.d()
            throw r9
        Lba:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gbm.b(java.lang.Object):java.lang.Object");
    }
}
