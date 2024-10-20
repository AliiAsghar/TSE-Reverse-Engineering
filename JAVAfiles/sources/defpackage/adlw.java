package defpackage;

import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.common.internal.IGmsServiceBroker;
import com.google.android.ims.provisioning.config.Configuration;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Optional;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adlw {
    public static final acyz a = acyy.b("enable_available_msisdn_source_logging");
    public static final acyz b = acyy.b("reset_timeout_on_enter_waiting_for_otp");
    public static final acyz c = acyy.b("enable_broadcast_phone_number_input_request_for_testing");
    public static final acyz d = acyy.b("crash_on_unexpected_message_code");
    public static final acyz e = acyy.b("use_new_pev2_logger_format");
    public static final acyz f = acyy.b("disable_lookup_config_by_imsi_for_fi");
    public static final acyz g = acyy.b("disable_lookup_config_by_imsi");
    public static final acyz h = acyy.b("use_retry_after_header_to_schedule_retry");
    public static final acyz i = acyy.b("send_broadcast_to_tycho");
    public static final acyz j = acyy.b("log_provisioning_trigger");
    public static final alvi k = alvi.m("com/google/android/ims/provisioning/engine/ProvisioningEngineStateMachine");
    public static final Duration l = Duration.ofDays(30);
    public final adnt A;
    public final anen B;
    public final yjr C;
    public adkm D;
    public final adkc E;
    public final adki F;
    public final adkn G;
    public final boolean H;
    public wxb I;
    public final wwn J;
    public Optional K;
    public final xyt L;
    public final aegu M;
    public final armf N;
    public final armf O;
    public final armf P;
    public final armf Q;
    public final boolean R;
    public final armf S;
    public final boolean T;
    public final armf U;
    public final armf V;
    public final acyj W;
    public final admf X;
    public final armf Y;
    public final armf Z;
    final adll aA;
    final adll aB;
    final adll aC;
    final adll aD;
    public final acnz aE;
    public final adkd aF;
    public final adaw aG;
    public final adih aH;
    public final adea aI;
    public final adih aJ;
    public final adtl aK;
    private final adly aL;
    private final adnv aM;
    private final xyt aN;
    private final Optional aO;
    private final armf aP;
    private final armf aQ;
    private final vjs aR;
    public final armf aa;
    public amww ab;
    public String ac;
    public boolean ad;
    public final vau ae;
    final adll af;
    final adll ag;
    final adll ah;
    final adll ai;
    final adll aj;
    final adln ak;
    final adlg al;
    final adll am;
    final adll an;
    final adll ao;
    final adll ap;
    final adll aq;
    final adll ar;
    final adll as;
    final adll at;
    final adll au;
    final adll av;
    final adll aw;
    final adll ax;
    final adll ay;
    final adll az;
    final Map m;
    public String n;
    public final int o;
    public final String p;
    public int q;
    public String r;
    public final Context s;
    public final Optional t;
    public final adks u;
    public final adlx v;
    public final adtl w;
    public final adko x;
    public final Optional y;
    public final adnk z;

    public adlw(Context context, acnz acnzVar, adly adlyVar, Optional optional, adks adksVar, adlx adlxVar, adtl adtlVar, adko adkoVar, Optional optional2, adnk adnkVar, adnt adntVar, anen anenVar, yjr yjrVar, adnv adnvVar, abqa abqaVar, yjy yjyVar, adtl adtlVar2, adkc adkcVar, adih adihVar, adea adeaVar, adaw adawVar, xyt xytVar, Optional optional3, adki adkiVar, adkn adknVar, adih adihVar2, boolean z, Optional optional4, wwn wwnVar, adkd adkdVar, xyt xytVar2, vau vauVar, vjs vjsVar, arwe arweVar, arpi arpiVar, anen anenVar2, acjj acjjVar, aegu aeguVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, boolean z2, armf armfVar6, armf armfVar7, armf armfVar8, boolean z3, armf armfVar9, armf armfVar10, armf armfVar11, armf armfVar12, armf armfVar13) {
        adlc adlcVar;
        adlg adlgVar;
        adle adleVar;
        adlj adljVar;
        acyj acyjVar;
        adlq adlqVar;
        adky adkyVar;
        adlu adluVar;
        adlk adlkVar;
        adlo adloVar;
        adlt adltVar;
        adlh adlhVar;
        adln adlnVar;
        adle adleVar2;
        HashMap hashMap;
        adkv adkvVar;
        adlp adlpVar;
        adli adliVar;
        adls adlsVar;
        adlg adlgVar2;
        Context context2;
        String l2;
        int i2;
        String j2;
        wxb wxbVar;
        HashMap hashMap2 = new HashMap();
        this.m = hashMap2;
        this.q = 0;
        this.ab = amww.UNDEFINED_TRIGGER_EVENT;
        this.ac = "";
        this.ad = false;
        adkx adkxVar = new adkx(this);
        this.af = adkxVar;
        adkw adkwVar = new adkw(this);
        this.ag = adkwVar;
        adku adkuVar = new adku(this);
        this.ah = adkuVar;
        adlb adlbVar = new adlb(this);
        this.ai = adlbVar;
        adkz adkzVar = new adkz(this);
        this.aj = adkzVar;
        adln adlnVar2 = new adln(this);
        this.ak = adlnVar2;
        adlg adlgVar3 = new adlg(this);
        this.al = adlgVar3;
        adle adleVar3 = new adle(this);
        this.am = adleVar3;
        adlj adljVar2 = new adlj(this);
        this.an = adljVar2;
        adlc adlcVar2 = new adlc(this);
        this.ao = adlcVar2;
        adlt adltVar2 = new adlt(this);
        this.ap = adltVar2;
        adlo adloVar2 = new adlo(this);
        this.aq = adloVar2;
        adli adliVar2 = new adli(this);
        this.ar = adliVar2;
        adlh adlhVar2 = new adlh(this);
        this.as = adlhVar2;
        adld adldVar = new adld(this);
        this.at = adldVar;
        adkv adkvVar2 = new adkv(this);
        this.au = adkvVar2;
        adlf adlfVar = new adlf(this);
        this.av = adlfVar;
        adlq adlqVar2 = new adlq(this);
        this.aw = adlqVar2;
        adlp adlpVar2 = new adlp(this);
        this.ax = adlpVar2;
        adlv adlvVar = new adlv(this);
        this.ay = adlvVar;
        adla adlaVar = new adla(this);
        this.az = adlaVar;
        adls adlsVar2 = new adls(this);
        this.aA = adlsVar2;
        adlk adlkVar2 = new adlk(this);
        this.aB = adlkVar2;
        adky adkyVar2 = new adky(this);
        this.aC = adkyVar2;
        adlu adluVar2 = new adlu(this);
        this.aD = adluVar2;
        this.s = context;
        this.aE = acnzVar;
        this.aL = adlyVar;
        this.t = optional;
        this.u = adksVar;
        this.v = adlxVar;
        this.w = adtlVar;
        this.Z = armfVar12;
        this.aa = armfVar13;
        if (z) {
            wxb wxbVar2 = (wxb) optional4.orElseThrow();
            this.I = wxbVar2;
            adlcVar = adlcVar2;
            this.n = wxbVar2.c;
            this.o = wxbVar2.d;
            this.p = wxbVar2.f;
        } else {
            adlcVar = adlcVar2;
            this.n = adtlVar.f();
            this.o = adtlVar.b();
            this.p = adtlVar.e();
        }
        this.x = adkoVar;
        this.y = optional2;
        this.z = adnkVar;
        this.A = adntVar;
        this.B = anenVar;
        this.C = yjrVar;
        this.aM = adnvVar;
        this.K = Optional.empty();
        this.aK = adtlVar2;
        this.E = adkcVar;
        this.aJ = adihVar;
        this.aI = adeaVar;
        this.N = armfVar;
        this.O = armfVar2;
        this.P = armfVar3;
        if (((acxv) armfVar.b()).a()) {
            this.r = ((aday) armfVar2.b()).o(this.n);
        } else {
            adnu.a();
            this.r = adnu.r(context, this.n);
        }
        if (((Boolean) e.a()).booleanValue()) {
            Optional ofNullable = Optional.ofNullable((!z || (wxbVar = this.I) == null) ? null : wxbVar.p);
            wwz a2 = wwnVar.a();
            adljVar = adljVar2;
            adleVar = adleVar3;
            adlgVar = adlgVar3;
            this.D = new adkm(this.r, Optional.of(new adkl(ofNullable, this.o, this.n.equals(a2.c), this.n.equals(a2.d), this.n.equals(a2.e))));
        } else {
            adlgVar = adlgVar3;
            adleVar = adleVar3;
            adljVar = adljVar2;
            this.D = new adkm(this.r);
        }
        this.aG = adawVar;
        this.aN = xytVar;
        this.aO = optional3;
        this.F = adkiVar;
        this.G = adknVar;
        this.aH = adihVar2;
        this.H = z;
        this.J = wwnVar;
        this.aF = adkdVar;
        this.L = xytVar2;
        this.ae = vauVar;
        this.aR = vjsVar;
        acyz acyzVar = admf.a;
        if (adom.j()) {
            acyjVar = new adkt(this);
        } else {
            acyjVar = new acyj();
        }
        this.W = acyjVar;
        this.M = aeguVar;
        this.aP = armfVar4;
        this.Q = armfVar5;
        this.R = z2;
        this.S = armfVar6;
        this.aQ = armfVar7;
        this.T = z3;
        this.U = armfVar9;
        this.V = armfVar10;
        this.Y = armfVar11;
        advh.e(context, adtlVar, abqaVar, yjyVar, anenVar2, acjjVar);
        hashMap2.put("EnabledState", adkxVar);
        hashMap2.put("DisabledState", adkwVar);
        hashMap2.put("CheckPreconditionsState", adkuVar);
        hashMap2.put("WaitingForBatteryOptimizationExemptionState", adlpVar2);
        hashMap2.put("InProgressState", adkzVar);
        hashMap2.put("ReadyState", adlbVar);
        hashMap2.put("VerifyMsisdnState", adlnVar2);
        hashMap2.put("RequestWithMsisdnTokenState", adlgVar);
        hashMap2.put("RequestWithImsiState", adleVar);
        adlj adljVar3 = adljVar;
        hashMap2.put("RetryState", adljVar3);
        adlc adlcVar3 = adlcVar;
        hashMap2.put("ReplayRequestState", adlcVar3);
        hashMap2.put("RequestWithoutAuthState", adliVar2);
        hashMap2.put("RequestWithTokenState", adlhVar2);
        hashMap2.put("RequestWithHeState", adldVar);
        hashMap2.put("WaitingForOtpState", adltVar2);
        hashMap2.put("VerifyOtpState", adloVar2);
        hashMap2.put("ConfiguredState", adkvVar2);
        hashMap2.put("RequestWithMsisdnState", adlfVar);
        hashMap2.put("WaitingForGoogleTosState", adlqVar2);
        hashMap2.put("WaitingForTermsAndConditionsState", adlvVar);
        hashMap2.put("ProcessConfigurationState", adlaVar);
        hashMap2.put("WaitingForManualMsisdnEntryState", adlsVar2);
        hashMap2.put("SetGoogleToSConsentState", adlkVar2);
        hashMap2.put("GetGoogleToSConsentState", adkyVar2);
        hashMap2.put("WaitingForRcsDefaultOnState", adluVar2);
        if (adom.j()) {
            acyjVar.e(adkxVar);
            acyjVar.f(adkuVar, adkxVar);
            acyjVar.f(adlqVar2, adkuVar);
            acyjVar.f(adlkVar2, adkuVar);
            acyjVar.f(adkyVar2, adkuVar);
            acyjVar.f(adlpVar2, adkuVar);
            acyjVar.f(adluVar2, adkuVar);
            acyjVar.e(adkwVar);
            acyjVar.e(adkzVar);
            acyjVar.e(adljVar3);
            acyjVar.e(adlcVar3);
            acyjVar.e(adkvVar2);
            acyjVar.f(adlbVar, adkzVar);
            adlnVar = adlnVar2;
            acyjVar.f(adlnVar, adkzVar);
            hashMap = hashMap2;
            adlgVar2 = adlgVar;
            acyjVar.f(adlgVar2, adkzVar);
            adluVar = adluVar2;
            adleVar2 = adleVar;
            acyjVar.f(adleVar2, adkzVar);
            adkyVar = adkyVar2;
            adltVar = adltVar2;
            acyjVar.f(adltVar, adkzVar);
            adlkVar = adlkVar2;
            adloVar = adloVar2;
            acyjVar.f(adloVar, adkzVar);
            adlpVar = adlpVar2;
            adliVar = adliVar2;
            acyjVar.f(adliVar, adkzVar);
            adlqVar = adlqVar2;
            adlhVar = adlhVar2;
            acyjVar.f(adlhVar, adkzVar);
            adkvVar = adkvVar2;
            acyjVar.f(adldVar, adkzVar);
            acyjVar.f(adlfVar, adkzVar);
            acyjVar.f(adlvVar, adkzVar);
            acyjVar.f(adlaVar, adkzVar);
            adlsVar = adlsVar2;
            acyjVar.f(adlsVar, adkzVar);
        } else {
            adlqVar = adlqVar2;
            adkyVar = adkyVar2;
            adluVar = adluVar2;
            adlkVar = adlkVar2;
            adloVar = adloVar2;
            adltVar = adltVar2;
            adlhVar = adlhVar2;
            adlnVar = adlnVar2;
            adleVar2 = adleVar;
            hashMap = hashMap2;
            adkvVar = adkvVar2;
            adlpVar = adlpVar2;
            adliVar = adliVar2;
            adlsVar = adlsVar2;
            adlgVar2 = adlgVar;
        }
        if (arweVar == null) {
            throw new NullPointerException("Null blockingScope");
        }
        if (arpiVar != null) {
            admj admjVar = new admj(arweVar, arpiVar, adkxVar, adkwVar, adkuVar, adlbVar, adkzVar, adlnVar, adlgVar2, adleVar2, adljVar3, adlcVar3, adltVar, adloVar, adliVar, adlhVar, adldVar, adkvVar, adlfVar, adlqVar, adlpVar, adlvVar, adlaVar, adlsVar, adlkVar, adkyVar, adluVar);
            String str = admjVar.a;
            alok alokVar = new alok();
            alokVar.h(apkn.RCS_PROVISIONING_ENABLED_STATE, admjVar.d);
            alokVar.h(apkn.RCS_PROVISIONING_DISABLED_STATE, admjVar.e);
            alokVar.h(apkn.RCS_PROVISIONING_CHECK_PRECONDITIONS_STATE, admjVar.f);
            alokVar.h(apkn.RCS_PROVISIONING_READY_STATE, admjVar.g);
            alokVar.h(apkn.RCS_PROVISIONING_IN_PROGRESS_STATE, admjVar.h);
            alokVar.h(apkn.RCS_PROVISIONING_VERIFY_MSISDN_STATE, admjVar.i);
            alokVar.h(apkn.RCS_PROVISIONING_REQUEST_WITH_MSISDN_TOKEN_STATE, admjVar.j);
            alokVar.h(apkn.RCS_PROVISIONING_REQUEST_WITH_IMSI_STATE, admjVar.k);
            alokVar.h(apkn.RCS_PROVISIONING_RETRY_STATE, admjVar.l);
            alokVar.h(apkn.RCS_PROVISIONING_REPLAY_REQUEST_STATE, admjVar.m);
            alokVar.h(apkn.RCS_PROVISIONING_WAITING_FOR_OTP_STATE, admjVar.n);
            alokVar.h(apkn.RCS_PROVISIONING_VERIFY_OTP_STATE, admjVar.o);
            alokVar.h(apkn.RCS_PROVISIONING_REQUEST_WITHOUT_AUTH_STATE, admjVar.p);
            alokVar.h(apkn.RCS_PROVISIONING_REQUEST_WITH_TOKEN_STATE, admjVar.q);
            alokVar.h(apkn.RCS_PROVISIONING_REQUEST_WITH_HE_STATE, admjVar.r);
            alokVar.h(apkn.RCS_PROVISIONING_CONFIGURED_STATE, admjVar.s);
            alokVar.h(apkn.RCS_PROVISIONING_REQUEST_WITH_MSISDN_STATE, admjVar.t);
            alokVar.h(apkn.RCS_PROVISIONING_WAITING_FOR_GOOGLE_TOS_STATE, admjVar.u);
            alokVar.h(apkn.RCS_PROVISIONING_WAITING_FOR_BATTERY_OPTIMIZATION_STATE, admjVar.v);
            alokVar.h(apkn.RCS_PROVISIONING_WAITING_FOR_TERMS_AND_CONDITIONS_STATE, admjVar.w);
            alokVar.h(apkn.RCS_PROVISIONING_PROCESS_CONFIGURATION_STATE, admjVar.x);
            alokVar.h(apkn.RCS_PROVISIONING_WAITING_FOR_MANUAL_MSISDN_ENTRY_STATE, admjVar.y);
            alokVar.h(apkn.RCS_PROVISIONING_SET_GOOGLE_TOS_CONSENT_STATE, admjVar.z);
            alokVar.h(apkn.RCS_PROVISIONING_GET_GOOGLE_TOS_CONSENT_STATE, admjVar.A);
            alokVar.h(apkn.RCS_PROVISIONING_WAITING_FOR_RCS_DEFAULT_ON_STATE, admjVar.B);
            alor b2 = alokVar.b();
            alok alokVar2 = new alok();
            alokVar2.h(apkn.RCS_PROVISIONING_CHECK_PRECONDITIONS_STATE, apkn.RCS_PROVISIONING_ENABLED_STATE);
            alokVar2.h(apkn.RCS_PROVISIONING_WAITING_FOR_GOOGLE_TOS_STATE, apkn.RCS_PROVISIONING_CHECK_PRECONDITIONS_STATE);
            alokVar2.h(apkn.RCS_PROVISIONING_SET_GOOGLE_TOS_CONSENT_STATE, apkn.RCS_PROVISIONING_CHECK_PRECONDITIONS_STATE);
            alokVar2.h(apkn.RCS_PROVISIONING_GET_GOOGLE_TOS_CONSENT_STATE, apkn.RCS_PROVISIONING_CHECK_PRECONDITIONS_STATE);
            alokVar2.h(apkn.RCS_PROVISIONING_WAITING_FOR_BATTERY_OPTIMIZATION_STATE, apkn.RCS_PROVISIONING_CHECK_PRECONDITIONS_STATE);
            alokVar2.h(apkn.RCS_PROVISIONING_WAITING_FOR_RCS_DEFAULT_ON_STATE, apkn.RCS_PROVISIONING_CHECK_PRECONDITIONS_STATE);
            alokVar2.h(apkn.RCS_PROVISIONING_READY_STATE, apkn.RCS_PROVISIONING_IN_PROGRESS_STATE);
            alokVar2.h(apkn.RCS_PROVISIONING_VERIFY_MSISDN_STATE, apkn.RCS_PROVISIONING_IN_PROGRESS_STATE);
            alokVar2.h(apkn.RCS_PROVISIONING_REQUEST_WITH_MSISDN_TOKEN_STATE, apkn.RCS_PROVISIONING_IN_PROGRESS_STATE);
            alokVar2.h(apkn.RCS_PROVISIONING_REQUEST_WITH_IMSI_STATE, apkn.RCS_PROVISIONING_IN_PROGRESS_STATE);
            alokVar2.h(apkn.RCS_PROVISIONING_WAITING_FOR_OTP_STATE, apkn.RCS_PROVISIONING_IN_PROGRESS_STATE);
            alokVar2.h(apkn.RCS_PROVISIONING_VERIFY_OTP_STATE, apkn.RCS_PROVISIONING_IN_PROGRESS_STATE);
            alokVar2.h(apkn.RCS_PROVISIONING_REQUEST_WITHOUT_AUTH_STATE, apkn.RCS_PROVISIONING_IN_PROGRESS_STATE);
            alokVar2.h(apkn.RCS_PROVISIONING_REQUEST_WITH_TOKEN_STATE, apkn.RCS_PROVISIONING_IN_PROGRESS_STATE);
            alokVar2.h(apkn.RCS_PROVISIONING_REQUEST_WITH_HE_STATE, apkn.RCS_PROVISIONING_IN_PROGRESS_STATE);
            alokVar2.h(apkn.RCS_PROVISIONING_REQUEST_WITH_MSISDN_STATE, apkn.RCS_PROVISIONING_IN_PROGRESS_STATE);
            alokVar2.h(apkn.RCS_PROVISIONING_WAITING_FOR_TERMS_AND_CONDITIONS_STATE, apkn.RCS_PROVISIONING_IN_PROGRESS_STATE);
            alokVar2.h(apkn.RCS_PROVISIONING_PROCESS_CONFIGURATION_STATE, apkn.RCS_PROVISIONING_IN_PROGRESS_STATE);
            alokVar2.h(apkn.RCS_PROVISIONING_WAITING_FOR_MANUAL_MSISDN_ENTRY_STATE, apkn.RCS_PROVISIONING_IN_PROGRESS_STATE);
            this.X = new admf(str, b2, alokVar2.b(), admjVar.b, admjVar.c);
            this.D.a("Creating PEv2. SIM id %s", advq.SIM_ID.c(this.n));
            if (((acuo) armfVar8.b()).a()) {
                Z(adkxVar);
            }
            if (((acxv) armfVar.b()).a()) {
                l2 = ((aday) armfVar2.b()).p(this.n);
                context2 = context;
            } else {
                adnu.a();
                context2 = context;
                l2 = adnu.l(context2, this.n);
            }
            if (TextUtils.isEmpty(l2)) {
                i2 = 0;
            } else {
                this.D.a("Saved provisioning state is %s", l2);
                adll adllVar = (adll) hashMap.get(l2);
                if (adllVar != null && adllVar.i()) {
                    this.D.a("Restoring initial state to %s", l2);
                    if (((acxv) armfVar.b()).a()) {
                        j2 = ((aday) armfVar2.b()).m(this.n);
                    } else {
                        adnu.a();
                        j2 = adnu.j(context2, this.n);
                    }
                    this.r = j2;
                    this.D = new adkm(j2);
                    if (((acxv) armfVar.b()).a()) {
                        ((aday) armfVar2.b()).r(this.n, false);
                        ((aday) armfVar2.b()).t(this.n, null);
                        return;
                    } else {
                        adnu.a();
                        adnu.o(context2, this.n, false);
                        adnu.a();
                        adnu.q(context2, this.n, null);
                        return;
                    }
                }
                i2 = 0;
            }
            this.D.a("Setting initial state to enabled", new Object[i2]);
            Z(adkxVar);
            return;
        }
        throw new NullPointerException("Null blockingContext");
    }

    static final int aE(int i2) {
        int i3 = i2 - 1;
        if (i3 == 1) {
            return 3;
        }
        if (i3 == 2) {
            return 4;
        }
        if (i3 != 3) {
            if (i3 != 4) {
                return 1;
            }
            return 7;
        }
        return 5;
    }

    static final boolean aF(int i2) {
        int i3 = i2 - 1;
        if (i3 == 1 || i3 == 2 || i3 == 3 || i3 == 4) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void aG(adlw adlwVar) {
        String aJ = adlwVar.aJ();
        adlwVar.aE.n(adlwVar.s, new wxx(adlwVar, 20), aJ, 2, 0, adlwVar.r);
    }

    private final String aJ() {
        if (aczv.x() && aczv.W() && this.H) {
            return (String) this.aM.d(this.n).orElse("");
        }
        return (String) this.aM.c().orElse("");
    }

    private final void aK(Context context, String str, boolean z) {
        if (((acxv) this.N.b()).a()) {
            ((aday) this.O.b()).r(str, z);
        } else {
            adnu.a();
            adnu.o(context, str, z);
        }
    }

    private final int aL() {
        if (aczv.x() && aczv.W() && this.H) {
            return this.aM.j(Optional.of(this.n));
        }
        return this.aM.i();
    }

    private static final int aM(int i2) {
        int i3 = i2 - 2;
        if (i3 != 1) {
            if (i3 == 2) {
                return 1;
            }
            if (i3 != 4) {
                return 2;
            }
            return 3;
        }
        return 0;
    }

    public static final adjj av(Message message) {
        adjj adjjVar;
        int i2 = message.what;
        if (i2 != -20000) {
            if (i2 != 3000) {
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 != 2000) {
                                    if (i2 != 2001) {
                                        switch (i2) {
                                            case 5:
                                                adjjVar = adjj.MSG_HTTP_RESPONSE;
                                                break;
                                            case 6:
                                                adjjVar = adjj.MSG_CONSENT_GRANTED;
                                                break;
                                            case 7:
                                                adjjVar = adjj.MSG_SEND_CONFIG_REQUEST;
                                                break;
                                            case 8:
                                                adjjVar = adjj.MSG_RECEIVED_OTP;
                                                break;
                                            case 9:
                                                adjjVar = adjj.MSG_TIMEOUT;
                                                break;
                                            case 10:
                                                adjjVar = adjj.MSG_EXCEPTION_CAUGHT;
                                                break;
                                            case 11:
                                                adjjVar = adjj.MSG_RETRY_AFTER;
                                                break;
                                            case 12:
                                                adjjVar = adjj.MSG_REFRESH_CONFIG;
                                                break;
                                            case 13:
                                                adjjVar = adjj.MSG_CONFIG_DOC;
                                                break;
                                            case 14:
                                                adjjVar = adjj.MSG_RETRY_PROVISIONING;
                                                break;
                                            case 15:
                                                adjjVar = adjj.MSG_VERIFY_NUMBER_SUCCESS;
                                                break;
                                            case 16:
                                                adjjVar = adjj.MSG_VERIFY_NUMBER_FAILURE;
                                                break;
                                            case 17:
                                                adjjVar = adjj.MSG_GOOGLE_TOS_ACCEPTED;
                                                break;
                                            default:
                                                switch (i2) {
                                                    case 19:
                                                        adjjVar = adjj.MSG_T_AND_C_ACCEPTED;
                                                        break;
                                                    case 20:
                                                        adjjVar = adjj.MSG_T_AND_C_REJECTED;
                                                        break;
                                                    case 21:
                                                        adjjVar = adjj.MSG_BOEW_GRANTED;
                                                        break;
                                                    case 22:
                                                        adjjVar = adjj.MSG_SEND_CONFIG_REQUEST_OVER_MOBILE_NETWORK;
                                                        break;
                                                    case 23:
                                                        adjjVar = adjj.MSG_MOBILE_NETWORK_NOT_AVAILABLE;
                                                        break;
                                                    case 24:
                                                        adjjVar = adjj.MSG_HTTP_IO_EXCEPTION;
                                                        break;
                                                    case 25:
                                                        adjjVar = adjj.MSG_MSISDN_RECEIVED;
                                                        break;
                                                    case 26:
                                                        adjjVar = adjj.MSG_SOCKET_TIMEOUT_EXCEPTION;
                                                        break;
                                                    case 27:
                                                        adjjVar = adjj.MSG_RECONFIGURATION_REQUIRED;
                                                        break;
                                                    case 28:
                                                        adjjVar = adjj.MSG_REPLAY_REQUEST;
                                                        break;
                                                    case ahby.ERROR_VENDOR_IMS_NOT_FOUND /* 29 */:
                                                        adjjVar = adjj.MSG_OTP_TIMEOUT;
                                                        break;
                                                    case 30:
                                                        adjjVar = adjj.MSG_GOOGLE_TOS_DECLINED;
                                                        break;
                                                    case 31:
                                                        adjjVar = adjj.MSG_VERIFY_OTP;
                                                        break;
                                                    case 32:
                                                        adjjVar = adjj.MSG_CONFIG_DOC_DISABLE_RCS;
                                                        break;
                                                    case IGmsServiceBroker.Stub.TRANSACTION_GET_CLOUD_SAVE_SERVICE /* 33 */:
                                                        adjjVar = adjj.MSG_IMS_MODULE_TERMINATED;
                                                        break;
                                                    case IGmsServiceBroker.Stub.TRANSACTION_GET_UDC_SERVICE /* 34 */:
                                                        adjjVar = adjj.MSG_IMS_DEREGISTRATION_TIMEOUT;
                                                        break;
                                                    case IGmsServiceBroker.Stub.TRANSACTION_GET_SEARCH_CORPORA_SERVICE /* 35 */:
                                                        adjjVar = adjj.MSG_MO_ENABLED_FROM_PH_NUM_UI;
                                                        break;
                                                    case IGmsServiceBroker.Stub.TRANSACTION_GET_DEVICE_MANAGER_SERVICE /* 36 */:
                                                        adjjVar = adjj.MSG_SET_CONSENT_API_SUCCESS;
                                                        break;
                                                    case IGmsServiceBroker.Stub.TRANSACTION_GET_PSEUDONYMOUS_ID_SERVICE /* 37 */:
                                                        adjjVar = adjj.MSG_SET_CONSENT_API_ERROR;
                                                        break;
                                                    case IGmsServiceBroker.Stub.TRANSACTION_GET_REMINDERS_SERVICE /* 38 */:
                                                        adjjVar = adjj.MSG_GET_CONSENT_API_SUCCESS;
                                                        break;
                                                    case 39:
                                                        adjjVar = adjj.MSG_GET_CONSENT_API_ERROR;
                                                        break;
                                                    case IGmsServiceBroker.Stub.TRANSACTION_GET_COMMON_SERVICE /* 40 */:
                                                        adjjVar = adjj.MSG_SET_CONSENT_COMPLETE;
                                                        break;
                                                    case IGmsServiceBroker.Stub.TRANSACTION_GET_CLEARCUT_LOGGER_SERVICE /* 41 */:
                                                        adjjVar = adjj.MSG_GET_CONSENT_COMPLETE;
                                                        break;
                                                    default:
                                                        switch (i2) {
                                                            case 1000:
                                                                adjjVar = adjj.MSG_HTTP_RESPONSE_UNKNOWN;
                                                                break;
                                                            case 1001:
                                                                adjjVar = adjj.MSG_HTTP_200_OK;
                                                                break;
                                                            case 1002:
                                                                adjjVar = adjj.MSG_HTTP_403_FORBIDDEN;
                                                                break;
                                                            case 1003:
                                                                adjjVar = adjj.MSG_HTTP_511_AUTH_REQUIRED;
                                                                break;
                                                            case 1004:
                                                                adjjVar = adjj.MSG_HTTP_503_UNAVAILABLE;
                                                                break;
                                                            case 1005:
                                                                adjjVar = adjj.MSG_HTTP_400_BAD_REQUEST;
                                                                break;
                                                            case 1006:
                                                                adjjVar = adjj.MSG_HTTP_401_UNAUTHORIZED;
                                                                break;
                                                            case 1007:
                                                                adjjVar = adjj.MSG_HTTP_429_TOO_MANY_REQUESTS;
                                                                break;
                                                            case 1008:
                                                                adjjVar = adjj.MSG_HTTP_501_NOT_SUPPORTED;
                                                                break;
                                                            case 1009:
                                                                adjjVar = adjj.MSG_HTTP_504_GATEWAY_TIMEOUT;
                                                                break;
                                                            case 1010:
                                                                adjjVar = adjj.MSG_HTTP_405_METHOD_NOT_ALLOWED;
                                                                break;
                                                            default:
                                                                switch (i2) {
                                                                    case 2003:
                                                                        adjjVar = adjj.MSG_TRANSITION_TO_DISABLED;
                                                                        break;
                                                                    case 2004:
                                                                        adjjVar = adjj.MSG_TRANSITION_TO_CHECK_PRECONDITIONS;
                                                                        break;
                                                                    case 2005:
                                                                        adjjVar = adjj.MSG_TRANSITION_TO_READY;
                                                                        break;
                                                                    case 2006:
                                                                        adjjVar = adjj.MSG_TRANSITION_TO_IN_PROGRESS;
                                                                        break;
                                                                    case 2007:
                                                                        adjjVar = adjj.MSG_TRANSITION_TO_REQUEST_WITH_IMSI;
                                                                        break;
                                                                    default:
                                                                        switch (i2) {
                                                                            case 2009:
                                                                                adjjVar = adjj.MSG_TRANSITION_TO_RETRY;
                                                                                break;
                                                                            case 2010:
                                                                                adjjVar = adjj.MSG_TRANSITION_TO_REPLAY_REQUEST;
                                                                                break;
                                                                            case 2011:
                                                                                adjjVar = adjj.MSG_TRANSITION_TO_WAITING_FOR_CONSENT_FOR_IMSI_REQUEST;
                                                                                break;
                                                                            case 2012:
                                                                                adjjVar = adjj.MSG_TRANSITION_TO_WAITING_FOR_OTP;
                                                                                break;
                                                                            case 2013:
                                                                                adjjVar = adjj.MSG_TRANSITION_TO_VERIFY_OTP;
                                                                                break;
                                                                            case 2014:
                                                                                adjjVar = adjj.MSG_TRANSITION_TO_REQUEST_WITHOUT_AUTH;
                                                                                break;
                                                                            case 2015:
                                                                                adjjVar = adjj.MSG_TRANSITION_TO_REQUEST_WITH_TOKEN;
                                                                                break;
                                                                            case 2016:
                                                                                adjjVar = adjj.MSG_TRANSITION_TO_REQUEST_WITH_HE;
                                                                                break;
                                                                            case 2017:
                                                                                adjjVar = adjj.MSG_TRANSITION_TO_CONFIGURED;
                                                                                break;
                                                                            case 2018:
                                                                                adjjVar = adjj.MSG_TRANSITION_TO_REQUEST_WITH_MSISDN;
                                                                                break;
                                                                            case 2019:
                                                                                adjjVar = adjj.MSG_TRANSITION_TO_WAITING_FOR_GOOGLE_TOS;
                                                                                break;
                                                                            case 2020:
                                                                                adjjVar = adjj.MSG_TRANSITION_TO_WAITING_FOR_BATTERY_OPT;
                                                                                break;
                                                                            case 2021:
                                                                                adjjVar = adjj.MSG_TRANSITION_TO_WAITING_FOR_TOS;
                                                                                break;
                                                                            case 2022:
                                                                                adjjVar = adjj.MSG_TRANSITION_TO_PROCESS_CONFIGURATION;
                                                                                break;
                                                                            case 2023:
                                                                                adjjVar = adjj.MSG_TRANSITION_TO_WAITING_FOR_MANUAL_MSISDN;
                                                                                break;
                                                                            case 2024:
                                                                                adjjVar = adjj.MSG_TRANSITION_TO_SEND_DISABLE_RCS;
                                                                                break;
                                                                            case 2025:
                                                                                adjjVar = adjj.MSG_TRANSITION_TO_SET_GOOGLE_TOS_CONSENT;
                                                                                break;
                                                                            case 2026:
                                                                                adjjVar = adjj.MSG_TRANSITION_TO_GET_GOOGLE_TOS_CONSENT;
                                                                                break;
                                                                            case 2027:
                                                                                adjjVar = adjj.MSG_TRANSITION_TO_REQUEST_WITH_MSISDN_TOKEN;
                                                                                break;
                                                                            case 2028:
                                                                                adjjVar = adjj.MSG_TRANSITION_TO_VERIFY_MSISDN;
                                                                                break;
                                                                            case 2029:
                                                                                adjjVar = adjj.MSG_TRANSITION_TO_WAITING_FOR_RCS_DEFAULT_ON;
                                                                                break;
                                                                            default:
                                                                                adjjVar = null;
                                                                                break;
                                                                        }
                                                                }
                                                        }
                                                }
                                        }
                                    } else {
                                        adjjVar = adjj.MSG_TRANSITION_TO_ENABLED;
                                    }
                                } else {
                                    adjjVar = adjj.MSG_ARG_TRANSITION_MSG;
                                }
                            } else {
                                adjjVar = adjj.MSG_SIM_EVENT;
                            }
                        } else {
                            adjjVar = adjj.MSG_PROVISIONING_REQUESTED;
                        }
                    } else {
                        adjjVar = adjj.MSG_RCS_AVAILABILITY_UPDATED;
                    }
                } else {
                    adjjVar = adjj.MSG_UNKNOWN_DO_NOT_USE;
                }
            } else {
                adjjVar = adjj.MSG_USE_ANDROID_OS_MESSAGE;
            }
        } else {
            adjjVar = adjj.MSG_FORCE_TRANSITION_NOW;
        }
        if (adjjVar == null) {
            if (!((Boolean) d.a()).booleanValue()) {
                return adjj.MSG_UNKNOWN_DO_NOT_USE;
            }
            throw new IllegalArgumentException("Invalid message code for StateMachineMessage: " + message.what);
        }
        return adjjVar;
    }

    public static final String aw(adjj adjjVar) {
        switch (adjjVar.ordinal()) {
            case 1:
                return "Availability updated";
            case 2:
                return "Provisioning requested";
            case 3:
                return "SIM event";
            case 4:
                return "HTTP Response";
            case 5:
                return "Consent granted";
            case 6:
                return "Send config request";
            case 7:
                return "Received OTP";
            case 8:
                return "Timeout";
            case 9:
                return "Exception caught";
            case 10:
                return "Retry after";
            case 11:
                return "Refresh config";
            case 12:
                return "Config document received";
            case 13:
                return "Retry provisioning";
            case 14:
                return "Verify number - success";
            case 15:
                return "Verify number - failure";
            case 16:
                return "Google ToS accepted";
            case 17:
                return "T&Cs accepted";
            case 18:
                return "T&Cs rejected";
            case 19:
                return "BOEW granted";
            case 20:
                return "Send config request over Mobile network";
            case 21:
                return "Mobile network is not available";
            case 22:
                return "HTTP IO exception while requested";
            case 23:
                return "MSISDN received from manual MSISDN entry";
            case 24:
                return "Socket Timeout exception while requested";
            case 25:
                return "Reconfiguration required";
            case 26:
                return "Replay last request";
            case 27:
                return "Timed out waiting for OTP";
            case 28:
                return "Google ToS Declined";
            case ahby.ERROR_VENDOR_IMS_NOT_FOUND /* 29 */:
                return "Verify OTP";
            case 30:
            case 51:
            case 79:
            default:
                throw new IllegalArgumentException("Unknown message");
            case 31:
                return "Ims Module Terminated";
            case 32:
                return "Ims Deregistration Timeout";
            case IGmsServiceBroker.Stub.TRANSACTION_GET_CLOUD_SAVE_SERVICE /* 33 */:
                return "MO consent granted from the PhoneNumberInput UI";
            case IGmsServiceBroker.Stub.TRANSACTION_GET_UDC_SERVICE /* 34 */:
                return "Set Consent API succeed";
            case IGmsServiceBroker.Stub.TRANSACTION_GET_SEARCH_CORPORA_SERVICE /* 35 */:
                return "Set Consent API error";
            case IGmsServiceBroker.Stub.TRANSACTION_GET_DEVICE_MANAGER_SERVICE /* 36 */:
                return "Get Consent API succeed";
            case IGmsServiceBroker.Stub.TRANSACTION_GET_PSEUDONYMOUS_ID_SERVICE /* 37 */:
                return "Get Consent API error";
            case IGmsServiceBroker.Stub.TRANSACTION_GET_REMINDERS_SERVICE /* 38 */:
                return "Set Consent complete";
            case 39:
                return "Get Consent complete";
            case IGmsServiceBroker.Stub.TRANSACTION_GET_COMMON_SERVICE /* 40 */:
                return "Unknown HTTP response";
            case IGmsServiceBroker.Stub.TRANSACTION_GET_CLEARCUT_LOGGER_SERVICE /* 41 */:
                return "HTTP 200 (OK)";
            case IGmsServiceBroker.Stub.TRANSACTION_GET_WALLET_SERVICE_WITH_PACKAGE /* 42 */:
                return "HTTP 403 (Forbidden)";
            case IGmsServiceBroker.Stub.TRANSACTION_GET_USAGE_REPORTING_SERVICE /* 43 */:
                return "HTTP 511 (Auth required)";
            case IGmsServiceBroker.Stub.TRANSACTION_GET_DEVICE_CONNECTION_SERVICE /* 44 */:
                return "HTTP 503 (Unavailable)";
            case IGmsServiceBroker.Stub.TRANSACTION_GET_KIDS_SERVICE /* 45 */:
                return "HTTP 400 (Bad request)";
            case IGmsServiceBroker.Stub.TRANSACTION_GET_SERVICE /* 46 */:
                return "HTTP 401 (Unauthorized)";
            case IGmsServiceBroker.Stub.TRANSACTION_VALIDATE_ACCOUNT /* 47 */:
                return "HTTP 429 (Too many requests)";
            case 48:
                return "HTTP 501 (Not supported)";
            case 49:
                return "HTTP 504 (Gateway timeout)";
            case 50:
                return "HTTP 405 (Method Not Allowed)";
            case 52:
                return "Transition to enabled";
            case 53:
                return "Transition to disabled";
            case 54:
                return "Transition to check preconditions";
            case 55:
                return "Transition to ready";
            case 56:
                return "Transition to in progress";
            case 57:
                return "Transition to request with imsi";
            case 58:
                return "Transition to retry";
            case 59:
                return "Transition to replay request";
            case 60:
                return "Transition to waiting for consent for IMSI request";
            case 61:
                return "Transition to waiting for OTP";
            case 62:
                return "Transition to verify OTP";
            case 63:
                return "Transition to request with auth";
            case 64:
                return "Transition to request with token";
            case 65:
                return "Transition to request with HE";
            case 66:
                return "Transition to configured";
            case 67:
                return "Transition to request with MSISDN";
            case 68:
                return "Transition to waiting for Google TOS";
            case 69:
                return "Transition to waiting for battery opt exemption";
            case 70:
                return "Transition to waiting for TOS";
            case 71:
                return "Transition to process configuration";
            case 72:
                return "Transition to waiting for manual MSISDN entry";
            case 73:
                return "Transition to send disable rcs";
            case 74:
                return "Transition to set Google ToS Consent";
            case 75:
                return "Transition to get Google ToS Consent";
            case 76:
                return "Transition to request with MSISDN token";
            case 77:
                return "Transition to verify MSISDN";
            case 78:
                return "Transition to Waiting For RCS Default On";
            case 80:
                return "Force transition now";
        }
    }

    public static final void ax(adkf adkfVar, List list) {
        Collection.EL.stream(list).filter(new addf(14)).findFirst().ifPresent(new adgr(adkfVar, 11));
    }

    public static apkk m(int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 3) {
                    return apkk.CONSENT_REASON_UNKNOWN;
                }
                return apkk.IMEI_PII_FORMAT_IGNORED;
            }
            return apkk.IMEI_PII_FORMAT_SHORT;
        }
        return apkk.IMEI_PII_FORMAT_NONE;
    }

    public static String s(Message message) {
        d.t(message.obj instanceof String, "expected OTP to be string");
        return (String) message.obj;
    }

    public final void A(Message message) {
        String str;
        if (message.obj instanceof HttpURLConnection) {
            adks adksVar = this.u;
            HttpURLConnection httpURLConnection = (HttpURLConnection) message.obj;
            acyz acyzVar = admf.a;
            if (adom.i()) {
                str = this.X.e;
            } else {
                str = this.W.a;
            }
            adksVar.a(httpURLConnection, null, str);
        }
    }

    public final void B(adjj adjjVar, Object obj) {
        acyz acyzVar = admf.a;
        if (adom.k()) {
            this.X.g(adjjVar, new arbj((Integer) null, (Integer) null, obj));
        }
        if (adom.j()) {
            acyj acyjVar = this.W;
            acyjVar.g(acyjVar.b(adjjVar.a(), obj));
        }
    }

    public final void C(adjj adjjVar, int i2, int i3, Object obj) {
        acyz acyzVar = admf.a;
        if (adom.k()) {
            this.X.g(adjjVar, new arbj(Integer.valueOf(i2), Integer.valueOf(i3), obj));
        }
        if (adom.j()) {
            acyj acyjVar = this.W;
            acyjVar.g(acyjVar.c(adjjVar.a(), i2, i3, obj));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void D(apjx apjxVar) {
        boolean i2;
        if (((acxv) this.N.b()).a()) {
            i2 = ((aday) this.O.b()).x(this.n);
        } else {
            Context context = this.s;
            adnu.a();
            i2 = adnu.i(context, this.n);
        }
        this.A.k(apjxVar, this.r, Boolean.valueOf(i2), this.n);
    }

    public final void E() {
        adnt adntVar = this.A;
        Optional p = p();
        advr.c("finishProvisioningStage for SIM: %s", advq.SIM_ID.c(adntVar.e(p)));
        if (adntVar.i(adntVar.e(p))) {
            return;
        }
        adntVar.s(new adhe(adntVar, 10), p);
    }

    public final void F() {
        boolean booleanValue;
        adjl j2 = j();
        if (j2.d()) {
            aD(47);
            if (j2.a == amwt.DISABLED_VIA_FLAGS) {
                if (aczv.x() && aczv.W()) {
                    int aT = a.aT(this.ae.c(this.n).g);
                    if (aT != 0 && aT == 4) {
                        booleanValue = false;
                    } else {
                        booleanValue = true;
                    }
                } else {
                    booleanValue = ((Boolean) acpq.E().v().a()).booleanValue();
                }
                if (!booleanValue) {
                    this.D.d("Clearing local RCS Configuration.", new Object[0]);
                    this.z.u(this.n, new Configuration());
                }
            }
            ac(this.ag);
        }
    }

    public final void G(Message message) {
        String str;
        if (aczv.R() && !aq(message)) {
            A(message);
            return;
        }
        if (message.obj instanceof HttpURLConnection) {
            str = ((HttpURLConnection) message.obj).getHeaderField("Retry-After");
            this.D.d("Connection unavailable. Retry in %s seconds", str);
        } else {
            this.D.d("Connection unavailable. Retry", new Object[0]);
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                B(adjj.MSG_RETRY_AFTER, Integer.valueOf(Integer.parseInt(str)));
            } catch (NumberFormatException unused) {
                this.D.b("Failed to parse Retry-After header: %s", str);
            }
        }
        ac(this.ao);
    }

    public final void H(final String str) {
        final int aL = aL();
        Optional p = p();
        adns adnsVar = new adns() { // from class: adno
            @Override // defpackage.adns
            public final void a(aozy aozyVar) {
                alor alorVar = adnt.a;
                if (!aozyVar.b.isMutable()) {
                    aozyVar.u();
                }
                String str2 = str;
                apjr apjrVar = (apjr) aozyVar.b;
                apjr apjrVar2 = apjr.a;
                str2.getClass();
                apjrVar.b |= 524288;
                apjrVar.w = str2;
                if (!aozyVar.b.isMutable()) {
                    aozyVar.u();
                }
                int i2 = aL;
                apag apagVar = aozyVar.b;
                apjr apjrVar3 = (apjr) apagVar;
                apjrVar3.v = i2 - 1;
                apjrVar3.b |= 262144;
                if (!apagVar.isMutable()) {
                    aozyVar.u();
                }
                apjr apjrVar4 = (apjr) aozyVar.b;
                apjrVar4.u = 1;
                apjrVar4.b |= 131072;
            }
        };
        adnt adntVar = this.A;
        adntVar.r(adnsVar, adntVar.e(p));
        apkn n = n();
        String str2 = this.r;
        adiw adiwVar = new adiw(this.n);
        aozy createBuilder = apjl.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        apjl apjlVar = (apjl) apagVar;
        apjlVar.c = n.H;
        apjlVar.b |= 1;
        if (str == null) {
            str = "";
        }
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        apjl apjlVar2 = (apjl) apagVar2;
        apjlVar2.b |= 8192;
        apjlVar2.q = str;
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        apag apagVar3 = createBuilder.b;
        apjl apjlVar3 = (apjl) apagVar3;
        apjlVar3.p = aL - 1;
        apjlVar3.b |= 4096;
        if (!apagVar3.isMutable()) {
            createBuilder.u();
        }
        Context context = this.s;
        acnz acnzVar = this.aE;
        apjl apjlVar4 = (apjl) createBuilder.b;
        apjlVar4.o = 1;
        apjlVar4.b |= 2048;
        acnzVar.z(context, acnzVar.p(createBuilder, adiwVar), str2);
    }

    public final void I() {
        adnt adntVar = this.A;
        Optional p = p();
        if (adntVar.i(adntVar.e(p))) {
            return;
        }
        adntVar.r(new adnr(0), adntVar.e(p));
    }

    public final void J(String str, Message message) {
        acyz acyzVar = admf.a;
        if (adom.j() && message.arg1 != adjj.MSG_ARG_TRANSITION_MSG.a()) {
            this.D.d("%s: event %s", str, aw(av(message)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void K(apkn apknVar) {
        String str = this.r;
        adiw adiwVar = new adiw(this.n);
        acnz acnzVar = this.aE;
        acnzVar.z(this.s, acnzVar.j(apknVar, 5, adiwVar), str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void L(apkn apknVar) {
        String aJ = aJ();
        int aL = aL();
        String str = this.r;
        adiw adiwVar = new adiw(this.n);
        aozy createBuilder = apjl.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        apjl apjlVar = (apjl) apagVar;
        apjlVar.c = apknVar.H;
        apjlVar.b |= 1;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        apjl apjlVar2 = (apjl) apagVar2;
        apjlVar2.l = 7;
        apjlVar2.b |= 256;
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        apag apagVar3 = createBuilder.b;
        apjl apjlVar3 = (apjl) apagVar3;
        aJ.getClass();
        apjlVar3.b |= 8192;
        apjlVar3.q = aJ;
        if (!apagVar3.isMutable()) {
            createBuilder.u();
        }
        apjl apjlVar4 = (apjl) createBuilder.b;
        acnz acnzVar = this.aE;
        Context context = this.s;
        apjlVar4.p = aL - 1;
        apjlVar4.b |= 4096;
        acnzVar.z(context, acnzVar.p(createBuilder, adiwVar), str);
        if (q().booleanValue()) {
            wke.a(this.s, 8, this.o);
        }
    }

    public final void M() {
        yay d2 = ((yaq) this.aN.a()).d(this.o);
        adnt adntVar = this.A;
        Optional p = p();
        if (adntVar.i(adntVar.e(p))) {
            return;
        }
        adntVar.r(new adnn((apjq) adnt.a.getOrDefault(d2, apjq.SMS_CONNECTION_AVAILABILITY_UNKNOWN), 4), adntVar.e(p));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [admi, adll] */
    /* JADX WARN: Type inference failed for: r10v1, types: [admi] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v5, types: [adks] */
    public final void N(HttpURLConnection httpURLConnection, int i2, adll adllVar) {
        adjj adjjVar = adjj.MSG_CONFIG_DOC;
        InputStream inputStream = null;
        try {
            try {
                inputStream = httpURLConnection.getInputStream();
                B(adjjVar, this.aK.x(inputStream));
                ac(this.az);
            } catch (adna | IOException e2) {
                az(adjj.MSG_EXCEPTION_CAUGHT, i2);
                this.D.e("Failed to parse configuration in state %s, exception = %s, errorMessage = %s", adllVar.a(), e2.getClass().getName(), advq.URI.c(e2));
                aC(adllVar.g(), 4);
                K(adllVar.g());
            }
        } finally {
            this.u.a(httpURLConnection, inputStream, adllVar.a());
        }
    }

    public final void O(Context context, String str, long j2) {
        if (((acxv) this.N.b()).a()) {
            ((aday) this.O.b()).j(str).edit().putLong("provisioning_engine_next_retry_time_key", j2).commit();
        } else {
            adnu.a();
            adnu.e(context, str).edit().putLong("provisioning_engine_next_retry_time_key", j2).commit();
        }
    }

    public final void P() {
        adnt adntVar = this.A;
        Optional p = p();
        if (adntVar.i(adntVar.e(p))) {
            return;
        }
        adntVar.r(new adnr(1), adntVar.e(p));
    }

    public final void Q(Context context, String str, String str2) {
        if (((acxv) this.N.b()).a()) {
            ((aday) this.O.b()).j(str).edit().putString("provisioning_engine_otp_key", str2).commit();
        } else {
            adnu.a();
            adnu.e(context, str).edit().putString("provisioning_engine_otp_key", str2).commit();
        }
    }

    public final void R(Context context, String str, long j2) {
        if (((acxv) this.N.b()).a()) {
            ((aday) this.O.b()).j(str).edit().putLong("provisioning_engine_otp_sms_timeout_key", j2).commit();
        } else {
            adnu.a();
            adnu.e(context, str).edit().putLong("provisioning_engine_otp_sms_timeout_key", j2).commit();
        }
    }

    public final void S(Context context, String str, boolean z) {
        if (((acxv) this.N.b()).a()) {
            ((aday) this.O.b()).j(str).edit().putBoolean("work_manager_retry", z).commit();
        } else {
            adnu.a();
            adnu.e(context, str).edit().putBoolean("work_manager_retry", z).commit();
        }
    }

    public final synchronized void T() {
        acyz acyzVar = admf.a;
        if (adom.k()) {
            admf admfVar = this.X;
            Iterator it = admfVar.n.iterator();
            while (it.hasNext()) {
                ((adlw) ((ahjj) it.next()).a).aB(4);
            }
            admfVar.q.set(true);
        }
        if (adom.j()) {
            this.W.m();
        }
    }

    public final void U(adjj adjjVar) {
        acyz acyzVar = admf.a;
        if (adom.k()) {
            qiu.h(this.X.b(adjjVar, new arbj((short[]) null, (char[]) null)));
        }
        if (adom.j()) {
            this.W.q(adjjVar.a());
        }
    }

    public final void V(adjj adjjVar, Object obj) {
        acyz acyzVar = admf.a;
        if (adom.k()) {
            qiu.h(this.X.b(adjjVar, new arbj((Integer) null, (Integer) null, obj)));
        }
        if (adom.j()) {
            this.W.s(adjjVar.a(), obj);
        }
    }

    public final void W(adjj adjjVar, int i2, int i3, Object obj) {
        acyz acyzVar = admf.a;
        if (adom.k()) {
            qiu.h(this.X.b(adjjVar, new arbj(Integer.valueOf(i2), Integer.valueOf(i3), obj)));
        }
        if (adom.j()) {
            acyj acyjVar = this.W;
            int a2 = adjjVar.a();
            acyr acyrVar = acyjVar.b;
            if (acyrVar != null) {
                acyrVar.sendMessage(acyjVar.c(a2, i2, i3, obj));
            }
        }
    }

    public final void X(adjj adjjVar, long j2) {
        acyz acyzVar = admf.a;
        if (adom.k()) {
            admf admfVar = this.X;
            arbj arbjVar = new arbj((short[]) null, (char[]) null);
            Duration ofMillis = Duration.ofMillis(j2);
            adjjVar.getClass();
            ofMillis.getClass();
            ((alvg) admf.d.g().h("com/google/android/ims/provisioning/engine/statemachine/StateMachineV2", "sendMessageDelayed", 441, "StateMachineV2.kt")).D("Queuing delayed %s for %s", adjjVar, ofMillis);
            qjh.l(admfVar.h, null, new wju(ofMillis, admfVar, adjjVar, arbjVar, (arpe) null, 8), 3);
        }
        if (adom.j()) {
            this.W.t(adjjVar.a(), j2);
        }
    }

    public final void Y() {
        this.z.y(this.n);
    }

    public final void Z(adll adllVar) {
        acyz acyzVar = admf.a;
        if (adom.k()) {
            admf admfVar = this.X;
            apkn g2 = adllVar.g();
            g2.getClass();
            admfVar.r = g2;
        }
        if (adom.j()) {
            this.W.u(adllVar);
        }
    }

    public final int a() {
        if (aczv.x() && aczv.W()) {
            int T = a.T(this.ae.c(this.n).D);
            if (T == 0) {
                T = 1;
            }
            return aM(T);
        }
        return ((Integer) acpq.E().r().a()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void aA() {
        String str;
        Optional empty;
        if (((acxv) this.N.b()).a()) {
            str = UUID.randomUUID().toString();
            ((aday) this.O.b()).j(this.n).edit().putString("provisioning_engine_provisioning_session_id_key", str).commit();
            Bundle bundle = new Bundle();
            bundle.putString("com.google.android.ims.provisioning.session.id.key", ((aday) this.O.b()).o(this.n));
            adjk.c(this.s, 18, bundle);
        } else {
            Context context = this.s;
            adnu.a();
            String str2 = this.n;
            String uuid = UUID.randomUUID().toString();
            adnu.e(context, str2).edit().putString("provisioning_engine_provisioning_session_id_key", uuid).commit();
            Bundle bundle2 = new Bundle();
            bundle2.putString("com.google.android.ims.provisioning.session.id.key", adnu.r(context, str2));
            adjk.c(context, 18, bundle2);
            str = uuid;
        }
        adnt adntVar = this.A;
        String str3 = this.n;
        int i2 = 2;
        advr.c("startNewProvisioningAttempt, provisioningSessionId=%s, simId=%s", str, advq.SIM_ID.c(str3));
        int i3 = 5;
        if (!adnt.h()) {
            yxu yxuVar = new yxu(adntVar, str3, str, i3);
            if (((acxl) adntVar.d.b()).a()) {
                empty = Optional.of(str3);
            } else {
                empty = Optional.empty();
            }
            adntVar.s(yxuVar, empty);
        }
        aK(this.s, this.n, false);
        this.r = str;
        this.D.b = str;
        this.D.d("Start a new provisioning session", new Object[0]);
        Configuration k2 = k();
        if (k2 != null && !k2.l()) {
            if (!k2.k()) {
                i3 = 3;
            } else if (true != k2.q()) {
                i3 = 4;
            }
        } else {
            i3 = 2;
        }
        adnt adntVar2 = this.A;
        Optional p = p();
        if (adntVar2.i(adntVar2.e(p))) {
            return;
        }
        adntVar2.r(new adnp(i3, i2), adntVar2.e(p));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void aB(int i2) {
        this.A.l(j(), p());
        Optional p = p();
        advr.c("finishProvisioningAttempt", new Object[0]);
        if (!adnt.h()) {
            adnt adntVar = this.A;
            if (!adntVar.g(adntVar.e(p))) {
                adntVar.s(new mtq(adntVar, i2, p, 8), p);
            }
        }
        aK(this.s, this.n, true);
        this.r = null;
        this.D.b = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void aC(apkn apknVar, int i2) {
        String str = this.r;
        adiw adiwVar = new adiw(this.n);
        aozy createBuilder = apjl.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        apjl apjlVar = (apjl) apagVar;
        apjlVar.c = apknVar.H;
        apjlVar.b |= 1;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apjl apjlVar2 = (apjl) createBuilder.b;
        acnz acnzVar = this.aE;
        Context context = this.s;
        apjlVar2.l = i2 - 1;
        apjlVar2.b |= 256;
        acnzVar.z(context, acnzVar.p(createBuilder, adiwVar), str);
        if (q().booleanValue() && aF(i2)) {
            wke.a(this.s, aE(i2), this.o);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void aD(int i2) {
        this.A.o(i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void aH(apkn apknVar, int i2) {
        BroadcastOptions makeBasic;
        BroadcastOptions shareIdentityEnabled;
        Bundle bundle;
        String str = this.r;
        adiw adiwVar = new adiw(this.n);
        aozy createBuilder = apjl.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        apjl apjlVar = (apjl) apagVar;
        apjlVar.c = apknVar.H;
        apjlVar.b |= 1;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        apjl apjlVar2 = (apjl) apagVar2;
        apjlVar2.l = 1;
        apjlVar2.b |= 256;
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        acnz acnzVar = this.aE;
        Context context = this.s;
        apjl apjlVar3 = (apjl) createBuilder.b;
        apjlVar3.b |= 4;
        apjlVar3.e = i2;
        acnzVar.z(context, acnzVar.p(createBuilder, adiwVar), str);
        if (q().booleanValue() && aF(2)) {
            Context context2 = this.s;
            int aE = aE(2);
            int i3 = this.o;
            if (yhx.h) {
                Intent intent = new Intent("com.google.android.apps.messaging.ACTION_RCS_PROVISIONING_STATUS");
                if (aE == 3) {
                    intent.putExtra("error_code", i2);
                    aE = 3;
                }
                wke.c(intent, aE, i3);
                alvw g2 = wke.a.g();
                g2.X(alwp.a, "BugleRcsProvisioning");
                ((alvg) ((alvg) g2).h("com/google/android/apps/messaging/shared/rcsprovisioning/statusbroadcaster/BroadcasterToTycho", "sendIntentToTychoWithErrorCode", 37, "BroadcasterToTycho.java")).q("BroadcasterToTycho: Broadcasting intent to Tycho about Provisioning Status");
                if (!xyp.h()) {
                    makeBasic = BroadcastOptions.makeBasic();
                    shareIdentityEnabled = makeBasic.setShareIdentityEnabled(true);
                    bundle = shareIdentityEnabled.toBundle();
                    context2.sendBroadcast(intent, null, bundle);
                    return;
                }
                context2.sendBroadcast(intent);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void aI(int i2) {
        this.A.q(28, i2, Optional.empty());
    }

    public final synchronized void aa() {
        adkm adkmVar = this.D;
        long hashCode = adkmVar.hashCode();
        adkmVar.a = (advp) adkmVar.c.map(new rum(hashCode, 13)).orElse(new advp(String.format(Locale.US, "(PEv2-SM%s)", a.ck(hashCode, "-Bugle-"))));
        this.D.d("start PEv2, trigger is %s, workerId is %s", this.ab.name(), this.ac);
        this.A.f(this.n);
        if (this.z.i(this.n).isPresent()) {
            ay(this.s, this.n);
        }
        acyz acyzVar = admf.a;
        if (adom.k()) {
            if (adom.i()) {
                this.X.m.add(new ahjj(this));
                this.X.n.add(new ahjj(this));
            }
            admf admfVar = this.X;
            qiu.h(arro.E(albo.ax(admfVar.h, admfVar.y, new zcb(admfVar, (arpe) null, 17, (char[]) null))));
        }
        if (adom.j()) {
            this.W.v();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void ab(apjx apjxVar) {
        this.A.m(apjxVar, this.n);
    }

    public final void ac(adll adllVar) {
        acyz acyzVar = admf.a;
        if (adom.k()) {
            qiu.h(this.X.c(adllVar.g()));
        }
        if (adom.j()) {
            this.W.w(adllVar);
        }
    }

    public final boolean ad() {
        if (aczv.x() && aczv.W()) {
            return this.ae.c(this.n).C;
        }
        return ((Boolean) acpq.E().d().a()).booleanValue();
    }

    public final boolean ae() {
        if (aczv.x() && aczv.W()) {
            return this.ae.c(this.n).x;
        }
        return aczf.z();
    }

    public final boolean af() {
        if (aczv.x() && aczv.W()) {
            if (this.ae.c(this.n).m && Build.VERSION.SDK_INT < 31) {
                return true;
            }
            return false;
        }
        if (((Boolean) aczv.s().a.K.a()).booleanValue() && Build.VERSION.SDK_INT < 31) {
            return true;
        }
        return false;
    }

    public final boolean ag() {
        if (aczv.x() && aczv.W()) {
            return this.ae.c(this.n).w;
        }
        return aczv.S();
    }

    public final boolean ah() {
        if (aczv.x() && aczv.W()) {
            return this.ae.c(this.n).n;
        }
        return actx.f();
    }

    public final boolean ai() {
        if (!TextUtils.isEmpty(this.z.n(this.n))) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean aj() {
        String n = this.z.n(this.n);
        if (TextUtils.isEmpty(n)) {
            n = (String) o().orElse(null);
        }
        if (!TextUtils.isEmpty(n)) {
            return true;
        }
        return false;
    }

    public final synchronized boolean ak() {
        acyz acyzVar = admf.a;
        if (adom.i()) {
            return this.X.h();
        }
        if (this.W.b == null) {
            return true;
        }
        return false;
    }

    public final boolean al(String str) {
        if (this.ae.c(str).M || ((Boolean) adkh.a.a()).booleanValue()) {
            return true;
        }
        if (((Boolean) adkh.b.a()).booleanValue() && ((Boolean) adkh.c.a()).booleanValue()) {
            return true;
        }
        return false;
    }

    public final boolean am() {
        if (this.H) {
            wxb wxbVar = this.I;
            wxbVar.getClass();
            return wxbVar.o;
        }
        return this.w.k();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean an() {
        if (ad()) {
            this.D.a("Safe to share MSISDN in state %s. Device is ready for Seamless Authorized Provisioning.", r());
            return true;
        }
        if (a() != 3 || b() != 3) {
            return false;
        }
        this.D.a("Safe to share MSISDN in state %s. PII format ignored.", r());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean ao() {
        wxb wxbVar = this.I;
        wxbVar.getClass();
        return this.J.s(wxbVar.d);
    }

    public final boolean ap() {
        if (((yaq) this.aN.a()).d(this.o) == yay.UNAVAILABLE) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean aq(Message message) {
        if (this.q == message.arg2) {
            return true;
        }
        this.D.e("request id: %d, received id: %d, discard http response", Integer.valueOf(this.q), Integer.valueOf(message.arg2));
        return false;
    }

    public final boolean ar() {
        if (aczv.x() && aczv.X()) {
            return this.aR.B(this.n);
        }
        return aczv.D();
    }

    public final boolean as() {
        if (aczv.x() && aczv.X()) {
            return this.aR.C(this.n);
        }
        return aczv.G();
    }

    public final boolean at() {
        if (aczv.x() && aczv.W()) {
            int T = a.T(this.ae.c(this.n).F);
            if (T != 0 && T == 5) {
                return true;
            }
            return false;
        }
        return aczv.O();
    }

    public final boolean au() {
        if (ar() && ah() && !this.aJ.m() && !this.z.A(this.s)) {
            return true;
        }
        return false;
    }

    public final void ay(Context context, String str) {
        if (((acxv) this.N.b()).a()) {
            ((aday) this.O.b()).j(str).edit().putBoolean("provisioning_engine_has_provisioned_once_key_v2", true).commit();
        } else {
            adnu.a();
            adnu.e(context, str).edit().putBoolean("provisioning_engine_has_provisioned_once_key_v2", true).commit();
        }
    }

    public final void az(adjj adjjVar, int i2) {
        acyz acyzVar = admf.a;
        if (adom.k()) {
            qiu.h(this.X.b(adjjVar, new arbj((Integer) 0, Integer.valueOf(i2), (Object) null)));
        }
        if (adom.j()) {
            acyj acyjVar = this.W;
            int a2 = adjjVar.a();
            acyr acyrVar = acyjVar.b;
            if (acyrVar != null) {
                acyrVar.sendMessage(Message.obtain(acyrVar, a2, 0, i2));
            }
        }
    }

    public final int b() {
        if (aczv.x() && aczv.W()) {
            int T = a.T(this.ae.c(this.n).E);
            if (T == 0) {
                T = 1;
            }
            return aM(T);
        }
        return ((Integer) acpq.E().s().a()).intValue();
    }

    public final int c(Context context, String str) {
        if (((acxv) this.N.b()).a()) {
            return ((aday) this.O.b()).g(str);
        }
        adnu.a();
        return adnu.m(context, str);
    }

    public final int d(Context context, String str) {
        if (((acxv) this.N.b()).a()) {
            return ((aday) this.O.b()).h(str);
        }
        adnu.a();
        return adnu.n(context, str);
    }

    public final int e() {
        if (aczv.x() && aczv.W() && this.H) {
            return this.aM.b(this.n);
        }
        return this.aM.a();
    }

    public final long f() {
        if (aczv.x() && aczv.W()) {
            aozn aoznVar = this.ae.c(this.n).I;
            if (aoznVar == null) {
                aoznVar = aozn.a;
            }
            return apdp.a(aoznVar);
        }
        return ((Long) acpq.E().j().a()).longValue();
    }

    public final long g() {
        if (aczv.x() && aczv.W()) {
            aozn aoznVar = this.ae.c(this.n).J;
            if (aoznVar == null) {
                aoznVar = aozn.a;
            }
            return apdp.a(aoznVar);
        }
        return ((Long) acpq.E().n().a()).longValue();
    }

    public final long h(Context context, String str) {
        if (((acxv) this.N.b()).a()) {
            return ((aday) this.O.b()).j(str).getLong("provisioning_engine_next_retry_time_key", 0L);
        }
        adnu.a();
        return adnu.e(context, str).getLong("provisioning_engine_next_retry_time_key", 0L);
    }

    public final long i(Context context, String str) {
        if (((acxv) this.N.b()).a()) {
            return ((aday) this.O.b()).j(str).getLong("provisioning_engine_otp_sms_timeout_key", -1L);
        }
        adnu.a();
        return adnu.e(context, str).getLong("provisioning_engine_otp_sms_timeout_key", -1L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final adjl j() {
        if (((acww) this.aQ.b()).a()) {
            return new adjl(((vrn) this.L.a()).v(new adiw(this.n)));
        }
        if (this.H) {
            return new adjl(((vrn) this.L.a()).w(new adiw(this.n)));
        }
        this.aL.b();
        adly adlyVar = this.aL;
        String str = this.n;
        if (adlyVar.a(str).isEmpty()) {
            adlyVar.b();
        }
        Optional a2 = adlyVar.a(str);
        if (a2.isPresent()) {
            return (adjl) a2.get();
        }
        advr.q("SimId does not exist in map, could be uninitialized.", new Object[0]);
        return new adjl(amwt.BUGLE_LOADING_AVAILABILITY_IN_PROGRESS);
    }

    public final Configuration k() {
        return this.z.f(this.n);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0059, code lost:
    
        if (defpackage.aczv.W() == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005b, code lost:
    
        r0 = r4.ae.c(r4.n).L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0078, code lost:
    
        if (r0 == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x007f, code lost:
    
        return r4.at;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0066, code lost:
    
        r0 = ((java.lang.Boolean) defpackage.aczv.s().a.i.a()).booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        if (((defpackage.adtl) r1.c).a.b((android.content.Context) r1.a) != ((defpackage.adtl) r1.c).a((android.content.Context) r1.a)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002f, code lost:
    
        if (r1.b.h(defpackage.wwm.a).map(new defpackage.adkk(r3)).equals(r1.b.h(defpackage.wwm.c).map(new defpackage.adkk(r3))) != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0053, code lost:
    
        if (defpackage.aczv.x() == false) goto L15;
     */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, wwn] */
    /* JADX WARN: Type inference failed for: r0v3, types: [adtm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, wwn] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.adll l() {
        /*
            r4 = this;
            boolean r0 = r4.H
            adly r1 = r4.aL
            adek r1 = r1.a
            if (r0 == 0) goto L32
            java.lang.Object r0 = r1.b
            wwm r2 = defpackage.wwm.a
            j$.util.Optional r0 = r0.h(r2)
            java.lang.Object r1 = r1.b
            wwm r2 = defpackage.wwm.c
            j$.util.Optional r1 = r1.h(r2)
            adkk r2 = new adkk
            r3 = 3
            r2.<init>(r3)
            j$.util.Optional r0 = r0.map(r2)
            adkk r2 = new adkk
            r2.<init>(r3)
            j$.util.Optional r1 = r1.map(r2)
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L7a
            goto L4f
        L32:
            java.lang.Object r0 = r1.c
            java.lang.Object r2 = r1.a
            adtl r0 = (defpackage.adtl) r0
            java.lang.Object r0 = r0.a
            android.content.Context r2 = (android.content.Context) r2
            int r0 = r0.b(r2)
            java.lang.Object r2 = r1.c
            java.lang.Object r1 = r1.a
            android.content.Context r1 = (android.content.Context) r1
            adtl r2 = (defpackage.adtl) r2
            int r1 = r2.a(r1)
            if (r0 == r1) goto L4f
            goto L7a
        L4f:
            boolean r0 = defpackage.aczv.x()
            if (r0 == 0) goto L66
            boolean r0 = defpackage.aczv.W()
            if (r0 == 0) goto L66
            vau r0 = r4.ae
            java.lang.String r1 = r4.n
            aouh r0 = r0.c(r1)
            boolean r0 = r0.L
            goto L78
        L66:
            aczv r0 = defpackage.aczv.s()
            aczu r0 = r0.a
            acza r0 = r0.i
            java.lang.Object r0 = r0.a()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
        L78:
            if (r0 == 0) goto L7d
        L7a:
            adll r0 = r4.am
            return r0
        L7d:
            adll r0 = r4.at
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adlw.l():adll");
    }

    public final apkn n() {
        acyz acyzVar = admf.a;
        if (adom.i()) {
            apkn apknVar = (apkn) this.X.d();
            if (apknVar == null) {
                this.D.e("StateMachineV2's initial state is not set, using unknown state", new Object[0]);
                return apkn.RCS_PROVISIONING_UNKNOWN_STATE;
            }
            return apknVar;
        }
        acyh d2 = this.W.d();
        if (d2 == null) {
            this.D.e("Current state is null, use unknown state", new Object[0]);
            return apkn.RCS_PROVISIONING_UNKNOWN_STATE;
        }
        if (!(d2 instanceof adll)) {
            this.D.e("Current state is not defined state, use unknown state", new Object[0]);
            return apkn.RCS_PROVISIONING_UNKNOWN_STATE;
        }
        return ((adll) d2).g();
    }

    public final Optional o() {
        String d2;
        if (this.ae.c(this.n).N) {
            this.D.a("Skipping attempt to read MSISDN from SIM because of inhibitReadingMsisdnFromSim", new Object[0]);
            return Optional.empty();
        }
        if (!albo.ah(aczv.t())) {
            d2 = aczv.t();
            this.D.a("Using fake MSISDN from SIM because of RcsProvisioning.fakeSimNumberForTesting", new Object[0]);
        } else if (this.H) {
            wxb wxbVar = this.I;
            wxbVar.getClass();
            d2 = wxbVar.q;
        } else {
            d2 = this.w.d();
        }
        if (TextUtils.isEmpty(d2)) {
            return Optional.empty();
        }
        return Optional.of(d2);
    }

    public final Optional p() {
        if (((acxl) this.aP.b()).a()) {
            return Optional.of(this.n);
        }
        return Optional.empty();
    }

    public final Boolean q() {
        boolean z = false;
        if (am() && ((Boolean) i.a()).booleanValue() && yhx.h) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public final String r() {
        acyh acyhVar;
        acyz acyzVar = admf.a;
        if (adom.i()) {
            if (adom.j()) {
                acyhVar = (admi) this.W.d();
            } else {
                acyhVar = (admi) this.X.a();
            }
        } else {
            acyhVar = (adll) this.W.d();
        }
        if (acyhVar == null) {
            this.D.e("Trying to get state name when current state is null, use unknown", new Object[0]);
            return "UnknownState";
        }
        return acyhVar.a();
    }

    public final String t(Context context, String str) {
        if (((acxv) this.N.b()).a()) {
            return ((aday) this.O.b()).p(str);
        }
        adnu.a();
        return adnu.l(context, str);
    }

    public final String u() {
        if (aczv.x() && aczv.W()) {
            return this.ae.d(this.n).b;
        }
        return aczv.v();
    }

    public final String v() {
        if (aczv.x() && aczv.W() && this.H) {
            return this.aM.f(this.n);
        }
        return this.aM.e();
    }

    public final List w() {
        if (((acxv) this.N.b()).a()) {
            aday adayVar = (aday) this.O.b();
            String str = this.n;
            ArrayList arrayList = new ArrayList();
            Iterator<String> it = adayVar.j(str).getStringSet("provisioning_engine_cookies_key", altg.a).iterator();
            while (it.hasNext()) {
                try {
                    arrayList.add((adjn) ((aonx) adayVar.b).i(it.next(), adjn.class));
                } catch (aook e2) {
                    advr.i(e2, "Failed to unmarshal SerializableHttpCookie. Excluding from cookie set.", new Object[0]);
                }
            }
            return arrayList;
        }
        Context context = this.s;
        adnu a2 = adnu.a();
        String str2 = this.n;
        ArrayList arrayList2 = new ArrayList();
        Iterator<String> it2 = adnu.e(context, str2).getStringSet("provisioning_engine_cookies_key", altg.a).iterator();
        while (it2.hasNext()) {
            try {
                arrayList2.add((adjn) a2.c.i(it2.next(), adjn.class));
            } catch (aook e3) {
                advr.i(e3, "Failed to unmarshal SerializableHttpCookie. Excluding from cookie set.", new Object[0]);
            }
        }
        return arrayList2;
    }

    public final void x(adll adllVar, admw admwVar, adkf adkfVar) {
        if (ah() && aczv.F()) {
            Optional g2 = this.z.g();
            if (g2.isEmpty() && aczv.M()) {
                this.D.e("Failed to find GMSCore IID token when constructing HTTP request.", new Object[0]);
                adllVar.n(this.an, apkn.RCS_PROVISIONING_RETRY_STATE);
            } else if (g2.isPresent()) {
                admwVar.b("gmscore_instance_id_token", (String) g2.get());
                if (al(this.n)) {
                    adkfVar.b = (String) g2.get();
                }
            }
        }
    }

    public final void y(admw admwVar) {
        Optional empty;
        byte[] bArr;
        Optional empty2;
        if (!this.aO.isEmpty()) {
            Configuration k2 = k();
            if (k2 != null && k2.mType != 0) {
                adju c2 = k2.c();
                if (c2 == null) {
                    this.D.e("Could not retrieve MSISDN from configuration. ImsConfiguration is null.", new Object[0]);
                    empty = Optional.empty();
                } else {
                    String str = c2.l;
                    if (albo.ah(str)) {
                        this.D.e("Could not retrieve MSISDN from configuration. Public identity is null/empty.", new Object[0]);
                        empty = Optional.empty();
                    } else {
                        empty = Optional.ofNullable(adwf.k(str, this.C));
                    }
                }
            } else {
                this.D.e("Could not retrieve MSISDN from configuration. Configuration is empty.", new Object[0]);
                empty = Optional.empty();
            }
            if (!empty.isEmpty() && !albo.ah((String) empty.get())) {
                Object obj = this.aO.get();
                String str2 = (String) empty.get();
                if (albo.ah(str2)) {
                    veb.a.q("Cannot retrieve Tachyon Identity key because RCS MSISDN is empty.");
                    empty2 = Optional.empty();
                } else {
                    try {
                        bArr = ((vee) ((veb) obj).b.D(str2).b.l()).f.H();
                    } catch (apba e2) {
                        xyo b2 = veb.a.b();
                        b2.H("Could not parse TachyonPhoneData from proto data store");
                        b2.r(e2);
                        bArr = new byte[0];
                    }
                    if (bArr != null && bArr.length != 0) {
                        aozy createBuilder = aqfu.a.createBuilder();
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        ((aqfu) createBuilder.b).b = a.an(3);
                        aozb w = aozb.w(bArr);
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        ((aqfu) createBuilder.b).c = w;
                        empty2 = Optional.of(Base64.encodeToString(((aqfu) createBuilder.s()).toByteArray(), 0));
                    } else {
                        xyo a2 = veb.a.a();
                        a2.H("Tachyon identity key is empty because we do not have an active Tachyon registration.");
                        a2.q();
                        empty2 = Optional.empty();
                    }
                }
                empty2.ifPresent(new adgr(admwVar, 10));
                return;
            }
            this.D.e("Skipping adding Tachyon identity key to request. Null/empty RCS msisdn from configuration for sim ID: %s.", advq.SIM_ID.c(this.n));
            return;
        }
        this.D.e("Skipping adding Tachyon identity key to request. TachyonIdentityKeyGetter is not present. Perhaps provisioning engine is not running in Bugle.", new Object[0]);
    }

    public final void z() {
        aD(57);
        aozy createBuilder = whm.a.createBuilder();
        wfo wfoVar = wfo.GOOGLE_TOS_CONSENTED;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((whm) createBuilder.b).c = wfoVar.a();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((whm) createBuilder.b).d = "Backfilled consent. Missing ToS URL.";
        String languageTag = yhx.b(this.s).toLanguageTag();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        whm whmVar = (whm) createBuilder.b;
        languageTag.getClass();
        whmVar.e = languageTag;
        apct b2 = apds.b(agkx.W().longValue());
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        adih adihVar = this.aJ;
        whm whmVar2 = (whm) createBuilder.b;
        b2.getClass();
        whmVar2.f = b2;
        whmVar2.b |= 1;
        adihVar.l((whm) createBuilder.s());
    }
}
