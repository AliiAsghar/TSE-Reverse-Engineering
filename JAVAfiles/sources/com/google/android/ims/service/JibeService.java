package com.google.android.ims.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.ims.rcsservice.chatsession.IChatSession;
import com.google.android.ims.receiver.sip.DebugOptionsReceiver;
import com.google.android.ims.service.JibeService;
import defpackage.acnu;
import defpackage.acoa;
import defpackage.acpq;
import defpackage.acqo;
import defpackage.acrh;
import defpackage.acrj;
import defpackage.acrl;
import defpackage.acyz;
import defpackage.aczc;
import defpackage.aczd;
import defpackage.aczv;
import defpackage.adhp;
import defpackage.adod;
import defpackage.adqg;
import defpackage.adtl;
import defpackage.adtn;
import defpackage.adtt;
import defpackage.adtu;
import defpackage.adtx;
import defpackage.adub;
import defpackage.aduc;
import defpackage.adue;
import defpackage.advp;
import defpackage.advr;
import defpackage.adwi;
import defpackage.ahtp;
import defpackage.akto;
import defpackage.anen;
import defpackage.apwt;
import defpackage.armf;
import defpackage.xyl;
import defpackage.yhx;
import j$.util.Objects;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public class JibeService extends Service implements Thread.UncaughtExceptionHandler {
    public static final advp a = new advp("JibeService");
    private static final acyz k;
    private static final acyz l;
    public final AtomicReference b = new AtomicReference(aduc.STOPPED);
    public Thread.UncaughtExceptionHandler c;
    public apwt d;
    public anen e;
    public armf f;
    public adod g;
    public armf h;
    public apwt i;
    public acrl j;
    private acoa m;

    static {
        new WeakReference(null);
        k = aczd.a(179710499);
        l = aczd.a(193752012);
    }

    public static void a(Context context, String str, Bundle bundle) {
        Intent intent = new Intent(context, (Class<?>) JibeService.class);
        intent.setAction(str);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        if ("com.google.android.apps.tycho".equals(context.getPackageName())) {
            advr.d(a, "Ignoring start action because we are running in Tycho", new Object[0]);
            return;
        }
        if (adwi.i(context) && adwi.a(context) == 2) {
            advr.r(a, "Ignoring start action because JibeService is running in CS.apk.", new Object[0]);
        } else if (adwi.d(context)) {
            context.startService(intent);
        } else {
            advr.r(a, "Ignoring start action: %s", str);
        }
    }

    private final void c() {
        apwt apwtVar = this.d;
        if (apwtVar != null) {
            adtl adtlVar = (adtl) apwtVar.b();
            if (!Objects.isNull(adtlVar)) {
                adtlVar.j();
            }
        }
    }

    private final boolean d(Intent intent) {
        String action = intent.getAction();
        if ("action.bootCompleted".equals(action)) {
            advr.d(a, "Handling boot completed. No action.", new Object[0]);
            return true;
        }
        if ("action.upgraded".equals(action)) {
            advr.d(a, "Handling app upgraded. No action.", new Object[0]);
            return true;
        }
        if ("com.google.android.ims.SIM_LOADED".equals(action)) {
            boolean booleanExtra = intent.getBooleanExtra("SIM_CHANGED", false);
            if (this.g != null) {
                advr.l(a, "Handling SIM loaded; changed: %b", Boolean.valueOf(booleanExtra));
                this.g.onSimLoaded(booleanExtra);
            } else {
                advr.r(a, "unable to handle ACTION_SIM_LOADED event, with null rcsEngineProxy", new Object[0]);
            }
            return true;
        }
        if (!"com.google.android.ims.SIM_ABSENT".equals(action)) {
            return false;
        }
        if (this.g != null) {
            advr.l(a, "Handling SIM absent", new Object[0]);
            this.g.onSimAbsent();
        } else {
            advr.r(a, "unable to handle ACTION_SIM_ABSENT event, with null rcsEngineProxy", new Object[0]);
        }
        return true;
    }

    public final void b(aduc aducVar) {
        this.b.set(aducVar);
    }

    @Override // android.app.Service
    public final void dump(FileDescriptor fileDescriptor, final PrintWriter printWriter, String[] strArr) {
        printWriter.println("** Carrier Services Lib Log **");
        anen anenVar = this.e;
        if (Objects.isNull(anenVar)) {
            printWriter.printf("  Not initialized. (state=%s)%n", this.b.get());
        } else {
            try {
                anenVar.submit(akto.j(new Runnable() { // from class: adua
                    /* JADX WARN: Type inference failed for: r2v2, types: [armf, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r2v5, types: [adtm, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r2v6, types: [armf, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r2v9, types: [armf, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r6v0, types: [armf, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r6v20, types: [armf, java.lang.Object] */
                    @Override // java.lang.Runnable
                    public final void run() {
                        String j;
                        String str;
                        PrintWriter printWriter2 = printWriter;
                        JibeService jibeService = JibeService.this;
                        if (jibeService.b.get() != aduc.STARTED) {
                            printWriter2.printf("  Not initialized. (state=%s)%n", jibeService.b.get());
                            return;
                        }
                        armf armfVar = jibeService.h;
                        if (armfVar != null) {
                            afxz afxzVar = (afxz) armfVar.b();
                            adtl adtlVar = (adtl) afxzVar.f.b();
                            String f = adtlVar.f();
                            if (((acxv) afxzVar.d.b()).a()) {
                                j = ((aday) afxzVar.c.b()).m(f);
                            } else {
                                Object obj = afxzVar.a;
                                adnu.a();
                                j = adnu.j((Context) obj, f);
                            }
                            String str2 = acny.c;
                            printWriter2.println("- IMS Diagnostics Sender");
                            printWriter2.println(" Session ID: ".concat(String.valueOf(acny.c)));
                            printWriter2.println(" Sequence Number: ".concat(String.valueOf(String.valueOf(acny.d))));
                            printWriter2.println(" Provisioning Session ID: ".concat(String.valueOf(j)));
                            adtlVar.a.l(printWriter2);
                            ((adod) afxzVar.e.b()).dumpState(printWriter2);
                            aduu aduuVar = (aduu) afxzVar.b.b();
                            printWriter2.println("- Private Jibe Data -");
                            aduuVar.l("sessionid", printWriter2);
                            aduuVar.l("requestid", printWriter2);
                            aduuVar.l("first_time_discovery_finished", printWriter2);
                            aduuVar.l("provisioning_acs_url_override", printWriter2);
                            aduuVar.l("provisioning_sms_port_override", printWriter2);
                            aduuVar.l("provisioning_last_attempt", printWriter2);
                            aduuVar.l("send_error_result_from_engine", printWriter2);
                            aduuVar.l("capabilities_pidf_etag", printWriter2);
                            printWriter2.println("======== Carrier Services Phenotype Feature Flags ========");
                            acyu.a().k(printWriter2);
                            aczf.o().k(printWriter2);
                            aczg.a().k(printWriter2);
                            aczh.a().k(printWriter2);
                            aczi.a().k(printWriter2);
                            aczl.c().k(printWriter2);
                            aczm.a().k(printWriter2);
                            aczn.a().k(printWriter2);
                            aczo.a().k(printWriter2);
                            aczp.a().k(printWriter2);
                            if (aczq.a == null) {
                                aczq.a();
                            }
                            aczq.a.k(printWriter2);
                            aczr.a().k(printWriter2);
                            aczs.c().k(printWriter2);
                            aczt.a().k(printWriter2);
                            aczv.s().k(printWriter2);
                            aczx.a().k(printWriter2);
                            adaa.p().k(printWriter2);
                            adab.a().k(printWriter2);
                            adac.c().k(printWriter2);
                            aczy.a().k(printWriter2);
                            aczj.a().k(printWriter2);
                            printWriter2.println("======== End Carrier Services Phenotype Feature Flags ========");
                            if (acpq.E().L() == 6) {
                                str = "MobileConfiguration";
                            } else if (acpq.E().L() == 5) {
                                str = "Phenotype";
                            } else {
                                str = "GServices";
                            }
                            printWriter2.printf("======== Carrier Services %s Rcs Flags ========%n", str);
                            Iterator it = acpq.E().G().iterator();
                            while (it.hasNext()) {
                                printWriter2.println((acpp) it.next());
                            }
                            printWriter2.printf("======== End Carrier Services %s Rcs Flags ========%n", str);
                            printWriter2.println("======== Carrier Services Kill Switches ========");
                            aczd.c().k(printWriter2);
                            printWriter2.println("======== End Carrier Services Kill Switches ========");
                            printWriter2.println("======== Carrier Services Allow Switches ========");
                            if (acyy.b != null) {
                                acyy.a().k(printWriter2);
                            }
                            printWriter2.println("======== End Carrier Services Allow Switches ========");
                            printWriter2.flush();
                            Object obj2 = afxzVar.a;
                            StringBuilder sb = new StringBuilder("Carrier Services GServices flags:\n");
                            try {
                                for (Map.Entry entry : acmd.d(((Context) obj2).getApplicationContext().getContentResolver(), "carrier_services_").entrySet()) {
                                    sb.append("   ");
                                    sb.append((String) entry.getKey());
                                    sb.append(": ");
                                    sb.append((String) entry.getValue());
                                    sb.append("\n");
                                }
                                sb.append("====================\n");
                            } catch (Exception e) {
                                sb.append("Error: Cannot get GServices values.\n");
                                sb.append(e);
                            }
                            printWriter2.print(sb.toString());
                            advr.f(printWriter2);
                        }
                    }
                })).get(5L, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                advr.h(a, "Unable to dump report on JibeService: %s", e.getMessage());
                Thread.currentThread().interrupt();
            } catch (ExecutionException e2) {
                advr.h(a, "Unable to dump report on JibeService: %s", e2.getMessage());
            } catch (TimeoutException e3) {
                advr.h(a, "Timed out while dumping RCS bugreport: %s", e3.getMessage());
            }
        }
        printWriter.println("** End Carrier Services Lib Log **");
        printWriter.flush();
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        armf armfVar;
        String action = intent.getAction();
        advp advpVar = a;
        aduc aducVar = (aduc) this.b.get();
        aduc aducVar2 = aduc.STOPPED;
        advr.l(advpVar, "onBind in state %s, intent action = %s", aducVar.e, action);
        if (yhx.g(this)) {
            advr.r(advpVar, "Running as secondary user - binding not allowed!", new Object[0]);
            acoa acoaVar = this.m;
            acoaVar.getClass();
            acoaVar.a(4);
            return null;
        }
        if (!((Boolean) l.a()).booleanValue() && (this.b.get() == aduc.STOPPING || this.b.get() == aduc.STOPPED)) {
            advr.h(advpVar, "onBind should never be called while in state %s", this.b);
            acoa acoaVar2 = this.m;
            acoaVar2.getClass();
            acoaVar2.a(3);
            return null;
        }
        if (!d(intent)) {
            if ("csapk.created".equals(action)) {
                advr.d(advpVar, "onBind: CS apk created", new Object[0]);
            } else if ("com.google.android.ims.JibeServiceBase".equals(action)) {
                advr.d(advpVar, "onBind: JibeServiceBase", new Object[0]);
            } else {
                if (((Boolean) k.a()).booleanValue() && (armfVar = this.f) != null) {
                    ((adqg) armfVar.b()).e();
                }
                String action2 = intent.getAction();
                if (action2 != null) {
                    if (adue.a(getApplicationContext()).b(action2).isPresent()) {
                        return (IBinder) adue.a(getApplicationContext()).b(action2).get();
                    }
                    advr.r(advpVar, "[BUG] Can't find a IBinder for %s. This should not happen.", action2);
                    acoa acoaVar3 = this.m;
                    acoaVar3.getClass();
                    acoaVar3.a(7);
                    return null;
                }
            }
        }
        advr.r(advpVar, "onBind: JibeService not returning binder", new Object[0]);
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        acrh b = acrj.b(this);
        ahtp.f(getApplicationContext());
        aczc.m();
        adtn r = b.r();
        acnu i = b.i();
        acpq.I(this);
        advp advpVar = a;
        advr.d(advpVar, "onCreate:", new Object[0]);
        if (adwi.i(getApplicationContext()) && adwi.a(getApplicationContext()) == 2) {
            advr.r(advpVar, "RCS Engine is supposed to run in CS.apk.", new Object[0]);
        }
        adue.a(getApplicationContext());
        if (Looper.myLooper() != Looper.getMainLooper()) {
            advr.u("must be called from the main thread!", new Object[0]);
        }
        advr.d(advpVar, "Starting JibeService.", new Object[0]);
        if (this.b.get() != aduc.STARTED && this.b.get() != aduc.STARTING) {
            if (!xyl.n() && yhx.g(this)) {
                advr.r(advpVar, "Running as secondary user - stopping service!", new Object[0]);
                stopSelf();
            } else if (!aczv.P() && !acrj.b(getApplicationContext()).c().h()) {
                advr.r(advpVar, "Missing required permissions - stopping service!", new Object[0]);
                stopSelf();
            } else {
                b(aduc.STARTING);
                HandlerThread handlerThread = new HandlerThread("JibeServiceInitThread");
                handlerThread.start();
                new Handler(handlerThread.getLooper()).post(new adhp(this, 17));
                handlerThread.quitSafely();
            }
        } else {
            advr.d(advpVar, "Already started. state=%s", this.b);
        }
        new WeakReference(this);
        this.m = new acoa(getApplicationContext(), r, i);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        advr.l(a, "onDestroy: stopping service", new Object[0]);
        if (this.b.get() == aduc.STOPPED) {
            return;
        }
        new WeakReference(null);
        b(aduc.STOPPING);
        try {
            try {
                adod adodVar = this.g;
                if (adodVar != null) {
                    adodVar.destroyRcsEngine();
                    adtu adtuVar = (adtu) this.i.b();
                    if (!Objects.isNull(adtuVar)) {
                        adtuVar.a();
                    }
                }
                Context applicationContext = getApplicationContext();
                DebugOptionsReceiver.b(applicationContext);
                adtt.b(applicationContext);
                if ("com.google.android.apps.messaging".equals(applicationContext.getPackageName())) {
                    boolean z = acqo.a;
                    Context applicationContext2 = applicationContext.getApplicationContext();
                    if (acqo.b.get(applicationContext2.hashCode(), false)) {
                        applicationContext2.unregisterReceiver(acqo.c);
                        applicationContext2.unregisterReceiver(acqo.d);
                        acqo.b.delete(applicationContext2.hashCode());
                    }
                }
            } catch (Exception e) {
                advr.j(e, a, "onDestroy() unregister factory exception", new Object[0]);
            }
        } finally {
            adue.a(getApplicationContext()).c();
            adtx.b();
            c();
            b(aduc.STOPPED);
        }
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        armf armfVar;
        advr.d(a, "onRebind(), intent=%s", intent);
        if (((Boolean) k.a()).booleanValue() && IChatSession.class.getName().equals(intent.getAction()) && (armfVar = this.f) != null) {
            ((adqg) armfVar.b()).e();
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (intent == null) {
            return super.onStartCommand(null, i, i2);
        }
        if (this.b.get() != aduc.STARTED) {
            return super.onStartCommand(intent, i, i2);
        }
        d(intent);
        return super.onStartCommand(intent, i, i2);
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        advr.d(a, "onUnbind(), intent=%s", intent);
        if (((Boolean) k.a()).booleanValue() && IChatSession.class.getName().equals(intent.getAction())) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        adub adubVar = new adub(this, thread, th, 0);
        if (getMainLooper().getThread() != thread) {
            advr.j(th, a, "Uncaught exception in background thread %s", thread);
            new Handler(getMainLooper()).post(adubVar);
        } else {
            advr.j(th, a, "Uncaught exception in primary thread %s", thread);
            adubVar.run();
        }
    }
}
