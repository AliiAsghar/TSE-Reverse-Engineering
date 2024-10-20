package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mzk implements AutoCloseable, mjc {
    private static final alvi d = alvi.m("com/google/android/apps/messaging/shared/api/messaging/message/internal/ChangeHandler");
    public final ascv c;
    private final ascd f;
    private final yga g;
    private final AtomicBoolean e = new AtomicBoolean(false);
    public final Object a = new Object();
    public final List b = new ArrayList();

    public mzk(mjd mjdVar) {
        ascd a = ascy.a(0);
        this.f = a;
        this.c = new ascf(a);
        this.g = mjdVar.c(this);
    }

    @Override // defpackage.mjc
    public final void a() {
        Object c;
        if (this.e.get()) {
            alvw g = d.g();
            g.X(alwp.a, "BugleMapi");
            ((alvg) g.h("com/google/android/apps/messaging/shared/api/messaging/message/internal/ChangeHandler", "invalidate", 341, "OptimisticMessagePager.kt")).q("skipping invalidate since the handler is closed.");
        } else {
            ascd ascdVar = this.f;
            do {
                c = ascdVar.c();
            } while (!ascdVar.g(c, Integer.valueOf(((Number) c).intValue() + 1)));
        }
    }

    @Override // defpackage.mjc
    public final void b(miq miqVar, mjb mjbVar) {
        a();
    }

    public final void c(boolean z) {
        List ax;
        if (this.e.get()) {
            alvw g = d.g();
            g.X(alwp.a, "BugleMapi");
            ((alvg) g.h("com/google/android/apps/messaging/shared/api/messaging/message/internal/ChangeHandler", "propagateChange", 359, "OptimisticMessagePager.kt")).q("skipping propagateChange since the handler is closed.");
        } else if (z && ((Number) this.f.c()).intValue() == 0) {
            alvw g2 = d.g();
            g2.X(alwp.a, "BugleMapi");
            ((alvg) g2.h("com/google/android/apps/messaging/shared/api/messaging/message/internal/ChangeHandler", "propagateChange", 364, "OptimisticMessagePager.kt")).q("skipping propagateChange since the underlying data didn't change.");
        } else {
            synchronized (this.a) {
                ax = aqjn.ax(this.b);
            }
            Iterator it = ax.iterator();
            while (it.hasNext()) {
                ((mjc) it.next()).a();
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.e.set(true);
        yyb.aJ(this.g);
    }
}
