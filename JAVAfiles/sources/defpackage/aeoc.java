package defpackage;

import android.graphics.Point;
import android.net.Uri;
import defpackage.bwj;
import defpackage.cfq;
import defpackage.cwl;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeoc extends arrp implements arqx {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeoc(afbr afbrVar, byn bynVar, byn bynVar2, byn bynVar3, int i) {
        super(4);
        this.e = i;
        this.b = afbrVar;
        this.a = bynVar;
        this.c = bynVar2;
        this.d = bynVar3;
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v0, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v1, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v19, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, ake] */
    /* JADX WARN: Type inference failed for: r4v13, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, aerq] */
    /* JADX WARN: Type inference failed for: r7v0, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v11, types: [csv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3, types: [byn, java.lang.Object] */
    @Override // defpackage.arqx
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        qkg qkgVar;
        qkg qkgVar2;
        int i;
        Uri aS;
        boolean booleanValue;
        long j;
        int i2 = this.e;
        if (i2 != 0) {
            jzj jzjVar = null;
            boolean z = false;
            if (i2 != 1) {
                if (i2 != 2) {
                    Point point = (Point) obj;
                    cga cgaVar = (cga) obj2;
                    bwj bwjVar = (bwj) obj3;
                    ((Number) obj4).intValue();
                    cgaVar.getClass();
                    int i3 = cfq.a;
                    cue a = akc.a(cfq.a.a, false);
                    int a2 = bwg.a(bwjVar);
                    bwy d = bwjVar.d();
                    cga b = cfv.b(bwjVar, cgaVar);
                    int i4 = cwl.a;
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
                    ?? r11 = this.a;
                    caw.b(bwjVar, b, cwl.a.c);
                    akf akfVar = akf.a;
                    cga b2 = akfVar.b(cga.e);
                    booleanValue = ((Boolean) r11.a()).booleanValue();
                    if (booleanValue) {
                        bwjVar.y(1789357858);
                        j = bmp.a(bwjVar).c;
                        bwjVar.q();
                    } else {
                        bwjVar.y(1789431266);
                        j = bmp.a(bwjVar).v;
                        bwjVar.q();
                    }
                    ?? r10 = this.d;
                    ?? r4 = this.c;
                    afbr afbrVar = (afbr) this.b;
                    bqv.c(b2, null, j, 0L, brg.a, brg.a, null, cdk.e(-2131941403, new agix(point, afbrVar, (byn) r4, (byn) r10, (byn) r11, 1), bwjVar), bwjVar, 122);
                    bwjVar.y(-1189166827);
                    if (!d.F(adom.bk(r4), Uri.EMPTY)) {
                        adom.bj(akfVar, new afbt(afbrVar.d, afbrVar.c), akfVar.b(cga.e), bwjVar, 6);
                    }
                    bwjVar.q();
                    bwjVar.p();
                    return arnb.a;
                }
                Point point2 = (Point) obj;
                cga cgaVar2 = (cga) obj2;
                bwj bwjVar2 = (bwj) obj3;
                ((Number) obj4).intValue();
                cgaVar2.getClass();
                if (aeke.aT(aeke.aS(this.d))) {
                    aS = aeke.aR(this.a);
                } else {
                    aS = aeke.aS(this.d);
                }
                aeke.aX(aS, zs.d(500, 0, null, 6), cdk.e(-1822961818, new aerr(this.b, cgaVar2, point2, this.c, this.d, this.a), bwjVar2), bwjVar2, 28040);
                return arnb.a;
            }
            int intValue = ((Number) obj2).intValue();
            bwj bwjVar3 = (bwj) obj3;
            int intValue2 = ((Number) obj4).intValue();
            ((anq) obj).getClass();
            if ((intValue2 & 112) == 0) {
                if (true != bwjVar3.E(intValue)) {
                    i = 16;
                } else {
                    i = 32;
                }
                intValue2 |= i;
            }
            if ((intValue2 & 721) == 144 && bwjVar3.L()) {
                bwjVar3.v();
            } else {
                Object obj5 = this.c;
                bwjVar3.y(-324173789);
                jxt jxtVar = (jxt) obj5;
                if (jxtVar.a() && ((Boolean) jxtVar.a.a()).booleanValue()) {
                    bwjVar3.y(-783277414);
                    jzk jzkVar = (jzk) jxtVar.b.h(intValue);
                    if (jzkVar != null) {
                        qkgVar2 = jzkVar.b();
                    } else {
                        qkgVar2 = null;
                    }
                    if (qkgVar2 != null) {
                        jzjVar = (jzj) hwr.M(qkgVar2, bwjVar3);
                    }
                    bwjVar3.q();
                } else {
                    bwjVar3.y(-783209121);
                    jzk jzkVar2 = (jzk) jxtVar.b.g(intValue);
                    if (jzkVar2 != null) {
                        qkgVar = jzkVar2.b();
                    } else {
                        qkgVar = null;
                    }
                    if (qkgVar != null) {
                        jzjVar = (jzj) hwr.M(qkgVar, bwjVar3);
                    }
                    bwjVar3.q();
                }
                bwjVar3.q();
                if (jzjVar != null) {
                    bwjVar3.y(219812113);
                    bwjVar3.y(-270003799);
                    if (intValue == 0) {
                        hwr.J(jzjVar, (jym) this.b, bwjVar3, 0);
                        jym jymVar = (jym) this.b;
                        if (jymVar.q.c) {
                            hwr.H(jymVar, (aov) this.d, jzjVar, bwjVar3, 0);
                        }
                        intValue = 0;
                    }
                    bwjVar3.q();
                    jzl.a(jzjVar, (zj) this.a, bwjVar3, 64, 0);
                    bwjVar3.y(-269994659);
                    boolean G = bwjVar3.G(this.b);
                    if ((intValue2 & 112) == 32) {
                        z = true;
                    }
                    boolean G2 = G | z | bwjVar3.G(jzjVar);
                    Object obj6 = this.b;
                    Object h = bwjVar3.h();
                    if (G2 || h == bwj.a.a) {
                        h = new mqh((jym) obj6, intValue, jzjVar, 1);
                        bwjVar3.B(h);
                    }
                    bwjVar3.q();
                    bxl.c(jzjVar, (arqr) h, bwjVar3);
                    bwjVar3.q();
                } else {
                    bwjVar3.y(220177696);
                    adcx.bK(bwjVar3, 0);
                    bwjVar3.q();
                }
            }
            return arnb.a;
        }
        int intValue3 = ((Number) obj4).intValue();
        ((wb) obj).getClass();
        ?? r7 = this.d;
        Object obj7 = this.c;
        adom.ax(this.a, ((Boolean) obj2).booleanValue(), (aeoi) this.b, (aeoa) obj7, r7, (bwj) obj3, intValue3 & 112);
        return arnb.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeoc(ake akeVar, aeoi aeoiVar, aeoa aeoaVar, byn bynVar, int i) {
        super(4);
        this.e = i;
        this.a = akeVar;
        this.b = aeoiVar;
        this.c = aeoaVar;
        this.d = bynVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeoc(byn bynVar, byn bynVar2, aerq aerqVar, csv csvVar, int i) {
        super(4);
        this.e = i;
        this.d = bynVar;
        this.a = bynVar2;
        this.b = aerqVar;
        this.c = csvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeoc(jxt jxtVar, jym jymVar, aov aovVar, zj zjVar, int i) {
        super(4);
        this.e = i;
        this.c = jxtVar;
        this.b = jymVar;
        this.d = aovVar;
        this.a = zjVar;
    }
}
