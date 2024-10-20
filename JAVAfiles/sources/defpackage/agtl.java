package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agtl implements ThreadFactory {
    public final int a;
    public final agts b;
    private final String c;
    private final AtomicInteger d = new AtomicInteger(0);

    public agtl(String str, int i, agts agtsVar) {
        this.c = str;
        this.a = i;
        this.b = agtsVar;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        agtk agtkVar = new agtk(this, runnable, this.c + "-" + this.d.incrementAndGet());
        agtkVar.setDaemon(false);
        return agtkVar;
    }
}
