package j$.util.stream;

import java.util.Iterator;
import java.util.OptionalDouble;
import java.util.PrimitiveIterator;
import java.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class B {
    public static /* bridge */ /* synthetic */ OptionalDouble A(java.util.stream.DoubleStream doubleStream) {
        return doubleStream.findFirst();
    }

    public static /* bridge */ /* synthetic */ java.util.stream.DoubleStream B(java.util.stream.DoubleStream doubleStream) {
        return doubleStream.sequential();
    }

    public static /* bridge */ /* synthetic */ OptionalDouble C(java.util.stream.DoubleStream doubleStream) {
        return doubleStream.max();
    }

    public static /* bridge */ /* synthetic */ java.util.stream.DoubleStream D(java.util.stream.DoubleStream doubleStream) {
        return doubleStream.sorted();
    }

    public static /* bridge */ /* synthetic */ double a(java.util.stream.DoubleStream doubleStream) {
        return doubleStream.sum();
    }

    public static /* bridge */ /* synthetic */ long b(java.util.stream.DoubleStream doubleStream) {
        return doubleStream.count();
    }

    public static /* bridge */ /* synthetic */ Object c(java.util.stream.DoubleStream doubleStream, Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        return doubleStream.collect(supplier, objDoubleConsumer, biConsumer);
    }

    public static /* bridge */ /* synthetic */ Iterator d(java.util.stream.DoubleStream doubleStream) {
        return doubleStream.iterator();
    }

    public static /* bridge */ /* synthetic */ OptionalDouble e(java.util.stream.DoubleStream doubleStream) {
        return doubleStream.findAny();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.PrimitiveIterator$OfDouble] */
    public static /* bridge */ /* synthetic */ PrimitiveIterator.OfDouble f(java.util.stream.DoubleStream doubleStream) {
        return doubleStream.iterator();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Spliterator$OfDouble] */
    public static /* bridge */ /* synthetic */ Spliterator.OfDouble g(java.util.stream.DoubleStream doubleStream) {
        return doubleStream.spliterator();
    }

    public static /* bridge */ /* synthetic */ Spliterator h(java.util.stream.DoubleStream doubleStream) {
        return doubleStream.spliterator();
    }

    public static /* bridge */ /* synthetic */ java.util.stream.BaseStream i(java.util.stream.DoubleStream doubleStream) {
        return doubleStream.parallel();
    }

    public static /* bridge */ /* synthetic */ java.util.stream.DoubleStream j(java.util.stream.DoubleStream doubleStream) {
        return doubleStream.distinct();
    }

    public static /* bridge */ /* synthetic */ java.util.stream.DoubleStream k(java.util.stream.DoubleStream doubleStream, long j) {
        return doubleStream.skip(j);
    }

    public static /* bridge */ /* synthetic */ java.util.stream.DoubleStream l(java.util.stream.DoubleStream doubleStream, C0109a c0109a) {
        return doubleStream.flatMap(c0109a);
    }

    public static /* bridge */ /* synthetic */ java.util.stream.DoubleStream m(java.util.stream.DoubleStream doubleStream, DoubleConsumer doubleConsumer) {
        return doubleStream.peek(doubleConsumer);
    }

    public static /* bridge */ /* synthetic */ java.util.stream.DoubleStream n(java.util.stream.DoubleStream doubleStream, DoubleUnaryOperator doubleUnaryOperator) {
        return doubleStream.map(doubleUnaryOperator);
    }

    public static /* bridge */ /* synthetic */ java.util.stream.LongStream o(java.util.stream.DoubleStream doubleStream) {
        return doubleStream.mapToLong(null);
    }

    public static /* bridge */ /* synthetic */ java.util.stream.Stream p(java.util.stream.DoubleStream doubleStream) {
        return doubleStream.boxed();
    }

    public static /* bridge */ /* synthetic */ java.util.stream.Stream q(java.util.stream.DoubleStream doubleStream, DoubleFunction doubleFunction) {
        return doubleStream.mapToObj(doubleFunction);
    }

    public static /* bridge */ /* synthetic */ void r(T t) {
        t.tryComplete();
    }

    public static /* bridge */ /* synthetic */ void s(java.util.stream.DoubleStream doubleStream) {
        doubleStream.summaryStatistics();
    }

    public static /* bridge */ /* synthetic */ void t(java.util.stream.DoubleStream doubleStream, DoubleConsumer doubleConsumer) {
        doubleStream.forEach(doubleConsumer);
    }

    public static /* bridge */ /* synthetic */ boolean u(java.util.stream.DoubleStream doubleStream) {
        return doubleStream.allMatch(null);
    }

    public static /* bridge */ /* synthetic */ double[] v(java.util.stream.DoubleStream doubleStream) {
        return doubleStream.toArray();
    }

    public static /* bridge */ /* synthetic */ OptionalDouble w(java.util.stream.DoubleStream doubleStream) {
        return doubleStream.average();
    }

    public static /* bridge */ /* synthetic */ java.util.stream.DoubleStream x(java.util.stream.DoubleStream doubleStream) {
        return doubleStream.parallel();
    }

    public static /* bridge */ /* synthetic */ java.util.stream.DoubleStream y(java.util.stream.DoubleStream doubleStream, long j) {
        return doubleStream.limit(j);
    }

    public static /* bridge */ /* synthetic */ boolean z(java.util.stream.DoubleStream doubleStream) {
        return doubleStream.noneMatch(null);
    }
}
