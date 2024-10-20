package defpackage;

import android.app.Activity;
import android.content.Context;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.messaging.R;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aazk implements lqv {
    private static final alvi b = alvi.m("com/google/android/apps/messaging/ui/rcs/setup/carriertos/CarrierTosPopupPresenter");
    aazg a;
    private lqx c;
    private final armf d;
    private final armf e;
    private final armf f;
    private final armf g;
    private final armf h;
    private final armf i;
    private final da j;
    private LottieAnimationView k;

    public aazk(cg cgVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6) {
        this.j = cgVar.G();
        this.d = armfVar;
        this.f = armfVar2;
        this.e = armfVar3;
        this.g = armfVar4;
        this.h = armfVar5;
        this.i = armfVar6;
    }

    @Override // defpackage.lqv
    public final /* synthetic */ int a() {
        return lgb.s();
    }

    @Override // defpackage.lqv
    public final akul b() {
        aazf aazfVar = (aazf) this.d.b();
        if (((pcl) aazfVar.g.b()).a()) {
            return ((whs) aazfVar.h.b()).b().h(new aald(aazfVar, 9), aazfVar.f);
        }
        return aktp.ai(new aaze(aazfVar, 0), aazfVar.e);
    }

    @Override // defpackage.lqv
    public final void c(lqx lqxVar, ViewGroup viewGroup) {
        this.c = lqxVar;
    }

    @Override // defpackage.lqv
    public final void d() {
        aazg aazgVar = this.a;
        if (aazgVar != null && aazgVar.aw()) {
            aazgVar.d();
        }
        this.a = null;
        this.c.b();
    }

    public final void e() {
        LottieAnimationView lottieAnimationView = this.k;
        if (lottieAnimationView != null) {
            lottieAnimationView.setVisibility(8);
        }
    }

    @Override // defpackage.lqv
    public final boolean f(Context context, ViewGroup viewGroup, boolean z) {
        String str;
        if (((pcl) this.h.b()).a()) {
            str = (String) ((Optional) ((aazf) this.d.b()).i.get()).orElse(null);
            if (str == null) {
                alvw d = b.d();
                d.X(alwp.a, "BugleRcs");
                ((alvg) ((alvg) d).h("com/google/android/apps/messaging/ui/rcs/setup/carriertos/CarrierTosPopupPresenter", "show", 122, "CarrierTosPopupPresenter.java")).q("show: simId is empty");
                return false;
            }
        } else {
            str = "";
        }
        if (this.a == null) {
            aazg aazgVar = (aazg) this.j.e("carrierTosBottomSheetFragmentTag");
            this.a = aazgVar;
            if (aazgVar == null) {
                aazg aazgVar2 = new aazg();
                apxh.e(aazgVar2);
                aklt.b(aazgVar2, str);
                this.a = aazgVar2;
            }
        }
        if (!this.a.aw()) {
            this.a.q(this.j, "carrierTosBottomSheetFragmentTag");
            this.a.E().l = this;
            aazg aazgVar3 = this.a;
            aazgVar3.getClass();
            k(aazgVar3);
            ((mbl) this.e.b()).c("Bugle.FastTrack.ConversationList.Prompt.Seen");
            if (((pcl) this.h.b()).a()) {
                ((wyp) this.i.b()).o(str, amlw.RCS_PROVISIONING_PROMPT_SEEN);
            } else {
                ((mho) this.f.b()).S(amlw.RCS_PROVISIONING_PROMPT_SEEN, amlx.PROVISIONING_UI_TYPE_CARRIER_TOS_PROMO);
            }
            ((mho) this.f.b()).aR(11);
            return true;
        }
        this.a.E().l = this;
        aazg aazgVar4 = this.a;
        aazgVar4.getClass();
        k(aazgVar4);
        return true;
    }

    @Override // defpackage.lqv
    public final int h() {
        return 7;
    }

    public final void j() {
        LottieAnimationView lottieAnimationView = this.k;
        if (lottieAnimationView != null) {
            lottieAnimationView.setVisibility(0);
        }
    }

    final void k(cg cgVar) {
        acun k;
        Spanned fromHtml;
        Spanned fromHtml2;
        View L = cgVar.L();
        this.k = (LottieAnimationView) L.findViewById(R.id.carrier_tos_popup_animation);
        if (cgVar.z().getConfiguration().orientation == 2) {
            e();
        } else {
            j();
        }
        if (!((pcl) this.h.b()).a() && (k = ((vqu) this.g.b()).k()) != null) {
            TextView textView = (TextView) L.findViewById(R.id.carrier_tos_popup_title);
            fromHtml = Html.fromHtml(k.d, 63);
            textView.setText(fromHtml);
            TextView textView2 = (TextView) L.findViewById(R.id.carrier_tos_popup_text_paragraph);
            fromHtml2 = Html.fromHtml(k.c, 63);
            textView2.setText(fromHtml2);
            ahnz.s(textView2);
            ahnz.t(textView2);
        }
    }

    @Override // defpackage.lqv
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.lqv
    public final /* synthetic */ void g(Activity activity, int i) {
    }
}
