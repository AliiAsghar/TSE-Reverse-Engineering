package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class andx extends andt implements anen {
    @Override // defpackage.andt, java.util.concurrent.ExecutorService
    /* renamed from: b */
    public final ListenableFuture submit(Callable callable) {
        return d().submit(callable);
    }

    @Override // defpackage.andt, java.util.concurrent.ExecutorService
    /* renamed from: c */
    public final ListenableFuture submit(Runnable runnable, Object obj) {
        return d().submit(runnable, obj);
    }

    protected abstract anen d();

    @Override // defpackage.andt
    protected /* bridge */ /* synthetic */ ExecutorService f() {
        throw null;
    }

    @Override // defpackage.andt, java.util.concurrent.ExecutorService
    /* renamed from: fM */
    public final ListenableFuture submit(Runnable runnable) {
        return d().submit(runnable);
    }
}
