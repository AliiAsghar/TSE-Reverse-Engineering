package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.iid.MessengerCompat;
import com.google.android.gms.wearable.internal.NodeMigratedEventParcelable;
import com.google.android.ims.binding.SystemBindingService;
import com.google.android.ims.events.EventHubProxy;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import com.google.android.ims.util.common.RcsIntents;
import com.google.common.util.concurrent.SettableFuture;
import j$.time.Duration;
import j$.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class acbq implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ acbq(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, acij] */
    /* JADX WARN: Type inference failed for: r0v89, types: [java.lang.Object, arlq] */
    /* JADX WARN: Type inference failed for: r0v90, types: [java.lang.Object, arlq] */
    /* JADX WARN: Type inference failed for: r0v91, types: [java.lang.Object, arlq] */
    /* JADX WARN: Type inference failed for: r0v92, types: [java.lang.Object, arlq] */
    /* JADX WARN: Type inference failed for: r0v93, types: [java.lang.Object, arlq] */
    /* JADX WARN: Type inference failed for: r0v94, types: [java.lang.Object, arlq] */
    /* JADX WARN: Type inference failed for: r0v95, types: [java.lang.Object, arlq] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.util.concurrent.ScheduledExecutorService, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        long j;
        long j2;
        int i = 4;
        byte[] bArr = null;
        int i2 = 6;
        switch (this.b) {
            case 0:
                ((acbr) this.a).c();
                return;
            case 1:
                Object obj = this.a;
                while (true) {
                    synchronized (obj) {
                        if (((acbr) obj).a != 2) {
                            return;
                        }
                        if (((acbr) obj).c.isEmpty()) {
                            ((acbr) obj).e();
                            return;
                        }
                        acbs acbsVar = (acbs) ((acbr) obj).c.poll();
                        abhg.m(acbsVar);
                        ((acbr) obj).d.put(acbsVar.a, acbsVar);
                        ((acbr) obj).e.d.schedule(new acaj(obj, acbsVar, i, bArr), 30L, TimeUnit.SECONDS);
                        if (Log.isLoggable("MessengerIpcClient", 3)) {
                            Log.d("MessengerIpcClient", "Sending ".concat(acbsVar.toString()));
                        }
                        acbr acbrVar = (acbr) obj;
                        ajvj ajvjVar = acbrVar.e;
                        Messenger messenger = acbrVar.b;
                        Message obtain = Message.obtain();
                        obtain.what = 1;
                        obtain.arg1 = acbsVar.a;
                        obtain.replyTo = messenger;
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("oneWay", false);
                        bundle.putString("pkg", ((Context) ajvjVar.b).getPackageName());
                        bundle.putBundle(GroupManagementRequest.DATA_TAG, acbsVar.c);
                        obtain.setData(bundle);
                        try {
                            acak acakVar = ((acbr) obj).f;
                            abhg.m(acakVar);
                            Object obj2 = acakVar.a;
                            if (obj2 != null) {
                                ((Messenger) obj2).send(obtain);
                            } else {
                                Object obj3 = acakVar.b;
                                if (obj3 != null) {
                                    ((MessengerCompat) obj3).b(obtain);
                                } else {
                                    throw new IllegalStateException("Both messengers are null");
                                    break;
                                }
                            }
                        } catch (RemoteException e) {
                            acbrVar.a(2, e.getMessage());
                        }
                    }
                }
            case 2:
                Object obj4 = this.a;
                synchronized (((acie) obj4).a) {
                    if (!((acie) obj4).c()) {
                        return;
                    }
                    acex acexVar = acie.h;
                    acex.d("%s ** IS FORCE-RELEASED ON TIMEOUT **", ((acie) obj4).d);
                    ((acie) obj4).b();
                    if (!((acie) obj4).c()) {
                        return;
                    }
                    ((acie) obj4).b = 1;
                    ((acie) obj4).e();
                    return;
                }
            case 3:
                synchronized (((acii) this.a).a) {
                    ((acii) this.a).b.b();
                }
                return;
            case 4:
                ((acit) this.a).c(new TimeoutException());
                return;
            case 5:
                Object obj5 = this.a;
                acke ackeVar = new acke(((NodeMigratedEventParcelable) obj5).b, 0);
                try {
                    String str = ((NodeMigratedEventParcelable) obj5).a;
                    ackeVar.b();
                    return;
                } finally {
                }
            case 6:
                acmt acmtVar = (acmt) this.a;
                final Duration duration = (Duration) alzz.bi(acmt.a, Duration.ofMillis(acmtVar.e.a() - acmtVar.g));
                final Duration duration2 = (Duration) alzz.bi(acmt.a, Duration.ofMillis(acmtVar.e.a()));
                final int myPid = Process.myPid();
                final Duration a = acmtVar.a();
                final Duration b = acmtVar.b();
                final Duration c = acmtVar.c();
                final Context context = acmtVar.c;
                final acnz acnzVar = acmtVar.j;
                acnzVar.a(new Callable() { // from class: acnw
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        aozy createBuilder = apik.a.createBuilder();
                        aozy createBuilder2 = apil.a.createBuilder();
                        long millis = duration.toMillis();
                        if (!createBuilder2.b.isMutable()) {
                            createBuilder2.u();
                        }
                        Duration duration3 = duration2;
                        apil apilVar = (apil) createBuilder2.b;
                        apilVar.b |= 2;
                        apilVar.d = millis;
                        long millis2 = duration3.toMillis();
                        if (!createBuilder2.b.isMutable()) {
                            createBuilder2.u();
                        }
                        apag apagVar = createBuilder2.b;
                        apil apilVar2 = (apil) apagVar;
                        apilVar2.b |= 4;
                        apilVar2.e = millis2;
                        if (!apagVar.isMutable()) {
                            createBuilder2.u();
                        }
                        Duration duration4 = a;
                        int i3 = myPid;
                        apil apilVar3 = (apil) createBuilder2.b;
                        apilVar3.b |= 8;
                        apilVar3.f = i3;
                        long millis3 = duration4.toMillis();
                        if (!createBuilder2.b.isMutable()) {
                            createBuilder2.u();
                        }
                        Duration duration5 = b;
                        apil apilVar4 = (apil) createBuilder2.b;
                        apilVar4.b |= 16;
                        apilVar4.g = millis3;
                        long millis4 = duration5.toMillis();
                        if (!createBuilder2.b.isMutable()) {
                            createBuilder2.u();
                        }
                        Duration duration6 = c;
                        apil apilVar5 = (apil) createBuilder2.b;
                        apilVar5.b |= 32;
                        apilVar5.h = millis4;
                        long millis5 = duration6.toMillis();
                        if (!createBuilder2.b.isMutable()) {
                            createBuilder2.u();
                        }
                        apil apilVar6 = (apil) createBuilder2.b;
                        apilVar6.b |= 64;
                        apilVar6.i = millis5;
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        Context context2 = context;
                        acnz acnzVar2 = acnz.this;
                        apik apikVar = (apik) createBuilder.b;
                        apil apilVar7 = (apil) createBuilder2.s();
                        apilVar7.getClass();
                        apikVar.c = apilVar7;
                        apikVar.b = 3;
                        acnzVar2.x(context2, (apik) createBuilder.s());
                        return null;
                    }
                }, new acnk(i2));
                return;
            case 7:
                Object obj6 = this.a;
                SystemBindingService systemBindingService = (SystemBindingService) obj6;
                if (!adwi.h(systemBindingService.getApplicationContext())) {
                    return;
                }
                if (!adwi.k(systemBindingService.getApplicationContext())) {
                    alvw g = SystemBindingService.a.g();
                    g.X(alwp.a, "CarrierServices");
                    ((alvg) ((alvg) g).h("com/google/android/ims/binding/SystemBindingService", "startJibeService", 110, "SystemBindingService.java")).q("SystemBindingService: Starting JibeService");
                    systemBindingService.startService(new Intent().setComponent(new ComponentName((Context) obj6, "com.google.android.ims.service.JibeService")));
                }
                advz.b((Context) obj6, new Intent(RcsIntents.ACTION_RCS_SYSTEM_BINDING), "com.google.android.apps.messaging.rcsprovisioning.RcsProvisioningBroadcastReceiver", advy.SYSTEM_BINDING_SERVICE);
                return;
            case 8:
                acmt h = acrj.b(((SystemBindingService) this.a).getApplicationContext()).h();
                if (aczf.n() <= 0) {
                    advr.r(acmt.b, "System-Binding monitor disabled by phenotype flags.", new Object[0]);
                    return;
                }
                synchronized (h) {
                    if (h.h) {
                        return;
                    }
                    h.h = true;
                    alhp alhpVar = h.f;
                    alhpVar.d();
                    alhpVar.e();
                    ConnectivityManager connectivityManager = (ConnectivityManager) h.c.getSystemService("connectivity");
                    if (connectivityManager == null) {
                        advr.h(acmt.b, "SystemBindingMonitor received a null reference for the ConnectivityManager", new Object[0]);
                    } else {
                        synchronized (h) {
                            h.i = new acms(h);
                            connectivityManager.registerDefaultNetworkCallback(h.i);
                        }
                    }
                    acbq acbqVar = new acbq(h, i2);
                    aegu aeguVar = h.e;
                    long n = aczf.n();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    long a2 = aeguVar.a() + TimeUnit.MILLISECONDS.convert(0L, timeUnit);
                    long convert = TimeUnit.MILLISECONDS.convert(n, timeUnit);
                    SettableFuture create = SettableFuture.create();
                    AtomicReference atomicReference = new AtomicReference(null);
                    aneo aneoVar = h.d;
                    a.bE(atomicReference, aneoVar.schedule(new alfc(create, acbqVar, atomicReference, aneoVar, a2, convert, aeguVar), 0L, timeUnit));
                    create.c(new akwm(atomicReference, i), andi.a);
                    return;
                }
            case 9:
                boolean z = acqo.a;
                apkb F = acpq.E().F();
                Object obj7 = this.a;
                acoe acoeVar = acqo.e;
                if (acoeVar != null) {
                    acoeVar.e((Context) obj7, F);
                }
                if (!Objects.isNull(acqo.f)) {
                    if (acqo.f.a != ((Boolean) acpx.a.a()).booleanValue()) {
                        System.exit(0);
                    }
                }
                if (acqo.a) {
                    advr.y((Context) obj7);
                    return;
                }
                return;
            case 10:
                ((EventHubProxy) this.a).postQueuedEvents();
                return;
            case 11:
                synchronized (this) {
                    while (true) {
                        long longValue = agkx.W().longValue();
                        j = ((EventHubProxy) this.a).e;
                        if (longValue < j) {
                            try {
                                j2 = ((EventHubProxy) this.a).e;
                                wait(j2 - agkx.W().longValue());
                            } catch (InterruptedException e2) {
                                Thread.currentThread().interrupt();
                                advr.i(e2, "timer interrupted", new Object[0]);
                            }
                        } else {
                            ((EventHubProxy) this.a).e = Long.MAX_VALUE;
                        }
                    }
                }
                ((EventHubProxy) this.a).postQueuedEvents();
                return;
            case 12:
                ((addm) this.a).b();
                return;
            case 13:
                aded.j(this.a);
                return;
            case 14:
                aded.j(this.a);
                return;
            case 15:
                aded.j(this.a);
                return;
            case 16:
                aded.j(this.a);
                return;
            case 17:
                aded.j(this.a);
                return;
            case 18:
                aded.j(this.a);
                return;
            case 19:
                aded.j(this.a);
                return;
            default:
                ((adhv) ((ahjj) this.a).a).b.q(22);
                return;
        }
    }

    public acbq(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
