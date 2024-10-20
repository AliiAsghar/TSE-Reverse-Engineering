package j$.util.function;

import j$.util.concurrent.y;
import java.util.function.BiFunction;
import java.util.function.Function;

/* renamed from: j$.util.function.BiFunction$-CC */
/* loaded from: classes5.dex */
public final /* synthetic */ class BiFunction$CC {
    public static BiFunction $default$andThen(BiFunction biFunction, Function function) {
        function.getClass();
        return new y(biFunction, function);
    }
}
