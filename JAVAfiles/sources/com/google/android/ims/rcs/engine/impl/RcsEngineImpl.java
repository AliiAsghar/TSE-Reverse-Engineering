package com.google.android.ims.rcs.engine.impl;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.ims.chatsession.ChatSessionEngine;
import com.google.android.ims.jibe.service.filetransfer.FileTransferEngine;
import com.google.android.ims.jibe.service.signup.SignupEngine;
import com.google.android.ims.network.common.RcsEngine;
import com.google.android.ims.provisioning.config.Configuration;
import com.google.android.ims.provisioning.config.ImsConfiguration;
import com.google.android.ims.provisioning.config.InstantMessageConfiguration;
import com.google.android.ims.rcs.engine.IRcsEngineTemporaryController;
import com.google.android.ims.rcs.engine.impl.RcsEngineImpl;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoContentProvider;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabase;
import com.google.android.ims.rcsservice.ims.ImsEvent;
import com.google.android.ims.rcsservice.ims.ImsRegistrationState;
import com.google.android.ims.util.common.RcsIntents;
import com.google.android.libraries.jibe.service.locationsharing.LocationSharingEngine;
import defpackage.a;
import defpackage.acnb;
import defpackage.acnj;
import defpackage.acno;
import defpackage.acof;
import defpackage.acoi;
import defpackage.acok;
import defpackage.acpq;
import defpackage.acqi;
import defpackage.acqk;
import defpackage.acqy;
import defpackage.acrd;
import defpackage.acre;
import defpackage.acrm;
import defpackage.acry;
import defpackage.acsu;
import defpackage.acts;
import defpackage.acue;
import defpackage.acyt;
import defpackage.acyy;
import defpackage.acyz;
import defpackage.aczc;
import defpackage.aczd;
import defpackage.aczf;
import defpackage.aczx;
import defpackage.adaa;
import defpackage.adad;
import defpackage.adae;
import defpackage.aday;
import defpackage.addh;
import defpackage.addu;
import defpackage.adem;
import defpackage.adeo;
import defpackage.adeq;
import defpackage.adet;
import defpackage.adfa;
import defpackage.adfb;
import defpackage.adfd;
import defpackage.adfg;
import defpackage.adfq;
import defpackage.adhp;
import defpackage.adih;
import defpackage.adjw;
import defpackage.adlr;
import defpackage.adnk;
import defpackage.adny;
import defpackage.adof;
import defpackage.adog;
import defpackage.adoh;
import defpackage.adom;
import defpackage.adov;
import defpackage.adps;
import defpackage.adpu;
import defpackage.adpv;
import defpackage.adpw;
import defpackage.adpx;
import defpackage.adqg;
import defpackage.adqk;
import defpackage.adqo;
import defpackage.adqs;
import defpackage.adrh;
import defpackage.adrq;
import defpackage.adrv;
import defpackage.adrx;
import defpackage.adsa;
import defpackage.adsb;
import defpackage.adsi;
import defpackage.adsj;
import defpackage.adsw;
import defpackage.adta;
import defpackage.adtg;
import defpackage.adti;
import defpackage.adtn;
import defpackage.adtw;
import defpackage.aduo;
import defpackage.aduu;
import defpackage.adve;
import defpackage.advf;
import defpackage.advp;
import defpackage.advq;
import defpackage.advr;
import defpackage.advy;
import defpackage.advz;
import defpackage.adwe;
import defpackage.adwk;
import defpackage.adwl;
import defpackage.adwp;
import defpackage.adwu;
import defpackage.adxs;
import defpackage.adze;
import defpackage.aegu;
import defpackage.ahbz;
import defpackage.ahjj;
import defpackage.aiim;
import defpackage.aiip;
import defpackage.aikb;
import defpackage.aikc;
import defpackage.aion;
import defpackage.alog;
import defpackage.anen;
import defpackage.aneo;
import defpackage.aozy;
import defpackage.apfw;
import defpackage.apfy;
import defpackage.armf;
import defpackage.hht;
import defpackage.msd;
import defpackage.xyl;
import defpackage.yjr;
import j$.net.URLEncoder;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Optional;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public class RcsEngineImpl extends IRcsEngineTemporaryController.Stub implements RcsEngine {
    public static final int[] VPN_DEPRIORITIZED_NETWORK_REGISTRATION_ORDER = {1, 0, 17};
    private static final acyz a = aczd.a(156458435);
    private static final acyz b = aczd.a(189858511);
    private static final acyz c = aczd.a(177065032);
    static final acyz<Boolean> reinitializeImsServicesWhenEmpty = acyy.b("reinitialize_ims_services_when_empty");
    static final acyz<Boolean> setRcsEngineStateNullOnStop = acyy.b("set_rcs_engine_state_null_on_stop");
    private final FileTransferEngine A;
    private final ChatSessionEngine B;
    private final LocationSharingEngine C;
    private final adtn D;
    private final acyt E;
    private final anen F;
    private final aneo G;
    private final yjr H;
    private final acsu I;
    private final acts J;
    private final adeq K;
    private final adnk L;
    private final adjw M;
    private final adpu N;
    private final adov O;
    private final aikc P;
    private final aduo Q;
    private final armf R;
    private final adeo S;
    private final adxs T;
    private final adta U;
    private final adae V;
    private final aegu W;
    private final adze X;
    private final acof Y;
    private final adfq Z;
    private final msd aa;
    private adet ab;
    private final HandlerThread ae;
    private final Handler af;
    private final adfg ah;
    private adqg ai;
    private final aday aj;
    private final adwu d;
    private final adpv e;
    private final aiim f;
    private final adih g;
    private final adfb h;
    private final adpx i;
    private acno j;
    private acry k;
    private adad l;
    final acqk loggingController;
    private final advp m;
    private final Context n;
    private final BusinessInfoDatabase o;
    private final acnb p;
    private final adny q;
    private final acqy r;
    private final adps s;
    private final acrd t;
    private final acqi u;
    private final aduu v;
    private final adsj w;
    private final acrm x;
    private final adti y;
    private final adtg z;
    private acok ac = acok.UNKNOWN;
    private adsw ad = adsw.STATE_UNKNOWN;
    private final CopyOnWriteArrayList ag = new CopyOnWriteArrayList();

    public RcsEngineImpl(final Context context, BusinessInfoDatabase businessInfoDatabase, acqy acqyVar, acrd acrdVar, acqi acqiVar, adps adpsVar, aduu aduuVar, acrm acrmVar, adti adtiVar, adsj adsjVar, FileTransferEngine fileTransferEngine, ChatSessionEngine chatSessionEngine, LocationSharingEngine locationSharingEngine, adtn adtnVar, acyt acytVar, acnb acnbVar, adny adnyVar, anen anenVar, aneo aneoVar, acqk acqkVar, yjr yjrVar, adjw adjwVar, acre acreVar, acts actsVar, adeq adeqVar, aiim aiimVar, adih adihVar, adpu adpuVar, adsb adsbVar, adnk adnkVar, adom adomVar, adfd adfdVar, adov adovVar, aikc aikcVar, aduo aduoVar, SignupEngine signupEngine, adeo adeoVar, armf<adqg> armfVar, adtg adtgVar, adxs adxsVar, adta adtaVar, adae adaeVar, aegu aeguVar, adze adzeVar, adfg adfgVar, acof acofVar, acoi acoiVar, adfq adfqVar, msd msdVar, adwl adwlVar, adfb adfbVar, acsu acsuVar, adpx adpxVar) {
        advr.k("RcsEngine SipConnectionType set to %s", adwlVar.name());
        acoiVar.a = adwlVar;
        advp a2 = advp.a(String.format("RcsEngineImpl[%s]", adwlVar.d));
        this.m = a2;
        advr.l(a2, "instantiated in package: %s", context.getPackageName());
        if ("com.google.android.ims".equals(context.getPackageName())) {
            if (aczx.y()) {
                adsjVar.b(getClass().getSimpleName(), new adsi() { // from class: adoe
                    @Override // defpackage.adsi
                    public final void a() {
                        RcsEngineImpl.this.m227xe46c0d88(context);
                    }
                });
            } else if (aduuVar.x()) {
                notifyBugleOfZeroSessionId(context);
                aduuVar.c();
            }
        }
        this.n = context;
        this.d = acoiVar;
        this.v = aduuVar;
        this.w = adsjVar;
        this.x = acrmVar;
        this.o = businessInfoDatabase;
        this.p = acnbVar;
        this.q = adnyVar;
        this.r = acqyVar;
        this.s = adpsVar;
        this.t = acrdVar;
        this.u = acqiVar;
        this.y = adtiVar;
        this.A = fileTransferEngine;
        this.B = chatSessionEngine;
        this.C = locationSharingEngine;
        this.D = adtnVar;
        this.F = anenVar;
        this.G = aneoVar;
        this.loggingController = acqkVar;
        this.J = actsVar;
        HandlerThread handlerThread = new HandlerThread("RCS Engine Handler");
        this.ae = handlerThread;
        handlerThread.start();
        this.af = new adoh(handlerThread.getLooper(), this, adeqVar);
        this.E = acytVar;
        this.H = yjrVar;
        this.aj = new aday(context, this);
        this.e = adsbVar;
        this.M = adjwVar;
        this.I = acsuVar;
        this.K = adeqVar;
        this.z = adtgVar;
        this.f = aiimVar;
        this.g = adihVar;
        this.N = adpuVar;
        this.L = adnkVar;
        this.O = adovVar;
        this.P = aikcVar;
        this.Q = aduoVar;
        this.R = armfVar;
        this.S = adeoVar;
        this.h = adfbVar;
        this.T = adxsVar;
        this.U = adtaVar;
        this.V = adaeVar;
        this.W = aeguVar;
        this.X = adzeVar;
        this.ah = adfgVar;
        this.Y = acofVar;
        this.Z = adfqVar;
        this.i = adpxVar;
        this.aa = msdVar;
    }

    private final adrh a() {
        adrh adrhVar = (adrh) this.O.a(adrh.class);
        if (adrhVar != null) {
            return adrhVar;
        }
        throw new addu();
    }

    private final void b(Configuration configuration, adwe adweVar) {
        adet adetVar = this.ab;
        if (adetVar == null) {
            advr.h(this.m, "imsModule is null, unable to add RCS services", new Object[0]);
            return;
        }
        adrx adrxVar = new adrx(adetVar, this.ai, this.P, this.H, this.N, adweVar, this.T, this.X);
        adpw a2 = this.i.a(this.ab, this.ai, adweVar, configuration, adrxVar, this.n);
        if (!aczf.R()) {
            this.O.e(adrxVar);
            this.O.e(a2);
        } else if (adwl.DUAL_REG.equals(this.d.a(this.D.b()))) {
            this.O.e(a2);
        }
        this.O.e(new adqk(this.ab, this.ai, this.P, adweVar));
        aduo aduoVar = this.Q;
        try {
            aduoVar.e = hht.h(URLEncoder.encode(configuration.c().l, StandardCharsets.UTF_8.name()), "_groupsessions.xml");
            advr.k("Using filename for group state: %s", advq.FILE.c(aduoVar.e));
        } catch (UnsupportedEncodingException e) {
            advr.i(e, "URLEncoder does not support UTF-8 encoding", new Object[0]);
        }
        final aduo aduoVar2 = this.Q;
        if (aczx.y()) {
            aduoVar2.d.b(aduoVar2.getClass().getSimpleName(), new adsi() { // from class: adun
                @Override // defpackage.adsi
                public final void a() {
                    advr.k("Clearing GroupInfo.", new Object[0]);
                    aduo aduoVar3 = aduo.this;
                    synchronized (aduoVar3.b) {
                        aduoVar3.b.clear();
                        try {
                            aduoVar3.d();
                        } catch (IOException e2) {
                            advr.g("Failed to clear GroupInfo. %s.", e2.getMessage());
                        }
                    }
                }
            });
        }
        if (((Boolean) aduo.a.a()).booleanValue()) {
            this.Q.b();
        }
        this.O.e(new adqs(this.ab, this.ai, this.P, this.H, adweVar, this.Q));
        this.O.e(new adrh(this.n, this.ab, this.ai, this.P, this.H, this.f, this.N, this.loggingController, adweVar, this.Q, new adqo(), this.Y, this.Z));
        advr.l(this.m, "completed adding RCS services to imsServiceManager", new Object[0]);
    }

    private final void c() {
        advz.c(this.n, RcsIntents.ACTION_DEBUG_OPTION_RESET_RCS_CONFIG_RESPONSE, null, advy.RCS_ENGINE_IMPL);
    }

    private final void d(Configuration configuration) {
        Collection.EL.stream(this.ag).forEach(new adlr(configuration, 11));
    }

    private final void e() {
        if (((Boolean) setRcsEngineStateNullOnStop.a()).booleanValue()) {
            advr.l(this.m, "resetting RcsEngine internal state", new Object[0]);
            this.ab = null;
            this.j = null;
            this.l = null;
            this.k = null;
            this.ag.clear();
        }
    }

    private final void f() {
        advr.l(this.m, "Triggering reconfiguration", new Object[0]);
        updateRcsImsState(adsw.STATE_UNKNOWN, acok.RECONFIGURATION_REQUIRED);
        if (g()) {
            advr.l(this.m, "Shutting down RCS stack for reconfiguration", new Object[0]);
            adet adetVar = this.ab;
            if (adetVar != null) {
                adetVar.k(acok.RECONFIGURATION_REQUIRED);
            }
        } else {
            this.af.sendEmptyMessage(1);
            c();
        }
        new Bundle().putString(RcsIntents.EXTRA_SIM_ID, this.D.l());
        advz.b(this.n, new Intent(RcsIntents.ACTION_RCS_RECONFIGURATION_REQUIRED), "com.google.android.apps.messaging.rcsprovisioning.RcsProvisioningBroadcastReceiver", advy.RCS_ENGINE_IMPL);
    }

    private final boolean g() {
        adet adetVar = this.ab;
        if (adetVar == null) {
            advr.l(this.m, "imsModule is null, shutdown not required", new Object[0]);
            return false;
        }
        advr.d(this.m, "ImsModule is started:[%s]", String.valueOf(adetVar.n()));
        return this.ab.n();
    }

    public static int[] getNetworkRegistrationOrder() {
        int[] iArr = RcsEngine.DEFAULT_NETWORK_REGISTRATION_ORDER;
        if (aczx.n()) {
            return VPN_DEPRIORITIZED_NETWORK_REGISTRATION_ORDER;
        }
        return iArr;
    }

    private final adrq h(String str, int i) {
        adrh a2 = a();
        try {
            adrq adrqVar = new adrq(this.n, a2, this.P, str, this.f, this.Q, this.N, this.loggingController, a2.e, a2.s, i, this.Y);
            adrqVar.T = this.Z;
            return adrqVar;
        } catch (aiip e) {
            throw new addu("Unable to create originating session", e);
        }
    }

    public static /* synthetic */ IllegalStateException lambda$onImsModuleStarted$0() {
        return new IllegalStateException("RCS Configuration is empty.");
    }

    public void createImsProviders(Optional<Configuration> optional, adwe adweVar) {
        adqs adqsVar = (adqs) this.O.a(adqs.class);
        if (this.j == null) {
            acno acnoVar = new acno(this.n, this.P, (adrh) this.O.a(adrh.class), adqsVar, this.Q, this.B, this.s, this.N, this.x, this.r, this.H, this.f, this.M, this.loggingController, adweVar, this.W, this.Y);
            this.j = acnoVar;
            this.ag.add(acnoVar);
        }
        if (this.l == null) {
            adad adadVar = new adad(this.n, (adqs) this.O.a(adqs.class), this.Q, this.j, this.v, this.U, this.V);
            this.l = adadVar;
            this.ag.add(adadVar);
        }
        if (TextUtils.isEmpty((String) optional.map(new adof(0)).map(new adof(2)).orElse(null))) {
            if (this.k == null) {
                advr.j(new adog(), this.m, "ftHttpContentServerUri is empty from config - file transfer provider is null and will not be initialized", new Object[0]);
            }
        } else if (this.k == null) {
            Context context = this.n;
            InstantMessageConfiguration d = this.ab.d();
            acno acnoVar2 = this.j;
            acry acryVar = new acry(context, d, acnoVar2, acnoVar2, this.A, this.s, this.x, this.g, this.I, this.J, new ahjj(this));
            this.k = acryVar;
            this.ag.add(acryVar);
        }
    }

    @Override // defpackage.addv
    public adrv createIncomingSession(aion aionVar) {
        adrh a2 = a();
        try {
            adrv adrvVar = new adrv(this.n, a2, this.P, aionVar, this.f, this.Q, this.N, this.loggingController, a2.e, a2.s, this.Y);
            adrvVar.T = this.Z;
            return adrvVar;
        } catch (aiip e) {
            throw new addu("Unable to create terminating session", e);
        }
    }

    @Override // defpackage.addv
    public adrq createOutgoingSession(String str) {
        return h(str, 1);
    }

    @Override // defpackage.addv
    public adrq createOutgoingSlmSession(String str) {
        return h(str, 2);
    }

    @Override // com.google.android.ims.network.common.RcsEngine
    public void dumpState(PrintWriter printWriter) {
        String str;
        printWriter.println("-- RCS Engine State --");
        printWriter.println("  SipConnectionType: ".concat(String.valueOf(String.valueOf(this.d.a(this.D.b())))));
        printWriter.println(" - Clearcut Uptime Tracker State -");
        adeq adeqVar = this.K;
        printWriter.printf("  Instance ID: %s\n", adeqVar.e);
        printWriter.printf("  Instantiated: %s [%s],\n", Long.valueOf(adeqVar.f), Instant.ofEpochMilli(adeqVar.f));
        printWriter.printf("  Sequence No: %s,\n", Long.valueOf(adeqVar.g));
        printWriter.printf("  Previous state: %s,\n", adeqVar.e(adeqVar.m));
        printWriter.printf("  Current state: %s,\n", adeqVar.e(adeqVar.n));
        Object d = adeqVar.o.d();
        int W = a.W(((Integer) adeqVar.o.d()).intValue());
        String str2 = "NETWORK_TYPE_UNKNOWN";
        if (W != 0) {
            switch (W - 1) {
                case 1:
                    str2 = "LTE";
                    break;
                case 2:
                    str2 = "CDMA";
                    break;
                case 3:
                    str2 = "GSM";
                    break;
                case 4:
                    str2 = "WIFI";
                    break;
                case 5:
                    str2 = "LAN";
                    break;
                case 6:
                    str2 = "CELLULAR";
                    break;
                case 7:
                    str2 = "GPRS";
                    break;
                case 8:
                    str2 = "EDGE";
                    break;
                case 9:
                    str2 = "UMTS";
                    break;
                case 10:
                    str2 = "EVDO";
                    break;
                case 11:
                    str2 = "HSPA";
                    break;
                case 12:
                    str2 = "IDEN";
                    break;
                case 13:
                    str2 = "EHRPD";
                    break;
                case 14:
                    str2 = "VPN";
                    break;
                case 15:
                    str2 = "NR";
                    break;
                case 16:
                    str2 = "ONEXRTT";
                    break;
            }
        }
        printWriter.printf("  Last registered network: %s [%s],\n", d, str2);
        printWriter.printf("  Registered timestamp: %s [%s],\n", adeqVar.h.d(), adeqVar.d(adeqVar.h));
        printWriter.printf("  Unregistered timestamp: %s [%s],\n", adeqVar.i.d(), adeqVar.d(adeqVar.i));
        printWriter.printf("  Ignored timestamp: %s [%s],\n", adeqVar.j.d(), adeqVar.d(adeqVar.j));
        switch (adeqVar.c(adeqVar.k).ordinal()) {
            case 1:
                str = "RCS_UPTIME_IGNORE_NO_VALID_CONFIG";
                break;
            case 2:
                str = "RCS_UPTIME_IGNORE_NO_NETWORK_CONNECTIVITY";
                break;
            case 3:
                str = "RCS_UPTIME_IGNORE_NO_SIM";
                break;
            case 4:
                str = "RCS_UPTIME_IGNORE_DISABLED_VIA_PREFERENCES";
                break;
            case 5:
                str = "RCS_UPTIME_IGNORE_DEVICE_SHUTDOWN";
                break;
            case 6:
                str = "RCS_UPTIME_IGNORE_MISSING_PERMISSION";
                break;
            case 7:
                str = "RCS_UPTIME_IGNORE_BLOCKED_NETWORK";
                break;
            case 8:
                str = "RCS_UPTIME_IGNORE_SIP_DISABLED_BY_BUGLE";
                break;
            default:
                str = "RCS_UPTIME_IGNORE_REASON_UNKNOWN";
                break;
        }
        printWriter.printf("  Ignored reason: %s,\n", str);
        adet adetVar = this.ab;
        if (adetVar != null) {
            printWriter.println(" - IMS Module ".concat(String.valueOf(String.valueOf(adetVar.l))));
            adfa adfaVar = adetVar.b;
            if (adfaVar != null) {
                adfaVar.f(printWriter);
            }
        }
    }

    public adeq getClearcutUptimeTracker() {
        return this.K;
    }

    public Looper getHandlerThreadLooper() {
        return this.ae.getLooper();
    }

    @Override // com.google.android.ims.network.common.RcsEngine
    public adet getImsModule() {
        return this.ab;
    }

    public adov getImsServiceManager() {
        return this.O;
    }

    @Override // defpackage.adoc
    public adsw getLastRegistrationState() {
        return this.ad;
    }

    public adem getProvisioningEngineV2StateReporter() {
        return this.q;
    }

    @Override // defpackage.acoh
    public ImsRegistrationState getRegistrationState() {
        if (this.ab == null) {
            if (!((Boolean) adeq.b.a()).booleanValue() || !adsw.REGISTRATION_DISABLED_BY_BUGLE.equals(this.ad)) {
                if (!((Boolean) setRcsEngineStateNullOnStop.a()).booleanValue()) {
                    return new ImsRegistrationState(adsw.STATE_UNKNOWN);
                }
            }
            return new ImsRegistrationState(this.ad);
        }
        adet adetVar = this.ab;
        if (adetVar != null && adetVar.m()) {
            return new ImsRegistrationState(adsw.REGISTRATION_SUCCESSFUL);
        }
        if (this.ad.equals(adsw.REGISTRATION_TERMINATED) || this.ad.equals(adsw.REGISTRATION_FAILED)) {
            return new ImsRegistrationState(this.ad, this.ac);
        }
        return new ImsRegistrationState(this.ad);
    }

    @Override // com.google.android.ims.network.common.RcsEngine
    public adwl getSipConnectionType() {
        return this.d.a(this.D.b());
    }

    public armf<aikb> getSipStackProvider() {
        return this.P;
    }

    @Override // defpackage.acoh
    public boolean hasActiveRegistration() {
        adfa adfaVar;
        adet adetVar = this.ab;
        if (adetVar != null && adetVar.n() && (adfaVar = this.ab.b) != null) {
            return adfaVar.k();
        }
        return false;
    }

    @Override // com.google.android.ims.network.common.RcsEngine
    public void init() {
        advr.l(this.m, "Initializing RcsEngine.", new Object[0]);
        this.y.b(this, 4);
        this.y.b(this, 5);
        this.y.b(this, 3);
        this.E.a.add(this);
        this.E.a();
        advr.c("Start listening for network changes", new Object[0]);
        advr.c("Listen for network callbacks", new Object[0]);
        adfg adfgVar = this.ah;
        try {
            adwp f = adwp.f((Context) adfgVar.b);
            Object obj = adfgVar.d;
            obj.getClass();
            f.g((ConnectivityManager.NetworkCallback) obj);
        } catch (adwk e) {
            advr.i(e, "Could not register network callback.", new Object[0]);
        }
        this.ah.a(this);
        this.K.r = Optional.of(this);
        advr.l(this.m, "Initializing RBM resource permissions.", new Object[0]);
        alog<String> rbmBotIds = this.o.getRbmBotIds();
        int size = rbmBotIds.size();
        for (int i = 0; i < size; i++) {
            String str = rbmBotIds.get(i);
            BusinessInfoContentProvider.BusinessInfoContentProviderInternal.grantBugleAccessToBusinessMedia(this.o, this.n, str, 0);
            BusinessInfoContentProvider.BusinessInfoContentProviderInternal.grantBugleAccessToBusinessMedia(this.o, this.n, str, 1);
            BusinessInfoContentProvider.BusinessInfoContentProviderInternal.grantBugleAccessToBusinessMedia(this.o, this.n, str, 2);
        }
    }

    @Override // defpackage.acoh
    public boolean isRegistered() {
        adet adetVar = this.ab;
        if (adetVar == null) {
            return false;
        }
        return adetVar.m();
    }

    /* renamed from: lambda$new$0$com-google-android-ims-rcs-engine-impl-RcsEngineImpl */
    public /* synthetic */ void m227xe46c0d88(Context context) {
        advr.k("Notify Bugle of ZERO_SESSION_ID", new Object[0]);
        notifyBugleOfZeroSessionId(context);
    }

    public void notifyBugleOfZeroSessionId(Context context) {
        Intent intent = new Intent("com.google.android.ims.ZERO_SESSION_ID");
        adtw.c(context, intent);
        intent.setPackage("com.google.android.apps.messaging");
        context.sendBroadcast(intent);
    }

    @Override // com.google.android.ims.network.common.RcsEngine
    public void onBackendChanged() {
        advr.d(this.m, "Backend has changed. Performing re-provisioning!", new Object[0]);
        onResettingReconfiguration();
    }

    @Override // defpackage.adeu
    public void onConnectivityChange(Context context, int i) {
        advr.d(this.m, "onConnectivityChange: RcsEngine received connectivity change event", new Object[0]);
        this.af.sendEmptyMessage(2);
    }

    @Override // defpackage.acys
    public synchronized void onCsLibPhenotypeUpdated() {
        adet adetVar = this.ab;
        if (adetVar != null) {
            advr.d(adetVar.l, "Phenotype flags updated.", new Object[0]);
        }
    }

    @Override // defpackage.adev
    public void onForbidden(boolean z) {
        if (z) {
            advr.r(this.m, "IMS registration is forbidden for the user", new Object[0]);
            onReconfigurationRequested();
        } else {
            advr.r(this.m, "IMS registration is rejected because user is not found", new Object[0]);
        }
    }

    @Override // defpackage.adev
    public void onImsModuleInitialized() {
        advr.l(this.m, "IMS module has been initialized", new Object[0]);
        this.x.b(new ImsEvent(30105, 0L), advy.RCS_ENGINE_IMPL);
    }

    @Override // defpackage.adev
    public void onImsModuleStartFailed(acok acokVar) {
        updateRcsImsState(adsw.REGISTRATION_FAILED, acokVar);
        this.x.a(new ImsEvent(30101, acokVar.ordinal()), advy.RCS_ENGINE_IMPL);
        this.x.b(new ImsEvent(30106, 0, 101), advy.RCS_ENGINE_IMPL);
        if (acokVar == acok.RECONFIGURATION_REQUIRED) {
            f();
        }
    }

    /* JADX WARN: Type inference failed for: r1v22, types: [java.util.concurrent.ScheduledFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.util.concurrent.ScheduledFuture, java.lang.Object] */
    @Override // defpackage.adev
    public void onImsModuleStarted() {
        advr.l(this.m, "IMS module has started", new Object[0]);
        if (aczx.y()) {
            this.w.a();
        }
        updateRcsImsState(adsw.REGISTRATION_SUCCESSFUL, acok.UNKNOWN);
        registerImsProviders();
        acqi acqiVar = this.u;
        ImsConfiguration c2 = this.ab.c();
        if (((Boolean) acqi.a.a()).booleanValue() && c2.rcsVolteSingleRegistration) {
            advr.c("Disabling ImsContactsDiscovery in single regstration mode.", new Object[0]);
        } else if (((Boolean) acqi.b.a()).booleanValue()) {
            advr.k("Address Book Scan is disabled.", new Object[0]);
        } else {
            synchronized (acqiVar.l) {
                acqiVar.i = false;
                acrd acrdVar = acqiVar.d;
                acrdVar.d.add(acqiVar.s);
                if (acqiVar.r.e()) {
                    advr.c("Discovery is already waiting for polling period to expire", new Object[0]);
                } else if (!acqiVar.e.w()) {
                    acqiVar.c();
                } else {
                    acqiVar.d();
                }
            }
        }
        this.s.d.set(true);
        Configuration configuration = (Configuration) this.M.a().orElseThrow(new addh(10));
        if (((Boolean) b.a()).booleanValue()) {
            ImsConfiguration c3 = this.ab.c();
            if (c3.rcsVolteSingleRegistration) {
                advr.l(this.m, "Single registration is enabled, save the ImsConfiguration.", new Object[0]);
                configuration.h(c3);
                this.ab.l(configuration);
                this.L.u(this.D.l(), configuration);
                advr.l(this.m, "Sending intent to initiate jibe de-provisioning.", new Object[0]);
                advz.b(this.n, new Intent(RcsIntents.ACTION_JIBE_DEPROVISION).putExtra(RcsIntents.EXTRA_SUB_ID, this.D.b()).putExtra(RcsIntents.EXTRA_SIM_ID, this.D.l()), "com.google.android.apps.messaging.rcsprovisioning.RcsProvisioningBroadcastReceiver", advy.RCS_ENGINE_IMPL);
            }
        }
        d(configuration);
        this.x.a(new ImsEvent(30100, 0L), advy.RCS_ENGINE_IMPL);
        this.x.b(new ImsEvent(30106, 100L), advy.RCS_ENGINE_IMPL);
        acry acryVar = this.k;
        if (acryVar != null) {
            advr.c("Retry all failed file transfers", new Object[0]);
            advr.c("Trigger all retries immediately", new Object[0]);
            adve adveVar = acryVar.g;
            ?? r1 = adveVar.c;
            if (r1 != 0 && !r1.isCancelled() && !adveVar.c.isDone()) {
                advr.c("Immediate retry already pending.", new Object[0]);
                return;
            }
            synchronized (adveVar.b) {
                Iterator it = ((HashMap) adveVar.b).values().iterator();
                while (it.hasNext()) {
                    ((ScheduledFuture) it.next()).cancel(false);
                }
                ((HashMap) adveVar.b).clear();
            }
            adveVar.c = advf.a(new adhp(adveVar, 20, null), 0L, TimeUnit.MILLISECONDS);
        }
    }

    @Override // defpackage.adev
    public void onImsModuleStopped(acok acokVar) {
        advr.l(this.m, "IMS module has stopped: %s", acokVar);
        updateRcsImsState(adsw.REGISTRATION_TERMINATED, acokVar);
        this.B.unregisterProvider((acnj) this.j);
        this.C.unregisterProvider((ahbz) this.l);
        this.A.unregisterProvider((acue) this.k);
        this.u.f();
        this.t.b();
        this.s.f();
        this.x.a(new ImsEvent(30102, 0L), advy.RCS_ENGINE_IMPL);
        this.x.b(new ImsEvent(30106, 101L), advy.RCS_ENGINE_IMPL);
        if (acokVar == acok.RECONFIGURATION_REQUIRED) {
            f();
            c();
        }
    }

    @Override // com.google.android.ims.network.common.RcsEngine
    public void onReconfigurationRequested() {
        f();
    }

    public void onResettingReconfiguration() {
        this.r.i();
        this.af.sendEmptyMessage(2);
        f();
    }

    @Override // com.google.android.ims.network.common.RcsEngine
    public void onSimLoaded(boolean z) {
        advr.l(this.m, "SIM is loaded. Changed: %b", Boolean.valueOf(z));
        this.af.sendEmptyMessage(2);
        aczc.m();
        acpq.I(this.n);
        if (!z) {
            if (this.D.u() && g()) {
                advr.h(this.m, "Unexpected SIM LOADED. Stopping ImsModule.", new Object[0]);
                this.ab.i(acok.NETWORK_UNAVAILABLE);
            }
            advr.d(this.m, "Ignoring SIM LOADED for unchanged SIM in RCS Engine", new Object[0]);
        } else {
            advr.d(this.m, "SIM has changed. Shutting down IMS module !", new Object[0]);
            shutDownImsModule();
        }
        this.af.sendEmptyMessage(3);
    }

    @Override // com.google.android.ims.network.common.RcsEngine
    public void onSimRemoved() {
        advr.l(this.m, "SIM has been removed.", new Object[0]);
        adet adetVar = this.ab;
        if (adetVar != null) {
            adetVar.k(acok.NETWORK_UNAVAILABLE);
        }
        acpq.I(this.n);
        this.af.sendEmptyMessage(3);
    }

    @Override // defpackage.adth
    public void onTickle(apfw apfwVar) {
        adfa adfaVar;
        if (adwl.SINGLE_REG.equals(getSipConnectionType())) {
            advr.l(this.m, "ignoring FCM tickle message for single-registration RcsEngine instance", new Object[0]);
            return;
        }
        advr.l(this.m, "Self-service message received by RcsEngine. Self service message ID: %s", apfwVar.c);
        int Z = a.Z(apfwVar.b);
        if (Z == 0) {
            Z = 1;
        }
        int i = Z - 2;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    advr.r(this.m, "Unexpected self-service message: %s", this.y.a(apfwVar));
                    return;
                }
                return;
            } else {
                advr.l(this.m, "Reconfiguration requested by self-service message.", new Object[0]);
                onReconfigurationRequested();
                return;
            }
        }
        advr.l(this.m, "SIP keep alive tickle requested by self-service message.", new Object[0]);
        if (!((Boolean) adaa.p().a.z.a()).booleanValue()) {
            advr.l(this.m, "Ignoring keep alive tickle. Disabled from SipSettings.", new Object[0]);
            return;
        }
        adet imsModule = getImsModule();
        if (imsModule != null && imsModule.n()) {
            this.z.a = apfwVar.c;
            adeq adeqVar = this.K;
            advr.c("FCM tickle received. Reporting uptime", new Object[0]);
            apfy apfyVar = (apfy) adeqVar.q().s();
            aozy builder = apfwVar.toBuilder();
            if (!builder.b.isMutable()) {
                builder.u();
            }
            ((apfw) builder.b).d = a.am(3);
            adeqVar.d.g(adeqVar.c, (apfw) builder.s(), apfyVar);
            adet adetVar = this.ab;
            adsa adsaVar = new adsa(apfwVar, adetVar, this.K, adetVar.m);
            adetVar.f(adsaVar);
            this.ab.m.b(adsaVar);
            if (!isRegistered()) {
                adet adetVar2 = this.ab;
                if (adetVar2 != null && adetVar2.n() && (adfaVar = this.ab.b) != null && adfaVar.m()) {
                    advr.d(this.m, "Registration currently in progress. Ignoring keep alive self service message %s", apfwVar);
                    return;
                } else {
                    advr.d(this.m, "Client is not registered. Restarting registration due to keep alive self service message %s", apfwVar);
                    imsModule.i(acok.FCM_TICKLE_KEEP_ALIVE);
                    return;
                }
            }
            advr.d(this.m, "Client might be registered. Scheduling keep-alive due to keep alive self service message %s", apfwVar);
            imsModule.m.c();
            imsModule.m.i(0);
            return;
        }
        advr.h(this.m, "Cannot process keep alive tickle. ImsModule is not initialized or not started", new Object[0]);
    }

    public void registerImsProviders() {
        advr.d(this.m, "Registering IMS providers", new Object[0]);
        this.B.registerProvider((acnj) this.j);
        this.C.registerProvider((ahbz) this.l);
        this.A.registerProvider((acue) this.k);
    }

    void setChatSessionProvider(acno acnoVar) {
        xyl.j();
        this.j = acnoVar;
    }

    void setHttpFileTransferProvider(acry acryVar) {
        xyl.j();
        this.k = acryVar;
        this.ag.add(acryVar);
    }

    void setImsModule(adet adetVar) {
        xyl.j();
        this.ab = adetVar;
    }

    @Override // defpackage.adeu
    public boolean shouldTriggerOnCapabilitiesChanged() {
        return true;
    }

    public void shutDownImsModule() {
        this.r.i();
        this.af.sendEmptyMessage(2);
        updateRcsImsState(adsw.STATE_UNKNOWN, acok.RECONFIGURATION_REQUIRED);
        if (g()) {
            advr.c("Shutting down IMS module", new Object[0]);
            this.ab.k(acok.RECONFIGURATION_REQUIRED);
        }
    }

    @Override // com.google.android.ims.network.common.RcsEngine
    public synchronized void shutdown() {
        this.y.f(4);
        this.y.f(5);
        this.y.f(3);
        this.E.a.remove(this);
        this.E.b();
        this.t.b();
        this.u.f();
        this.s.f();
        adet adetVar = this.ab;
        if (adetVar != null) {
            adetVar.k(acok.SHUTDOWN);
            this.ah.c(this.ab.b.a());
            this.ab.b.e();
        }
        adov adovVar = this.O;
        adovVar.g(acok.SHUTDOWN);
        adovVar.a.clear();
        this.ah.c(this);
        adfg adfgVar = this.ah;
        advr.c("Stop listening for network changes", new Object[0]);
        try {
            adwp f = adwp.f((Context) adfgVar.b);
            Object obj = adfgVar.d;
            obj.getClass();
            f.h((ConnectivityManager.NetworkCallback) obj);
        } catch (IllegalArgumentException unused) {
            advr.c("NewConnectivityMonitor: defaultNetworkCallback is not registered.", new Object[0]);
        }
        ((CopyOnWriteArrayList) adfgVar.c).clear();
        e();
    }

    public void startDatabaseSyncerIfNeeded(Configuration configuration) {
        if (configuration != null && configuration.mCapabilityDiscoveryConfiguration != null) {
            if (!((Boolean) acqi.b.a()).booleanValue() && !configuration.mCapabilityDiscoveryConfiguration.disableInitialAddressBookScan) {
                advr.d(this.m, "startDatabaseSyncerIfNeeded: Initial address book scan enabled", new Object[0]);
                this.t.a();
                return;
            } else {
                advr.d(this.m, "startDatabaseSyncerIfNeeded: Initial address book scan disabled", new Object[0]);
                return;
            }
        }
        advr.d(this.m, "startDatabaseSyncerIfNeeded: Can't check initial address book scan for null config", new Object[0]);
    }

    @Override // defpackage.adoc
    public void startRcsStack(int i) {
        advr.l(this.m, "startRcsStack for subId:%d", Integer.valueOf(i));
        this.af.sendEmptyMessage(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0259 A[Catch: all -> 0x0402, TryCatch #0 {all -> 0x0402, blocks: (B:36:0x0165, B:38:0x01c4, B:40:0x01dd, B:42:0x0220, B:46:0x0259, B:47:0x0273, B:48:0x0377, B:50:0x0383, B:52:0x039e, B:53:0x03c0, B:54:0x03c2, B:56:0x03d4, B:58:0x03e1, B:59:0x03f1, B:62:0x0262, B:65:0x022a, B:68:0x0237, B:69:0x0240, B:70:0x01d8, B:74:0x0400, B:76:0x0290, B:78:0x02b6, B:80:0x0345, B:82:0x0362, B:84:0x036c, B:85:0x036f, B:86:0x02d0, B:88:0x02de, B:89:0x02fe, B:91:0x0310, B:92:0x0318, B:94:0x032a, B:95:0x0332, B:97:0x033c), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0262 A[Catch: all -> 0x0402, TryCatch #0 {all -> 0x0402, blocks: (B:36:0x0165, B:38:0x01c4, B:40:0x01dd, B:42:0x0220, B:46:0x0259, B:47:0x0273, B:48:0x0377, B:50:0x0383, B:52:0x039e, B:53:0x03c0, B:54:0x03c2, B:56:0x03d4, B:58:0x03e1, B:59:0x03f1, B:62:0x0262, B:65:0x022a, B:68:0x0237, B:69:0x0240, B:70:0x01d8, B:74:0x0400, B:76:0x0290, B:78:0x02b6, B:80:0x0345, B:82:0x0362, B:84:0x036c, B:85:0x036f, B:86:0x02d0, B:88:0x02de, B:89:0x02fe, B:91:0x0310, B:92:0x0318, B:94:0x032a, B:95:0x0332, B:97:0x033c), top: B:3:0x0003 }] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Object, anen] */
    /* JADX WARN: Type inference failed for: r3v25, types: [armf, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void startRcsStackInternal() {
        /*
            Method dump skipped, instructions count: 1028
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.ims.rcs.engine.impl.RcsEngineImpl.startRcsStackInternal():void");
    }

    @Override // defpackage.adoc
    public void stopRcsStack(int i) {
        advr.l(this.m, "stopRcsStack for subId:%d", Integer.valueOf(i));
        this.af.sendEmptyMessage(4);
    }

    public void stopRcsStackInternal() {
        adsw adswVar;
        if (((Boolean) adeq.b.a()).booleanValue()) {
            adswVar = adsw.REGISTRATION_DISABLED_BY_BUGLE;
        } else {
            adswVar = adsw.CONFIGURATION_DISABLED;
        }
        this.ad = adswVar;
        this.af.sendEmptyMessage(2);
        this.S.e(null);
        if (g()) {
            advr.l(this.m, "Shutting down IMS module", new Object[0]);
            this.ab.k(acok.DISABLED);
        } else {
            advr.l(this.m, "skipping imsModule.stop", new Object[0]);
        }
        e();
    }

    @Override // com.google.android.ims.rcs.engine.IRcsEngineTemporaryController
    public void triggerStartRcsStack(String str) {
        advr.l(this.m, "triggerStartRcsStack for msisdn:%s", advq.PHONE_NUMBER.c(str));
        this.af.sendEmptyMessage(0);
    }

    @Override // com.google.android.ims.rcs.engine.IRcsEngineTemporaryController
    public void triggerStopRcsStack(String str) {
        advr.l(this.m, "triggerStopRcsStack for msisdn:%s", advq.PHONE_NUMBER.c(str));
        this.af.sendEmptyMessage(4);
    }

    public void updateRcsConfig() {
        adtn adtnVar = this.D;
        adnk adnkVar = this.L;
        String l = adtnVar.l();
        if (adnkVar.B() && adnkVar.C() && adnkVar.D(l)) {
            if (isRegistered()) {
                advr.d(this.m, "updateRcsConfig: Already registered, skipping config update request", new Object[0]);
            } else {
                this.af.sendEmptyMessage(2);
            }
        }
    }

    public void updateRcsImsState(adsw adswVar, acok acokVar) {
        advr.l(this.m, "IMS registration state change [%s -> %s] reason: %s", this.ad.toString(), adswVar.toString(), acokVar.name());
        this.ad = adswVar;
        this.ac = acokVar;
    }
}
