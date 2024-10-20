package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asgc {
    public static final String a;
    public static final long b;
    public static final int c;
    public static final int d;
    public static final long e;

    static {
        long w;
        long w2;
        String a2 = asfo.a("kotlinx.coroutines.scheduler.default.name");
        if (a2 == null) {
            a2 = "DefaultDispatcher";
        }
        a = a2;
        w = arro.w("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        b = w;
        c = arro.y("kotlinx.coroutines.scheduler.core.pool.size", arrn.r(asfo.a, 2), 1, 0, 8);
        d = arro.y("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        w2 = arro.w("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE);
        e = timeUnit.toNanos(w2);
    }
}
