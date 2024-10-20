package defpackage;

import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adus {
    public Map a;
    public final CountDownLatch b = new CountDownLatch(1);
    public volatile boolean c = false;

    public final void a(boolean z) {
        this.c = z;
        this.b.countDown();
    }
}
