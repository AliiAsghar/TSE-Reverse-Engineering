package defpackage;

import defpackage.bwj;
import defpackage.cfq;
import defpackage.cga;
import defpackage.cwl;
import defpackage.yg;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class yp {
    public static final arqg a = AnonymousClass1.a;
    public static final abm b = zs.c(brg.a, 400.0f, acz.a, 1);
    public static final yg.a c = new yg.a() { // from class: yp.2
        @Override // yg.a
        public final void a(yg.d dVar) {
            yg.d dVar2;
            ye yeVar = dVar.b().k;
            if (yeVar != null) {
                dVar2 = yeVar.e();
            } else {
                dVar2 = null;
            }
            if (dVar2 != null) {
                dVar2.b();
            }
        }
    };
    public static final wm d = new wm() { // from class: yo
        @Override // defpackage.wm
        public final aap a() {
            return yp.b;
        }
    };
    public static final ve e = new ve((byte[]) null);

    /* compiled from: PG */
    /* renamed from: yp$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqg<Boolean> {
        public static final AnonymousClass1 a = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* synthetic */ Object a() {
            return a.by();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: yp$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends arrp implements arqx<yg, cga, bwj, Integer, arnb> {
        final /* synthetic */ arqw a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(arqw arqwVar) {
            super(4);
            this.a = arqwVar;
        }

        @Override // defpackage.arqx
        public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
            int i;
            int i2;
            int i3;
            yg ygVar = (yg) obj;
            cga cgaVar = (cga) obj2;
            bwj bwjVar = (bwj) obj3;
            int intValue = ((Number) obj4).intValue();
            if ((intValue & 6) == 0) {
                if (true != bwjVar.G(ygVar)) {
                    i3 = 2;
                } else {
                    i3 = 4;
                }
                i = i3 | intValue;
            } else {
                i = intValue;
            }
            if ((intValue & 48) == 0) {
                if (true != bwjVar.G(cgaVar)) {
                    i2 = 16;
                } else {
                    i2 = 32;
                }
                i |= i2;
            }
            if ((i & 147) == 146 && bwjVar.L()) {
                bwjVar.v();
            } else {
                arqw arqwVar = this.a;
                int i4 = cfq.a;
                cue a = akc.a(cfq.a.a, false);
                int a2 = bwg.a(bwjVar);
                bwy d = bwjVar.d();
                cga b = cfv.b(bwjVar, cgaVar);
                int i5 = cwl.a;
                arqg arqgVar = cwl.a.a;
                bwjVar.N();
                bwjVar.A();
                if (bwjVar.K()) {
                    bwjVar.l(arqgVar);
                } else {
                    bwjVar.C();
                }
                caw.b(bwjVar, a, cwl.a.e);
                caw.b(bwjVar, d, cwl.a.d);
                arqv arqvVar = cwl.a.f;
                if (bwjVar.K() || !d.F(bwjVar.h(), Integer.valueOf(a2))) {
                    Integer valueOf = Integer.valueOf(a2);
                    bwjVar.B(valueOf);
                    bwjVar.j(valueOf, arqvVar);
                }
                caw.b(bwjVar, b, cwl.a.c);
                arqwVar.a(ygVar, bwjVar, Integer.valueOf(i & 14));
                bwjVar.p();
            }
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: yp$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ cga a;
        final /* synthetic */ arqw b;
        final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(cga cgaVar, arqw arqwVar, int i) {
            super(2);
            this.a = cgaVar;
            this.b = arqwVar;
            this.c = i;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            int a = bzh.a(this.c | 1);
            yp.b(this.a, this.b, (bwj) obj, a);
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: yp$5, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass5 extends arrp implements arqw<ctz, bwj, Integer, arnb> {
        final /* synthetic */ arqx a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(arqx arqxVar) {
            super(3);
            this.a = arqxVar;
        }

        @Override // defpackage.arqw
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
            ctz ctzVar = (ctz) obj;
            bwj bwjVar = (bwj) obj2;
            ((Number) obj3).intValue();
            Object h = bwjVar.h();
            if (h == bwj.a.a) {
                h = bxl.a(arpj.a, bwjVar);
                bwjVar.B(h);
            }
            arwe arweVar = (arwe) h;
            Object h2 = bwjVar.h();
            if (h2 == bwj.a.a) {
                h2 = new yi(ctzVar, arweVar);
                bwjVar.B(h2);
            }
            arqx arqxVar = this.a;
            yi yiVar = (yi) h2;
            cga.a aVar = cga.e;
            Object h3 = bwjVar.h();
            if (h3 == bwj.a.a) {
                h3 = new yr(yiVar);
                bwjVar.B(h3);
            }
            cga a = cts.a(aVar, (arqw) h3);
            Object h4 = bwjVar.h();
            if (h4 == bwj.a.a) {
                h4 = new ys(yiVar);
                bwjVar.B(h4);
            }
            arqxVar.a(yiVar, cho.c(a, (arqr) h4), bwjVar, 6);
            arnb arnbVar = arnb.a;
            Object h5 = bwjVar.h();
            if (h5 == bwj.a.a) {
                h5 = new yu(yiVar);
                bwjVar.B(h5);
            }
            bxl.c(arnbVar, (arqr) h5, bwjVar);
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: yp$6, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass6 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ arqx a;
        final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(arqx arqxVar, int i) {
            super(2);
            this.a = arqxVar;
            this.b = i;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            int a = bzh.a(this.b | 1);
            yp.a(this.a, (bwj) obj, a);
            return arnb.a;
        }
    }

    public static final void a(arqx arqxVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 6;
        bwj c2 = bwjVar.c(-2093217917);
        if (i4 == 0) {
            if (true != c2.I(arqxVar)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c2.L()) {
            c2.v();
        } else {
            cub.a(cdk.e(-863967934, new AnonymousClass5(arqxVar), c2), c2, 6);
        }
        bzz e2 = c2.e();
        if (e2 != null) {
            ((bzf) e2).d = new AnonymousClass6(arqxVar, i);
        }
    }

    public static final void b(cga cgaVar, arqw arqwVar, bwj bwjVar, int i) {
        int i2;
        int i3 = i & 48;
        int i4 = i | 6;
        bwj c2 = bwjVar.c(2043053727);
        if (i3 == 0) {
            if (true != c2.I(arqwVar)) {
                i2 = 16;
            } else {
                i2 = 32;
            }
            i4 |= i2;
        }
        if ((i4 & 19) == 18 && c2.L()) {
            c2.v();
        } else {
            cgaVar = cga.e;
            a(cdk.e(-130587847, new AnonymousClass3(arqwVar), c2), c2, 6);
        }
        bzz e2 = c2.e();
        if (e2 != null) {
            ((bzf) e2).d = new AnonymousClass4(cgaVar, arqwVar, i);
        }
    }
}
