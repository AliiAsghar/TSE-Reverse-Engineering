package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public abstract class xzq implements Runnable, xzo {
    public static final alvi g = alvi.m("com/google/android/apps/messaging/shared/util/common/SafeAsyncRunnable");
    public final String h;

    public xzq(String str) {
        this.h = str;
    }

    public static void a(Context context, xzq xzqVar) {
        Executor a = xzl.a();
        synchronized (f) {
            f.put(xzqVar, Long.valueOf(System.currentTimeMillis()));
        }
        try {
            a.execute(new xzp(xzqVar.h, xzqVar, context));
        } catch (RejectedExecutionException e) {
            xzl.b(xzqVar, e);
            throw e;
        }
    }

    public final String toString() {
        return this.h;
    }
}
