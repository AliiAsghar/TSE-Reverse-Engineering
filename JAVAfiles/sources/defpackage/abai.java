package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.rcs.setup.success.RcsSuccessMultiSimPopup;
import com.google.android.apps.messaging.ui.rcs.setup.success.RcsSuccessSingleSimPopup;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abai implements lqv {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/ui/rcs/setup/success/RcsSuccessPopupPresenter");
    public final armf b;
    public final armf c;
    public final armf d;
    public final armf e;
    public final armf f;
    public final armf g;
    public final armf h;
    public final armf i;
    public aaxz j;
    public CharSequence k;
    public CharSequence l;
    public CharSequence m;
    public CharSequence n;
    public whk o;
    private final anen q;
    private final anen r;
    private final armf s;
    private final armf t;
    private final armf u;
    private final armf v;
    private final armf w;
    private lqx x;
    private xvy y;
    private xvy z;
    private boolean A = false;
    public Optional p = Optional.empty();

    public abai(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, anen anenVar, anen anenVar2, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11, armf armfVar12, armf armfVar13) {
        this.b = armfVar;
        this.c = armfVar2;
        this.d = armfVar3;
        this.e = armfVar4;
        this.f = armfVar5;
        this.q = anenVar;
        this.r = anenVar2;
        this.g = armfVar6;
        this.s = armfVar7;
        this.t = armfVar8;
        this.u = armfVar9;
        this.h = armfVar10;
        this.v = armfVar11;
        this.i = armfVar12;
        this.w = armfVar13;
    }

    private final CharSequence n(Context context, String str) {
        int i;
        int i2;
        Resources resources = context.getResources();
        if (true != m(str)) {
            i = R.string.rcs_success_popup_setting;
        } else {
            i = R.string.rcs_success_popup_setting_rcs_default_on_oob;
        }
        String string = resources.getString(i);
        Resources resources2 = context.getResources();
        if (true != m(str)) {
            i2 = R.string.rcs_success_popup_body_v2;
        } else {
            i2 = R.string.rcs_success_popup_body_rcs_default_on_oob;
        }
        String string2 = resources2.getString(i2, string);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string2);
        int lastIndexOf = string2.lastIndexOf(string);
        spannableStringBuilder.setSpan(new abah(this, context), lastIndexOf, string.length() + lastIndexOf, 17);
        return spannableStringBuilder;
    }

    @Override // defpackage.lqv
    public final /* synthetic */ int a() {
        return lgb.s();
    }

    @Override // defpackage.lqv
    public final akul b() {
        return ((wwn) this.t.b()).d().h(new aald(this, 10), this.r);
    }

    @Override // defpackage.lqv
    public final void c(lqx lqxVar, ViewGroup viewGroup) {
        this.x = lqxVar;
        this.y = new xvy(viewGroup, R.id.conversation_list_rcs_success_single_sim_popup_stub, R.id.conversation_list_rcs_success_single_sim_popup);
        this.z = new xvy(viewGroup, R.id.conversation_list_rcs_success_multi_sim_popup_stub, R.id.conversation_list_rcs_success_multi_sim_popup);
        if (!((ofb) this.w.b()).a() && !aczv.G()) {
            return;
        }
        this.j = ((aaya) this.s.b()).a(amlx.PROVISIONING_UI_TYPE_RCS_SUCCESS, 5);
    }

    @Override // defpackage.lqv
    public final void d() {
        throw null;
    }

    public final void e(TextView textView) {
        ahnz.s(textView);
        ahnz.t(textView);
    }

    @Override // defpackage.lqv
    public final boolean f(Context context, ViewGroup viewGroup, boolean z) {
        int e = ((yjy) this.d.b()).e();
        byte[] bArr = null;
        wxb wxbVar = (wxb) this.p.orElse(null);
        if (wxbVar == null) {
            ((alvg) ((alvg) a.d()).h("com/google/android/apps/messaging/ui/rcs/setup/success/RcsSuccessPopupPresenter", "show", 234, "RcsSuccessPopupPresenter.java")).q("popupSimInfo is empty");
            return false;
        }
        if (e > 1) {
            xzb.c("BugleRcs", "prepareMultiSimPopup");
            wxb wxbVar2 = (wxb) this.p.orElse(null);
            if (wxbVar2 == null) {
                ((alvg) ((alvg) a.d()).h("com/google/android/apps/messaging/ui/rcs/setup/success/RcsSuccessPopupPresenter", "prepareMultiSimPopup", 390, "RcsSuccessPopupPresenter.java")).q("popupSimInfo is empty");
            } else {
                String str = wxbVar2.u;
                this.l = str;
                if (TextUtils.isEmpty(str)) {
                    ((alvg) ((alvg) a.d()).h("com/google/android/apps/messaging/ui/rcs/setup/success/RcsSuccessPopupPresenter", "prepareMultiSimPopup", 395, "RcsSuccessPopupPresenter.java")).q("preferredSubscriptionName is empty");
                } else {
                    this.k = context.getString(R.string.rcs_success_popup_sim_slot_identifier, Integer.valueOf(wxbVar2.e + 1));
                    this.m = (CharSequence) ((Optional) ((adji) this.v.b()).d(new adiw(wxbVar2.c)).map(new aaky(this, 14)).orElse(((yjy) this.d.b()).h(wxbVar2.d).j(true))).map(new yuq(this, context, 8)).orElse(context.getString(R.string.rcs_success_popup_title_single_sim_v2));
                    this.n = n(context, wxbVar2.c);
                    this.A = true;
                }
            }
            ((alvg) ((alvg) a.d()).h("com/google/android/apps/messaging/ui/rcs/setup/success/RcsSuccessPopupPresenter", "show", 241, "RcsSuccessPopupPresenter.java")).q("show: returning false, multiSimEnabled but failed to prepare multi sim popup");
            return false;
        }
        this.A = false;
        String str2 = wxbVar.c;
        xzb.c("BugleRcs", "prepareSingleSimPopup");
        this.m = context.getString(R.string.rcs_success_popup_title_single_sim_v2);
        this.n = n(context, str2);
        aktp.ah(new aanh(this, wxbVar, 10, bArr), this.q).k(qiu.b(), andi.a);
        if (m(wxbVar.c)) {
            aaxz aaxzVar = this.j;
            aaxzVar.getClass();
            qiu.h(aktp.ah(new aaxu(aaxzVar, 6), this.r));
        }
        if (this.A) {
            xzb.c("BugleRcs", "show: Show MultiSim rcs success popup");
            RcsSuccessMultiSimPopup rcsSuccessMultiSimPopup = (RcsSuccessMultiSimPopup) this.z.b();
            rcsSuccessMultiSimPopup.b = this;
            rcsSuccessMultiSimPopup.c();
            return true;
        }
        xzb.c("BugleRcs", "show: Show SingleSim rcs success popup");
        RcsSuccessSingleSimPopup rcsSuccessSingleSimPopup = (RcsSuccessSingleSimPopup) this.y.b();
        rcsSuccessSingleSimPopup.b = this;
        rcsSuccessSingleSimPopup.c();
        return true;
    }

    @Override // defpackage.lqv
    public final int h() {
        return 4;
    }

    @Override // defpackage.lqv
    public final void i() {
        xzb.c("BugleRcs", "provision notification: notified. user ignored.");
        ((wyp) this.h.b()).n(false, amlw.RCS_PROVISIONING_SUCCESS_POPUP_IGNORED, ((wxb) this.p.orElseThrow(new zhh(14))).c);
        j();
    }

    public final void j() {
        xzb.c("BugleRcs", "provision notification: notified. user clicked.");
        String str = ((wxb) this.p.orElseThrow(new zhh(13))).c;
        ((alvg) ((alvg) a.d()).h("com/google/android/apps/messaging/ui/rcs/setup/success/RcsSuccessPopupPresenter", "onDismissClicked", 319, "RcsSuccessPopupPresenter.java")).t("onDismissClicked: dismissed popup for simId: %s", advq.SIM_ID.c(str));
        aktp.ah(new aanh(this, str, 9), this.r).k(qiu.b(), andi.a);
        ((wyp) this.h.b()).n(false, amlw.RCS_PROVISIONING_SUCCESS_POPUP_DISMISSED, str);
        if (aczv.T()) {
            ((whj) this.f.b()).d.j(new whe(1)).h(new whe(2), andi.a).k(qiu.b(), andi.a);
        }
        this.y.e();
        this.z.e();
        this.x.b();
    }

    public final boolean k(String str) {
        if (((ofb) this.w.b()).a() && aczv.x() && aczv.X()) {
            return ((vau) this.u.b()).c(str).s;
        }
        return aczv.G();
    }

    public final boolean l(String str) {
        if (aczv.x() && aczv.X()) {
            return ((vau) this.u.b()).c(str).n;
        }
        return actx.f();
    }

    public final boolean m(String str) {
        whk whkVar;
        if (k(str) && (whkVar = this.o) != null && whkVar.equals(whk.OOB_CONSENT)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.lqv
    public final /* synthetic */ void g(Activity activity, int i) {
    }
}
