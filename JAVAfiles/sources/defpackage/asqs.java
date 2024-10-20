package defpackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class asqs extends asrs {
    public static final ReentrantLock b;
    public static final Condition c;
    public static final long d;
    public static final long e;
    public static asqs f;
    public int g;
    public asqs h;
    public long i;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        b = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        newCondition.getClass();
        c = newCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        d = millis;
        e = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final long c(long j) {
        return this.i - j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public IOException d(IOException iOException) {
        throw null;
    }

    public final void e() {
        asqs asqsVar;
        long j = this.k;
        boolean g = g();
        if (j == 0) {
            if (g) {
                j = 0;
            } else {
                return;
            }
        }
        ReentrantLock reentrantLock = b;
        reentrantLock.lock();
        try {
            if (this.g == 0) {
                this.g = 1;
                if (f == null) {
                    f = new asqs();
                    new asqp().start();
                }
                long nanoTime = System.nanoTime();
                if (j != 0 && g) {
                    this.i = Math.min(j, h() - nanoTime) + nanoTime;
                } else if (j != 0) {
                    this.i = j + nanoTime;
                } else if (g) {
                    this.i = h();
                } else {
                    throw new AssertionError();
                }
                long c2 = c(nanoTime);
                asqs asqsVar2 = f;
                asqsVar2.getClass();
                while (true) {
                    asqsVar = asqsVar2.h;
                    if (asqsVar == null || c2 < asqsVar.c(nanoTime)) {
                        break;
                    } else {
                        asqsVar2 = asqsVar;
                    }
                }
                this.h = asqsVar;
                asqsVar2.h = this;
                if (asqsVar2 == f) {
                    c.signal();
                }
                return;
            }
            throw new IllegalStateException("Unbalanced enter/exit");
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean f() {
        ReentrantLock reentrantLock = b;
        reentrantLock.lock();
        try {
            int i = this.g;
            boolean z = false;
            this.g = 0;
            if (i != 1) {
                if (i == 2) {
                    z = true;
                }
                return z;
            }
            asqs asqsVar = f;
            while (asqsVar != null) {
                asqs asqsVar2 = asqsVar.h;
                if (asqsVar2 == this) {
                    asqsVar.h = this.h;
                    this.h = null;
                    return false;
                }
                asqsVar = asqsVar2;
            }
            throw new IllegalStateException("node was not found in the queue");
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a() {
    }
}
