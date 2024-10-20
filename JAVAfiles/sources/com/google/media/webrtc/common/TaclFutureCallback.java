package com.google.media.webrtc.common;

import com.google.common.util.concurrent.ListenableFuture;
import defpackage.albo;
import defpackage.andy;
import io.grpc.Status;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class TaclFutureCallback<T> implements andy<T> {
    private static final Executor a = Executors.newSingleThreadExecutor();
    private final ListenableFuture b;

    private TaclFutureCallback(ListenableFuture listenableFuture) {
        this.b = listenableFuture;
    }

    public static <T> TaclFutureCallback<T> attachToFuture(ListenableFuture<T> listenableFuture) {
        return new TaclFutureCallback<>(listenableFuture);
    }

    private native void nativeProcessFailure(Status status);

    private native void nativeProcessResult(T t);

    @Override // defpackage.andy
    public final void a(Throwable th) {
        nativeProcessFailure(Status.c(th));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.andy
    public final void b(Object obj) {
        nativeProcessResult(obj);
    }

    public void listen() {
        albo.bR(this.b, this, a);
    }
}
