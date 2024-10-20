package defpackage;

import android.os.Handler;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rht {
    private static final xze d = xze.g("BugleThrottledAction", "ThrottledActionScheduler");
    protected final rhk a;
    protected final xnv b;
    private ThrottledAction e;
    private Class f;
    private long g = -1;
    private int h = 0;
    public rhx c = null;

    public rht(xnv xnvVar, rhk rhkVar) {
        this.b = xnvVar;
        this.a = rhkVar;
    }

    private final synchronized ThrottledAction e(ThrottledAction throttledAction) {
        ThrottledAction throttledAction2 = this.e;
        if (throttledAction2 != null || this.g != -1) {
            throttledAction = throttledAction2;
        }
        if (throttledAction != null) {
            xze xzeVar = d;
            if (xzeVar.s(3)) {
                xyo d2 = xzeVar.d();
                d2.H(throttledAction.h());
                d2.H("is starting.");
                d2.q();
            }
        }
        c(this.b.a());
        this.e = null;
        this.c = null;
        return throttledAction;
    }

    private final void f(ThrottledAction throttledAction) {
        Class<?> cls = this.f;
        Class<?> cls2 = throttledAction.getClass();
        if (cls == null) {
            this.f = cls2;
            return;
        }
        if (cls != cls2) {
            xyl.o("Expected instance '" + String.valueOf(cls) + "' but got instance '" + String.valueOf(cls2) + "'");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.lang.Runnable] */
    private final synchronized void g(Action action, int i, long j, boolean z) {
        rhx rhxVar = this.c;
        if (rhxVar != null) {
            utz utzVar = ria.b;
            ((Handler) rhxVar.a).removeCallbacks(rhxVar.b);
            this.c = null;
            this.e.getClass();
            j(action, i, j, z);
            return;
        }
        this.a.f(this.e, this.h);
        j(action, i, j, false);
    }

    private static void h(ThrottledAction throttledAction) {
        if (throttledAction != null) {
            xze xzeVar = d;
            if (xzeVar.s(3)) {
                xyo d2 = xzeVar.d();
                d2.H(throttledAction.h());
                d2.H("is done.");
                d2.q();
            }
        }
    }

    private static void i(ThrottledAction throttledAction, int i, long j) {
        String str;
        if (throttledAction != null) {
            str = throttledAction.h();
        } else {
            str = "????";
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    xyo d2 = d.d();
                    d2.H("Reduced delay of");
                    d2.H(str);
                    d2.H("to");
                    d2.G(j);
                    d2.H("ms.");
                    d2.q();
                    return;
                }
                xyo d3 = d.d();
                d3.H(str);
                d3.H("scheduled to run now.");
                d3.q();
                return;
            }
            xyo d4 = d.d();
            d4.H(str);
            d4.H("scheduled in");
            d4.G(j);
            d4.H("ms, so not scheduled again.");
            d4.q();
            return;
        }
        xyo d5 = d.d();
        d5.H(str);
        d5.H("already scheduled in");
        d5.G(j);
        d5.H("ms, not scheduling it again.");
        d5.q();
    }

    private final synchronized void j(Action action, int i, long j, boolean z) {
        if (z) {
            this.c = this.a.i(action, j);
        } else {
            this.a.g(this.e, i, j);
        }
        this.h = i;
    }

    public final akul a(ThrottledAction throttledAction) {
        f(throttledAction);
        ThrottledAction e = e(throttledAction);
        if (e != null) {
            try {
                return e.k();
            } finally {
                h(e);
            }
        }
        h(null);
        return aktp.ag(null);
    }

    public final ListenableFuture b(ThrottledAction throttledAction, int i, wng wngVar) {
        int i2;
        ListenableFuture c;
        f(throttledAction);
        synchronized (this) {
            ThrottledAction throttledAction2 = this.e;
            if (throttledAction2 != null) {
                throttledAction2.j(throttledAction);
                this.a.f(this.e, this.h);
                i2 = 3;
            } else {
                this.e = throttledAction;
                i2 = 2;
            }
            c = this.a.c(this.e, wngVar, i);
            this.h = i;
        }
        i(this.e, i2, 0L);
        return c;
    }

    final synchronized void c(long j) {
        this.g = j;
    }

    public final void d(ThrottledAction throttledAction, int i, long j, long j2, boolean z) {
        long j3;
        int i2;
        f(throttledAction);
        double d2 = j;
        double d3 = j2;
        if (d2 > d3) {
            xyl.o("Expected at most " + d3 + " but got " + d2);
        }
        long a = this.b.a();
        long j4 = j + a;
        long j5 = a + j2;
        synchronized (this) {
            long a2 = this.b.a();
            long g = this.g + throttledAction.g();
            ThrottledAction throttledAction2 = this.e;
            if (throttledAction2 != null) {
                throttledAction2.j(throttledAction);
                if (j5 < g) {
                    j3 = j5 - a2;
                    g(throttledAction, i, j3, z);
                    i2 = 3;
                } else {
                    j3 = g - a2;
                    i2 = 0;
                }
            } else {
                this.e = throttledAction;
                if (g <= j4) {
                    j3 = j4 - a2;
                } else if (j5 <= g) {
                    j3 = j5 - a2;
                } else {
                    j3 = g - a2;
                }
                j(throttledAction, i, j3, z);
                this.h = i;
                if (j3 <= 0) {
                    i2 = 2;
                } else {
                    i2 = 1;
                }
            }
        }
        i(this.e, i2, j3);
    }
}
