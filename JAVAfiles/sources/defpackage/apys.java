package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apys {
    private static final algk a = new xea(6);
    private static final ancs b = new apyq();

    static {
        albo.bI(altc.a);
    }

    public static ListenableFuture a(ListenableFuture listenableFuture) {
        return ancd.g(ancj.f(listenableFuture, a, andi.a), Throwable.class, b, andi.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static apyi b(apyi apyiVar, apyp apypVar) {
        if (apyiVar instanceof apyo) {
            return apyiVar.g(apypVar);
        }
        Objects.toString(apyiVar);
        throw new IllegalArgumentException("entryPointViewOf called with non-CancellableProducer: ".concat(String.valueOf(apyiVar)));
    }

    public static apyi c(apyi apyiVar) {
        if (apyiVar instanceof apyo) {
            return ((apyo) apyiVar).f();
        }
        Objects.toString(apyiVar);
        throw new IllegalArgumentException("nonCancellationPropagatingViewOf called with non-CancellableProducer: ".concat(String.valueOf(apyiVar)));
    }

    public static apyi d(apya apyaVar) {
        apyaVar.getClass();
        return new apyr(apyaVar);
    }

    public static void e(apyi apyiVar, boolean z) {
        if (apyiVar instanceof apyo) {
            ((apyo) apyiVar).h(z);
        } else {
            Objects.toString(apyiVar);
            throw new IllegalArgumentException("cancel called with non-CancellableProducer: ".concat(String.valueOf(apyiVar)));
        }
    }
}
