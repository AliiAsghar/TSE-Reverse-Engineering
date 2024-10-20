package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bdm {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bdm$1, reason: invalid class name */
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
            return bdm.c(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bdm$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arps {
        Object a;
        Object b;
        /* synthetic */ Object c;
        int d;

        public AnonymousClass2(arpe arpeVar) {
            super(arpeVar);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            this.c = obj;
            this.d |= Integer.MIN_VALUE;
            return bdm.d(null, null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bdm$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends arrp implements arqr<crc, arnb> {
        final /* synthetic */ bcr a;
        final /* synthetic */ bdd b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(bcr bcrVar, bdd bddVar) {
            super(1);
            this.a = bcrVar;
            this.b = bddVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            crc crcVar = (crc) obj;
            if (this.a.b(crcVar.c, this.b)) {
                crcVar.b();
            }
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bdm$5, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass5 extends arps {
        Object a;
        Object b;
        /* synthetic */ Object c;
        int d;
        crc e;

        public AnonymousClass5(arpe arpeVar) {
            super(arpeVar);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            this.c = obj;
            this.d |= Integer.MIN_VALUE;
            return bdm.e(null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bdm$6, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass6 extends arrp implements arqr<crc, arnb> {
        final /* synthetic */ ays a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(ays aysVar) {
            super(1);
            this.a = aysVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            crc crcVar = (crc) obj;
            this.a.b(cqr.a(crcVar));
            crcVar.b();
            return arnb.a;
        }
    }

    public static final cga a(cga cgaVar, final bcr bcrVar, final ays aysVar) {
        return cru.c(cgaVar, bcrVar, aysVar, new PointerInputEventHandler() { // from class: bdm.4

            /* compiled from: PG */
            /* renamed from: bdm$4$1, reason: invalid class name */
            /* loaded from: classes.dex */
            static final class AnonymousClass1 extends arpv implements arqv<cqg, arpe<? super arnb>, Object> {
                int a;
                final /* synthetic */ bcr b;
                final /* synthetic */ bcm c;
                final /* synthetic */ ays d;
                private /* synthetic */ Object e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(bcr bcrVar, bcm bcmVar, ays aysVar, arpe arpeVar) {
                    super(arpeVar);
                    this.b = bcrVar;
                    this.c = bcmVar;
                    this.d = aysVar;
                }

                @Override // defpackage.arqv
                public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
                    return ((AnonymousClass1) c((cqg) obj, (arpe) obj2)).b(arnb.a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
                
                    if (defpackage.bdm.d(r1, r3, r5, r9, r8) == r0) goto L28;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:22:0x0075, code lost:
                
                    return r0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:26:0x006f, code lost:
                
                    if (defpackage.bdm.e(r1, r2, r9, r8) == r0) goto L28;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:28:0x0026, code lost:
                
                    if (r9 != r0) goto L9;
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
                        r2 = 2
                        r3 = 1
                        if (r1 == 0) goto L16
                        if (r1 == r3) goto Le
                        defpackage.aqil.P(r9)
                        goto L72
                    Le:
                        java.lang.Object r1 = r8.e
                        cqg r1 = (defpackage.cqg) r1
                        defpackage.aqil.P(r9)
                        goto L28
                    L16:
                        defpackage.aqil.P(r9)
                        java.lang.Object r9 = r8.e
                        r1 = r9
                        cqg r1 = (defpackage.cqg) r1
                        r8.e = r1
                        r8.a = r3
                        java.lang.Object r9 = defpackage.bdm.c(r1, r8)
                        if (r9 == r0) goto L75
                    L28:
                        cqq r9 = (defpackage.cqq) r9
                        boolean r3 = defpackage.bdm.g(r9)
                        r4 = 0
                        if (r3 == 0) goto L5e
                        int r3 = r9.c
                        r3 = r3 & 33
                        if (r3 == 0) goto L5e
                        java.util.List r3 = r9.a
                        int r5 = r3.size()
                        r6 = 0
                    L3e:
                        if (r6 >= r5) goto L4f
                        java.lang.Object r7 = r3.get(r6)
                        crc r7 = (defpackage.crc) r7
                        boolean r7 = r7.c()
                        if (r7 != 0) goto L5e
                        int r6 = r6 + 1
                        goto L3e
                    L4f:
                        bcr r3 = r8.b
                        bcm r5 = r8.c
                        r8.e = r4
                        r8.a = r2
                        java.lang.Object r9 = defpackage.bdm.d(r1, r3, r5, r9, r8)
                        if (r9 != r0) goto L72
                        goto L75
                    L5e:
                        boolean r2 = defpackage.bdm.g(r9)
                        if (r2 != 0) goto L72
                        ays r2 = r8.d
                        r8.e = r4
                        r3 = 3
                        r8.a = r3
                        java.lang.Object r9 = defpackage.bdm.e(r1, r2, r9, r8)
                        if (r9 != r0) goto L72
                        goto L75
                    L72:
                        arnb r9 = defpackage.arnb.a
                        return r9
                    L75:
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.bdm.AnonymousClass4.AnonymousClass1.b(java.lang.Object):java.lang.Object");
                }

                @Override // defpackage.arpq
                public final arpe c(Object obj, arpe arpeVar) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, this.c, this.d, arpeVar);
                    anonymousClass1.e = obj;
                    return anonymousClass1;
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(crk crkVar, arpe<? super arnb> arpeVar) {
                Object b = ahm.b(crkVar, new AnonymousClass1(bcr.this, new bcm(crkVar.a()), aysVar, null), arpeVar);
                if (b == arpl.a) {
                    return b;
                }
                return arnb.a;
            }
        });
    }

    public static final cga b(cga cgaVar, final arqr arqrVar) {
        return cru.a(cgaVar, 8675309, new PointerInputEventHandler() { // from class: bdm.7

            /* compiled from: PG */
            /* renamed from: bdm$7$1, reason: invalid class name */
            /* loaded from: classes.dex */
            static final class AnonymousClass1 extends arpv implements arqv<cqg, arpe<? super arnb>, Object> {
                int a;
                final /* synthetic */ arqr b;
                private /* synthetic */ Object c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(arqr arqrVar, arpe arpeVar) {
                    super(arpeVar);
                    this.b = arqrVar;
                }

                @Override // defpackage.arqv
                public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
                    return ((AnonymousClass1) c((cqg) obj, (arpe) obj2)).b(arnb.a);
                }

                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0023 A[RETURN] */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:6:0x0021 -> B:4:0x0024). Please report as a decompilation issue!!! */
                @Override // defpackage.arpq
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object b(java.lang.Object r5) {
                    /*
                        r4 = this;
                        arpl r0 = defpackage.arpl.a
                        int r1 = r4.a
                        r2 = 1
                        if (r1 == 0) goto Lf
                        java.lang.Object r1 = r4.c
                        cqg r1 = (defpackage.cqg) r1
                        defpackage.aqil.P(r5)
                        goto L24
                    Lf:
                        defpackage.aqil.P(r5)
                        java.lang.Object r5 = r4.c
                        cqg r5 = (defpackage.cqg) r5
                        r1 = r5
                    L17:
                        cqs r5 = defpackage.cqs.a
                        r4.c = r1
                        r4.a = r2
                        java.lang.Object r5 = r1.r(r5, r4)
                        if (r5 != r0) goto L24
                        return r0
                    L24:
                        cqq r5 = (defpackage.cqq) r5
                        boolean r5 = defpackage.bdm.g(r5)
                        r5 = r5 ^ r2
                        arqr r3 = r4.b
                        java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
                        r3.a(r5)
                        goto L17
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.bdm.AnonymousClass7.AnonymousClass1.b(java.lang.Object):java.lang.Object");
                }

                @Override // defpackage.arpq
                public final arpe c(Object obj, arpe arpeVar) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, arpeVar);
                    anonymousClass1.c = obj;
                    return anonymousClass1;
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(crk crkVar, arpe<? super arnb> arpeVar) {
                Object o = crkVar.o(new AnonymousClass1(arqr.this, null), arpeVar);
                if (o == arpl.a) {
                    return o;
                }
                return arnb.a;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003e -> B:10:0x0041). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(defpackage.cqg r7, defpackage.arpe r8) {
        /*
            boolean r0 = r8 instanceof defpackage.bdm.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r8
            bdm$1 r0 = (defpackage.bdm.AnonymousClass1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bdm$1 r0 = new bdm$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r7 = r0.a
            defpackage.aqil.P(r8)
            goto L41
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            defpackage.aqil.P(r8)
        L34:
            cqs r8 = defpackage.cqs.b
            r0.a = r7
            r0.c = r3
            java.lang.Object r8 = r7.r(r8, r0)
            if (r8 != r1) goto L41
            return r1
        L41:
            cqq r8 = (defpackage.cqq) r8
            java.util.List r2 = r8.a
            int r4 = r2.size()
            r5 = 0
        L4a:
            if (r5 >= r4) goto L5c
            java.lang.Object r6 = r2.get(r5)
            crc r6 = (defpackage.crc) r6
            boolean r6 = defpackage.cqr.e(r6)
            if (r6 != 0) goto L59
            goto L34
        L59:
            int r5 = r5 + 1
            goto L4a
        L5c:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bdm.c(cqg, arpe):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r10v5, types: [bcr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v2, types: [cqg, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(defpackage.cqg r10, defpackage.bcr r11, defpackage.bcm r12, defpackage.cqq r13, defpackage.arpe r14) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bdm.d(cqg, bcr, bcm, cqq, arpe):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0089, code lost:
    
        if (r11 == r1) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object e(defpackage.cqg r8, defpackage.ays r9, defpackage.cqq r10, defpackage.arpe r11) {
        /*
            boolean r0 = r11 instanceof defpackage.bdm.AnonymousClass5
            if (r0 == 0) goto L13
            r0 = r11
            bdm$5 r0 = (defpackage.bdm.AnonymousClass5) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            bdm$5 r0 = new bdm$5
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.c
            arpl r1 = defpackage.arpl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L46
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r9 = r0.b
            java.lang.Object r8 = r0.a
            defpackage.aqil.P(r11)     // Catch: java.util.concurrent.CancellationException -> L2e
            goto L8b
        L2e:
            r8 = move-exception
            goto Lbe
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            crc r8 = r0.e
            java.lang.Object r9 = r0.b
            java.lang.Object r10 = r0.a
            defpackage.aqil.P(r11)     // Catch: java.util.concurrent.CancellationException -> L2e
            r7 = r10
            r10 = r8
            r8 = r7
            goto L62
        L46:
            defpackage.aqil.P(r11)
            java.util.List r10 = r10.a     // Catch: java.util.concurrent.CancellationException -> L2e
            java.lang.Object r10 = defpackage.aqjn.X(r10)     // Catch: java.util.concurrent.CancellationException -> L2e
            crc r10 = (defpackage.crc) r10     // Catch: java.util.concurrent.CancellationException -> L2e
            long r5 = r10.a     // Catch: java.util.concurrent.CancellationException -> L2e
            r0.a = r8     // Catch: java.util.concurrent.CancellationException -> L2e
            r0.b = r9     // Catch: java.util.concurrent.CancellationException -> L2e
            r0.e = r10     // Catch: java.util.concurrent.CancellationException -> L2e
            r0.d = r4     // Catch: java.util.concurrent.CancellationException -> L2e
            java.lang.Object r11 = defpackage.agy.c(r8, r5, r0)     // Catch: java.util.concurrent.CancellationException -> L2e
            if (r11 != r1) goto L62
            goto Lba
        L62:
            crc r11 = (defpackage.crc) r11     // Catch: java.util.concurrent.CancellationException -> L2e
            if (r11 == 0) goto Lbb
            deo r2 = r8.q()     // Catch: java.util.concurrent.CancellationException -> L2e
            boolean r10 = f(r2, r10, r11)     // Catch: java.util.concurrent.CancellationException -> L2e
            if (r10 == 0) goto Lbb
            long r4 = r11.c     // Catch: java.util.concurrent.CancellationException -> L2e
            r9.c(r4)     // Catch: java.util.concurrent.CancellationException -> L2e
            long r10 = r11.a     // Catch: java.util.concurrent.CancellationException -> L2e
            bdm$6 r2 = new bdm$6     // Catch: java.util.concurrent.CancellationException -> L2e
            r2.<init>(r9)     // Catch: java.util.concurrent.CancellationException -> L2e
            r0.a = r8     // Catch: java.util.concurrent.CancellationException -> L2e
            r0.b = r9     // Catch: java.util.concurrent.CancellationException -> L2e
            r4 = 0
            r0.e = r4     // Catch: java.util.concurrent.CancellationException -> L2e
            r0.d = r3     // Catch: java.util.concurrent.CancellationException -> L2e
            java.lang.Object r11 = defpackage.agy.f(r8, r10, r2, r0)     // Catch: java.util.concurrent.CancellationException -> L2e
            if (r11 == r1) goto Lba
        L8b:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.util.concurrent.CancellationException -> L2e
            boolean r10 = r11.booleanValue()     // Catch: java.util.concurrent.CancellationException -> L2e
            if (r10 == 0) goto Lb6
            cqq r8 = r8.p()     // Catch: java.util.concurrent.CancellationException -> L2e
            java.util.List r8 = r8.a     // Catch: java.util.concurrent.CancellationException -> L2e
            int r10 = r8.size()     // Catch: java.util.concurrent.CancellationException -> L2e
            r11 = 0
        L9e:
            if (r11 >= r10) goto Lb2
            java.lang.Object r0 = r8.get(r11)     // Catch: java.util.concurrent.CancellationException -> L2e
            crc r0 = (defpackage.crc) r0     // Catch: java.util.concurrent.CancellationException -> L2e
            boolean r1 = defpackage.cqr.f(r0)     // Catch: java.util.concurrent.CancellationException -> L2e
            if (r1 == 0) goto Laf
            r0.b()     // Catch: java.util.concurrent.CancellationException -> L2e
        Laf:
            int r11 = r11 + 1
            goto L9e
        Lb2:
            r9.d()     // Catch: java.util.concurrent.CancellationException -> L2e
            goto Lbb
        Lb6:
            r9.a()     // Catch: java.util.concurrent.CancellationException -> L2e
            goto Lbb
        Lba:
            return r1
        Lbb:
            arnb r8 = defpackage.arnb.a
            return r8
        Lbe:
            r9.a()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bdm.e(cqg, ays, cqq, arpe):java.lang.Object");
    }

    public static final boolean f(deo deoVar, crc crcVar, crc crcVar2) {
        if (cjn.a(a.Q(crcVar.c, crcVar2.c)) < agy.a(deoVar, crcVar.i)) {
            return true;
        }
        return false;
    }

    public static final boolean g(cqq cqqVar) {
        List list = cqqVar.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!a.bA(((crc) list.get(i)).i, 2)) {
                return false;
            }
        }
        return true;
    }
}
