package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class elc {
    public final Context a;
    public final ebq b;
    public final Object c = new Object();
    public Executor d;
    public ThreadPoolExecutor e;
    qdq f;

    public elc(Context context, ebq ebqVar) {
        d.aC(context, "Context cannot be null");
        this.a = context.getApplicationContext();
        this.b = ebqVar;
    }

    public final void a() {
        synchronized (this.c) {
            this.f = null;
            ThreadPoolExecutor threadPoolExecutor = this.e;
            if (threadPoolExecutor != null) {
                threadPoolExecutor.shutdown();
            }
            this.d = null;
            this.e = null;
        }
    }
}
