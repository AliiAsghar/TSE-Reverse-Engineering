package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.rcs.setup.RcsPromoView;
import com.google.android.apps.messaging.ui.rcs.setup.auto.RcsPromoActivity;
import com.google.android.apps.messaging.ui.rcs.setup.manual.CountryCodePickerActivity;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class aaxc implements View.OnClickListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ aaxc(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 1;
        switch (this.b) {
            case 0:
                ((aaxd) this.a).f();
                return;
            case 1:
                ((aaxd) this.a).i();
                return;
            case 2:
                ((aaxd) this.a).i();
                return;
            case 3:
                ((aaxd) this.a).i();
                return;
            case 4:
                ((aaxd) this.a).f();
                return;
            case 5:
                ((aaxd) this.a).f();
                return;
            case 6:
                aaxd aaxdVar = (aaxd) this.a;
                aaxa aaxaVar = aaxdVar.A;
                aaxdVar.H.i(aaxaVar.x(), aaxaVar.L());
                return;
            case 7:
                aayi aayiVar = (aayi) this.a;
                aayiVar.b.e();
                lqv lqvVar = aayiVar.f;
                if (lqvVar != null) {
                    lqvVar.d();
                    return;
                }
                return;
            case 8:
                RcsPromoView rcsPromoView = (RcsPromoView) this.a;
                aayo aayoVar = rcsPromoView.h;
                if (aayoVar != null) {
                    Context context = rcsPromoView.getContext();
                    xzb.j("Bugle", "RcsPromo: GET STARTED");
                    ((mho) aayoVar.a.b()).S(amlw.RCS_PROVISIONING_PROMPT_ACCEPTED, amlx.PROVISIONING_UI_TYPE_RCS_PROMO);
                    ykw ykwVar = (ykw) aayoVar.e.b();
                    ykwVar.j("rcs_tos_state", 1);
                    aayoVar.h.i(amww.RCS_PROMO_POPUP_PRESENTER);
                    aayoVar.d();
                    ((lzv) aayoVar.c.b()).V(context);
                    ykwVar.h("should_show_rcs_promo", false);
                    return;
                }
                return;
            case 9:
                aayo aayoVar2 = ((RcsPromoView) this.a).h;
                if (aayoVar2 != null) {
                    xzb.j("Bugle", "RcsPromo: NO THANKS");
                    aayoVar2.d();
                    qjb.a(new aaxu(aayoVar2, 4), aayoVar2.g);
                    return;
                }
                return;
            case 10:
                aazb aazbVar = (aazb) this.a;
                aazbVar.a.S(amlw.RCS_PROVISIONING_RCS_PROMO_TERM_AND_CONDITION_CLICKED, amlx.PROVISIONING_UI_TYPE_RCS_PROMO);
                ((RcsPromoActivity) aazbVar.fe()).E().b();
                return;
            case 11:
                xzb.j("Bugle", "RcsPromoFragment: NOT NOW");
                aazb aazbVar2 = (aazb) this.a;
                aazbVar2.a.S(amlw.RCS_PROVISIONING_RCS_PROMO_DECLINED, amlx.PROVISIONING_UI_TYPE_RCS_PROMO);
                aazbVar2.fe().finish();
                return;
            case 12:
                xzb.j("Bugle", "RcsPromoFragment: NEXT");
                aazb aazbVar3 = (aazb) this.a;
                aazbVar3.a.S(amlw.RCS_PROVISIONING_RCS_PROMO_ACCEPTED, amlx.PROVISIONING_UI_TYPE_RCS_PROMO);
                RcsPromoActivity rcsPromoActivity = (RcsPromoActivity) aazbVar3.fe();
                xzb.j("Bugle", "RcsPromoFragment: no need to request battery optimization exception");
                rcsPromoActivity.E().c();
                return;
            case 13:
                xzb.j("Bugle", "RcsPromoFragment: LEARN MORE");
                aazb aazbVar4 = (aazb) this.a;
                aazbVar4.a.S(amlw.RCS_PROVISIONING_RCS_PROMO_TERM_AND_CONDITION_CLICKED, amlx.PROVISIONING_UI_TYPE_RCS_PROMO);
                aazbVar4.b.c("Bugle.Rcs.Onboarding.Boew.LearnMoreLink.Counts");
                aazbVar4.d.y(aazbVar4.fe(), "https://support.google.com/nexus?p=enhanced_features");
                return;
            case 14:
                LayoutInflater.Factory fe = ((aazd) this.a).d.fe();
                if (fe == null) {
                    return;
                }
                try {
                    aaza aazaVar = (aaza) ((akkh) fe).E();
                    xzb.n("BugleRcs", "RcsPromoActivity: onProvisioningTimeoutAck");
                    aazaVar.c.x();
                    aazaVar.a.finish();
                    return;
                } catch (ClassCastException unused) {
                    throw new ClassCastException(String.valueOf(fe.getClass().getName()).concat(" must implement OnProvisioningListener"));
                }
            case 15:
                ((aazh) this.a).b();
                return;
            case 16:
                ((aazh) this.a).b();
                return;
            case 17:
                ((aazh) this.a).a();
                return;
            case 18:
                ((aazh) this.a).a();
                return;
            case 19:
                ((CountryCodePickerActivity) ((aazm) this.a).a).c().d();
                return;
            default:
                Object obj = this.a;
                if (aczv.S()) {
                    ((aaxz) ((aazt) obj).u.get()).g();
                }
                aazt aaztVar = (aazt) obj;
                aaztVar.s(9);
                aaztVar.k(amlw.RCS_PROVISIONING_MANUAL_MSISDN_ENTRY_REJECTED);
                aaztVar.i(0);
                ahjj ahjjVar = aaztVar.A;
                if (ahjjVar != null) {
                    aazr aazrVar = aaztVar.d;
                    Object obj2 = ahjjVar.a;
                    cj F = aazrVar.F();
                    ((abaa) obj2).e();
                    lga.D(F, F.getString(R.string.phone_number_ui_dismissed_snackbar_text_v2), F.getString(R.string.phone_number_ui_dismissed_snackbar_action_text), new abbh(ahjjVar.a, F, i));
                }
                ((wjr) aaztVar.k.b()).l(aaztVar.e, Duration.ZERO, 2, amww.PHONE_NUMBER_INPUT_BOTTOM_SHEET_CANCEL_BUTTON);
                return;
        }
    }
}
