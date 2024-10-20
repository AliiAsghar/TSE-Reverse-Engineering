package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arcf {
    private static final Logger f = Logger.getLogger(arcf.class.getName());
    public final long a;
    public final alhp b;
    public Map c = new LinkedHashMap();
    public boolean d;
    public Throwable e;

    public arcf(long j, alhp alhpVar) {
        this.a = j;
        this.b = alhpVar;
    }

    public static void a(Executor executor, Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (Throwable th) {
            f.logp(Level.SEVERE, "io.grpc.internal.Http2Ping", "doExecute", "Failed to execute PingCallback", th);
        }
    }

    public static void b(asqc asqcVar, Executor executor) {
        a(executor, new arbg(asqcVar, 4));
    }
}
