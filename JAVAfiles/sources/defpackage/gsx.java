package defpackage;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class gsx {
    public Context a;
    public WorkerParameters b;
    public final AtomicInteger c = new AtomicInteger(-256);
    public boolean d;

    public gsx(Context context, WorkerParameters workerParameters) {
        if (context != null) {
            if (workerParameters != null) {
                this.a = context;
                this.b = workerParameters;
                return;
            }
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        throw new IllegalArgumentException("Application Context is null");
    }

    public ListenableFuture a() {
        return d.m(new akxr(1));
    }

    public abstract ListenableFuture b();

    public final int e() {
        return this.b.d;
    }

    public final gsi f() {
        return this.b.b;
    }

    public final UUID g() {
        return this.b.a;
    }

    public final Executor h() {
        return this.b.e;
    }

    public final void i(int i) {
        if (this.c.compareAndSet(-256, i)) {
            d();
        }
    }

    public final boolean j() {
        if (this.c.get() != -256) {
            return true;
        }
        return false;
    }

    public void d() {
    }
}
