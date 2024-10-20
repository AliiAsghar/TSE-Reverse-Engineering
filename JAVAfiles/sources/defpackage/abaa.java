package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abaa implements lqv {
    private static final alvi c = alvi.m("com/google/android/apps/messaging/ui/rcs/setup/manual/PhoneNumberInputPopupPresenterV2");
    public final armf a;
    public aazt b;
    private final armf d;
    private final armf e;
    private final da f;
    private lqx g;

    public abaa(cg cgVar, armf armfVar, armf armfVar2, armf armfVar3) {
        this.f = cgVar.G();
        this.d = armfVar;
        this.e = armfVar2;
        this.a = armfVar3;
    }

    private final void j() {
        aazt aaztVar = this.b;
        if (aaztVar != null) {
            aaztVar.A = new ahjj(this, (byte[]) null);
        }
    }

    private final aazt k() {
        cg e = this.f.e("phone_number_input_bottom_sheet_fragment_tag");
        if (e instanceof aazr) {
            return ((aazr) e).E();
        }
        return null;
    }

    @Override // defpackage.lqv
    public final /* synthetic */ int a() {
        return lgb.s();
    }

    @Override // defpackage.lqv
    public final akul b() {
        wgd wgdVar = (wgd) this.d.b();
        return wgdVar.h.c().i(new wgb(wgdVar, 1), wgdVar.e).h(new weh(wgdVar, 6), wgdVar.f);
    }

    @Override // defpackage.lqv
    public final void c(lqx lqxVar, ViewGroup viewGroup) {
        this.g = lqxVar;
        if (this.b == null) {
            this.b = k();
        }
        j();
    }

    @Override // defpackage.lqv
    public final void d() {
        throw null;
    }

    public final void e() {
        aazt aaztVar = this.b;
        if (aaztVar != null && aaztVar.n()) {
            aaztVar.d.d();
        }
        lqx lqxVar = this.g;
        if (lqxVar != null) {
            lqxVar.b();
            lqx lqxVar2 = this.g;
            lqxVar2.h = -100;
            lqxVar2.k.q(aktp.ag(null), "POPUP_KEY");
        }
        this.b = null;
        ((wgd) this.d.b()).l.set(Optional.empty());
    }

    @Override // defpackage.lqv
    public final boolean f(Context context, ViewGroup viewGroup, boolean z) {
        if (this.b == null) {
            this.b = k();
        }
        aazt aaztVar = this.b;
        if (aaztVar == null || !aaztVar.n()) {
            aozy createBuilder = aazz.a.createBuilder();
            String num = Integer.toString(1);
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            aazz aazzVar = (aazz) createBuilder.b;
            num.getClass();
            aazzVar.b |= 2;
            aazzVar.d = num;
            aazt aaztVar2 = null;
            String str = (String) ((Optional) ((wgd) this.d.b()).l.get()).orElse(null);
            if (str == null) {
                ((alvg) ((alvg) c.d()).h("com/google/android/apps/messaging/ui/rcs/setup/manual/PhoneNumberInputPopupPresenterV2", "createAndShowBottomSheetFragment", 138, "PhoneNumberInputPopupPresenterV2.java")).q("createAndShowBottomSheetFragment: simId is null");
            } else {
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                aazz aazzVar2 = (aazz) createBuilder.b;
                aazzVar2.b |= 1;
                aazzVar2.c = str;
                ((yyt) this.e.b()).M(str, wfx.INPUT_BOTTOMSHEET, 3);
                ((alvg) ((alvg) c.d()).h("com/google/android/apps/messaging/ui/rcs/setup/manual/PhoneNumberInputPopupPresenterV2", "createAndShowBottomSheetFragment", 146, "PhoneNumberInputPopupPresenterV2.java")).t("createAndShowBottomSheetFragment: creating bottomsheet fragment with simId: %s", advq.SIM_ID.c(str));
                aazr aP = aazr.aP((aazz) createBuilder.s());
                aP.q(this.f, "phone_number_input_bottom_sheet_fragment_tag");
                aaztVar2 = aP.E();
            }
            this.b = aaztVar2;
        }
        j();
        return true;
    }

    @Override // defpackage.lqv
    public final int h() {
        return 6;
    }

    @Override // defpackage.lqv
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.lqv
    public final /* synthetic */ void g(Activity activity, int i) {
    }
}
