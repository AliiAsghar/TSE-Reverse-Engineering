package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ardg implements Executor {
    private final arep a;
    private Executor b;

    public ardg(arep arepVar) {
        this.a = arepVar;
    }

    final synchronized Executor a() {
        if (this.b == null) {
            Executor executor = (Executor) this.a.a();
            executor.getClass();
            this.b = executor;
        }
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b() {
        Executor executor = this.b;
        if (executor != null) {
            this.a.b(executor);
            this.b = null;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        a().execute(runnable);
    }
}
