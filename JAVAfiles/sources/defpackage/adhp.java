package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.google.android.ims.receiver.sip.DebugOptionsReceiver;
import com.google.android.ims.service.JibeService;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.IOException;
import java.lang.Thread;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class adhp implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ adhp(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r2v48, types: [java.lang.Thread$UncaughtExceptionHandler, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        String[] strArr;
        Optional of;
        adtk adtkVar;
        Context context;
        adtz adtzVar;
        String d;
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler;
        Intent intent = null;
        switch (this.b) {
            case 0:
                Object obj2 = this.a;
                adhq adhqVar = (adhq) obj2;
                long a = adhqVar.b.E.a();
                if (a == 0) {
                    adhw adhwVar = adhqVar.b;
                    adhwVar.w(adhwVar.U);
                } else {
                    advr.l(adhqVar.b.m, "Scheduling MSG_RETRY_TIMEOUT for %ds.", Long.valueOf(a));
                    adhqVar.b.J(new adhp(obj2, 2), a, TimeUnit.SECONDS);
                    adhqVar.b.F = agkx.W().longValue() + (a * 1000);
                }
                adhqVar.b.E.b();
                return;
            case 1:
                adhm adhmVar = (adhm) this.a;
                adhw adhwVar2 = adhmVar.b;
                if (adhwVar2.v == null) {
                    advr.h(adhwVar2.m, "SIP transport is not available", new Object[0]);
                    adhw adhwVar3 = adhmVar.b;
                    adhwVar3.w(adhwVar3.U);
                    return;
                } else {
                    if (adhwVar2.r.a.u()) {
                        advr.h(adhmVar.b.m, "SipStack is not available", new Object[0]);
                        adhw adhwVar4 = adhmVar.b;
                        adhwVar4.w(adhwVar4.U);
                        return;
                    }
                    adhmVar.b.q(1);
                    return;
                }
            case 2:
                ((adhq) this.a).b.q(15);
                return;
            case 3:
                adhw adhwVar5 = ((adhv) this.a).b;
                adhwVar5.w(adhwVar5.ag);
                return;
            case 4:
                ((adhv) this.a).g();
                return;
            case 5:
                ((adif) this.a).j();
                return;
            case 6:
                advr.r(((adif) this.a).b, "Server didn't respond to keep-alive, restarting IMS connection", new Object[0]);
                Iterator it = ((adif) this.a).g.iterator();
                while (it.hasNext()) {
                    ((adig) it.next()).b();
                }
                return;
            case 7:
                ((adlc) this.a).c.U(adjj.MSG_REPLAY_REQUEST);
                return;
            case 8:
                ((adlj) this.a).b.U(adjj.MSG_RETRY_PROVISIONING);
                return;
            case 9:
                ((adms) this.a).n.v(4, altg.a, altc.a);
                return;
            case 10:
                Process.setThreadPriority(10);
                this.a.run();
                return;
            case 11:
                adpk adpkVar = adpk.INITIAL;
                while (((adon) this.a).a != adpk.STOPPED) {
                    try {
                        try {
                            if (adpkVar == ((adon) this.a).a) {
                                synchronized (((adon) this.a).b) {
                                    try {
                                        ((adon) this.a).b.wait(15000L);
                                    } catch (InterruptedException unused) {
                                        advr.q("Interrupted", new Object[0]);
                                    }
                                }
                            } else {
                                adpk adpkVar2 = ((adon) this.a).a;
                                advr.c("Processing state: %s", adpkVar2);
                                if (adpkVar2 == adpk.INITIAL) {
                                    ((adon) this.a).a = adpk.STARTING;
                                } else if (adpkVar2 == adpk.STARTING) {
                                    Object obj3 = this.a;
                                    try {
                                        ((adon) obj3).d();
                                    } catch (Exception e) {
                                        advr.i(e, "Error while calling starting: %s", e.getMessage());
                                        ((adon) obj3).c = e;
                                        ((adon) obj3).a = adpk.STOPPING;
                                    }
                                    if (((adon) this.a).a == adpk.STARTING) {
                                        ((adon) this.a).a = adpk.RUNNING;
                                        Object obj4 = this.a;
                                        try {
                                            ((adon) obj4).c();
                                        } catch (Exception e2) {
                                            advr.i(e2, "Error while calling started: %s", e2.getMessage());
                                            ((adon) obj4).c = e2;
                                            ((adon) obj4).a = adpk.STOPPING;
                                        }
                                    }
                                } else if (adpkVar2 == adpk.RUNNING) {
                                    Object obj5 = this.a;
                                    try {
                                        ((adon) obj5).b();
                                    } catch (Exception e3) {
                                        advr.i(e3, "Error while calling run: %s", e3.getMessage());
                                        ((adon) obj5).c = e3;
                                        ((adon) obj5).a = adpk.STOPPING;
                                    }
                                } else if (adpkVar2 == adpk.STOPPING) {
                                    Object obj6 = this.a;
                                    try {
                                        try {
                                            advr.c("On stopping", new Object[0]);
                                            Throwable th = ((adon) obj6).c;
                                            if (th == null) {
                                                ((adon) obj6).f();
                                            } else {
                                                ((adon) obj6).g(th);
                                            }
                                        } catch (Exception e4) {
                                            advr.i(e4, "Error while calling stopping: %s", e4.getMessage());
                                            ((adon) obj6).a = adpk.STOPPED;
                                        }
                                    } finally {
                                        ((adon) obj6).a = adpk.STOPPED;
                                    }
                                }
                                adpkVar = adpkVar2;
                            }
                        } catch (Exception e5) {
                            advr.i(e5, "Error while running session: %s", e5.getMessage());
                        }
                    } finally {
                        ((adon) this.a).p();
                    }
                }
                return;
            case 12:
                try {
                    ((ador) this.a).f(((ador) this.a).a());
                    return;
                } catch (Exception e6) {
                    advr.i(e6, "Error while referring: %s", e6.getMessage());
                    ((ador) this.a).c(new ados("Error while rejecting refer: ".concat(String.valueOf(e6.getMessage())), e6));
                    return;
                }
            case 13:
                ((adpu) this.a).d();
                return;
            case 14:
                break;
            case 15:
                Object obj7 = this.a;
                adtp adtpVar = new adtp((adtr) obj7);
                try {
                    adwq.b(((adtr) obj7).f).e(adtpVar);
                    ((adtr) obj7).b = adtpVar;
                    advr.d(adtr.a, "SubscriptionsChangedListener is added.", new Object[0]);
                    return;
                } catch (adwk e7) {
                    advr.j(e7, adtr.a, "Failed to add onSubscriptionsChangedListener.", new Object[0]);
                    return;
                }
            case 16:
                Object obj8 = this.a;
                synchronized (obj8) {
                    advr.k("delay time out, reset attempts %d and process SIM event", Integer.valueOf(((adts) obj8).c));
                    ((adts) obj8).c = 0;
                    adtkVar = ((adts) obj8).b;
                    context = ((adts) obj8).a;
                }
                if (adtkVar != null && context != null) {
                    Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.SIM_STATE_CHANGED"));
                    if (registerReceiver == null) {
                        advr.k("No SIM state found", new Object[0]);
                    } else {
                        intent = registerReceiver;
                    }
                    if (intent != null) {
                        adtkVar.a(context, intent);
                        ((adts) obj8).a();
                        return;
                    }
                    return;
                }
                return;
            case 17:
                advr.d(JibeService.a, "Initialize JibeService.", new Object[0]);
                ?? r2 = this.a;
                try {
                    agkx.R();
                    if (!xyl.n() && !ActivityManager.isUserAMonkey() && (defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler()) != r2) {
                        ((JibeService) r2).c = defaultUncaughtExceptionHandler;
                        Thread.setDefaultUncaughtExceptionHandler(r2);
                    }
                    Context applicationContext = ((JibeService) r2).getApplicationContext();
                    synchronized (adtx.a) {
                        if (adtx.b == null) {
                            advr.k("Creating JibeServiceComponent", new Object[0]);
                            adtx.b = new adtz(acrj.b(applicationContext.getApplicationContext()));
                        }
                        adtzVar = adtx.b;
                    }
                    ((JibeService) r2).d = apxv.a(adtzVar.b);
                    ((JibeService) r2).e = (anen) adtzVar.c.b();
                    adtzVar.aS.f().getClass();
                    adtzVar.aS.e().getClass();
                    ((JibeService) r2).f = adtzVar.e;
                    ((JibeService) r2).g = (adod) adtzVar.I.b();
                    ((JibeService) r2).h = adtzVar.aP;
                    ((JibeService) r2).j = (acrl) adtzVar.aQ.b();
                    ((JibeService) r2).i = apxv.a(adtzVar.aR);
                    adtzVar.aS.g().getClass();
                    ((adtl) ((JibeService) r2).d.b()).h();
                    acrl acrlVar = ((JibeService) r2).j;
                    Context context2 = acrlVar.a;
                    adih adihVar = acrlVar.b;
                    adod adodVar = acrlVar.c;
                    aduu aduuVar = acrlVar.d;
                    try {
                        if (Build.VERSION.SDK_INT == 28) {
                            abui.a = 32;
                        }
                        acqo.b(context2);
                        acqo.a(context2);
                        actx.a(context2);
                        d = adihVar.d();
                        xyl.f(TextUtils.isEmpty(d));
                    } catch (Exception e8) {
                        advr.i(e8, "Failed to properly initialize JibeService", new Object[0]);
                    }
                    if (!TextUtils.isEmpty(d)) {
                        File file = new File(d);
                        try {
                            if (!file.exists()) {
                                file.mkdirs();
                            }
                            DebugOptionsReceiver.a(context2, adodVar, aduuVar);
                            adtt.a(context2, adodVar);
                            abjc.j(context2);
                            ((JibeService) r2).g.initializeRcsEngineForBugle();
                            ((adtu) ((JibeService) r2).i.b()).b(((JibeService) r2).getApplicationContext(), ((adtl) ((JibeService) r2).d.b()).c(), new adom());
                            ((JibeService) r2).b(aduc.STARTED);
                            return;
                        } catch (SecurityException unused2) {
                            throw new IllegalStateException("Attempted create directory without permissions");
                        }
                    }
                    throw new IllegalArgumentException("Cannot create directory, invalid empty path");
                } catch (Exception e9) {
                    advr.j(e9, JibeService.a, "Initialization failed - stopping service! ", new Object[0]);
                    JibeService jibeService = (JibeService) r2;
                    jibeService.b(aduc.STOPPED);
                    jibeService.stopSelf();
                    return;
                }
            case 18:
                ((aduk) this.a).a();
                return;
            case 19:
                ((aduk) this.a).a();
                return;
            default:
                advr.c("Retrying all", new Object[0]);
                Iterator it2 = ((ConcurrentHashMap) ((adve) this.a).a).values().iterator();
                if (!it2.hasNext()) {
                    return;
                }
                adxq adxqVar = (adxq) it2.next();
                Object obj9 = adxqVar.b;
                Object obj10 = adxqVar.a;
                advr.c("Retrying element: %s", null);
                throw null;
        }
        while (!((adrh) this.a).r) {
            try {
                adqu adquVar = (adqu) ((adrh) this.a).q.take();
                try {
                    obj = this.a;
                    strArr = (String[]) Collection.EL.toArray(new adrj(((adrh) obj).s.mMessageTech, adquVar.t).a(true), new adak(5));
                } catch (aild | IOException unused3) {
                    ((adrh) this.a).u(adquVar, 50);
                }
                if (adquVar != null) {
                    advr.w(3, 3, "Pager message sending with messageid=%s", adquVar.k);
                    String str = adquVar.b;
                    if (!Objects.isNull(str)) {
                        adew adewVar = ((adou) obj).a;
                        aikb q = ((adrh) obj).q();
                        String s = ((adrh) obj).s(str);
                        aijw aijwVar = new aijw(aikb.v(), 1, s, adewVar.e(), s, q.p());
                        advr.l(adrh.g, "Send first pager message", new Object[0]);
                        aion c = ((adrh) obj).e.c(((adrh) obj).q(), aijwVar, adquVar.h, adrh.y(adquVar), adquVar.b(), Optional.ofNullable(null));
                        if (adquVar.a == adqt.DISPOSITION_NOTIFICATION) {
                            advr.w(5, 3, "Pager message created with messageid=%s", adquVar.k);
                        }
                        try {
                            adwf.u(c, adquVar.e, strArr);
                            if (aczf.F()) {
                                adrj adrjVar = new adrj(((adrh) obj).s.mMessageTech, adquVar.t);
                                if (!adrjVar.c()) {
                                    of = Optional.empty();
                                } else if (adrjVar.d()) {
                                    of = Optional.of("urn:urn-7:3gpp-service.ims.icsi.oma.cpm.msg");
                                } else {
                                    of = Optional.of("urn:urn-7:3gpp-service.ims.icsi.oma.cpm.session");
                                }
                                if (of.isPresent()) {
                                    try {
                                        c.s("P-Preferred-Service", (String) of.get());
                                    } catch (ailb e10) {
                                        advr.r(adrh.g, "Unable to add P-Preferred-Service.", new Object[0]);
                                        throw new aild("Unable to add P-Preferred-Service.", e10);
                                    }
                                }
                            }
                            ((adrh) obj).q().d(c, new adrg((adrh) obj, adquVar, aijwVar));
                        } catch (ailb e11) {
                            advr.r(adrh.g, "Unable to add appId!", new Object[0]);
                            e11.printStackTrace();
                        }
                    } else {
                        throw new IllegalArgumentException("Message receiver must not be null");
                    }
                } else {
                    throw new IllegalArgumentException("Message must not be null");
                }
            } catch (InterruptedException unused4) {
                advr.d(adrh.g, "Waiting for new pager mode messages got interrupted!", new Object[0]);
                return;
            }
        }
    }

    public adhp(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
