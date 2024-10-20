package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hrb implements ThreadFactory {
    public final boolean a;
    private final String b;
    private final AtomicInteger c = new AtomicInteger();

    public hrb(String str, boolean z) {
        this.b = str;
        this.a = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        hra hraVar = new hra(new fhh(this, runnable, 18, (short[]) null));
        hraVar.setName("glide-" + this.b + "-thread-" + this.c.getAndIncrement());
        return hraVar;
    }
}
