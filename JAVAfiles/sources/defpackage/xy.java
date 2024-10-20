package defpackage;

import defpackage.cga;
import defpackage.cvc;
import defpackage.dqs;
import defpackage.yg;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class xy extends cga.c implements csp, cwx, cvy {
    public ye a;
    public cof b;
    public final cvw c;

    /* compiled from: PG */
    /* renamed from: xy$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqr<cny, arnb> {
        final /* synthetic */ cnt a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(cnt cntVar) {
            super(1);
            this.a = cntVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            this.a.p();
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: xy$2, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends arrp implements arqr<cvc.a, arnb> {
        final /* synthetic */ cvc a;
        final /* synthetic */ xy b;
        final /* synthetic */ long c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(cvc cvcVar, xy xyVar, long j) {
            super(1);
            this.a = cvcVar;
            this.b = xyVar;
            this.c = j;
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x008d, code lost:
        
            if (defpackage.a.bB(r1.a, r4) != false) goto L32;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.arqr
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object r11) {
            /*
                r10 = this;
                cvc$a r11 = (cvc.a) r11
                cti r0 = r11.b()
                r1 = 0
                if (r0 == 0) goto L38
                xy r2 = r10.b
                long r3 = r10.c
                yd r5 = r2.l()
                yi r5 = r5.b
                cti r5 = r5.d()
                r6 = 0
                long r5 = r5.h(r0, r6)
                yd r0 = r2.l()
                cjp r0 = r0.a()
                if (r0 != 0) goto L32
                yd r0 = r2.l()
                cjp r2 = defpackage.cjq.a(r5, r3)
                r0.d(r2)
            L32:
                cjn r0 = new cjn
                r0.<init>(r5)
                goto L39
            L38:
                r0 = r1
            L39:
                cvc r2 = r10.a
                r3 = 0
                cvc.a.k(r11, r2, r3, r3)
                if (r0 == 0) goto Lb6
                xy r11 = r10.b
                long r4 = r10.c
                yd r2 = r11.l()
                ye r11 = r11.a
                wk r6 = r11.c()
                boolean r6 = r6.f()
                if (r6 == 0) goto Lb6
                r2.c = r11
                cjp r11 = r2.c()
                if (r11 == 0) goto L67
                long r6 = r11.c()
                cjn r11 = new cjn
                r11.<init>(r6)
                goto L68
            L67:
                r11 = r1
            L68:
                long r6 = r0.a
                if (r11 != 0) goto L6d
                goto L90
            L6d:
                long r8 = r11.a
                boolean r11 = defpackage.a.bB(r8, r6)
                if (r11 == 0) goto L90
                cjp r11 = r2.c()
                if (r11 == 0) goto L85
                long r0 = r11.b()
                cjt r11 = new cjt
                r11.<init>(r0)
                r1 = r11
            L85:
                if (r1 == 0) goto L90
                long r0 = r1.a
                boolean r11 = defpackage.a.bB(r0, r4)
                if (r11 == 0) goto L90
                goto Lb6
            L90:
                cjp r11 = defpackage.cjq.a(r6, r4)
                r2.f(r11)
                cez r0 = r2.d
                int r1 = r0.a()
            L9d:
                if (r3 >= r1) goto Lb6
                java.lang.Object r4 = r0.get(r3)
                ye r4 = (defpackage.ye) r4
                wk r4 = r4.c()
                cjp r5 = r2.a()
                r5.getClass()
                r4.d(r5, r11)
                int r3 = r3 + 1
                goto L9d
            Lb6:
                arnb r11 = defpackage.arnb.a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.xy.AnonymousClass2.a(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: PG */
    /* renamed from: xy$3, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass3 extends arrp implements arqg<cti> {
        public AnonymousClass3() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            return xy.this.n();
        }
    }

    /* compiled from: PG */
    /* renamed from: xy$4, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass4 extends arrp implements arqg {
        public static final AnonymousClass4 a = new AnonymousClass4();

        public AnonymousClass4() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            return null;
        }
    }

    public xy(ye yeVar) {
        this.a = yeVar;
        this.b = yeVar.f();
        this.c = cvz.a(new armo(yc.a, yeVar));
    }

    private final void y(cof cofVar) {
        if (cofVar == null) {
            cof cofVar2 = this.b;
            if (cofVar2 != null) {
                cwp.b(this).b(cofVar2);
            }
        } else {
            this.a.j(cofVar);
        }
        this.b = cofVar;
    }

    @Override // defpackage.csp
    public final /* synthetic */ int a(csj csjVar, ctc ctcVar, int i) {
        csl cslVar = new csl(this);
        cyq cyqVar = new cyq(ctcVar, cys.b, cyt.b);
        long l = dqt.l(i, 0, 13);
        return cslVar.a.o(new csk(csjVar, csjVar.q()), cyqVar, l).j();
    }

    @Override // defpackage.cxi
    public final cuf b(cuh cuhVar, cuc cucVar, long j) {
        cuf et;
        cvc e = cucVar.e(j);
        float f = e.a;
        float f2 = e.b;
        et = cuhVar.et(e.a, e.b, arnw.a, new AnonymousClass2(e, this, (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32)));
        return et;
    }

    @Override // defpackage.cxi
    public final /* synthetic */ int d(ctd ctdVar, ctc ctcVar, int i) {
        return cxh.a(this, ctdVar, ctcVar, i);
    }

    @Override // cga.c
    public final void dQ() {
        cvx.b(this, yc.a, this.a);
        this.a.k = (ye) cvx.a(this, yc.a);
        y(cwp.b(this).a());
        this.a.j = new AnonymousClass3();
    }

    @Override // defpackage.cxi
    public final /* synthetic */ int e(ctd ctdVar, ctc ctcVar, int i) {
        return cxh.b(this, ctdVar, ctcVar, i);
    }

    @Override // cga.c
    public final void eb() {
        cof cofVar = this.b;
        if (cofVar != null) {
            cwp.b(this).b(cofVar);
        }
        y(cwp.b(this).a());
    }

    @Override // defpackage.cxi
    public final /* synthetic */ int f(ctd ctdVar, ctc ctcVar, int i) {
        return cxh.c(this, ctdVar, ctcVar, i);
    }

    @Override // defpackage.cxi
    public final /* synthetic */ int g(ctd ctdVar, ctc ctcVar, int i) {
        return cxh.d(this, ctdVar, ctcVar, i);
    }

    @Override // defpackage.csp
    public final /* synthetic */ int h(csj csjVar, ctc ctcVar, int i) {
        csm csmVar = new csm(this);
        cyq cyqVar = new cyq(ctcVar, cys.b, cyt.a);
        long l = dqt.l(0, i, 7);
        return csmVar.a.o(new csk(csjVar, csjVar.q()), cyqVar, l).k();
    }

    @Override // defpackage.csp
    public final /* synthetic */ int i(csj csjVar, ctc ctcVar, int i) {
        csn csnVar = new csn(this);
        cyq cyqVar = new cyq(ctcVar, cys.a, cyt.b);
        long l = dqt.l(i, 0, 13);
        return csnVar.a.o(new csk(csjVar, csjVar.q()), cyqVar, l).j();
    }

    @Override // defpackage.csp
    public final /* synthetic */ int j(csj csjVar, ctc ctcVar, int i) {
        cso csoVar = new cso(this);
        cyq cyqVar = new cyq(ctcVar, cys.a, cyt.a);
        long l = dqt.l(0, i, 7);
        return csoVar.a.o(new csk(csjVar, csjVar.q()), cyqVar, l).k();
    }

    public final wk k() {
        return this.a.c();
    }

    public final yd l() {
        return this.a.d();
    }

    public final cti m() {
        cti ctiVar = l().b.f;
        if (ctiVar != null) {
            return ctiVar;
        }
        arro.b("root");
        return null;
    }

    public final cti n() {
        return this.a.d().b.dV(cwp.c(this));
    }

    @Override // defpackage.csp
    public final cuf o(csq csqVar, cuc cucVar, long j) {
        cuf et;
        cuf et2;
        int i;
        if (l().i()) {
            cjp c = k().c();
            if (c == null) {
                c = l().a();
            }
            if (c != null) {
                long b = drj.b(c.b());
                long j2 = b >> 32;
                long j3 = b & 4294967295L;
                int i2 = (int) j2;
                if (i2 != Integer.MAX_VALUE && (i = (int) j3) != Integer.MAX_VALUE) {
                    j = dqs.a.c(arrn.r(i2, 0), arrn.r(i, 0));
                } else {
                    throw new IllegalArgumentException("Error: Infinite width/height is invalid. animated bounds: " + k().c() + ", current bounds: " + l().a());
                }
            }
        }
        cvc e = cucVar.e(j);
        if (!l().i()) {
            et2 = csqVar.et(e.a, e.b, arnw.a, new xz(this, e));
            return et2;
        }
        long a = ((yg.b) this.a.e.a()).a(n().g());
        et = csqVar.et((int) (a >> 32), (int) (a & 4294967295L), arnw.a, new ya(this, e));
        return et;
    }

    @Override // defpackage.cvy
    public final cvw p() {
        return this.c;
    }

    @Override // defpackage.cwb
    public final /* synthetic */ Object q(cvt cvtVar) {
        return cvx.a(this, cvtVar);
    }

    @Override // defpackage.cwx
    public final void r(cnt cntVar) {
        ye yeVar = this.a;
        yg.a aVar = (yg.a) yeVar.g.a();
        yg.d e = this.a.e();
        l().a().getClass();
        cwp.h(this);
        aVar.a(e);
        yeVar.i = null;
        cof f = this.a.f();
        if (f != null) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(cntVar);
            long o = cntVar.o();
            int intBitsToFloat = (int) Float.intBitsToFloat((int) (o >> 32));
            int intBitsToFloat2 = (int) Float.intBitsToFloat((int) (o & 4294967295L));
            cnr cnrVar = ((cxp) cntVar).a;
            f.f(cnrVar, cnrVar.r(), (intBitsToFloat << 32) | (intBitsToFloat2 & 4294967295L), new cnx(cnrVar, anonymousClass1));
            ye yeVar2 = this.a;
            if (yeVar2.d().i() && (yeVar2.l() || !yeVar2.k())) {
                return;
            }
            coh.a(cntVar, f);
            return;
        }
        throw new IllegalArgumentException("Error: Layer is null when accessed for shared bounds/element : " + l().a + ",target: " + this.a.c().f() + ", is attached: " + this.z);
    }

    @Override // cga.c
    public final void s() {
        y(null);
        ye yeVar = this.a;
        yeVar.k = null;
        yeVar.j = AnonymousClass4.a;
    }

    public final void v(cti ctiVar) {
        yd l = l();
        long h = m().h(ctiVar, 0L);
        long g = ctiVar.g() >> 32;
        long g2 = ctiVar.g() & 4294967295L;
        l.d(cjq.a(h, (Float.floatToRawIntBits((int) g) << 32) | (Float.floatToRawIntBits((int) g2) & 4294967295L)));
    }

    @Override // defpackage.csp
    public final boolean w() {
        if (l().i() && this.a.d().b.a()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.cwx
    public final /* synthetic */ void t() {
    }

    @Override // defpackage.csp
    public final /* synthetic */ void x() {
    }
}
