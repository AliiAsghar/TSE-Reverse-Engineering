package defpackage;

import android.os.StrictMode;
import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class agjk implements ThreadFactory {
    public final /* synthetic */ ThreadFactory a;
    public final /* synthetic */ StrictMode.ThreadPolicy b;

    public /* synthetic */ agjk(ThreadFactory threadFactory, StrictMode.ThreadPolicy threadPolicy) {
        this.a = threadFactory;
        this.b = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return this.a.newThread(new adhc(this.b, runnable, 6, null));
    }
}
