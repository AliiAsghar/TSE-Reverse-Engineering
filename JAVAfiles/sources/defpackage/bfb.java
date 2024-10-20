package defpackage;

import defpackage.bcy;
import defpackage.bdd;
import defpackage.doy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bfb {
    public dob a;
    public arqr b;
    public ayd c;
    public final byn d;
    public doy e;
    public dcf f;
    public dec g;
    public cpm h;
    public cit i;
    public final byn j;
    public final byn k;
    public long l;
    public Integer m;
    public long n;
    public doj o;
    public final ays p;
    public final bcr q;
    private final bam r;
    private final byn s;
    private final byn t;
    private int u;
    private bdq v;

    /* compiled from: PG */
    /* renamed from: bfb$2, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends arrp implements arqr<doj, arnb> {
        public static final AnonymousClass2 a = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bfb$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends arrp implements arqg<arnb> {
        public AnonymousClass3() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            bfb.this.g(true);
            bfb.this.l();
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bfb$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 extends arrp implements arqg<arnb> {
        public AnonymousClass4() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            bfb.this.h();
            bfb.this.l();
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bfb$5, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass5 extends arrp implements arqg<arnb> {
        public AnonymousClass5() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            bfb.this.m();
            bfb.this.l();
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bfb$6, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass6 extends arrp implements arqg<arnb> {
        public AnonymousClass6() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            bfb.this.n();
            return arnb.a;
        }
    }

    public bfb() {
        this(null);
    }

    public final long a(boolean z) {
        baa d;
        diy diyVar;
        dhv e;
        int a;
        ayd aydVar = this.c;
        if (aydVar != null && (d = aydVar.d()) != null && (diyVar = d.a) != null && (e = e()) != null) {
            if (d.F(e.b, diyVar.a.a.b)) {
                if (z) {
                    a = djc.e(f().b);
                } else {
                    a = djc.a(f().b);
                }
                return bfq.a(diyVar, this.a.a(a), z, djc.i(f().b));
            }
            return 9205357640488583168L;
        }
        return 9205357640488583168L;
    }

    public final long b(doj dojVar, long j, boolean z, boolean z2, bdd bddVar, boolean z3) {
        baa d;
        int i;
        int i2;
        int i3;
        int i4;
        bcy bcyVar;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        cpm cpmVar;
        int i5;
        ayd aydVar = this.c;
        if (aydVar != null && (d = aydVar.d()) != null) {
            long a = djd.a(this.a.a(djc.e(dojVar.b)), this.a.a(djc.a(dojVar.b)));
            int a2 = d.a(j, false);
            if (!z2 && !z) {
                i = djc.e(a);
            } else {
                i = a2;
            }
            if (z2 && !z) {
                i2 = djc.a(a);
            } else {
                i2 = a2;
            }
            bdq bdqVar = this.v;
            if (!z && bdqVar != null && (i5 = this.u) != -1) {
                i3 = i5;
            } else {
                i3 = -1;
            }
            diy diyVar = d.a;
            if (z) {
                bcyVar = null;
                i4 = a2;
            } else {
                i4 = a2;
                bcyVar = new bcy(new bcy.a(bdt.b(diyVar, djc.e(a)), djc.e(a), 1L), new bcy.a(bdt.b(diyVar, djc.a(a)), djc.a(a), 1L), djc.i(a));
            }
            bex bexVar = new bex(z2, 1, 1, bcyVar, new bcx(1L, 1, i, i2, i3, diyVar));
            if (bexVar.n(bdqVar)) {
                this.v = bexVar;
                this.u = i4;
                bcy a3 = bddVar.a(bexVar);
                long a4 = djd.a(this.a.b(a3.a.b), this.a.b(a3.b.b));
                long j2 = dojVar.b;
                if (!a.bB(a4, j2)) {
                    boolean z9 = true;
                    if (djc.i(a4) != djc.i(j2) && a.bB(djd.a(djc.a(a4), djc.e(a4)), j2)) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (djc.h(a4) && djc.h(dojVar.b)) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z3 && dojVar.a().length() > 0 && !z4 && !z5 && (cpmVar = this.h) != null) {
                        cpmVar.a(9);
                    }
                    this.b.a(new doj(dojVar.a, a4));
                    if (!z3) {
                        u(!djc.h(a4));
                    }
                    ayd aydVar2 = this.c;
                    if (aydVar2 != null) {
                        aydVar2.h(z3);
                    }
                    ayd aydVar3 = this.c;
                    if (aydVar3 != null) {
                        if (!djc.h(a4) && bfc.b(this, true)) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        aydVar3.m(z8);
                    }
                    ayd aydVar4 = this.c;
                    if (aydVar4 == null) {
                        z6 = false;
                    } else {
                        if (!djc.h(a4)) {
                            z6 = false;
                            if (bfc.b(this, false)) {
                                z7 = true;
                                aydVar4.l(z7);
                            }
                        } else {
                            z6 = false;
                        }
                        z7 = z6;
                        aydVar4.l(z7);
                    }
                    ayd aydVar5 = this.c;
                    if (aydVar5 != null) {
                        if (!djc.h(a4) || !bfc.b(this, true)) {
                            z9 = z6;
                        }
                        aydVar5.j(z9);
                    }
                    return a4;
                }
            }
            return dojVar.b;
        }
        return djc.a;
    }

    public final axp c() {
        return (axp) this.s.a();
    }

    public final cjn d() {
        return (cjn) this.t.a();
    }

    public final dhv e() {
        ayq ayqVar;
        ayd aydVar = this.c;
        if (aydVar != null && (ayqVar = aydVar.a) != null) {
            return ayqVar.a;
        }
        return null;
    }

    public final doj f() {
        return (doj) this.d.a();
    }

    public final void g(boolean z) {
        if (!djc.h(f().b)) {
            dcf dcfVar = this.f;
            if (dcfVar != null) {
                dcfVar.c(dok.a(f()));
            }
            if (z) {
                int c = djc.c(f().b);
                this.b.a(new doj(f().a, djd.a(c, c)));
                r(axq.a);
            }
        }
    }

    public final void h() {
        if (!djc.h(f().b)) {
            dcf dcfVar = this.f;
            if (dcfVar != null) {
                dcfVar.c(dok.a(f()));
            }
            dhv b = dok.c(f(), f().a().length()).b(dok.b(f(), f().a().length()));
            int d = djc.d(f().b);
            this.b.a(new doj(b, djd.a(d, d)));
            r(axq.a);
            bam bamVar = this.r;
            if (bamVar != null) {
                bamVar.a();
            }
        }
    }

    public final void i(cjn cjnVar) {
        axq axqVar;
        baa baaVar;
        int c;
        if (!djc.h(f().b)) {
            ayd aydVar = this.c;
            if (aydVar != null) {
                baaVar = aydVar.d();
            } else {
                baaVar = null;
            }
            if (cjnVar != null && baaVar != null) {
                c = this.a.b(baa.e(baaVar, cjnVar.a));
            } else {
                c = djc.c(f().b);
            }
            this.b.a(doj.b(f(), null, djd.a(c, c), 5));
        }
        if (cjnVar != null && f().a().length() > 0) {
            axqVar = axq.c;
        } else {
            axqVar = axq.a;
        }
        r(axqVar);
        u(false);
    }

    public final void j(boolean z) {
        cit citVar;
        ayd aydVar = this.c;
        if (aydVar != null && !aydVar.n() && (citVar = this.i) != null) {
            citVar.b();
        }
        this.o = f();
        u(z);
        r(axq.b);
    }

    public final void k() {
        u(false);
        r(axq.a);
    }

    public final void l() {
        ded dedVar;
        dec decVar;
        dec decVar2 = this.g;
        if (decVar2 != null) {
            dedVar = decVar2.a();
        } else {
            dedVar = null;
        }
        if (dedVar == ded.a && (decVar = this.g) != null) {
            decVar.b();
        }
    }

    public final void m() {
        dhv a;
        dcf dcfVar = this.f;
        if (dcfVar != null && (a = dcfVar.a()) != null) {
            dhv b = dok.c(f(), f().a().length()).b(a).b(dok.b(f(), f().a().length()));
            int d = djc.d(f().b) + a.a();
            this.b.a(new doj(b, djd.a(d, d)));
            r(axq.a);
            bam bamVar = this.r;
            if (bamVar != null) {
                bamVar.a();
            }
        }
    }

    public final void n() {
        dhv dhvVar = f().a;
        long a = djd.a(0, f().a().length());
        long j = djc.a;
        doj dojVar = new doj(dhvVar, a);
        this.b.a(dojVar);
        this.o = doj.b(this.o, null, dojVar.b, 5);
        j(true);
    }

    public final void o(cjn cjnVar) {
        this.t.h(cjnVar);
    }

    public final void p(long j) {
        ayd aydVar = this.c;
        if (aydVar != null) {
            aydVar.f(j);
        }
        ayd aydVar2 = this.c;
        if (aydVar2 != null) {
            aydVar2.i(djc.a);
        }
        if (!djc.h(j)) {
            k();
        }
    }

    public final void q(axp axpVar) {
        this.s.h(axpVar);
    }

    public final void r(axq axqVar) {
        ayd aydVar = this.c;
        if (aydVar != null) {
            if (aydVar.c() == axqVar) {
                aydVar = null;
            }
            if (aydVar != null) {
                aydVar.g(axqVar);
            }
        }
    }

    public final void s(long j) {
        ayd aydVar = this.c;
        if (aydVar != null) {
            aydVar.i(j);
        }
        ayd aydVar2 = this.c;
        if (aydVar2 != null) {
            aydVar2.f(djc.a);
        }
        if (!djc.h(j)) {
            k();
        }
    }

    public final void t() {
        AnonymousClass3 anonymousClass3;
        AnonymousClass4 anonymousClass4;
        AnonymousClass5 anonymousClass5;
        AnonymousClass6 anonymousClass6;
        cjp cjpVar;
        long j;
        long j2;
        long j3;
        float f;
        char c;
        cti e;
        float f2;
        diy diyVar;
        cti e2;
        float f3;
        diy diyVar2;
        cti e3;
        cti e4;
        dcf dcfVar;
        if (w()) {
            ayd aydVar = this.c;
            if (aydVar == null || aydVar.p()) {
                ayd aydVar2 = null;
                if (!djc.h(f().b)) {
                    anonymousClass3 = new AnonymousClass3();
                } else {
                    anonymousClass3 = null;
                }
                if (!djc.h(f().b) && v()) {
                    anonymousClass4 = new AnonymousClass4();
                } else {
                    anonymousClass4 = null;
                }
                if (v() && (dcfVar = this.f) != null && dcfVar.d()) {
                    anonymousClass5 = new AnonymousClass5();
                } else {
                    anonymousClass5 = null;
                }
                if (djc.b(f().b) != f().a().length()) {
                    anonymousClass6 = new AnonymousClass6();
                } else {
                    anonymousClass6 = null;
                }
                dec decVar = this.g;
                if (decVar != null) {
                    ayd aydVar3 = this.c;
                    if (aydVar3 != null) {
                        if (true != aydVar3.n) {
                            aydVar2 = aydVar3;
                        }
                        if (aydVar2 != null) {
                            int a = this.a.a(djc.e(f().b));
                            int a2 = this.a.a(djc.a(f().b));
                            ayd aydVar4 = this.c;
                            long j4 = 0;
                            if (aydVar4 != null && (e4 = aydVar4.e()) != null) {
                                j = e4.i(a(true));
                            } else {
                                j = 0;
                            }
                            ayd aydVar5 = this.c;
                            if (aydVar5 != null && (e3 = aydVar5.e()) != null) {
                                j4 = e3.i(a(false));
                            }
                            ayd aydVar6 = this.c;
                            float f4 = brg.a;
                            if (aydVar6 != null && (e2 = aydVar6.e()) != null) {
                                baa d = aydVar2.d();
                                if (d != null && (diyVar2 = d.a) != null) {
                                    f3 = diyVar2.m(a).c;
                                } else {
                                    f3 = 0.0f;
                                }
                                j2 = j4;
                                j3 = j;
                                f = Float.intBitsToFloat((int) (e2.i((Float.floatToRawIntBits(brg.a) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L)) & 4294967295L));
                            } else {
                                j2 = j4;
                                j3 = j;
                                f = 0.0f;
                            }
                            ayd aydVar7 = this.c;
                            if (aydVar7 != null && (e = aydVar7.e()) != null) {
                                baa d2 = aydVar2.d();
                                if (d2 != null && (diyVar = d2.a) != null) {
                                    f2 = diyVar.m(a2).c;
                                } else {
                                    f2 = 0.0f;
                                }
                                c = ' ';
                                f4 = Float.intBitsToFloat((int) (e.i((Float.floatToRawIntBits(brg.a) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L)) & 4294967295L));
                            } else {
                                c = ' ';
                            }
                            long j5 = j3 >> c;
                            int i = (int) (j2 >> c);
                            int i2 = (int) j5;
                            cjpVar = new cjp(Math.min(Float.intBitsToFloat(i2), Float.intBitsToFloat(i)), Math.min(f, f4), Math.max(Float.intBitsToFloat(i2), Float.intBitsToFloat(i)), Math.max(Float.intBitsToFloat((int) (j3 & 4294967295L)), Float.intBitsToFloat((int) (j2 & 4294967295L))) + (aydVar2.a.e.ec() * 25.0f));
                            decVar.c(cjpVar, anonymousClass3, anonymousClass5, anonymousClass4, anonymousClass6);
                        }
                    }
                    cjpVar = cjp.a;
                    decVar.c(cjpVar, anonymousClass3, anonymousClass5, anonymousClass4, anonymousClass6);
                }
            }
        }
    }

    public final void u(boolean z) {
        ayd aydVar = this.c;
        if (aydVar != null) {
            aydVar.k(z);
        }
        if (z) {
            t();
        } else {
            l();
        }
    }

    public final boolean v() {
        return ((Boolean) this.j.a()).booleanValue();
    }

    public final boolean w() {
        return ((Boolean) this.k.a()).booleanValue();
    }

    public bfb(bam bamVar) {
        this.r = bamVar;
        this.a = bao.a;
        this.b = AnonymousClass2.a;
        String str = null;
        long j = 0;
        int i = 7;
        this.d = new byu(new doj(str, j, i), cav.a);
        int i2 = doy.a;
        this.e = doy.a.a;
        this.j = new byu(true, cav.a);
        this.k = new byu(true, cav.a);
        this.l = 0L;
        this.n = 0L;
        this.s = new byu(null, cav.a);
        this.t = new byu(null, cav.a);
        this.u = -1;
        this.o = new doj(str, j, i);
        this.p = new ays() { // from class: bfb.7
            private final void g() {
                axq axqVar;
                boolean z;
                boolean z2;
                bfb.this.q(null);
                bfb.this.o(null);
                boolean z3 = true;
                bfb.this.u(true);
                bfb bfbVar = bfb.this;
                bfbVar.m = null;
                boolean h = djc.h(bfbVar.f().b);
                if (h) {
                    axqVar = axq.c;
                } else {
                    axqVar = axq.b;
                }
                bfb.this.r(axqVar);
                bfb bfbVar2 = bfb.this;
                ayd aydVar = bfbVar2.c;
                if (aydVar != null) {
                    if (!h && bfc.b(bfbVar2, true)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    aydVar.m(z2);
                }
                bfb bfbVar3 = bfb.this;
                ayd aydVar2 = bfbVar3.c;
                if (aydVar2 != null) {
                    if (!h && bfc.b(bfbVar3, false)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    aydVar2.l(z);
                }
                bfb bfbVar4 = bfb.this;
                ayd aydVar3 = bfbVar4.c;
                if (aydVar3 == null) {
                    return;
                }
                if (!h || !bfc.b(bfbVar4, true)) {
                    z3 = false;
                }
                aydVar3.j(z3);
            }

            @Override // defpackage.ays
            public final void a() {
                g();
            }

            @Override // defpackage.ays
            public final void b(long j2) {
                baa d;
                int a;
                bdd bddVar;
                if (bfb.this.w() && bfb.this.f().a().length() != 0) {
                    bfb bfbVar = bfb.this;
                    bfbVar.n = d.aH(bfbVar.n, j2);
                    ayd aydVar = bfb.this.c;
                    if (aydVar != null && (d = aydVar.d()) != null) {
                        bfb bfbVar2 = bfb.this;
                        bfbVar2.o(new cjn(d.aH(bfbVar2.l, bfbVar2.n)));
                        if (bfbVar2.m == null) {
                            cjn d2 = bfbVar2.d();
                            d2.getClass();
                            if (!d.d(d2.a)) {
                                int b = bfbVar2.a.b(baa.e(d, bfbVar2.l));
                                dob dobVar = bfbVar2.a;
                                cjn d3 = bfbVar2.d();
                                d3.getClass();
                                if (b == dobVar.b(baa.e(d, d3.a))) {
                                    int i3 = bdd.a;
                                    bddVar = bdd.a.a;
                                } else {
                                    int i4 = bdd.a;
                                    bddVar = bdd.a.b;
                                }
                                bdd bddVar2 = bddVar;
                                doj f = bfbVar2.f();
                                cjn d4 = bfbVar2.d();
                                d4.getClass();
                                bfbVar2.b(f, d4.a, false, false, bddVar2, true);
                                long j3 = djc.a;
                            }
                        }
                        Integer num = bfbVar2.m;
                        if (num != null) {
                            a = num.intValue();
                        } else {
                            a = d.a(bfbVar2.l, false);
                        }
                        cjn d5 = bfbVar2.d();
                        d5.getClass();
                        int a2 = d.a(d5.a, false);
                        if (bfbVar2.m != null || a != a2) {
                            doj f2 = bfbVar2.f();
                            cjn d6 = bfbVar2.d();
                            d6.getClass();
                            int i5 = bdd.a;
                            bfbVar2.b(f2, d6.a, false, false, bdd.a.b, true);
                            long j32 = djc.a;
                        } else {
                            return;
                        }
                    }
                    bfb.this.u(false);
                }
            }

            @Override // defpackage.ays
            public final void c(long j2) {
                baa d;
                baa d2;
                if (bfb.this.w() && bfb.this.c() == null) {
                    bfb.this.q(axp.c);
                    bfb.this.u = -1;
                    bfb.this.l();
                    ayd aydVar = bfb.this.c;
                    if (aydVar != null && (d2 = aydVar.d()) != null && d2.d(j2)) {
                        if (bfb.this.f().a().length() != 0) {
                            bfb.this.j(false);
                            bfb bfbVar = bfb.this;
                            doj b = doj.b(bfbVar.f(), null, djc.a, 5);
                            int i3 = bdd.a;
                            bfb.this.m = Integer.valueOf(djc.e(bfbVar.b(b, j2, true, false, bdd.a.b, true)));
                        } else {
                            return;
                        }
                    } else {
                        ayd aydVar2 = bfb.this.c;
                        if (aydVar2 != null && (d = aydVar2.d()) != null) {
                            bfb bfbVar2 = bfb.this;
                            int b2 = bfbVar2.a.b(baa.e(d, j2));
                            dhv dhvVar = bfbVar2.f().a;
                            long a = djd.a(b2, b2);
                            long j3 = djc.a;
                            doj dojVar = new doj(dhvVar, a);
                            bfbVar2.j(false);
                            cpm cpmVar = bfbVar2.h;
                            if (cpmVar != null) {
                                cpmVar.a(9);
                            }
                            bfbVar2.b.a(dojVar);
                        }
                    }
                    bfb.this.r(axq.a);
                    bfb bfbVar3 = bfb.this;
                    bfbVar3.l = j2;
                    bfbVar3.o(new cjn(j2));
                    bfb.this.n = 0L;
                }
            }

            @Override // defpackage.ays
            public final void d() {
                g();
            }

            @Override // defpackage.ays
            public final void e() {
            }

            @Override // defpackage.ays
            public final void f() {
            }
        };
        this.q = new bcr() { // from class: bfb.1
            @Override // defpackage.bcr
            public final boolean b(long j2, bdd bddVar) {
                ayd aydVar;
                if (bfb.this.w() && bfb.this.f().a().length() != 0 && (aydVar = bfb.this.c) != null && aydVar.d() != null) {
                    d(bfb.this.f(), j2, false, bddVar);
                    return true;
                }
                return false;
            }

            @Override // defpackage.bcr
            public final boolean c(long j2, bdd bddVar) {
                ayd aydVar;
                if (bfb.this.w() && bfb.this.f().a().length() != 0 && (aydVar = bfb.this.c) != null && aydVar.d() != null) {
                    cit citVar = bfb.this.i;
                    if (citVar != null) {
                        citVar.b();
                    }
                    bfb bfbVar = bfb.this;
                    bfbVar.l = j2;
                    bfbVar.u = -1;
                    bfb.this.j(true);
                    bfb bfbVar2 = bfb.this;
                    d(bfbVar2.f(), bfbVar2.l, true, bddVar);
                    return true;
                }
                return false;
            }

            public final void d(doj dojVar, long j2, boolean z, bdd bddVar) {
                axq axqVar;
                if (djc.h(bfb.this.b(dojVar, j2, z, false, bddVar, false))) {
                    axqVar = axq.c;
                } else {
                    axqVar = axq.b;
                }
                bfb.this.r(axqVar);
            }

            @Override // defpackage.bcr
            public final void a() {
            }
        };
    }
}
