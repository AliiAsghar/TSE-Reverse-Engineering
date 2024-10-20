package defpackage;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.Process;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akat {
    public static final alvi a = alvi.m("com/google/apps/tiktok/concurrent/AndroidFutures");
    public final akau b;
    public final Context c;
    public final Map d;
    public final Map e;
    public final ahiy f;
    private final PowerManager g;
    private final anen h;
    private final akaz i;
    private final aneo j;
    private final aneo k;
    private final alhr l = albo.D(new ahsz(this, 13));
    private final alhr m = albo.D(new ahsz(this, 14));
    private boolean n = false;
    private final agrk o;

    public akat(Context context, PowerManager powerManager, akau akauVar, anen anenVar, Map map, Map map2, ahiy ahiyVar, akaz akazVar, aneo aneoVar, aneo aneoVar2, agrk agrkVar) {
        this.c = context;
        this.g = powerManager;
        this.h = anenVar;
        this.f = ahiyVar;
        this.i = akazVar;
        this.j = aneoVar;
        this.k = aneoVar2;
        this.b = akauVar;
        this.d = map;
        this.e = map2;
        this.o = agrkVar;
    }

    public static /* synthetic */ void b(ListenableFuture listenableFuture, String str, Object[] objArr) {
        try {
            albo.bQ(listenableFuture);
        } catch (CancellationException unused) {
        } catch (ExecutionException e) {
            ((alvg) ((alvg) ((alvg) a.h()).g(e.getCause())).h("com/google/apps/tiktok/concurrent/AndroidFutures", "logOnFailure", 407, "AndroidFutures.java")).Q(str, objArr);
        }
    }

    public static void c(ListenableFuture listenableFuture, String str, Object... objArr) {
        listenableFuture.c(akto.j(new adub(listenableFuture, str, objArr, 9)), andi.a);
    }

    public final String a() {
        agrk agrkVar = this.o;
        String a2 = aiep.a(this.c);
        if (agrkVar.i()) {
            return "main_process_service_key";
        }
        return a2.substring(a2.lastIndexOf(":") + 1);
    }

    public final void d(ListenableFuture listenableFuture, String str) {
        long j;
        Intent intent = (Intent) this.l.get();
        if (listenableFuture.isDone()) {
            return;
        }
        akau akauVar = this.b;
        akauVar.e.put(listenableFuture, str);
        while (true) {
            long j2 = akauVar.c.get();
            int a2 = akau.a(j2);
            if (a2 == 0) {
                int b = akau.b(j2) + 1;
                j = b | 4294967296L;
                if (akauVar.c.compareAndSet(j2, j)) {
                    synchronized (akauVar.d) {
                        akauVar.f.put(b, SettableFuture.create());
                    }
                    if (akauVar.i.startService(intent.cloneFilter().putExtra("EXTRA_FUTURE_INDEX", b).putExtra("EXTRA_PROCESS_UUID", akauVar.h.getMostSignificantBits()).putExtra("EXTRA_PROCESS_UUID2", akauVar.h.getLeastSignificantBits()).putExtra("EXTRA_PROCESS_PID", Process.myPid())) == null) {
                        ((alvg) ((alvg) akau.a.g()).h("com/google/apps/tiktok/concurrent/AndroidFuturesServiceCounter", "increment", 135, "AndroidFuturesServiceCounter.java")).q("startService() returned null");
                    }
                }
            } else {
                j = akau.c(a2 + 1, j2);
                if (akauVar.c.compareAndSet(j2, j)) {
                    break;
                }
            }
        }
        listenableFuture.c(new wob(this, listenableFuture, akau.b(j), 14, (byte[]) null), andi.a);
    }

    public final void e(ListenableFuture listenableFuture, String str) {
        if (!listenableFuture.isDone()) {
            try {
                PowerManager.WakeLock newWakeLock = this.g.newWakeLock(1, str);
                newWakeLock.acquire();
                albo.bR(aktu.a(albo.bJ(listenableFuture), 45L, TimeUnit.SECONDS, this.j), akto.h(new xch(str, 5)), andi.a);
                ListenableFuture bP = albo.bP(albo.bJ(listenableFuture), 3600L, TimeUnit.SECONDS, this.k);
                newWakeLock.getClass();
                bP.c(new ajir(newWakeLock, 16, null), andi.a);
            } catch (SecurityException e) {
                if (!this.n) {
                    try {
                        PackageInfo packageInfo = this.c.getPackageManager().getPackageInfo(this.c.getPackageName(), 4096);
                        if (packageInfo.requestedPermissions != null) {
                            for (String str2 : packageInfo.requestedPermissions) {
                                if ("android.permission.WAKE_LOCK".equals(str2)) {
                                    this.n = true;
                                    ((alvg) ((alvg) ((alvg) a.h()).g(e)).h("com/google/apps/tiktok/concurrent/AndroidFutures", "checkPermissionRequested", (char) 166, "AndroidFutures.java")).q("Failed to acquire wakelock");
                                    return;
                                }
                            }
                        }
                    } catch (PackageManager.NameNotFoundException e2) {
                        e.addSuppressed(e2);
                    }
                    throw e;
                }
            }
        }
    }

    public final void f(ListenableFuture listenableFuture, long j, TimeUnit timeUnit) {
        listenableFuture.c(akto.j(new ajnt(this.j.schedule(akto.j(new maa(listenableFuture, j, timeUnit, 11)), j, timeUnit), listenableFuture, 8)), this.h);
    }

    public final void g(ListenableFuture listenableFuture) {
        e(listenableFuture, aktp.c());
    }

    public final void h(ListenableFuture listenableFuture, Notification notification) {
        this.f.w((Class) this.m.get()).f(listenableFuture, notification, this.i.a());
    }
}
