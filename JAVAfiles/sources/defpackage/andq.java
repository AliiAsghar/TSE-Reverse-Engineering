package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class andq extends AtomicReference implements Executor, Runnable {
    andr a;
    Executor b;
    Runnable c;
    Thread d;

    public andq(Executor executor, andr andrVar) {
        super(andp.NOT_RUN);
        this.b = executor;
        this.a = andrVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        boolean z;
        if (get() == andp.CANCELLED) {
            this.b = null;
            this.a = null;
            return;
        }
        this.d = Thread.currentThread();
        try {
            andr andrVar = this.a;
            andrVar.getClass();
            arbj arbjVar = andrVar.a;
            if (arbjVar.a == this.d) {
                this.a = null;
                if (arbjVar.c == null) {
                    z = true;
                } else {
                    z = false;
                }
                albo.T(z);
                arbjVar.c = runnable;
                Executor executor = this.b;
                executor.getClass();
                arbjVar.b = executor;
                this.b = null;
            } else {
                Executor executor2 = this.b;
                executor2.getClass();
                this.b = null;
                this.c = runnable;
                executor2.execute(this);
            }
        } finally {
            this.d = null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        ?? r3;
        Thread currentThread = Thread.currentThread();
        if (currentThread != this.d) {
            Runnable runnable = this.c;
            runnable.getClass();
            this.c = null;
            runnable.run();
            return;
        }
        arbj arbjVar = new arbj();
        arbjVar.a = currentThread;
        andr andrVar = this.a;
        andrVar.getClass();
        andrVar.a = arbjVar;
        this.a = null;
        try {
            Runnable runnable2 = this.c;
            runnable2.getClass();
            this.c = null;
            runnable2.run();
            while (true) {
                ?? r0 = arbjVar.c;
                if (r0 == 0 || (r3 = arbjVar.b) == 0) {
                    break;
                }
                arbjVar.c = null;
                arbjVar.b = null;
                r3.execute(r0);
            }
        } finally {
            arbjVar.a = null;
        }
    }
}
