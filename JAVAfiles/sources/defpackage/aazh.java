package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aazh {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/ui/rcs/setup/carriertos/CarrierTosPopupBottomSheetDialogFragmentPeer");
    public final String b;
    public final aazg c;
    public final armf d;
    public final armf e;
    public final akbo f;
    public final akgu g;
    public final armf h;
    public final armf i;
    public final aksr j;
    public final akbp k = new akbp<Boolean, Void>() { // from class: aazh.1
        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
            xzb.h("Bugle", "CarrierTos: failed to update consent: %s due to: %s", (Boolean) obj, th.getMessage());
            aazk aazkVar = aazh.this.l;
            if (aazkVar != null) {
                aazkVar.d();
            }
        }

        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void b(Object obj) {
        }

        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            aazk aazkVar;
            aazk aazkVar2;
            Boolean bool = (Boolean) obj;
            xzb.k("Bugle", "CarrierTos: successfully updated consent: %s", bool);
            if (bool.booleanValue()) {
                aazh aazhVar = aazh.this;
                aazhVar.c();
                if (((pcl) aazhVar.h.b()).a()) {
                    ((wjr) aazhVar.e.b()).j(aazhVar.b, amww.CARRIER_TOS_POPUP_BOTTOM_SHEET_DIALOG);
                } else {
                    ((wjr) aazhVar.e.b()).i(amww.CARRIER_TOS_POPUP_BOTTOM_SHEET_DIALOG);
                }
                if (aazhVar.c.fe() != null && (aazkVar2 = aazhVar.l) != null) {
                    aazkVar2.d();
                    return;
                }
                return;
            }
            aazh aazhVar2 = aazh.this;
            aazhVar2.c();
            ((mho) aazhVar2.d.b()).x();
            if (((pcl) aazhVar2.h.b()).a()) {
                ((wjr) aazhVar2.e.b()).j(aazhVar2.b, amww.CARRIER_TOS_POPUP_BOTTOM_SHEET_DIALOG);
            }
            cj fe = aazhVar2.c.fe();
            if (fe != null && (aazkVar = aazhVar2.l) != null) {
                aazkVar.d();
                String string = fe.getResources().getString(R.string.fast_track_popup_declined_snack_bar_text_v2);
                int i = alog.d;
                alog alogVar = alsx.a;
                lga.E(fe, string);
            }
        }
    };
    public aazk l;
    private final armf m;
    private final armf n;
    private final armf o;
    private final armf p;

    public aazh(String str, aazg aazgVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, akbo akboVar, akgu akguVar, armf armfVar6, armf armfVar7, aksr aksrVar, armf armfVar8) {
        this.b = str;
        this.c = aazgVar;
        this.d = armfVar;
        this.m = armfVar2;
        this.n = armfVar3;
        this.o = armfVar4;
        this.e = armfVar5;
        this.f = akboVar;
        this.g = akguVar;
        this.h = armfVar6;
        this.i = armfVar7;
        this.j = aksrVar;
        this.p = armfVar8;
        if (((pcl) armfVar6.b()).a() && str.isEmpty()) {
            throw new IllegalArgumentException("CarrierTosPopupBottomSheetDialogFragment does not have a simId");
        }
        aazgVar.r();
    }

    private final akul d(int i) {
        if (((pcl) this.h.b()).a()) {
            return ((whj) this.o.b()).m(this.b, i);
        }
        whj whjVar = (whj) this.o.b();
        String f = ((adtl) this.n.b()).f();
        aozy createBuilder = whl.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((whl) createBuilder.b).b = a.an(i);
        return whjVar.i(f, uhy.b((whl) createBuilder.s()));
    }

    public final void a() {
        if (((pcl) this.h.b()).a()) {
            ((wyp) this.p.b()).o(this.b, amlw.RCS_PROVISIONING_PROMPT_DECLINED);
        } else {
            ((mho) this.d.b()).S(amlw.RCS_PROVISIONING_PROMPT_DECLINED, amlx.PROVISIONING_UI_TYPE_CARRIER_TOS_PROMO);
        }
        this.f.j(ahlp.l(d(4)), new ahlp((Object) false), this.k);
    }

    public final void b() {
        if (((pcl) this.h.b()).a()) {
            ((wyp) this.p.b()).o(this.b, amlw.RCS_PROVISIONING_PROMPT_ACCEPTED);
        } else {
            ((mho) this.d.b()).S(amlw.RCS_PROVISIONING_PROMPT_ACCEPTED, amlx.PROVISIONING_UI_TYPE_CARRIER_TOS_PROMO);
        }
        this.f.j(ahlp.l(d(3)), new ahlp((Object) true), this.k);
    }

    public final void c() {
        if (((pcl) this.h.b()).a()) {
            ((whs) this.i.b()).f(new adiw(this.b));
        } else {
            ((vqu) this.m.b()).z();
        }
    }
}
