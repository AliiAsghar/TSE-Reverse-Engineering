package defpackage;

import android.widget.EditText;
import com.google.android.apps.messaging.R;
import defpackage.ajw;
import defpackage.cfq;
import defpackage.cwl;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeyj extends arrp implements arqw {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeyj(Object obj, int i) {
        super(3);
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object, arqv] */
    /* JADX WARN: Type inference failed for: r1v40, types: [cas, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, aexv] */
    @Override // defpackage.arqw
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        int i = 2;
        boolean z = true;
        switch (this.b) {
            case 0:
                bwj bwjVar = (bwj) obj2;
                int intValue = ((Number) obj3).intValue();
                ((amt) obj).getClass();
                if ((intValue & 81) == 16 && bwjVar.L()) {
                    bwjVar.v();
                } else {
                    adcx.aa(bwjVar, 0);
                    String str = ((aeyk) this.a).c;
                    if (str != null) {
                        amx.a(amv.l(cga.e, 8.0f), bwjVar);
                        adcx.ac(str, bwjVar, 0);
                    }
                }
                return arnb.a;
            case 1:
                bwj bwjVar2 = (bwj) obj2;
                int intValue2 = ((Number) obj3).intValue();
                ((akn) obj).getClass();
                if ((intValue2 & 81) == 16 && bwjVar2.L()) {
                    bwjVar2.v();
                } else {
                    cga aJ = adcx.aJ(cga.e, ((aexu) this.a).b, bwjVar2);
                    ?? r5 = this.a;
                    ajw.e eVar = ajw.c;
                    int i2 = cfq.a;
                    cue a = akk.a(eVar, cfq.a.m, bwjVar2, 0);
                    int a2 = bwg.a(bwjVar2);
                    bwy d = bwjVar2.d();
                    cga b = cfv.b(bwjVar2, aJ);
                    int i3 = cwl.a;
                    arqg arqgVar = cwl.a.a;
                    bwjVar2.N();
                    bwjVar2.A();
                    if (bwjVar2.K()) {
                        bwjVar2.l(arqgVar);
                    } else {
                        bwjVar2.C();
                    }
                    caw.b(bwjVar2, a, cwl.a.e);
                    caw.b(bwjVar2, d, cwl.a.d);
                    arqv arqvVar = cwl.a.f;
                    if (bwjVar2.K() || !d.F(bwjVar2.h(), Integer.valueOf(a2))) {
                        Integer valueOf = Integer.valueOf(a2);
                        bwjVar2.B(valueOf);
                        bwjVar2.j(valueOf, arqvVar);
                    }
                    caw.b(bwjVar2, b, cwl.a.c);
                    aexf aexfVar = ((aexu) r5).a;
                    bwjVar2.y(-1289671204);
                    if (aexfVar != null) {
                        adcx.az(aexfVar, null, bwjVar2, 0, 2);
                    }
                    bwjVar2.q();
                    adcx.as(r5, bwjVar2, 0);
                    bwjVar2.p();
                }
                return arnb.a;
            case 2:
                ((Number) obj3).intValue();
                ((wh) obj).getClass();
                this.a.a((bwj) obj2, 0);
                return arnb.a;
            case 3:
                amt amtVar = (amt) obj;
                bwj bwjVar3 = (bwj) obj2;
                int intValue3 = ((Number) obj3).intValue();
                amtVar.getClass();
                if ((intValue3 & 14) == 0) {
                    if (true == bwjVar3.G(amtVar)) {
                        i = 4;
                    }
                    intValue3 |= i;
                }
                if ((intValue3 & 91) == 18 && bwjVar3.L()) {
                    bwjVar3.v();
                } else {
                    Object obj4 = this.a;
                    bwjVar3.y(-488170943);
                    aerb aerbVar = ((afal) obj4).b;
                    if (aerbVar != null) {
                        adom.bP(aerbVar, bwjVar3, 0);
                    }
                    bwjVar3.q();
                    afal afalVar = (afal) this.a;
                    adom.bS(amtVar, afalVar.a, afalVar.c, bwjVar3, (intValue3 & 14) | 512);
                }
                return arnb.a;
            case 4:
                bwj bwjVar4 = (bwj) obj2;
                int intValue4 = ((Number) obj3).intValue();
                ((amt) obj).getClass();
                if ((intValue4 & 81) == 16 && bwjVar4.L()) {
                    bwjVar4.v();
                } else {
                    adom.bJ(((afaw) this.a).c, bwjVar4, 8);
                }
                return arnb.a;
            case 5:
                bwj bwjVar5 = (bwj) obj2;
                int intValue5 = ((Number) obj3).intValue();
                ((amt) obj).getClass();
                if ((intValue5 & 81) == 16 && bwjVar5.L()) {
                    bwjVar5.v();
                } else {
                    brx.b(dga.b(R.string.done_button_with_number_items_selected, new Object[]{Integer.valueOf(a.x(this.a).size())}, bwjVar5), null, 0L, drn.c(14), 0L, null, drn.c(20), 0, false, 0, 0, null, dje.y(bmp.d(bwjVar5).m, bmp.a(bwjVar5).p, 0L, null, null, null, null, 0L, 0, 0, 0L, null, null, 0, 16777214), bwjVar5, 3072, 6, 64502);
                }
                return arnb.a;
            case 6:
                int intValue6 = ((Number) obj).intValue();
                int intValue7 = ((Number) obj2).intValue();
                ((Boolean) obj3).booleanValue();
                EditText editText = (EditText) ((czj) this.a).a;
                if (editText != null && editText.isEnabled() && intValue6 >= 0 && intValue7 <= editText.length()) {
                    editText.setSelection(intValue6, intValue7);
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 7:
                this.a.a((Throwable) obj);
                return arnb.a;
            case 8:
                boolean z2 = arwh.a;
                ((asgm) this.a).a.c(null);
                ((asgm) this.a).d();
                return arnb.a;
            default:
                ((asgq) this.a).f();
                return arnb.a;
        }
    }
}
