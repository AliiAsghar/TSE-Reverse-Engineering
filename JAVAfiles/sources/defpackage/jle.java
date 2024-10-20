package defpackage;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;
import defpackage.bwj;
import defpackage.cfq;
import defpackage.cwl;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jle extends arrp implements arqx {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jle(Object obj, int i) {
        super(4);
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v107, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v134, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v148, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v176, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v190, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v205, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v41, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v53, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v78, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v93, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v10, types: [gki, java.lang.Object] */
    @Override // defpackage.arqx
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        armo armoVar;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        int i2;
        lhv lhvVar;
        int i3;
        int i4;
        yzx yzxVar;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = 4;
        int i11 = 16;
        switch (this.b) {
            case 0:
                aeon aeonVar = (aeon) obj;
                aenm aenmVar = (aenm) obj2;
                aenv aenvVar = (aenv) obj3;
                aenv aenvVar2 = (aenv) obj4;
                if (aenvVar != null) {
                    armoVar = new armo(aenvVar, jla.d);
                } else if (aeonVar != null) {
                    armoVar = new armo(aeonVar, jla.b);
                } else if (aenmVar != null) {
                    armoVar = new armo(aenmVar, jla.c);
                } else if (aenvVar2 != null) {
                    armoVar = new armo(aenvVar2, jla.e);
                } else {
                    armoVar = new armo(null, jla.a);
                }
                if (aeonVar != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (aenmVar != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (aenvVar != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (aenvVar2 != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                aenp aenpVar = (aenp) armoVar.a;
                jlb jlbVar = new jlb((jla) armoVar.b, z, z2, z3, z4);
                if (!d.F(jlbVar, ((jlf) this.a).b)) {
                    alvw e = jlf.a.e();
                    e.X(alwp.a, "BugleComposeRow2");
                    ((alvg) e.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/DraftUiAdapterImpl$topUiData$7", "invoke", 93, "DraftUiAdapterImpl.kt")).D("Compose row top UI data upstream changed to %s from %s", jlbVar, ((jlf) this.a).b);
                }
                ((jlf) this.a).b = jlbVar;
                return aenpVar;
            case 1:
                SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
                sQLiteQuery.getClass();
                this.a.h(new gko(sQLiteQuery));
                return new SQLiteCursor((SQLiteCursorDriver) obj2, (String) obj3, sQLiteQuery);
            case 2:
                int intValue = ((Number) obj2).intValue();
                bwj bwjVar = (bwj) obj3;
                int intValue2 = ((Number) obj4).intValue();
                ((anq) obj).getClass();
                if ((intValue2 & 112) == 0) {
                    if (true == bwjVar.E(intValue)) {
                        i11 = 32;
                    }
                    intValue2 |= i11;
                }
                if ((intValue2 & 721) == 144 && bwjVar.L()) {
                    bwjVar.v();
                } else {
                    lga.bm((kgl) ((kgk) this.a).a.get(intValue), bwjVar, 8);
                }
                return arnb.a;
            case 3:
                anq anqVar = (anq) obj;
                int intValue3 = ((Number) obj2).intValue();
                bwj bwjVar2 = (bwj) obj3;
                int intValue4 = ((Number) obj4).intValue();
                if ((intValue4 & 6) == 0) {
                    if (true != bwjVar2.G(anqVar)) {
                        i10 = 2;
                    }
                    i = intValue4 | i10;
                } else {
                    i = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    if (true == bwjVar2.E(intValue3)) {
                        i11 = 32;
                    }
                    i |= i11;
                }
                if ((i & 147) == 146 && bwjVar2.L()) {
                    bwjVar2.v();
                } else {
                    aesp aespVar = (aesp) this.a.get(intValue3);
                    bwjVar2.y(380287025);
                    aetn.P(aespVar, null, bwjVar2, 0, 2);
                    bwjVar2.q();
                }
                return arnb.a;
            case 4:
                anq anqVar2 = (anq) obj;
                int intValue5 = ((Number) obj2).intValue();
                bwj bwjVar3 = (bwj) obj3;
                int intValue6 = ((Number) obj4).intValue();
                if ((intValue6 & 6) == 0) {
                    if (true != bwjVar3.G(anqVar2)) {
                        i10 = 2;
                    }
                    i2 = intValue6 | i10;
                } else {
                    i2 = intValue6;
                }
                if ((intValue6 & 48) == 0) {
                    if (true == bwjVar3.E(intValue5)) {
                        i11 = 32;
                    }
                    i2 |= i11;
                }
                if ((i2 & 147) == 146 && bwjVar3.L()) {
                    bwjVar3.v();
                } else {
                    aesx aesxVar = (aesx) this.a.get(intValue5);
                    bwjVar3.y(2048245678);
                    aetn.D(aesxVar, null, bwjVar3, 0, 2);
                    bwjVar3.q();
                }
                return arnb.a;
            case 5:
                int intValue7 = ((Number) obj2).intValue();
                bwj bwjVar4 = (bwj) obj3;
                int intValue8 = ((Number) obj4).intValue();
                ((anq) obj).getClass();
                if ((intValue8 & 112) == 0) {
                    if (true == bwjVar4.E(intValue7)) {
                        i11 = 32;
                    }
                    intValue8 |= i11;
                }
                if ((intValue8 & 721) == 144 && bwjVar4.L()) {
                    bwjVar4.v();
                } else {
                    aetn.P(((lhx) this.a.get(intValue7)).b, null, bwjVar4, 0, 2);
                }
                return arnb.a;
            case 6:
                int intValue9 = ((Number) obj2).intValue();
                bwj bwjVar5 = (bwj) obj3;
                int intValue10 = ((Number) obj4).intValue();
                ((anq) obj).getClass();
                if ((intValue10 & 112) == 0) {
                    if (true == bwjVar5.E(intValue9)) {
                        i11 = 32;
                    }
                    intValue10 |= i11;
                }
                if ((intValue10 & 721) == 144 && bwjVar5.L()) {
                    bwjVar5.v();
                } else {
                    lhr lhrVar = (lhr) ((gqg) this.a).g(intValue9);
                    if (lhrVar != null) {
                        bwjVar5.y(767913740);
                        Object obj5 = this.a;
                        if (intValue9 > 0) {
                            lhr lhrVar2 = (lhr) ((gqg) obj5).h(intValue9 - 1);
                            if (lhrVar2 != null) {
                                lhvVar = new lht(lhrVar2.c);
                            } else {
                                lhvVar = lhu.a;
                            }
                        } else {
                            lhvVar = lhu.b;
                        }
                        lga.d(lhrVar, lhvVar, bwjVar5, 64);
                        bwjVar5.q();
                    } else {
                        bwjVar5.y(767994991);
                        lga.c(bwjVar5, 0);
                        bwjVar5.q();
                    }
                }
                return arnb.a;
            case 7:
                anq anqVar3 = (anq) obj;
                int intValue11 = ((Number) obj2).intValue();
                bwj bwjVar6 = (bwj) obj3;
                int intValue12 = ((Number) obj4).intValue();
                if ((intValue12 & 6) == 0) {
                    if (true != bwjVar6.G(anqVar3)) {
                        i10 = 2;
                    }
                    i3 = intValue12 | i10;
                } else {
                    i3 = intValue12;
                }
                if ((intValue12 & 48) == 0) {
                    if (true == bwjVar6.E(intValue11)) {
                        i11 = 32;
                    }
                    i3 |= i11;
                }
                if ((i3 & 147) == 146 && bwjVar6.L()) {
                    bwjVar6.v();
                } else {
                    aeqn aeqnVar = (aeqn) this.a.get(intValue11);
                    bwjVar6.y(332467481);
                    aeke.bk(aeqnVar.e, null, bwjVar6, 0);
                    bwjVar6.q();
                }
                return arnb.a;
            case 8:
                anq anqVar4 = (anq) obj;
                int intValue13 = ((Number) obj2).intValue();
                bwj bwjVar7 = (bwj) obj3;
                int intValue14 = ((Number) obj4).intValue();
                if ((intValue14 & 6) == 0) {
                    if (true != bwjVar7.G(anqVar4)) {
                        i10 = 2;
                    }
                    i4 = intValue14 | i10;
                } else {
                    i4 = intValue14;
                }
                if ((intValue14 & 48) == 0) {
                    if (true == bwjVar7.E(intValue13)) {
                        i11 = 32;
                    }
                    i4 |= i11;
                }
                if ((i4 & 147) == 146 && bwjVar7.L()) {
                    bwjVar7.v();
                } else {
                    lji ljiVar = (lji) this.a.get(intValue13);
                    bwjVar7.y(1856488620);
                    aetn.P(ljiVar.a().a, null, bwjVar7, 0, 2);
                    bwjVar7.q();
                }
                return arnb.a;
            case 9:
                int intValue15 = ((Number) obj2).intValue();
                bwj bwjVar8 = (bwj) obj3;
                int intValue16 = ((Number) obj4).intValue();
                ((anq) obj).getClass();
                if ((intValue16 & 112) == 0) {
                    if (true == bwjVar8.E(intValue15)) {
                        i11 = 32;
                    }
                    intValue16 |= i11;
                }
                if ((intValue16 & 721) == 144 && bwjVar8.L()) {
                    bwjVar8.v();
                } else {
                    aetn.P(((zdv) this.a.get(intValue15)).a().a, null, bwjVar8, 0, 2);
                }
                return arnb.a;
            case 10:
                int intValue17 = ((Number) obj2).intValue();
                bwj bwjVar9 = (bwj) obj3;
                int intValue18 = ((Number) obj4).intValue();
                ((anq) obj).getClass();
                if ((intValue18 & 112) == 0) {
                    if (true == bwjVar9.E(intValue17)) {
                        i11 = 32;
                    }
                    intValue18 |= i11;
                }
                if ((intValue18 & 721) == 144 && bwjVar9.L()) {
                    bwjVar9.v();
                } else {
                    yzs yzsVar = (yzs) ((gqg) this.a).g(intValue17);
                    if (yzsVar != null) {
                        bwjVar9.y(647042690);
                        Object obj6 = this.a;
                        yzt a = yzsVar.a();
                        if (intValue17 > 0) {
                            yzs yzsVar2 = (yzs) ((gqg) obj6).h(intValue17 - 1);
                            if (yzsVar2 != null) {
                                yzxVar = new yzv(yzsVar2.a().c);
                            } else {
                                yzxVar = yzw.a;
                            }
                        } else {
                            yzxVar = yzw.b;
                        }
                        aabr.aY(a, yzxVar, bwjVar9, 64);
                        bwjVar9.q();
                    } else {
                        bwjVar9.y(647129707);
                        aabr.aX(bwjVar9, 0);
                        bwjVar9.q();
                    }
                }
                return arnb.a;
            case 11:
                anq anqVar5 = (anq) obj;
                int intValue19 = ((Number) obj2).intValue();
                bwj bwjVar10 = (bwj) obj3;
                int intValue20 = ((Number) obj4).intValue();
                if ((intValue20 & 6) == 0) {
                    if (true != bwjVar10.G(anqVar5)) {
                        i10 = 2;
                    }
                    i5 = intValue20 | i10;
                } else {
                    i5 = intValue20;
                }
                if ((intValue20 & 48) == 0) {
                    if (true == bwjVar10.E(intValue19)) {
                        i11 = 32;
                    }
                    i5 |= i11;
                }
                if ((i5 & 147) == 146 && bwjVar10.L()) {
                    bwjVar10.v();
                } else {
                    zan zanVar = (zan) this.a.get(intValue19);
                    bwjVar10.y(-421274787);
                    int i12 = cfq.a;
                    cfq.c cVar = cfq.a.k;
                    cga p = amv.p(cga.e);
                    bwjVar10.y(-706320048);
                    Object h = bwjVar10.h();
                    if (h == bwj.a.a) {
                        h = new ajs();
                        bwjVar10.B(h);
                    }
                    bwjVar10.q();
                    cga b = adw.b(p, (ajr) h, bgx.a(true, brg.a, 6), false, null, null, zanVar.c, 28);
                    cue a2 = amq.a(ajw.a, cVar, bwjVar10, 48);
                    int a3 = bwg.a(bwjVar10);
                    bwy d = bwjVar10.d();
                    cga b2 = cfv.b(bwjVar10, b);
                    int i13 = cwl.a;
                    arqg arqgVar = cwl.a.a;
                    bwjVar10.N();
                    bwjVar10.A();
                    if (bwjVar10.K()) {
                        bwjVar10.l(arqgVar);
                    } else {
                        bwjVar10.C();
                    }
                    caw.b(bwjVar10, a2, cwl.a.e);
                    caw.b(bwjVar10, d, cwl.a.d);
                    arqv arqvVar = cwl.a.f;
                    if (bwjVar10.K() || !d.F(bwjVar10.h(), Integer.valueOf(a3))) {
                        Integer valueOf = Integer.valueOf(a3);
                        bwjVar10.B(valueOf);
                        bwjVar10.j(valueOf, arqvVar);
                    }
                    caw.b(bwjVar10, b2, cwl.a.c);
                    ahji.ae(zanVar.b, null, amv.j(cga.e, 40.0f, 40.0f), true, null, null, bwjVar10, 3504, 48);
                    ahji.e(zanVar.a, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, bwjVar10, 0, 0, 131070);
                    bwjVar10.p();
                    bwjVar10.q();
                }
                return arnb.a;
            case 12:
                anq anqVar6 = (anq) obj;
                int intValue21 = ((Number) obj2).intValue();
                bwj bwjVar11 = (bwj) obj3;
                int intValue22 = ((Number) obj4).intValue();
                if ((intValue22 & 6) == 0) {
                    if (true != bwjVar11.G(anqVar6)) {
                        i10 = 2;
                    }
                    i6 = intValue22 | i10;
                } else {
                    i6 = intValue22;
                }
                if ((intValue22 & 48) == 0) {
                    if (true == bwjVar11.E(intValue21)) {
                        i11 = 32;
                    }
                    i6 |= i11;
                }
                if ((i6 & 147) == 146 && bwjVar11.L()) {
                    bwjVar11.v();
                } else {
                    zdv zdvVar = (zdv) this.a.get(intValue21);
                    bwjVar11.y(521157204);
                    aetn.P(zdvVar.a().a, null, bwjVar11, 0, 2);
                    bwjVar11.q();
                }
                return arnb.a;
            case 13:
                aeln aelnVar = (aeln) obj2;
                bwj bwjVar12 = (bwj) obj3;
                ((Number) obj4).intValue();
                ((wb) obj).getClass();
                aelnVar.getClass();
                int ordinal = aelnVar.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        bwjVar12.y(1695827672);
                        aeke.ao((aelk) this.a, bwjVar12, 0);
                        bwjVar12.q();
                    } else {
                        bwjVar12.y(1695823681);
                        bwjVar12.q();
                        throw new armm();
                    }
                } else {
                    bwjVar12.y(1695825251);
                    aeke.aA((aelk) this.a, bwjVar12, 0);
                    bwjVar12.q();
                }
                return arnb.a;
            case 14:
                anq anqVar7 = (anq) obj;
                int intValue23 = ((Number) obj2).intValue();
                bwj bwjVar13 = (bwj) obj3;
                int intValue24 = ((Number) obj4).intValue();
                if ((intValue24 & 6) == 0) {
                    if (true != bwjVar13.G(anqVar7)) {
                        i10 = 2;
                    }
                    i7 = intValue24 | i10;
                } else {
                    i7 = intValue24;
                }
                if ((intValue24 & 48) == 0) {
                    if (true == bwjVar13.E(intValue23)) {
                        i11 = 32;
                    }
                    i7 |= i11;
                }
                if ((i7 & 147) == 146 && bwjVar13.L()) {
                    bwjVar13.v();
                } else {
                    aesg aesgVar = (aesg) this.a.get(intValue23);
                    bwjVar13.y(-1042551798);
                    aetn.ae(aesgVar, null, bwjVar13, 0, 2);
                    bwjVar13.q();
                }
                return arnb.a;
            case 15:
                anq anqVar8 = (anq) obj;
                int intValue25 = ((Number) obj2).intValue();
                bwj bwjVar14 = (bwj) obj3;
                int intValue26 = ((Number) obj4).intValue();
                if ((intValue26 & 6) == 0) {
                    if (true != bwjVar14.G(anqVar8)) {
                        i10 = 2;
                    }
                    i8 = intValue26 | i10;
                } else {
                    i8 = intValue26;
                }
                if ((intValue26 & 48) == 0) {
                    if (true == bwjVar14.E(intValue25)) {
                        i11 = 32;
                    }
                    i8 |= i11;
                }
                if ((i8 & 147) == 146 && bwjVar14.L()) {
                    bwjVar14.v();
                } else {
                    aeqk aeqkVar = (aeqk) this.a.get(intValue25);
                    bwjVar14.y(-17077154);
                    aeke.bk(aeqkVar.a(), null, bwjVar14, 0);
                    bwjVar14.q();
                }
                return arnb.a;
            default:
                anq anqVar9 = (anq) obj;
                int intValue27 = ((Number) obj2).intValue();
                bwj bwjVar15 = (bwj) obj3;
                int intValue28 = ((Number) obj4).intValue();
                if ((intValue28 & 6) == 0) {
                    if (true != bwjVar15.G(anqVar9)) {
                        i10 = 2;
                    }
                    i9 = intValue28 | i10;
                } else {
                    i9 = intValue28;
                }
                if ((intValue28 & 48) == 0) {
                    if (true == bwjVar15.E(intValue27)) {
                        i11 = 32;
                    }
                    i9 |= i11;
                }
                if ((i9 & 147) == 146 && bwjVar15.L()) {
                    bwjVar15.v();
                } else {
                    aeyt aeytVar = (aeyt) this.a.get(intValue27);
                    bwjVar15.y(633757719);
                    if (aeytVar instanceof aeyw) {
                        bwjVar15.y(-1365028135);
                        aeyq.b((aeyw) aeytVar, null, bwjVar15, 0);
                        bwjVar15.q();
                    } else if (aeytVar instanceof aeyp) {
                        bwjVar15.y(-1365026432);
                        adcx.V((aeyp) aeytVar, bwjVar15, 0);
                        bwjVar15.q();
                    } else {
                        bwjVar15.y(-1365029524);
                        bwjVar15.q();
                        throw new armm();
                    }
                    bwjVar15.q();
                }
                return arnb.a;
        }
    }
}
