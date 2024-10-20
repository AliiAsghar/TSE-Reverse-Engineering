package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.ims.provisioning.config.Configuration;
import j$.util.Objects;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adnk {
    public static final advp a = new advp("ProvisioningEngineDataRetriever");
    public final aduw b;
    public final Context c;
    public final anen d;
    public final armf e;
    public final armf f;
    private final adtn g;
    private final acoe h;
    private final vau i;

    public adnk(Context context, aduw aduwVar, adtn adtnVar, anen anenVar, acoe acoeVar, vau vauVar, armf armfVar, armf armfVar2) {
        this.c = context;
        this.b = aduwVar;
        this.g = adtnVar;
        this.d = anenVar;
        this.h = acoeVar;
        this.i = vauVar;
        this.e = armfVar;
        this.f = armfVar2;
    }

    private final boolean I(String str) {
        if (aczv.x() && aczv.X()) {
            if (this.i.c(str).x) {
                return true;
            }
            return false;
        }
        if (aczf.z()) {
            return true;
        }
        return false;
    }

    private static final boolean J(Configuration configuration) {
        if (configuration.m() && configuration.mConfigState == 1 && !configuration.mReconfigRequested) {
            return true;
        }
        return false;
    }

    public final boolean A(Context context) {
        try {
            if (this.b.n("rcs_tos_state", "bugle") != 2) {
                return false;
            }
            return true;
        } catch (adux e) {
            advr.j(e, a, "Error while retrieving Google Tos Consent in bugle storage, defaulting to local storage", new Object[0]);
            H(2);
            if (((acxv) this.e.b()).a()) {
                return ((aday) this.f.b()).v();
            }
            adnu.a();
            return adnu.g(context);
        }
    }

    public final boolean B() {
        boolean z;
        try {
            z = this.b.l("enable_rcs", true, "bugle");
        } catch (adux e) {
            advr.j(e, a, "Error while retrieving preferences RCS enabled/disabled from Bugle", new Object[0]);
            if (((acxv) this.e.b()).a()) {
                z = ((aday) this.f.b()).i().getBoolean("provisioning_engine_bugle_enabled_rcs_from_preference_key", false);
            } else {
                Context context = this.c;
                adnu.a();
                z = adnu.d(context).getBoolean("provisioning_engine_bugle_enabled_rcs_from_preference_key", false);
            }
        }
        advr.l(a, "Rcs is enabled from user settings: %s", Boolean.valueOf(z));
        return z;
    }

    public final boolean C() {
        boolean z;
        try {
            z = this.b.l("com.google.android.ims.provisioning.engine.bugle_default_sms_app", false, "BuglePhoneNumberUtils");
        } catch (adux e) {
            advr.j(e, a, "Error while retrieving if Bugle is default SMS app", new Object[0]);
            z = false;
        }
        advr.l(a, "Bugle is default SMS app: %s", Boolean.valueOf(z));
        return z;
    }

    public final boolean D(String str) {
        return J(f(str));
    }

    public final boolean E(String str) {
        Configuration f = f(str);
        if (!f.c().B && J(f)) {
            return true;
        }
        return false;
    }

    public final boolean F(String str) {
        Configuration f = f(str);
        if (f.c().B && J(f)) {
            return true;
        }
        return false;
    }

    @Deprecated
    public final void G() {
        if (actx.f()) {
            q(this.c, true);
            return;
        }
        Context context = this.c;
        try {
            this.b.j("rcs_tos_state", 1, "bugle");
        } catch (adux e) {
            advr.j(e, a, "Error while putting Carrier Consent in bugle storage, defaulting to local storage", new Object[0]);
            if (((acxv) this.e.b()).a()) {
                ((aday) this.f.b()).i().edit().putBoolean("provisioning_engine_carrier_consent_key", true).commit();
            } else {
                adnu.a();
                adnu.d(context).edit().putBoolean("provisioning_engine_carrier_consent_key", true).commit();
            }
            H(3);
        }
    }

    public final void H(int i) {
        if (((Boolean) aczf.o().a.aa.a()).booleanValue()) {
            this.h.d(this.c, i);
        }
    }

    public final int a(String str) {
        try {
            return this.b.n(aduw.h("upiAttemptsCount", str), "RcsApplicationData");
        } catch (adux e) {
            advr.j(e, a, "Error while retrieving UPI attempts count from bugle storage", new Object[0]);
            return -1;
        }
    }

    public final wgi b(String str) {
        try {
            return (wgi) this.b.o(aduw.h("phone_number_record_for_sim_", str), wgi.a);
        } catch (adux e) {
            advr.j(e, a, "Error while retrieving phone number record from bugle storage.", new Object[0]);
            return wgi.a;
        }
    }

    public final wgk c(String str) {
        try {
            return (wgk) this.b.o(aduw.h("provisioning_otp_sms", str), wgk.a);
        } catch (adux e) {
            advr.j(e, a, "Error while retrieving ProvisioningOtpSms from bugle storage", new Object[0]);
            return wgk.a;
        }
    }

    public final wgl d(String str) {
        try {
            return (wgl) this.b.o(aduw.h("provisioning_success_data_for_sim_", str), wgl.a);
        } catch (adux e) {
            advr.j(e, a, "Error while retrieving provisioningSuccessData from Bugle storage.", new Object[0]);
            return wgl.a;
        }
    }

    public final whm e() {
        try {
            return (whm) this.b.o("rcs_provisioning_rcs_default_on_configuration", whm.a);
        } catch (adux e) {
            advr.j(e, a, "Error while retrieving RcsProvisioningRcsDefaultOnConfiguration from Bugle storage.", new Object[0]);
            return whm.a;
        }
    }

    public final Configuration f(String str) {
        if (aczf.D()) {
            try {
                Configuration a2 = this.b.a(str);
                if (a2 != null) {
                    return a2;
                }
                advr.l(a, "No RCS Configuration was found in Bugle for simID: %s", advq.SIM_ID.c(str));
            } catch (adux e) {
                H(5);
                advr.j(e, a, "Error while retrieving RCS configuration from Bugle", new Object[0]);
            }
        } else {
            advr.p(a, "RCS Configuration storage in Bugle is disabled by p/h flag, using ProvisioningEngineStateCacheUtil.getProvisioningConfigurationForGivenSim()", new Object[0]);
        }
        if (((acxv) this.e.b()).a()) {
            return (Configuration) ((aday) this.f.b()).l(str).orElseGet(new addh(8));
        }
        return (Configuration) adnu.a().b(this.c, str).orElseGet(new addh(9));
    }

    public final Optional g() {
        try {
            String i = this.b.i("gmscoreIidToken", "", "RcsApplicationData");
            if (agkx.ae(i)) {
                return Optional.empty();
            }
            return Optional.of(i);
        } catch (adux e) {
            advr.j(e, a, "Error while retrieving GMSCore IID token from bugle storage", new Object[0]);
            return Optional.empty();
        }
    }

    public final Optional h(String str, apjo apjoVar) {
        if (I(str)) {
            try {
                wgi wgiVar = (wgi) this.b.o(aduw.e(str, apjoVar), wgi.a);
                if (Objects.equals(wgiVar, wgi.a)) {
                    return Optional.empty();
                }
                return Optional.of(wgiVar);
            } catch (adux e) {
                advr.j(e, a, "Error while retrieving phone number record from bugle storage.", new Object[0]);
            }
        }
        return Optional.empty();
    }

    public final Optional i(String str) {
        if (aczf.D()) {
            try {
                Configuration a2 = this.b.a(str);
                if (a2 != null) {
                    return Optional.of(a2);
                }
                advr.l(a, "No RCS Configuration was found in Bugle for simID: %s", advq.SIM_ID.c(str));
            } catch (adux e) {
                H(5);
                advr.t(e, a, "Error while retrieving RCS configuration from Bugle", new Object[0]);
            }
        } else {
            advr.l(a, "RCS Configuration storage in Bugle is disabled by p/h flag, using ProvisioningEngineStateCacheUtil.getProvisioningConfigurationForGivenSimIfExist()", new Object[0]);
        }
        if (((acxv) this.e.b()).a()) {
            return ((aday) this.f.b()).l(str);
        }
        return adnu.a().b(this.c, str);
    }

    @Deprecated
    public final Optional j() {
        String l;
        if (aczf.T()) {
            l = o();
        } else {
            l = this.g.l();
        }
        return i(l);
    }

    public final Optional k() {
        try {
            whm whmVar = (whm) this.b.o("rcsProvisioningGoogleToSConfiguration", whm.a);
            advp advpVar = a;
            wfo b = wfo.b(whmVar.c);
            if (b == null) {
                b = wfo.UNRECOGNIZED;
            }
            apct apctVar = whmVar.g;
            if (apctVar == null) {
                apctVar = apct.a;
            }
            advr.l(advpVar, "getRcsProvisioningGoogleTosConfiguration %s, consentState = %s, ServerUpdateTime = %s", whmVar, b, Long.valueOf(apctVar.b));
            return Optional.of(whmVar);
        } catch (adux e) {
            advr.j(e, a, "Error while retrieving RcsProvisioningGoogleTosConfiguration from bugle storage", new Object[0]);
            return Optional.empty();
        }
    }

    @Deprecated
    public final String l() {
        String k;
        armf armfVar = this.e;
        String l = this.g.l();
        if (((acxv) armfVar.b()).a()) {
            k = ((aday) this.f.b()).n(l);
        } else {
            Context context = this.c;
            adnu.a();
            k = adnu.k(context, l);
        }
        if (!TextUtils.isEmpty(k)) {
            return k;
        }
        return this.g.h();
    }

    public final String m(wxb wxbVar) {
        String k;
        String str = wxbVar.c;
        if (((acxv) this.e.b()).a()) {
            k = ((aday) this.f.b()).n(str);
        } else {
            Context context = this.c;
            adnu.a();
            k = adnu.k(context, str);
        }
        if (!TextUtils.isEmpty(k)) {
            return k;
        }
        return wxbVar.q;
    }

    public final String n(String str) {
        String k;
        try {
            String i = this.b.i("manual_msisdn_entered_phone_number_for_sim_".concat(String.valueOf(str)), "", "bugle");
            if (!TextUtils.isEmpty(i)) {
                return i;
            }
        } catch (adux e) {
            H(6);
            advr.j(e, a, "Error while retrieving manually entered MSISDN from Bugle's ContentProvider. Using ProvisioningEngineStateCacheUtil.getMsisdnForGivenSim()", new Object[0]);
        }
        if (((acxv) this.e.b()).a()) {
            k = ((aday) this.f.b()).n(str);
        } else {
            Context context = this.c;
            adnu.a();
            k = adnu.k(context, str);
        }
        advr.l(a, "Manually entered MSISDN is: %s", advq.SIM_ID.c(k));
        return k;
    }

    public final String o() {
        String l;
        try {
            l = this.b.i("sim_id", "", "sim_state_tracker");
        } catch (adux e) {
            advr.j(e, a, "Error while retrieving simId from Bugle, using local simId", new Object[0]);
            l = this.g.l();
        }
        advr.d(a, "simId from Bugle is: %s", advq.SIM_ID.c(l));
        return l;
    }

    public final void p(String str) {
        try {
            this.b.k("gmscoreIidToken", str, "RcsApplicationData");
            advr.l(a, "putGMSCoreIIDToken %s", advq.GENERIC.c(str));
        } catch (adux e) {
            advr.j(e, a, "Error while putting GMSCore IID token in bugle storage", new Object[0]);
        }
    }

    public final void q(Context context, boolean z) {
        try {
            aduw aduwVar = this.b;
            if (z) {
                aduwVar.j("rcs_tos_state", 2, "bugle");
            } else {
                aduwVar.j("rcs_tos_state", 0, "bugle");
            }
        } catch (adux e) {
            advr.j(e, a, "Error while putting Google Tos Consent in bugle storage, defaulting to local storage", new Object[0]);
            if (((acxv) this.e.b()).a()) {
                ((aday) this.f.b()).i().edit().putBoolean("provisioning_engine_google_tos_consent_key", z).commit();
            } else {
                adnu.a();
                adnu.d(context).edit().putBoolean("provisioning_engine_google_tos_consent_key", z).commit();
            }
            H(2);
        }
    }

    public final void r(String str, wgi wgiVar) {
        try {
            this.b.p(aduw.h("phone_number_record_for_sim_", str), wgiVar);
            advr.l(a, "putPhoneNumberRecord with phone number: %s for simdId: %s", advq.PHONE_NUMBER.c(wgiVar.c), advq.SIM_ID.c(str));
        } catch (adux e) {
            advr.j(e, a, "Error while putting phone number record in bugle storage", new Object[0]);
        }
    }

    public final void s(String str, apjo apjoVar, wgi wgiVar) {
        if (I(str)) {
            try {
                this.b.p(aduw.e(str, apjoVar), wgiVar);
                advr.l(a, "putPhoneNumberRecord with phone number: %s for simdId: %s", advq.PHONE_NUMBER.c(wgiVar.c), advq.SIM_ID.c(str));
            } catch (adux e) {
                advr.j(e, a, "Error while putting phone number record in bugle storage", new Object[0]);
            }
        }
    }

    public final void t(String str, wgk wgkVar) {
        try {
            this.b.p(aduw.h("provisioning_otp_sms", str), wgkVar);
        } catch (adux e) {
            advr.j(e, a, "Error while updating otp storage in Bugle data store", new Object[0]);
        }
    }

    public final void u(String str, Configuration configuration) {
        if (((acxv) this.e.b()).a()) {
            aday adayVar = (aday) this.f.b();
            adayVar.j(str).edit().putString("provisioning_engine_rcs_configuration", ((aonx) adayVar.b).j(configuration)).commit();
        } else {
            adnu.e(this.c, str).edit().putString("provisioning_engine_rcs_configuration", adnu.a().c.j(configuration)).commit();
        }
        if (aczf.D()) {
            try {
                this.b.k("provisioning_engine_rcs_configuration_".concat(String.valueOf(str)), new aonx().j(configuration), "bugle");
            } catch (adux e) {
                advr.j(e, a, "Error while putting RCS Configuration for simId: %s", advq.SIM_ID.c(str));
                H(5);
            }
        } else {
            advr.l(a, "RCS Configuration storage in Bugle is disabled by p/h flag", new Object[0]);
        }
        advr.l(a, "Rcs Configuration was updated", new Object[0]);
    }

    public final void v(whm whmVar) {
        try {
            this.b.p("rcsProvisioningGoogleToSConfiguration", whmVar);
            advp advpVar = a;
            wfo b = wfo.b(whmVar.c);
            if (b == null) {
                b = wfo.UNRECOGNIZED;
            }
            apct apctVar = whmVar.g;
            if (apctVar == null) {
                apctVar = apct.a;
            }
            advr.l(advpVar, "putRcsProvisioningGoogleTosConfiguration %s, consentState = %s, ServerUpdateTime = %s", whmVar, b, Long.valueOf(apctVar.b));
        } catch (adux e) {
            advr.j(e, a, "Error while putting RcsProvisioningGoogleTosConfiguration in bugle storage", new Object[0]);
        }
    }

    public final void w(whm whmVar) {
        try {
            this.b.p("rcs_provisioning_rcs_default_on_configuration", whmVar);
            advp advpVar = a;
            whk b = whk.b(whmVar.h);
            if (b == null) {
                b = whk.UNRECOGNIZED;
            }
            apct apctVar = whmVar.g;
            if (apctVar == null) {
                apctVar = apct.a;
            }
            advr.l(advpVar, "putRcsProvisioningRcsDefaultOnConfiguration %s, consentState = %s, ServerUpdateTime = %s", whmVar, b, Long.valueOf(apctVar.b));
        } catch (adux e) {
            advr.j(e, a, "Error while putting RcsProvisioningRcsDefaultOnConfiguration in bugle storage", new Object[0]);
        }
    }

    public final void x(String str, int i) {
        try {
            this.b.j(aduw.h("upiAttemptsCount", str), i, "RcsApplicationData");
        } catch (adux e) {
            advr.j(e, a, "Error while putting UPI attempts count into bugle storage", new Object[0]);
        }
    }

    public final void y(String str) {
        Configuration f = f(str);
        f.mReconfigRequested = true;
        u(str, f);
    }

    public final boolean z(String str) {
        try {
            return this.b.l("configuration_terms_and_conditions_consent_".concat(String.valueOf(str)), false, "RcsApplicationData");
        } catch (adux e) {
            advr.j(e, a, "Error while retrieving consent for Configuration Terms and Conditions", new Object[0]);
            H(4);
            return false;
        }
    }
}
