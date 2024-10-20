package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import defpackage.ajw;
import defpackage.bwj;
import defpackage.cfq;
import defpackage.cga;
import defpackage.cwl;
import defpackage.dhv;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jjs extends arrp implements arqw {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jjs(Object obj, int i) {
        super(3);
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v35, types: [cas, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v47, types: [ixo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [cas, java.lang.Object] */
    @Override // defpackage.arqw
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        cuf et;
        cga c;
        cga c2;
        cga a;
        cga b;
        cga c3;
        cga c4;
        long j;
        hmu hmuVar = null;
        switch (this.b) {
            case 0:
                aki akiVar = (aki) obj;
                bwj bwjVar = (bwj) obj2;
                int intValue = ((Number) obj3).intValue();
                akiVar.getClass();
                if ((intValue & 14) == 0) {
                    intValue |= true != bwjVar.G(akiVar) ? 2 : 4;
                }
                if ((intValue & 91) == 18 && bwjVar.L()) {
                    bwjVar.v();
                } else {
                    Object obj4 = this.a;
                    float c5 = akiVar.c();
                    bwjVar.y(331371816);
                    Object h = bwjVar.h();
                    if (h == bwj.a.a) {
                        h = ipf.t;
                        bwjVar.B(h);
                    }
                    bwjVar.q();
                    aeke.bG(akiVar, ((jkl) obj4).e, c5, (arqg) h, bwjVar, (intValue & 14) | 3136, 0);
                }
                return arnb.a;
            case 1:
                cuh cuhVar = (cuh) obj;
                cuc cucVar = (cuc) obj2;
                long j2 = ((dqs) obj3).a;
                cuhVar.getClass();
                cucVar.getClass();
                int b2 = dqs.h(j2) ? dqs.b(j2) : Integer.MIN_VALUE;
                int a2 = dqs.g(j2) ? dqs.a(j2) : Integer.MIN_VALUE;
                if (hyv.m(b2) && hyv.m(a2)) {
                    hmuVar = new hmu(b2, a2);
                }
                if (hmuVar != null) {
                    ((arxw) ((hmk) this.a).a).T(hmuVar);
                }
                cvc e = cucVar.e(j2);
                et = cuhVar.et(e.a, e.b, arnw.a, new gsh(e, 5));
                return et;
            case 2:
                amt amtVar = (amt) obj;
                bwj bwjVar2 = (bwj) obj2;
                int intValue2 = ((Number) obj3).intValue();
                amtVar.getClass();
                if ((intValue2 & 14) == 0) {
                    intValue2 |= true != bwjVar2.G(amtVar) ? 2 : 4;
                }
                if ((intValue2 & 91) == 18 && bwjVar2.L()) {
                    bwjVar2.v();
                } else {
                    afzv.I(amtVar, hld.u(this.a).c, bwjVar2, (intValue2 & 14) | 64);
                }
                return arnb.a;
            case 3:
                bwj bwjVar3 = (bwj) obj2;
                int intValue3 = ((Number) obj3).intValue();
                ((anq) obj).getClass();
                if ((intValue3 & 81) == 16 && bwjVar3.L()) {
                    bwjVar3.v();
                } else {
                    amx.a(amv.d(cga.e, hwr.N(((jym) this.a).s, bwjVar3)), bwjVar3);
                }
                return arnb.a;
            case 4:
                bwj bwjVar4 = (bwj) obj2;
                int intValue4 = ((Number) obj3).intValue();
                ((anq) obj).getClass();
                if ((intValue4 & 81) == 16 && bwjVar4.L()) {
                    bwjVar4.v();
                } else {
                    hwr.D(((jym) this.a).d, bwjVar4, 0);
                }
                return arnb.a;
            case 5:
                bwj bwjVar5 = (bwj) obj2;
                int intValue5 = ((Number) obj3).intValue();
                ((anq) obj).getClass();
                if ((intValue5 & 81) == 16 && bwjVar5.L()) {
                    bwjVar5.v();
                } else {
                    Object a3 = this.a.a();
                    a3.getClass();
                    c = amv.c(cga.e, 1.0f);
                    adcx.aO((aewx) a3, dea.a(c, BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.HEADER), bwjVar5, 48);
                }
                return arnb.a;
            case 6:
                bwj bwjVar6 = (bwj) obj2;
                int intValue6 = ((Number) obj3).intValue();
                ((anq) obj).getClass();
                if ((intValue6 & 81) != 16 || !bwjVar6.L()) {
                    c2 = amv.c(cga.e, 1.0f);
                    Object obj5 = this.a;
                    int i = cfq.a;
                    cue a4 = akc.a(cfq.a.a, false);
                    int a5 = bwg.a(bwjVar6);
                    bwy d = bwjVar6.d();
                    cga b3 = cfv.b(bwjVar6, c2);
                    int i2 = cwl.a;
                    arqg arqgVar = cwl.a.a;
                    bwjVar6.N();
                    bwjVar6.A();
                    if (bwjVar6.K()) {
                        bwjVar6.l(arqgVar);
                    } else {
                        bwjVar6.C();
                    }
                    caw.b(bwjVar6, a4, cwl.a.e);
                    caw.b(bwjVar6, d, cwl.a.d);
                    arqv arqvVar = cwl.a.f;
                    if (bwjVar6.K() || !d.F(bwjVar6.h(), Integer.valueOf(a5))) {
                        Integer valueOf = Integer.valueOf(a5);
                        bwjVar6.B(valueOf);
                        bwjVar6.j(valueOf, arqvVar);
                    }
                    caw.b(bwjVar6, b3, cwl.a.c);
                    agkx.t(((kgk) obj5).b, akf.a.a(cga.e, cfq.a.f), bwjVar6, 0);
                    bwjVar6.p();
                } else {
                    bwjVar6.v();
                }
                return arnb.a;
            case 7:
                awg awgVar = (awg) obj;
                bwj bwjVar7 = (bwj) obj2;
                int intValue7 = ((Number) obj3).intValue();
                awgVar.getClass();
                if ((intValue7 & 14) == 0) {
                    intValue7 |= true != bwjVar7.G(awgVar) ? 2 : 4;
                }
                if ((intValue7 & 91) == 18 && bwjVar7.L()) {
                    bwjVar7.v();
                } else {
                    jzx jzxVar = (jzx) this.a;
                    lga.bG(jzxVar.b, awgVar, jzxVar.a.w, jzxVar.f, bwjVar7, (intValue7 << 3) & 112, 0);
                }
                return arnb.a;
            case 8:
                awg awgVar2 = (awg) obj;
                bwj bwjVar8 = (bwj) obj2;
                int intValue8 = ((Number) obj3).intValue();
                awgVar2.getClass();
                if ((intValue8 & 14) == 0) {
                    intValue8 |= true != bwjVar8.G(awgVar2) ? 2 : 4;
                }
                if ((intValue8 & 91) == 18 && bwjVar8.L()) {
                    bwjVar8.v();
                } else {
                    lga.bG(((jzx) this.a).b, awgVar2, null, null, bwjVar8, (intValue8 << 3) & 112, 12);
                }
                return arnb.a;
            case 9:
                bwj bwjVar9 = (bwj) obj2;
                ((Number) obj3).intValue();
                ((wh) obj).getClass();
                qkg b4 = ((kgl) this.a).a.b();
                jzl.a((jzj) cao.b(b4, b4.b(), null, bwjVar9, 2).a(), null, bwjVar9, 0, 2);
                return arnb.a;
            case 10:
                bwj bwjVar10 = (bwj) obj2;
                int intValue9 = ((Number) obj3).intValue();
                ((akn) obj).getClass();
                if ((intValue9 & 81) == 16 && bwjVar10.L()) {
                    bwjVar10.v();
                } else {
                    Object obj6 = this.a;
                    cga.a aVar = cga.e;
                    ajw.e eVar = ajw.c;
                    int i3 = cfq.a;
                    cue a6 = akk.a(eVar, cfq.a.m, bwjVar10, 0);
                    int a7 = bwg.a(bwjVar10);
                    bwy d2 = bwjVar10.d();
                    cga b5 = cfv.b(bwjVar10, aVar);
                    int i4 = cwl.a;
                    arqg arqgVar2 = cwl.a.a;
                    bwjVar10.N();
                    bwjVar10.A();
                    if (bwjVar10.K()) {
                        bwjVar10.l(arqgVar2);
                    } else {
                        bwjVar10.C();
                    }
                    caw.b(bwjVar10, a6, cwl.a.e);
                    caw.b(bwjVar10, d2, cwl.a.d);
                    arqv arqvVar2 = cwl.a.f;
                    if (bwjVar10.K() || !d.F(bwjVar10.h(), Integer.valueOf(a7))) {
                        Integer valueOf2 = Integer.valueOf(a7);
                        bwjVar10.B(valueOf2);
                        bwjVar10.j(valueOf2, arqvVar2);
                    }
                    caw.b(bwjVar10, b5, cwl.a.c);
                    if (obj6 instanceof kis) {
                        bwjVar10.y(898704420);
                        lga.aY((kis) obj6, bwjVar10, 0);
                        bwjVar10.q();
                    } else if (obj6 instanceof kin) {
                        bwjVar10.y(898706468);
                        lga.bb((kin) obj6, bwjVar10, 0);
                        bwjVar10.q();
                    } else if (obj6 instanceof kik) {
                        bwjVar10.y(898708450);
                        lga.bd((kik) obj6, bwjVar10, 0);
                        bwjVar10.q();
                    } else if (obj6 instanceof kif) {
                        bwjVar10.y(898710403);
                        lga.bh((kif) obj6, bwjVar10, 0);
                        bwjVar10.q();
                    } else if (obj6 instanceof kih) {
                        bwjVar10.y(898712640);
                        lga.bg((kih) obj6, bwjVar10, 0);
                        bwjVar10.q();
                    } else {
                        bwjVar10.y(898713903);
                        ahji.e("Unhandled bottom sheet", null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, bwjVar10, 6, 0, 131070);
                        bwjVar10.q();
                    }
                    bwjVar10.p();
                }
                return arnb.a;
            case 11:
                bwj bwjVar11 = (bwj) obj2;
                int intValue10 = ((Number) obj3).intValue();
                ((anq) obj).getClass();
                if ((intValue10 & 81) == 16 && bwjVar11.L()) {
                    bwjVar11.v();
                } else {
                    ahji.e(dga.a(true != ((kif) this.a).a.isEmpty() ? R.string.bottom_sheet_active_typers : R.string.bottom_sheet_no_active_typers, bwjVar11), amh.j(cga.e, 16.0f, brg.a, 16.0f, 18.0f, 2), 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, bmp.d(bwjVar11).m, bwjVar11, 0, 0, 65532);
                }
                return arnb.a;
            case 12:
                bwj bwjVar12 = (bwj) obj2;
                int intValue11 = ((Number) obj3).intValue();
                ((anq) obj).getClass();
                if ((intValue11 & 81) == 16 && bwjVar12.L()) {
                    bwjVar12.v();
                } else {
                    ahji.e((String) this.a, amh.j(cga.e, 32.0f, brg.a, brg.a, 2.0f, 6), bmp.a(bwjVar12).q, 0L, 0L, null, 0L, 0, false, 0, 0, null, bmp.d(bwjVar12).g, bwjVar12, 0, 0, 65528);
                }
                return arnb.a;
            case 13:
                bwj bwjVar13 = (bwj) obj2;
                int intValue12 = ((Number) obj3).intValue();
                ((anq) obj).getClass();
                if ((intValue12 & 81) == 16 && bwjVar13.L()) {
                    bwjVar13.v();
                } else {
                    ahji.e((String) this.a, amh.j(cga.e, 32.0f, brg.a, brg.a, 16.0f, 6), bmp.a(bwjVar13).q, 0L, 0L, null, 0L, 0, false, 0, 0, null, bmp.d(bwjVar13).k, bwjVar13, 0, 0, 65528);
                }
                return arnb.a;
            case 14:
                ((Number) obj3).intValue();
                ((wh) obj).getClass();
                lga.aS((aezh) this.a, (bwj) obj2, 0);
                return arnb.a;
            case 15:
                dk dkVar = (dk) obj;
                ConversationId conversationId = (ConversationId) obj2;
                dkVar.getClass();
                conversationId.getClass();
                return this.a.a(dkVar, conversationId, SuperSortLabel.UNKNOWN, (MessageCoreData) obj3);
            case 16:
                amj amjVar = (amj) obj;
                bwj bwjVar14 = (bwj) obj2;
                int intValue13 = ((Number) obj3).intValue();
                amjVar.getClass();
                if ((intValue13 & 14) == 0) {
                    intValue13 |= true != bwjVar14.G(amjVar) ? 2 : 4;
                }
                if ((intValue13 & 91) != 18 || !bwjVar14.L()) {
                    a = adf.a(cga.e, bmp.a(bwjVar14).F, clw.a);
                    b = amv.b(a, 1.0f);
                    cga c6 = amh.c(b, amjVar);
                    Object obj7 = this.a;
                    int i5 = cfq.a;
                    cue a8 = akc.a(cfq.a.a, false);
                    int a9 = bwg.a(bwjVar14);
                    bwy d3 = bwjVar14.d();
                    cga b6 = cfv.b(bwjVar14, c6);
                    int i6 = cwl.a;
                    arqg arqgVar3 = cwl.a.a;
                    bwjVar14.N();
                    bwjVar14.A();
                    if (bwjVar14.K()) {
                        bwjVar14.l(arqgVar3);
                    } else {
                        bwjVar14.C();
                    }
                    caw.b(bwjVar14, a8, cwl.a.e);
                    caw.b(bwjVar14, d3, cwl.a.d);
                    arqv arqvVar3 = cwl.a.f;
                    if (bwjVar14.K() || !d.F(bwjVar14.h(), Integer.valueOf(a9))) {
                        Integer valueOf3 = Integer.valueOf(a9);
                        bwjVar14.B(valueOf3);
                        bwjVar14.j(valueOf3, arqvVar3);
                    }
                    caw.b(bwjVar14, b6, cwl.a.c);
                    ajw.d dVar = new ajw.d(8.0f, true, ajx.a);
                    cfq.b bVar = cfq.a.n;
                    cga j3 = amh.j(afs.c(cga.e, afs.b(bwjVar14, 0), false, 14), 16.0f, brg.a, 16.0f, brg.a, 10);
                    cue a10 = akk.a(dVar, bVar, bwjVar14, 54);
                    int a11 = bwg.a(bwjVar14);
                    bwy d4 = bwjVar14.d();
                    cga b7 = cfv.b(bwjVar14, j3);
                    arqg arqgVar4 = cwl.a.a;
                    bwjVar14.N();
                    bwjVar14.A();
                    if (bwjVar14.K()) {
                        bwjVar14.l(arqgVar4);
                    } else {
                        bwjVar14.C();
                    }
                    caw.b(bwjVar14, a10, cwl.a.e);
                    caw.b(bwjVar14, d4, cwl.a.d);
                    arqv arqvVar4 = cwl.a.f;
                    if (bwjVar14.K() || !d.F(bwjVar14.h(), Integer.valueOf(a11))) {
                        Integer valueOf4 = Integer.valueOf(a11);
                        bwjVar14.B(valueOf4);
                        bwjVar14.j(valueOf4, arqvVar4);
                    }
                    caw.b(bwjVar14, b7, cwl.a.c);
                    jzx jzxVar2 = ((lfp) obj7).b;
                    bwjVar14.y(1490427977);
                    if (jzxVar2 != null) {
                        jzl.a(jzxVar2, null, bwjVar14, 0, 2);
                    }
                    bwjVar14.q();
                    bwjVar14.p();
                    bwjVar14.p();
                } else {
                    bwjVar14.v();
                }
                return arnb.a;
            case 17:
                bwj bwjVar15 = (bwj) obj2;
                int intValue14 = ((Number) obj3).intValue();
                ((anq) obj).getClass();
                if ((intValue14 & 81) != 16 || !bwjVar15.L()) {
                    c3 = amv.c(cga.e, 1.0f);
                    cga d5 = amv.d(c3, 40.0f);
                    Object obj8 = this.a;
                    int i7 = cfq.a;
                    cue a12 = akc.a(cfq.a.a, false);
                    int a13 = bwg.a(bwjVar15);
                    bwy d6 = bwjVar15.d();
                    cga b8 = cfv.b(bwjVar15, d5);
                    int i8 = cwl.a;
                    arqg arqgVar5 = cwl.a.a;
                    bwjVar15.N();
                    bwjVar15.A();
                    if (bwjVar15.K()) {
                        bwjVar15.l(arqgVar5);
                    } else {
                        bwjVar15.C();
                    }
                    caw.b(bwjVar15, a12, cwl.a.e);
                    caw.b(bwjVar15, d6, cwl.a.d);
                    arqv arqvVar5 = cwl.a.f;
                    if (bwjVar15.K() || !d.F(bwjVar15.h(), Integer.valueOf(a13))) {
                        Integer valueOf5 = Integer.valueOf(a13);
                        bwjVar15.B(valueOf5);
                        bwjVar15.j(valueOf5, arqvVar5);
                    }
                    caw.b(bwjVar15, b8, cwl.a.c);
                    String str = ((lhw) obj8).a;
                    akf akfVar = akf.a;
                    bwjVar15.y(-1714504606);
                    dhv.b bVar2 = new dhv.b((byte[]) null);
                    bVar2.a(new dip(bmp.a(bwjVar15).a, 0L, null, null, null, null, null, 0L, null, null, 0L, null, null, 65534));
                    dhv.b.a aVar2 = new dhv.b.a(new dis(str), bVar2.a.length(), 0, "load_text_tag", 4);
                    bVar2.b.add(aVar2);
                    bVar2.c.add(aVar2);
                    bVar2.b.size();
                    bVar2.f(str);
                    bVar2.g();
                    bVar2.b();
                    dhv b9 = bVar2.b();
                    bwjVar15.q();
                    dje djeVar = bmp.d(bwjVar15).m;
                    cga a14 = akfVar.a(cga.e, cfq.a.e);
                    bwjVar15.y(-997350674);
                    Object h2 = bwjVar15.h();
                    if (h2 == bwj.a.a) {
                        h2 = new ajs();
                        bwjVar15.B(h2);
                    }
                    ajr ajrVar = (ajr) h2;
                    bwjVar15.q();
                    bwjVar15.y(-997347170);
                    boolean G = bwjVar15.G(obj8);
                    Object h3 = bwjVar15.h();
                    if (G || h3 == bwj.a.a) {
                        h3 = new lhb(obj8, 3);
                        bwjVar15.B(h3);
                    }
                    bwjVar15.q();
                    brx.c(b9, adw.b(a14, ajrVar, null, false, null, null, (arqg) h3, 28), 0L, 0L, 0L, 0L, 0, false, 0, 0, null, null, djeVar, bwjVar15, 0, 0, 131068);
                    bwjVar15.p();
                } else {
                    bwjVar15.v();
                }
                return arnb.a;
            case 18:
                bwj bwjVar16 = (bwj) obj2;
                ((Number) obj3).intValue();
                ((wh) obj).getClass();
                c4 = amv.c(cga.e, 1.0f);
                cga c7 = afs.c(wj.b(c4), afs.b(bwjVar16, 0), false, 14);
                if (((Boolean) bwjVar16.g(bli.b)).booleanValue()) {
                    bwjVar16.y(2113543385);
                    j = bmp.a(bwjVar16).p;
                    bwjVar16.q();
                } else {
                    bwjVar16.y(2113604176);
                    j = bmp.a(bwjVar16).F;
                    bwjVar16.q();
                }
                bqv.c(c7, null, j, 0L, true != ((Boolean) bwjVar16.g(bli.b)).booleanValue() ? brg.a : 3.0f, brg.a, null, cdk.e(1201093001, new lfw(this.a, 6), bwjVar16), bwjVar16, 106);
                return arnb.a;
            case 19:
                bwj bwjVar17 = (bwj) obj2;
                int intValue15 = ((Number) obj3).intValue();
                ((akn) obj).getClass();
                if ((intValue15 & 81) == 16 && bwjVar17.L()) {
                    bwjVar17.v();
                } else {
                    int i9 = cfq.a;
                    Object obj9 = this.a;
                    cfq.c cVar = cfq.a.k;
                    cga.a aVar3 = cga.e;
                    cue a15 = amq.a(ajw.a, cVar, bwjVar17, 48);
                    int a16 = bwg.a(bwjVar17);
                    bwy d7 = bwjVar17.d();
                    cga b10 = cfv.b(bwjVar17, aVar3);
                    int i10 = cwl.a;
                    arqg arqgVar6 = cwl.a.a;
                    bwjVar17.N();
                    bwjVar17.A();
                    if (bwjVar17.K()) {
                        bwjVar17.l(arqgVar6);
                    } else {
                        bwjVar17.C();
                    }
                    caw.b(bwjVar17, a15, cwl.a.e);
                    caw.b(bwjVar17, d7, cwl.a.d);
                    arqv arqvVar6 = cwl.a.f;
                    if (bwjVar17.K() || !d.F(bwjVar17.h(), Integer.valueOf(a16))) {
                        Integer valueOf6 = Integer.valueOf(a16);
                        bwjVar17.B(valueOf6);
                        bwjVar17.j(valueOf6, arqvVar6);
                    }
                    caw.b(bwjVar17, b10, cwl.a.c);
                    lrr lrrVar = (lrr) obj9;
                    lgb.m(ckw.c(lrrVar.d), lrrVar.c, bwjVar17, 0);
                    lgb.n(lrrVar, bwjVar17, 0);
                    bwjVar17.p();
                }
                return arnb.a;
            default:
                bwj bwjVar18 = (bwj) obj2;
                int intValue16 = ((Number) obj3).intValue();
                ((anq) obj).getClass();
                if ((intValue16 & 81) == 16 && bwjVar18.L()) {
                    bwjVar18.v();
                } else {
                    yzc.c(((yzr) this.a).b, bwjVar18, 0);
                }
                return arnb.a;
        }
    }
}
