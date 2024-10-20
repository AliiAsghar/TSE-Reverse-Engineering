package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qiu {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/shared/concurrent/CrashOnUnexpectedExceptionFutureCallback");

    public static akul a(akul akulVar) {
        return akulVar.f(Throwable.class, new prf(new RuntimeException(), 8), andi.a);
    }

    public static andy b() {
        return new ydv(new qcq(11), new RuntimeException(), 1);
    }

    public static andy c(Consumer consumer) {
        return new qit(consumer, new qcq(10), new RuntimeException());
    }

    public static void d(Throwable th) {
        j(th, null, new qcq(10));
    }

    public static void e(ListenableFuture listenableFuture) {
        aktp.aa(listenableFuture, qis.a, andi.a);
    }

    public static void f(ListenableFuture listenableFuture, String str) {
        aktp.aa(listenableFuture, new qis(str), andi.a);
    }

    public static void g(Throwable th, RuntimeException runtimeException, Function function) {
        if (th instanceof CancellationException) {
            alvw i = a.i();
            i.X(alwp.a, "Bugle");
            ((alvg) ((alvg) ((alvg) i).g(th)).h("com/google/android/apps/messaging/shared/concurrent/CrashOnUnexpectedExceptionFutureCallback", "onFailure", (char) 273, "CrashOnUnexpectedExceptionFutureCallback.java")).q("future failed due to CancellationException");
            return;
        }
        j(th, runtimeException, function);
    }

    public static void h(ListenableFuture listenableFuture) {
        aktp.aa(listenableFuture, b(), andi.a);
    }

    public static void i(ListenableFuture listenableFuture, Consumer consumer, Executor executor) {
        aktp.aa(listenableFuture, c(consumer), executor);
    }

    private static void j(Throwable th, RuntimeException runtimeException, Function function) {
        Object apply;
        apply = function.apply(th);
        RuntimeException runtimeException2 = (RuntimeException) apply;
        if (runtimeException != null) {
            runtimeException2.setStackTrace(runtimeException.getStackTrace());
        }
        aiut.a().post(new nau(runtimeException2, 9));
    }
}
