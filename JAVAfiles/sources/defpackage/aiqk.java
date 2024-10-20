package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aiqk implements Executor {
    public static final aiqk a = new aiqk(Looper.getMainLooper());
    private final Handler b;

    private aiqk(Looper looper) {
        this.b = new Handler(looper);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.b.post(runnable);
    }
}
