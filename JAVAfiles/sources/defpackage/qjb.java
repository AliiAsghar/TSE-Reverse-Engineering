package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class qjb {
    private static final utz a = uuh.i(uuh.b, "executor_callbacks_always_crash", false);

    @Deprecated
    public static void a(Runnable runnable, Executor executor) {
        if (!qjd.a() && !((Boolean) a.e()).booleanValue()) {
            executor.execute(akto.j(runnable));
            return;
        }
        aktp.ah(runnable, executor).k(new ydv(new qcq(12), new RuntimeException(), 1), andi.a);
    }
}
