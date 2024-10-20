package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class amdu {
    static final ScheduledExecutorService a;
    private static final ThreadFactory b;

    static {
        arbj arbjVar = new arbj((char[]) null, (byte[]) null);
        arbjVar.j("RetryingFuture-Timer-%d");
        arbjVar.i();
        ThreadFactory t = arbj.t(arbjVar);
        b = t;
        a = Executors.newSingleThreadScheduledExecutor(t);
    }
}
