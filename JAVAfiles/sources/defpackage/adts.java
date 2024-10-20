package defpackage;

import android.content.Context;
import android.os.Handler;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adts {
    public Context a;
    public volatile adtk b;
    public int c;
    private volatile Handler d;
    private final adtj e;
    private final AtomicBoolean f = new AtomicBoolean(true);
    private final Runnable g = new adhp(this, 16);

    public adts(adtj adtjVar) {
        this.e = adtjVar;
    }

    public final synchronized void a() {
        aozy createBuilder = aphq.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        aphq aphqVar = (aphq) createBuilder.b;
        aphqVar.b |= 2;
        aphqVar.d = true;
        adtj adtjVar = this.e;
        if (adtjVar != null) {
            adtjVar.b((aphq) createBuilder.s());
        }
    }

    public final synchronized void b(Context context, adtk adtkVar, Handler handler) {
        this.a = context;
        this.b = adtkVar;
        this.d = handler;
        this.c = 0;
    }

    public final synchronized void c() {
        this.a = null;
        this.d = null;
        this.b = null;
        this.c = 0;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, acyz] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, acyz] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, acyz] */
    public final boolean d(int i) {
        if (this.f.compareAndSet(true, false)) {
            advr.k("do not delay first event", new Object[0]);
            return false;
        }
        Long l = (Long) aczy.a().a.e.a();
        long longValue = l.longValue();
        Long l2 = (Long) aczy.a().a.f.a();
        long longValue2 = l2.longValue();
        Long l3 = (Long) aczy.a().a.c.a();
        long longValue3 = l3.longValue();
        if (this.a == null) {
            return false;
        }
        if (i > 1) {
            longValue2 = longValue3;
        }
        if (longValue2 <= 0) {
            advr.k("SIM delay is not enabled", new Object[0]);
            return false;
        }
        synchronized (this) {
            Integer valueOf = Integer.valueOf(this.c);
            Long valueOf2 = Long.valueOf(longValue2);
            advr.k("SIM state event delay enabled: attempts %d, maxAttempts %d, delaySeconds %d MSIM delayseconds %d, effective delay seconds %d", valueOf, l, l2, l3, valueOf2);
            Handler handler = this.d;
            if (handler == null) {
                return false;
            }
            if (this.c < longValue) {
                handler.removeCallbacks(this.g);
                this.c++;
                if (handler.postDelayed(this.g, TimeUnit.SECONDS.toMillis(longValue2))) {
                    advr.k("posted simEventProcessTask to handler with delay %d", valueOf2);
                    aozy createBuilder = aphq.a.createBuilder();
                    int i2 = this.c;
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    aphq aphqVar = (aphq) createBuilder.b;
                    aphqVar.b |= 1;
                    aphqVar.c = i2;
                    adtj adtjVar = this.e;
                    if (adtjVar != null) {
                        adtjVar.b((aphq) createBuilder.s());
                    }
                    return true;
                }
                advr.g("SIM state event delay failed", new Object[0]);
                return false;
            }
            advr.k("reached max delay attempts, do not reschedule ", new Object[0]);
            return true;
        }
    }
}
