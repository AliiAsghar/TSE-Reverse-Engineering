package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Trace;
import android.util.TypedValue;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.apps.messaging.R;
import defpackage.ajw;
import defpackage.bwj;
import defpackage.cfq;
import defpackage.cga;
import defpackage.cwl;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jwz extends arrp implements arqw {
    private final /* synthetic */ int s;
    public static final jwz r = new jwz(20);
    public static final jwz q = new jwz(19);
    public static final jwz p = new jwz(17);
    public static final jwz o = new jwz(16);
    public static final jwz n = new jwz(15);
    public static final jwz m = new jwz(14);
    public static final jwz l = new jwz(13);
    public static final jwz k = new jwz(12);
    public static final jwz j = new jwz(11);
    public static final jwz i = new jwz(10);
    public static final jwz h = new jwz(9);
    public static final jwz g = new jwz(8);
    public static final jwz f = new jwz(7);
    public static final jwz e = new jwz(6);
    public static final jwz d = new jwz(5);
    public static final jwz c = new jwz(3);
    public static final jwz b = new jwz(2);
    public static final jwz a = new jwz(0);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jwz(int i2) {
        super(3);
        this.s = i2;
    }

    @Override // defpackage.arqw
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        cuf et;
        cuf et2;
        cku ckuVar;
        File dataDir;
        switch (this.s) {
            case 0:
                bwj bwjVar = (bwj) obj2;
                int intValue = ((Number) obj3).intValue();
                ((amt) obj).getClass();
                if ((intValue & 81) == 16 && bwjVar.L()) {
                    bwjVar.v();
                } else {
                    ahji.e(dga.a(R.string.cancel_theme_selection_button, bwjVar), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, bwjVar, 0, 0, 131070);
                }
                return arnb.a;
            case 1:
                aeno aenoVar = (aeno) obj;
                aeoi aeoiVar = (aeoi) obj2;
                jkm jkmVar = (jkm) obj3;
                aenoVar.getClass();
                aeoiVar.getClass();
                jkmVar.getClass();
                aeoh aeohVar = aeoiVar.g;
                return new jjq(new jxq(new aenr(aenoVar, jjr.a, aeoi.a(aeoiVar, null, null, null, null, null, false, new aeoh(aeohVar.a, false, true, aeohVar.d), 63), new aenq(null)), aeoo.c), jkmVar.b);
            case 2:
                bwj bwjVar2 = (bwj) obj2;
                int intValue2 = ((Number) obj3).intValue();
                ((amt) obj).getClass();
                if ((intValue2 & 81) == 16 && bwjVar2.L()) {
                    bwjVar2.v();
                } else {
                    ahji.e(dga.a(R.string.confirm_theme_selection_button, bwjVar2), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, bwjVar2, 0, 0, 131070);
                }
                return arnb.a;
            case 3:
                cuh cuhVar = (cuh) obj;
                cuc cucVar = (cuc) obj2;
                long j2 = ((dqs) obj3).a;
                cuhVar.getClass();
                cucVar.getClass();
                cvc e2 = cucVar.e(j2);
                et = cuhVar.et(e2.a, e2.b, arnw.a, new jsv(e2, 10));
                return et;
            case 4:
                cuh cuhVar2 = (cuh) obj;
                cuc cucVar2 = (cuc) obj2;
                long j3 = ((dqs) obj3).a;
                Trace.beginSection(arsd.ah("measureMessageBubble", 126));
                try {
                    cvc e3 = cucVar2.e(j3);
                    et2 = cuhVar2.et(e3.a, e3.b, arnw.a, new jsv(e3, 14));
                    return et2;
                } finally {
                    Trace.endSection();
                }
            case 5:
                String str = (String) obj;
                bwj bwjVar3 = (bwj) obj2;
                ((Number) obj3).intValue();
                bwjVar3.y(1136910848);
                if (d.F(str, "error")) {
                    bwjVar3.y(-1426607550);
                    long j4 = bmp.a(bwjVar3).w;
                    bwjVar3.q();
                    ckuVar = new cku(j4);
                } else {
                    bwjVar3.y(-1275123609);
                    cku ckuVar2 = str != null ? new cku(adom.bX(bwjVar3).c.a(str)) : null;
                    bwjVar3.q();
                    ckuVar = ckuVar2;
                }
                bwjVar3.q();
                return ckuVar;
            case 6:
                bwj bwjVar4 = (bwj) obj2;
                int intValue3 = ((Number) obj3).intValue();
                ((anq) obj).getClass();
                if ((intValue3 & 81) == 16 && bwjVar4.L()) {
                    bwjVar4.v();
                } else {
                    ahji.e("Debug", amh.j(cga.e, 16.0f, brg.a, 16.0f, 12.0f, 2), 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, bmp.d(bwjVar4).m, bwjVar4, 6, 0, 65532);
                }
                return arnb.a;
            case 7:
                bwj bwjVar5 = (bwj) obj2;
                int intValue4 = ((Number) obj3).intValue();
                ((anq) obj).getClass();
                if ((intValue4 & 81) == 16 && bwjVar5.L()) {
                    bwjVar5.v();
                } else {
                    ahji.e(dga.a(R.string.bottom_sheets_reaction_summary_title, bwjVar5), amh.j(cga.e, 16.0f, brg.a, 16.0f, 18.0f, 2), 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, bmp.d(bwjVar5).m, bwjVar5, 0, 0, 65532);
                }
                return arnb.a;
            case 8:
                d.ai((anq) obj, (bwj) obj2, ((Number) obj3).intValue());
                return arnb.a;
            case 9:
                d.ai((anq) obj, (bwj) obj2, ((Number) obj3).intValue());
                return arnb.a;
            case 10:
                bwj bwjVar6 = (bwj) obj2;
                int intValue5 = ((Number) obj3).intValue();
                ((amt) obj).getClass();
                if ((intValue5 & 81) == 16 && bwjVar6.L()) {
                    bwjVar6.v();
                } else {
                    ahji.N(aeke.bg(aerb.bh, bwjVar6), null, amv.h(cga.e, 18.0f), 0L, bwjVar6, 440, 8);
                    ahji.e(dga.a(R.string.create_group_button_label, bwjVar6), amh.j(cga.e, 8.0f, brg.a, brg.a, brg.a, 14), 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, bwjVar6, 48, 0, 131068);
                }
                return arnb.a;
            case 11:
                bwj bwjVar7 = (bwj) obj2;
                int intValue6 = ((Number) obj3).intValue();
                ((amt) obj).getClass();
                if ((intValue6 & 81) == 16 && bwjVar7.L()) {
                    bwjVar7.v();
                } else {
                    ahji.N(aeke.bg(aerb.aB, bwjVar7), null, amv.h(cga.e, 18.0f), 0L, bwjVar7, 440, 8);
                    ahji.e(dga.a(R.string.message_business_label, bwjVar7), amh.j(cga.e, 8.0f, brg.a, brg.a, brg.a, 14), 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, bwjVar7, 48, 0, 131068);
                }
                return arnb.a;
            case 12:
                d.ai((anq) obj, (bwj) obj2, ((Number) obj3).intValue());
                return arnb.a;
            case 13:
                bwj bwjVar8 = (bwj) obj2;
                int intValue7 = ((Number) obj3).intValue();
                ((amt) obj).getClass();
                if ((intValue7 & 81) == 16 && bwjVar8.L()) {
                    bwjVar8.v();
                } else {
                    ahji.e(dga.a(R.string.rcs_turn_off_cancel, bwjVar8), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, bwjVar8, 0, 0, 131070);
                }
                return arnb.a;
            case 14:
                bwj bwjVar9 = (bwj) obj2;
                int intValue8 = ((Number) obj3).intValue();
                ((amt) obj).getClass();
                if ((intValue8 & 81) == 16 && bwjVar9.L()) {
                    bwjVar9.v();
                } else {
                    ahji.e(dga.a(R.string.rcs_turn_off, bwjVar9), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, bwjVar9, 0, 0, 131070);
                }
                return arnb.a;
            case 15:
                bwj bwjVar10 = (bwj) obj2;
                int intValue9 = ((Number) obj3).intValue();
                ((amt) obj).getClass();
                if ((intValue9 & 81) == 16 && bwjVar10.L()) {
                    bwjVar10.v();
                } else {
                    int i2 = cfq.a;
                    cfq.c cVar = cfq.a.k;
                    ajw.d dVar = new ajw.d(8.0f, true, ajx.a);
                    cga.a aVar = cga.e;
                    cue a2 = amq.a(dVar, cVar, bwjVar10, 54);
                    int a3 = bwg.a(bwjVar10);
                    bwy d2 = bwjVar10.d();
                    cga b2 = cfv.b(bwjVar10, aVar);
                    int i3 = cwl.a;
                    arqg arqgVar = cwl.a.a;
                    bwjVar10.N();
                    bwjVar10.A();
                    if (bwjVar10.K()) {
                        bwjVar10.l(arqgVar);
                    } else {
                        bwjVar10.C();
                    }
                    caw.b(bwjVar10, a2, cwl.a.e);
                    caw.b(bwjVar10, d2, cwl.a.d);
                    arqv arqvVar = cwl.a.f;
                    if (bwjVar10.K() || !d.F(bwjVar10.h(), Integer.valueOf(a3))) {
                        Object valueOf = Integer.valueOf(a3);
                        bwjVar10.B(valueOf);
                        bwjVar10.j(valueOf, arqvVar);
                    }
                    caw.b(bwjVar10, b2, cwl.a.c);
                    Context context = (Context) bwjVar10.g(AndroidCompositionLocals_androidKt.b);
                    Resources a4 = dfz.a(bwjVar10);
                    Resources.Theme theme = context.getTheme();
                    boolean G = bwjVar10.G(a4.getConfiguration()) | bwjVar10.E(R.drawable.gs_group_add_vd_theme_24) | bwjVar10.G(a4) | bwjVar10.G(theme);
                    Object h2 = bwjVar10.h();
                    if (G || h2 == bwj.a.a) {
                        TypedValue typedValue = new TypedValue();
                        a4.getValue(R.drawable.gs_group_add_vd_theme_24, typedValue, true);
                        XmlResourceParser xml = a4.getXml(R.drawable.gs_group_add_vd_theme_24);
                        cpl.a(xml);
                        h2 = dgb.a(theme, a4, xml, typedValue.changingConfigurations).a;
                        bwjVar10.B(h2);
                    }
                    ahji.O((cov) h2, null, null, bmp.a(bwjVar10).a, bwjVar10, 48, 4);
                    ahji.e(dga.a(R.string.add_people, bwjVar10), null, bmp.a(bwjVar10).a, 0L, 0L, null, 0L, 0, false, 0, 0, null, bmp.d(bwjVar10).m, bwjVar10, 0, 0, 65530);
                    bwjVar10.p();
                }
                return arnb.a;
            case 16:
                Intent intent = (Intent) obj;
                Context context2 = (Context) obj2;
                String str2 = (String) obj3;
                intent.getClass();
                context2.getClass();
                str2.getClass();
                String stringExtra = intent.getStringExtra("file_name");
                if (stringExtra != null) {
                    return new File(stringExtra);
                }
                dataDir = context2.getDataDir();
                return new File(dataDir, str2);
            case 17:
                aetn.aX((amt) obj, (bwj) obj2, ((Number) obj3).intValue());
                return arnb.a;
            case 18:
                bwj bwjVar11 = (bwj) obj2;
                int intValue10 = ((Number) obj3).intValue();
                ((akn) obj).getClass();
                if ((intValue10 & 81) == 16) {
                    if (bwjVar11.L()) {
                        bwjVar11.v();
                        return arnb.a;
                    }
                    throw null;
                }
                throw null;
            case 19:
                amt amtVar = (amt) obj;
                bwj bwjVar12 = (bwj) obj2;
                int intValue11 = ((Number) obj3).intValue();
                amtVar.getClass();
                if ((intValue11 & 14) == 0) {
                    intValue11 |= true != bwjVar12.G(amtVar) ? 2 : 4;
                }
                if ((intValue11 & 91) == 18 && bwjVar12.L()) {
                    bwjVar12.v();
                } else {
                    int i4 = 14 & intValue11;
                    aeke.aI(amtVar, bwjVar12, i4);
                    aeke.aK(bwjVar12, 0);
                    aeke.aI(amtVar, bwjVar12, i4);
                }
                return arnb.a;
            default:
                bwj bwjVar13 = (bwj) obj2;
                ((Number) obj3).intValue();
                bwjVar13.y(-522164544);
                abm c2 = zs.c(brg.a, brg.a, null, 7);
                bwjVar13.q();
                return c2;
        }
    }
}
