package defpackage;

import defpackage.cga;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class avo extends cga.c implements avi, cxg, czp {
    public static final a a = new a();
    public final avn b;
    private boolean c;

    /* compiled from: PG */
    /* renamed from: avo$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arpw implements arqv<arwe, arpe<? super arxm>, Object> {
        final /* synthetic */ cti b;
        final /* synthetic */ arqg c;
        final /* synthetic */ arqg d;
        private /* synthetic */ Object e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PG */
        /* renamed from: avo$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00181 extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
            int a;
            final /* synthetic */ avo b;
            final /* synthetic */ cti c;
            final /* synthetic */ arqg d;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: PG */
            /* renamed from: avo$1$1$1, reason: invalid class name and collision with other inner class name */
            /* loaded from: classes.dex */
            public /* synthetic */ class C00191 extends arrm implements arqg<cjp> {
                final /* synthetic */ avo a;
                final /* synthetic */ cti b;
                final /* synthetic */ arqg c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00191(avo avoVar, cti ctiVar, arqg arqgVar) {
                    super(0, arrn.class, "localRect", "bringChildIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;", 0);
                    this.a = avoVar;
                    this.b = ctiVar;
                    this.c = arqgVar;
                }

                @Override // defpackage.arqg
                public final /* bridge */ /* synthetic */ Object a() {
                    return avo.d(this.a, this.b, this.c);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00181(avo avoVar, cti ctiVar, arqg arqgVar, arpe arpeVar) {
                super(2, arpeVar);
                this.b = avoVar;
                this.c = ctiVar;
                this.d = arqgVar;
            }

            @Override // defpackage.arqv
            public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
                return ((C00181) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:11:0x00ce, code lost:
            
                if (r13 != defpackage.arpl.a) goto L35;
             */
            @Override // defpackage.arpq
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object b(java.lang.Object r13) {
                /*
                    r12 = this;
                    arpl r0 = defpackage.arpl.a
                    int r1 = r12.a
                    defpackage.aqil.P(r13)
                    if (r1 == 0) goto Lb
                    goto Ld5
                Lb:
                    avo r13 = r12.b
                    cti r1 = r12.c
                    arqg r2 = r12.d
                    avo$1$1$1 r3 = new avo$1$1$1
                    r3.<init>(r13, r1, r2)
                    r1 = 1
                    r12.a = r1
                    java.lang.Object r2 = r3.a()
                    if (r2 == 0) goto Ld0
                    avn r13 = r13.b
                    ags r13 = (defpackage.ags) r13
                    cjp r2 = (defpackage.cjp) r2
                    boolean r2 = defpackage.ags.i(r13, r2)
                    if (r2 != 0) goto Ld0
                    arvp r2 = new arvp
                    arpe r4 = defpackage.arhi.i(r12)
                    r2.<init>(r4, r1)
                    r2.A()
                    ags$a r4 = new ags$a
                    r4.<init>(r3, r2)
                    ago r3 = r13.e
                    arqg r5 = r4.a
                    java.lang.Object r5 = r5.a()
                    if (r5 != 0) goto L4f
                    arvo r13 = r4.b
                    arnb r1 = defpackage.arnb.a
                    r13.w(r1)
                    goto Lc8
                L4f:
                    arvo r6 = r4.b
                    agn r7 = new agn
                    r7.<init>(r3, r4)
                    r6.d(r7)
                    cbh r6 = r3.a
                    int r6 = r6.b
                    r7 = 0
                    artb r6 = defpackage.arrn.B(r7, r6)
                    int r8 = r6.a
                    int r6 = r6.b
                    if (r8 > r6) goto Lbc
                L68:
                    cbh r9 = r3.a
                    java.lang.Object[] r9 = r9.a
                    r9 = r9[r6]
                    ags$a r9 = (ags.a) r9
                    arqg r9 = r9.a
                    java.lang.Object r9 = r9.a()
                    if (r9 != 0) goto L79
                    goto Lb7
                L79:
                    r10 = r9
                    cjp r10 = (defpackage.cjp) r10
                    r11 = r5
                    cjp r11 = (defpackage.cjp) r11
                    cjp r10 = r11.d(r10)
                    boolean r11 = defpackage.d.F(r10, r5)
                    if (r11 == 0) goto L90
                    cbh r3 = r3.a
                    int r6 = r6 + r1
                    r3.f(r6, r4)
                    goto Lc1
                L90:
                    boolean r9 = defpackage.d.F(r10, r9)
                    if (r9 != 0) goto Lb7
                    java.util.concurrent.CancellationException r9 = new java.util.concurrent.CancellationException
                    java.lang.String r10 = "bringIntoView call interrupted by a newer, non-overlapping call"
                    r9.<init>(r10)
                    cbh r10 = r3.a
                    int r10 = r10.b
                    int r10 = r10 + (-1)
                    if (r10 > r6) goto Lb7
                La5:
                    cbh r11 = r3.a
                    java.lang.Object[] r11 = r11.a
                    r11 = r11[r6]
                    ags$a r11 = (ags.a) r11
                    arvo r11 = r11.b
                    r11.h(r9)
                    if (r10 == r6) goto Lb7
                    int r10 = r10 + 1
                    goto La5
                Lb7:
                    if (r6 == r8) goto Lbc
                    int r6 = r6 + (-1)
                    goto L68
                Lbc:
                    cbh r1 = r3.a
                    r1.f(r7, r4)
                Lc1:
                    boolean r1 = r13.i
                    if (r1 != 0) goto Lc8
                    r13.e()
                Lc8:
                    java.lang.Object r13 = r2.l()
                    arpl r1 = defpackage.arpl.a
                    if (r13 == r1) goto Ld2
                Ld0:
                    arnb r13 = defpackage.arnb.a
                Ld2:
                    if (r13 != r0) goto Ld5
                    return r0
                Ld5:
                    arnb r13 = defpackage.arnb.a
                    return r13
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.avo.AnonymousClass1.C00181.b(java.lang.Object):java.lang.Object");
            }

            @Override // defpackage.arpq
            public final arpe c(Object obj, arpe arpeVar) {
                return new C00181(this.b, this.c, this.d, arpeVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PG */
        /* renamed from: avo$1$2, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass2 extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
            int a;
            final /* synthetic */ avo b;
            final /* synthetic */ arqg c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(avo avoVar, arqg arqgVar, arpe arpeVar) {
                super(2, arpeVar);
                this.b = avoVar;
                this.c = arqgVar;
            }

            @Override // defpackage.arqv
            public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
                return ((AnonymousClass2) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            }

            @Override // defpackage.arpq
            public final Object b(Object obj) {
                avi a;
                arpl arplVar = arpl.a;
                int i = this.a;
                aqil.P(obj);
                if (i == 0) {
                    avo avoVar = this.b;
                    if (avoVar.z && (a = avl.a(avoVar)) != null) {
                        avo avoVar2 = this.b;
                        arqg arqgVar = this.c;
                        cti c = cwp.c(avoVar2);
                        this.a = 1;
                        if (a.a(c, arqgVar, this) == arplVar) {
                            return arplVar;
                        }
                    }
                }
                return arnb.a;
            }

            @Override // defpackage.arpq
            public final arpe c(Object obj, arpe arpeVar) {
                return new AnonymousClass2(this.b, this.c, arpeVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(cti ctiVar, arqg arqgVar, arqg arqgVar2, arpe arpeVar) {
            super(2, arpeVar);
            this.b = ctiVar;
            this.c = arqgVar;
            this.d = arqgVar2;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return ((AnonymousClass1) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            aqil.P(obj);
            arwe arweVar = (arwe) this.e;
            arrn.J(arweVar, null, null, new C00181(avo.this, this.b, this.c, null), 3);
            return arrn.J(arweVar, null, null, new AnonymousClass2(avo.this, this.d, null), 3);
        }

        @Override // defpackage.arpq
        public final arpe c(Object obj, arpe arpeVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, this.c, this.d, arpeVar);
            anonymousClass1.e = obj;
            return anonymousClass1;
        }
    }

    /* compiled from: PG */
    /* renamed from: avo$2, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends arrp implements arqg<cjp> {
        final /* synthetic */ cti b;
        final /* synthetic */ arqg c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(cti ctiVar, arqg arqgVar) {
            super(0);
            this.b = ctiVar;
            this.c = arqgVar;
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            cjp d = avo.d(avo.this, this.b, this.c);
            if (d != null) {
                ags agsVar = (ags) avo.this.b;
                if (defpackage.a.bB(agsVar.h, 0L)) {
                    aju.d("Expected BringIntoViewRequester to not be used before parents are placed.");
                }
                return d.f(agsVar.b(d, agsVar.h) ^ (-9223372034707292160L));
            }
            return null;
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a {
    }

    public avo(avn avnVar) {
        this.b = avnVar;
    }

    public static final cjp d(avo avoVar, cti ctiVar, arqg arqgVar) {
        cjp cjpVar;
        if (avoVar.z && avoVar.c) {
            cti c = cwp.c(avoVar);
            if (true != ctiVar.r()) {
                ctiVar = null;
            }
            if (ctiVar != null && (cjpVar = (cjp) arqgVar.a()) != null) {
                return cjpVar.f(c.n(ctiVar, false).c());
            }
        }
        return null;
    }

    @Override // defpackage.avi
    public final Object a(cti ctiVar, arqg arqgVar, arpe arpeVar) {
        Object d = arwi.d(new AnonymousClass1(ctiVar, arqgVar, new AnonymousClass2(ctiVar, arqgVar), null), arpeVar);
        if (d == arpl.a) {
            return d;
        }
        return arnb.a;
    }

    @Override // cga.c
    public final boolean dL() {
        return false;
    }

    @Override // defpackage.czp
    public final Object dP() {
        return a;
    }

    @Override // defpackage.cxg
    public final void dW(cti ctiVar) {
        this.c = true;
    }

    @Override // defpackage.cxg
    public final /* synthetic */ void dX(long j) {
    }
}
