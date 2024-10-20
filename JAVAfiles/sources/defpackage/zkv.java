package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.format.Formatter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.preference.Preference;
import androidx.preference.TwoStatePreference;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.appsettings.RcsSimStatusPreference;
import com.google.android.apps.messaging.ui.appsettings.RcsSimStatusView;
import com.google.android.apps.messaging.ui.appsettings.TurnOffRcsActivity;
import com.google.android.ims.provisioning.config.Configuration;
import com.google.android.ims.provisioning.config.UserExperienceConfiguration;
import com.google.android.rcs.client.profile.RcsProfileService;
import j$.util.Collection;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zkv implements SharedPreferences.OnSharedPreferenceChangeListener, vrl {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer");
    public static final utz b = uuh.f(uuh.b, "rcs_settings_retry_min_period_ms", 300000);
    public static final utz c = uuh.e(uuh.b, "rcs_settings_retry_max_per_day", 5);
    public final armf A;
    public final armf B;
    public final armf C;
    public final armf D;
    public final armf E;
    public final armf F;
    public final armf G;
    public final armf H;
    public final armf I;
    public final armf J;
    public final armf K;
    public akbp L;
    public final armf M;
    public final armf N;
    public final xvv O;
    public final xvv P;
    public final armf Q;
    public final armf R;
    public final armf S;
    public final armf T;
    public final armf U;
    public final armf V;
    public final armf W;
    public final armf X;
    public final armf Y;
    public final armf Z;
    private final armf aA;
    private final armf aB;
    private final armf aC;
    private final armf aD;
    public zkw aa;
    public final akgs ab;
    public final akbp ac;
    public final akbp ad;
    public final akgh ae;
    public final akbp af;
    public final akbp ag;
    public rw ah;
    private String ai;
    private String aj;
    private String ak;
    private String al;
    private int am = 3;
    private String an;
    private final armf ao;
    private final armf ap;
    private final armf aq;
    private final armf ar;
    private final armf as;
    private final armf at;
    private final armf au;
    private final armf av;
    private final armf aw;
    private final armf ax;
    private final armf ay;
    private final armf az;
    public String d;
    public String e;
    public String f;
    public int g;
    public aaxz h;
    public boolean i;
    public boolean j;
    public boolean k;
    public alog l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public final zkn q;
    public final armf r;
    public final armf s;
    public final armf t;
    public final armf u;
    public final armf v;
    public final armf w;
    public final armf x;
    public final armf y;
    public final armf z;

    public zkv(zkn zknVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11, armf armfVar12, armf armfVar13, armf armfVar14, armf armfVar15, armf armfVar16, armf armfVar17, armf armfVar18, armf armfVar19, armf armfVar20, armf armfVar21, armf armfVar22, armf armfVar23, armf armfVar24, armf armfVar25, armf armfVar26, armf armfVar27, armf armfVar28, armf armfVar29, armf armfVar30, armf armfVar31, armf armfVar32, armf armfVar33, armf armfVar34, armf armfVar35, armf armfVar36, armf armfVar37, armf armfVar38, armf armfVar39, armf armfVar40, armf armfVar41, armf armfVar42, armf armfVar43, armf armfVar44, armf armfVar45, armf armfVar46, armf armfVar47, armf armfVar48) {
        int i = alog.d;
        this.l = alsx.a;
        this.ab = new zks(this);
        this.ac = new zkt(this);
        this.ad = new zku(this);
        this.ae = new akgh<qid>() { // from class: zkv.1
            @Override // defpackage.akgh
            public final void a(Throwable th) {
                ((alvg) ((alvg) ((alvg) zkv.a.i()).g(th)).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer$4", "onError", (char) 537, "RcsSettingsFragmentV2Peer.java")).q("Error loading fi settings data");
            }

            @Override // defpackage.akgh
            public final /* bridge */ /* synthetic */ void c(Object obj) {
                zkv.this.i = ((qid) obj).d;
            }

            @Override // defpackage.akgh
            public final void b() {
            }
        };
        this.af = new akbp<Void, Void>() { // from class: zkv.2
            @Override // defpackage.akbp
            public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
                ((alvg) ((alvg) ((alvg) zkv.a.i()).g(th)).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer$5", "onFailure", (char) 586, "RcsSettingsFragmentV2Peer.java")).q("Failed to reset carrier TermsAndConditions storage.");
            }

            @Override // defpackage.akbp
            public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
                ((alvg) ((alvg) zkv.a.g()).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer$5", "onSuccess", 581, "RcsSettingsFragmentV2Peer.java")).q("Reset carrier TermsAndConditions storage.");
            }

            @Override // defpackage.akbp
            public final /* synthetic */ void b(Object obj) {
            }
        };
        this.ag = new akbp<Void, Void>() { // from class: zkv.3
            @Override // defpackage.akbp
            public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
                ((alvg) ((alvg) ((alvg) zkv.a.i()).g(th)).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer$6", "onFailure", (char) 610, "RcsSettingsFragmentV2Peer.java")).q("Failed to cancel Revoke Consent Work Manager tasks");
            }

            @Override // defpackage.akbp
            public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
                armf armfVar49 = zkv.this.U;
                armfVar49.getClass();
                ((vyv) armfVar49.b()).e(4);
                ((alvg) ((alvg) zkv.a.g()).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer$6", "onSuccess", 603, "RcsSettingsFragmentV2Peer.java")).q("Successfully cancelled all Enqueued Revoke Consent(with user_disabled=true) Work Manager tasks");
            }

            @Override // defpackage.akbp
            public final /* synthetic */ void b(Object obj) {
            }
        };
        this.q = zknVar;
        this.r = armfVar;
        this.ao = armfVar2;
        this.ap = armfVar3;
        this.aq = armfVar4;
        this.ar = armfVar5;
        this.as = armfVar6;
        this.t = armfVar7;
        this.u = armfVar8;
        this.v = armfVar9;
        this.w = armfVar10;
        this.at = armfVar11;
        this.x = armfVar12;
        this.y = armfVar13;
        this.z = armfVar14;
        this.A = armfVar15;
        this.B = armfVar16;
        this.C = armfVar17;
        this.D = armfVar18;
        this.au = armfVar19;
        this.E = armfVar20;
        this.F = armfVar21;
        this.av = armfVar22;
        this.aw = armfVar23;
        this.G = armfVar24;
        this.H = armfVar25;
        this.I = armfVar26;
        this.J = armfVar27;
        this.K = armfVar28;
        this.s = armfVar29;
        this.M = armfVar30;
        this.N = armfVar31;
        this.O = new xvv("enable_legal_fyi_flow", new isd(7));
        this.P = new xvv("show_legal_fyi_banner", new isd(8));
        this.Q = armfVar32;
        this.R = armfVar33;
        this.S = armfVar34;
        this.ax = armfVar35;
        this.ay = armfVar36;
        this.T = armfVar37;
        this.az = armfVar38;
        this.U = armfVar39;
        this.aA = armfVar40;
        this.aB = armfVar41;
        this.V = armfVar42;
        this.aC = armfVar43;
        this.W = armfVar44;
        this.X = armfVar45;
        this.Y = armfVar46;
        this.aD = armfVar47;
        this.Z = armfVar48;
    }

    public static boolean m(amwt amwtVar) {
        int ordinal = amwtVar.ordinal();
        if (ordinal != 3 && ordinal != 4 && ordinal != 5 && ordinal != 7 && ordinal != 10 && ordinal != 21 && ordinal != 25) {
            switch (ordinal) {
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                default:
                    ((alvg) ((alvg) a.d()).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer", "canDisplayRcsChatsStatus", 1879, "RcsSettingsFragmentV2Peer.java")).H("canDisplayRcsChatsStatus %s, Rcs availability %s", false, amwtVar);
                    return false;
            }
        }
        ((alvg) ((alvg) a.d()).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer", "canDisplayRcsChatsStatus", 1875, "RcsSettingsFragmentV2Peer.java")).H("canDisplayRcsChatsStatus %s, Rcs availability %s", true, amwtVar);
        return true;
    }

    private final void p() {
        LinearLayout linearLayout;
        zkw zkwVar = this.aa;
        zkwVar.getClass();
        RcsSimStatusPreference rcsSimStatusPreference = zkwVar.h;
        if (rcsSimStatusPreference.k() != null && (linearLayout = (LinearLayout) rcsSimStatusPreference.k().findViewById(R.id.rcs_turned_off_banner_container)) != null) {
            linearLayout.setVisibility(8);
        }
    }

    private final void q(Preference preference) {
        this.q.d().af(preference);
    }

    private final void r() {
        zkw zkwVar = this.aa;
        zkwVar.getClass();
        RcsSimStatusPreference rcsSimStatusPreference = zkwVar.h;
        if (rcsSimStatusPreference.k() != null) {
            LinearLayout linearLayout = (LinearLayout) rcsSimStatusPreference.k().findViewById(R.id.rcs_turned_off_banner_container);
            if (linearLayout == null) {
                rcsSimStatusPreference.k().addView((LinearLayout) LayoutInflater.from(rcsSimStatusPreference.k().getContext()).inflate(R.layout.rcs_turn_off_fyi, (ViewGroup) null));
            } else {
                linearLayout.setVisibility(0);
            }
        }
    }

    private final void s() {
        zkw zkwVar = this.aa;
        zkwVar.getClass();
        int d = ((ykw) this.x.b()).d(this.ak, this.g);
        cj fe = this.q.fe();
        fe.getClass();
        zkwVar.e.n(fe.getResources().getStringArray(R.array.rcs_default_sharing_method_options)[d]);
    }

    private final boolean t(boolean z) {
        boolean f;
        boolean z2;
        if (aczv.x() && aczv.X()) {
            f = this.n;
        } else {
            f = actx.f();
        }
        if (((ykw) this.x.b()).d("rcs_tos_state", 0) == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            ((alvg) ((alvg) a.d()).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer", "shouldShowGoogleTos", 1404, "RcsSettingsFragmentV2Peer.java")).I("shouldShowGoogleTos: showGoogleTos %s, tosAccepted %s", f, z2);
            if (!f || z2) {
                return false;
            }
            return true;
        }
        boolean q = ((ykw) this.x.b()).q("should_show_google_tos_prompt", false);
        ((alvg) ((alvg) a.d()).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer", "shouldShowGoogleTos", 1409, "RcsSettingsFragmentV2Peer.java")).J("shouldShowGoogleTos: showGoogleTos %s, tosRequested %s, tosAccepted %s", Boolean.valueOf(f), Boolean.valueOf(q), Boolean.valueOf(z2));
        if (!f || !q || z2) {
            return false;
        }
        return true;
    }

    public final String a(amwt amwtVar, String str, boolean z) {
        int i;
        int ordinal = amwtVar.ordinal();
        if (ordinal != 2 && ordinal != 6) {
            if (ordinal != 19) {
                if (ordinal != 26) {
                    if (ordinal != 8) {
                        if (ordinal != 9) {
                            if (ordinal != 11) {
                                if (ordinal != 12) {
                                    if (ordinal != 14 && ordinal != 15) {
                                        if (ordinal != 23) {
                                            if (ordinal != 24) {
                                                return str;
                                            }
                                            zkn zknVar = this.q;
                                            if (true != z) {
                                                i = R.string.rcs_not_available_desc_disabled_by_it_admin_v2;
                                            } else {
                                                i = R.string.multi_sim_rcs_not_available_desc_disabled_by_it_admin;
                                            }
                                            return zknVar.T(i, str);
                                        }
                                    }
                                }
                            }
                        } else {
                            return this.q.T(R.string.rcs_not_available_desc_sim_absent, str);
                        }
                    }
                }
            }
            return this.q.T(R.string.rcs_not_available_desc_device_not_supported, str);
        }
        return this.q.T(R.string.rcs_not_available_desc_carrier_not_supported, str);
    }

    @Override // defpackage.vrl
    public final void am(vrm vrmVar) {
        if (!((pml) this.Z.b()).a()) {
            ((ahiy) this.H.b()).q(aktp.ag(null), ((wih) this.R.b()).d().a());
            if (vrmVar.a == amwt.AVAILABLE) {
                h();
            }
        }
    }

    public final void b() {
        akfd akfdVar;
        ((wyp) this.Q.b()).m(amlw.RCS_PROVISIONING_LEGAL_FYI_BANNER_IN_SETTINGS_SEEN);
        ((alvg) ((alvg) a.g()).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer", "onLegalFyiSeen", 1548, "RcsSettingsFragmentV2Peer.java")).q("Legal FYI Banner shown, starting provisioning");
        boolean z = true;
        ((ykw) this.x.b()).h("should_show_rcs_default_on_prompt", true);
        zkn zknVar = this.q;
        aaxz aaxzVar = this.h;
        cj fe = zknVar.fe();
        fe.getClass();
        aaxzVar.q(fe, true);
        if (!aczv.x() || !aczv.X()) {
            z = false;
        }
        if (((pml) this.Z.b()).a()) {
            if (z) {
                ((wih) this.R.b()).k();
                return;
            } else {
                ((ahiy) this.H.b()).q(aktp.ag(null), aayd.b);
                return;
            }
        }
        ahiy ahiyVar = (ahiy) this.H.b();
        akul ag = aktp.ag(null);
        if (z) {
            akfdVar = ((wih) this.R.b()).d().a();
        } else {
            akfdVar = aayd.b;
        }
        ahiyVar.q(ag, akfdVar);
    }

    public final void c() {
        if (((orb) this.V.b()).a()) {
            r();
        }
        ((znu) this.J.b()).a(3);
        j(wiz.TOGGLE_STATE_USER_DISABLED);
        if (((ora) this.aA.b()).a()) {
            qiu.h(((wfh) this.aB.b()).R(new yez(((xnv) this.T.b()).f(), 0)));
        }
    }

    public final void d() {
        String string;
        UserExperienceConfiguration userExperienceConfiguration;
        char c2;
        this.q.b.f("bugle");
        zkn zknVar = this.q;
        zknVar.q();
        zknVar.r(zknVar.b.e(zknVar.y(), R.xml.rcs_preferences_per_subscription_rcs_settings_redesign_legal_fyi, null));
        this.q.d().ag();
        this.d = this.q.S(R.string.enable_rcs_pref_key);
        int i = 0;
        if (!((pmj) this.Y.b()).a() && !((yjr) this.ap.b()).y()) {
            this.q.d().G(false);
        }
        this.ai = this.q.S(R.string.rcs_fallback_type_pref_key);
        this.e = this.q.S(R.string.rcs_auto_fallback_pref_key);
        this.ak = this.q.S(R.string.rcs_default_sharing_method_key);
        this.aj = this.q.S(R.string.rcs_mobile_data_auto_download_limit_pref_key);
        this.an = this.q.S(R.string.rcs_learn_more_pref_key);
        this.f = this.q.S(R.string.rcs_mobile_auto_download_in_roaming_pref_key);
        this.al = this.q.S(R.string.rcs_sim_status_pref_key);
        int i2 = 3;
        int i3 = 1;
        try {
            Configuration rcsConfig = ((RcsProfileService) ((vyv) this.au.b()).a).getRcsConfig();
            if (rcsConfig != null && (userExperienceConfiguration = rcsConfig.mUserExperienceConfig) != null) {
                int i4 = userExperienceConfiguration.mMessageFallbackDefault;
                int i5 = userExperienceConfiguration.mFileTransferFallbackDefault;
                if (i4 != -1 && i5 != -1) {
                    if (i4 != 1 && i5 != 1) {
                        c2 = 0;
                    } else {
                        c2 = 1;
                    }
                } else {
                    c2 = 65535;
                }
                if (c2 != 65535) {
                    i2 = c2 != 0 ? 2 : 1;
                }
            }
        } catch (ajny e) {
            xzb.i("Bugle", e, "RcsUtils. Error getting default configuration value for fallback setting");
        }
        this.am = i2;
        TwoStatePreference twoStatePreference = (TwoStatePreference) this.q.a(this.d);
        twoStatePreference.getClass();
        Preference a2 = this.q.a(this.ai);
        a2.getClass();
        TwoStatePreference twoStatePreference2 = (TwoStatePreference) this.q.a(this.e);
        twoStatePreference2.getClass();
        Preference a3 = this.q.a(this.aj);
        a3.getClass();
        Preference a4 = this.q.a(this.ak);
        a4.getClass();
        Preference a5 = this.q.a(this.an);
        a5.getClass();
        TwoStatePreference twoStatePreference3 = (TwoStatePreference) this.q.a(this.f);
        twoStatePreference3.getClass();
        RcsSimStatusPreference rcsSimStatusPreference = (RcsSimStatusPreference) this.q.a(this.al);
        rcsSimStatusPreference.getClass();
        zkw zkwVar = new zkw(twoStatePreference, a2, twoStatePreference2, a3, a4, a5, twoStatePreference3, rcsSimStatusPreference);
        this.aa = zkwVar;
        q(zkwVar.b);
        zkw zkwVar2 = this.aa;
        zkwVar2.getClass();
        zkwVar2.c.n = new zkp(this, i3);
        zkwVar2.getClass();
        zkwVar2.a.G(false);
        if (!((okr) this.S.b()).a() && (!aczv.x() || !aczv.X())) {
            zkwVar2.a.n = new akvd((akvf) this.K.b(), "RcsSettingsFragmentV2Peer:rcsEnabledPreference", new zkp(this, i));
        }
        zkw zkwVar3 = this.aa;
        zkwVar3.getClass();
        if (!((vqu) this.r.b()).K()) {
            int defaultSharingMethod = ((RcsProfileService) this.aq.b()).getDefaultSharingMethod();
            this.g = defaultSharingMethod;
            if (defaultSharingMethod != -1) {
                zkwVar3.e.o = new lpi(this, 12);
                s();
            } else {
                q(zkwVar3.e);
            }
        } else {
            q(zkwVar3.e);
        }
        zkw zkwVar4 = this.aa;
        zkwVar4.getClass();
        h();
        zkwVar4.d.o = new lpi(this, 11);
        zkw zkwVar5 = this.aa;
        zkwVar5.getClass();
        boolean m = m(((vrn) ((xyt) this.u.b()).a()).d());
        cj fe = this.q.fe();
        fe.getClass();
        zkwVar5.f.M(aabr.ad(fe, R.string.rcs_learn_more_title_v2));
        zkwVar5.f.o = new lpi(this, 13);
        if (!m && !((okr) this.S.b()).a()) {
            this.q.d().ab();
            this.q.d().ae(zkwVar5.f);
            zkwVar5.f.L(R.string.rcs_not_available_learn_more_title_v2);
            String bs = yyb.bs(this.q.x());
            String a6 = a(((vrn) ((xyt) this.u.b()).a()).d(), bs, false);
            Preference preference = zkwVar5.f;
            cj fe2 = this.q.fe();
            fe2.getClass();
            preference.n(aabr.af(fe2, a6, bs));
        }
        zkw zkwVar6 = this.aa;
        zkwVar6.getClass();
        zkwVar6.g.n = new akvd((akvf) this.K.b(), "RcsSettingsFragmentV2Peer:enableAutoDownloadInRoaming", new lqp(this, 20));
        if (!aczv.x() || !aczv.X()) {
            g();
        }
        Bundle bundle = this.q.m;
        if (bundle != null && (string = bundle.getString("open_setting_directly")) != null) {
            zkw zkwVar7 = this.aa;
            zkwVar7.getClass();
            gfb gfbVar = zkwVar7.e.o;
            if (this.ak.equals(string) && gfbVar != null) {
                gfbVar.a(zkwVar7.e);
            }
        }
    }

    public final void e() {
        zkw zkwVar = this.aa;
        zkwVar.getClass();
        zkn zknVar = this.q;
        SpannableStringBuilder ae = aabr.ae(zknVar.x(), zknVar.T(R.string.rcs_status_legal_banner_pvaas_version, zknVar.S(R.string.rcs_status_about_rcs_chats)), this.q.S(R.string.rcs_status_about_rcs_chats), new uai(this, 11));
        RcsSimStatusPreference rcsSimStatusPreference = zkwVar.h;
        rcsSimStatusPreference.ac(ae);
        rcsSimStatusPreference.ad(0);
        this.P.d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f() {
        zkw zkwVar = this.aa;
        zkwVar.getClass();
        String S = this.q.S(R.string.rcs_not_available_more_about_rcs_chats);
        if (this.l.isEmpty()) {
            ((alvg) ((alvg) a.g()).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer", "showRcsUnavailablePreference", 1256, "RcsSettingsFragmentV2Peer.java")).q("showRcsUnavailablePreference: device has no available SIMs, removing all preferences");
            this.q.d().ab();
            this.q.d().ae(zkwVar.f);
            zkwVar.f.L(R.string.rcs_not_available_learn_more_title_v2);
            zkwVar.f.n(aabr.af(this.q.x(), a(amwt.DISABLED_SIM_ABSENT, S, false), S));
            return;
        }
        boolean z = true;
        if (this.l.size() <= 1) {
            z = false;
        }
        alog alogVar = (alog) Collection.EL.stream(this.l).map(new ldi(this, S, z, 3)).collect(alls.a);
        if (Collection.EL.stream(alogVar).distinct().count() == 1) {
            ((alvg) ((alvg) a.g()).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer", "showRcsUnavailablePreference", 1292, "RcsSettingsFragmentV2Peer.java")).q("showRcsUnavailablePreference: one distinct RCS unavailable string, removing all preferences");
            this.q.d().ab();
            this.q.d().ae(zkwVar.f);
            zkwVar.f.L(R.string.rcs_not_available_learn_more_title_v2);
            zkwVar.f.n(aabr.af(this.q.x(), (String) alogVar.get(0), S));
            return;
        }
        ((alvg) ((alvg) a.g()).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer", "showRcsUnavailablePreference", 1309, "RcsSettingsFragmentV2Peer.java")).q("showRcsUnavailablePreference: multiple RCS unavailable strings, displaying unavailable text in RCS sim statuses");
        this.q.d().ab();
        this.q.d().ae(zkwVar.a);
        this.q.d().ae(zkwVar.h);
        this.q.d().ae(zkwVar.f);
        Preference preference = zkwVar.f;
        zkn zknVar = this.q;
        preference.M(aabr.af(zknVar.x(), zknVar.S(R.string.rcs_status_about_rcs_chats), zknVar.S(R.string.rcs_status_about_rcs_chats)));
        zkwVar.f.o = new lpi(this, 14);
        zkwVar.a.G(false);
        zkwVar.h.G(false);
    }

    public final void g() {
        boolean z = false;
        if (((yyt) this.ao.b()).S() && n()) {
            z = true;
        }
        ((alvg) ((alvg) a.d()).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer", "updateMobileDataAutoDownloadInRoaming", 1501, "RcsSettingsFragmentV2Peer.java")).t("updateMobileDataAutoDownloadInRoaming, enabled %s", Boolean.valueOf(z));
        zkw zkwVar = this.aa;
        zkwVar.getClass();
        zkwVar.g.k(z);
    }

    public final void h() {
        int a2;
        String T;
        zkn zknVar = this.q;
        String S = zknVar.S(R.string.rcs_mobile_data_auto_download_limit_disable_entry);
        String S2 = zknVar.S(R.string.rcs_mobile_data_auto_download_limit_default_entry);
        String f = ((ykw) this.x.b()).f(this.aj, this.q.S(R.string.rcs_mobile_data_auto_download_limit_default_entry));
        if (f.equals(S)) {
            T = this.q.S(R.string.rcs_mobile_data_auto_download_limit_disabled_summary);
        } else if (f.equals(S2)) {
            if (((ydf) this.ar.b()).f()) {
                T = this.q.T(R.string.rcs_mobile_data_auto_download_limit_summary_format, Formatter.formatShortFileSize(this.q.fe(), zhy.a(((ydf) this.ar.b()).e())));
            } else {
                T = this.q.S(R.string.rcs_mobile_data_auto_download_limit_disabled_summary);
            }
        } else {
            if (((ogk) this.aD.b()).a()) {
                a2 = Integer.parseInt(f);
            } else {
                a2 = zhy.a(Integer.parseInt(f));
            }
            T = this.q.T(R.string.rcs_mobile_data_auto_download_limit_summary_format, Formatter.formatShortFileSize(this.q.fe(), a2));
        }
        zkw zkwVar = this.aa;
        zkwVar.getClass();
        zkwVar.d.n(T);
    }

    public final void i() {
        boolean z;
        LinearLayout linearLayout;
        if (this.k && n()) {
            z = true;
        } else {
            z = false;
        }
        alvi alviVar = a;
        alvg alvgVar = (alvg) ((alvg) alviVar.d()).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer", "updateRcsEnabledPreference", 928, "RcsSettingsFragmentV2Peer.java");
        Boolean valueOf = Boolean.valueOf(z);
        alvgVar.J("updateRcsEnabledPreference, enabled %s, rcsEnabledGlobal %s, isReadyToEnableRcsChats %s", valueOf, Boolean.valueOf(this.k), Boolean.valueOf(n()));
        ((alvg) ((alvg) alviVar.d()).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer", "setRcsEnabledPreference", 935, "RcsSettingsFragmentV2Peer.java")).t("setRcsEnabledPreference, checked %s", valueOf);
        zkw zkwVar = this.aa;
        zkwVar.getClass();
        zkwVar.a.k(z);
        if (z && ((linearLayout = zkwVar.h.a) == null || linearLayout.getVisibility() == 8)) {
            ((alvg) ((alvg) alviVar.g()).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer", "setRcsEnabledPreference", 943, "RcsSettingsFragmentV2Peer.java")).q("showing RCS sim status preference");
            LinearLayout linearLayout2 = zkwVar.h.a;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(0);
            }
        }
        if (((orb) this.V.b()).a()) {
            if (this.k) {
                p();
            } else {
                r();
            }
        }
    }

    public final void j(wiz wizVar) {
        ((alvg) ((alvg) a.d()).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer", "updateRcsGlobalToggle", 956, "RcsSettingsFragmentV2Peer.java")).t("updateRcsGlobalToggle: rcsGlobalToggleState %s", wizVar);
        ((akbo) this.G.b()).j(ahlp.l(((wih) this.R.b()).h(wizVar)), new ahlp(Integer.valueOf(wizVar.e)), this.ac);
    }

    public final void k() {
        zkw zkwVar = this.aa;
        zkwVar.getClass();
        if (((okr) this.S.b()).a() && l()) {
            f();
            if (this.q.a(this.d) == null) {
                return;
            }
        }
        RcsSimStatusPreference rcsSimStatusPreference = zkwVar.h;
        ArrayList<RcsSimStatusView> arrayList = new ArrayList();
        LinearLayout linearLayout = rcsSimStatusPreference.a;
        if (linearLayout != null) {
            int childCount = linearLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                arrayList.add((RcsSimStatusView) rcsSimStatusPreference.a.getChildAt(i));
            }
        } else if (!rcsSimStatusPreference.b.isEmpty()) {
            arrayList.addAll(rcsSimStatusPreference.b);
        }
        for (RcsSimStatusView rcsSimStatusView : arrayList) {
            adiv adivVar = rcsSimStatusView.E().b;
            amwt e = ((vrn) ((xyt) this.u.b()).a()).e(adom.n(adivVar).a);
            alvi alviVar = a;
            ((alvg) ((alvg) alviVar.d()).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer", "updateRcsSimStatusPreference", 1206, "RcsSettingsFragmentV2Peer.java")).D("updating RCS sim status for rcsProvisioningId: %s, rcsAvailability: %s", advq.SIM_ID.c(adom.n(adivVar).a), e);
            if ((new adjl(e).d() || !n()) && !((okr) this.S.b()).a()) {
                ((alvg) ((alvg) alviVar.d()).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer", "updateRcsSimStatusPreference", 1212, "RcsSettingsFragmentV2Peer.java")).t("Hiding RCS sim status preference, availability %s", e);
                zkwVar.h.ab();
            } else {
                Set q = ((wwn) this.ax.b()).q(adivVar);
                if (!q.isEmpty()) {
                    rcsSimStatusView.E().e(((adix) q.iterator().next()).a, new adjl(e));
                }
            }
        }
    }

    public final boolean l() {
        if (!this.m) {
            ((alvg) ((alvg) a.d()).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer", "allRcsSimStatusesShouldNotBeDisplayed", 1231, "RcsSettingsFragmentV2Peer.java")).q("allRcsSimStatusesShouldNotBeDisplayed: RCS SIM info has not been loaded yet");
            return false;
        }
        boolean allMatch = Collection.EL.stream(this.l).allMatch(new zko(this, 0));
        ((alvg) ((alvg) a.d()).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer", "allRcsSimStatusesShouldNotBeDisplayed", 1245, "RcsSettingsFragmentV2Peer.java")).t("allRcsSimStatusesShouldNotBeDisplayed: %s", Boolean.valueOf(allMatch));
        return allMatch;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        if (((defpackage.ykw) r9.x.b()).d("rcs_tos_state", 0) != 2) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
    
        if (r0 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
    
        if (r9.j == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        ((defpackage.alvg) ((defpackage.alvg) defpackage.zkv.a.d()).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer", "isReadyToEnableRcsChatsForAllSims", 2028, "RcsSettingsFragmentV2Peer.java")).J("isReadyToEnabledRcsChatsForAllSims: %s, googleTosAccepted: %s, hasRcsDefaultOnConsent: %s", java.lang.Boolean.valueOf(r5), java.lang.Boolean.valueOf(r0), java.lang.Boolean.valueOf(r9.j));
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        r0 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean n() {
        /*
            Method dump skipped, instructions count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zkv.n():boolean");
    }

    public final boolean o(Object obj, List list) {
        boolean z;
        boolean b2;
        String S;
        akul i;
        boolean f;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (!((okr) this.S.b()).a() && t(true) && booleanValue) {
            z = true;
        } else {
            z = false;
        }
        if (aczv.x() && aczv.X()) {
            b2 = this.o;
        } else {
            b2 = this.O.b();
        }
        if (aczv.J() && booleanValue) {
            ((akbo) this.G.b()).c(ahlp.l(((wjr) this.az.b()).b()), this.ag);
        }
        alvi alviVar = a;
        ((alvg) ((alvg) alviVar.d()).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer", "onRcsEnablePrefUpdate", 996, "RcsSettingsFragmentV2Peer.java")).I("onRcsEnablePrefUpdate : isEnabled %s, shouldShowGoogleTos %s", booleanValue, z);
        int i2 = 8;
        if (z && !b2) {
            ((alvg) ((alvg) alviVar.d()).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer", "onRcsEnablePrefUpdate", 1000, "RcsSettingsFragmentV2Peer.java")).q("onRcsEnablePrefUpdate: showing Google ToS");
            final abbj abbjVar = (abbj) this.at.b();
            final cj fe = this.q.fe();
            fe.getClass();
            final ybh ybhVar = new ybh(this, 14);
            final aaxz a2 = abbjVar.c.a(amlx.PROVISIONING_UI_TYPE_GOOGLE_TOS_FROM_SETTINGS, 2);
            abbjVar.d.c("Bugle.FastTrack.Settings.Dialog.Seen");
            ((mho) abbjVar.b.b()).S(amlw.RCS_PROVISIONING_PROMPT_SEEN, amlx.PROVISIONING_UI_TYPE_GOOGLE_TOS_FROM_SETTINGS);
            ((mho) abbjVar.b.b()).aR(21);
            String string = fe.getString(R.string.setting_fast_track_body_with_cost_v2, new Object[]{fe.getString(R.string.rcs_chats_terms_of_service), yyb.bs(fe)});
            ajgi ajgiVar = new ajgi(fe);
            ajgiVar.x(R.string.settings_fast_track_dialog_title_v2);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            a2.r(fe, spannableStringBuilder);
            ajgiVar.n(spannableStringBuilder);
            ajgiVar.j(false);
            ajgiVar.o(R.string.fast_track_negative_button_text, new aabt(abbjVar.i, "GoogleTosDialog#NegativeButtonClick", new aajo(abbjVar, 14), i2));
            ajgiVar.t(R.string.fast_track_positive_button_text, new aabt(abbjVar.i, "GoogleTosDialog#PositiveButtonClick", new DialogInterface.OnClickListener() { // from class: abbg
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    a2.q(fe, false);
                    abbj abbjVar2 = abbj.this;
                    ((mho) abbjVar2.b.b()).S(amlw.RCS_PROVISIONING_PROMPT_ACCEPTED, amlx.PROVISIONING_UI_TYPE_GOOGLE_TOS_FROM_SETTINGS);
                    abbjVar2.d.c("Bugle.FastTrack.Settings.Dialog.Accepted");
                    ybhVar.run();
                }
            }, i2));
            ev create = ajgiVar.create();
            create.show();
            View findViewById = create.findViewById(android.R.id.message);
            if (findViewById instanceof TextView) {
                TextView textView = (TextView) findViewById;
                ahnz.s(textView);
                ahnz.t(textView);
            }
            return false;
        }
        if (booleanValue) {
            if (this.i && !((nia) this.ay.b()).a()) {
                cj fe2 = this.q.fe();
                fe2.getClass();
                ajgi ajgiVar2 = new ajgi(fe2);
                ajgiVar2.y(this.q.S(R.string.disable_multidevice_dialog_title));
                ajgiVar2.n(aabr.ac(this.q.x(), this.as, this.t, R.string.disable_multidevice_dialog_message_v2, null, xxy.b));
                ajgiVar2.u(this.q.S(R.string.disable_multidevice_dialog_positive_button), new aabt((aksr) this.E.b(), "RcsSettingsFragmentV2Peer:enableMultideviceDialog:positive", new ivs(this, 15), i2));
                ajgiVar2.p(this.q.S(android.R.string.cancel), new aabt((aksr) this.E.b(), "RcsSettingsFragmentV2Peer:enableMultideviceDialog:negative", new iws(9), i2));
                ev create2 = ajgiVar2.create();
                create2.setOnShowListener(new uab(create2, 4));
                create2.show();
                return false;
            }
            akbo akboVar = (akbo) this.G.b();
            if (((pcl) this.aC.b()).a()) {
                i = ((whs) this.W.b()).d();
            } else {
                whj whjVar = (whj) this.av.b();
                String l = ((adtn) this.aw.b()).l();
                aozy createBuilder = whl.a.createBuilder();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                ((whl) createBuilder.b).b = defpackage.a.an(2);
                i = whjVar.i(l, uhy.b((whl) createBuilder.s()));
            }
            akboVar.c(ahlp.l(i), this.af);
            ((znu) this.J.b()).a(2);
            j(wiz.TOGGLE_STATE_ENABLED);
            if (aczv.x() && aczv.X()) {
                f = this.n;
            } else {
                f = actx.f();
            }
            if (f && b2) {
                ((alvg) ((alvg) alviVar.d()).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer", "onRcsEnablePrefUpdate", 1030, "RcsSettingsFragmentV2Peer.java")).q("onRcsEnablePrefUpdate: showing LegalFYI Banner");
                b();
                e();
            }
            if (((orb) this.V.b()).a() && list.size() < 2) {
                p();
            }
            return true;
        }
        if (((orb) this.V.b()).a() && list.size() < 2) {
            if (this.ah != null) {
                cj fe3 = this.q.fe();
                fe3.getClass();
                this.ah.c(new Intent(fe3, (Class<?>) TurnOffRcsActivity.class));
            }
            return false;
        }
        cj fe4 = this.q.fe();
        fe4.getClass();
        ajgi ajgiVar3 = new ajgi(fe4);
        ajgiVar3.y(this.q.S(R.string.disable_rcs_warning_title_v2));
        ajgiVar3.u(this.q.S(R.string.disable_rcs_warning_accept_text), new aabt((aksr) this.E.b(), "RcsSettingsFragmentV2Peer#onRcsEnablePrefUpdate", new ivs(this, 16), i2));
        ajgiVar3.p(this.q.S(android.R.string.cancel), null);
        if (((okr) this.S.b()).a() && list.size() > 1) {
            if (list.size() == 2) {
                if (!((wjd) list.get(0)).e.isEmpty() && !((wjd) list.get(1)).e.isEmpty()) {
                    S = this.q.T(R.string.disable_rcs_warning_text_global_level_phone_number, ((wjd) list.get(0)).e, ((wjd) list.get(1)).e);
                } else {
                    S = this.q.S(R.string.disable_rcs_warning_text_global_level_two_sims);
                }
                ajgiVar3.n(S);
            } else {
                ajgiVar3.n(this.q.S(R.string.disable_rcs_warning_text_global_level_three_or_more_sims));
            }
        }
        ajgiVar3.a();
        return false;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        int i;
        ((alvg) ((alvg) a.d()).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer", "onSharedPreferenceChanged", 1931, "RcsSettingsFragmentV2Peer.java")).t("onSharedPreferenceChanged : key = %s", str);
        if (str.equals(this.ai)) {
            int d = ((ykw) this.x.b()).d(this.ai, this.am);
            int i2 = this.g;
            cj fe = this.q.fe();
            fe.getClass();
            Resources resources = fe.getResources();
            if (i2 == 1) {
                i = R.array.rcs_fallback_to_sms_dialog_options;
            } else {
                i = R.array.rcs_fallback_to_xms_dialog_options;
            }
            String[] stringArray = resources.getStringArray(i);
            zkw zkwVar = this.aa;
            zkwVar.getClass();
            zkwVar.b.n(stringArray[d]);
            return;
        }
        if (str.equals(this.e)) {
            boolean q = ((ykw) this.x.b()).q(this.e, false);
            zkw zkwVar2 = this.aa;
            zkwVar2.getClass();
            zkwVar2.c.k(q);
            return;
        }
        if (str.equals(this.aj)) {
            h();
        } else if (str.equals(this.ak)) {
            s();
        } else if (this.f.equals(str)) {
            g();
        }
    }

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    final class a implements akbp<Void, ajwt> {
        public a() {
        }

        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
            ((alvg) ((alvg) ((alvg) zkv.a.i()).g(th)).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer$LinkedAccountCallback", "onFailure", (char) 2060, "RcsSettingsFragmentV2Peer.java")).q("Failed to load linked CMS Account");
        }

        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            ihj ihjVar = (ihj) ((Optional) ((apxx) zkv.this.M).a).get();
            Context context = zkv.this.q.d().j;
            Intent a = ihjVar.a();
            ajya.c(a, (ajwt) obj2);
            aktp.Q(zkv.this.q, a);
        }

        @Override // defpackage.akbp
        public final /* synthetic */ void b(Object obj) {
        }
    }
}
