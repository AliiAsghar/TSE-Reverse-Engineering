package defpackage;

import android.os.Process;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agkn extends Thread {
    public Runnable a;
    public Runnable b;
    public final agkw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agkn(int i, Runnable runnable) {
        super(runnable);
        runnable.getClass();
        this.c = new agkw(this, 0, false, 0, true, 26);
        a(i);
    }

    public final void a(int i) {
        agkw agkwVar = this.c;
        if (!agkwVar.c) {
            throw new IllegalStateException("Cannot override priority of non-boostable thread");
        }
        while (true) {
            long j = agkwVar.f.get();
            long i2 = agkv.i(j, false, false, false, i, 0, 0L, 119);
            if (agkv.g(j)) {
                if (agkwVar.f.compareAndSet(j, i2)) {
                    return;
                }
            } else if (agkv.d(j) == agkv.d(i2)) {
                if (agkwVar.f.compareAndSet(j, i2)) {
                    return;
                }
            } else if (agkwVar.f.compareAndSet(j, agkv.i(i2, false, true, false, 0, 0, 0L, 125))) {
                agkwVar.a(agkv.d(j));
                return;
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        long j;
        Throwable th;
        agkw agkwVar = this.c;
        agkwVar.b = Process.myTid();
        do {
            j = agkwVar.f.get();
        } while (!agkwVar.f.compareAndSet(j, agkv.i(j, true, true, false, 0, 0, 0L, 124)));
        if (!agkv.g(j)) {
            agkwVar.a(-21);
        }
        Runnable runnable = null;
        try {
            try {
                Runnable runnable2 = this.a;
                if (runnable2 == null) {
                    arro.b("startedCallback");
                    runnable2 = null;
                }
                runnable2.run();
                super.run();
                Runnable runnable3 = this.b;
                if (runnable3 == null) {
                    arro.b("finishedCallback");
                } else {
                    runnable = runnable3;
                }
                runnable.run();
                this.c.c();
            } catch (Throwable th2) {
                Runnable runnable4 = this.b;
                if (runnable4 == null) {
                    arro.b("finishedCallback");
                } else {
                    runnable = runnable4;
                }
                runnable.run();
                th = th2;
                this.c.c();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            this.c.c();
            throw th;
        }
    }
}
