package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qxv implements Executor {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/datamodel/DepthMeasuredDatabaseWriteExecutor");
    final Executor b;
    public final AtomicInteger c = new AtomicInteger();
    public final qya d;
    private final int e;

    public qxv(Executor executor, Optional optional, qya qyaVar) {
        this.b = executor;
        this.e = ((Integer) optional.orElse(4)).intValue();
        this.d = qyaVar;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Deque] */
    /* JADX WARN: Type inference failed for: r3v0, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.util.concurrent.locks.Lock, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [alhr, java.lang.Object] */
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        boolean z;
        qxu qxuVar;
        alog n;
        int incrementAndGet = this.c.incrementAndGet();
        if (incrementAndGet > 0) {
            z = true;
        } else {
            z = false;
        }
        albo.T(z);
        qya qyaVar = this.d;
        if (!((Boolean) qyaVar.a.get()).booleanValue()) {
            qxuVar = null;
        } else {
            qxu qxuVar2 = new qxu();
            synchronized (qyaVar.b) {
                qyaVar.c.add(qxuVar2);
            }
            qxuVar = qxuVar2;
        }
        if (incrementAndGet > this.e) {
            alvi alviVar = a;
            alvw h = alviVar.h();
            h.X(alwp.a, "BugleDatabase");
            alvg alvgVar = (alvg) h;
            alvgVar.Z(alwk.FULL);
            ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/datamodel/DepthMeasuredDatabaseWriteExecutor", "execute", 69, "DepthMeasuredDatabaseWriteExecutor.java")).w("Deep work queue for database write!  queueDepth = %d currentTrace = %s", incrementAndGet, aktp.c());
            qya qyaVar2 = this.d;
            if (((Boolean) qyaVar2.a.get()).booleanValue()) {
                aivj aivjVar = new aivj((Lock) qyaVar2.d, 1);
                try {
                    if (aivjVar.a != null) {
                        synchronized (qyaVar2.b) {
                            n = alog.n(qyaVar2.c);
                        }
                        for (Map.Entry entry : ((Map) Collection.EL.stream(n).collect(Collectors.groupingBy(Function$CC.identity(), new qxs(2), Collectors.counting()))).entrySet()) {
                            String a2 = ((qxu) entry.getKey()).a();
                            String str = ((qxu) entry.getKey()).a;
                            Long l = (Long) entry.getValue();
                            alvw h2 = a.h();
                            h2.X(alwp.a, "BugleDatabase");
                            ((alvg) ((alvg) h2).h("com/google/android/apps/messaging/shared/datamodel/DepthMeasuredDatabaseWriteExecutor$DebugHelper", "writeQueuedDebugHelperDataToLogger", 165, "DepthMeasuredDatabaseWriteExecutor.java")).J("Enqueued count, stack, trace: %d\r\n%s\r\n%s", l, a2, str);
                        }
                    } else {
                        alvw h3 = alviVar.h();
                        h3.X(alwp.a, "BugleDatabase");
                        ((alvg) ((alvg) h3).h("com/google/android/apps/messaging/shared/datamodel/DepthMeasuredDatabaseWriteExecutor$DebugHelper", "writeQueuedDebugHelperDataToLogger", 141, "DepthMeasuredDatabaseWriteExecutor.java")).q("Skipping simultaneous debug logging.");
                    }
                    aivjVar.close();
                } catch (Throwable th) {
                    try {
                        aivjVar.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }
        qiu.h(aktp.ah(new itl((Object) this, (Object) runnable, (Object) qxuVar, 16, (byte[]) null), this.b));
    }
}
