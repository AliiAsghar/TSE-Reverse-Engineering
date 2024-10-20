package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adnj implements ThreadFactory {
    private final AtomicInteger a = new AtomicInteger(0);
    private final /* synthetic */ int b;

    public adnj(int i, byte[] bArr) {
        this.b = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.a.getAndIncrement())));
                }
                return new Thread(runnable, "Survey #" + this.a.getAndIncrement());
            }
            Thread thread = new Thread(runnable);
            thread.setName("arch_disk_io_" + this.a.getAndIncrement());
            return thread;
        }
        return new adni("CS-BG" + this.a.incrementAndGet(), runnable);
    }

    public adnj(int i) {
        this.b = i;
    }

    public adnj(int i, char[] cArr) {
        this.b = i;
    }

    public adnj(int i, short[] sArr) {
        this.b = i;
    }
}
