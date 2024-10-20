package j$.util;

import java.util.Collections;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* loaded from: classes5.dex */
public interface Comparator<T> {

    /* renamed from: j$.util.Comparator$-EL, reason: invalid class name */
    /* loaded from: classes5.dex */
    public final /* synthetic */ class EL {
        public static java.util.Comparator reversed(java.util.Comparator comparator) {
            if (comparator instanceof Comparator) {
                return ((Comparator) comparator).reversed();
            }
            return Collections.reverseOrder(comparator);
        }

        public static /* synthetic */ java.util.Comparator thenComparing(java.util.Comparator comparator, java.util.Comparator comparator2) {
            return comparator instanceof Comparator ? ((Comparator) comparator).thenComparing(comparator2) : CC.$default$thenComparing(comparator, comparator2);
        }

        public static /* synthetic */ java.util.Comparator thenComparing(java.util.Comparator comparator, Function function, java.util.Comparator comparator2) {
            return comparator instanceof Comparator ? ((Comparator) comparator).thenComparing(function, comparator2) : CC.$default$thenComparing(comparator, function, comparator2);
        }
    }

    java.util.Comparator<T> reversed();

    java.util.Comparator<T> thenComparing(java.util.Comparator<? super T> comparator);

    <U extends Comparable<? super U>> java.util.Comparator<T> thenComparing(Function<? super T, ? extends U> function);

    <U> java.util.Comparator<T> thenComparing(Function<? super T, ? extends U> function, java.util.Comparator<? super U> comparator);

    java.util.Comparator<T> thenComparingDouble(ToDoubleFunction<? super T> toDoubleFunction);

    java.util.Comparator<T> thenComparingInt(ToIntFunction<? super T> toIntFunction);

    java.util.Comparator<T> thenComparingLong(ToLongFunction<? super T> toLongFunction);

    /* renamed from: j$.util.Comparator$-CC, reason: invalid class name */
    /* loaded from: classes5.dex */
    public final /* synthetic */ class CC {
        public static java.util.Comparator $default$thenComparing(java.util.Comparator comparator, java.util.Comparator comparator2) {
            comparator2.getClass();
            return new C0092c(comparator, comparator2, 0);
        }

        public static java.util.Comparator $default$thenComparingDouble(java.util.Comparator comparator, ToDoubleFunction toDoubleFunction) {
            toDoubleFunction.getClass();
            return EL.thenComparing(comparator, new C0091b(1, toDoubleFunction));
        }

        public static <T, U extends Comparable<? super U>> java.util.Comparator<T> comparing(Function<? super T, ? extends U> function) {
            function.getClass();
            return new C0091b(2, function);
        }

        public static <T> java.util.Comparator<T> comparingInt(ToIntFunction<? super T> toIntFunction) {
            toIntFunction.getClass();
            return new C0091b(0, toIntFunction);
        }

        public static <T> java.util.Comparator<T> comparingLong(ToLongFunction<? super T> toLongFunction) {
            toLongFunction.getClass();
            return new C0091b(3, toLongFunction);
        }

        public static <T extends Comparable<? super T>> java.util.Comparator<T> naturalOrder() {
            return EnumC0094d.INSTANCE;
        }

        public static <T> java.util.Comparator<T> nullsLast(java.util.Comparator<? super T> comparator) {
            return new C0095e(false, comparator);
        }

        public static java.util.Comparator $default$thenComparing(java.util.Comparator comparator, Function function, java.util.Comparator comparator2) {
            return EL.thenComparing(comparator, comparing(function, comparator2));
        }

        public static <T, U> java.util.Comparator<T> comparing(Function<? super T, ? extends U> function, java.util.Comparator<? super U> comparator) {
            function.getClass();
            comparator.getClass();
            return new C0092c(comparator, function, 1);
        }
    }
}
