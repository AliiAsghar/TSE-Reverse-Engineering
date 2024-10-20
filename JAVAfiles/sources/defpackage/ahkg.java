package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahkg implements ThreadFactory {
    public final int a;
    private final AtomicInteger b;
    private final String c;
    private final /* synthetic */ int d;

    public ahkg(String str, int i, byte[] bArr) {
        this.d = i;
        this.b = new AtomicInteger(1);
        this.c = str;
        this.a = 5;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        if (this.d != 0) {
            Thread thread = new Thread(runnable, this.c + "#" + this.b.getAndIncrement());
            thread.setPriority(this.a);
            return thread;
        }
        Thread thread2 = new Thread(new ahnu(this, runnable, 1, null), this.c + "-" + this.b.getAndIncrement());
        if (thread2.isDaemon()) {
            thread2.setDaemon(false);
        }
        return thread2;
    }

    public ahkg(String str, int i, int i2) {
        this.d = i2;
        this.b = new AtomicInteger(1);
        this.c = str;
        this.a = i;
    }

    public ahkg(int i, int i2) {
        this.d = i2;
        this.b = new AtomicInteger(1);
        this.a = i;
        this.c = "Primes";
    }
}
