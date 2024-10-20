package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fbb {
    public final fba a;
    public int b;
    public Object c;
    public final Looper d;
    public final long e = -9223372036854775807L;
    private final faz f;
    private boolean g;
    private boolean h;
    private boolean i;

    public fbb(faz fazVar, fba fbaVar, Looper looper) {
        this.f = fazVar;
        this.a = fbaVar;
        this.d = looper;
    }

    public final synchronized void a(boolean z) {
        this.h = z | this.h;
        this.i = true;
        notifyAll();
    }

    public final synchronized void b(long j) {
        boolean z;
        dzg.d(this.g);
        if (this.d.getThread() != Thread.currentThread()) {
            z = true;
        } else {
            z = false;
        }
        dzg.d(z);
        long elapsedRealtime = SystemClock.elapsedRealtime() + j;
        while (!this.i) {
            if (j > 0) {
                wait(j);
                j = elapsedRealtime - SystemClock.elapsedRealtime();
            } else {
                throw new TimeoutException("Message delivery timed out.");
            }
        }
    }

    public final synchronized void c() {
    }

    public final void d() {
        dzg.d(!this.g);
        d.s(true);
        this.g = true;
        this.f.d(this);
    }

    public final void e(Object obj) {
        dzg.d(!this.g);
        this.c = obj;
    }

    public final void f(int i) {
        dzg.d(!this.g);
        this.b = i;
    }
}
