package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class aqzh implements aqzk, areg {
    private boolean a;
    private final int b;
    private boolean c;
    private boolean d;
    private Runnable e;
    private boolean f;
    public arax j;
    public final Object k = new Object();
    public final arhu l;
    public final arej m;
    public int n;
    public boolean o;
    public final arhn p;
    public aral q;
    public aqsp r;
    public volatile boolean s;
    public boolean t;

    /* JADX INFO: Access modifiers changed from: protected */
    public aqzh(int i, arhn arhnVar, arhu arhuVar) {
        this.l = arhuVar;
        arej arejVar = new arej(this, aqry.a, i, arhnVar, arhuVar);
        this.m = arejVar;
        this.j = arejVar;
        this.b = 32768;
        this.r = aqsp.b;
        this.d = false;
        this.p = arhnVar;
    }

    private final void c() {
        boolean i;
        synchronized (this.k) {
            i = i();
        }
        if (i) {
            this.q.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d() {
        boolean z;
        if (this.q != null) {
            z = true;
        } else {
            z = false;
        }
        albo.T(z);
        synchronized (this.k) {
            albo.U(!this.a, "Already allocated");
            this.a = true;
        }
        c();
    }

    @Override // defpackage.areg
    public final void g(arhp arhpVar) {
        this.q.d(arhpVar);
    }

    public final void h(int i) {
        boolean z;
        synchronized (this.k) {
            albo.U(this.a, "onStreamAllocated was not called, but it seems the stream is active");
            int i2 = this.n;
            int i3 = this.b;
            int i4 = i2 - i;
            this.n = i4;
            z = false;
            if (i2 >= i3 && i4 < i3) {
                z = true;
            }
        }
        if (z) {
            c();
        }
    }

    public final boolean i() {
        boolean z;
        synchronized (this.k) {
            z = false;
            if (this.a && this.n < this.b && !this.o) {
                z = true;
            }
        }
        return z;
    }

    public final void j(Status status, arak arakVar, aqut aqutVar) {
        if (!this.c) {
            this.c = true;
            this.p.h();
            arhu arhuVar = this.l;
            if (status.f()) {
                arhuVar.c++;
            } else {
                arhuVar.d++;
            }
            this.q.a(status, arakVar, aqutVar);
        }
    }

    @Override // defpackage.areg
    public void k(boolean z) {
        albo.U(this.t, "status should have been reported on deframer closed");
        this.d = true;
        if (this.f && z) {
            l(Status.m.withDescription("Encountered end-of-stream mid-frame"), true, new aqut());
        }
        Runnable runnable = this.e;
        if (runnable != null) {
            runnable.run();
            this.e = null;
        }
    }

    public final void l(Status status, boolean z, aqut aqutVar) {
        m(status, arak.PROCESSED, z, aqutVar);
    }

    public final void m(Status status, arak arakVar, boolean z, aqut aqutVar) {
        status.getClass();
        aqutVar.getClass();
        if (this.t) {
            if (z) {
                z = true;
            } else {
                return;
            }
        }
        this.t = true;
        this.f = status.f();
        synchronized (this.k) {
            this.o = true;
        }
        if (this.d) {
            this.e = null;
            j(status, arakVar, aqutVar);
            return;
        }
        this.e = new uju(this, status, arakVar, aqutVar, 12);
        if (z) {
            this.j.close();
            return;
        }
        arej arejVar = (arej) this.j;
        if (arejVar.b()) {
            return;
        }
        if (arejVar.c()) {
            arejVar.close();
        } else {
            arejVar.f = true;
        }
    }
}
