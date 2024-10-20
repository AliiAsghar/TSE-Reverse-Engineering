package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahc extends arpv implements arqv<cqg, arpe<? super arnb>, Object> {
    int a;
    final /* synthetic */ arqr b;
    final /* synthetic */ arqg c;
    final /* synthetic */ arqg d;
    final /* synthetic */ arqv e;
    private /* synthetic */ Object f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: ahc$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqr<crc, arnb> {
        final /* synthetic */ arqv a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(arqv arqvVar) {
            super(1);
            this.a = arqvVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            crc crcVar = (crc) obj;
            this.a.a(crcVar, new cjn(cqr.a(crcVar)));
            crcVar.b();
            return arnb.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahc(arqr arqrVar, arqg arqgVar, arqg arqgVar2, arqv arqvVar, arpe arpeVar) {
        super(arpeVar);
        this.b = arqrVar;
        this.c = arqgVar;
        this.d = arqgVar2;
        this.e = arqvVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ahc) c((cqg) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0042, code lost:
    
        if (r7 != r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0034, code lost:
    
        if (r7 != r0) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0072 A[Catch: CancellationException -> 0x009a, TryCatch #0 {CancellationException -> 0x009a, blocks: (B:7:0x0010, B:8:0x006a, B:10:0x0072, B:12:0x007f, B:14:0x008b, B:16:0x008e, B:22:0x0091, B:24:0x0018, B:25:0x0044, B:27:0x0048, B:33:0x0020, B:34:0x0036, B:37:0x002c), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0091 A[Catch: CancellationException -> 0x009a, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x009a, blocks: (B:7:0x0010, B:8:0x006a, B:10:0x0072, B:12:0x007f, B:14:0x008b, B:16:0x008e, B:22:0x0091, B:24:0x0018, B:25:0x0044, B:27:0x0048, B:33:0x0020, B:34:0x0036, B:37:0x002c), top: B:2:0x0006 }] */
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
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L24
            if (r1 == r3) goto L1c
            if (r1 == r2) goto L14
            java.lang.Object r0 = r6.f
            cqg r0 = (defpackage.cqg) r0
            defpackage.aqil.P(r7)     // Catch: java.util.concurrent.CancellationException -> L9a
            goto L6a
        L14:
            java.lang.Object r1 = r6.f
            cqg r1 = (defpackage.cqg) r1
            defpackage.aqil.P(r7)     // Catch: java.util.concurrent.CancellationException -> L9a
            goto L44
        L1c:
            java.lang.Object r1 = r6.f
            cqg r1 = (defpackage.cqg) r1
            defpackage.aqil.P(r7)     // Catch: java.util.concurrent.CancellationException -> L9a
            goto L36
        L24:
            defpackage.aqil.P(r7)
            java.lang.Object r7 = r6.f
            r1 = r7
            cqg r1 = (defpackage.cqg) r1
            r6.f = r1     // Catch: java.util.concurrent.CancellationException -> L9a
            r6.a = r3     // Catch: java.util.concurrent.CancellationException -> L9a
            java.lang.Object r7 = defpackage.aik.j(r1, r6, r2)     // Catch: java.util.concurrent.CancellationException -> L9a
            if (r7 == r0) goto L99
        L36:
            crc r7 = (defpackage.crc) r7     // Catch: java.util.concurrent.CancellationException -> L9a
            long r3 = r7.a     // Catch: java.util.concurrent.CancellationException -> L9a
            r6.f = r1     // Catch: java.util.concurrent.CancellationException -> L9a
            r6.a = r2     // Catch: java.util.concurrent.CancellationException -> L9a
            java.lang.Object r7 = defpackage.agy.c(r1, r3, r6)     // Catch: java.util.concurrent.CancellationException -> L9a
            if (r7 == r0) goto L99
        L44:
            crc r7 = (defpackage.crc) r7     // Catch: java.util.concurrent.CancellationException -> L9a
            if (r7 == 0) goto L96
            arqr r2 = r6.b     // Catch: java.util.concurrent.CancellationException -> L9a
            long r3 = r7.c     // Catch: java.util.concurrent.CancellationException -> L9a
            cjn r5 = new cjn     // Catch: java.util.concurrent.CancellationException -> L9a
            r5.<init>(r3)     // Catch: java.util.concurrent.CancellationException -> L9a
            r2.a(r5)     // Catch: java.util.concurrent.CancellationException -> L9a
            long r2 = r7.a     // Catch: java.util.concurrent.CancellationException -> L9a
            ahc$1 r7 = new ahc$1     // Catch: java.util.concurrent.CancellationException -> L9a
            arqv r4 = r6.e     // Catch: java.util.concurrent.CancellationException -> L9a
            r7.<init>(r4)     // Catch: java.util.concurrent.CancellationException -> L9a
            r6.f = r1     // Catch: java.util.concurrent.CancellationException -> L9a
            r4 = 3
            r6.a = r4     // Catch: java.util.concurrent.CancellationException -> L9a
            java.lang.Object r7 = defpackage.agy.f(r1, r2, r7, r6)     // Catch: java.util.concurrent.CancellationException -> L9a
            if (r7 != r0) goto L69
            goto L99
        L69:
            r0 = r1
        L6a:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.util.concurrent.CancellationException -> L9a
            boolean r7 = r7.booleanValue()     // Catch: java.util.concurrent.CancellationException -> L9a
            if (r7 == 0) goto L91
            cqq r7 = r0.p()     // Catch: java.util.concurrent.CancellationException -> L9a
            java.util.List r7 = r7.a     // Catch: java.util.concurrent.CancellationException -> L9a
            int r0 = r7.size()     // Catch: java.util.concurrent.CancellationException -> L9a
            r1 = 0
        L7d:
            if (r1 >= r0) goto L96
            java.lang.Object r2 = r7.get(r1)     // Catch: java.util.concurrent.CancellationException -> L9a
            crc r2 = (defpackage.crc) r2     // Catch: java.util.concurrent.CancellationException -> L9a
            boolean r3 = defpackage.cqr.f(r2)     // Catch: java.util.concurrent.CancellationException -> L9a
            if (r3 == 0) goto L8e
            r2.b()     // Catch: java.util.concurrent.CancellationException -> L9a
        L8e:
            int r1 = r1 + 1
            goto L7d
        L91:
            arqg r7 = r6.d     // Catch: java.util.concurrent.CancellationException -> L9a
            r7.a()     // Catch: java.util.concurrent.CancellationException -> L9a
        L96:
            arnb r7 = defpackage.arnb.a
            return r7
        L99:
            return r0
        L9a:
            r7 = move-exception
            arqg r0 = r6.d
            r0.a()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahc.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        ahc ahcVar = new ahc(this.b, this.c, this.d, this.e, arpeVar);
        ahcVar.f = obj;
        return ahcVar;
    }
}
