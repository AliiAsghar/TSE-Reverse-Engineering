package defpackage;

import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hpj implements hza {
    public final hpm b;
    public final hpk c;
    public hne d;
    public boolean e;
    public hpt f;
    public boolean g;
    hpp h;
    public boolean i;
    hpn j;
    public volatile boolean k;
    int l;
    private final ecf n;
    private final hrc o;
    private final hrc p;
    private final hrc q;
    private boolean s;
    private how t;
    final hpi a = new hpi(new ArrayList(2));
    public final zeq m = new zeq();
    private final AtomicInteger r = new AtomicInteger();

    public hpj(hrc hrcVar, hrc hrcVar2, hrc hrcVar3, hpk hpkVar, hpm hpmVar, ecf ecfVar) {
        this.o = hrcVar;
        this.p = hrcVar2;
        this.q = hrcVar3;
        this.c = hpkVar;
        this.b = hpmVar;
        this.n = ecfVar;
    }

    private final boolean j() {
        if (!this.i && !this.g && !this.k) {
            return false;
        }
        return true;
    }

    public final hrc a() {
        if (this.s) {
            return this.q;
        }
        return this.p;
    }

    public final synchronized void b(hxd hxdVar, Executor executor) {
        this.m.a();
        this.a.a.add(new hph(hxdVar, executor));
        if (this.g) {
            d(1);
            executor.execute(new hpg(this, hxdVar, 2));
        } else if (this.i) {
            d(1);
            executor.execute(new hpg(this, hxdVar, 0));
        } else {
            hwr.f(!this.k, "Cannot add callbacks to a cancelled EngineJob");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        boolean z;
        hpn hpnVar;
        synchronized (this) {
            this.m.a();
            hwr.f(j(), "Not yet complete!");
            int decrementAndGet = this.r.decrementAndGet();
            if (decrementAndGet >= 0) {
                z = true;
            } else {
                z = false;
            }
            hwr.f(z, "Can't decrement below 0");
            if (decrementAndGet == 0) {
                hpnVar = this.j;
                e();
            } else {
                hpnVar = null;
            }
        }
        if (hpnVar != null) {
            hpnVar.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void d(int i) {
        hpn hpnVar;
        hwr.f(j(), "Not yet complete!");
        if (this.r.getAndAdd(i) == 0 && (hpnVar = this.j) != null) {
            hpnVar.d();
        }
    }

    public final synchronized void e() {
        if (this.d != null) {
            this.a.a.clear();
            this.d = null;
            this.j = null;
            this.f = null;
            this.i = false;
            this.k = false;
            this.g = false;
            how howVar = this.t;
            if (howVar.b.d()) {
                howVar.a();
            }
            this.t = null;
            this.h = null;
            this.l = 0;
            this.n.b(this);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @Override // defpackage.hza
    public final zeq f() {
        return this.m;
    }

    public final synchronized void g(hxd hxdVar) {
        this.m.a();
        this.a.a.remove(new hph(hxdVar, hyn.b));
        if (this.a.d()) {
            if (!j()) {
                this.k = true;
                how howVar = this.t;
                howVar.n = true;
                hot hotVar = howVar.m;
                if (hotVar != null) {
                    hotVar.a();
                }
                this.c.b(this, this.d);
            }
            if ((this.g || this.i) && this.r.get() == 0) {
                e();
            }
        }
    }

    public final synchronized void h(how howVar) {
        hrc hrcVar;
        this.t = howVar;
        int c = howVar.c(1);
        if (c != 2 && c != 3) {
            hrcVar = a();
            hrcVar.execute(howVar);
        }
        hrcVar = this.o;
        hrcVar.execute(howVar);
    }

    public final synchronized void i(hne hneVar, boolean z, boolean z2) {
        this.d = hneVar;
        this.e = z;
        this.s = z2;
    }
}
