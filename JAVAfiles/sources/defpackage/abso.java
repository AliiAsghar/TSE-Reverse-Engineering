package defpackage;

import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.android.vcard.VCardConfig;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.TelemetryData;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abso implements Handler.Callback {
    public static final Status a = new Status(4, "Sign-out occurred while this API call was in progress.");
    public static final Status b = new Status(4, "The user must be signed in to make this API call.");
    public static final Object c = new Object();
    public static abso d;
    public final Context g;
    public final abqa h;
    public final abul i;
    public final Handler o;
    public volatile boolean p;
    private TelemetryData q;
    private abut r;
    public long e = 10000;
    public boolean f = false;
    public final AtomicInteger j = new AtomicInteger(1);
    public final AtomicInteger k = new AtomicInteger(0);
    public final Map l = new ConcurrentHashMap(5, 0.75f, 1);
    public absi m = null;
    public final Set n = new to();
    private final Set s = new to();

    private abso(Context context, Looper looper, abqa abqaVar) {
        this.p = true;
        this.g = context;
        acda acdaVar = new acda(looper, this);
        this.o = acdaVar;
        this.h = abqaVar;
        this.i = new abul(abqaVar);
        PackageManager packageManager = context.getPackageManager();
        if (abvd.b == null) {
            abvd.b = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (abvd.b.booleanValue()) {
            this.p = false;
        }
        acdaVar.sendMessage(acdaVar.obtainMessage(6));
    }

    public static Status a(abrv abrvVar, ConnectionResult connectionResult) {
        Object obj = abrvVar.a.c;
        return new Status(17, "API: " + ((String) obj) + " is not available on this device. Connection failed with: " + String.valueOf(connectionResult), connectionResult.d, connectionResult);
    }

    public static abso c(Context context) {
        abso absoVar;
        HandlerThread handlerThread;
        synchronized (c) {
            if (d == null) {
                synchronized (abui.b) {
                    handlerThread = abui.c;
                    if (handlerThread == null) {
                        abui.c = new HandlerThread("GoogleApiHandler", 9);
                        abui.c.start();
                        handlerThread = abui.c;
                    }
                }
                d = new abso(context.getApplicationContext(), handlerThread.getLooper(), abqa.a);
            }
            absoVar = d;
        }
        return absoVar;
    }

    private final absl j(abrc abrcVar) {
        Map map = this.l;
        abrv abrvVar = abrcVar.f;
        absl abslVar = (absl) map.get(abrvVar);
        if (abslVar == null) {
            abslVar = new absl(this, abrcVar);
            this.l.put(abrvVar, abslVar);
        }
        if (abslVar.l()) {
            this.s.add(abrvVar);
        }
        abslVar.b();
        return abslVar;
    }

    private final abut k() {
        if (this.r == null) {
            this.r = new abux(this.g, abuu.a);
        }
        return this.r;
    }

    private final void l() {
        TelemetryData telemetryData = this.q;
        if (telemetryData != null) {
            if (telemetryData.a > 0 || h()) {
                k().a(telemetryData);
            }
            this.q = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final absl b(abrv abrvVar) {
        return (absl) this.l.get(abrvVar);
    }

    public final void d(acit acitVar, int i, abrc abrcVar) {
        long j;
        long j2;
        if (i != 0) {
            abrv abrvVar = abrcVar.f;
            absz abszVar = null;
            if (h()) {
                RootTelemetryConfiguration rootTelemetryConfiguration = abus.a().a;
                boolean z = true;
                if (rootTelemetryConfiguration != null) {
                    if (rootTelemetryConfiguration.b) {
                        boolean z2 = rootTelemetryConfiguration.c;
                        absl b2 = b(abrvVar);
                        if (b2 != null) {
                            Object obj = b2.b;
                            if (obj instanceof BaseGmsClient) {
                                BaseGmsClient baseGmsClient = (BaseGmsClient) obj;
                                if (baseGmsClient.F() && !baseGmsClient.q()) {
                                    ConnectionTelemetryConfiguration b3 = absz.b(b2, baseGmsClient, i);
                                    if (b3 != null) {
                                        b2.h++;
                                        z = b3.c;
                                    }
                                }
                            }
                        }
                        z = z2;
                    }
                }
                if (z) {
                    j = System.currentTimeMillis();
                } else {
                    j = 0;
                }
                if (z) {
                    j2 = SystemClock.elapsedRealtime();
                } else {
                    j2 = 0;
                }
                abszVar = new absz(this, i, abrvVar, j, j2);
            }
            if (abszVar != null) {
                Object obj2 = acitVar.a;
                Handler handler = this.o;
                handler.getClass();
                ((acir) obj2).n(new fcv(handler, 6), abszVar);
            }
        }
    }

    public final void e(ConnectionResult connectionResult, int i) {
        if (!i(connectionResult, i)) {
            Handler handler = this.o;
            handler.sendMessage(handler.obtainMessage(5, i, 0, connectionResult));
        }
    }

    public final void f() {
        Handler handler = this.o;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void g(absi absiVar) {
        synchronized (c) {
            if (this.m != absiVar) {
                this.m = absiVar;
                this.n.clear();
            }
            this.n.addAll(absiVar.e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean h() {
        if (this.f) {
            return false;
        }
        RootTelemetryConfiguration rootTelemetryConfiguration = abus.a().a;
        if (rootTelemetryConfiguration != null && !rootTelemetryConfiguration.b) {
            return false;
        }
        int b2 = this.i.b(203400000);
        if (b2 != -1 && b2 != 0) {
            return false;
        }
        return true;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        Status status;
        Feature[] b2;
        long j = 300000;
        absl abslVar = null;
        switch (message.what) {
            case 1:
                if (true == ((Boolean) message.obj).booleanValue()) {
                    j = 10000;
                }
                this.e = j;
                this.o.removeMessages(12);
                for (abrv abrvVar : this.l.keySet()) {
                    Handler handler = this.o;
                    handler.sendMessageDelayed(handler.obtainMessage(12, abrvVar), this.e);
                }
                return true;
            case 2:
                throw null;
            case 3:
                for (absl abslVar2 : this.l.values()) {
                    abslVar2.a();
                    abslVar2.b();
                }
                return true;
            case 4:
            case 8:
            case 13:
                apuv apuvVar = (apuv) message.obj;
                absl abslVar3 = (absl) this.l.get(((abrc) apuvVar.c).f);
                if (abslVar3 == null) {
                    abslVar3 = j((abrc) apuvVar.c);
                }
                if (abslVar3.l() && this.k.get() != apuvVar.a) {
                    ((abru) apuvVar.b).d(a);
                    abslVar3.j();
                } else {
                    abslVar3.c((abru) apuvVar.b);
                }
                return true;
            case 5:
                int i = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                Iterator it = this.l.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        absl abslVar4 = (absl) it.next();
                        if (abslVar4.e == i) {
                            abslVar = abslVar4;
                        }
                    }
                }
                if (abslVar != null) {
                    if (connectionResult.c == 13) {
                        int i2 = abqp.c;
                        abslVar.d(new Status(17, "Error resolution was canceled by the user, original error message: CANCELED: " + connectionResult.e));
                    } else {
                        abslVar.d(a(abslVar.c, connectionResult));
                    }
                } else {
                    Log.wtf("GoogleApiManager", a.cb(i, "Could not find API instance ", " while trying to fail enqueued calls."), new Exception());
                }
                return true;
            case 6:
                if (this.g.getApplicationContext() instanceof Application) {
                    abrx.b((Application) this.g.getApplicationContext());
                    abrx.a.a(new absk(this));
                    abrx abrxVar = abrx.a;
                    if (!abrxVar.c.get()) {
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (!abrxVar.c.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                            abrxVar.b.set(true);
                        }
                    }
                    if (!abrxVar.c()) {
                        this.e = 300000L;
                    }
                }
                return true;
            case 7:
                j((abrc) message.obj);
                return true;
            case 9:
                if (this.l.containsKey(message.obj)) {
                    absl abslVar5 = (absl) this.l.get(message.obj);
                    abhg.d(abslVar5.i.o);
                    if (abslVar5.f) {
                        abslVar5.b();
                    }
                }
                return true;
            case 10:
                tn tnVar = new tn((to) this.s);
                while (tnVar.hasNext()) {
                    absl abslVar6 = (absl) this.l.remove((abrv) tnVar.next());
                    if (abslVar6 != null) {
                        abslVar6.j();
                    }
                }
                this.s.clear();
                return true;
            case 11:
                if (this.l.containsKey(message.obj)) {
                    absl abslVar7 = (absl) this.l.get(message.obj);
                    abhg.d(abslVar7.i.o);
                    if (abslVar7.f) {
                        abslVar7.k();
                        abso absoVar = abslVar7.i;
                        if (absoVar.h.g(absoVar.g) == 18) {
                            status = new Status(21, "Connection timed out waiting for Google Play services update to complete.");
                        } else {
                            status = new Status(22, "API failed to connect while resuming due to an unknown error.");
                        }
                        abslVar7.d(status);
                        abslVar7.b.g("Timing out connection while resuming.");
                    }
                }
                return true;
            case 12:
                if (this.l.containsKey(message.obj)) {
                    ((absl) this.l.get(message.obj)).m(true);
                }
                return true;
            case 14:
                znp znpVar = (znp) message.obj;
                Object obj = znpVar.a;
                if (!this.l.containsKey(obj)) {
                    ((acit) znpVar.b).b(false);
                } else {
                    ((acit) znpVar.b).b(Boolean.valueOf(((absl) this.l.get(obj)).m(false)));
                }
                return true;
            case 15:
                absm absmVar = (absm) message.obj;
                if (this.l.containsKey(absmVar.a)) {
                    absl abslVar8 = (absl) this.l.get(absmVar.a);
                    if (abslVar8.g.contains(absmVar) && !abslVar8.f) {
                        if (!abslVar8.b.p()) {
                            abslVar8.b();
                        } else {
                            abslVar8.e();
                        }
                    }
                }
                return true;
            case 16:
                absm absmVar2 = (absm) message.obj;
                if (this.l.containsKey(absmVar2.a)) {
                    absl abslVar9 = (absl) this.l.get(absmVar2.a);
                    if (abslVar9.g.remove(absmVar2)) {
                        abslVar9.i.o.removeMessages(15, absmVar2);
                        abslVar9.i.o.removeMessages(16, absmVar2);
                        Feature feature = absmVar2.b;
                        ArrayList arrayList = new ArrayList(abslVar9.a.size());
                        for (abru abruVar : abslVar9.a) {
                            if ((abruVar instanceof abro) && (b2 = ((abro) abruVar).b(abslVar9)) != null) {
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= b2.length) {
                                        break;
                                    }
                                    if (d.B(b2[i3], feature)) {
                                        arrayList.add(abruVar);
                                    } else {
                                        i3++;
                                    }
                                }
                            }
                        }
                        int size = arrayList.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            abru abruVar2 = (abru) arrayList.get(i4);
                            abslVar9.a.remove(abruVar2);
                            abruVar2.e(new abrn(feature));
                        }
                    }
                }
                return true;
            case 17:
                l();
                return true;
            case 18:
                abta abtaVar = (abta) message.obj;
                if (abtaVar.c == 0) {
                    k().a(new TelemetryData(abtaVar.b, Arrays.asList(abtaVar.a)));
                } else {
                    TelemetryData telemetryData = this.q;
                    if (telemetryData != null) {
                        List list = telemetryData.b;
                        if (telemetryData.a == abtaVar.b && (list == null || list.size() < abtaVar.d)) {
                            TelemetryData telemetryData2 = this.q;
                            MethodInvocation methodInvocation = abtaVar.a;
                            if (telemetryData2.b == null) {
                                telemetryData2.b = new ArrayList();
                            }
                            telemetryData2.b.add(methodInvocation);
                        } else {
                            this.o.removeMessages(17);
                            l();
                        }
                    }
                    if (this.q == null) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(abtaVar.a);
                        this.q = new TelemetryData(abtaVar.b, arrayList2);
                        Handler handler2 = this.o;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), abtaVar.c);
                    }
                }
                return true;
            case 19:
                this.f = false;
                return true;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + message.what);
                return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean i(ConnectionResult connectionResult, int i) {
        PendingIntent j;
        Context context = this.g;
        if (abvk.j(context)) {
            return false;
        }
        abqa abqaVar = this.h;
        if (connectionResult.a()) {
            j = connectionResult.d;
        } else {
            j = abqaVar.j(context, connectionResult.c, null);
        }
        if (j == null) {
            return false;
        }
        abqaVar.f(context, connectionResult.c, accy.a(context, GoogleApiActivity.a(context, j, i, true), accy.a | VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS));
        return true;
    }
}
