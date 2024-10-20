package defpackage;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import defpackage.asm;
import defpackage.ces;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aov implements aig {
    public static final ceh a = cdx.a(AnonymousClass1.a, AnonymousClass2.a);
    public final aoq b;
    public boolean c;
    public aom d;
    public final aot e;
    public final byn f;
    public final ajr g;
    public float h;
    public cve i;
    public final cvf j;
    public final aqx k;
    public final LazyLayoutItemAnimator l;
    public final are m;
    public final asm n;
    public final asl o;
    public final byn p;
    public final byn q;
    public zt r;
    private final aig s;
    private int t;
    private boolean u;
    private final aop v;
    private final byn w;
    private final byn x;

    /* compiled from: PG */
    /* renamed from: aov$1 */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqv<cek, aov, List<? extends Integer>> {
        public static final AnonymousClass1 a = new AnonymousClass1();

        public AnonymousClass1() {
            super(2);
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            aov aovVar = (aov) obj2;
            return aqjn.B(Integer.valueOf(aovVar.b()), Integer.valueOf(aovVar.c()));
        }
    }

    /* compiled from: PG */
    /* renamed from: aov$2 */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends arrp implements arqr<List<? extends Integer>, aov> {
        public static final AnonymousClass2 a = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            List list = (List) obj;
            return new aov(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: aov$3 */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends arpw implements arqv<ahv, arpe<? super arnb>, Object> {
        int a;
        final /* synthetic */ int c;
        private /* synthetic */ Object d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(int i, arpe arpeVar) {
            super(2, arpeVar);
            this.c = i;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return ((AnonymousClass3) c((ahv) obj, (arpe) obj2)).b(arnb.a);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            arpl arplVar = arpl.a;
            int i = this.a;
            aqil.P(obj);
            if (i == 0) {
                ahv ahvVar = (ahv) this.d;
                aov aovVar = aov.this;
                aou aouVar = new aou(ahvVar, aovVar);
                int i2 = this.c;
                dqv dqvVar = ((aom) aovVar.f.a()).g;
                this.a = 1;
                if (asq.b(aouVar, i2, 100, dqvVar, this) == arplVar) {
                    return arplVar;
                }
            }
            return arnb.a;
        }

        @Override // defpackage.arpq
        public final arpe c(Object obj, arpe arpeVar) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.c, arpeVar);
            anonymousClass3.d = obj;
            return anonymousClass3;
        }
    }

    /* compiled from: PG */
    /* renamed from: aov$4 */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 implements aop {
        public AnonymousClass4() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: aov$5 */
    /* loaded from: classes.dex */
    public static final class AnonymousClass5 extends arrp implements arqr<atd, arnb> {
        final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(int i) {
            super(1);
            this.a = i;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            arqr arqrVar;
            atd atdVar = (atd) obj;
            ces a = ces.a.a();
            if (a != null) {
                arqrVar = a.i();
            } else {
                arqrVar = null;
            }
            ces.a.f(a, ces.a.b(a), arqrVar);
            for (int i = 0; i < 2; i++) {
                atdVar.a(this.a + i);
            }
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: aov$6 */
    /* loaded from: classes.dex */
    public static final class AnonymousClass6 implements cvf {
        public AnonymousClass6() {
        }

        @Override // defpackage.cga
        public final /* synthetic */ cga a(cga cgaVar) {
            return cfz.a(this, cgaVar);
        }

        @Override // defpackage.cga
        public final /* synthetic */ Object b(Object obj, arqv arqvVar) {
            return cgb.a(this, obj, arqvVar);
        }

        @Override // defpackage.cga
        public final /* synthetic */ boolean c(arqr arqrVar) {
            return cgb.b(this, arqrVar);
        }

        @Override // defpackage.cvf
        public final void d(cve cveVar) {
            aov.this.i = cveVar;
        }
    }

    /* compiled from: PG */
    /* renamed from: aov$7 */
    /* loaded from: classes.dex */
    public static final class AnonymousClass7 extends arps {
        Object a;
        /* synthetic */ Object b;
        int d;
        aov e;
        afd f;

        public AnonymousClass7(arpe arpeVar) {
            super(arpeVar);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return aov.this.e(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: aov$8 */
    /* loaded from: classes.dex */
    public static final class AnonymousClass8 extends arrp implements arqr<Float, Float> {
        public AnonymousClass8() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            aom aomVar;
            float f = -((Number) obj).floatValue();
            aov aovVar = aov.this;
            if ((f < brg.a && !aovVar.h()) || (f > brg.a && !aovVar.g())) {
                f = 0.0f;
            } else {
                if (Math.abs(aovVar.h) > 0.5f) {
                    aju.d("entered drag with non-zero pending scroll");
                }
                float f2 = aovVar.h + f;
                aovVar.h = f2;
                if (Math.abs(f2) > 0.5f) {
                    float f3 = aovVar.h;
                    int round = Math.round(f3);
                    aom l = ((aom) aovVar.f.a()).l(round, !aovVar.c);
                    if (l != null && (aomVar = aovVar.d) != null) {
                        aom l2 = aomVar.l(round, true);
                        if (l2 != null) {
                            aovVar.d = l2;
                        } else {
                            l = null;
                        }
                    }
                    if (l != null) {
                        aovVar.f(l, aovVar.c, true);
                        ate.b(aovVar.q);
                        aovVar.j(f3 - aovVar.h, l);
                    } else {
                        cve cveVar = aovVar.i;
                        if (cveVar != null) {
                            cveVar.e();
                        }
                        aovVar.j(f3 - aovVar.h, aovVar.d());
                    }
                }
                if (Math.abs(aovVar.h) > 0.5f) {
                    f -= aovVar.h;
                    aovVar.h = brg.a;
                }
            }
            return Float.valueOf(-f);
        }
    }

    public aov() {
        this(0, 0, new ano(null));
    }

    public static /* synthetic */ Object k(aov aovVar, int i, arpe arpeVar) {
        Object e;
        e = aovVar.e(afd.a, new aow(aovVar, i, null), arpeVar);
        if (e == arpl.a) {
            return e;
        }
        return arnb.a;
    }

    @Override // defpackage.aig
    public final float a(float f) {
        return this.s.a(f);
    }

    public final int b() {
        return this.e.a();
    }

    public final int c() {
        return this.e.b();
    }

    public final aog d() {
        return (aog) this.f.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005f, code lost:
    
        if (r8.e(r6, r7, r0) != r1) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.aig
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.afd r6, defpackage.arqv r7, defpackage.arpe r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.aov.AnonymousClass7
            if (r0 == 0) goto L13
            r0 = r8
            aov$7 r0 = (defpackage.aov.AnonymousClass7) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            aov$7 r0 = new aov$7
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.aqil.P(r8)
            goto L62
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.Object r7 = r0.a
            afd r6 = r0.f
            aov r2 = r0.e
            defpackage.aqil.P(r8)
            goto L50
        L3c:
            defpackage.aqil.P(r8)
            aqx r8 = r5.k
            r0.e = r5
            r0.f = r6
            r0.a = r7
            r0.d = r4
            java.lang.Object r8 = r8.d(r0)
            if (r8 == r1) goto L65
            r2 = r5
        L50:
            aig r8 = r2.s
            r2 = 0
            r0.e = r2
            r0.f = r2
            r0.a = r2
            r0.d = r3
            java.lang.Object r6 = r8.e(r6, r7, r0)
            if (r6 != r1) goto L62
            goto L65
        L62:
            arnb r6 = defpackage.arnb.a
            return r6
        L65:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aov.e(afd, arqv, arpe):java.lang.Object");
    }

    public final void f(aom aomVar, boolean z, boolean z2) {
        boolean z3;
        Object obj;
        int a2;
        arqr arqrVar;
        if (!z && this.c) {
            this.d = aomVar;
            return;
        }
        if (z) {
            this.c = true;
        }
        aon aonVar = aomVar.a;
        int i = 0;
        if ((aonVar != null && aonVar.a != 0) || aomVar.b != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.x.h(Boolean.valueOf(z3));
        this.w.h(Boolean.valueOf(aomVar.c));
        this.h -= aomVar.d;
        this.f.h(aomVar);
        if (z2) {
            aot aotVar = this.e;
            int i2 = aomVar.b;
            if (i2 < brg.a) {
                aju.d("scrollOffset should be non-negative");
            }
            aotVar.d(i2);
        } else {
            aot aotVar2 = this.e;
            aon aonVar2 = aomVar.a;
            if (aonVar2 != null) {
                obj = aonVar2.d;
            } else {
                obj = null;
            }
            aotVar2.b = obj;
            if (aotVar2.a || aomVar.k > 0) {
                aotVar2.a = true;
                int i3 = aomVar.b;
                if (i3 < brg.a) {
                    aju.d("scrollOffset should be non-negative");
                }
                aon aonVar3 = aomVar.a;
                if (aonVar3 != null) {
                    i = aonVar3.a;
                }
                aotVar2.e(i, i3);
            }
            if (this.u) {
                ano anoVar = (ano) this.b;
                if (anoVar.a != -1 && !aomVar.i.isEmpty()) {
                    if (anoVar.c) {
                        a2 = ((anw) aqjn.ac(aomVar.i)).a() + 1;
                    } else {
                        a2 = ((anw) aqjn.X(aomVar.i)).a() - 1;
                    }
                    if (anoVar.a != a2) {
                        anoVar.a = -1;
                        asm.b bVar = anoVar.b;
                        if (bVar != null) {
                            bVar.a();
                        }
                        anoVar.b = null;
                    }
                }
            }
        }
        if (z) {
            float f = aomVar.e;
            dqv dqvVar = aomVar.g;
            arwe arweVar = aomVar.f;
            aom aomVar2 = aoz.a;
            if (f > dqvVar.em(1.0f)) {
                ces a3 = ces.a.a();
                if (a3 != null) {
                    arqrVar = a3.i();
                } else {
                    arqrVar = null;
                }
                ces b = ces.a.b(a3);
                try {
                    float floatValue = ((Number) this.r.a()).floatValue();
                    zt ztVar = this.r;
                    if (ztVar.e) {
                        this.r = zu.c(ztVar, floatValue - f, brg.a, 30);
                        arrn.J(arweVar, null, null, new aox(this, null), 3);
                    } else {
                        this.r = new zt(aci.a, Float.valueOf(-f), null, 60);
                        arrn.J(arweVar, null, null, new aoy(this, null), 3);
                    }
                } finally {
                    ces.a.f(a3, b, arqrVar);
                }
            }
        }
        this.t++;
    }

    @Override // defpackage.aig
    public final boolean g() {
        return ((Boolean) this.x.a()).booleanValue();
    }

    @Override // defpackage.aig
    public final boolean h() {
        return ((Boolean) this.w.a()).booleanValue();
    }

    @Override // defpackage.aig
    public final boolean i() {
        return this.s.i();
    }

    public final void j(float f, aog aogVar) {
        boolean z;
        int a2;
        asm.b bVar;
        asm.b bVar2;
        arqr arqrVar;
        asm.b bVar3;
        if (this.u) {
            aoq aoqVar = this.b;
            aop aopVar = this.v;
            if (!aogVar.i().isEmpty()) {
                if (f < brg.a) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    a2 = ((anw) aqjn.ac(aogVar.i())).a() + 1;
                } else {
                    a2 = ((anw) aqjn.X(aogVar.i())).a() - 1;
                }
                if (a2 >= 0 && a2 < aogVar.d()) {
                    ano anoVar = (ano) aoqVar;
                    if (a2 != anoVar.a) {
                        if (anoVar.c != z && (bVar3 = anoVar.b) != null) {
                            bVar3.a();
                        }
                        anoVar.c = z;
                        anoVar.a = a2;
                        AnonymousClass4 anonymousClass4 = (AnonymousClass4) aopVar;
                        aov aovVar = aov.this;
                        ces a3 = ces.a.a();
                        if (a3 != null) {
                            arqrVar = a3.i();
                        } else {
                            arqrVar = null;
                        }
                        ces b = ces.a.b(a3);
                        try {
                            long j = ((aom) aovVar.f.a()).h;
                            ces.a.f(a3, b, arqrVar);
                            anoVar.b = aov.this.n.a(a2, j);
                        } catch (Throwable th) {
                            ces.a.f(a3, b, arqrVar);
                            throw th;
                        }
                    }
                    if (z) {
                        anw anwVar = (anw) aqjn.ac(aogVar.i());
                        if (((anwVar.b() + anwVar.c()) + aogVar.c()) - aogVar.e() < (-f) && (bVar2 = anoVar.b) != null) {
                            bVar2.b();
                            return;
                        }
                        return;
                    }
                    if (aogVar.f() - ((anw) aqjn.X(aogVar.i())).b() < f && (bVar = anoVar.b) != null) {
                        bVar.b();
                    }
                }
            }
        }
    }

    public final Object l(int i, arpe arpeVar) {
        Object e;
        e = e(afd.a, new AnonymousClass3(i, null), arpeVar);
        if (e == arpl.a) {
            return e;
        }
        return arnb.a;
    }

    public final void m(int i) {
        if (this.e.a() != i || this.e.b() != 0) {
            this.l.d();
        }
        aot aotVar = this.e;
        aotVar.e(i, 0);
        aotVar.b = null;
        cve cveVar = this.i;
        if (cveVar != null) {
            cveVar.e();
        }
    }

    public aov(int i, int i2) {
        this(i, i2, new ano(null));
    }

    public aov(int i, int i2, aoq aoqVar) {
        this.b = aoqVar;
        this.e = new aot(i, i2);
        this.f = new byu(aoz.a, byo.a);
        this.g = new ajs();
        this.s = new agv(new AnonymousClass8());
        this.u = true;
        this.j = new cvf() { // from class: aov.6
            public AnonymousClass6() {
            }

            @Override // defpackage.cga
            public final /* synthetic */ cga a(cga cgaVar) {
                return cfz.a(this, cgaVar);
            }

            @Override // defpackage.cga
            public final /* synthetic */ Object b(Object obj, arqv arqvVar) {
                return cgb.a(this, obj, arqvVar);
            }

            @Override // defpackage.cga
            public final /* synthetic */ boolean c(arqr arqrVar) {
                return cgb.b(this, arqrVar);
            }

            @Override // defpackage.cvf
            public final void d(cve cveVar) {
                aov.this.i = cveVar;
            }
        };
        this.k = new aqx();
        this.l = new LazyLayoutItemAnimator();
        this.m = new are();
        this.n = new asm(new AnonymousClass5(i));
        this.v = new AnonymousClass4();
        this.o = new asl();
        this.p = new byu(arnb.a, byo.a);
        this.w = new byu(false, cav.a);
        this.x = new byu(false, cav.a);
        this.q = new byu(arnb.a, byo.a);
        acg acgVar = aci.a;
        Float valueOf = Float.valueOf(brg.a);
        this.r = new zt(acgVar, valueOf, (zz) ((ach) acgVar).a.a(valueOf), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }
}
