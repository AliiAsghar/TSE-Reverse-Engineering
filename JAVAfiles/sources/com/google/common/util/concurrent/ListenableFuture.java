package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface ListenableFuture<V> extends Future<V> {
    void c(Runnable runnable, Executor executor);
}
