package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aego implements akwy {
    private final Function a;

    private aego(Function function) {
        this.a = function;
    }

    public static aego a(Consumer consumer) {
        return new aego(new admk(consumer, 16));
    }

    @Override // defpackage.akwy
    public final ListenableFuture b(Object obj) {
        Object apply;
        apply = this.a.apply(obj);
        return albo.bI((akxa) apply);
    }
}
