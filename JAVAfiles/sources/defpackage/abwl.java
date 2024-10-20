package defpackage;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abwl {
    private final ArrayBlockingQueue a = new ArrayBlockingQueue(1);
    private boolean b = false;
    private boolean c = false;

    public final Object a(long j) {
        if (!this.c) {
            this.c = true;
            return this.a.poll(j, TimeUnit.MILLISECONDS);
        }
        throw new RuntimeException("BlockingChannel can be read only once.");
    }

    public final void b(Object obj) {
        if (!this.b) {
            this.b = true;
            this.a.offer(obj);
            return;
        }
        throw new RuntimeException("BlockingChannel can be written only once.");
    }
}
