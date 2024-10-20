package defpackage;

import java.util.concurrent.locks.LockSupport;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class arwx extends arwb {
    private long a;
    public arnr b;
    private boolean c;

    private static final long hg(boolean z) {
        if (z) {
            return 4294967296L;
        }
        return 1L;
    }

    public static /* synthetic */ void t(arwx arwxVar) {
        arwxVar.m(false);
    }

    public static /* synthetic */ void u(arwx arwxVar) {
        arwxVar.o(false);
    }

    protected abstract Thread g();

    /* JADX INFO: Access modifiers changed from: protected */
    public void j(long j, arxa arxaVar) {
        arwj.a.w(j, arxaVar);
    }

    public void k() {
        throw null;
    }

    public long l() {
        throw null;
    }

    public final void m(boolean z) {
        long hg = this.a - hg(z);
        this.a = hg;
        if (hg <= 0) {
            boolean z2 = arwh.a;
            if (this.c) {
                k();
            }
        }
    }

    public final void n(arwq arwqVar) {
        arnr arnrVar = this.b;
        if (arnrVar == null) {
            arnrVar = new arnr();
            this.b = arnrVar;
        }
        arnrVar.addLast(arwqVar);
    }

    public final void o(boolean z) {
        this.a += hg(z);
        if (!z) {
            this.c = true;
        }
    }

    public final boolean p() {
        if (this.a >= hg(true)) {
            return true;
        }
        return false;
    }

    public final boolean q() {
        arnr arnrVar = this.b;
        if (arnrVar != null) {
            return arnrVar.isEmpty();
        }
        return true;
    }

    public final boolean r() {
        arwq arwqVar;
        arnr arnrVar = this.b;
        if (arnrVar != null && (arwqVar = (arwq) arnrVar.f()) != null) {
            arwqVar.run();
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void s() {
        Thread g = g();
        if (Thread.currentThread() != g) {
            LockSupport.unpark(g);
        }
    }
}
