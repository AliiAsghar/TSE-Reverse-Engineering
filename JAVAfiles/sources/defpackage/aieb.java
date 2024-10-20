package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aieb {
    private static final alvi a = alvi.m("com/google/android/libraries/privatetelemetry/mobalt/nontiktok/AndroidFutures");

    public static /* synthetic */ void a(ListenableFuture listenableFuture, Object[] objArr) {
        try {
            albo.bQ(listenableFuture);
        } catch (CancellationException unused) {
        } catch (ExecutionException e) {
            ((alvg) ((alvg) ((alvg) a.h()).g(e.getCause())).h("com/google/android/libraries/privatetelemetry/mobalt/nontiktok/AndroidFutures", "logOnFailure", 27, "AndroidFutures.java")).Q("Mobalt: one or more reports failed to be logged to", objArr);
        }
    }
}
