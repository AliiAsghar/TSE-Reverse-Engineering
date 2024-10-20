package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Looper;
import com.google.android.setupcompat.ISetupCompatService;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajun {
    private static volatile ajun d;
    private final Context e;
    public static final agxw c = new agxw("SetupCompatServiceProvider");
    static final Intent a = new Intent().setPackage("com.google.android.setupwizard").setAction("com.google.android.setupcompat.SetupCompatService.BIND");
    final ServiceConnection b = new ajum(this);
    private volatile atal g = new atal(1);
    private final AtomicReference f = new AtomicReference();

    public ajun(Context context) {
        this.e = context.getApplicationContext();
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [com.google.android.setupcompat.ISetupCompatService, java.lang.Object] */
    public static ISetupCompatService a(Context context, long j, TimeUnit timeUnit) {
        d.aB(context, "Context object cannot be null.");
        ajun ajunVar = d;
        if (ajunVar == null) {
            synchronized (ajun.class) {
                ajunVar = d;
                if (ajunVar == null) {
                    ajunVar = new ajun(context.getApplicationContext());
                    d = ajunVar;
                    d.d();
                }
            }
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            atal e = ajunVar.e();
            int i = e.a - 1;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i != 5) {
                                    ajunVar.d();
                                    return ajunVar.c(j, timeUnit);
                                }
                            }
                        } else {
                            return e.b;
                        }
                    }
                    return ajunVar.c(j, timeUnit);
                }
                return null;
            }
            c.u("NOT_STARTED state only possible before instance is created.");
            return null;
        }
        throw new IllegalStateException("getService blocks and should not be called from the main thread.");
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [com.google.android.setupcompat.ISetupCompatService, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [com.google.android.setupcompat.ISetupCompatService, java.lang.Object] */
    private final ISetupCompatService c(long j, TimeUnit timeUnit) {
        CountDownLatch countDownLatch;
        atal e = e();
        if (e.a == 4) {
            return e.b;
        }
        do {
            countDownLatch = (CountDownLatch) this.f.get();
            if (countDownLatch != null) {
                break;
            }
            countDownLatch = new CountDownLatch(1);
        } while (!a.bE(this.f, countDownLatch));
        agxw agxwVar = c;
        agxwVar.r("Waiting for service to get connected");
        if (countDownLatch.await(j, timeUnit)) {
            atal e2 = e();
            agxwVar.r(String.format("Finished waiting for service to get connected. Current state = %s", ajgk.q(e2.a)));
            return e2.b;
        }
        d();
        throw new TimeoutException(String.format("Failed to acquire connection after [%s %s]", Long.valueOf(j), timeUnit));
    }

    private final synchronized void d() {
        int i = e().a;
        if (i == 4) {
            c.r("Refusing to rebind since current state is already connected");
            return;
        }
        if (i != 1) {
            c.r("Unbinding existing service connection.");
            this.e.unbindService(this.b);
        }
        try {
            if (this.e.bindService(a, this.b, 1)) {
                if (this.g.a != 4) {
                    b(new atal(3));
                    c.r("Context#bindService went through, now waiting for service connection");
                    return;
                }
                return;
            }
        } catch (SecurityException e) {
            c.s("Unable to bind to compat service. ".concat(e.toString()));
        }
        b(new atal(2));
        c.s("Context#bindService did not succeed.");
    }

    private final synchronized atal e() {
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(atal atalVar) {
        c.r(String.format("State changed: %s -> %s", ajgk.q(this.g.a), ajgk.q(atalVar.a)));
        this.g = atalVar;
        CountDownLatch countDownLatch = (CountDownLatch) this.f.getAndSet(null);
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }
}
