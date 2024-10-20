package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.LocaleList;
import android.text.BidiFormatter;
import com.google.android.apps.messaging.R;
import defpackage.ajw;
import defpackage.bwj;
import defpackage.cfq;
import defpackage.cga;
import defpackage.cwl;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ifo extends arrp implements arqw {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ifo(Object obj, Object obj2, int i) {
        super(3);
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v14, types: [java.lang.Object, arqg] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, cga] */
    /* JADX WARN: Type inference failed for: r1v130, types: [java.lang.Object, aevy] */
    /* JADX WARN: Type inference failed for: r1v16, types: [akn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v40, types: [ajr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v56, types: [aeva, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v107, types: [ajr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v122, types: [ajr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v23, types: [cas, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v49, types: [amt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, idz] */
    /* JADX WARN: Type inference failed for: r3v92, types: [ajr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v28, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v23, types: [java.lang.Object, arqg] */
    /* JADX WARN: Type inference failed for: r9v24, types: [ajr, java.lang.Object] */
    @Override // defpackage.arqw
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        cga b;
        LocaleList locales;
        Locale locale;
        cga b2;
        cga b3;
        char c;
        cga c2;
        cga c3;
        String a;
        cga b4;
        cga b5;
        cga b6;
        cga b7;
        String str = null;
        int i = 48;
        switch (this.c) {
            case 0:
                bwj bwjVar = (bwj) obj2;
                int intValue = ((Number) obj3).intValue();
                ((amj) obj).getClass();
                if ((intValue & 81) == 16 && bwjVar.L()) {
                    bwjVar.v();
                } else {
                    Object obj4 = this.a;
                    Object obj5 = this.b;
                    cga.a aVar = cga.e;
                    ajw.e eVar = ajw.c;
                    int i2 = cfq.a;
                    cue a2 = akk.a(eVar, cfq.a.m, bwjVar, 0);
                    int a3 = bwg.a(bwjVar);
                    bwy d = bwjVar.d();
                    cga b8 = cfv.b(bwjVar, aVar);
                    int i3 = cwl.a;
                    arqg arqgVar = cwl.a.a;
                    bwjVar.N();
                    bwjVar.A();
                    if (bwjVar.K()) {
                        bwjVar.l(arqgVar);
                    } else {
                        bwjVar.C();
                    }
                    caw.b(bwjVar, a2, cwl.a.e);
                    caw.b(bwjVar, d, cwl.a.d);
                    arqv arqvVar = cwl.a.f;
                    if (bwjVar.K() || !d.F(bwjVar.h(), Integer.valueOf(a3))) {
                        Integer valueOf = Integer.valueOf(a3);
                        bwjVar.B(valueOf);
                        bwjVar.j(valueOf, arqvVar);
                    }
                    caw.b(bwjVar, b8, cwl.a.c);
                    b = ako.a.b(cga.e, 1.0f, true);
                    bic.b(b, null, bmp.a(bwjVar).p, 0L, brg.a, cdk.e(-1335315746, new ifn(obj4, obj5, 0), bwjVar), bwjVar, 1572864, 58);
                    bwjVar.p();
                }
                return arnb.a;
            case 1:
                ((Number) obj3).intValue();
                ((wh) obj).getClass();
                hlc.B(this.a, this.b, (bwj) obj2, 0);
                return arnb.a;
            case 2:
                bwj bwjVar2 = (bwj) obj2;
                ((Number) obj3).intValue();
                ((wh) obj).getClass();
                if (this.a != null) {
                    ?? r1 = this.b;
                    cga a4 = dea.a(cga.e, "rbm_toolstone");
                    int i4 = cfq.a;
                    adom.bR((afal) this.a, r1.a(a4, cfq.a.n), bwjVar2, 0);
                }
                return arnb.a;
            case 3:
                String str2 = (String) obj;
                int intValue2 = ((Number) obj2).intValue();
                dje djeVar = (dje) obj3;
                str2.getClass();
                djeVar.getClass();
                boolean r = qta.r();
                Object obj6 = this.a;
                obj6.getClass();
                Object obj7 = this.b;
                obj7.getClass();
                if (str2.length() == 0) {
                    return str2;
                }
                dja djaVar = (dja) obj6;
                if (lga.bw(str2, djaVar, djeVar, intValue2)) {
                    return str2;
                }
                List<String> ab = arsd.ab(str2, new String[]{", "}, 0, 6);
                StringBuilder sb = new StringBuilder();
                ArrayList arrayList = new ArrayList();
                Resources resources = ((Context) obj7).getResources();
                locales = resources.getConfiguration().getLocales();
                locale = locales.get(0);
                BidiFormatter bidiFormatter = BidiFormatter.getInstance(locale);
                int i5 = 0;
                for (String str3 : ab) {
                    int i6 = i5 + 1;
                    if (!r) {
                        sb.append(bidiFormatter.unicodeWrap(str3));
                    } else {
                        sb.append(str3);
                    }
                    if (i5 != aqjn.z(ab)) {
                        sb.append(", ");
                    }
                    arrayList.add(Integer.valueOf(sb.length()));
                    i5 = i6;
                }
                for (int z = aqjn.z(ab); z >= 0; z--) {
                    sb.delete(((Number) arrayList.get(z)).intValue(), sb.length());
                    int size = (ab.size() - z) - 1;
                    if (size > 0) {
                        String quantityString = resources.getQuantityString(R.plurals.plus_n_plural, size, Integer.valueOf(size));
                        quantityString.getClass();
                        sb.append(bidiFormatter.unicodeWrap(quantityString));
                    }
                    String sb2 = sb.toString();
                    if (lga.bw(sb2, djaVar, djeVar, intValue2)) {
                        return sb2;
                    }
                }
                return "";
            case 4:
                bwj bwjVar3 = (bwj) obj2;
                int intValue3 = ((Number) obj3).intValue();
                ((amj) obj).getClass();
                if ((intValue3 & 81) != 16 || !bwjVar3.L()) {
                    b2 = amv.b(cga.e, 1.0f);
                    Object obj8 = this.a;
                    int i7 = cfq.a;
                    cue a5 = akc.a(cfq.a.a, false);
                    int a6 = bwg.a(bwjVar3);
                    bwy d2 = bwjVar3.d();
                    cga b9 = cfv.b(bwjVar3, b2);
                    int i8 = cwl.a;
                    arqg arqgVar2 = cwl.a.a;
                    bwjVar3.N();
                    bwjVar3.A();
                    if (bwjVar3.K()) {
                        bwjVar3.l(arqgVar2);
                    } else {
                        bwjVar3.C();
                    }
                    caw.b(bwjVar3, a5, cwl.a.e);
                    caw.b(bwjVar3, d2, cwl.a.d);
                    arqv arqvVar2 = cwl.a.f;
                    if (bwjVar3.K() || !d.F(bwjVar3.h(), Integer.valueOf(a6))) {
                        Integer valueOf2 = Integer.valueOf(a6);
                        bwjVar3.B(valueOf2);
                        bwjVar3.j(valueOf2, arqvVar2);
                    }
                    caw.b(bwjVar3, b9, cwl.a.c);
                    lij lijVar = (lij) obj8;
                    lgb.e(lijVar.c, akf.a.a(cgh.a(cga.e, 3.0f), cfq.a.i), bwjVar3, 8);
                    lgb.b(lijVar.e, cgh.a(cga.e, 2.0f), bwjVar3, 56);
                    lgb.c(lijVar, bwjVar3, 0);
                    bwjVar3.p();
                    yzc.z((kkc) this.b, cku.g, false, null, bwjVar3, 48, 12);
                } else {
                    bwjVar3.v();
                }
                return arnb.a;
            case 5:
                bwj bwjVar4 = (bwj) obj2;
                ((Number) obj3).intValue();
                ((wh) obj).getClass();
                b3 = amv.b(cga.e, 1.0f);
                bqv.c(b3, null, 0L, 0L, brg.a, brg.a, null, cdk.e(-1809274898, new zbh((afv) this.b, this.a), bwjVar4), bwjVar4, 126);
                return arnb.a;
            case 6:
                bwj bwjVar5 = (bwj) obj2;
                int intValue4 = ((Number) obj3).intValue();
                ((amt) obj).getClass();
                if ((intValue4 & 81) == 16 && bwjVar5.L()) {
                    bwjVar5.v();
                } else {
                    awp.c((dhv) this.b, null, (dje) this.a, null, 0, false, 0, 0, null, bwjVar5, 0, 1018);
                }
                return arnb.a;
            case 7:
                cga cgaVar = (cga) obj;
                bwj bwjVar6 = (bwj) obj2;
                ((Number) obj3).intValue();
                cgaVar.getClass();
                bwjVar6.y(1451363959);
                bwjVar6.y(1251114739);
                Object h = bwjVar6.h();
                if (h == bwj.a.a) {
                    h = new crt();
                    bwjVar6.B(h);
                }
                crt crtVar = (crt) h;
                bwjVar6.q();
                cga a7 = crn.a(cgaVar, crtVar, new aaoa(this.b, this.a, (Object) crtVar, 5, (short[]) null));
                bwjVar6.q();
                return a7;
            case 8:
                bwj bwjVar7 = (bwj) obj2;
                int intValue5 = ((Number) obj3).intValue();
                ((akn) obj).getClass();
                if ((intValue5 & 81) == 16 && bwjVar7.L()) {
                    bwjVar7.v();
                } else {
                    Object obj9 = this.b;
                    ?? r7 = this.a;
                    aeom aeomVar = (aeom) obj9;
                    int i9 = 0;
                    for (Object obj10 : aeomVar.a) {
                        int i10 = i9 + 1;
                        if (i9 < 0) {
                            aqjn.G();
                        }
                        aeoj aeojVar = (aeoj) obj10;
                        cga.a aVar2 = cga.e;
                        bwjVar7.y(1717243134);
                        boolean G = bwjVar7.G(obj9) | bwjVar7.G(aeojVar) | bwjVar7.G(r7);
                        Object h2 = bwjVar7.h();
                        if (G || h2 == bwj.a.a) {
                            h2 = new zzg(aeomVar, aeojVar, (arqg) r7, 6);
                            bwjVar7.B(h2);
                        }
                        bwjVar7.q();
                        cga c4 = adw.c(aVar2, false, str, (arqg) h2, 7);
                        bwjVar7.y(1717247884);
                        boolean G2 = bwjVar7.G(obj9) | bwjVar7.E(i9);
                        Object h3 = bwjVar7.h();
                        if (G2 || h3 == bwj.a.a) {
                            h3 = new mgc(obj9, i9, 7);
                            bwjVar7.B(h3);
                        }
                        bwjVar7.q();
                        cga c5 = dhb.c(c4, true, (arqr) h3);
                        int i11 = cfq.a;
                        cue a8 = amq.a(ajw.a, cfq.a.k, bwjVar7, i);
                        int a9 = bwg.a(bwjVar7);
                        bwy d3 = bwjVar7.d();
                        cga b10 = cfv.b(bwjVar7, c5);
                        int i12 = cwl.a;
                        arqg arqgVar3 = cwl.a.a;
                        bwjVar7.N();
                        bwjVar7.A();
                        if (bwjVar7.K()) {
                            bwjVar7.l(arqgVar3);
                        } else {
                            bwjVar7.C();
                        }
                        caw.b(bwjVar7, a8, cwl.a.e);
                        caw.b(bwjVar7, d3, cwl.a.d);
                        arqv arqvVar3 = cwl.a.f;
                        if (bwjVar7.K() || !d.F(bwjVar7.h(), Integer.valueOf(a9))) {
                            Integer valueOf3 = Integer.valueOf(a9);
                            bwjVar7.B(valueOf3);
                            bwjVar7.j(valueOf3, arqvVar3);
                        }
                        caw.b(bwjVar7, b10, cwl.a.c);
                        adom.at(aeojVar.c, aeojVar.b, aeojVar.a, aeojVar.d, bwjVar7, 0);
                        bwjVar7.p();
                        bwjVar7.y(-970796632);
                        if (i9 != aqjn.z(aeomVar.a)) {
                            c = 0;
                            ahji.U(amh.i(cga.e, brg.a, 8.0f, 1), brg.a, 0L, bwjVar7, 6, 6);
                        } else {
                            c = 0;
                        }
                        bwjVar7.q();
                        i9 = i10;
                        str = null;
                        i = 48;
                    }
                }
                return arnb.a;
            case 9:
                ((Number) obj3).intValue();
                ((wh) obj).getClass();
                adom.ag(this.b, (aekm) this.a, (bwj) obj2, 0);
                return arnb.a;
            case 10:
                String str4 = (String) obj;
                bwj bwjVar8 = (bwj) obj2;
                int intValue6 = ((Number) obj3).intValue();
                str4.getClass();
                if ((intValue6 & 14) == 0) {
                    intValue6 |= true != bwjVar8.G(str4) ? 2 : 4;
                }
                if ((intValue6 & 91) == 18 && bwjVar8.L()) {
                    bwjVar8.v();
                } else {
                    bwjVar8.y(1879557282);
                    c2 = amv.c(cga.e, 1.0f);
                    cga a10 = dea.a(c2, "Compose:Draft:Hint");
                    bwjVar8.y(1879550561);
                    Object h4 = bwjVar8.h();
                    if (h4 == bwj.a.a) {
                        h4 = new ajs();
                        bwjVar8.B(h4);
                    }
                    bwjVar8.q();
                    cga b11 = adw.b(a10, (ajr) h4, null, false, dga.a(R.string.compose_hint_text_click_label, bwjVar8), null, this.a, 20);
                    if (adom.Q(this.b).length() == 0) {
                        cga.a aVar3 = cga.e;
                        bwjVar8.y(-324405874);
                        Object h5 = bwjVar8.h();
                        if (h5 == bwj.a.a) {
                            h5 = aedh.m;
                            bwjVar8.B(h5);
                        }
                        bwjVar8.q();
                        c3 = dhb.c(aVar3, false, (arqr) h5);
                        b11 = b11.a(c3);
                    }
                    bwjVar8.q();
                    ahji.e(str4, b11, 0L, 0L, 0L, null, 0L, 0, false, 1, 0, null, dje.y(bmp.d(bwjVar8).j, bmp.a(bwjVar8).s, 0L, null, null, null, null, 0L, 0, 0, 0L, null, null, 0, 16777214), bwjVar8, intValue6 & 14, 3072, 57340);
                }
                return arnb.a;
            case 11:
                alo aloVar = (alo) obj;
                bwj bwjVar9 = (bwj) obj2;
                int intValue7 = ((Number) obj3).intValue();
                aloVar.getClass();
                if ((intValue7 & 14) == 0) {
                    intValue7 |= true != bwjVar9.G(aloVar) ? 2 : 4;
                }
                if ((intValue7 & 91) == 18 && bwjVar9.L()) {
                    bwjVar9.v();
                } else {
                    adom.E(aloVar, (aept) this.a, (cit) this.b, bwjVar9, intValue7 & 14);
                }
                return arnb.a;
            case 12:
                bwj bwjVar10 = (bwj) obj2;
                int intValue8 = ((Number) obj3).intValue();
                ((amt) obj).getClass();
                if ((intValue8 & 81) == 16 && bwjVar10.L()) {
                    bwjVar10.v();
                } else {
                    ajw.d dVar = new ajw.d(4.0f, true, ajx.a);
                    int i13 = cfq.a;
                    aeqi aeqiVar = (aeqi) this.b;
                    boolean z2 = aeqiVar.b;
                    cfq.c cVar = cfq.a.k;
                    cga.a aVar4 = cga.e;
                    if (z2) {
                        bwjVar10.y(99479850);
                        a = dga.a(R.string.expandable_list_button_collapse_action, bwjVar10);
                        bwjVar10.q();
                    } else {
                        bwjVar10.y(99482440);
                        a = dga.a(R.string.expandable_list_button_expand_action, bwjVar10);
                        bwjVar10.q();
                    }
                    cga c6 = adw.c(aVar4, false, a, aeqiVar.c, 5);
                    Object obj11 = this.b;
                    Object obj12 = this.a;
                    cue a11 = amq.a(dVar, cVar, bwjVar10, 54);
                    int a12 = bwg.a(bwjVar10);
                    bwy d4 = bwjVar10.d();
                    cga b12 = cfv.b(bwjVar10, c6);
                    int i14 = cwl.a;
                    arqg arqgVar4 = cwl.a.a;
                    bwjVar10.N();
                    bwjVar10.A();
                    if (bwjVar10.K()) {
                        bwjVar10.l(arqgVar4);
                    } else {
                        bwjVar10.C();
                    }
                    caw.b(bwjVar10, a11, cwl.a.e);
                    caw.b(bwjVar10, d4, cwl.a.d);
                    arqv arqvVar4 = cwl.a.f;
                    if (bwjVar10.K() || !d.F(bwjVar10.h(), Integer.valueOf(a12))) {
                        Integer valueOf4 = Integer.valueOf(a12);
                        bwjVar10.B(valueOf4);
                        bwjVar10.j(valueOf4, arqvVar4);
                    }
                    caw.b(bwjVar10, b12, cwl.a.c);
                    ahji.e(((aeqi) obj11).a, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, bwjVar10, 0, 0, 131070);
                    ahji.N(aeke.bg((aerb) obj12, bwjVar10), null, null, 0L, bwjVar10, 56, 12);
                    bwjVar10.p();
                }
                return arnb.a;
            case 13:
                amt amtVar = (amt) obj;
                bwj bwjVar11 = (bwj) obj2;
                int intValue9 = ((Number) obj3).intValue();
                amtVar.getClass();
                if ((intValue9 & 14) == 0) {
                    intValue9 |= true != bwjVar11.G(amtVar) ? 2 : 4;
                }
                if ((intValue9 & 91) == 18 && bwjVar11.L()) {
                    bwjVar11.v();
                } else {
                    bwjVar11.y(-1024548413);
                    aesh aeshVar = (aesh) this.a;
                    if (!aeshVar.e) {
                        aetn.Z(aeshVar, this.b, bwjVar11, 48);
                    }
                    bwjVar11.q();
                    b4 = amtVar.b(cga.e, 1.0f, true);
                    cga i15 = amh.i(b4, 8.0f, brg.a, 2);
                    Object obj13 = this.a;
                    ajw.e eVar2 = ajw.c;
                    int i16 = cfq.a;
                    cue a13 = akk.a(eVar2, cfq.a.m, bwjVar11, 0);
                    int a14 = bwg.a(bwjVar11);
                    bwy d5 = bwjVar11.d();
                    cga b13 = cfv.b(bwjVar11, i15);
                    int i17 = cwl.a;
                    arqg arqgVar5 = cwl.a.a;
                    bwjVar11.N();
                    bwjVar11.A();
                    if (bwjVar11.K()) {
                        bwjVar11.l(arqgVar5);
                    } else {
                        bwjVar11.C();
                    }
                    caw.b(bwjVar11, a13, cwl.a.e);
                    caw.b(bwjVar11, d5, cwl.a.d);
                    arqv arqvVar5 = cwl.a.f;
                    if (bwjVar11.K() || !d.F(bwjVar11.h(), Integer.valueOf(a14))) {
                        Integer valueOf5 = Integer.valueOf(a14);
                        bwjVar11.B(valueOf5);
                        bwjVar11.j(valueOf5, arqvVar5);
                    }
                    caw.b(bwjVar11, b13, cwl.a.c);
                    aesh aeshVar2 = (aesh) obj13;
                    aetn.ac(aeshVar2, bwjVar11, 0);
                    String str5 = aeshVar2.b;
                    bwjVar11.y(-1324490420);
                    if (str5 != null) {
                        amx.a(amv.d(cga.e, 2.0f), bwjVar11);
                        aetn.ab(str5, aeshVar2.c, bwjVar11, 64);
                    }
                    bwjVar11.q();
                    bwjVar11.p();
                    aesh aeshVar3 = (aesh) this.a;
                    if (aeshVar3.e) {
                        aetn.Z(aeshVar3, this.b, bwjVar11, 48);
                    }
                }
                return arnb.a;
            case 14:
                bwj bwjVar12 = (bwj) obj2;
                int intValue10 = ((Number) obj3).intValue();
                ((akn) obj).getClass();
                if ((intValue10 & 81) == 16 && bwjVar12.L()) {
                    bwjVar12.v();
                } else {
                    for (aehz aehzVar : ((aesj) this.a).c) {
                        boolean z3 = aehzVar.f;
                        cdi e = cdk.e(-733966955, new aeqh(aehzVar, 6), bwjVar12);
                        bwjVar12.y(2044859593);
                        boolean G3 = bwjVar12.G(aehzVar);
                        Object obj14 = this.b;
                        Object h6 = bwjVar12.h();
                        if (G3 || h6 == bwj.a.a) {
                            h6 = new aenj(aehzVar, obj14, 6);
                            bwjVar12.B(h6);
                        }
                        bwjVar12.q();
                        ahji.K(e, (arqg) h6, null, z3, null, null, null, bwjVar12, 6, 476);
                    }
                }
                return arnb.a;
            case 15:
                amt amtVar2 = (amt) obj;
                bwj bwjVar13 = (bwj) obj2;
                int intValue11 = ((Number) obj3).intValue();
                amtVar2.getClass();
                if ((intValue11 & 14) == 0) {
                    intValue11 |= true != bwjVar13.G(amtVar2) ? 2 : 4;
                }
                if ((intValue11 & 91) != 18 || !bwjVar13.L()) {
                    b5 = amtVar2.b(cga.e, 1.0f, true);
                    cga j = amh.j(b5, 16.0f, brg.a, brg.a, brg.a, 14);
                    Object obj15 = this.a;
                    ajw.c cVar2 = ajw.e;
                    int i18 = cfq.a;
                    cue a15 = akk.a(cVar2, cfq.a.m, bwjVar13, 6);
                    int a16 = bwg.a(bwjVar13);
                    bwy d6 = bwjVar13.d();
                    cga b14 = cfv.b(bwjVar13, j);
                    int i19 = cwl.a;
                    arqg arqgVar6 = cwl.a.a;
                    bwjVar13.N();
                    bwjVar13.A();
                    if (bwjVar13.K()) {
                        bwjVar13.l(arqgVar6);
                    } else {
                        bwjVar13.C();
                    }
                    caw.b(bwjVar13, a15, cwl.a.e);
                    caw.b(bwjVar13, d6, cwl.a.d);
                    arqv arqvVar6 = cwl.a.f;
                    if (bwjVar13.K() || !d.F(bwjVar13.h(), Integer.valueOf(a16))) {
                        Integer valueOf6 = Integer.valueOf(a16);
                        bwjVar13.B(valueOf6);
                        bwjVar13.j(valueOf6, arqvVar6);
                    }
                    caw.b(bwjVar13, b14, cwl.a.c);
                    aest aestVar = (aest) obj15;
                    aetn.I(aestVar.a, bwjVar13, 0);
                    String str6 = aestVar.b;
                    bwjVar13.y(-871136730);
                    aetn.H(str6, bwjVar13, 0);
                    bwjVar13.q();
                    bwjVar13.p();
                    aest aestVar2 = (aest) this.a;
                    ahji.z(aestVar2.c, aestVar2.d, null, false, null, this.b, bwjVar13, 196608);
                } else {
                    bwjVar13.v();
                }
                return arnb.a;
            case 16:
                amt amtVar3 = (amt) obj;
                bwj bwjVar14 = (bwj) obj2;
                int intValue12 = ((Number) obj3).intValue();
                amtVar3.getClass();
                if ((intValue12 & 14) == 0) {
                    intValue12 |= true != bwjVar14.G(amtVar3) ? 2 : 4;
                }
                if ((intValue12 & 91) == 18 && bwjVar14.L()) {
                    bwjVar14.v();
                } else {
                    adcx.W(((aeta) this.a).a, null, bwjVar14, 0);
                    b6 = amtVar3.b(cga.e, 1.0f, true);
                    cga j2 = amh.j(b6, 16.0f, brg.a, brg.a, brg.a, 14);
                    Object obj16 = this.a;
                    ajw.c cVar3 = ajw.e;
                    int i20 = cfq.a;
                    cue a17 = akk.a(cVar3, cfq.a.m, bwjVar14, 6);
                    int a18 = bwg.a(bwjVar14);
                    bwy d7 = bwjVar14.d();
                    cga b15 = cfv.b(bwjVar14, j2);
                    int i21 = cwl.a;
                    arqg arqgVar7 = cwl.a.a;
                    bwjVar14.N();
                    bwjVar14.A();
                    if (bwjVar14.K()) {
                        bwjVar14.l(arqgVar7);
                    } else {
                        bwjVar14.C();
                    }
                    caw.b(bwjVar14, a17, cwl.a.e);
                    caw.b(bwjVar14, d7, cwl.a.d);
                    arqv arqvVar7 = cwl.a.f;
                    if (bwjVar14.K() || !d.F(bwjVar14.h(), Integer.valueOf(a18))) {
                        Integer valueOf7 = Integer.valueOf(a18);
                        bwjVar14.B(valueOf7);
                        bwjVar14.j(valueOf7, arqvVar7);
                    }
                    caw.b(bwjVar14, b15, cwl.a.c);
                    aeta aetaVar = (aeta) obj16;
                    aetn.s(aetaVar.b, aetaVar.e, bwjVar14, 0);
                    String str7 = aetaVar.c;
                    bwjVar14.y(1374737184);
                    if (str7 != null) {
                        aetn.r(str7, bwjVar14, 0);
                    }
                    bwjVar14.q();
                    bwjVar14.p();
                    aeta aetaVar2 = (aeta) this.a;
                    ahji.z(aetaVar2.d, aetaVar2.f, null, false, null, this.b, bwjVar14, 196608);
                }
                return arnb.a;
            case 17:
                amt amtVar4 = (amt) obj;
                bwj bwjVar15 = (bwj) obj2;
                int intValue13 = ((Number) obj3).intValue();
                amtVar4.getClass();
                if ((intValue13 & 14) == 0) {
                    intValue13 |= true != bwjVar15.G(amtVar4) ? 2 : 4;
                }
                if ((intValue13 & 91) == 18 && bwjVar15.L()) {
                    bwjVar15.v();
                } else {
                    Object obj17 = this.a;
                    bwjVar15.y(1906713625);
                    aerb aerbVar = ((aetb) obj17).b;
                    if (aerbVar != null) {
                        aetn.m(aerbVar, bwjVar15, 0);
                    }
                    bwjVar15.q();
                    b7 = amtVar4.b(cga.e, 1.0f, true);
                    cga i22 = amh.i(b7, 16.0f, brg.a, 2);
                    Object obj18 = this.a;
                    ajw.e eVar3 = ajw.c;
                    int i23 = cfq.a;
                    cue a19 = akk.a(eVar3, cfq.a.m, bwjVar15, 0);
                    int a20 = bwg.a(bwjVar15);
                    bwy d8 = bwjVar15.d();
                    cga b16 = cfv.b(bwjVar15, i22);
                    int i24 = cwl.a;
                    arqg arqgVar8 = cwl.a.a;
                    bwjVar15.N();
                    bwjVar15.A();
                    if (bwjVar15.K()) {
                        bwjVar15.l(arqgVar8);
                    } else {
                        bwjVar15.C();
                    }
                    caw.b(bwjVar15, a19, cwl.a.e);
                    caw.b(bwjVar15, d8, cwl.a.d);
                    arqv arqvVar8 = cwl.a.f;
                    if (bwjVar15.K() || !d.F(bwjVar15.h(), Integer.valueOf(a20))) {
                        Integer valueOf8 = Integer.valueOf(a20);
                        bwjVar15.B(valueOf8);
                        bwjVar15.j(valueOf8, arqvVar8);
                    }
                    caw.b(bwjVar15, b16, cwl.a.c);
                    aetn.p(((aetb) obj18).a, bwjVar15, 0);
                    bwjVar15.y(-1179241444);
                    bwjVar15.q();
                    bwjVar15.p();
                    aetn.l((aetb) this.a, this.b, bwjVar15, 48);
                }
                return arnb.a;
            case 18:
                alo aloVar2 = (alo) obj;
                bwj bwjVar16 = (bwj) obj2;
                int intValue14 = ((Number) obj3).intValue();
                aloVar2.getClass();
                if ((intValue14 & 14) == 0) {
                    intValue14 |= true != bwjVar16.G(aloVar2) ? 2 : 4;
                }
                if ((intValue14 & 91) == 18 && bwjVar16.L()) {
                    bwjVar16.v();
                } else {
                    List b17 = this.a.b();
                    cga.a aVar5 = cga.e;
                    int i25 = cfq.a;
                    adcx.bP(b17, aloVar2.a(aVar5, cfq.a.k), null, (aeux) this.b, bwjVar16, 8, 4);
                }
                return arnb.a;
            case 19:
                bwj bwjVar17 = (bwj) obj2;
                int intValue15 = ((Number) obj3).intValue();
                ((ake) obj).getClass();
                if ((intValue15 & 81) == 16 && bwjVar17.L()) {
                    bwjVar17.v();
                } else {
                    adcx.bd(this.b, (String) this.a, bwjVar17, 0);
                }
                return arnb.a;
            default:
                bwj bwjVar18 = (bwj) obj2;
                int intValue16 = ((Number) obj3).intValue();
                ((ake) obj).getClass();
                if ((intValue16 & 81) == 16 && bwjVar18.L()) {
                    bwjVar18.v();
                } else {
                    adom.bF((aehz) this.b, (aerb) this.a, bwjVar18, 0);
                }
                return arnb.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ifo(Object obj, Object obj2, int i, byte[] bArr) {
        super(3);
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
