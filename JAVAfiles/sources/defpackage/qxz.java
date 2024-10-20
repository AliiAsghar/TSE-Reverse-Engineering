package defpackage;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qxz implements Executor {
    public final int a;
    public final Deque c;
    public final alhr e;
    private final Executor f;
    public final Object b = new Object();
    public int d = 0;

    public qxz(ocu ocuVar, Executor executor, int i) {
        this.e = albo.D(new qwq(ocuVar, 8));
        this.f = executor;
        this.a = i;
        if (ocuVar.a()) {
            this.c = new ConcurrentLinkedDeque();
        } else {
            this.c = new ArrayDeque();
        }
    }

    public final void a() {
        albo.T(!Thread.holdsLock(this.b));
        qiu.h(aktp.ah(new nau(this, 12), this.f));
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        boolean z;
        int i;
        int i2;
        if (((Boolean) this.e.get()).booleanValue()) {
            this.c.addLast(runnable);
        }
        synchronized (this.b) {
            boolean z2 = true;
            if (this.d >= 0) {
                z = true;
            } else {
                z = false;
            }
            albo.T(z);
            if (this.d > this.a) {
                z2 = false;
            }
            albo.T(z2);
            if (!((Boolean) this.e.get()).booleanValue()) {
                this.c.addLast(runnable);
            }
            i = this.d;
            i2 = this.a;
        }
        if (i < i2) {
            a();
        }
    }
}
