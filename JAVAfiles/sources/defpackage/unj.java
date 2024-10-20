package defpackage;

import j$.util.Map;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class unj {
    public static final xze a = xze.g("BugleWorkQueue", "ExecutionStateManager");
    public final agnq b;
    private final ReentrantLock d = new ReentrantLock();
    public final Map c = new HashMap();

    public unj(agnq agnqVar) {
        this.b = agnqVar;
    }

    public final uni a(upr uprVar) {
        return (uni) Map.EL.computeIfAbsent(this.c, Long.valueOf(uprVar.k()), new uje(uprVar, 15));
    }

    public final Object b(alhr alhrVar) {
        this.d.lock();
        try {
            return alhrVar.get();
        } finally {
            this.d.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(Runnable runnable) {
        this.d.lock();
        try {
            runnable.run();
        } finally {
            this.d.unlock();
        }
    }

    public final void d() {
        boolean z = true;
        if (!this.b.j() && this.d.isHeldByCurrentThread()) {
            z = false;
        }
        albo.U(z, "wrong locking order");
    }

    public final void e(long j) {
        java.util.Map map = this.c;
        Long valueOf = Long.valueOf(j);
        if (map.containsKey(valueOf)) {
            this.c.remove(valueOf);
            return;
        }
        xyo b = a.b();
        b.H("trying to remove non-existent rowId");
        b.y("rowId", j);
        b.q();
        throw new unn();
    }

    public final void f(upr uprVar, upm upmVar) {
        c(new rvz((Object) this, (Object) uprVar, (Object) upmVar, 17, (short[]) null));
    }
}
