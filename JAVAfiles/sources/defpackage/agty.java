package defpackage;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agty extends ThreadPoolExecutor implements aguc {
    public static final alvi a = alvi.m("com/google/android/libraries/inputmethod/concurrent/ThreadPoolExecutorWrapper");
    private static final AtomicInteger e = new AtomicInteger(0);
    public final aegu b;
    public final agtp c;
    final ahiy d;

    public agty(aegu aeguVar, agtp agtpVar, int i, int i2, TimeUnit timeUnit, BlockingQueue blockingQueue, ThreadFactory threadFactory) {
        super(i, i2, 2L, timeUnit, (BlockingQueue<Runnable>) blockingQueue, threadFactory);
        this.b = aeguVar;
        this.c = agtpVar;
        this.d = new ahiy();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        super.execute(new agtx(this, runnable, e.getAndIncrement()));
    }
}
