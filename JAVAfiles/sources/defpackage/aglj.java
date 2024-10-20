package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aglj implements ThreadFactory {
    public final Object a;
    private final ThreadFactory b;
    private final /* synthetic */ int c;

    public aglj(ThreadFactory threadFactory, aglh aglhVar, int i) {
        this.c = i;
        this.b = threadFactory;
        this.a = aglhVar;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        if (this.c != 0) {
            Thread newThread = this.b.newThread(new gwc(runnable, 2));
            newThread.setName((String) this.a);
            return newThread;
        }
        return this.b.newThread(new adhc(this, runnable, 13, null));
    }

    public aglj(String str, int i) {
        this.c = i;
        this.b = Executors.defaultThreadFactory();
        this.a = str;
    }
}
