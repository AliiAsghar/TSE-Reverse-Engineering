package defpackage;

import android.content.Context;
import android.content.Intent;
import android.view.Window;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.apps.messaging.R;
import defpackage.bwj;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class keh extends arrp implements arqv {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public keh(Object obj, Object obj2, Object obj3, int i) {
        super(2);
        this.d = i;
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v89, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object, arqv] */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v60, types: [amt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v16, types: [cas, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v22, types: [cas, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, cga] */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.lang.Object, yg] */
    /* JADX WARN: Type inference failed for: r4v22, types: [cas, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v29, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v27, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12, types: [wh, java.lang.Object] */
    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        cga b;
        cga a;
        cga c;
        int i;
        boolean booleanValue;
        boolean booleanValue2;
        boolean booleanValue3;
        switch (this.d) {
            case 0:
                bwj bwjVar = (bwj) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && bwjVar.L()) {
                    bwjVar.v();
                } else {
                    new cdj(1819775480, true, new jkf((hmk) bwjVar.g(kei.a), 2)).f(this.b, this.c, this.a, bwjVar, 512);
                }
                return arnb.a;
            case 1:
                bwj bwjVar2 = (bwj) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && bwjVar2.L()) {
                    bwjVar2.v();
                } else {
                    jxq jxqVar = (jxq) this.a;
                    adom.aE(new aeoq(jxqVar.a, jxqVar.d, null, jxqVar.c, 0.1f, false, jxqVar.e, 32), this.c, (cit) this.b, bwjVar2, 0, 0);
                }
                return arnb.a;
            case 2:
                arsb arsbVar = (arsb) this.b;
                if (arsbVar.a == null) {
                    arsbVar.a = qjh.l(this.a, null, new hak((arqv) this.c, obj, obj2, arsbVar, (arpe) null, 17), 3);
                }
                return arnb.a;
            case 3:
                bwj bwjVar3 = (bwj) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && bwjVar3.L()) {
                    bwjVar3.v();
                } else {
                    yzc.k(this.a, (Context) this.c, (Intent) this.b, bwjVar3, 584);
                }
                return arnb.a;
            case 4:
                bwj bwjVar4 = (bwj) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && bwjVar4.L()) {
                    bwjVar4.v();
                } else {
                    bwx.b(new bzd[0], cdk.e(1927811206, new keh(this.a, this.c, this.b, 3, (byte[]) null), bwjVar4), bwjVar4, 56);
                }
                return arnb.a;
            case 5:
                bwj bwjVar5 = (bwj) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && bwjVar5.L()) {
                    bwjVar5.v();
                } else if (this.a != null) {
                    Window window = afzv.b((Context) bwjVar5.g(AndroidCompositionLocals_androidKt.b)).getWindow();
                    bwjVar5.y(-184475955);
                    Object h = bwjVar5.h();
                    if (h == bwj.a.a) {
                        byu byuVar = new byu(false, cav.a);
                        bwjVar5.B(byuVar);
                        h = byuVar;
                    }
                    bwjVar5.q();
                    bxl.c(arnb.a, new wup(window, (byn) h, 17), bwjVar5);
                    zzp zzpVar = (zzp) this.a;
                    List list = zzpVar.b;
                    arqg arqgVar = zzpVar.d;
                    bwjVar5.y(-184456061);
                    boolean G = bwjVar5.G(arqgVar);
                    Object h2 = bwjVar5.h();
                    if (G || h2 == bwj.a.a) {
                        h2 = new zzq(arqgVar, 3);
                        bwjVar5.B(h2);
                    }
                    bwjVar5.q();
                    a.bS(false, (arqg) h2, bwjVar5, 0, 1);
                    b = amv.b(cga.e, 1.0f);
                    a = adf.a(b, cku.a, clw.a);
                    bwjVar5.y(-184451914);
                    Object h3 = bwjVar5.h();
                    if (h3 == bwj.a.a) {
                        h3 = yzm.l;
                        bwjVar5.B(h3);
                    }
                    bwjVar5.q();
                    c = dhb.c(a, false, (arqr) h3);
                    ahji.y(c, cdk.e(616444959, new ifn(this.a, arqgVar, 13, null), bwjVar5), null, null, null, 0, 0L, 0L, null, cdk.e(-45099148, new zzr((yg) this.b, list, (zzp) this.a, (wh) this.c, 0), bwjVar5), bwjVar5, 805306416, 508);
                }
                return arnb.a;
            case 6:
                bwj bwjVar6 = (bwj) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && bwjVar6.L()) {
                    bwjVar6.v();
                } else {
                    yzc.t(null, null, false, null, false, cdk.e(-341052543, new ifn(this.b, this.c, 14), bwjVar6), bwjVar6, 196608, 31);
                }
                return arnb.a;
            case 7:
                bwj bwjVar7 = (bwj) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && bwjVar7.L()) {
                    bwjVar7.v();
                } else {
                    aabr.A((aahr) this.a, (arqg) this.c.a(), (arqg) this.b.a(), bwjVar7, 8);
                }
                return arnb.a;
            case 8:
                bwj bwjVar8 = (bwj) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && bwjVar8.L()) {
                    bwjVar8.v();
                } else {
                    yzc.t(null, null, false, null, false, cdk.e(698719017, new keh(this.a, this.c, this.b, 7, (byte[]) null), bwjVar8), bwjVar8, 196608, 31);
                }
                return arnb.a;
            case 9:
                bwj bwjVar9 = (bwj) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && bwjVar9.L()) {
                    bwjVar9.v();
                } else {
                    Object obj3 = this.b;
                    Integer num = ((aeom) this.a).b;
                    if (num != null) {
                        i = num.intValue();
                    } else {
                        i = 0;
                    }
                    aeoj aeojVar = (aeoj) obj3;
                    adom.ar(aeojVar.c, aeojVar.b, dga.b(R.string.compose_icon_sim_content_description, new Object[]{Integer.valueOf(i + 1), Integer.valueOf(((aeom) this.a).a.size())}, bwjVar9), null, bwjVar9, 0, 8);
                    Object obj4 = this.a;
                    booleanValue = ((Boolean) this.c.a()).booleanValue();
                    bwjVar9.y(-1237394584);
                    Object obj5 = this.c;
                    Object h4 = bwjVar9.h();
                    if (h4 == bwj.a.a) {
                        h4 = new aeot(obj5, 1);
                        bwjVar9.B(h4);
                    }
                    bwjVar9.q();
                    adom.au((aeom) obj4, booleanValue, (arqg) h4, bwjVar9, 384);
                }
                return arnb.a;
            case 10:
                bwj bwjVar10 = (bwj) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && bwjVar10.L()) {
                    bwjVar10.v();
                } else {
                    ?? r2 = this.c;
                    ?? r3 = this.b;
                    Object obj6 = this.a;
                    booleanValue2 = ((Boolean) r3.a()).booleanValue();
                    adom.ae(r2, booleanValue2, (aekm) obj6, bwjVar10, 0);
                }
                return arnb.a;
            case 11:
                bwj bwjVar11 = (bwj) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && bwjVar11.L()) {
                    bwjVar11.v();
                } else {
                    adom.az((aenr) this.b, (aeoa) this.a, this.c, bwjVar11, 0);
                }
                return arnb.a;
            case 12:
                bwj bwjVar12 = (bwj) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && bwjVar12.L()) {
                    bwjVar12.v();
                } else {
                    ((agcw) this.a).c.f(this.c, cga.e, ((agcj) this.b).a, bwjVar12, 48);
                }
                return arnb.a;
            case 13:
                bwj bwjVar13 = (bwj) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && bwjVar13.L()) {
                    bwjVar13.v();
                } else {
                    ((agcw) this.a).b.f(this.c, cga.e, ((agcj) this.b).a, bwjVar13, 48);
                }
                return arnb.a;
            default:
                bwj bwjVar14 = (bwj) obj;
                if ((((Number) obj2).intValue() & 11) != 2 || !bwjVar14.L()) {
                    booleanValue3 = ((Boolean) this.c.a()).booleanValue();
                    bwjVar14.y(232392576);
                    Object obj7 = this.c;
                    Object h5 = bwjVar14.h();
                    if (h5 == bwj.a.a) {
                        h5 = new afzg(obj7, 14);
                        bwjVar14.B(h5);
                    }
                    bwjVar14.q();
                    ahji.J(booleanValue3, (arqg) h5, null, 0L, null, null, null, 0L, brg.a, cdk.e(224003254, new afao(this.a, this.b, 7), bwjVar14), bwjVar14, 48, 48, 2044);
                } else {
                    bwjVar14.v();
                }
                return arnb.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public keh(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        super(2);
        this.d = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public keh(Object obj, Object obj2, Object obj3, int i, char[] cArr) {
        super(2);
        this.d = i;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public keh(Object obj, Object obj2, Object obj3, int i, short[] sArr) {
        super(2);
        this.d = i;
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public keh(zzp zzpVar, yg ygVar, wh whVar, int i) {
        super(2);
        this.d = i;
        this.a = zzpVar;
        this.b = ygVar;
        this.c = whVar;
    }
}
