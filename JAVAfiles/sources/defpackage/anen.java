package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface anen extends ExecutorService {
    ListenableFuture b(Callable callable);

    ListenableFuture c(Runnable runnable, Object obj);

    ListenableFuture fM(Runnable runnable);

    List invokeAll(Collection collection);

    List invokeAll(Collection collection, long j, TimeUnit timeUnit);
}
