package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hpn implements hpt {
    public final boolean a;
    private final hpt b;
    private final hpm c;
    private final hne d;
    private int e;
    private boolean f;

    public hpn(hpt hptVar, boolean z, hne hneVar, hpm hpmVar) {
        hwr.i(hptVar);
        this.b = hptVar;
        this.a = z;
        this.d = hneVar;
        hwr.i(hpmVar);
        this.c = hpmVar;
    }

    @Override // defpackage.hpt
    public final int a() {
        return this.b.a();
    }

    @Override // defpackage.hpt
    public final Class b() {
        return this.b.b();
    }

    @Override // defpackage.hpt
    public final Object c() {
        return this.b.c();
    }

    public final synchronized void d() {
        if (!this.f) {
            this.e++;
        } else {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
    }

    @Override // defpackage.hpt
    public final synchronized void e() {
        if (this.e <= 0) {
            if (!this.f) {
                this.f = true;
                this.b.e();
            } else {
                throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
            }
        } else {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
    }

    public final void f() {
        int i;
        synchronized (this) {
            int i2 = this.e;
            if (i2 > 0) {
                i = i2 - 1;
                this.e = i;
            } else {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
        }
        if (i == 0) {
            hpm hpmVar = this.c;
            hne hneVar = this.d;
            hpf hpfVar = (hpf) hpmVar;
            hpfVar.d.d(hneVar);
            if (this.a) {
                hpfVar.b.d(hneVar, this);
            } else {
                hpfVar.f.a(this, false);
            }
        }
    }

    public final synchronized String toString() {
        hpt hptVar;
        hne hneVar;
        hptVar = this.b;
        hneVar = this.d;
        return "EngineResource{isMemoryCacheable=" + this.a + ", listener=" + this.c.toString() + ", key=" + String.valueOf(hneVar) + ", acquired=" + this.e + ", isRecycled=" + this.f + ", resource=" + hptVar.toString() + "}";
    }
}
