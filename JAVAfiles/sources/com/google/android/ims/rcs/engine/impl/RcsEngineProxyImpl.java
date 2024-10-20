package com.google.android.ims.rcs.engine.impl;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.StrictMode;
import com.google.android.ims.chatsession.ChatSessionEngine;
import com.google.android.ims.jibe.service.businessinfo.BusinessInfoEngine;
import com.google.android.ims.jibe.service.connectiontracker.ImsConnectionTrackerEngine;
import com.google.android.ims.jibe.service.contactsmanager.ContactsManager;
import com.google.android.ims.jibe.service.filetransfer.FileTransferEngine;
import com.google.android.ims.jibe.service.profile.RcsProfileEngine;
import com.google.android.ims.jibe.service.signup.SignupEngine;
import com.google.android.ims.jibe.service.singleregistration.SingleRegistrationVendorImsController;
import com.google.android.ims.jibe.service.transportcontrol.TransportControlEngine;
import com.google.android.ims.messaging.MessagingEngine;
import com.google.android.ims.metrics.PeriodicMetricsJobService;
import com.google.android.ims.network.common.RcsEngine;
import com.google.android.ims.rcs.engine.IRcsEngineController;
import com.google.android.ims.rcs.engine.IRcsEngineTemporaryController;
import com.google.android.ims.rcs.engine.RcsEngineLifecycleServiceResult;
import com.google.android.ims.rcs.singleregistration.ISingleRegistrationVendorImsController;
import com.google.android.ims.rcsservice.businessinfo.IBusinessInfo;
import com.google.android.ims.rcsservice.chatsession.IChatSession;
import com.google.android.ims.rcsservice.contacts.IContactsManagement;
import com.google.android.ims.rcsservice.events.IEvent;
import com.google.android.ims.rcsservice.filetransfer.IFileTransfer;
import com.google.android.ims.rcsservice.ims.IImsConnectionTracker;
import com.google.android.ims.rcsservice.ims.ImsRegistrationState;
import com.google.android.ims.rcsservice.lifecycle.InitializeAndStartRcsTransportRequest;
import com.google.android.ims.rcsservice.lifecycle.StopAllRcsTransportsExceptRequest;
import com.google.android.ims.rcsservice.locationsharing.ILocationSharing;
import com.google.android.ims.rcsservice.profile.IRcsProfile;
import com.google.android.ims.rcsservice.signup.ISignup;
import com.google.android.ims.rcsservice.transportcontrol.ITransportControl;
import com.google.android.ims.util.common.RcsIntents;
import com.google.android.libraries.jibe.service.locationsharing.LocationSharingEngine;
import com.google.android.rcs.client.messaging.IMessaging;
import defpackage.aakf;
import defpackage.aavc;
import defpackage.abid;
import defpackage.abqa;
import defpackage.acjj;
import defpackage.acoc;
import defpackage.acoh;
import defpackage.acok;
import defpackage.acre;
import defpackage.acrm;
import defpackage.acyz;
import defpackage.aczd;
import defpackage.aczf;
import defpackage.aczx;
import defpackage.adew;
import defpackage.adhc;
import defpackage.adlr;
import defpackage.adnk;
import defpackage.adnx;
import defpackage.adod;
import defpackage.adoj;
import defpackage.adok;
import defpackage.adqg;
import defpackage.adrq;
import defpackage.adrv;
import defpackage.adsw;
import defpackage.adtf;
import defpackage.adti;
import defpackage.adtl;
import defpackage.adud;
import defpackage.adue;
import defpackage.aduu;
import defpackage.advh;
import defpackage.advo;
import defpackage.advp;
import defpackage.advr;
import defpackage.adwi;
import defpackage.adwl;
import defpackage.aion;
import defpackage.akto;
import defpackage.albo;
import defpackage.anee;
import defpackage.anen;
import defpackage.aozy;
import defpackage.apgr;
import defpackage.apgv;
import defpackage.aplh;
import defpackage.apli;
import defpackage.aplj;
import defpackage.apwt;
import defpackage.armf;
import defpackage.egl;
import defpackage.hwm;
import defpackage.yjy;
import j$.util.Optional;
import java.io.PrintWriter;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public class RcsEngineProxyImpl extends IRcsEngineController.Stub implements adod, acoh {
    static final acyz<Boolean> enableLoggingRcsEngineInitializationCall = aczd.a(263232862);
    private adok A;
    private final advp B = advp.a("RcsEngineProxyImpl");
    private final acjj C;
    private final apwt a;
    private final armf b;
    private final apwt c;
    private final apwt d;
    private final adtf e;
    private final armf f;
    private final apwt g;
    private final apwt h;
    private final apwt i;
    private final apwt j;
    private final apwt k;
    private final anen l;
    private final abqa m;
    private final apwt n;
    private final apwt o;
    private final yjy p;
    private final apwt q;
    private final apwt r;
    private final apwt s;
    private final apwt t;
    private final apwt u;
    private final apwt v;
    private final apwt w;
    private final Map x;
    private final Context y;
    private RcsEngine z;

    public RcsEngineProxyImpl(Context context, Map<adwl, armf<RcsEngine>> map, apwt<SignupEngine> apwtVar, apwt<FileTransferEngine> apwtVar2, apwt<ChatSessionEngine> apwtVar3, apwt<LocationSharingEngine> apwtVar4, apwt<ImsConnectionTrackerEngine> apwtVar5, apwt<TransportControlEngine> apwtVar6, apwt<SingleRegistrationVendorImsController> apwtVar7, apwt<ContactsManager> apwtVar8, apwt<RcsProfileEngine> apwtVar9, apwt<MessagingEngine> apwtVar10, apwt<BusinessInfoEngine> apwtVar11, apwt<acrm> apwtVar12, apwt<adtl> apwtVar13, armf<adnk> armfVar, apwt<adti> apwtVar14, apwt<acre> apwtVar15, armf<aduu> armfVar2, apwt<adqg> apwtVar16, adtf adtfVar, abqa abqaVar, yjy yjyVar, anen anenVar, apwt<acoc> apwtVar17, acjj acjjVar) {
        this.y = context;
        this.x = map;
        this.g = apwtVar;
        this.h = apwtVar2;
        this.i = apwtVar3;
        this.j = apwtVar4;
        this.n = apwtVar5;
        this.o = apwtVar6;
        this.q = apwtVar7;
        this.r = apwtVar8;
        this.s = apwtVar9;
        this.t = apwtVar10;
        this.u = apwtVar11;
        this.v = apwtVar12;
        this.k = apwtVar13;
        this.f = armfVar;
        this.d = apwtVar14;
        this.a = apwtVar15;
        this.b = armfVar2;
        this.c = apwtVar16;
        this.e = adtfVar;
        this.m = abqaVar;
        this.p = yjyVar;
        this.l = anenVar;
        this.w = apwtVar17;
        this.C = acjjVar;
    }

    private final synchronized RcsEngine a() {
        RcsEngine rcsEngine;
        rcsEngine = this.z;
        if (rcsEngine == null) {
            throw new IllegalStateException("RcsEngine is not initialized.");
        }
        return rcsEngine;
    }

    private final synchronized RcsEngineLifecycleServiceResult b(int i, adwl adwlVar, Optional optional) {
        armf armfVar = (armf) this.x.get(adwlVar);
        if (armfVar != null) {
            advr.l(this.B, "Initialize RcsEngine. subId=%d backendType=%s", Integer.valueOf(i), adwlVar);
            CountDownLatch countDownLatch = new CountDownLatch(1);
            HandlerThread handlerThread = new HandlerThread("RcsEngineInitThread");
            handlerThread.start();
            new Handler(handlerThread.getLooper()).post(new adhc(armfVar, countDownLatch, 3));
            handlerThread.quitSafely();
            try {
                countDownLatch.await(3L, TimeUnit.SECONDS);
                RcsEngine rcsEngine = (RcsEngine) armfVar.b();
                rcsEngine.init();
                g(rcsEngine);
                optional.ifPresent(new abid(this, rcsEngine, 12));
            } catch (InterruptedException e) {
                advr.j(e, this.B, "RCS Engine initialization timeout.", new Object[0]);
                return new RcsEngineLifecycleServiceResult(1);
            }
        } else {
            advr.h(this.B, "Unknown RCS backend type %s", adwlVar);
            throw new IllegalArgumentException("Unknown RCS backend type ".concat(String.valueOf(String.valueOf(adwlVar))));
        }
        return new RcsEngineLifecycleServiceResult(0);
    }

    private final synchronized RcsEngineLifecycleServiceResult c(aplh aplhVar) {
        adwl adwlVar;
        advr.l(this.B, "RCS engine was destroyed: %b.", Boolean.valueOf(d().succeeded()));
        int i = aplhVar.c;
        apli b = apli.b(aplhVar.d);
        if (b == null) {
            b = apli.RCS_TRANSPORT_TYPE_UNKNOWN;
        }
        adwl adwlVar2 = adwl.UNKNOWN;
        int ordinal = b.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                adwlVar = adwl.UNKNOWN;
            } else {
                adwlVar = adwl.SINGLE_REG;
            }
        } else {
            adwlVar = adwl.DUAL_REG;
        }
        RcsEngineLifecycleServiceResult b2 = b(i, adwlVar, Optional.of(aplhVar));
        if (!b2.succeeded()) {
            return b2;
        }
        adok adokVar = this.A;
        adokVar.getClass();
        adokVar.a.startRcsStack(aplhVar.c);
        return new RcsEngineLifecycleServiceResult(0);
    }

    private final synchronized RcsEngineLifecycleServiceResult d() {
        RcsEngine rcsEngine = this.z;
        if (rcsEngine == null) {
            advr.r(this.B, "RcsEngine hasn't been initialized.", new Object[0]);
            return new RcsEngineLifecycleServiceResult(2);
        }
        advr.l(this.B, "Destroy RcsEngine", new Object[0]);
        adue.a(this.y).b(IRcsEngineTemporaryController.class.getName()).ifPresent(new aavc(10));
        rcsEngine.shutdown();
        g(null);
        this.A = null;
        return new RcsEngineLifecycleServiceResult(0);
    }

    private final void e() {
        armf armfVar = (armf) this.x.get(adwl.DUAL_REG);
        armfVar.getClass();
        RcsEngine rcsEngine = (RcsEngine) armfVar.b();
        adue.a(this.y).b(IRcsEngineTemporaryController.class.getName()).ifPresent(new adlr(rcsEngine, 16));
        g(rcsEngine);
        a().init();
    }

    private final void f() {
        adue a = adue.a(this.y);
        a.b(IEvent.class.getName()).ifPresent(new adlr(this, 17));
        a.b(IImsConnectionTracker.class.getName()).ifPresent(new adoj(this, 1));
        a.b(IContactsManagement.class.getName()).ifPresent(new adoj(this, 0));
        a.b(IFileTransfer.class.getName()).ifPresent(new adoj(this, 2));
        a.b(IChatSession.class.getName()).ifPresent(new adoj(this, 3));
        a.b(IRcsProfile.class.getName()).ifPresent(new adoj(this, 4));
        a.b(ISignup.class.getName()).ifPresent(new adlr(this, 12));
        a.b(ILocationSharing.class.getName()).ifPresent(new adlr(this, 13));
        a.b(IBusinessInfo.class.getName()).ifPresent(new adlr(this, 14));
        a.b(IMessaging.class.getName()).ifPresent(new adlr(this, 15));
        a.b(ITransportControl.class.getName()).ifPresent(new adlr(this, 18));
        a.b(ISingleRegistrationVendorImsController.class.getName()).ifPresent(new adlr(this, 19));
        a.b(IRcsEngineController.class.getName()).ifPresent(new adlr(this, 20));
    }

    private final synchronized void g(RcsEngine rcsEngine) {
        if (rcsEngine == null) {
            advr.r(this.B, "setting active RCS engine to null", new Object[0]);
        } else {
            advr.l(this.B, "setting active RCS Engine to %s instance", rcsEngine.getSipConnectionType().d);
        }
        this.z = rcsEngine;
    }

    private final void h() {
        long millis = TimeUnit.MINUTES.toMillis(((Long) aczf.o().a.a.a()).longValue());
        long millis2 = TimeUnit.MINUTES.toMillis(((Long) aczf.o().a.b.a()).longValue());
        int i = PeriodicMetricsJobService.d;
        Context context = this.y;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        JobInfo.Builder builder = new JobInfo.Builder(30000, new ComponentName(context, (Class<?>) PeriodicMetricsJobService.class));
        builder.setRequiredNetworkType(1);
        builder.setBackoffCriteria(millis2, 0);
        builder.setPeriodic(millis);
        advr.o("Started periodic metrics with period %d ms and backoff %d ms, result %d", Long.valueOf(millis), Long.valueOf(millis2), Integer.valueOf(jobScheduler.schedule(builder.build())));
    }

    public static /* synthetic */ void lambda$createAndInitRcsEngine$0(armf armfVar, CountDownLatch countDownLatch) {
        armfVar.b();
        countDownLatch.countDown();
    }

    @Override // defpackage.addv
    public adrv createIncomingSession(aion aionVar) {
        return a().createIncomingSession(aionVar);
    }

    @Override // defpackage.addv
    public adrq createOutgoingSession(String str) {
        return a().createOutgoingSession(str);
    }

    @Override // defpackage.addv
    public adrq createOutgoingSlmSession(String str) {
        return a().createOutgoingSlmSession(str);
    }

    @Override // com.google.android.ims.rcs.engine.IRcsEngineController
    public synchronized RcsEngineLifecycleServiceResult destroy(int i) {
        if (aczx.u() && adwi.i(this.y)) {
            return d();
        }
        advr.r(this.B, "RCS engine is initialized automatically. Ignore destroy request from Bugle.", new Object[0]);
        return new RcsEngineLifecycleServiceResult(0);
    }

    @Override // defpackage.adod
    public void destroyRcsEngine() {
        advr.l(this.B, "Destroy RCS Engine.", new Object[0]);
        unregisterReceivers();
        int i = PeriodicMetricsJobService.d;
        advr.o("Stopping periodic metrics.", new Object[0]);
        ((JobScheduler) this.y.getSystemService("jobscheduler")).cancel(30000);
        adue.a(this.y).b(IRcsEngineTemporaryController.class.getName()).ifPresent(new aavc(11));
        RcsEngine rcsEngine = this.z;
        if (rcsEngine != null) {
            rcsEngine.shutdown();
            g(null);
        }
    }

    @Override // defpackage.adod
    public void dumpState(PrintWriter printWriter) {
        try {
            a().dumpState(printWriter);
        } catch (IllegalStateException e) {
            advr.j(e, this.B, "RcsEngine is not initialized.", new Object[0]);
        }
    }

    public adew getImsModule() {
        return a().getImsModule();
    }

    @Override // defpackage.adoc
    public adsw getLastRegistrationState() {
        try {
            return a().getLastRegistrationState();
        } catch (IllegalStateException e) {
            advr.t(e, this.B, "RcsEngine is not initialized.", new Object[0]);
            return adsw.STATE_UNKNOWN;
        }
    }

    @Override // defpackage.acoh
    public ImsRegistrationState getRegistrationState() {
        try {
            return a().getRegistrationState();
        } catch (IllegalStateException e) {
            advr.t(e, this.B, "RcsEngine is not initialized.", new Object[0]);
            return new ImsRegistrationState(adsw.STATE_UNKNOWN);
        }
    }

    @Override // defpackage.acoh
    public boolean hasActiveRegistration() {
        try {
            return a().hasActiveRegistration();
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    @Override // com.google.android.ims.rcs.engine.IRcsEngineController
    public synchronized RcsEngineLifecycleServiceResult initialize(int i, int i2) {
        int i3;
        advr.l(this.B, "received initialization request for %s RcsEngine", adwl.a(i2).d);
        if (((Boolean) enableLoggingRcsEngineInitializationCall.a()).booleanValue()) {
            acoc acocVar = (acoc) this.w.b();
            Context context = this.y;
            aozy createBuilder = apgv.a.createBuilder();
            aozy createBuilder2 = apgr.a.createBuilder();
            boolean u = aczx.u();
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            apgr apgrVar = (apgr) createBuilder2.b;
            apgrVar.b |= 2;
            apgrVar.d = u;
            RcsEngine rcsEngine = this.z;
            if (rcsEngine == null) {
                i3 = 2;
            } else if (rcsEngine.getSipConnectionType() == adwl.SINGLE_REG) {
                i3 = 4;
            } else if (this.z.getSipConnectionType() == adwl.DUAL_REG) {
                i3 = 3;
            } else {
                i3 = 1;
            }
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            apgr apgrVar2 = (apgr) createBuilder2.b;
            apgrVar2.c = i3 - 1;
            apgrVar2.b |= 1;
            apgr apgrVar3 = (apgr) createBuilder2.s();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apgv apgvVar = (apgv) createBuilder.b;
            apgrVar3.getClass();
            apgvVar.d = apgrVar3;
            apgvVar.c = 13;
            acocVar.h(context, (apgv) createBuilder.s());
        }
        if (aczx.u() && adwi.i(this.y)) {
            RcsEngine rcsEngine2 = this.z;
            adwl a = adwl.a(i2);
            if (rcsEngine2 != null) {
                if (rcsEngine2.getSipConnectionType().equals(a)) {
                    advr.r(this.B, "Already initialized %s RcsEngine instance. Reusing existing instance", adwl.a(i2).d);
                    return new RcsEngineLifecycleServiceResult(0);
                }
                advr.r(this.B, "Requested initialization of %s RcsEngine when %s RcsEngine is already initialized. Destroying the %s RcsEngine", a, rcsEngine2.getSipConnectionType(), rcsEngine2.getSipConnectionType());
                destroy(i);
            }
            return b(i, a, Optional.empty());
        }
        advr.r(this.B, "RCS engine is initialized automatically. Ignore initialization request from Bugle. enableRcsEngineInitializationByBugle:[%s], isRcsEngineInBugle:[%s]", Boolean.valueOf(aczx.u()), Boolean.valueOf(adwi.i(this.y)));
        return new RcsEngineLifecycleServiceResult(0);
    }

    @Override // com.google.android.ims.rcs.engine.IRcsEngineController
    public synchronized RcsEngineLifecycleServiceResult initializeAndStartRcsTransport(InitializeAndStartRcsTransportRequest initializeAndStartRcsTransportRequest) {
        apli b = apli.b(initializeAndStartRcsTransportRequest.a().d);
        if (b == null) {
            b = apli.RCS_TRANSPORT_TYPE_UNKNOWN;
        }
        advr.l(this.B, "initializeAndStartRcsTransport: %s, %s", b, Integer.valueOf(initializeAndStartRcsTransportRequest.a().c));
        aplh a = initializeAndStartRcsTransportRequest.a();
        adok adokVar = this.A;
        if (adokVar != null && adokVar.b.equals(a)) {
            advr.l(this.B, "initializeAndStartRcsTransport: correct instance of RcsEngine already exists. Starting RCS stack", new Object[0]);
            return triggerStartRcsStack(a.c);
        }
        advr.l(this.B, "initializeAndStartRcsTransport: creating a new RcsEngine instance", new Object[0]);
        return c(a);
    }

    @Override // defpackage.adod
    public synchronized void initializeRcsEngineForBugle() {
        Intent c;
        advr.l(this.B, "Initializing RCS Engine for Bugle host.", new Object[0]);
        ((adtl) this.k.b()).h();
        f();
        ((adtl) this.k.b()).i();
        if (!aczx.u()) {
            advr.r(this.B, "enableRcsEngineInitializationByBugle is disabled, directly initializing new DUAL_REG RcsEngine", new Object[0]);
            e();
        } else {
            advr.l(this.B, "enableRcsEngineInitializationByBugle is enabled, waiting for Bugle to initialize RcsEngine.", new Object[0]);
        }
        h();
        if ("com.google.android.apps.messaging".equals(this.y.getPackageName())) {
            advo.a = "BugleRcsEngine";
        }
        advr.y(this.y);
        advh.e(this.y, (adtl) this.k.b(), this.m, this.p, this.l, this.C);
        advr.o("Device info: %s %s %s // %s %s", Build.MANUFACTURER, Build.MODEL, Build.DEVICE, Build.BRAND, Build.PRODUCT);
        advr.o("Running Android %s, API level %d, %s %s", Build.VERSION.RELEASE, Integer.valueOf(Build.VERSION.SDK_INT), Build.VERSION.CODENAME, Build.VERSION.INCREMENTAL);
        if (!((Boolean) aczf.o().a.v.a()).booleanValue()) {
            StrictMode.ThreadPolicy.Builder builder = new StrictMode.ThreadPolicy.Builder();
            builder.detectNetwork();
            builder.penaltyLog();
            StrictMode.setThreadPolicy(builder.build());
        }
        registerReceivers();
        if (((Boolean) aczx.a.b.d.a()).booleanValue() && (c = ((adtl) this.k.b()).c()) != null && "com.google.android.ims.SIM_LOADED".equals(c.getAction())) {
            advr.d(this.B, "SIM has been loaded before JibeService.", new Object[0]);
            onSimLoaded(c.getBooleanExtra("SIM_CHANGED", false));
        }
    }

    public void initializeRcsEngineForCsApk() {
        advr.l(this.B, "Initializing RCS Engine for CsApk host.", new Object[0]);
        f();
        e();
        h();
    }

    @Override // defpackage.acoh
    public boolean isRegistered() {
        try {
            return a().isRegistered();
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    /* renamed from: lambda$createAndInitRcsEngine$1$com-google-android-ims-rcs-engine-impl-RcsEngineProxyImpl */
    public /* synthetic */ void m229xead5a25a(RcsEngine rcsEngine, aplh aplhVar) {
        this.A = new adok(rcsEngine, aplhVar);
    }

    /* renamed from: lambda$initializeForwardingBinders$0$com-google-android-ims-rcs-engine-impl-RcsEngineProxyImpl */
    public /* synthetic */ void m230x6925cf42(adud adudVar) {
        adudVar.set(((acrm) this.v.b()).b);
    }

    /* renamed from: lambda$initializeForwardingBinders$1$com-google-android-ims-rcs-engine-impl-RcsEngineProxyImpl */
    public /* synthetic */ void m231x79db9c03(adud adudVar) {
        adudVar.set((IBinder) this.n.b());
    }

    /* renamed from: lambda$initializeForwardingBinders$10$com-google-android-ims-rcs-engine-impl-RcsEngineProxyImpl */
    public /* synthetic */ void m232xd258cb9b(adud adudVar) {
        adudVar.set((IBinder) this.o.b());
    }

    /* renamed from: lambda$initializeForwardingBinders$11$com-google-android-ims-rcs-engine-impl-RcsEngineProxyImpl */
    public /* synthetic */ void m233xe30e985c(adud adudVar) {
        adudVar.set((IBinder) this.q.b());
    }

    /* renamed from: lambda$initializeForwardingBinders$12$com-google-android-ims-rcs-engine-impl-RcsEngineProxyImpl */
    public /* synthetic */ void m234xf3c4651d(adud adudVar) {
        adudVar.set(this);
    }

    /* renamed from: lambda$initializeForwardingBinders$2$com-google-android-ims-rcs-engine-impl-RcsEngineProxyImpl */
    public /* synthetic */ void m235x8a9168c4(adud adudVar) {
        adudVar.set((IBinder) this.r.b());
    }

    /* renamed from: lambda$initializeForwardingBinders$3$com-google-android-ims-rcs-engine-impl-RcsEngineProxyImpl */
    public /* synthetic */ void m236x9b473585(adud adudVar) {
        adudVar.set((IBinder) this.h.b());
    }

    /* renamed from: lambda$initializeForwardingBinders$4$com-google-android-ims-rcs-engine-impl-RcsEngineProxyImpl */
    public /* synthetic */ void m237xabfd0246(adud adudVar) {
        adudVar.set((IBinder) this.i.b());
    }

    /* renamed from: lambda$initializeForwardingBinders$5$com-google-android-ims-rcs-engine-impl-RcsEngineProxyImpl */
    public /* synthetic */ void m238xbcb2cf07(adud adudVar) {
        adudVar.set((IBinder) this.s.b());
    }

    /* renamed from: lambda$initializeForwardingBinders$6$com-google-android-ims-rcs-engine-impl-RcsEngineProxyImpl */
    public /* synthetic */ void m239xcd689bc8(adud adudVar) {
        adudVar.set((IBinder) this.g.b());
    }

    /* renamed from: lambda$initializeForwardingBinders$7$com-google-android-ims-rcs-engine-impl-RcsEngineProxyImpl */
    public /* synthetic */ void m240xde1e6889(adud adudVar) {
        adudVar.set((IBinder) this.j.b());
    }

    /* renamed from: lambda$initializeForwardingBinders$8$com-google-android-ims-rcs-engine-impl-RcsEngineProxyImpl */
    public /* synthetic */ void m241xeed4354a(adud adudVar) {
        adudVar.set((IBinder) this.u.b());
    }

    /* renamed from: lambda$initializeForwardingBinders$9$com-google-android-ims-rcs-engine-impl-RcsEngineProxyImpl */
    public /* synthetic */ void m242xff8a020b(adud adudVar) {
        adudVar.set((IBinder) this.t.b());
    }

    /* renamed from: lambda$onSimLoaded$0$com-google-android-ims-rcs-engine-impl-RcsEngineProxyImpl */
    public /* synthetic */ void m243xb8e9e9c3(boolean z) {
        try {
            a().onSimLoaded(z);
        } catch (IllegalStateException e) {
            advr.j(e, this.B, "RcsEngine is not initialized.", new Object[0]);
        }
        if (z) {
            advr.l(this.B, "onSimLoaded: detected a change", new Object[0]);
            ((acre) this.a.b()).a();
            ((adqg) this.c.b()).j();
        }
        advr.l(this.B, "onSimLoaded: isSimLoaded: [%b]", Boolean.valueOf(((adtl) this.k.b()).l(this.y)));
    }

    public void onBackendChanged() {
        try {
            a().onBackendChanged();
        } catch (IllegalStateException e) {
            advr.j(e, this.B, "RcsEngine is not initialized.", new Object[0]);
        }
    }

    @Override // defpackage.adod
    public void onSimAbsent() {
        adnk adnkVar = (adnk) this.f.b();
        albo.bR(anee.o(adnkVar.d.submit(akto.k(new aakf(adnkVar, ((adtl) this.k.b()).f(), 13, null)))), new adnx(this, 3), this.l);
    }

    public void onSimAbsentInternal() {
        if (!((aduu) this.b.b()).t()) {
            ((acre) this.a.b()).a();
            ((adqg) this.c.b()).j();
            advr.h(this.B, "onSimRemoved: not using a test number at the moment", new Object[0]);
        }
        advr.l(this.B, "onSimRemoved: isSimLoaded: [%b]", Boolean.valueOf(((adtl) this.k.b()).l(this.y)));
        try {
            a().onSimRemoved();
        } catch (IllegalStateException e) {
            advr.j(e, this.B, "RcsEngine is not initialized.", new Object[0]);
        }
    }

    @Override // defpackage.adod
    public void onSimLoaded(boolean z) {
        this.l.execute(akto.j(new hwm(this, z, 11, null)));
    }

    protected void registerReceivers() {
        registerSelfServiceMessageReceiver();
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(RcsIntents.ACTION_RCS_RECURRING_METRICS_UPLOAD);
            egl.h(this.y, this.e, intentFilter);
        } catch (RuntimeException e) {
            advr.j(e, this.B, "Failed to register RecurringMetricsUploadReceiver. Already registered?", new Object[0]);
        }
    }

    public void registerSelfServiceMessageReceiver() {
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(RcsIntents.ACTION_TACHYON_ANONYMOUS_DEVICE_ID);
            intentFilter.addAction(RcsIntents.ACTION_RCS_SELF_SERVICE_MESSAGE);
            egl.h(this.y, (BroadcastReceiver) this.d.b(), intentFilter);
        } catch (RuntimeException e) {
            advr.j(e, this.B, "Failed to register SelfServiceMessageReceiver. Already registered?", new Object[0]);
        }
    }

    @Override // defpackage.adod
    public void shutdown() {
        try {
            a().shutdown();
        } catch (IllegalStateException e) {
            advr.j(e, this.B, "RcsEngine is not initialized", new Object[0]);
        }
    }

    @Override // defpackage.adoc
    public void startRcsStack(int i) {
        try {
            a().startRcsStack(i);
        } catch (IllegalStateException e) {
            advr.j(e, this.B, "RcsEngine is not initialized.", new Object[0]);
        }
    }

    @Override // defpackage.adod
    public void stop(acok acokVar) {
        try {
            a().getImsModule().k(acokVar);
        } catch (IllegalStateException e) {
            advr.j(e, this.B, "RcsEngine is not initialized.", new Object[0]);
        }
    }

    @Override // com.google.android.ims.rcs.engine.IRcsEngineController
    public synchronized RcsEngineLifecycleServiceResult stopAllRcsTransportsExcept(StopAllRcsTransportsExceptRequest stopAllRcsTransportsExceptRequest) {
        aplj a = stopAllRcsTransportsExceptRequest.a();
        adok adokVar = this.A;
        if (adokVar != null) {
            aplh aplhVar = adokVar.b;
            apli b = apli.b(aplhVar.d);
            if (b == null) {
                b = apli.RCS_TRANSPORT_TYPE_UNKNOWN;
            }
            int i = aplhVar.c;
            apli b2 = apli.b(a.d);
            if (b2 == null) {
                b2 = apli.RCS_TRANSPORT_TYPE_UNKNOWN;
            }
            if (b2.equals(b) && !a.c.contains(Integer.valueOf(i))) {
                advr.l(this.B, "stopAllRcsTransportsExcept: trigger the stop of RcsEngine", new Object[0]);
                adok adokVar2 = this.A;
                adokVar2.getClass();
                return triggerStopRcsStack(adokVar2.b.c);
            }
        }
        advr.l(this.B, "stopAllRcsTransportsExcept: ignoring stopping the RcsEngine. RcsEngine is still running", new Object[0]);
        return new RcsEngineLifecycleServiceResult(0);
    }

    @Override // defpackage.adoc
    public void stopRcsStack(int i) {
        try {
            a().stopRcsStack(i);
        } catch (IllegalStateException e) {
            advr.j(e, this.B, "RcsEngine is not initialized.", new Object[0]);
        }
    }

    @Override // com.google.android.ims.rcs.engine.IRcsEngineController
    public RcsEngineLifecycleServiceResult triggerStartRcsStack(int i) {
        a().startRcsStack(i);
        advr.l(this.B, "triggerStartRcsStack: RcsEngine started", new Object[0]);
        return new RcsEngineLifecycleServiceResult(0);
    }

    @Override // com.google.android.ims.rcs.engine.IRcsEngineController
    public RcsEngineLifecycleServiceResult triggerStopRcsStack(int i) {
        a().stopRcsStack(i);
        advr.l(this.B, "triggerStopRcsStack: RcsEngine stopped", new Object[0]);
        return new RcsEngineLifecycleServiceResult(0);
    }

    protected void unregisterReceivers() {
        unregisterSelfServiceMessageReceiver();
        try {
            this.y.unregisterReceiver(this.e);
        } catch (RuntimeException e) {
            advr.j(e, this.B, "Failed to unregister RecurringMetricsUploadReceiver.", new Object[0]);
        }
    }

    public void unregisterSelfServiceMessageReceiver() {
        try {
            this.y.unregisterReceiver((BroadcastReceiver) this.d.b());
        } catch (RuntimeException e) {
            advr.t(e, this.B, "Failed to unregister SelfServiceMessageReceiver.", new Object[0]);
        }
    }
}
