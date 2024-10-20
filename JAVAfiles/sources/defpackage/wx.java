package defpackage;

import androidx.compose.animation.EnterExitTransitionElement;
import defpackage.abt;
import defpackage.bwj;
import defpackage.cfq;
import defpackage.cga;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class wx {
    public static final abm b;
    public static final abm c;
    private static final acg d = new ach(AnonymousClass1.a, AnonymousClass2.a);
    public static final abm a = zs.c(brg.a, 400.0f, null, 5);

    /* compiled from: PG */
    /* renamed from: wx$1 */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqr<cmg, zw> {
        public static final AnonymousClass1 a = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* synthetic */ Object a(Object obj) {
            long j = ((cmg) obj).b;
            return new zw(cmg.a(j), cmg.b(j));
        }
    }

    /* compiled from: PG */
    /* renamed from: wx$2 */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends arrp implements arqr<zw, cmg> {
        public static final AnonymousClass2 a = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* synthetic */ Object a(Object obj) {
            zw zwVar = (zw) obj;
            return new cmg(cmh.a(zwVar.a, zwVar.b));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: wx$3 */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends arrp implements arqg<Boolean> {
        public static final AnonymousClass3 a = new AnonymousClass3();

        public AnonymousClass3() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* synthetic */ Object a() {
            return a.by();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: wx$4 */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 extends arrp implements arqr<cle, arnb> {
        final /* synthetic */ boolean a;
        final /* synthetic */ arqg b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(boolean z, arqg arqgVar) {
            super(1);
            this.a = z;
            this.b = arqgVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            cle cleVar = (cle) obj;
            boolean z = false;
            if (!this.a && ((Boolean) this.b.a()).booleanValue()) {
                z = true;
            }
            cleVar.r(z);
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: wx$5 */
    /* loaded from: classes.dex */
    public static final class AnonymousClass5 extends arrp implements arqr<dri, dri> {
        public static final AnonymousClass5 a = new AnonymousClass5();

        public AnonymousClass5() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* synthetic */ Object a(Object obj) {
            long j = ((dri) obj).a;
            return new dri(0L);
        }
    }

    /* compiled from: PG */
    /* renamed from: wx$6 */
    /* loaded from: classes.dex */
    public static final class AnonymousClass6 extends arrp implements arqr<Integer, Integer> {
        public static final AnonymousClass6 a = new AnonymousClass6();

        public AnonymousClass6() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            ((Number) obj).intValue();
            return 0;
        }
    }

    /* compiled from: PG */
    /* renamed from: wx$7 */
    /* loaded from: classes.dex */
    public static final class AnonymousClass7 extends arrp implements arqr<dri, dri> {
        public static final AnonymousClass7 a = new AnonymousClass7();

        public AnonymousClass7() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* synthetic */ Object a(Object obj) {
            long j = ((dri) obj).a;
            return new dri(0L);
        }
    }

    /* compiled from: PG */
    /* renamed from: wx$8 */
    /* loaded from: classes.dex */
    public static final class AnonymousClass8 extends arrp implements arqr<Integer, Integer> {
        public static final AnonymousClass8 a = new AnonymousClass8();

        public AnonymousClass8() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            ((Number) obj).intValue();
            return 0;
        }
    }

    /* compiled from: PG */
    /* renamed from: wx$9 */
    /* loaded from: classes.dex */
    public static final class AnonymousClass9 extends arrp implements arqr<dri, dre> {
        final /* synthetic */ arqr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass9(arqr arqrVar) {
            super(1);
            this.a = arqrVar;
        }

        @Override // defpackage.arqr
        public final /* synthetic */ Object a(Object obj) {
            return new dre(((Number) this.a.a(Integer.valueOf((int) (((dri) obj).a & 4294967295L)))).intValue() & 4294967295L);
        }
    }

    static {
        cjp cjpVar = acz.a;
        b = zs.c(brg.a, 400.0f, new dre(4294967297L), 1);
        c = zs.c(brg.a, 400.0f, new dri(4294967297L), 1);
    }

    public static final xl a(aap aapVar, arqr arqrVar) {
        return new xm(new zh(null, new zd(arqrVar, aapVar), null, null, false, null, 61));
    }

    public static final xl b(aap aapVar, arqr arqrVar) {
        return a(aapVar, new AnonymousClass9(arqrVar));
    }

    public static final xn c(aap aapVar, arqr arqrVar) {
        return new xo(new zh(null, new zd(arqrVar, aapVar), null, null, false, null, 61));
    }

    public static final cga d(final abt abtVar, xl xlVar, xn xnVar, arqg arqgVar, String str, bwj bwjVar, int i, int i2) {
        arqg arqgVar2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        abt.a aVar;
        abt.a aVar2;
        abt.a aVar3;
        boolean z5;
        boolean z6;
        boolean z7;
        abt.a aVar4;
        final abt.a aVar5;
        abt.a aVar6;
        final abt.a aVar7;
        final abt.a aVar8;
        boolean z8;
        boolean z9;
        if ((i2 & 4) != 0) {
            arqgVar2 = AnonymousClass3.a;
        } else {
            arqgVar2 = arqgVar;
        }
        int i3 = i & 14;
        if ((((i & 14) ^ 6) > 4 && bwjVar.G(abtVar)) || (i & 6) == 4) {
            z = true;
        } else {
            z = false;
        }
        Object h = bwjVar.h();
        if (z || h == bwj.a.a) {
            h = new byu(xlVar, cav.a);
            bwjVar.B(h);
        }
        byn bynVar = (byn) h;
        if (abtVar.e() == abtVar.f() && abtVar.e() == wv.b) {
            if (abtVar.t()) {
                r(bynVar, xlVar);
            } else {
                r(bynVar, xl.a);
            }
        } else if (abtVar.f() == wv.b) {
            r(bynVar, o(bynVar).a(xlVar));
        }
        final xl o = o(bynVar);
        int i4 = i >> 3;
        int i5 = (i4 & 112) | i3;
        if ((((i5 & 14) ^ 6) > 4 && bwjVar.G(abtVar)) || (i5 & 6) == 4) {
            z2 = true;
        } else {
            z2 = false;
        }
        Object h2 = bwjVar.h();
        if (z2 || h2 == bwj.a.a) {
            h2 = new byu(xnVar, cav.a);
            bwjVar.B(h2);
        }
        byn bynVar2 = (byn) h2;
        if (abtVar.e() == abtVar.f() && abtVar.e() == wv.b) {
            if (abtVar.t()) {
                s(bynVar2, xnVar);
            } else {
                s(bynVar2, xn.a);
            }
        } else if (abtVar.f() != wv.b) {
            s(bynVar2, p(bynVar2).a(xnVar));
        }
        final xn p = p(bynVar2);
        if (o.b().b == null && p.b().b == null) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (o.b().c == null && p.b().c == null) {
            z4 = false;
        } else {
            z4 = true;
        }
        bwjVar.y(-165037057);
        if (z3) {
            int i6 = i3 | 384;
            acg acgVar = aci.g;
            Object h3 = bwjVar.h();
            if (h3 == bwj.a.a) {
                h3 = str.concat(" slide");
                bwjVar.B(h3);
            }
            aVar = aby.f(abtVar, acgVar, bwjVar, i6);
        } else {
            aVar = null;
        }
        bwjVar.q();
        bwjVar.y(-165030862);
        if (z4) {
            int i7 = i3 | 384;
            acg acgVar2 = aci.h;
            Object h4 = bwjVar.h();
            if (h4 == bwj.a.a) {
                h4 = str.concat(" shrink/expand");
                bwjVar.B(h4);
            }
            aVar2 = aby.f(abtVar, acgVar2, bwjVar, i7);
        } else {
            aVar2 = null;
        }
        bwjVar.q();
        bwjVar.y(-165024913);
        if (z4) {
            int i8 = i3 | 384;
            acg acgVar3 = aci.g;
            Object h5 = bwjVar.h();
            if (h5 == bwj.a.a) {
                h5 = str.concat(" InterruptionHandlingOffset");
                bwjVar.B(h5);
            }
            aVar3 = aby.f(abtVar, acgVar3, bwjVar, i8);
        } else {
            aVar3 = null;
        }
        bwjVar.q();
        o.b();
        p.b();
        boolean z10 = true;
        boolean z11 = !z4;
        int i9 = i4 & 7168;
        if (o.b().a == null && p.b().a == null) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (o.b().d == null && p.b().d == null) {
            z6 = false;
        } else {
            z6 = true;
        }
        int i10 = i9 | i3;
        int i11 = i10 & 14;
        bwjVar.y(-1545796423);
        if (z5) {
            int i12 = i11 | 384;
            acg acgVar4 = aci.a;
            z7 = z11;
            Object h6 = bwjVar.h();
            aVar4 = aVar;
            if (h6 == bwj.a.a) {
                h6 = str.concat(" alpha");
                bwjVar.B(h6);
            }
            aVar5 = aby.f(abtVar, acgVar4, bwjVar, i12);
        } else {
            z7 = z11;
            aVar4 = aVar;
            aVar5 = null;
        }
        bwjVar.q();
        bwjVar.y(-1545788807);
        if (z6) {
            int i13 = i11 | 384;
            acg acgVar5 = aci.a;
            Object h7 = bwjVar.h();
            aVar6 = aVar3;
            if (h7 == bwj.a.a) {
                h7 = str.concat(" scale");
                bwjVar.B(h7);
            }
            aVar7 = aby.f(abtVar, acgVar5, bwjVar, i13);
        } else {
            aVar6 = aVar3;
            aVar7 = null;
        }
        bwjVar.q();
        bwjVar.y(-1545780868);
        if (z6) {
            aVar8 = aby.f(abtVar, d, bwjVar, i11 | 384);
        } else {
            aVar8 = null;
        }
        bwjVar.q();
        boolean I = bwjVar.I(aVar5) | bwjVar.G(o) | bwjVar.G(p) | bwjVar.I(aVar7);
        if (((i11 ^ 6) > 4 && bwjVar.G(abtVar)) || (i10 & 6) == 4) {
            z8 = true;
        } else {
            z8 = false;
        }
        boolean I2 = z8 | I | bwjVar.I(aVar8);
        Object h8 = bwjVar.h();
        if (!I2 && h8 != bwj.a.a) {
            z9 = z7;
        } else {
            z9 = z7;
            Object obj = new xs() { // from class: ww
                @Override // defpackage.xs
                public final arqr a() {
                    cas casVar;
                    cas casVar2;
                    cmg cmgVar;
                    abm abmVar = wx.a;
                    xl xlVar2 = o;
                    abt.a aVar9 = abt.a.this;
                    xn xnVar2 = p;
                    cas casVar3 = null;
                    if (aVar9 != null) {
                        casVar = aVar9.b(new wy(xlVar2, xnVar2), new wz(xlVar2, xnVar2));
                    } else {
                        casVar = null;
                    }
                    abt.a aVar10 = aVar7;
                    if (aVar10 != null) {
                        casVar2 = aVar10.b(new xb(xlVar2, xnVar2), new xc(xlVar2, xnVar2));
                    } else {
                        casVar2 = null;
                    }
                    if (abtVar.e() == wv.a) {
                        xw xwVar = xlVar2.b().d;
                        if (xwVar != null) {
                            cmgVar = new cmg(xwVar.b);
                        } else {
                            xw xwVar2 = xnVar2.b().d;
                            if (xwVar2 != null) {
                                cmgVar = new cmg(xwVar2.b);
                            }
                            cmgVar = null;
                        }
                    } else {
                        xw xwVar3 = xnVar2.b().d;
                        if (xwVar3 != null) {
                            cmgVar = new cmg(xwVar3.b);
                        } else {
                            xw xwVar4 = xlVar2.b().d;
                            if (xwVar4 != null) {
                                cmgVar = new cmg(xwVar4.b);
                            }
                            cmgVar = null;
                        }
                    }
                    abt.a aVar11 = aVar8;
                    if (aVar11 != null) {
                        casVar3 = aVar11.b(xd.a, new xe(cmgVar, xlVar2, xnVar2));
                    }
                    return new xa(casVar, casVar2, casVar3);
                }
            };
            bwjVar.B(obj);
            h8 = obj;
        }
        xs xsVar = (xs) h8;
        cga.a aVar9 = cga.e;
        boolean H = bwjVar.H(z9);
        if ((((i & 7168) ^ 3072) <= 2048 || !bwjVar.G(arqgVar2)) && (i & 3072) != 2048) {
            z10 = false;
        }
        boolean z12 = H | z10;
        Object h9 = bwjVar.h();
        if (z12 || h9 == bwj.a.a) {
            h9 = new AnonymousClass4(z9, arqgVar2);
            bwjVar.B(h9);
        }
        return cld.a(aVar9, (arqr) h9).a(new EnterExitTransitionElement(abtVar, aVar2, aVar6, aVar4, o, p, arqgVar2, xsVar));
    }

    public static final xl e(aap aapVar, cfq cfqVar, arqr arqrVar) {
        return new xm(new zh(null, null, new wn(cfqVar, arqrVar, aapVar), null, false, null, 59));
    }

    public static /* synthetic */ xl f(aap aapVar, int i) {
        if ((i & 1) != 0) {
            cjp cjpVar = acz.a;
            aapVar = zs.c(brg.a, 400.0f, new dri(4294967297L), 1);
        }
        int i2 = cfq.a;
        return e(aapVar, cfq.a.i, AnonymousClass5.a);
    }

    public static /* synthetic */ xl g(aap aapVar, int i) {
        if ((i & 1) != 0) {
            aapVar = zs.c(brg.a, 400.0f, null, 5);
        }
        return new xm(new zh(new xp(aapVar), null, null, null, false, null, 62));
    }

    public static /* synthetic */ xn h(aap aapVar, int i) {
        if ((i & 1) != 0) {
            aapVar = zs.c(brg.a, 400.0f, null, 5);
        }
        return new xo(new zh(new xp(aapVar), null, null, null, false, null, 62));
    }

    public static /* synthetic */ xl i(aap aapVar, float f, int i) {
        if ((i & 1) != 0) {
            aapVar = zs.c(brg.a, 400.0f, null, 5);
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        return new xm(new zh(null, null, null, new xw(f, cmg.a, aapVar), false, null, 55));
    }

    public static /* synthetic */ xn j(aap aapVar) {
        return new xo(new zh(null, null, null, new xw(brg.a, cmg.a, aapVar), false, null, 55));
    }

    public static final xn k(aap aapVar, cfq cfqVar, arqr arqrVar) {
        return new xo(new zh(null, null, new wn(cfqVar, arqrVar, aapVar), null, false, null, 59));
    }

    public static /* synthetic */ xn l() {
        cjp cjpVar = acz.a;
        abm c2 = zs.c(brg.a, 400.0f, new dri(4294967297L), 1);
        int i = cfq.a;
        return k(c2, cfq.a.i, AnonymousClass7.a);
    }

    public static /* synthetic */ xl m() {
        cjp cjpVar = acz.a;
        abm c2 = zs.c(brg.a, 400.0f, new dri(4294967297L), 1);
        int i = cfq.a;
        return e(c2, q(cfq.a.l), new xf(AnonymousClass6.a));
    }

    public static /* synthetic */ xn n() {
        cjp cjpVar = acz.a;
        abm c2 = zs.c(brg.a, 400.0f, new dri(4294967297L), 1);
        int i = cfq.a;
        return k(c2, q(cfq.a.l), new xg(AnonymousClass8.a));
    }

    private static final xl o(byn bynVar) {
        return (xl) bynVar.a();
    }

    private static final xn p(byn bynVar) {
        return (xn) bynVar.a();
    }

    private static final cfq q(cfq.c cVar) {
        int i = cfq.a;
        if (d.F(cVar, cfq.a.j)) {
            return cfq.a.b;
        }
        if (d.F(cVar, cfq.a.l)) {
            return cfq.a.h;
        }
        return cfq.a.e;
    }

    private static final void r(byn bynVar, xl xlVar) {
        bynVar.h(xlVar);
    }

    private static final void s(byn bynVar, xn xnVar) {
        bynVar.h(xnVar);
    }
}
