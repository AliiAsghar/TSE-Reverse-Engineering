package defpackage;

import defpackage.bwj;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aax {
    public final cbh a = new cbh(new a[16]);
    private final byn d = new byu(false, cav.a);
    public long b = Long.MIN_VALUE;
    public final byn c = new byu(true, cav.a);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: aax$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
        Object a;
        int b;
        final /* synthetic */ byn c;
        final /* synthetic */ aax d;
        private /* synthetic */ Object e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PG */
        /* renamed from: aax$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00001 extends arrp implements arqr<Long, arnb> {
            final /* synthetic */ byn a;
            final /* synthetic */ aax b;
            final /* synthetic */ arry c;
            final /* synthetic */ arwe d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00001(byn bynVar, aax aaxVar, arry arryVar, arwe arweVar) {
                super(1);
                this.a = bynVar;
                this.b = aaxVar;
                this.c = arryVar;
                this.d = arweVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:32:0x00c3, code lost:
            
                if (r6 == false) goto L39;
             */
            /* JADX WARN: Code restructure failed: missing block: B:7:0x0038, code lost:
            
                if (r12.c.a == defpackage.abq.a(r12.d.b())) goto L17;
             */
            @Override // defpackage.arqr
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object r13) {
                /*
                    Method dump skipped, instructions count: 211
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.aax.AnonymousClass1.C00001.a(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PG */
        /* renamed from: aax$1$2, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass2 extends arrp implements arqg<Float> {
            final /* synthetic */ arwe a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(arwe arweVar) {
                super(0);
                this.a = arweVar;
            }

            @Override // defpackage.arqg
            public final /* bridge */ /* synthetic */ Object a() {
                return Float.valueOf(abq.a(this.a.b()));
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PG */
        /* renamed from: aax$1$3, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass3 extends arpw implements arqv<Float, arpe<? super Boolean>, Object> {
            /* synthetic */ float a;

            public AnonymousClass3(arpe arpeVar) {
                super(2, arpeVar);
            }

            @Override // defpackage.arqv
            public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
                return ((AnonymousClass3) c(Float.valueOf(((Number) obj).floatValue()), (arpe) obj2)).b(arnb.a);
            }

            @Override // defpackage.arpq
            public final Object b(Object obj) {
                boolean z;
                aqil.P(obj);
                if (this.a > brg.a) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }

            @Override // defpackage.arpq
            public final arpe c(Object obj, arpe arpeVar) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(arpeVar);
                anonymousClass3.a = ((Number) obj).floatValue();
                return anonymousClass3;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(byn bynVar, aax aaxVar, arpe arpeVar) {
            super(2, arpeVar);
            this.c = bynVar;
            this.d = aaxVar;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return ((AnonymousClass1) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x006a, code lost:
        
            if (defpackage.arrn.V(r8, r4, r7) == r0) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x006c, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x0044, code lost:
        
            if (defpackage.aav.a(r8, r7) != r0) goto L10;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x006a -> B:5:0x002e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x004e -> B:5:0x002e). Please report as a decompilation issue!!! */
        @Override // defpackage.arpq
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object b(java.lang.Object r8) {
            /*
                r7 = this;
                arpl r0 = defpackage.arpl.a
                int r1 = r7.b
                r2 = 1
                if (r1 == 0) goto L1d
                if (r1 == r2) goto L13
                java.lang.Object r1 = r7.a
                java.lang.Object r3 = r7.e
                arwe r3 = (defpackage.arwe) r3
                defpackage.aqil.P(r8)
                goto L2e
            L13:
                java.lang.Object r1 = r7.a
                java.lang.Object r3 = r7.e
                arwe r3 = (defpackage.arwe) r3
                defpackage.aqil.P(r8)
                goto L46
            L1d:
                defpackage.aqil.P(r8)
                java.lang.Object r8 = r7.e
                r3 = r8
                arwe r3 = (defpackage.arwe) r3
                arry r1 = new arry
                r1.<init>()
                r8 = 1065353216(0x3f800000, float:1.0)
                r1.a = r8
            L2e:
                aax$1$1 r8 = new aax$1$1
                aax r4 = r7.d
                r5 = r1
                arry r5 = (defpackage.arry) r5
                byn r6 = r7.c
                r8.<init>(r6, r4, r5, r3)
                r7.e = r3
                r7.a = r1
                r7.b = r2
                java.lang.Object r8 = defpackage.aav.a(r8, r7)
                if (r8 == r0) goto L6c
            L46:
                r8 = r1
                arry r8 = (defpackage.arry) r8
                float r8 = r8.a
                r4 = 0
                int r8 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
                if (r8 != 0) goto L2e
                aax$1$2 r8 = new aax$1$2
                r8.<init>(r3)
                asai r8 = defpackage.cao.a(r8)
                aax$1$3 r4 = new aax$1$3
                r5 = 0
                r4.<init>(r5)
                r7.e = r3
                r7.a = r1
                r5 = 2
                r7.b = r5
                java.lang.Object r8 = defpackage.arrn.V(r8, r4, r7)
                if (r8 != r0) goto L2e
            L6c:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.aax.AnonymousClass1.b(java.lang.Object):java.lang.Object");
        }

        @Override // defpackage.arpq
        public final arpe c(Object obj, arpe arpeVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.c, this.d, arpeVar);
            anonymousClass1.e = obj;
            return anonymousClass1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: aax$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(int i) {
            super(2);
            this.b = i;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            int a = bzh.a(this.b | 1);
            aax.this.a((bwj) obj, a);
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a<T, V extends zz> implements cas<T> {
        public Object a;
        public Object b;
        public final acg c;
        public zr d;
        public abs e;
        public boolean f;
        public boolean g;
        public long h;
        private final byn j;

        public a(Object obj, Object obj2, acg acgVar, zr zrVar) {
            this.a = obj;
            this.b = obj2;
            this.c = acgVar;
            this.j = new byu(obj, cav.a);
            this.d = zrVar;
            this.e = new abs(this.d, acgVar, this.a, this.b);
        }

        @Override // defpackage.cas
        public final Object a() {
            return this.j.a();
        }

        public final void b(Object obj) {
            this.j.h(obj);
        }
    }

    public final void a(bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 6;
        bwj c = bwjVar.c(-318043801);
        if (i4 == 0) {
            if (true != c.I(this)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c.L()) {
            c.v();
        } else {
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (T == bwj.a.a) {
                byu byuVar = new byu(null, cav.a);
                bwkVar.ad(byuVar);
                T = byuVar;
            }
            byn bynVar = (byn) T;
            if (((Boolean) this.c.a()).booleanValue() || ((Boolean) this.d.a()).booleanValue()) {
                boolean I = c.I(this);
                Object T2 = bwkVar.T();
                if (I || T2 == bwj.a.a) {
                    T2 = new AnonymousClass1(bynVar, this, null);
                    bwkVar.ad(T2);
                }
                bxl.g(this, (arqv) T2, c);
            }
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new AnonymousClass2(i);
        }
    }

    public final void b(boolean z) {
        this.d.h(Boolean.valueOf(z));
    }
}
