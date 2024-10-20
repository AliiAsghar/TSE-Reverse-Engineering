package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class gil {
    private final gid a;
    private final AtomicBoolean b = new AtomicBoolean(false);
    private final arml c = armd.a(new rd(this, 16));

    public gil(gid gidVar) {
        this.a = gidVar;
    }

    private final gkp a() {
        return (gkp) this.c.a();
    }

    protected abstract String c();

    public final gkp d() {
        this.a.j();
        if (this.b.compareAndSet(false, true)) {
            return a();
        }
        return e();
    }

    public final gkp e() {
        gid gidVar = this.a;
        gidVar.j();
        gidVar.k();
        return gidVar.d().b().k(c());
    }

    public final void f(gkp gkpVar) {
        gkpVar.getClass();
        if (gkpVar == a()) {
            this.b.set(false);
        }
    }
}
