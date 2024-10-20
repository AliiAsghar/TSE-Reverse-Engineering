package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.messaging.R;
import j$.util.Collection;
import j$.util.Optional;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaiz implements lqv {
    private static final xze e = xze.g("Bugle", "GoogleTosPopupPresenter");
    aaiv a;
    public final armf b;
    public TextView c;
    public TextView d;
    private lqx f;
    private alhr g;
    private final armf h;
    private final armf i;
    private final armf j;
    private final da k;
    private final armf l;
    private final armf m;
    private final AtomicReference n = new AtomicReference(Optional.empty());
    private LottieAnimationView o;
    private final znj p;
    private final zfh q;

    public aaiz(cg cgVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, znj znjVar, zfh zfhVar, armf armfVar5, armf armfVar6) {
        this.k = cgVar.G();
        this.i = armfVar;
        this.h = armfVar2;
        this.j = armfVar3;
        this.b = armfVar4;
        this.p = znjVar;
        this.q = zfhVar;
        this.l = armfVar5;
        this.m = armfVar6;
    }

    @Override // defpackage.lqv
    public final /* synthetic */ int a() {
        return lgb.s();
    }

    @Override // defpackage.lqv
    public final akul b() {
        akul ag;
        akul h;
        wft wftVar = (wft) this.l.b();
        final xvs xvsVar = wftVar.e;
        int i = 15;
        if (aczv.x() && aczv.X()) {
            h = aktp.ai(new Callable() { // from class: xvr
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    if (xvs.c()) {
                        alvw c = xvs.a.c();
                        c.X(alwp.a, "Bugle");
                        ((alvg) ((alvg) c).h("com/google/android/apps/messaging/shared/ui/reprompting/UpsellLogic", "decideGoogleTosPromptMultiSim", 91, "UpsellLogic.java")).q("Show Google Tos due to logic override");
                        return Optional.of(wfp.BOTTOMSHEET);
                    }
                    xvs xvsVar2 = xvs.this;
                    if (((ansy) ((plx) xvsVar2.h).a.b()).e("bugle.check_show_google_tos_in_upsell_logic") && !Collection.EL.stream(xvsVar2.d.n()).anyMatch(new xdm(xvsVar2, 11))) {
                        alvw c2 = xvs.a.c();
                        c2.X(alwp.a, "Bugle");
                        ((alvg) ((alvg) c2).h("com/google/android/apps/messaging/shared/ui/reprompting/UpsellLogic", "decideGoogleTosPromptMultiSim", 96, "UpsellLogic.java")).q("Do not show Google Tos as showGoogleTos is false");
                        return Optional.empty();
                    }
                    if (Collection.EL.stream(xvsVar2.d.n()).anyMatch(new xdm(xvsVar2, 12))) {
                        alvw c3 = xvs.a.c();
                        c3.X(alwp.a, "Bugle");
                        ((alvg) ((alvg) c3).h("com/google/android/apps/messaging/shared/ui/reprompting/UpsellLogic", "decideGoogleTosPromptMultiSim", 101, "UpsellLogic.java")).q("ToS prompting is disabled.");
                        return Optional.empty();
                    }
                    if (!xvsVar2.d()) {
                        alvw c4 = xvs.a.c();
                        c4.X(alwp.a, "Bugle");
                        ((alvg) ((alvg) c4).h("com/google/android/apps/messaging/shared/ui/reprompting/UpsellLogic", "decideGoogleTosPromptMultiSim", 106, "UpsellLogic.java")).q("Not ready to show Google Tos");
                        return Optional.empty();
                    }
                    Iterator it = xvsVar2.d.n().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (xvsVar2.i.B(adom.n((adiv) it.next()).a)) {
                            if (xvsVar2.b.q("should_show_rcs_default_on_prompt", false)) {
                                alvw c5 = xvs.a.c();
                                c5.X(alwp.a, "Bugle");
                                ((alvg) ((alvg) c5).h("com/google/android/apps/messaging/shared/ui/reprompting/UpsellLogic", "decideGoogleTosPromptMultiSim", 111, "UpsellLogic.java")).q("Do not show Google Tos as Legal FYI is requested");
                                return Optional.empty();
                            }
                        }
                    }
                    if (xvsVar2.b()) {
                        alvw c6 = xvs.a.c();
                        c6.X(alwp.a, "Bugle");
                        ((alvg) ((alvg) c6).h("com/google/android/apps/messaging/shared/ui/reprompting/UpsellLogic", "decideGoogleTosPromptMultiSim", 116, "UpsellLogic.java")).q("Show Google Tos as Constellation requested");
                        return Optional.of(wfp.BOTTOMSHEET);
                    }
                    if (xvsVar2.a()) {
                        alvw c7 = xvs.a.c();
                        c7.X(alwp.a, "Bugle");
                        ((alvg) ((alvg) c7).h("com/google/android/apps/messaging/shared/ui/reprompting/UpsellLogic", "decideGoogleTosPromptMultiSim", 121, "UpsellLogic.java")).q("Don't Show Google Tos as user already accepted");
                        return Optional.empty();
                    }
                    return Optional.of(wfp.BOTTOMSHEET);
                }
            }, xvsVar.f).h(new xqp(i), xvsVar.g);
        } else {
            if (xvs.c()) {
                alvw c = xvs.a.c();
                c.X(alwp.a, "Bugle");
                ((alvg) ((alvg) c).h("com/google/android/apps/messaging/shared/ui/reprompting/UpsellLogic", "decideGoogleTosPrompt", 132, "UpsellLogic.java")).q("Show Google Tos due to logic override");
                ag = aktp.ag(Optional.of(wfp.BOTTOMSHEET));
            } else if (xvs.e()) {
                alvw c2 = xvs.a.c();
                c2.X(alwp.a, "Bugle");
                ((alvg) ((alvg) c2).h("com/google/android/apps/messaging/shared/ui/reprompting/UpsellLogic", "decideGoogleTosPrompt", 137, "UpsellLogic.java")).q("ToS prompting is disabled.");
                ag = aktp.ag(Optional.empty());
            } else if (!xvsVar.d()) {
                alvw c3 = xvs.a.c();
                c3.X(alwp.a, "Bugle");
                ((alvg) ((alvg) c3).h("com/google/android/apps/messaging/shared/ui/reprompting/UpsellLogic", "decideGoogleTosPrompt", 142, "UpsellLogic.java")).q("Not ready to show Google Tos");
                ag = aktp.ag(Optional.empty());
            } else {
                alvw c4 = xvs.a.c();
                c4.X(alwp.a, "Bugle");
                ((alvg) ((alvg) c4).h("com/google/android/apps/messaging/shared/ui/reprompting/UpsellLogic", "isLegalFyiFlowRequested", 189, "UpsellLogic.java")).q("Using enableLegalFyiFlow flag from phenotype instead.");
                if (aczv.D() && xvsVar.b.q("should_show_rcs_default_on_prompt", false)) {
                    alvw c5 = xvs.a.c();
                    c5.X(alwp.a, "Bugle");
                    ((alvg) ((alvg) c5).h("com/google/android/apps/messaging/shared/ui/reprompting/UpsellLogic", "decideGoogleTosPrompt", 147, "UpsellLogic.java")).q("Do not show Google Tos as Legal FYI is requested");
                    ag = aktp.ag(Optional.empty());
                } else if (xvsVar.b()) {
                    alvw c6 = xvs.a.c();
                    c6.X(alwp.a, "Bugle");
                    ((alvg) ((alvg) c6).h("com/google/android/apps/messaging/shared/ui/reprompting/UpsellLogic", "decideGoogleTosPrompt", 152, "UpsellLogic.java")).q("Show Google Tos as Constellation requested");
                    ag = aktp.ag(Optional.of(wfp.BOTTOMSHEET));
                } else if (xvsVar.a()) {
                    alvw c7 = xvs.a.c();
                    c7.X(alwp.a, "Bugle");
                    ((alvg) ((alvg) c7).h("com/google/android/apps/messaging/shared/ui/reprompting/UpsellLogic", "decideGoogleTosPrompt", 157, "UpsellLogic.java")).q("Don't Show Google Tos as user already accepted");
                    ag = aktp.ag(Optional.empty());
                } else {
                    ag = aktp.ag(Optional.of(wfp.BOTTOMSHEET));
                }
            }
            h = ag.h(new xqp(i), xvsVar.c);
        }
        akul akulVar = h;
        akul c8 = wftVar.c();
        xvu xvuVar = wftVar.d;
        xvuVar.getClass();
        akul h2 = aktp.ai(new vib(xvuVar, 18), wftVar.f).h(new wax(14), wftVar.g);
        akul d = wftVar.c.d();
        return aktp.ap(akulVar, c8, h2, d).h(new kwr(wftVar, akulVar, c8, h2, d, 5), wftVar.g).h(new wax(i), wftVar.f);
    }

    @Override // defpackage.lqv
    public final void c(lqx lqxVar, ViewGroup viewGroup) {
        this.f = lqxVar;
        this.g = albo.D(new ynw(this, 5));
    }

    @Override // defpackage.lqv
    public final void d() {
        aaiv aaivVar = this.a;
        if (aaivVar != null && aaivVar.aw()) {
            aaivVar.d();
        }
        this.a = null;
        this.f.b();
    }

    public final void e() {
        LottieAnimationView lottieAnimationView = this.o;
        if (lottieAnimationView != null) {
            lottieAnimationView.setVisibility(8);
        }
    }

    @Override // defpackage.lqv
    public final boolean f(Context context, ViewGroup viewGroup, boolean z) {
        if (!((Boolean) aaiu.b.e()).booleanValue()) {
            ((yyt) this.m.b()).P(4);
            if (this.a == null) {
                aaiv aaivVar = (aaiv) this.k.e("bottomSheetFragmentTag");
                this.a = aaivVar;
                if (aaivVar == null) {
                    this.a = new aaiv();
                }
            }
            if (!this.a.aw()) {
                this.a.q(this.k, "bottomSheetFragmentTag");
                this.a.E().a(this);
                aaiv aaivVar2 = this.a;
                aaivVar2.getClass();
                n(aaivVar2);
                ((mbl) this.h.b()).c("Bugle.FastTrack.ConversationList.Prompt.Seen");
                ((mho) this.i.b()).S(amlw.RCS_PROVISIONING_PROMPT_SEEN, amlx.PROVISIONING_UI_TYPE_GOOGLE_TOS_PROMO_WITH_COST);
                ((mho) this.i.b()).aR(11);
                return true;
            }
            this.a.E().a(this);
            aaiv aaivVar3 = this.a;
            aaivVar3.getClass();
            n(aaivVar3);
            return true;
        }
        e.l("ToS prompt counterfactual is enabled.");
        ((mho) this.i.b()).S(amlw.RCS_PROVISIONING_PROMPT_COUNTERFACTUAL_APPLIED, amlx.PROVISIONING_UI_TYPE_GOOGLE_TOS_PROMO_WITH_COST);
        return false;
    }

    @Override // defpackage.lqv
    public final void g(Activity activity, int i) {
        alhr alhrVar = this.g;
        if (alhrVar != null) {
            ((aaxz) alhrVar.get()).s(activity, i);
        }
    }

    @Override // defpackage.lqv
    public final int h() {
        return 2;
    }

    public final void j(Activity activity) {
        ((yyt) this.m.b()).P(6);
        ((yyt) this.m.b()).O(amlw.RCS_PROVISIONING_PROMPT_DECLINED, (Optional) this.n.get());
        this.p.c(amlx.PROVISIONING_UI_TYPE_GOOGLE_TOS_PROMO_WITH_COST, "Bugle.FastTrack.ConversationList.Prompt.Declined");
        if (activity == null) {
            return;
        }
        ((aaxz) this.g.get()).p(amww.DECLINED_GOOGLE_TOS);
        d();
        String string = activity.getResources().getString(R.string.fast_track_popup_declined_snack_bar_text_v2);
        int i = alog.d;
        alog alogVar = alsx.a;
        lga.E(activity, string);
    }

    public final void k(Activity activity) {
        ((yyt) this.m.b()).P(5);
        ((yyt) this.m.b()).O(amlw.RCS_PROVISIONING_PROMPT_ACCEPTED, (Optional) this.n.get());
        this.p.b(amlx.PROVISIONING_UI_TYPE_GOOGLE_TOS_PROMO_WITH_COST, "Bugle.FastTrack.ConversationList.Prompt.Accepted");
        if (activity == null) {
            return;
        }
        ((aaxz) this.g.get()).q(activity, false);
        d();
    }

    public final void l(Optional optional) {
        this.n.set(optional);
    }

    public final void m() {
        LottieAnimationView lottieAnimationView = this.o;
        if (lottieAnimationView != null) {
            lottieAnimationView.setVisibility(0);
        }
    }

    final void n(cg cgVar) {
        String string;
        View L = cgVar.L();
        this.c = (TextView) L.findViewById(R.id.google_tos_popup_multisim_text);
        int i = 8;
        if (((yjy) this.j.b()).a() >= 2) {
            this.q.q(cgVar.x(), this.c);
            this.c.setOnClickListener(new zoz(this, cgVar, i));
        } else {
            this.c.setVisibility(8);
        }
        this.o = (LottieAnimationView) L.findViewById(R.id.google_tos_popup_animation);
        if (cgVar.z().getConfiguration().orientation == 2) {
            e();
        } else {
            m();
        }
        TextView textView = (TextView) L.findViewById(R.id.google_tos_popup_text_paragraph);
        this.d = textView;
        Context x = cgVar.x();
        Resources resources = x.getResources();
        String string2 = resources.getString(R.string.rcs_chats_terms_of_service);
        String string3 = resources.getString(R.string.rcs_chats);
        String string4 = resources.getString(R.string.terms_summary);
        if (((yjy) this.j.b()).a() >= 2) {
            if (((Boolean) aaiu.a.e()).booleanValue()) {
                string = resources.getString(R.string.google_tos_legal_text_multi_sim_with_terms_summary_v2, string3, string2, string4);
            } else {
                string = resources.getString(R.string.google_tos_legal_text_multi_sim_v2, string3, string2);
            }
        } else if (((Boolean) aaiu.a.e()).booleanValue()) {
            string = resources.getString(R.string.google_tos_legal_text_single_sim_with_terms_summary_v2, string3, string2, string4);
        } else {
            string = resources.getString(R.string.google_tos_legal_text_single_sim_v2, string3, string2);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        String string5 = x.getString(R.string.rcs_chats);
        int indexOf = string.indexOf(string5);
        if (indexOf != -1) {
            spannableStringBuilder.setSpan(new aaiy(this, x), indexOf, string5.length() + indexOf, 17);
        }
        if (((Boolean) aaiu.a.e()).booleanValue()) {
            aaxz aaxzVar = (aaxz) this.g.get();
            String string6 = x.getResources().getString(R.string.terms_summary);
            aaxzVar.d(x, spannableStringBuilder);
            aaxzVar.c(x, spannableStringBuilder);
            int indexOf2 = TextUtils.indexOf(spannableStringBuilder, string6);
            if (indexOf2 != -1) {
                spannableStringBuilder.setSpan(new aksn(aaxzVar.l, "ProvisioningHelper#addTermsSummarySpan", new aaxy(aaxzVar)), indexOf2, string6.length() + indexOf2, 17);
            }
        } else {
            aaxz aaxzVar2 = (aaxz) this.g.get();
            aaxzVar2.d(x, spannableStringBuilder);
            aaxzVar2.c(x, spannableStringBuilder);
        }
        textView.setText(spannableStringBuilder);
        TextView textView2 = this.d;
        ahnz.s(textView2);
        ahnz.t(textView2);
        ((Button) L.findViewById(R.id.conversation_list_google_tos_popup_positive_button)).setOnClickListener(new zoz(this, cgVar, 9));
        ((TextView) L.findViewById(R.id.conversation_list_google_tos_popup_negative_button)).setOnClickListener(new zoz(this, cgVar, 10));
    }

    @Override // defpackage.lqv
    public final /* synthetic */ void i() {
    }
}
