package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import j$.time.Duration;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wkk implements vpq, wnv, wns, wnx, vgx, vgv, wnu, wnz, acmr, wxd {
    public static final alwo a = alwo.o("BugleRcsProvisioning");
    public static final alhr b;
    public static final alhr c;
    static final uuf d;
    private final armf A;
    private final adwu B;
    private final yjf C;
    private final armf D;
    private final armf E;
    private final olc F;
    private final acxi G;
    private final armf H;
    private final armf I;
    private final armf J;
    private final Map K = new ConcurrentHashMap();
    private final adio L;
    private final wjv M;
    private final adea N;
    private final adqg O;
    private final ahjj P;
    private final ahjj Q;
    public final armf e;
    public final armf f;
    public final anen g;
    public final armf h;
    public final armf i;
    public final whj j;
    public final lta k;
    public final aksr l;
    public final armf m;
    public final wwn n;
    public final vau o;
    public final armf p;
    public final armf q;
    public final armf r;
    public final armf s;
    public final vco t;
    private final Context u;
    private final anen v;
    private final admu w;
    private final lzz x;
    private final xnv y;
    private final armf z;

    static {
        uuh.e(uuh.b, "vendor_ims_service_connection_timeout_ms", 10000);
        b = uuh.w("invalidate_config_and_schedule_new_task_on_battery_optimization");
        c = uuh.w("set_root_trace_in_on_rcs_availability_update");
        d = uuh.c(uuh.b, "phenotype_trigger_event_sample_rate", 50.0d);
    }

    public wkk(Context context, armf armfVar, utt uttVar, armf armfVar2, anen anenVar, anen anenVar2, armf armfVar3, armf armfVar4, armf armfVar5, admu admuVar, adqg adqgVar, adea adeaVar, vco vcoVar, lzz lzzVar, adio adioVar, whj whjVar, xnv xnvVar, armf armfVar6, lta ltaVar, armf armfVar7, aksr aksrVar, yjf yjfVar, adwu adwuVar, armf armfVar8, wjv wjvVar, wwn wwnVar, armf armfVar9, armf armfVar10, olc olcVar, vau vauVar, armf armfVar11, armf armfVar12, acxi acxiVar, armf armfVar13, armf armfVar14, armf armfVar15, oss ossVar, armf armfVar16, armf armfVar17) {
        alzz.N();
        this.u = context;
        this.e = armfVar;
        this.f = armfVar2;
        this.g = anenVar;
        this.v = anenVar2;
        this.h = armfVar3;
        this.i = armfVar4;
        this.w = admuVar;
        this.O = adqgVar;
        this.N = adeaVar;
        this.Q = new ahjj(this);
        this.P = new ahjj(this);
        this.t = vcoVar;
        this.x = lzzVar;
        this.L = adioVar;
        this.j = whjVar;
        this.y = xnvVar;
        this.z = armfVar6;
        this.k = ltaVar;
        this.A = armfVar7;
        this.l = aksrVar;
        this.B = adwuVar;
        this.C = yjfVar;
        this.m = armfVar8;
        this.M = wjvVar;
        this.n = wwnVar;
        this.D = armfVar9;
        this.E = armfVar10;
        this.F = olcVar;
        this.o = vauVar;
        this.p = armfVar11;
        this.q = armfVar12;
        this.G = acxiVar;
        this.H = armfVar13;
        this.r = armfVar14;
        this.I = armfVar15;
        this.J = armfVar16;
        this.s = armfVar17;
        ((yep) armfVar5.b()).g(new uql(this, 12));
        uttVar.c(new acys() { // from class: wkg
            @Override // defpackage.acys
            public final void onCsLibPhenotypeUpdated() {
                ((alwl) ((alwl) wkk.a.g()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onCsLibPhenotypeUpdated", 904, "RcsProvisioningTriggerImpl.java")).t("RcsProvisioningTrigger: onCsLibPhenotypeUpdated, enableProvisioningTaskInBugle = %s", Boolean.valueOf(aczf.C()));
                boolean booleanValue = ((Boolean) aczv.s().a.at.a()).booleanValue();
                wkk wkkVar = wkk.this;
                if (!booleanValue) {
                    String str = (String) aczv.s().a.ai.a();
                    String l = ((adtn) wkkVar.i.b()).l();
                    ((alwl) ((alwl) wkk.a.g()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onCsLibPhenotypeUpdated", 911, "RcsProvisioningTriggerImpl.java")).D("RcsProvisioningTrigger: onCsLibPhenotypeUpdated, reprovisionCampaignId = %s, simId = %s", str, advq.SIM_ID.c(l));
                    if (str.equals("")) {
                        wkkVar.q();
                        return;
                    } else {
                        wkkVar.j.e().h(new whg(l, 0), andi.a).i(new vwx((Object) wkkVar, (Object) l, (Object) str, 5, (byte[]) null), wkkVar.g).k(qiu.b(), andi.a);
                        return;
                    }
                }
                wkkVar.q();
            }
        });
        ((vrn) ((xyt) armfVar2.b()).a()).i(new vro(this, 3), anenVar);
        if (((ansy) ((nvs) ossVar).a.b()).e("bugle.update_availability_on_service_state_changed")) {
            if (Build.VERSION.SDK_INT < 33) {
                ((alwl) ((alwl) a.g()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "registerServiceStateListener", 2089, "RcsProvisioningTriggerImpl.java")).r("RcsProvisioningTrigger: ServiceStateListener not registered, SDK version: %s", Build.VERSION.SDK_INT);
            } else {
                adwt.g(context).a.registerTelephonyCallback(0, anenVar2, new wkj(this));
            }
        }
    }

    private final int C(Intent intent) {
        int max = Math.max(intent.getIntExtra("subscription", -1), -1);
        if (((okz) this.I.b()).a() && max < 0) {
            ((alwl) ((alwl) a.i()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "getSubIdFromIntent", 1876, "RcsProvisioningTriggerImpl.java")).q("RcsProvisioningTrigger: invalid subId in the intent.");
        }
        return max;
    }

    private final akul D(vrk vrkVar, boolean z, Optional optional) {
        ((alwl) ((alwl) a.g()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "updateAvailabilityForAllSimsAsync", 1163, "RcsProvisioningTriggerImpl.java")).E("RcsProvisioningTrigger: updateAvailabilityForAllSimsAsync : hint = %s logTriggerEvent = %s", vrkVar, z);
        if (z) {
            optional.ifPresentOrElse(new vxb(this, vrkVar, 7), new wnc(this, vrkVar, 1));
        }
        return ((vrn) ((xyt) this.f.b()).a()).a(vrkVar);
    }

    private final String E(amwt amwtVar) {
        if (amwtVar == null) {
            return "null";
        }
        return ((vrn) ((xyt) this.f.b()).a()).g(amwtVar, amhv.UNKNOWN_UNINITIALIZED_REASON);
    }

    private final void F(amww amwwVar) {
        ((wjr) this.e.b()).a(amwwVar).k(qiu.b(), andi.a);
    }

    private final void G(int i, amww amwwVar) {
        adwl a2 = this.B.a(i);
        if (!a2.equals(adwl.DUAL_REG)) {
            ((alwl) ((alwl) a.g()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "restartProvisioning", 1390, "RcsProvisioningTriggerImpl.java")).t("RcsProvisioningTrigger: SipConnectionType: %s, Skipping restartProvisioning.", a2.name());
            return;
        }
        ((wjr) this.e.b()).c(amwwVar).k(qiu.b(), this.g);
    }

    @Deprecated
    private final void H(aphg aphgVar, amww amwwVar) {
        alwo alwoVar = a;
        ((alwl) ((alwl) alwoVar.g()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "scheduleProvisioning", 1293, "RcsProvisioningTriggerImpl.java")).q("scheduleProvisioning using legacy code path");
        int b2 = ((adtn) this.i.b()).b();
        String l = ((adtn) this.i.b()).l();
        adwl a2 = this.B.a(b2);
        adwl adwlVar = adwl.UNKNOWN;
        int ordinal = a2.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                ((alwl) ((alwl) alwoVar.i()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "scheduleProvisioningBasedOnSipConnectionType", 1326, "RcsProvisioningTriggerImpl.java")).t("RcsProvisioningTrigger: Provisioning Engine version is unknown due to temporary Telephony platform unavailability. %s", a2.name());
                return;
            } else {
                ((alwl) ((alwl) alwoVar.g()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "scheduleProvisioningBasedOnSipConnectionType", 1313, "RcsProvisioningTriggerImpl.java")).t("RcsProvisioningTrigger: DR is active, initializing DR provisioning. %s", a2.name());
                ((wjr) this.e.b()).j(l, amwwVar);
                return;
            }
        }
        ((alwl) ((alwl) alwoVar.g()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "scheduleProvisioningBasedOnSipConnectionType", 1319, "RcsProvisioningTriggerImpl.java")).t("RcsProvisioningTrigger: Single Registration Provisioning Engine is active, initializing SR provisioning. %s", a2.name());
        ((alwl) ((alwl) alwoVar.g()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "initializeSingleRegistrationProvisioning", 588, "RcsProvisioningTriggerImpl.java")).r("[SR]: Single Registration is enabled. Setting up vendor ims for subId: %d", b2);
        aktp.ah(new wob(this, b2, aphgVar, 1), this.g).k(qiu.b(), this.g);
    }

    private final void I(adiv adivVar, aphg aphgVar, amww amwwVar) {
        ((alwl) ((alwl) a.g()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "scheduleProvisioningForRcsProvisioningId", 1271, "RcsProvisioningTriggerImpl.java")).D("scheduleProvisioningForRcsProvisioningId rcsProvisioningId: %s, provisioningTriggerEvent: %s", advq.SIM_ID.c(adivVar), amwwVar);
        this.M.f(adivVar, aphgVar, amwwVar);
    }

    private final boolean J(String str) {
        boolean z = ((adnk) this.h.b()).d(str).c;
        ((alwl) ((alwl) a.g()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "shouldScheduleNotifyRcsUnavailableTask", 1631, "RcsProvisioningTriggerImpl.java")).t("RcsProvisioningTrigger: Should schedule notify RCS unavailable task NotifyBackendRcsIsUnavailable: %b", Boolean.valueOf(z));
        if (aczf.C() && z) {
            return true;
        }
        return false;
    }

    @Deprecated
    private final akul K(int i, vrk vrkVar) {
        if (!aczf.C()) {
            return aktp.ag(null);
        }
        ((alwl) ((alwl) a.g()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "handleTachyonReprovisionError", 1343, "RcsProvisioningTriggerImpl.java")).D("Tachyon error re-provision received at %s due to %s. Restarting provisioning", wch.m(i), vrkVar.name());
        ((adnk) this.h.b()).y(((adtn) this.i.b()).l());
        w(vrkVar);
        return ((wjr) this.e.b()).c(amww.TACHYON_REPROVISION_ERROR);
    }

    public static amww n(vrk vrkVar) {
        adwl adwlVar = adwl.UNKNOWN;
        switch (vrkVar.ordinal()) {
            case 1:
                return amww.RECEIVED_POST_PROVISIONING_INTENT;
            case 2:
                return amww.CSLIB_PHENOTYPE_UPDATE;
            case 3:
                return amww.DEFAULT_SMS_APP_ENABLED;
            case 4:
                return amww.DEFAULT_SMS_APP_DISABLED;
            case 5:
                return amww.BOOT_COMPLETE;
            case 6:
                return amww.PACKAGE_REPLACED;
            case 7:
                return amww.USER_SETTING_ENABLED;
            case 8:
                return amww.USER_SETTING_DISABLED;
            case 9:
                return amww.GSERVICE_UPDATE;
            case 10:
                return amww.RECONFIG_SMS;
            case 11:
                return amww.SINGLE_REGISTRATION_PROVISIONING_EVENT;
            case 12:
                return amww.SINGLE_REGISTRATION_CAPABILITY_UPDATE;
            case 13:
                return amww.RCS_CONFIGURATION_UPDATED;
            case 14:
                return amww.SIM_SWAP;
            case 15:
                return amww.SIM_REMOVAL;
            case 16:
                return amww.TACHYON_REPROVISION_ERROR;
            case 17:
                return amww.TACHYON_INVALID_IDENTITY_ERROR;
            case 18:
                return amww.MOBILE_CONFIGURATION_UPDATE;
            case 19:
                return amww.USER_SETTING_ENABLED_GLOBAL;
            case 20:
                return amww.USER_SETTING_DISABLED_GLOBAL;
            case 21:
                return amww.USER_SETTING_ENABLED_PER_SIM;
            case 22:
                return amww.USER_SETTING_DISABLED_PER_SIM;
            case 23:
                return amww.FI_ACTIVATION_COMPLETE;
            case 24:
                return amww.DEFAULT_CALL_SIM_UPDATE;
            case 25:
                return amww.DEFAULT_SMS_SIM_UPDATE;
            case 26:
                return amww.DEFAULT_DATA_SIM_UPDATE;
            case 27:
                return amww.SERVICE_STATE_CHANGE;
            default:
                return amww.UNDEFINED_TRIGGER_EVENT;
        }
    }

    static boolean x(amwt amwtVar) {
        adwl adwlVar = adwl.UNKNOWN;
        switch (amwtVar.ordinal()) {
            case 0:
            case 1:
            case 3:
            case 7:
            case 10:
            case 13:
            case 16:
            case 17:
            case 19:
            case 20:
            case 22:
            case 26:
                return false;
            case 2:
            case 4:
            case 5:
            case 6:
            case 8:
            case 9:
            case 11:
            case 12:
            case 14:
            case 15:
            case 18:
            case 21:
            case 23:
            case 24:
            case 25:
            case 27:
            case 28:
            case ahby.ERROR_VENDOR_IMS_NOT_FOUND /* 29 */:
                return true;
            default:
                throw new IllegalStateException("unsupported BugleRcsAvailability :" + amwtVar.E);
        }
    }

    @Override // defpackage.wnz
    public final void A() {
        ((alwl) ((alwl) a.g()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onSingleRegistrationConfigurationRemoved", 563, "RcsProvisioningTriggerImpl.java")).q("RcsProvisioningTrigger: Schedule SR provisioning on removed configuration by AOSP.");
        this.t.o(amww.SINGLE_REGISTRATION_CONFIGURATION_REMOVED);
        H(aphg.TRIGGER_CALLBACK_REMOVED_BY_PLATFORM, amww.SINGLE_REGISTRATION_CONFIGURATION_REMOVED);
    }

    public final void B(adiv adivVar, vrk vrkVar) {
        ((alwl) ((alwl) a.g()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "updateRcsAvailabilityForProvisioningId", 1223, "RcsProvisioningTriggerImpl.java")).J("RcsProvisioningTrigger: updateRcsAvailabilityForProvisioningId : rcsProvisioningId = %s hint = %s, logTriggerEvent = %s ", advq.SIM_ID.c(adivVar), vrkVar, true);
        this.t.o(n(vrkVar));
        ((vrn) ((xyt) this.f.b()).a()).p(adivVar, vrkVar);
    }

    @Override // defpackage.wns
    public final void a() {
        ((alwl) ((alwl) a.g()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onBootComplete", 478, "RcsProvisioningTriggerImpl.java")).q("RcsProvisioningTrigger: onBootComplete");
        m(vrk.BOOT_COMPLETE, true).k(qiu.b(), this.g);
    }

    @Override // defpackage.wnx
    public final void b() {
        ((alwl) ((alwl) a.g()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onPackageReplaced", 485, "RcsProvisioningTriggerImpl.java")).q("RcsProvisioningTrigger: onPackageReplace");
        m(vrk.PACKAGE_REPLACED, true).k(qiu.b(), this.g);
    }

    @Override // defpackage.vgv
    public final akul c(aqfn aqfnVar) {
        if (this.F.a()) {
            asku b2 = asku.b(aqfnVar.b);
            if (b2 == null) {
                b2 = asku.UNRECOGNIZED;
            }
            if (!b2.equals(asku.PHONE_NUMBER)) {
                alwl alwlVar = (alwl) ((alwl) a.g()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onTachygramProvisioningError", 874, "RcsProvisioningTriggerImpl.java");
                asku b3 = asku.b(aqfnVar.b);
                if (b3 == null) {
                    b3 = asku.UNRECOGNIZED;
                }
                alwlVar.t("TachyonCommon.Id type %s is not a phone number.", b3);
                return aktp.ag(null);
            }
            adit d2 = ((adae) this.E.b()).d(aqfnVar.c);
            Optional map = ((adji) this.D.b()).f(d2).map(new wki(this, 0));
            ((alwl) ((alwl) a.i()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "logNoIdentityMappingForPhoneNumber", 897, "RcsProvisioningTriggerImpl.java")).t("No identity mapping for phone number: %s", advq.PHONE_NUMBER.c(d2.toString()));
            return (akul) map.orElse(aktp.ag(null));
        }
        return K(2, vrk.TACHYON_REPROVISION_ERROR);
    }

    @Override // defpackage.wnv
    public final akul d(boolean z) {
        vrk vrkVar;
        ((alwl) ((alwl) a.g()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onDefaultSmsAppChange", 1850, "RcsProvisioningTriggerImpl.java")).t("RcsProvisioningTrigger: onDefaultSmsAppChange : isDefaultSmsApp = %s", Boolean.valueOf(z));
        if (z) {
            vrkVar = vrk.DEFAULT_SMS_APP_ENABLED;
        } else {
            vrkVar = vrk.DEFAULT_SMS_APP_DISABLED;
        }
        return m(vrkVar, true);
    }

    @Override // defpackage.vgx
    public final akul e(vgp vgpVar, asky askyVar) {
        Optional empty;
        if (!this.F.a()) {
            empty = Optional.empty();
        } else if (vgpVar.a().equals(vgo.PHONE_NUMBER) && (vgpVar instanceof vgm)) {
            adit d2 = ((adae) this.E.b()).d(((vgm) vgpVar).a);
            ((alwl) ((alwl) a.g()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "getSimIdFromRegistrationInfo", 811, "RcsProvisioningTriggerImpl.java")).t("PhoneNumberRegistrationInfo: %s", advq.PHONE_NUMBER.c(d2.a));
            empty = ((adji) this.D.b()).f(d2).map(new wga(15));
        } else {
            ((alwl) ((alwl) a.i()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "getSimIdFromRegistrationInfo", 800, "RcsProvisioningTriggerImpl.java")).t("RegistrationInfo.RegistrationType %s is not a phone number.", vgpVar.a());
            empty = Optional.empty();
        }
        if (empty.isPresent()) {
            alwo alwoVar = a;
            ((alwl) ((alwl) alwoVar.g()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onTachyonRegistrationError", 824, "RcsProvisioningTriggerImpl.java")).t("onTachyonRegistrationError for simId: %s", advq.SIM_ID.c(((adiw) empty.get()).a));
            adiw adiwVar = (adiw) empty.get();
            adwl adwlVar = adwl.UNKNOWN;
            int ordinal = askyVar.ordinal();
            if (ordinal != 31) {
                if (ordinal != 33) {
                    ((alwl) ((alwl) alwoVar.i()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onTachyonRegistrationErrorForSim", 855, "RcsProvisioningTriggerImpl.java")).t("Unhandled TachyonError type %s.", askyVar);
                    return aktp.ag(null);
                }
                return y(adiwVar, 1, vrk.TACHYON_REPROVISION_ERROR);
            }
            return y(adiwVar, 1, vrk.TACHYON_INVALID_IDENTITY_ERROR);
        }
        if (askyVar.equals(asky.NEEDS_RCS_REPROVISION)) {
            return K(1, vrk.TACHYON_REPROVISION_ERROR);
        }
        if (askyVar.equals(asky.INVALID_IDENTITY_PROOF)) {
            return K(1, vrk.TACHYON_INVALID_IDENTITY_ERROR);
        }
        return aktp.ag(null);
    }

    @Override // defpackage.vpq
    public final void f() {
        ((alwl) ((alwl) a.g()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onAppStart", 521, "RcsProvisioningTriggerImpl.java")).q("RcsProvisioningTrigger: Schedule provisioning on app startup");
        m(vrk.NO_HINT, false).h(new whg(this, 13), this.g).k(qiu.b(), this.g);
    }

    @Override // defpackage.vpq
    public final void g(int i) {
        String str;
        Iterator it = this.n.o().iterator();
        while (true) {
            if (it.hasNext()) {
                wxb wxbVar = (wxb) it.next();
                if (wxbVar.d == i) {
                    str = wxbVar.c;
                    break;
                }
            } else {
                ((alwl) ((alwl) a.g()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "getSimIdFromEligibleSubIdOrEmpty", 1111, "RcsProvisioningTriggerImpl.java")).r("simId not found for subId: %s in the Intent", i);
                str = "";
                break;
            }
        }
        if (str.isEmpty()) {
            ((alwl) ((alwl) a.g()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onFiActivationComplete", 1119, "RcsProvisioningTriggerImpl.java")).q("Provisioning is not scheduled because the subId sent in intent does not map to valid simId");
            if (yhx.h) {
                wke.b(this.u, 3, i);
                return;
            }
            return;
        }
        adiw adiwVar = new adiw(str);
        ((alwl) ((alwl) a.g()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onFiActivationComplete", 1131, "RcsProvisioningTriggerImpl.java")).t("RcsProvisioningTrigger: onFiActivationComplete for rcsProvisioningId : %s", advq.SIM_ID.c(adiwVar));
        B(adiwVar, vrk.FI_ACTIVATION_COMPLETE);
        I(adiwVar, aphg.TRIGGER_FI_ACTIVATION_COMPLETE, amww.FI_ACTIVATION_COMPLETE);
    }

    @Override // defpackage.vpq
    public final void h(boolean z) {
        vrk vrkVar;
        ((alwl) ((alwl) a.g()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onRcsGlobalSettingChange", 601, "RcsProvisioningTriggerImpl.java")).t("RcsProvisioningTrigger: onRcsGlobalSettingChange : isRcsEnabled = %s", Boolean.valueOf(z));
        if (z) {
            vrkVar = vrk.USER_SETTING_ENABLED_GLOBAL;
        } else {
            vrkVar = vrk.USER_SETTING_DISABLED_GLOBAL;
        }
        m(vrkVar, true).k(qiu.b(), this.v);
    }

    @Override // defpackage.vpq
    public final void i(adiv adivVar, boolean z) {
        vrk vrkVar;
        alwo alwoVar = a;
        ((alwl) ((alwl) alwoVar.g()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onRcsPerSimSettingChange", 612, "RcsProvisioningTriggerImpl.java")).E("RcsProvisioningTrigger: onRcsPerSimSettingChange : rcsProvisioningId = %s, isRcsEnabled = %s", advq.SIM_ID.c(adom.n(adivVar).a), z);
        if (z) {
            vrkVar = vrk.USER_SETTING_ENABLED_PER_SIM;
        } else {
            vrkVar = vrk.USER_SETTING_DISABLED_PER_SIM;
        }
        ((alwl) ((alwl) alwoVar.g()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "updateRcsAvailabilityForProvisioningIdAsync", 1240, "RcsProvisioningTriggerImpl.java")).D("RcsProvisioningTrigger: updateRcsAvailabilityForProvisioningIdAsync : rcsProvisioningId = %s hint = %s", advq.SIM_ID.c(adivVar), vrkVar);
        this.t.o(n(vrkVar));
        ((vrn) ((xyt) this.f.b()).a()).b(adivVar, vrkVar).k(qiu.b(), this.v);
    }

    @Override // defpackage.vpq
    public final void j(amww amwwVar) {
        alwo alwoVar = a;
        ((alwl) ((alwl) alwoVar.g()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onReconfiguration", 492, "RcsProvisioningTriggerImpl.java")).q("RcsProvisioningTrigger: Reconfiguration response, restarting provisioning");
        ((adnk) this.h.b()).y(((adtn) this.i.b()).l());
        this.t.o(amwwVar);
        int b2 = ((adtn) this.i.b()).b();
        if (this.L.c(b2)) {
            ((alwl) ((alwl) alwoVar.g()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onReconfiguration", 498, "RcsProvisioningTriggerImpl.java")).r("[SR]: RcsProvisioningTrigger: Triggering Single Registration re-configuration for subId %s.", b2);
        } else {
            ((alwl) ((alwl) alwoVar.g()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onReconfiguration", 503, "RcsProvisioningTriggerImpl.java")).r("[SR]: RcsProvisioningTrigger: Single Registration is not capable for subId %s. Skipping re-configuration in AOSP.", b2);
        }
        if (((adaw) this.z.b()).c()) {
            ((alwl) ((alwl) alwoVar.g()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onReconfiguration", 511, "RcsProvisioningTriggerImpl.java")).q("RcsProvisioningTrigger: Provisioning engine is currently running, skip restartProvisioning.");
        } else {
            G(((adtn) this.i.b()).b(), amwwVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b7, code lost:
    
        if (r8.equals(r1) != false) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.vpq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 504
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wkk.k(java.lang.String):void");
    }

    @Override // defpackage.vpq
    public final void l(String str, String str2) {
        if (((adnk) this.h.b()).D(str) && J(str)) {
            ((wjr) this.e.b()).h(str, "SIM swap", amww.SIM_SWAP);
        }
        ((alwl) ((alwl) a.g()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onSimSwap", 634, "RcsProvisioningTriggerImpl.java")).q("RcsProvisioningTrigger: SIM swap detected, restarting provisioning");
        if (!albo.ah(str)) {
            B(new adiw(str), vrk.SIM_SWAP);
        }
        B(new adiw(str2), vrk.SIM_SWAP);
        if (((adnk) this.h.b()).D(((adtn) this.i.b()).l())) {
            ((vqu) this.A.b()).C();
        } else {
            ((vqu) this.A.b()).A();
        }
        adiw adiwVar = new adiw(str2);
        this.n.j(adiwVar).ifPresent(new vxb(this, adiwVar, 9, null));
    }

    public final akul m(vrk vrkVar, boolean z) {
        return D(vrkVar, z, Optional.empty());
    }

    public final void o(String str, String str2) {
        ((alwl) ((alwl) a.g()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "handleReprovisionCampaign", 992, "RcsProvisioningTriggerImpl.java")).D("RcsProvisioningTrigger: handleReprovisionCampaign with simId = %s, reprovisionCampaignId = %s", advq.SIM_ID.c(str), str2);
        ((wjr) this.e.b()).g(str, amww.REPROVISIONING_CAMPAIGN, true);
        this.j.l(str, str2);
    }

    /* JADX WARN: Type inference failed for: r1v24, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [armf, java.lang.Object] */
    @Override // defpackage.wnu
    public final void p(Intent intent) {
        Optional empty;
        alwo alwoVar = a;
        ((alwl) ((alwl) alwoVar.g()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onConfigSms", 1883, "RcsProvisioningTriggerImpl.java")).q("RcsProvisioningTrigger: onConfigSms");
        if (!aczf.C()) {
            return;
        }
        adqg adqgVar = this.O;
        ahjj ahjjVar = this.Q;
        ((anen) adqgVar.d.b()).getClass();
        adtn adtnVar = (adtn) adqgVar.b.b();
        adtnVar.getClass();
        adnk adnkVar = (adnk) adqgVar.a.b();
        adnkVar.getClass();
        ahjjVar.getClass();
        ((acxy) adqgVar.c.b()).getClass();
        adnd adndVar = new adnd(adtnVar, adnkVar, ahjjVar);
        byte[] bArr = null;
        if (((okz) this.I.b()).a()) {
            int C = C(intent);
            wxb wxbVar = (wxb) this.n.i(C).orElse(null);
            if (wxbVar != null) {
                adndVar.b(((adnv) this.m.b()).b(wxbVar.c));
            } else {
                ((alwl) ((alwl) alwoVar.i()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onConfigSms", 1898, "RcsProvisioningTriggerImpl.java")).r("RcsProvisioningTrigger: no SimSubscriptionInfo found for subId %s in the intent.", C);
                adndVar.b(((adnv) this.m.b()).a());
            }
        } else {
            adndVar.b(((adnv) this.m.b()).a());
        }
        adndVar.d(this.u, intent);
        ((alwl) ((alwl) alwoVar.g()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onConfigSms", 1907, "RcsProvisioningTriggerImpl.java")).q("RcsProvisioningTrigger: completed processSmsIntent.");
        if (aczv.x() && aczv.W()) {
            int C2 = C(intent);
            Optional i = this.n.i(C2);
            ((alwl) ((alwl) alwoVar.g()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onConfigSms", 1914, "RcsProvisioningTriggerImpl.java")).t("RcsProvisioningTrigger: simSubscriptionInfo: %s", i);
            if (i.isEmpty()) {
                ((alwl) ((alwl) alwoVar.i()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onConfigSms", 1916, "RcsProvisioningTriggerImpl.java")).r("RcsProvisioningTrigger: no SimSubscriptionInfo found for subId %s in the intent.", C2);
                return;
            }
            empty = Optional.of(((wxb) i.get()).c);
        } else {
            empty = Optional.empty();
        }
        adea adeaVar = this.N;
        ahjj ahjjVar2 = this.P;
        Context context = (Context) adeaVar.a.b();
        context.getClass();
        ahjjVar2.getClass();
        ((anen) adeaVar.e.b()).getClass();
        acnz acnzVar = (acnz) adeaVar.b.b();
        acnzVar.getClass();
        adnv adnvVar = (adnv) adeaVar.d.b();
        adnvVar.getClass();
        vau vauVar = (vau) adeaVar.c.b();
        vauVar.getClass();
        adnc adncVar = new adnc(context, ahjjVar2, acnzVar, adnvVar, vauVar, empty);
        if (((okz) this.I.b()).a()) {
            empty.ifPresentOrElse(new vxb(this, adncVar, 8, bArr), new uql(adncVar, 13));
        } else {
            adncVar.a();
        }
        adncVar.d(this.u, intent);
    }

    public final void q() {
        armf armfVar = this.J;
        Optional empty = Optional.empty();
        if (((oex) armfVar.b()).a()) {
            empty = Optional.of((Double) d.e());
        }
        qiu.h(D(vrk.CSLIB_PHENOTYPE_UPDATE, true, empty).h(new whg(this, 14), this.g));
    }

    public final void r(String str, int i, int i2) {
        alwo alwoVar = a;
        ((alwl) ((alwl) alwoVar.g()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onOtpSms", 434, "RcsProvisioningTriggerImpl.java")).q("RcsProvisioningTrigger: onOtpSms");
        this.t.o(amww.OTP_SMS_RECEIVED);
        aozy createBuilder = wgk.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        wgk wgkVar = (wgk) apagVar;
        str.getClass();
        wgkVar.b |= 1;
        wgkVar.c = str;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        wgk wgkVar2 = (wgk) apagVar2;
        wgkVar2.b |= 2;
        wgkVar2.d = i;
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        wgk wgkVar3 = (wgk) createBuilder.b;
        wgkVar3.b |= 4;
        wgkVar3.e = i2;
        apct a2 = ytf.a(this.y.f().toEpochMilli());
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        wgk wgkVar4 = (wgk) createBuilder.b;
        a2.getClass();
        wgkVar4.f = a2;
        wgkVar4.b |= 8;
        wgk wgkVar5 = (wgk) createBuilder.s();
        try {
            String str2 = ((wxb) this.n.i(i).orElseThrow()).c;
            ((alwl) ((alwl) alwoVar.g()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onOtpSms", 455, "RcsProvisioningTriggerImpl.java")).B("RcsProvisioningTrigger: onOtpSms with simId: %s and subId: %s", advq.SIM_ID.c(str2), i);
            this.j.g(aduy.h("provisioning_otp_sms", str2), wgkVar5).k(qiu.b(), andi.a);
            if (!((adaw) this.z.b()).c()) {
                ((wjr) this.e.b()).l(str2, Duration.ZERO, 2, amww.OTP_SMS_RECEIVED);
            } else {
                ((advd) ((adaw) this.z.b()).a).b(wgkVar5);
            }
        } catch (NoSuchElementException unused) {
            ((alwl) ((alwl) a.g()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onOtpSms", 450, "RcsProvisioningTriggerImpl.java")).r("RcsProvisioningTrigger: no SimSubscriptionInfo found for subId %s in the OTP.", i);
        }
    }

    @Override // defpackage.acmr
    public final void s() {
        ((alwl) ((alwl) a.g()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onSystemBound", 551, "RcsProvisioningTriggerImpl.java")).q("RcsProvisioningTrigger: System bound to :rcs process. Schedule provisioning.");
        this.t.o(amww.RCS_SYSTEM_BINDING);
        v(aphg.TRIGGER_SYSTEM_BINDING_ON_CREATE, amww.RCS_SYSTEM_BINDING);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x009b, code lost:
    
        if (((defpackage.apag) r0.get()).equals(defpackage.whm.a) != false) goto L11;
     */
    /* JADX WARN: Type inference failed for: r0v12, types: [armf, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t(defpackage.vrm r27) {
        /*
            Method dump skipped, instructions count: 1331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wkk.t(vrm):void");
    }

    public final void u(adiw adiwVar, int i, amww amwwVar) {
        adwl a2 = this.B.a(i);
        if (!Objects.equals(a2, adwl.DUAL_REG)) {
            ((alwl) ((alwl) a.g()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "restartProvisioningForSimId", 1374, "RcsProvisioningTriggerImpl.java")).t("RcsProvisioningTrigger: SipConnectionType: %s, Skipping restartProvisioning.", a2.name());
            return;
        }
        ((wjr) this.e.b()).d(adiwVar, amwwVar).k(qiu.b(), this.g);
    }

    public final void v(aphg aphgVar, amww amwwVar) {
        ((alwl) ((alwl) a.g()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "scheduleProvisioningForEligibleSims", 1281, "RcsProvisioningTriggerImpl.java")).q("scheduleProvisioningForEligibleSims");
        this.M.e(aphgVar, amwwVar);
    }

    @Deprecated
    public final void w(vrk vrkVar) {
        ((alwl) ((alwl) a.g()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "updateRcsAvailability", 1259, "RcsProvisioningTriggerImpl.java")).t("RcsProvisioningTrigger: updateRcsAvailability : hint = %s", vrkVar);
        this.t.o(n(vrkVar));
        ((vrn) ((xyt) this.f.b()).a()).o(vrkVar);
    }

    public final akul y(adiw adiwVar, int i, vrk vrkVar) {
        if (!aczf.C()) {
            return aktp.ag(null);
        }
        ((alwl) ((alwl) a.g()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "handleTachyonReprovisionErrorForSim", 1359, "RcsProvisioningTriggerImpl.java")).J("Tachyon error re-provision received for simId %s, at %s due to %s. Restarting provisioning", advq.SIM_ID.c(adiwVar), wch.m(i), vrkVar.name());
        ((adnk) this.h.b()).y(adiwVar.a);
        B(adiwVar, vrkVar);
        wjv wjvVar = this.M;
        amww amwwVar = amww.TACHYON_REPROVISION_ERROR;
        amwwVar.getClass();
        return ((wjr) wjvVar.e.b()).d(adom.n(adiwVar), amwwVar);
    }

    @Override // defpackage.wxd
    public final void z(wwm wwmVar, wxc wxcVar) {
        vrk vrkVar;
        if (((okr) this.q.b()).a()) {
            alwo alwoVar = a;
            ((alwl) ((alwl) alwoVar.g()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onDefaultSubscriptionChanged", 1949, "RcsProvisioningTriggerImpl.java")).t("RcsProvisioningTrigger: onDefaultSubscriptionChanged: %s", wwmVar);
            if (wwmVar != wwm.c) {
                adiv adivVar = wxcVar.a;
                if (((wih) this.p.b()).n(adivVar)) {
                    ((alwl) ((alwl) alwoVar.g()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onDefaultSubscriptionChanged", 1956, "RcsProvisioningTriggerImpl.java")).t("RcsProvisioningTrigger: default subscription changed, updating availability for rcsProvisioningId: %s", advq.SIM_ID.c(adom.n(adivVar).a));
                    adwl adwlVar = adwl.UNKNOWN;
                    int ordinal = wwmVar.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal != 2) {
                                vrkVar = vrk.NO_HINT;
                            } else {
                                vrkVar = vrk.DEFAULT_DATA_SIM_UPDATE;
                            }
                        } else {
                            vrkVar = vrk.DEFAULT_SMS_SIM_UPDATE;
                        }
                    } else {
                        vrkVar = vrk.DEFAULT_CALL_SIM_UPDATE;
                    }
                    B(adivVar, vrkVar);
                }
            }
        }
    }
}
