package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ebx implements Executor {
    private final Handler a;
    private final /* synthetic */ int b;

    public ebx(Handler handler, int i, byte[] bArr) {
        this.b = i;
        this.a = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    this.a.post(runnable);
                    return;
                } else {
                    this.a.post(runnable);
                    return;
                }
            }
            dye.i(runnable);
            if (this.a.post(runnable)) {
                return;
            }
            Handler handler = this.a;
            Objects.toString(handler);
            throw new RejectedExecutionException(handler.toString().concat(" is shutting down"));
        }
        dye.i(runnable);
        if (this.a.post(runnable)) {
            return;
        }
        Handler handler2 = this.a;
        Objects.toString(handler2);
        throw new RejectedExecutionException(handler2.toString().concat(" is shutting down"));
    }

    public ebx(Handler handler, int i) {
        this.b = i;
        dye.i(handler);
        this.a = handler;
    }

    public ebx(Looper looper, int i) {
        this.b = i;
        this.a = new acda(looper);
    }

    public ebx(int i) {
        this.b = i;
        this.a = new acda(Looper.getMainLooper());
    }
}
