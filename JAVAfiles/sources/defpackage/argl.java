package defpackage;

import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class argl implements Executor, Runnable {
    private static final Logger b = Logger.getLogger(argl.class.getName());
    private static final argi c;
    private final Executor d;
    private final Queue e = new ConcurrentLinkedQueue();
    public volatile int a = 0;

    static {
        argi argkVar;
        try {
            argkVar = new argj(AtomicIntegerFieldUpdater.newUpdater(argl.class, "a"));
        } catch (Throwable th) {
            b.logp(Level.SEVERE, "io.grpc.internal.SerializingExecutor", "getAtomicHelper", "FieldUpdaterAtomicHelper failed", th);
            argkVar = new argk();
        }
        c = argkVar;
    }

    public argl(Executor executor) {
        executor.getClass();
        this.d = executor;
    }

    private final void a(Runnable runnable) {
        if (c.a(this)) {
            try {
                this.d.execute(this);
            } catch (Throwable th) {
                if (runnable != null) {
                    this.e.remove(runnable);
                }
                c.b(this);
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        this.e.add(runnable);
        a(runnable);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable;
        try {
            Executor executor = this.d;
            while (executor == this.d && (runnable = (Runnable) this.e.poll()) != null) {
                try {
                    runnable.run();
                } catch (RuntimeException e) {
                    b.logp(Level.SEVERE, "io.grpc.internal.SerializingExecutor", "run", hht.c(runnable, "Exception while executing runnable "), (Throwable) e);
                }
            }
            c.b(this);
            if (!this.e.isEmpty()) {
                a(null);
            }
        } catch (Throwable th) {
            c.b(this);
            throw th;
        }
    }
}
