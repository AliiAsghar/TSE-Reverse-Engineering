package defpackage;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaxz implements aayl {
    public static final utz a = uuh.h(uuh.b, "rcs_help_center_link_pattern", "https://support.google.com/messages/answer/7189714?hl=%1$s");
    public static final utz b = uuh.h(uuh.b, "jibe_regional_term_of_service_pattern", "https://jibe.google.com/intl/%1s_%2s/policies/terms/");
    public static final xze c = xze.g("Bugle", "ProvisioningHelper");
    public final Context d;
    public final mbl e;
    public final ykw f;
    public final amlx g;
    public final apwt h;
    public final yfu i;
    public final wjr j;
    public final armf k;
    public final aksr l;
    public final aneo m;
    public final armf n;
    public final armf o;
    public final armf p;
    public final armf q;
    public final int r;
    private final ylo s;
    private final xnv t;
    private final abrd u;
    private final adih v;

    public aaxz(Context context, ykw ykwVar, apwt apwtVar, mbl mblVar, yfu yfuVar, ylo yloVar, zap zapVar, wjr wjrVar, adih adihVar, xnv xnvVar, armf armfVar, aksr aksrVar, aneo aneoVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, amlx amlxVar, int i) {
        this.d = context;
        this.e = mblVar;
        this.u = zapVar.d();
        this.r = i;
        this.f = ykwVar;
        this.g = amlxVar;
        this.h = apwtVar;
        this.i = yfuVar;
        this.s = yloVar;
        this.j = wjrVar;
        this.v = adihVar;
        this.t = xnvVar;
        this.k = armfVar;
        this.n = armfVar2;
        this.o = armfVar3;
        this.p = armfVar4;
        this.q = armfVar5;
        this.l = aksrVar;
        this.m = aneoVar;
    }

    public static String b(Locale locale) {
        String country = locale.getCountry();
        if (Locale.US.getCountry().equals(country)) {
            return (String) utw.n.e();
        }
        return String.format(locale, (String) b.e(), locale.getLanguage(), country);
    }

    private final void t() {
        qiu.h(aktp.ah(new aaxu(this, 0), this.m));
    }

    public final whk a() {
        whk b2 = whk.b(((adnk) this.k.b()).e().h);
        if (b2 == null) {
            return whk.UNRECOGNIZED;
        }
        return b2;
    }

    public final void c(Context context, SpannableStringBuilder spannableStringBuilder) {
        String string = context.getResources().getString(R.string.fast_track_privacy_policy);
        int indexOf = TextUtils.indexOf(spannableStringBuilder, string);
        if (indexOf == -1) {
            return;
        }
        spannableStringBuilder.setSpan(new aksn(this.l, "ProvisioningHelper#addPrivacyPolicySpan", new aaxw(this)), indexOf, string.length() + indexOf, 17);
    }

    public final void d(Context context, SpannableStringBuilder spannableStringBuilder) {
        String string = context.getResources().getString(R.string.rcs_chats_terms_of_service);
        int indexOf = TextUtils.indexOf(spannableStringBuilder, string);
        if (indexOf == -1) {
            return;
        }
        spannableStringBuilder.setSpan(new aksn(this.l, "ProvisioningHelper#addTermsOfServiceSpan", new aaxv(this)), indexOf, string.length() + indexOf, 17);
    }

    public final void e() {
        xyo c2 = c.c();
        c2.H("Completing Legal FYI flow.");
        c2.q();
        aktp.ah(new aaxu(this, 2), this.m).k(qiu.b(), andi.a);
    }

    @Deprecated
    public final void f(boolean z) {
        byte[] bArr = null;
        if (aczv.D()) {
            qiu.h(aktp.ah(new hwm(this, z, 8, bArr), this.m));
        } else {
            qiu.h(aktp.ah(new hwm(this, z, 9, bArr), this.m));
        }
    }

    public final void g() {
        f(true);
    }

    @Override // defpackage.aayl
    public final void h(Activity activity) {
        String str;
        int i = this.r - 1;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        str = "Bugle.LegalFyi.ConversationList.BatteryOptimizationDialog.Accepted";
                    } else {
                        throw new IllegalStateException("There is no flow for BatteryOptimizationDialog from the PhoneNumberInput UI.");
                    }
                } else {
                    str = "Bugle.Welcome.BatteryOptimizationDialog.Accepted";
                }
            } else {
                str = "Bugle.FastTrack.Settings.BatteryOptimizationDialog.Accepted";
            }
        } else {
            str = "Bugle.FastTrack.ConversationList.BatteryOptimizationDialog.Accepted";
        }
        this.e.c(str);
        ((mho) this.h.b()).S(amlw.RCS_PROVISIONING_BOEW_ACCEPTED, this.g);
        o(activity, true, false);
    }

    @Override // defpackage.aayl
    public final void i() {
        String str;
        int i = this.r - 1;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        str = "Bugle.LegalFyi.ConversationList.DoubleCheckDialog.Declined";
                    } else {
                        throw new IllegalStateException("There is no flow for BatteryOptimizationDialog from the PhoneNumberInput UI.");
                    }
                } else {
                    str = "Bugle.Welcome.BatteryOptimizationDialog.Declined";
                }
            } else {
                str = "Bugle.FastTrack.Settings.DoubleCheckDialog.Declined";
            }
        } else {
            str = "Bugle.FastTrack.ConversationList.DoubleCheckDialog.Declined";
        }
        this.e.c(str);
        ((mho) this.h.b()).S(amlw.RCS_PROVISIONING_DOUBLE_CHECK_DIALOG_REJECTED, this.g);
    }

    @Override // defpackage.aayl
    public final void j() {
        String str;
        int i = this.r - 1;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        str = "Bugle.LegalFyi.ConversationList.BatteryOptimizationDialog.Declined";
                    } else {
                        throw new IllegalStateException("There is no double check exception UMA metric for the PhoneNumberInput UI.");
                    }
                } else {
                    throw new IllegalStateException("There is no double check exception UMA metric for the welcome flow.");
                }
            } else {
                str = "Bugle.FastTrack.Settings.BatteryOptimizationDialog.Declined";
            }
        } else {
            str = "Bugle.FastTrack.ConversationList.BatteryOptimizationDialog.Declined";
        }
        this.e.c(str);
        ((mho) this.h.b()).S(amlw.RCS_PROVISIONING_BOEW_REJECTED, this.g);
    }

    @Override // defpackage.aayl
    public final void k(Activity activity) {
        String str;
        activity.startActivityForResult(mka.c(activity), BasePaymentResult.ERROR_REQUEST_TIMEOUT);
        ((mho) this.h.b()).S(amlw.RCS_PROVISIONING_DOUBLE_CHECK_DIALOG_ACCEPTED, this.g);
        int i = this.r - 1;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        str = "Bugle.LegalFyi.ConversationList.DoubleCheckDialog.Accepted";
                    } else {
                        throw new IllegalStateException("There is no double check exception UMA metric for the PhoneNumberInput UI.");
                    }
                } else {
                    throw new IllegalStateException("There is no double check exception UMA metric for the welcome flow.");
                }
            } else {
                str = "Bugle.FastTrack.Settings.DoubleCheckDialog.Accepted";
            }
        } else {
            str = "Bugle.FastTrack.ConversationList.DoubleCheckDialog.Accepted";
        }
        this.e.c(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l() {
        String str;
        int i = this.r - 1;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("There is no ToS user action for the Legal FYI UI.");
                    }
                    throw new IllegalStateException("There is no 'Terms of Service' UMA metric for the PhoneNumberInput UI.");
                }
                str = "Bugle.Welcome.TermsOfService.Clicked";
            } else {
                str = "Bugle.FastTrack.Settings.Dialog.Term.Clicked";
            }
        } else {
            str = "Bugle.FastTrack.ConversationList.Prompt.Term.Clicked";
        }
        this.e.c(str);
        ((mho) this.h.b()).S(amlw.RCS_PROVISIONING_PROMPT_TERMS_AND_CONDITION_CLICKED, this.g);
    }

    public final void m(wfo wfoVar) {
        if (!aczv.F() && !aczv.K()) {
            return;
        }
        Locale b2 = yhx.b(this.d);
        aozy aozyVar = (aozy) ((adnk) this.k.b()).k().map(new aand(5)).orElse(whm.a.createBuilder());
        adih adihVar = this.v;
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        ((whm) aozyVar.b).c = wfoVar.a();
        String b3 = b(b2);
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        whm whmVar = (whm) aozyVar.b;
        b3.getClass();
        whmVar.d = b3;
        String locale = b2.toString();
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        whm whmVar2 = (whm) aozyVar.b;
        locale.getClass();
        whmVar2.e = locale;
        apct j = aotl.j(this.t.f());
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        whm whmVar3 = (whm) aozyVar.b;
        j.getClass();
        whmVar3.f = j;
        whmVar3.b |= 1;
        adihVar.l((whm) aozyVar.s());
    }

    public final void n(whk whkVar) {
        aozy builder;
        if (!aczv.J() && !((Boolean) aczv.s().a.au.a()).booleanValue()) {
            builder = whm.a.createBuilder();
        } else {
            builder = ((adnk) this.k.b()).e().toBuilder();
        }
        adnk adnkVar = (adnk) this.k.b();
        if (!builder.b.isMutable()) {
            builder.u();
        }
        ((whm) builder.b).h = whkVar.a();
        apct j = aotl.j(this.t.f());
        if (!builder.b.isMutable()) {
            builder.u();
        }
        whm whmVar = (whm) builder.b;
        j.getClass();
        whmVar.f = j;
        whmVar.b |= 1;
        adnkVar.w((whm) builder.s());
    }

    final void o(Activity activity, boolean z, boolean z2) {
        if (z2) {
            e();
            return;
        }
        t();
        ((mho) this.h.b()).aR(51);
        if (z) {
            lga.E(activity, activity.getResources().getString(R.string.fast_track_popup_accepted_snack_bar_text_v2));
        }
    }

    public final void p(amww amwwVar) {
        m(wfo.GOOGLE_TOS_DECLINED);
        if (aczv.F()) {
            this.j.k(false, amwwVar);
        }
    }

    public final void q(Activity activity, boolean z) {
        if (((vrn) this.s.c.a()).d() == amwt.AVAILABLE) {
            xyo c2 = c.c();
            c2.H("Migration, only send CONSENT_GRANTED");
            c2.q();
            if (z) {
                e();
                return;
            } else {
                t();
                return;
            }
        }
        o(activity, this.s.a(), z);
    }

    public final void r(Context context, SpannableStringBuilder spannableStringBuilder) {
        d(context, spannableStringBuilder);
        c(context, spannableStringBuilder);
        String bs = yyb.bs(context);
        int indexOf = TextUtils.indexOf(spannableStringBuilder, bs);
        if (indexOf == -1) {
            return;
        }
        spannableStringBuilder.setSpan(new aksn(this.l, "ProvisioningHelper#addLearnMoreSpan", new aaxx(this)), indexOf, bs.length() + indexOf, 17);
    }

    public final void s(Activity activity, int i) {
        this.u.a(activity, BasePaymentResult.ERROR_REQUEST_TIMEOUT, i, this);
    }
}
