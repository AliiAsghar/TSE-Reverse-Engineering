package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoll implements Executor {
    private volatile Executor a;

    public aoll(Executor executor) {
        this.a = executor;
    }

    public final void a() {
        this.a = andi.a;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.execute(runnable);
    }
}
