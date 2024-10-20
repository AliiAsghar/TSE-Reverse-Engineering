package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ypc extends arpw implements arqv {
    Object a;
    Object b;
    Object c;
    Object d;
    int e;
    final /* synthetic */ you f;
    final /* synthetic */ ypb g;
    final /* synthetic */ ypd h;
    final /* synthetic */ zai i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ypc(zai zaiVar, you youVar, ypb ypbVar, ypd ypdVar, arpe arpeVar) {
        super(2, arpeVar);
        this.i = zaiVar;
        this.f = youVar;
        this.g = ypbVar;
        this.h = ypdVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ypc) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0095, code lost:
    
        if (r1.b(r5, r13) != r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0041, code lost:
    
        if (r14 != r0) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [ypb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2, types: [ypb] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, akrh] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // defpackage.arpq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r14) {
        /*
            r13 = this;
            arpl r0 = defpackage.arpl.a
            int r1 = r13.e
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L25
            if (r1 == r3) goto L21
            if (r1 == r2) goto L12
            defpackage.aqil.P(r14)
            goto Lc1
        L12:
            java.lang.Object r1 = r13.d
            java.lang.Object r2 = r13.c
            java.lang.Object r3 = r13.b
            java.lang.Object r5 = r13.a
            defpackage.aqil.P(r14)     // Catch: java.lang.Throwable -> L1e
            goto L68
        L1e:
            r14 = move-exception
            goto L9b
        L21:
            defpackage.aqil.P(r14)
            goto L43
        L25:
            defpackage.aqil.P(r14)
            zai r14 = r13.i
            java.lang.Object r14 = r14.a
            java.lang.Object r14 = r14.b()
            r5 = r14
            ypw r5 = (defpackage.ypw) r5
            you r6 = r13.f
            r13.e = r3
            r9 = 0
            r11 = 30
            r7 = 0
            r8 = 0
            r10 = r13
            java.lang.Object r14 = defpackage.ypw.c(r5, r6, r7, r8, r9, r10, r11)
            if (r14 == r0) goto Lc4
        L43:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 != 0) goto Lc1
            ypb r3 = r13.g
            you r14 = r13.f
            zai r1 = r13.i
            akrh r5 = r3.f()
            r13.a = r5     // Catch: java.lang.Throwable -> L98
            r13.b = r3     // Catch: java.lang.Throwable -> L98
            r13.c = r14     // Catch: java.lang.Throwable -> L98
            r13.d = r1     // Catch: java.lang.Throwable -> L98
            r13.e = r2     // Catch: java.lang.Throwable -> L98
            java.lang.Object r2 = r3.g()     // Catch: java.lang.Throwable -> L98
            if (r2 == r0) goto Lc4
            r12 = r2
            r2 = r14
            r14 = r12
        L68:
            ype r14 = (defpackage.ype) r14     // Catch: java.lang.Throwable -> L1e
            defpackage.armd.i(r5, r4)
            zai r1 = r13.i
            java.lang.Object r1 = r1.e
            java.lang.Object r1 = r1.b()
            yqd r1 = (defpackage.yqd) r1
            you r2 = r13.f
            ypb r3 = r13.g
            yqe r5 = new yqe
            ypi r3 = r3.a()
            amzf r6 = defpackage.amzf.REINFORCEMENT
            r5.<init>(r2, r14, r3, r6)
            r13.a = r4
            r13.b = r4
            r13.c = r4
            r13.d = r4
            r14 = 3
            r13.e = r14
            java.lang.Object r14 = r1.b(r5, r13)
            if (r14 != r0) goto Lc1
            goto Lc4
        L98:
            r0 = move-exception
            r2 = r14
            r14 = r0
        L9b:
            zai r1 = (defpackage.zai) r1     // Catch: java.lang.Throwable -> Lba
            java.lang.Object r0 = r1.d     // Catch: java.lang.Throwable -> Lba
            java.lang.Object r0 = r0.b()     // Catch: java.lang.Throwable -> Lba
            ypt r0 = (defpackage.ypt) r0     // Catch: java.lang.Throwable -> Lba
            you r2 = (defpackage.you) r2     // Catch: java.lang.Throwable -> Lba
            ypn r1 = r2.e     // Catch: java.lang.Throwable -> Lba
            ypm r1 = r1.a     // Catch: java.lang.Throwable -> Lba
            ypi r2 = r3.a()     // Catch: java.lang.Throwable -> Lba
            amzf r3 = defpackage.amzf.REINFORCEMENT     // Catch: java.lang.Throwable -> Lba
            defpackage.ypt.d(r0, r1, r14, r2, r3)     // Catch: java.lang.Throwable -> Lba
            arnb r14 = defpackage.arnb.a     // Catch: java.lang.Throwable -> Lba
            defpackage.armd.i(r5, r4)
            return r14
        Lba:
            r14 = move-exception
            throw r14     // Catch: java.lang.Throwable -> Lbc
        Lbc:
            r0 = move-exception
            defpackage.armd.i(r5, r14)
            throw r0
        Lc1:
            arnb r14 = defpackage.arnb.a
            return r14
        Lc4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ypc.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new ypc(this.i, this.f, this.g, this.h, arpeVar);
    }
}
