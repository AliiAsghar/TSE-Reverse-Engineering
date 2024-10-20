package j$.util.stream;

import java.util.OptionalInt;
import java.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class S {
    public static /* bridge */ /* synthetic */ OptionalInt A(java.util.stream.IntStream intStream) {
        return intStream.findFirst();
    }

    public static /* bridge */ /* synthetic */ java.util.stream.IntStream B(java.util.stream.IntStream intStream) {
        return intStream.distinct();
    }

    public static /* bridge */ /* synthetic */ OptionalInt C(java.util.stream.IntStream intStream) {
        return intStream.min();
    }

    public static /* bridge */ /* synthetic */ java.util.stream.IntStream D(java.util.stream.IntStream intStream) {
        return intStream.parallel();
    }

    public static /* bridge */ /* synthetic */ int a(T t) {
        return t.getPendingCount();
    }

    public static /* bridge */ /* synthetic */ Object b(java.util.stream.IntStream intStream, Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer) {
        return intStream.collect(supplier, objIntConsumer, biConsumer);
    }

    public static /* bridge */ /* synthetic */ OptionalInt c(java.util.stream.IntStream intStream) {
        return intStream.findAny();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Spliterator$OfInt] */
    public static /* bridge */ /* synthetic */ Spliterator.OfInt d(java.util.stream.IntStream intStream) {
        return intStream.spliterator();
    }

    public static /* bridge */ /* synthetic */ Spliterator e(java.util.stream.IntStream intStream) {
        return intStream.spliterator();
    }

    public static /* bridge */ /* synthetic */ java.util.stream.BaseStream f(java.util.stream.IntStream intStream) {
        return intStream.sequential();
    }

    public static /* bridge */ /* synthetic */ java.util.stream.DoubleStream g(java.util.stream.IntStream intStream) {
        return intStream.mapToDouble(null);
    }

    public static /* bridge */ /* synthetic */ java.util.stream.IntStream h(java.util.stream.IntStream intStream) {
        return intStream.sequential();
    }

    public static /* bridge */ /* synthetic */ java.util.stream.IntStream i(java.util.stream.IntStream intStream, long j) {
        return intStream.skip(j);
    }

    public static /* bridge */ /* synthetic */ java.util.stream.IntStream j(java.util.stream.IntStream intStream, O0 o0) {
        return intStream.flatMap(o0);
    }

    public static /* bridge */ /* synthetic */ java.util.stream.IntStream k(java.util.stream.IntStream intStream, IntPredicate intPredicate) {
        return intStream.filter(intPredicate);
    }

    public static /* bridge */ /* synthetic */ java.util.stream.LongStream l(java.util.stream.IntStream intStream) {
        return intStream.mapToLong(null);
    }

    public static /* bridge */ /* synthetic */ java.util.stream.Stream m(java.util.stream.IntStream intStream) {
        return intStream.boxed();
    }

    public static /* bridge */ /* synthetic */ void n(T t) {
        t.addToPendingCount(1);
    }

    public static /* bridge */ /* synthetic */ void o(U u) {
        u.addToPendingCount(1);
    }

    public static /* bridge */ /* synthetic */ void p(java.util.stream.IntStream intStream) {
        intStream.summaryStatistics();
    }

    public static /* bridge */ /* synthetic */ void q(java.util.stream.IntStream intStream, IntConsumer intConsumer) {
        intStream.forEachOrdered(intConsumer);
    }

    public static /* bridge */ /* synthetic */ boolean r(java.util.stream.IntStream intStream, IntPredicate intPredicate) {
        return intStream.anyMatch(intPredicate);
    }

    public static /* bridge */ /* synthetic */ OptionalInt s(java.util.stream.IntStream intStream) {
        return intStream.max();
    }

    public static /* bridge */ /* synthetic */ java.util.stream.IntStream t(java.util.stream.IntStream intStream) {
        return intStream.sorted();
    }

    public static /* bridge */ /* synthetic */ java.util.stream.IntStream u(java.util.stream.IntStream intStream, long j) {
        return intStream.limit(j);
    }

    public static /* bridge */ /* synthetic */ java.util.stream.LongStream v(java.util.stream.IntStream intStream) {
        return intStream.asLongStream();
    }

    public static /* bridge */ /* synthetic */ void w(T t) {
        t.addToPendingCount(-1);
    }

    public static /* bridge */ /* synthetic */ void x(U u) {
        u.propagateCompletion();
    }

    public static /* bridge */ /* synthetic */ void y(java.util.stream.IntStream intStream, IntConsumer intConsumer) {
        intStream.forEach(intConsumer);
    }

    public static /* bridge */ /* synthetic */ boolean z(java.util.stream.IntStream intStream, IntPredicate intPredicate) {
        return intStream.allMatch(intPredicate);
    }
}
