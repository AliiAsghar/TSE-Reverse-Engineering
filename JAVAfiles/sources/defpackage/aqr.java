package defpackage;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import defpackage.asm;
import defpackage.ces;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aqr implements aig {
    public static final ceh a = cdx.a(AnonymousClass1.a, AnonymousClass2.a);
    public final aqk b;
    public final aqn c;
    public final byn d;
    public final ajr e;
    public float f;
    public cve g;
    public final cvf h;
    public final aqx i;
    public final LazyLayoutItemAnimator j;
    public final are k;
    public final asm l;
    public final asl m;
    public final byn n;
    public final byn o;
    private final aig p;
    private int q;
    private boolean r;
    private final aqj s;
    private final byn t;
    private final byn u;

    /* compiled from: PG */
    /* renamed from: aqr$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqv<cek, aqr, List<? extends Integer>> {
        public static final AnonymousClass1 a = new AnonymousClass1();

        public AnonymousClass1() {
            super(2);
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            aqr aqrVar = (aqr) obj2;
            return aqjn.B(Integer.valueOf(aqrVar.b()), Integer.valueOf(aqrVar.c()));
        }
    }

    /* compiled from: PG */
    /* renamed from: aqr$2, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends arrp implements arqr<List<? extends Integer>, aqr> {
        public static final AnonymousClass2 a = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            List list = (List) obj;
            return new aqr(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
        }
    }

    /* compiled from: PG */
    /* renamed from: aqr$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 implements aqj {
        public AnonymousClass3() {
        }
    }

    /* compiled from: PG */
    /* renamed from: aqr$4, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass4 extends arrp implements arqr<atd, arnb> {
        final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(int i) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: aqr$6, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass6 extends arps {
        Object a;
        /* synthetic */ Object b;
        int d;
        aqr e;
        afd f;

        public AnonymousClass6(arpe arpeVar) {
            super(arpeVar);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return aqr.this.e(null, null, this);
        }
    }

    /* compiled from: PG */
    /* renamed from: aqr$7, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass7 extends arrp implements arqr<Float, Float> {
        public AnonymousClass7() {
            super(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x00a6, code lost:
        
            if (java.lang.Math.min((defpackage.aiy.a(r8, r7.p) + r8.f) - r7.l, (defpackage.aiy.a(r11, r7.p) + r11.f) - r7.m) > (-r6)) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00c3, code lost:
        
            r8 = r7.k;
            r10 = r8.size();
            r12 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00ca, code lost:
        
            if (r12 >= r10) goto L75;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00cc, code lost:
        
            r13 = (defpackage.aqf) r8.get(r12);
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00d4, code lost:
        
            if (r13.j == false) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00d6, code lost:
        
            r16 = r2;
            r20 = r6;
            r17 = r10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x013d, code lost:
        
            r12 = r12 + 1;
            r2 = r16;
            r10 = r17;
            r6 = r20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00de, code lost:
        
            r14 = r13.i;
            r16 = r2;
            r17 = r10;
            r13.i = (defpackage.dre.a(r14) << 32) | ((defpackage.dre.b(r14) + r6) & 4294967295L);
            r1 = r13.h();
            r2 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x0101, code lost:
        
            if (r2 >= r1) goto L76;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0103, code lost:
        
            r9 = r13.d.b(r13.b, r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x010b, code lost:
        
            if (r9 == null) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x010d, code lost:
        
            r10 = r12;
            r11 = r9.b;
            r20 = r6;
            r15 = r13;
            r9.b = (defpackage.dre.a(r11) << 32) | (java.lang.Integer.valueOf(defpackage.dre.b(r11) + r6).intValue() & 4294967295L);
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x0131, code lost:
        
            r2 = r2 + 1;
            r12 = r10;
            r13 = r15;
            r6 = r20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x012d, code lost:
        
            r20 = r6;
            r10 = r12;
            r15 = r13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x013a, code lost:
        
            r20 = r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x0149, code lost:
        
            r16 = r2;
            r20 = r6;
            r1 = r7.a;
            r23 = r7.b - r20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x0157, code lost:
        
            if (r7.c != false) goto L60;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x0159, code lost:
        
            if (r20 <= 0) goto L59;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x015c, code lost:
        
            r2 = r20;
            r24 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x0165, code lost:
        
            r2 = r2;
            r2 = r7.e;
            r2 = r7.f;
            r2 = r7.g;
            r2 = r7.h;
            r2 = r7.i;
            r2 = r7.j;
            r2 = r7.k;
            r2 = r7.l;
            r2 = r7.m;
            r2 = r7.n;
            r2 = r7.o;
            r10 = new defpackage.aqe(r1, r23, r24, r2, r2, r2, r2, r2, r2, r2, r2, r2, r2, r2, r7.p, r7.q, r7.r);
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x0161, code lost:
        
            r2 = r20;
            r24 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x00bf, code lost:
        
            if (java.lang.Math.min(r7.l - defpackage.aiy.a(r8, r7.p), r7.m - defpackage.aiy.a(r11, r7.p)) <= r6) goto L62;
         */
        /* JADX WARN: Removed duplicated region for block: B:60:0x01aa  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x01bb  */
        @Override // defpackage.arqr
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object r40) {
            /*
                Method dump skipped, instructions count: 486
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.aqr.AnonymousClass7.a(java.lang.Object):java.lang.Object");
        }
    }

    public aqr() {
        this(0, 0, new apa(null));
    }

    @Override // defpackage.aig
    public final float a(float f) {
        return this.p.a(f);
    }

    public final int b() {
        return this.c.a();
    }

    public final int c() {
        return this.c.b();
    }

    public final apy d() {
        return (apy) this.d.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005f, code lost:
    
        if (r8.e(r6, r7, r0) != r1) goto L22;
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
            boolean r0 = r8 instanceof defpackage.aqr.AnonymousClass6
            if (r0 == 0) goto L13
            r0 = r8
            aqr$6 r0 = (defpackage.aqr.AnonymousClass6) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            aqr$6 r0 = new aqr$6
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
            aqr r2 = r0.e
            defpackage.aqil.P(r8)
            goto L50
        L3c:
            defpackage.aqil.P(r8)
            aqx r8 = r5.i
            r0.e = r5
            r0.f = r6
            r0.a = r7
            r0.d = r4
            java.lang.Object r8 = r8.d(r0)
            if (r8 == r1) goto L65
            r2 = r5
        L50:
            aig r8 = r2.p
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqr.e(afd, arqv, arpe):java.lang.Object");
    }

    public final void f(aqe aqeVar, boolean z) {
        boolean z2;
        int i;
        aqf aqfVar;
        int b;
        int i2;
        int b2;
        aqf aqfVar2;
        this.f -= aqeVar.d;
        this.d.h(aqeVar);
        aqh aqhVar = aqeVar.a;
        int i3 = 0;
        if ((aqhVar != null && aqhVar.a != 0) || aqeVar.b != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.u.h(Boolean.valueOf(z2));
        this.t.h(Boolean.valueOf(aqeVar.c));
        if (z) {
            aqn aqnVar = this.c;
            int i4 = aqeVar.b;
            if (i4 < brg.a) {
                aju.d("scrollOffset should be non-negative");
            }
            aqnVar.d(i4);
        } else {
            aqn aqnVar2 = this.c;
            aqh aqhVar2 = aqeVar.a;
            Object obj = null;
            if (aqhVar2 != null && (aqfVar2 = (aqf) aqil.m(aqhVar2.b)) != null) {
                obj = aqfVar2.b;
            }
            aqnVar2.b = obj;
            if (aqnVar2.a || aqeVar.n > 0) {
                aqnVar2.a = true;
                int i5 = aqeVar.b;
                if (i5 < brg.a) {
                    aju.d("scrollOffset should be non-negative (" + i5 + ')');
                }
                aqh aqhVar3 = aqeVar.a;
                if (aqhVar3 != null && (aqfVar = (aqf) aqil.m(aqhVar3.b)) != null) {
                    i = aqfVar.a;
                } else {
                    i = 0;
                }
                aqnVar2.e(i, i5);
            }
            if (this.r) {
                apa apaVar = (apa) this.b;
                if (apaVar.a != -1 && !aqeVar.k.isEmpty()) {
                    if (apaVar.c) {
                        apj apjVar = (apj) aqjn.ac(aqeVar.k);
                        if (aqeVar.p == ahp.a) {
                            b2 = apjVar.c();
                        } else {
                            b2 = apjVar.b();
                        }
                        i2 = b2 + 1;
                    } else {
                        apj apjVar2 = (apj) aqjn.X(aqeVar.k);
                        if (aqeVar.p == ahp.a) {
                            b = apjVar2.c();
                        } else {
                            b = apjVar2.b();
                        }
                        i2 = b - 1;
                    }
                    if (apaVar.a != i2) {
                        apaVar.a = -1;
                        cbh cbhVar = apaVar.b;
                        int i6 = cbhVar.b;
                        if (i6 > 0) {
                            Object[] objArr = cbhVar.a;
                            do {
                                ((asm.b) objArr[i3]).a();
                                i3++;
                            } while (i3 < i6);
                        }
                        apaVar.b.g();
                    }
                }
            }
        }
        this.q++;
    }

    @Override // defpackage.aig
    public final boolean g() {
        return ((Boolean) this.u.a()).booleanValue();
    }

    @Override // defpackage.aig
    public final boolean h() {
        return ((Boolean) this.t.a()).booleanValue();
    }

    @Override // defpackage.aig
    public final boolean i() {
        return this.p.i();
    }

    /* JADX WARN: Finally extract failed */
    public final void j(float f, apy apyVar) {
        boolean z;
        int b;
        int a2;
        int i;
        apa apaVar;
        cbh cbhVar;
        int i2;
        long m;
        cbh cbhVar2;
        int i3;
        arqr arqrVar;
        cbh cbhVar3;
        int i4;
        int b2;
        if (this.r) {
            aqk aqkVar = this.b;
            aqj aqjVar = this.s;
            if (!apyVar.i().isEmpty()) {
                if (f < brg.a) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    apj apjVar = (apj) aqjn.ac(apyVar.i());
                    if (apyVar.h() == ahp.a) {
                        b2 = apjVar.c();
                    } else {
                        b2 = apjVar.b();
                    }
                    i = b2 + 1;
                    a2 = ((apj) aqjn.ac(apyVar.i())).a() + 1;
                } else {
                    apj apjVar2 = (apj) aqjn.X(apyVar.i());
                    if (apyVar.h() == ahp.a) {
                        b = apjVar2.c();
                    } else {
                        b = apjVar2.b();
                    }
                    a2 = ((apj) aqjn.X(apyVar.i())).a() - 1;
                    i = b - 1;
                }
                if (a2 >= 0 && a2 < apyVar.d()) {
                    apa apaVar2 = (apa) aqkVar;
                    if (i != apaVar2.a && i >= 0) {
                        if (apaVar2.c != z && (i4 = (cbhVar3 = apaVar2.b).b) > 0) {
                            Object[] objArr = cbhVar3.a;
                            int i5 = 0;
                            do {
                                ((asm.b) objArr[i5]).a();
                                i5++;
                            } while (i5 < i4);
                        }
                        apaVar2.c = z;
                        apaVar2.a = i;
                        apaVar2.b.g();
                        cbh cbhVar4 = apaVar2.b;
                        ArrayList arrayList = new ArrayList();
                        aqr aqrVar = aqr.this;
                        ces a3 = ces.a.a();
                        if (a3 != null) {
                            arqrVar = a3.i();
                        } else {
                            arqrVar = null;
                        }
                        ces b3 = ces.a.b(a3);
                        try {
                            List list = (List) ((aqe) aqrVar.d.a()).j.a(Integer.valueOf(i));
                            int size = list.size();
                            int i6 = 0;
                            while (i6 < size) {
                                armo armoVar = (armo) list.get(i6);
                                apa apaVar3 = apaVar2;
                                arrayList.add(aqrVar.l.a(((Number) armoVar.a).intValue(), ((dqs) armoVar.b).a));
                                i6++;
                                apaVar2 = apaVar3;
                            }
                            apaVar = apaVar2;
                            ces.a.f(a3, b3, arqrVar);
                            cbhVar4.p(cbhVar4.b, arrayList);
                        } catch (Throwable th) {
                            ces.a.f(a3, b3, arqrVar);
                            throw th;
                        }
                    } else {
                        apaVar = apaVar2;
                    }
                    if (z) {
                        apj apjVar3 = (apj) aqjn.ac(apyVar.i());
                        if (apyVar.h() == ahp.a) {
                            m = apjVar3.m() & 4294967295L;
                        } else {
                            m = apjVar3.m() >> 32;
                        }
                        if (((aiy.a(apjVar3, apyVar.h()) + ((int) m)) + apyVar.c()) - apyVar.e() < (-f) && (i3 = (cbhVar2 = apaVar.b).b) > 0) {
                            Object[] objArr2 = cbhVar2.a;
                            int i7 = 0;
                            do {
                                ((asm.b) objArr2[i7]).b();
                                i7++;
                            } while (i7 < i3);
                            return;
                        }
                        return;
                    }
                    apa apaVar4 = apaVar;
                    if (apyVar.f() - aiy.a((apj) aqjn.X(apyVar.i()), apyVar.h()) < f && (i2 = (cbhVar = apaVar4.b).b) > 0) {
                        Object[] objArr3 = cbhVar.a;
                        int i8 = 0;
                        do {
                            ((asm.b) objArr3[i8]).b();
                            i8++;
                        } while (i8 < i2);
                    }
                }
            }
        }
    }

    public aqr(int i, int i2) {
        this(i, i2, new apa(null));
    }

    public aqr(int i, int i2, aqk aqkVar) {
        this.b = aqkVar;
        this.c = new aqn(i, i2);
        this.d = new byu(aqt.a, byo.a);
        this.e = new ajs();
        this.p = new agv(new AnonymousClass7());
        this.r = true;
        this.h = new cvf() { // from class: aqr.5
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
                aqr.this.g = cveVar;
            }
        };
        this.i = new aqx();
        this.j = new LazyLayoutItemAnimator();
        this.k = new are();
        this.l = new asm(new AnonymousClass4(i));
        this.s = new AnonymousClass3();
        this.m = new asl();
        this.n = new byu(arnb.a, byo.a);
        this.o = new byu(arnb.a, byo.a);
        this.t = new byu(false, cav.a);
        this.u = new byu(false, cav.a);
    }
}
