package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acie {
    public final Object a;
    public int b;
    public boolean c;
    public final String d;
    public final Map e;
    public AtomicInteger f;
    ubx g;
    private final PowerManager.WakeLock l;
    private Future m;
    private long n;
    private final Set o;
    private int p;
    private WorkSource q;
    private final ScheduledExecutorService r;
    private static final long i = TimeUnit.DAYS.toMillis(366);
    private static volatile ScheduledExecutorService j = null;
    private static final Object k = new Object();
    public static volatile acex h = new acex();

    public acie(Context context) {
        String packageName = context.getPackageName();
        this.a = new Object();
        this.b = 0;
        this.o = new HashSet();
        this.c = true;
        this.e = new HashMap();
        this.f = new AtomicInteger(0);
        d.aC(context, "WakeLock: context must not be null");
        abhg.l("wake:com.google.firebase.iid.WakeLockHolder", "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        WorkSource workSource = null;
        this.g = null;
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            this.d = "*gcore*:wake:com.google.firebase.iid.WakeLockHolder";
        } else {
            this.d = "wake:com.google.firebase.iid.WakeLockHolder";
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        albo.C(powerManager);
        this.l = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
        if (abvm.b(context)) {
            packageName = abvl.a(packageName) ? context.getPackageName() : packageName;
            if (context != null && context.getPackageManager() != null && packageName != null) {
                try {
                    ApplicationInfo d = abvn.b(context).d(packageName, 0);
                    if (d == null) {
                        Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(packageName));
                    } else {
                        int i2 = d.uid;
                        workSource = new WorkSource();
                        abvm.a(workSource, i2, packageName);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    Log.e("WorkSourceUtil", "Could not find package: ".concat(packageName));
                }
            }
            this.q = workSource;
            if (workSource != null) {
                f(this.l, workSource);
            }
        }
        ScheduledExecutorService scheduledExecutorService = j;
        if (scheduledExecutorService == null) {
            synchronized (k) {
                scheduledExecutorService = j;
                if (scheduledExecutorService == null) {
                    abgj abgjVar = accz.a;
                    scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                    j = scheduledExecutorService;
                }
            }
        }
        this.r = scheduledExecutorService;
    }

    private static void f(PowerManager.WakeLock wakeLock, WorkSource workSource) {
        try {
            wakeLock.setWorkSource(workSource);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
            Log.wtf("WakeLock", e.toString());
        }
    }

    public final void a(long j2) {
        this.f.incrementAndGet();
        long j3 = Long.MAX_VALUE;
        long max = Math.max(Math.min(Long.MAX_VALUE, i), 1L);
        if (j2 > 0) {
            max = Math.min(j2, max);
        }
        synchronized (this.a) {
            if (!c()) {
                this.g = ubx.a;
                this.l.acquire();
                SystemClock.elapsedRealtime();
            }
            this.b++;
            this.p++;
            d();
            arjs arjsVar = (arjs) this.e.get(null);
            if (arjsVar == null) {
                arjsVar = new arjs();
                this.e.put(null, arjsVar);
            }
            arjsVar.a++;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (Long.MAX_VALUE - elapsedRealtime > max) {
                j3 = elapsedRealtime + max;
            }
            if (j3 > this.n) {
                this.n = j3;
                Future future = this.m;
                if (future != null) {
                    future.cancel(false);
                }
                this.m = this.r.schedule(new acbq(this, 2), max, TimeUnit.MILLISECONDS);
            }
        }
    }

    public final void b() {
        if (!this.o.isEmpty()) {
            ArrayList arrayList = new ArrayList(this.o);
            this.o.clear();
            if (arrayList.size() <= 0) {
                return;
            }
            throw null;
        }
    }

    public final boolean c() {
        boolean z;
        synchronized (this.a) {
            if (this.b > 0) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public final void d() {
        if (this.c) {
            TextUtils.isEmpty(null);
        }
    }

    public final void e() {
        synchronized (this.a) {
            if (!c()) {
                return;
            }
            if (this.c) {
                int i2 = this.b - 1;
                this.b = i2;
                if (i2 > 0) {
                    return;
                }
            } else {
                this.b = 0;
            }
            b();
            Iterator it = this.e.values().iterator();
            while (it.hasNext()) {
                ((arjs) it.next()).a = 0;
            }
            this.e.clear();
            Future future = this.m;
            if (future != null) {
                future.cancel(false);
                this.m = null;
                this.n = 0L;
            }
            this.p = 0;
            try {
                if (this.l.isHeld()) {
                    try {
                        this.l.release();
                        if (this.g != null) {
                            this.g = null;
                        }
                    } catch (RuntimeException e) {
                        if (e.getClass().equals(RuntimeException.class)) {
                            Log.e("WakeLock", String.format("%s failed to release!", this.d), e);
                            if (this.g != null) {
                                this.g = null;
                            }
                        } else {
                            throw e;
                        }
                    }
                } else {
                    acex.d("%s should be held!", this.d);
                }
            } catch (Throwable th) {
                if (this.g != null) {
                    this.g = null;
                }
                throw th;
            }
        }
    }
}
