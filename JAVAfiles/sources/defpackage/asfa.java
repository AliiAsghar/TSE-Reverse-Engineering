package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asfa extends arwb implements arwm {
    public final arwb a;
    private final int c;
    private final /* synthetic */ arwm b = arwk.a;
    private final arvc d = new arvc(0, arvf.a);
    private final asuo f = new asuo(null, null, null, null);
    private final Object e = new Object();

    public asfa(arwb arwbVar, int i) {
        this.a = arwbVar;
        this.c = i;
    }

    private final boolean i() {
        synchronized (this.e) {
            if (this.d.b >= this.c) {
                return false;
            }
            this.d.b();
            return true;
        }
    }

    @Override // defpackage.arwb
    public final void a(arpi arpiVar, Runnable runnable) {
        Runnable g;
        this.f.p(runnable);
        if (this.d.b < this.c && i() && (g = g()) != null) {
            this.a.a(this, new asez(this, g));
        }
    }

    @Override // defpackage.arwm
    public final arwu c(long j, Runnable runnable, arpi arpiVar) {
        return this.b.c(j, runnable, arpiVar);
    }

    @Override // defpackage.arwm
    public final void d(long j, arvo arvoVar) {
        this.b.d(j, arvoVar);
    }

    public final Runnable g() {
        while (true) {
            Runnable runnable = (Runnable) this.f.n();
            if (runnable == null) {
                synchronized (this.e) {
                    this.d.a();
                    if (this.f.m() == 0) {
                        return null;
                    }
                    this.d.b();
                }
            } else {
                return runnable;
            }
        }
    }

    @Override // defpackage.arwb
    public final void h(arpi arpiVar, Runnable runnable) {
        Runnable g;
        this.f.p(runnable);
        if (this.d.b < this.c && i() && (g = g()) != null) {
            this.a.h(this, new asez(this, g));
        }
    }

    @Override // defpackage.arwb
    public final String toString() {
        return this.a + ".limitedParallelism(" + this.c + ")";
    }
}
