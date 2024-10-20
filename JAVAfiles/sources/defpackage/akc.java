package defpackage;

import defpackage.cfq;
import defpackage.cvc;
import defpackage.cwl;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akc {
    private static final cue a;
    private static final ve b = f(true);
    private static final ve c = f(false);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: akc$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ cga a;
        final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(cga cgaVar, int i) {
            super(2);
            this.a = cgaVar;
            this.b = i;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            int a = bzh.a(this.b | 1);
            akc.b(this.a, (bwj) obj, a);
            return arnb.a;
        }
    }

    static {
        int i = cfq.a;
        a = new cue() { // from class: akc.2

            /* compiled from: PG */
            /* renamed from: akc$2$1, reason: invalid class name */
            /* loaded from: classes.dex */
            static final class AnonymousClass1 extends arrp implements arqr<cvc.a, arnb> {
                public static final AnonymousClass1 a = new AnonymousClass1();

                public AnonymousClass1() {
                    super(1);
                }

                @Override // defpackage.arqr
                public final /* bridge */ /* synthetic */ Object a(Object obj) {
                    return a.bF(obj);
                }
            }

            @Override // defpackage.cue
            public final /* synthetic */ int a(ctd ctdVar, List list, int i2) {
                return cud.a(this, ctdVar, list, i2);
            }

            @Override // defpackage.cue
            public final /* synthetic */ int b(ctd ctdVar, List list, int i2) {
                return cud.b(this, ctdVar, list, i2);
            }

            @Override // defpackage.cue
            public final /* synthetic */ int c(ctd ctdVar, List list, int i2) {
                return cud.c(this, ctdVar, list, i2);
            }

            @Override // defpackage.cue
            public final /* synthetic */ int d(ctd ctdVar, List list, int i2) {
                return cud.d(this, ctdVar, list, i2);
            }

            @Override // defpackage.cue
            public final cuf e(cuh cuhVar, List list, long j) {
                cuf et;
                et = cuhVar.et(dqs.d(j), dqs.c(j), arnw.a, AnonymousClass1.a);
                return et;
            }
        };
    }

    public static final cue a(cfq cfqVar, boolean z) {
        ve veVar;
        if (z) {
            veVar = b;
        } else {
            veVar = c;
        }
        cue cueVar = (cue) veVar.a(cfqVar);
        if (cueVar == null) {
            return new akd(cfqVar, z);
        }
        return cueVar;
    }

    public static final void b(cga cgaVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 6;
        bwj c2 = bwjVar.c(-211209833);
        if (i4 == 0) {
            if (true != c2.G(cgaVar)) {
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
            cue cueVar = a;
            int a2 = bwg.a(c2);
            cga b2 = cfv.b(c2, cgaVar);
            bwk bwkVar = (bwk) c2;
            byx P = bwkVar.P();
            int i5 = cwl.a;
            arqg arqgVar = cwl.a.a;
            c2.A();
            if (bwkVar.y) {
                c2.l(arqgVar);
            } else {
                c2.C();
            }
            caw.b(c2, cueVar, cwl.a.e);
            caw.b(c2, P, cwl.a.d);
            caw.b(c2, b2, cwl.a.c);
            arqv arqvVar = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                bwkVar.ad(valueOf);
                c2.j(valueOf, arqvVar);
            }
            c2.p();
        }
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new AnonymousClass1(cgaVar, i);
        }
    }

    public static final void c(cvc.a aVar, cvc cvcVar, cuc cucVar, drk drkVar, int i, int i2, cfq cfqVar) {
        cfq cfqVar2;
        cfq cfqVar3;
        akb e = e(cucVar);
        if (e != null && (cfqVar3 = e.a) != null) {
            cfqVar2 = cfqVar3;
        } else {
            cfqVar2 = cfqVar;
        }
        aVar.f(cvcVar, cfqVar2.a((cvcVar.a << 32) | (cvcVar.b & 4294967295L), (i << 32) | (i2 & 4294967295L), drkVar), brg.a);
    }

    public static final boolean d(cuc cucVar) {
        akb e = e(cucVar);
        if (e != null) {
            return e.b;
        }
        return false;
    }

    private static final akb e(cuc cucVar) {
        Object f = cucVar.f();
        if (f instanceof akb) {
            return (akb) f;
        }
        return null;
    }

    private static final ve f(boolean z) {
        ve veVar = new ve(9);
        int i = cfq.a;
        cfq cfqVar = cfq.a.a;
        veVar.j(cfqVar, new akd(cfqVar, z));
        cfq cfqVar2 = cfq.a.b;
        veVar.j(cfqVar2, new akd(cfqVar2, z));
        cfq cfqVar3 = cfq.a.c;
        veVar.j(cfqVar3, new akd(cfqVar3, z));
        cfq cfqVar4 = cfq.a.d;
        veVar.j(cfqVar4, new akd(cfqVar4, z));
        cfq cfqVar5 = cfq.a.e;
        veVar.j(cfqVar5, new akd(cfqVar5, z));
        cfq cfqVar6 = cfq.a.f;
        veVar.j(cfqVar6, new akd(cfqVar6, z));
        cfq cfqVar7 = cfq.a.g;
        veVar.j(cfqVar7, new akd(cfqVar7, z));
        cfq cfqVar8 = cfq.a.h;
        veVar.j(cfqVar8, new akd(cfqVar8, z));
        cfq cfqVar9 = cfq.a.i;
        veVar.j(cfqVar9, new akd(cfqVar9, z));
        return veVar;
    }
}
