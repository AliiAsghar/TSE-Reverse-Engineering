package defpackage;

import android.graphics.drawable.Drawable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hxa implements Future, hxb, hxq {
    private final int a;
    private final int b;
    private Object c;
    private hwx d;
    private boolean e;
    private boolean f;
    private boolean g;
    private hpp h;

    public hxa(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    private final synchronized Object i(Long l) {
        if (!isDone()) {
            hyv.h();
        }
        if (!this.e) {
            if (!this.g) {
                if (!this.f) {
                    if (l == null) {
                        wait(0L);
                    } else if (l.longValue() > 0) {
                        long currentTimeMillis = System.currentTimeMillis();
                        long longValue = l.longValue() + currentTimeMillis;
                        while (!isDone() && currentTimeMillis < longValue) {
                            wait(longValue - currentTimeMillis);
                            currentTimeMillis = System.currentTimeMillis();
                        }
                    }
                    if (!Thread.interrupted()) {
                        if (!this.g) {
                            if (!this.e) {
                                if (!this.f) {
                                    throw new TimeoutException();
                                }
                            } else {
                                throw new CancellationException();
                            }
                        } else {
                            throw new ExecutionException(this.h);
                        }
                    } else {
                        throw new InterruptedException();
                    }
                }
            } else {
                throw new ExecutionException(this.h);
            }
        } else {
            throw new CancellationException();
        }
        return this.c;
    }

    @Override // defpackage.hxq
    public final synchronized void a(Drawable drawable) {
    }

    @Override // defpackage.hxq
    public final synchronized void b(Object obj, hxz hxzVar) {
    }

    @Override // defpackage.hxq
    public final synchronized hwx c() {
        return this.d;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        synchronized (this) {
            if (isDone()) {
                return false;
            }
            this.e = true;
            notifyAll();
            hwx hwxVar = null;
            if (z) {
                hwx hwxVar2 = this.d;
                this.d = null;
                hwxVar = hwxVar2;
            }
            if (hwxVar != null) {
                hwxVar.c();
            }
            return true;
        }
    }

    @Override // defpackage.hxq
    public final void d(hxp hxpVar) {
        hxpVar.g(this.a, this.b);
    }

    @Override // defpackage.hxb
    public final synchronized boolean eV(hpp hppVar, Object obj) {
        this.g = true;
        this.h = hppVar;
        notifyAll();
        return false;
    }

    @Override // defpackage.hxb
    public final synchronized boolean eW(Object obj, Object obj2) {
        this.f = true;
        this.c = obj;
        notifyAll();
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        try {
            return i(null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.hxq
    public final synchronized void h(hwx hwxVar) {
        this.d = hwxVar;
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isCancelled() {
        return this.e;
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isDone() {
        if (!this.e && !this.f) {
            if (!this.g) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        hwx hwxVar;
        String str;
        String valueOf = String.valueOf(super.toString());
        synchronized (this) {
            hwxVar = null;
            if (this.e) {
                str = "CANCELLED";
            } else if (this.g) {
                str = "FAILURE";
            } else if (this.f) {
                str = "SUCCESS";
            } else {
                str = "PENDING";
                hwxVar = this.d;
            }
        }
        String concat = valueOf.concat("[status=");
        if (hwxVar != null) {
            return concat + str + ", request=[" + hwxVar.toString() + "]]";
        }
        return concat + str + "]";
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return i(Long.valueOf(timeUnit.toMillis(j)));
    }

    @Override // defpackage.hwb
    public final void k() {
    }

    @Override // defpackage.hwb
    public final void l() {
    }

    @Override // defpackage.hwb
    public final void m() {
    }

    @Override // defpackage.hxq
    public final void e(Drawable drawable) {
    }

    @Override // defpackage.hxq
    public final void f(Drawable drawable) {
    }

    @Override // defpackage.hxq
    public final void g(hxp hxpVar) {
    }
}
