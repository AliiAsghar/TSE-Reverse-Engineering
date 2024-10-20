package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahm {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: ahm$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arps {
        Object a;
        /* synthetic */ Object b;
        int c;

        public AnonymousClass1(arpe arpeVar) {
            super(arpeVar);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            this.b = obj;
            this.c |= Integer.MIN_VALUE;
            return ahm.a(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: ahm$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arpv implements arqv<cqg, arpe<? super arnb>, Object> {
        int a;
        final /* synthetic */ arpi b;
        final /* synthetic */ arqv c;
        private /* synthetic */ Object d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(arpi arpiVar, arqv arqvVar, arpe arpeVar) {
            super(arpeVar);
            this.b = arpiVar;
            this.c = arqvVar;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return ((AnonymousClass2) c((cqg) obj, (arpe) obj2)).b(arnb.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0040, code lost:
        
            if (r6 != r0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x004a, code lost:
        
            if (r6 == r0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x004c, code lost:
        
            return r0;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [cqg, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v12 */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v14 */
        /* JADX WARN: Type inference failed for: r1v15 */
        /* JADX WARN: Type inference failed for: r1v16 */
        /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v8, types: [arqv] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004a -> B:7:0x002e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x005e -> B:7:0x002e). Please report as a decompilation issue!!! */
        @Override // defpackage.arpq
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object b(java.lang.Object r6) {
            /*
                r5 = this;
                arpl r0 = defpackage.arpl.a
                int r1 = r5.a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L26
                if (r1 == r3) goto L1e
                if (r1 == r2) goto L14
                java.lang.Object r1 = r5.d
                cqg r1 = (defpackage.cqg) r1
                defpackage.aqil.P(r6)
                goto L2e
            L14:
                java.lang.Object r1 = r5.d
                cqg r1 = (defpackage.cqg) r1
                defpackage.aqil.P(r6)     // Catch: java.util.concurrent.CancellationException -> L1c
                goto L2e
            L1c:
                r6 = move-exception
                goto L4d
            L1e:
                java.lang.Object r1 = r5.d
                cqg r1 = (defpackage.cqg) r1
                defpackage.aqil.P(r6)     // Catch: java.util.concurrent.CancellationException -> L1c
                goto L42
            L26:
                defpackage.aqil.P(r6)
                java.lang.Object r6 = r5.d
                r1 = r6
                cqg r1 = (defpackage.cqg) r1
            L2e:
                arpi r6 = r5.b
                boolean r6 = defpackage.arwi.A(r6)
                if (r6 == 0) goto L63
                arqv r6 = r5.c     // Catch: java.util.concurrent.CancellationException -> L1c
                r5.d = r1     // Catch: java.util.concurrent.CancellationException -> L1c
                r5.a = r3     // Catch: java.util.concurrent.CancellationException -> L1c
                java.lang.Object r6 = r6.a(r1, r5)     // Catch: java.util.concurrent.CancellationException -> L1c
                if (r6 == r0) goto L4c
            L42:
                r5.d = r1     // Catch: java.util.concurrent.CancellationException -> L1c
                r5.a = r2     // Catch: java.util.concurrent.CancellationException -> L1c
                java.lang.Object r6 = defpackage.ahm.a(r1, r5)     // Catch: java.util.concurrent.CancellationException -> L1c
                if (r6 != r0) goto L2e
            L4c:
                return r0
            L4d:
                arpi r4 = r5.b
                boolean r4 = defpackage.arwi.A(r4)
                if (r4 == 0) goto L62
                r5.d = r1
                r6 = 3
                r5.a = r6
                java.lang.Object r6 = defpackage.ahm.a(r1, r5)
                if (r6 == r0) goto L61
                goto L2e
            L61:
                return r0
            L62:
                throw r6
            L63:
                arnb r6 = defpackage.arnb.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ahm.AnonymousClass2.b(java.lang.Object):java.lang.Object");
        }

        @Override // defpackage.arpq
        public final arpe c(Object obj, arpe arpeVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.b, this.c, arpeVar);
            anonymousClass2.d = obj;
            return anonymousClass2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0056 -> B:10:0x0058). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(defpackage.cqg r7, defpackage.arpe r8) {
        /*
            boolean r0 = r8 instanceof defpackage.ahm.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r8
            ahm$1 r0 = (defpackage.ahm.AnonymousClass1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ahm$1 r0 = new ahm$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            java.lang.Object r7 = r0.a
            defpackage.aqil.P(r8)
            goto L58
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            defpackage.aqil.P(r8)
            cqq r8 = r7.p()
            java.util.List r8 = r8.a
            int r2 = r8.size()
            r5 = r3
        L40:
            if (r5 >= r2) goto L74
            java.lang.Object r6 = r8.get(r5)
            crc r6 = (defpackage.crc) r6
            boolean r6 = r6.d
            if (r6 == 0) goto L71
        L4c:
            cqs r8 = defpackage.cqs.c
            r0.a = r7
            r0.c = r4
            java.lang.Object r8 = r7.r(r8, r0)
            if (r8 == r1) goto L70
        L58:
            cqq r8 = (defpackage.cqq) r8
            java.util.List r8 = r8.a
            int r2 = r8.size()
            r5 = r3
        L61:
            if (r5 >= r2) goto L74
            java.lang.Object r6 = r8.get(r5)
            crc r6 = (defpackage.crc) r6
            boolean r6 = r6.d
            if (r6 != 0) goto L4c
            int r5 = r5 + 1
            goto L61
        L70:
            return r1
        L71:
            int r5 = r5 + 1
            goto L40
        L74:
            arnb r7 = defpackage.arnb.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahm.a(cqg, arpe):java.lang.Object");
    }

    public static final Object b(crk crkVar, arqv arqvVar, arpe arpeVar) {
        Object o = crkVar.o(new AnonymousClass2(arpeVar.u(), arqvVar, null), arpeVar);
        if (o == arpl.a) {
            return o;
        }
        return arnb.a;
    }
}
