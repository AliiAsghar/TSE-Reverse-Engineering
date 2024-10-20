package defpackage;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arwj extends arxc implements Runnable {
    private static volatile Thread _thread;
    public static final arwj a;
    private static volatile int debugStatus;
    private static final long e;

    static {
        Long l;
        arwj arwjVar = new arwj();
        a = arwjVar;
        arwjVar.o(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        e = timeUnit.toNanos(l.longValue());
    }

    private arwj() {
    }

    private final synchronized void A() {
        if (!C()) {
            return;
        }
        debugStatus = 3;
        ((arxc) this).c.c(null);
        this.d.c(null);
        notifyAll();
    }

    private final synchronized boolean B() {
        if (C()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    private static final boolean C() {
        int i = debugStatus;
        if (i != 2 && i != 3) {
            return false;
        }
        return true;
    }

    private static final void D() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    private final synchronized Thread z() {
        Thread thread = _thread;
        if (thread == null) {
            Thread thread2 = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread2;
            thread2.setContextClassLoader(a.getClass().getClassLoader());
            thread2.setDaemon(true);
            thread2.start();
            return thread2;
        }
        return thread;
    }

    @Override // defpackage.arxc, defpackage.arwm
    public final arwu c(long j, Runnable runnable, arpi arpiVar) {
        return v(j, runnable);
    }

    @Override // defpackage.arwx
    protected final Thread g() {
        Thread thread = _thread;
        if (thread == null) {
            return z();
        }
        return thread;
    }

    @Override // defpackage.arxc
    public final void i(Runnable runnable) {
        if (debugStatus == 4) {
            D();
        }
        super.i(runnable);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.arwx
    public final void j(long j, arxa arxaVar) {
        D();
    }

    @Override // defpackage.arxc, defpackage.arwx
    public final void k() {
        debugStatus = 4;
        super.k();
    }

    @Override // java.lang.Runnable
    public final void run() {
        ThreadLocal threadLocal = aryl.a;
        aryl.a.set(this);
        try {
            if (B()) {
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long l = l();
                    if (l == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = e + nanoTime;
                        }
                        long j2 = j - nanoTime;
                        if (j2 <= 0) {
                            break;
                        } else {
                            l = arrn.w(Long.MAX_VALUE, j2);
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (l > 0) {
                        if (C()) {
                            break;
                        } else {
                            LockSupport.parkNanos(this, l);
                        }
                    }
                }
            }
            _thread = null;
            A();
            if (!y()) {
                g();
            }
        } catch (Throwable th) {
            _thread = null;
            A();
            if (!y()) {
                g();
            }
            throw th;
        }
    }

    @Override // defpackage.arwb
    public final String toString() {
        return "DefaultExecutor";
    }
}
