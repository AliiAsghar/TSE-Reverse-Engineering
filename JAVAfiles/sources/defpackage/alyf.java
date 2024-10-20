package defpackage;

import android.os.Build;
import android.util.Log;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alyf extends alxy {
    static final boolean a;
    static final boolean b;
    static final boolean c;
    public static final AtomicReference d;
    private static final AtomicLong e;
    private static final ConcurrentLinkedQueue f;
    private volatile alww g;

    static {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (Build.FINGERPRINT != null && !"robolectric".equals(Build.FINGERPRINT)) {
            z = false;
        } else {
            z = true;
        }
        a = z;
        if (!"goldfish".equals(Build.HARDWARE) && !"ranchu".equals(Build.HARDWARE)) {
            z2 = false;
        } else {
            z2 = true;
        }
        b = z2;
        if ("eng".equals(Build.TYPE) || "userdebug".equals(Build.TYPE)) {
            z3 = true;
        }
        c = z3;
        d = new AtomicReference();
        e = new AtomicLong();
        f = new ConcurrentLinkedQueue();
    }

    public alyf(String str) {
        super(str);
        if (!a && !b) {
            if (c) {
                alyh alyhVar = alyj.c;
                String str2 = alyhVar.a;
                int i = alyhVar.f;
                this.g = new alyh(2, Level.OFF, alyhVar.c, alyhVar.d, alyhVar.e).a(d());
                return;
            }
            this.g = null;
            return;
        }
        this.g = new alxz().a(d());
    }

    public static void e() {
        while (true) {
            alyf alyfVar = (alyf) alye.a.poll();
            if (alyfVar != null) {
                alyfVar.g = ((alya) d.get()).a(alyfVar.d());
            } else {
                f();
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [alwv, java.lang.Object] */
    private static void f() {
        while (true) {
            ansy ansyVar = (ansy) f.poll();
            if (ansyVar != null) {
                e.getAndDecrement();
                ?? r1 = ansyVar.b;
                Object obj = ansyVar.a;
                if (!r1.S()) {
                    if (((alww) obj).c(r1.m())) {
                    }
                }
                ((alww) obj).b(r1);
            } else {
                return;
            }
        }
    }

    @Override // defpackage.alww
    public final void b(alwv alwvVar) {
        if (this.g != null) {
            this.g.b(alwvVar);
            return;
        }
        if (e.incrementAndGet() > 20) {
            f.poll();
            Log.w("ProxyAndroidLoggerBackend", "Too many Flogger logs received before configuration. Dropping old logs.");
        }
        f.offer(new ansy(this, alwvVar));
        if (this.g != null) {
            f();
        }
    }

    @Override // defpackage.alww
    public final boolean c(Level level) {
        if (this.g != null && !this.g.c(level)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.alxy, defpackage.alww
    public final void g(RuntimeException runtimeException, alwv alwvVar) {
        if (this.g != null) {
            this.g.g(runtimeException, alwvVar);
        } else {
            Log.e("ProxyAndroidLoggerBackend", "Internal logging error before configuration", runtimeException);
        }
    }
}
