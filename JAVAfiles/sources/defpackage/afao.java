package defpackage;

import android.os.Build;
import defpackage.bwj;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afao extends arrp implements arqw {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afao(Object obj, arqg arqgVar, int i) {
        super(3);
        this.c = i;
        this.a = obj;
        this.b = arqgVar;
    }

    /* JADX WARN: Type inference failed for: r1v24, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v38, types: [byj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.lang.Object, arqg] */
    @Override // defpackage.arqw
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        boolean booleanValue;
        int i;
        cga b;
        cga a;
        cga a2;
        cga b2;
        cga c;
        boolean z;
        switch (this.c) {
            case 0:
                bwj bwjVar = (bwj) obj2;
                int intValue = ((Number) obj3).intValue();
                ((akn) obj).getClass();
                if ((intValue & 81) == 16 && bwjVar.L()) {
                    bwjVar.v();
                } else {
                    for (aehz aehzVar : this.a) {
                        bwjVar.y(-1347280435);
                        boolean G = bwjVar.G(aehzVar) | bwjVar.G(this.b);
                        Object obj4 = this.b;
                        Object h = bwjVar.h();
                        if (G || h == bwj.a.a) {
                            h = new aenj(aehzVar, obj4, 9, null);
                            bwjVar.B(h);
                        }
                        bwjVar.q();
                        adom.bM(aehzVar, (arqg) h, bwjVar, 0);
                    }
                }
                return arnb.a;
            case 1:
                bwj bwjVar2 = (bwj) obj2;
                int intValue2 = ((Number) obj3).intValue();
                ((amt) obj).getClass();
                if ((intValue2 & 81) == 16 && bwjVar2.L()) {
                    bwjVar2.v();
                } else {
                    ahji.e(((aehz) this.b).a, null, 0L, 0L, 0L, new dqi(3), 0L, 0, false, 0, 0, null, bmp.d(bwjVar2).m, bwjVar2, 0, 0, 65022);
                    Object obj5 = this.b;
                    ?? r3 = this.a;
                    List list = ((aehz) obj5).g;
                    booleanValue = ((Boolean) r3.a()).booleanValue();
                    bwjVar2.y(-365283092);
                    Object obj6 = this.a;
                    Object h2 = bwjVar2.h();
                    if (h2 == bwj.a.a) {
                        h2 = new aetz(obj6, 7);
                        bwjVar2.B(h2);
                    }
                    bwjVar2.q();
                    adom.bK(list, booleanValue, (arqg) h2, bwjVar2, 3080);
                }
                return arnb.a;
            case 2:
                bwj bwjVar3 = (bwj) obj2;
                int intValue3 = ((Number) obj3).intValue();
                ((akn) obj).getClass();
                if ((intValue3 & 81) == 16 && bwjVar3.L()) {
                    bwjVar3.v();
                } else {
                    for (aehz aehzVar2 : this.a) {
                        bwjVar3.y(1191356539);
                        boolean G2 = bwjVar3.G(aehzVar2) | bwjVar3.G(this.b);
                        Object obj7 = this.b;
                        Object h3 = bwjVar3.h();
                        if (G2 || h3 == bwj.a.a) {
                            h3 = new aenj(aehzVar2, obj7, 10, null);
                            bwjVar3.B(h3);
                        }
                        bwjVar3.q();
                        adom.bM(aehzVar2, (arqg) h3, bwjVar3, 0);
                    }
                }
                return arnb.a;
            case 3:
                aki akiVar = (aki) obj;
                bwj bwjVar4 = (bwj) obj2;
                int intValue4 = ((Number) obj3).intValue();
                akiVar.getClass();
                if ((intValue4 & 14) == 0) {
                    if (true != bwjVar4.G(akiVar)) {
                        i = 2;
                    } else {
                        i = 4;
                    }
                    intValue4 |= i;
                }
                if ((intValue4 & 91) == 18 && bwjVar4.L()) {
                    bwjVar4.v();
                } else {
                    aeke.bG(akiVar, (afhe) this.a, brg.a, this.b, bwjVar4, (intValue4 & 14) | 64, 2);
                }
                return arnb.a;
            case 4:
                bwj bwjVar5 = (bwj) obj2;
                int intValue5 = ((Number) obj3).intValue();
                ((amj) obj).getClass();
                if ((intValue5 & 81) == 16 && bwjVar5.L()) {
                    bwjVar5.v();
                } else {
                    float bA = aeke.bA(qjl.c(this.a));
                    if (bA > brg.a) {
                        b = amv.b(cga.e, 1.0f);
                        a = adf.a(cha.a(b, bA), bmp.a(bwjVar5).J, clw.a);
                        amx.a(a, bwjVar5);
                        bwjVar5.y(1795927780);
                        boolean G3 = bwjVar5.G(this.b);
                        Object obj8 = this.b;
                        Object h4 = bwjVar5.h();
                        if (G3 || h4 == bwj.a.a) {
                            h4 = new afhj(obj8, 0);
                            bwjVar5.B(h4);
                        }
                        bwjVar5.q();
                        a.bS(false, (arqg) h4, bwjVar5, 0, 1);
                    }
                }
                return arnb.a;
            case 5:
                bwj bwjVar6 = (bwj) obj2;
                ((Number) obj3).intValue();
                ((wh) obj).getClass();
                a2 = adf.a(cga.e, cku.a, clw.a);
                b2 = amv.b(a2, 1.0f);
                bwjVar6.y(-95326578);
                Object h5 = bwjVar6.h();
                if (h5 == bwj.a.a) {
                    h5 = afob.t;
                    bwjVar6.B(h5);
                }
                bwjVar6.q();
                c = dhb.c(b2, false, (arqr) h5);
                bqv.c(c, null, 0L, 0L, brg.a, brg.a, null, cdk.e(470991355, new aezg(this.b, this.a, 9, null), bwjVar6), bwjVar6, 126);
                return arnb.a;
            case 6:
                bwj bwjVar7 = (bwj) obj2;
                ((Number) obj3).intValue();
                ((wh) obj).getClass();
                if (Build.VERSION.SDK_INT < 35) {
                    z = true;
                } else {
                    z = false;
                }
                dtn dtnVar = new dtn(true, false, z, 10);
                bwjVar7.y(-508277681);
                boolean G4 = bwjVar7.G(this.b);
                Object h6 = bwjVar7.h();
                if (G4 || h6 == bwj.a.a) {
                    h6 = new afzg(this.b, 12);
                    bwjVar7.B(h6);
                }
                bwjVar7.q();
                dsu.c(null, (arqg) h6, dtnVar, cdk.e(-1475613624, new aezg(this.b, this.a, 11, null), bwjVar7), bwjVar7, 24576, 3);
                return arnb.a;
            default:
                bwj bwjVar8 = (bwj) obj2;
                int intValue6 = ((Number) obj3).intValue();
                ((akn) obj).getClass();
                if ((intValue6 & 81) == 16 && bwjVar8.L()) {
                    bwjVar8.v();
                } else {
                    arta artaVar = (arta) this.b;
                    int i2 = artaVar.b;
                    int i3 = artaVar.a;
                    if (i3 <= i2) {
                        while (true) {
                            afzv.F((agcy) this.a.get(i3), bwjVar8, 0);
                            if (i3 != i2) {
                                i3++;
                            }
                        }
                    }
                }
                return arnb.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afao(Object obj, Object obj2, int i) {
        super(3);
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
