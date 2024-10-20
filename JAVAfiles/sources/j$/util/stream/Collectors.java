package j$.util.stream;

import j$.util.stream.Collector;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

/* loaded from: classes5.dex */
public final class Collectors {
    static final Set a;
    static final Set b;
    static final Set c;

    static {
        Collector.Characteristics characteristics = Collector.Characteristics.CONCURRENT;
        Collector.Characteristics characteristics2 = Collector.Characteristics.UNORDERED;
        Collector.Characteristics characteristics3 = Collector.Characteristics.IDENTITY_FINISH;
        Collections.unmodifiableSet(EnumSet.of(characteristics, characteristics2, characteristics3));
        Collections.unmodifiableSet(EnumSet.of(characteristics, characteristics2));
        a = Collections.unmodifiableSet(EnumSet.of(characteristics3));
        b = Collections.unmodifiableSet(EnumSet.of(characteristics2, characteristics3));
        c = Collections.emptySet();
        Collections.unmodifiableSet(EnumSet.of(characteristics2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(double[] dArr, double d) {
        double d2 = d - dArr[1];
        double d3 = dArr[0];
        double d4 = d3 + d2;
        dArr[1] = (d4 - d3) - d2;
        dArr[0] = d4;
    }

    public static <T, A, R, RR> Collector<T, A, RR> collectingAndThen(Collector<T, A, R> collector, Function<R, RR> function) {
        Set characteristics = collector.characteristics();
        Collector.Characteristics characteristics2 = Collector.Characteristics.IDENTITY_FINISH;
        if (characteristics.contains(characteristics2)) {
            if (characteristics.size() == 1) {
                characteristics = c;
            } else {
                EnumSet copyOf = EnumSet.copyOf((Collection) characteristics);
                copyOf.remove(characteristics2);
                characteristics = Collections.unmodifiableSet(copyOf);
            }
        }
        return new C0184p(collector.supplier(), collector.accumulator(), collector.combiner(), collector.finisher().mo416andThen(function), characteristics);
    }

    public static <T> Collector<T, ?, Long> counting() {
        return new C0184p(new C0159k(8), new C0109a(3, new C0159k(7)), new C0159k(9), new C0159k(10), c);
    }

    public static <T, K> Collector<T, ?, Map<K, List<T>>> groupingBy(Function<? super T, ? extends K> function) {
        return groupingBy(function, toList());
    }

    public static Collector<CharSequence, ?, String> joining(CharSequence charSequence) {
        return new C0184p(new C0109a(2, charSequence), new C0169m(5), new C0169m(6), new C0169m(7), c);
    }

    public static <T, U, A, R> Collector<T, ?, R> mapping(Function<? super T, ? extends U> function, Collector<? super U, A, R> collector) {
        return new C0184p(collector.supplier(), new C0164l(collector.accumulator(), function), collector.combiner(), collector.finisher(), collector.characteristics());
    }

    public static <T, C extends Collection<T>> Collector<T, ?, C> toCollection(Supplier<C> supplier) {
        return new C0184p(supplier, new C0159k(28), new C0159k(1), a);
    }

    public static <T> Collector<T, ?, List<T>> toList() {
        return new C0184p(new C0159k(29), new C0169m(0), new C0159k(4), a);
    }

    public static <T, K, U> Collector<T, ?, Map<K, U>> toMap(Function<? super T, ? extends K> function, Function<? super T, ? extends U> function2) {
        return new C0184p(new C0169m(8), new C0164l(0, function, function2), new C0159k(0), a);
    }

    public static <T> Collector<T, ?, Set<T>> toSet() {
        return new C0184p(new C0169m(2), new C0169m(3), new C0159k(6), b);
    }

    public static <T> Collector<T, ?, List<T>> toUnmodifiableList() {
        return new C0184p(new C0159k(29), new C0169m(0), new C0159k(2), new C0159k(3), c);
    }

    public static <T, K, A, D> Collector<T, ?, Map<K, D>> groupingBy(Function<? super T, ? extends K> function, Collector<? super T, A, D> collector) {
        return groupingBy(function, new C0169m(8), collector);
    }

    public static <T, K, D, A, M extends Map<K, D>> Collector<T, ?, M> groupingBy(Function<? super T, ? extends K> function, Supplier<M> supplier, Collector<? super T, A, D> collector) {
        C0174n c0174n = new C0174n(function, collector.supplier(), collector.accumulator(), 1);
        C0109a c0109a = new C0109a(4, collector.combiner());
        if (collector.characteristics().contains(Collector.Characteristics.IDENTITY_FINISH)) {
            return new C0184p(supplier, c0174n, c0109a, a);
        }
        return new C0184p(supplier, c0174n, c0109a, new C0179o(collector.finisher(), 1), c);
    }

    public static <T, K, U, M extends Map<K, U>> Collector<T, ?, M> toMap(Function<? super T, ? extends K> function, Function<? super T, ? extends U> function2, BinaryOperator<U> binaryOperator, Supplier<M> supplier) {
        return new C0184p(supplier, new C0174n(function, function2, binaryOperator, 0), new C0109a(4, binaryOperator), a);
    }
}
