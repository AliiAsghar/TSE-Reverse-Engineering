package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xzw {
    public static final Handler a = new Handler(Looper.getMainLooper());

    public static void a(Runnable runnable) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            runnable.run();
        } else {
            d(runnable);
        }
    }

    @Deprecated
    public static void b(Runnable runnable, long j) {
        xyl.k(true);
        a.postDelayed(runnable, j);
    }

    public static void c(Runnable runnable) {
        if (aiut.g()) {
            runnable.run();
        } else {
            aiut.e(runnable);
        }
    }

    @Deprecated
    public static void d(Runnable runnable) {
        if (!xyl.n()) {
            a.post(runnable);
        } else {
            runnable.run();
        }
    }
}
