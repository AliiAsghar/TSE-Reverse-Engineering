package defpackage;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajug {
    public static final ajug a = new ajug(new ThreadPoolExecutor(1, 1, 0, TimeUnit.SECONDS, new ArrayBlockingQueue(50), new euk(5, (byte[]) null)));
    public final Executor b;

    private ajug(Executor executor) {
        this.b = executor;
    }
}
