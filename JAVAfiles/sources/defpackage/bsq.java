package defpackage;

import androidx.compose.material3.internal.DraggableAnchorsElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bsq {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bsq$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arpw implements arqx {
        int a;
        /* synthetic */ Object b;
        /* synthetic */ Object c;
        final /* synthetic */ bsr d;
        final /* synthetic */ float e;
        private /* synthetic */ Object f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PG */
        /* renamed from: bsq$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00361 extends arrp implements arqv<Float, Float, arnb> {
            final /* synthetic */ bsn a;
            final /* synthetic */ arry b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00361(bsn bsnVar, arry arryVar) {
                super(2);
                this.a = bsnVar;
                this.b = arryVar;
            }

            @Override // defpackage.arqv
            public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
                float floatValue = ((Number) obj).floatValue();
                this.a.a(floatValue, ((Number) obj2).floatValue());
                this.b.a = floatValue;
                return arnb.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(bsr bsrVar, float f, arpe arpeVar) {
            super(4, arpeVar);
            this.d = bsrVar;
            this.e = f;
        }

        @Override // defpackage.arqx
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.d, this.e, (arpe) obj4);
            anonymousClass1.f = (bsn) obj;
            anonymousClass1.b = (bsw) obj2;
            anonymousClass1.c = obj3;
            return anonymousClass1.b(arnb.a);
        }

        /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, bsn] */
        /* JADX WARN: Type inference failed for: r1v1, types: [bsw, java.lang.Object] */
        @Override // defpackage.arpq
        public final Object b(Object obj) {
            float c;
            arpl arplVar = arpl.a;
            int i = this.a;
            aqil.P(obj);
            if (i == 0) {
                ?? r10 = this.f;
                float c2 = this.b.c(this.c);
                if (!Float.isNaN(c2)) {
                    arry arryVar = new arry();
                    if (Float.isNaN(this.d.c())) {
                        c = brg.a;
                    } else {
                        c = this.d.c();
                    }
                    float f = c;
                    arryVar.a = f;
                    float f2 = this.e;
                    zr zrVar = (zr) this.d.a.a();
                    C00361 c00361 = new C00361(r10, arryVar);
                    this.f = null;
                    this.b = null;
                    this.a = 1;
                    if (abq.c(f, c2, f2, zrVar, c00361, this) == arplVar) {
                        return arplVar;
                    }
                }
            }
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bsq$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2<I> extends arps {
        /* synthetic */ Object a;
        int b;

        public AnonymousClass2(arpe arpeVar) {
            super(arpeVar);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            this.a = obj;
            this.b |= Integer.MIN_VALUE;
            return bsq.d(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bsq$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
        int a;
        final /* synthetic */ arqg b;
        final /* synthetic */ arqv c;
        private /* synthetic */ Object d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PG */
        /* renamed from: bsq$3$1, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass1<T> implements asaj {
            final /* synthetic */ arsb a;
            final /* synthetic */ arwe b;
            final /* synthetic */ arqv c;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: PG */
            /* renamed from: bsq$3$1$1, reason: invalid class name and collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C00371 extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
                int a;
                final /* synthetic */ arqv b;
                final /* synthetic */ Object c;
                final /* synthetic */ arwe d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00371(arqv arqvVar, Object obj, arwe arweVar, arpe arpeVar) {
                    super(2, arpeVar);
                    this.b = arqvVar;
                    this.c = obj;
                    this.d = arweVar;
                }

                @Override // defpackage.arqv
                public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
                    return ((C00371) c((arwe) obj, (arpe) obj2)).b(arnb.a);
                }

                @Override // defpackage.arpq
                public final Object b(Object obj) {
                    arpl arplVar = arpl.a;
                    int i = this.a;
                    aqil.P(obj);
                    if (i == 0) {
                        arqv arqvVar = this.b;
                        Object obj2 = this.c;
                        this.a = 1;
                        if (arqvVar.a(obj2, this) == arplVar) {
                            return arplVar;
                        }
                    }
                    arwi.g(this.d, new bsl());
                    return arnb.a;
                }

                @Override // defpackage.arpq
                public final arpe c(Object obj, arpe arpeVar) {
                    return new C00371(this.b, this.c, this.d, arpeVar);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: PG */
            /* renamed from: bsq$3$1$2, reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2 extends arps {
                Object a;
                Object b;
                Object c;
                /* synthetic */ Object d;
                int f;

                public AnonymousClass2(arpe arpeVar) {
                    super(arpeVar);
                }

                @Override // defpackage.arpq
                public final Object b(Object obj) {
                    this.d = obj;
                    this.f |= Integer.MIN_VALUE;
                    return AnonymousClass1.this.fv(null, this);
                }
            }

            public AnonymousClass1(arsb arsbVar, arwe arweVar, arqv arqvVar) {
                this.a = arsbVar;
                this.b = arweVar;
                this.c = arqvVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            @Override // defpackage.asaj
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object fv(java.lang.Object r7, defpackage.arpe r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof defpackage.bsq.AnonymousClass3.AnonymousClass1.AnonymousClass2
                    if (r0 == 0) goto L13
                    r0 = r8
                    bsq$3$1$2 r0 = (defpackage.bsq.AnonymousClass3.AnonymousClass1.AnonymousClass2) r0
                    int r1 = r0.f
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f = r1
                    goto L18
                L13:
                    bsq$3$1$2 r0 = new bsq$3$1$2
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.d
                    arpl r1 = defpackage.arpl.a
                    int r2 = r0.f
                    r3 = 1
                    if (r2 == 0) goto L35
                    if (r2 != r3) goto L2d
                    java.lang.Object r7 = r0.c
                    java.lang.Object r7 = r0.b
                    java.lang.Object r0 = r0.a
                    defpackage.aqil.P(r8)
                    goto L58
                L2d:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L35:
                    defpackage.aqil.P(r8)
                    arsb r8 = r6.a
                    java.lang.Object r8 = r8.a
                    arxm r8 = (defpackage.arxm) r8
                    if (r8 == 0) goto L57
                    bsl r2 = new bsl
                    r2.<init>()
                    r8.v(r2)
                    r0.a = r6
                    r0.b = r7
                    r0.c = r8
                    r0.f = r3
                    java.lang.Object r8 = r8.q(r0)
                    if (r8 != r1) goto L57
                    return r1
                L57:
                    r0 = r6
                L58:
                    bsq$3$1 r0 = (defpackage.bsq.AnonymousClass3.AnonymousClass1) r0
                    arsb r8 = r0.a
                    arwe r1 = r0.b
                    arwf r2 = defpackage.arwf.d
                    bsq$3$1$1 r4 = new bsq$3$1$1
                    arqv r0 = r0.c
                    r5 = 0
                    r4.<init>(r0, r7, r1, r5)
                    arxm r7 = defpackage.arrn.J(r1, r5, r2, r4, r3)
                    r8.a = r7
                    arnb r7 = defpackage.arnb.a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.bsq.AnonymousClass3.AnonymousClass1.fv(java.lang.Object, arpe):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(arqg arqgVar, arqv arqvVar, arpe arpeVar) {
            super(2, arpeVar);
            this.b = arqgVar;
            this.c = arqvVar;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return ((AnonymousClass3) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            arpl arplVar = arpl.a;
            int i = this.a;
            aqil.P(obj);
            if (i == 0) {
                arwe arweVar = (arwe) this.d;
                arsb arsbVar = new arsb();
                arqg arqgVar = this.b;
                arqv arqvVar = this.c;
                asai a = cao.a(arqgVar);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(arsbVar, arweVar, arqvVar);
                this.a = 1;
                if (a.a(anonymousClass1, this) == arplVar) {
                    return arplVar;
                }
            }
            return arnb.a;
        }

        @Override // defpackage.arpq
        public final arpe c(Object obj, arpe arpeVar) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.b, this.c, arpeVar);
            anonymousClass3.d = obj;
            return anonymousClass3;
        }
    }

    public static final bsw a(arqr arqrVar) {
        bsx bsxVar = new bsx();
        arqrVar.a(bsxVar);
        return new btg(bsxVar.a);
    }

    public static final cga b(cga cgaVar, bsr bsrVar, ahp ahpVar, arqv arqvVar) {
        return cgaVar.a(new DraggableAnchorsElement(bsrVar, arqvVar, ahpVar));
    }

    public static final Object c(bsr bsrVar, Object obj, float f, arpe arpeVar) {
        Object r = bsr.r(bsrVar, obj, new AnonymousClass1(bsrVar, f, null), arpeVar);
        if (r == arpl.a) {
            return r;
        }
        return arnb.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|23|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(defpackage.arqg r4, defpackage.arqv r5, defpackage.arpe r6) {
        /*
            boolean r0 = r6 instanceof defpackage.bsq.AnonymousClass2
            if (r0 == 0) goto L13
            r0 = r6
            bsq$2 r0 = (defpackage.bsq.AnonymousClass2) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            bsq$2 r0 = new bsq$2
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r6)     // Catch: defpackage.bsl -> L41
            goto L41
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            defpackage.aqil.P(r6)
            bsq$3 r6 = new bsq$3     // Catch: defpackage.bsl -> L41
            r2 = 0
            r6.<init>(r4, r5, r2)     // Catch: defpackage.bsl -> L41
            r0.b = r3     // Catch: defpackage.bsl -> L41
            java.lang.Object r4 = defpackage.arwi.d(r6, r0)     // Catch: defpackage.bsl -> L41
            if (r4 != r1) goto L41
            return r1
        L41:
            arnb r4 = defpackage.arnb.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bsq.d(arqg, arqv, arpe):java.lang.Object");
    }
}
