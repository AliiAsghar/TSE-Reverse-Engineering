package defpackage;

import java.util.concurrent.Executor;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class andm {
    private static final anek c = new anek(andm.class);
    public andl a;
    public boolean b;

    public static void a(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            c.a().logp(Level.SEVERE, "com.google.common.util.concurrent.ExecutionList", "executeListener", a.bY(executor, runnable, "RuntimeException while executing runnable ", " with executor "), (Throwable) e);
        }
    }
}
