package j$.util.function;

import j$.desugar.sun.nio.fs.n;
import java.util.function.Predicate;

/* renamed from: j$.util.function.Predicate$-CC */
/* loaded from: classes5.dex */
public final /* synthetic */ class Predicate$CC {
    public static Predicate $default$and(Predicate predicate, Predicate predicate2) {
        predicate2.getClass();
        return new j(predicate, predicate2, 0);
    }

    public static Predicate $default$negate(Predicate predicate) {
        return new j$.desugar.sun.nio.fs.h(3, predicate);
    }

    public static Predicate $default$or(Predicate predicate, Predicate predicate2) {
        predicate2.getClass();
        return new j(predicate, predicate2, 1);
    }

    public static <T> Predicate<T> isEqual(Object obj) {
        if (obj == null) {
            return new n(3);
        }
        return new j$.desugar.sun.nio.fs.h(4, obj);
    }
}
