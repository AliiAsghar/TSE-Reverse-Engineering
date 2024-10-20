package j$.util.stream;

import java.util.Iterator;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.PrimitiveIterator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;

/* renamed from: j$.util.stream.g0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC0140g0 {
    public static /* bridge */ /* synthetic */ int[] B(java.util.stream.IntStream intStream) {
        return intStream.toArray();
    }

    public static /* bridge */ /* synthetic */ int a(java.util.stream.IntStream intStream) {
        return intStream.sum();
    }

    public static /* bridge */ /* synthetic */ int b(java.util.stream.IntStream intStream, int i, IntBinaryOperator intBinaryOperator) {
        return intStream.reduce(i, intBinaryOperator);
    }

    public static /* bridge */ /* synthetic */ long c(java.util.stream.IntStream intStream) {
        return intStream.count();
    }

    public static /* bridge */ /* synthetic */ Iterator g(java.util.stream.IntStream intStream) {
        return intStream.iterator();
    }

    public static /* bridge */ /* synthetic */ OptionalDouble i(java.util.stream.IntStream intStream) {
        return intStream.average();
    }

    public static /* bridge */ /* synthetic */ OptionalInt k(java.util.stream.IntStream intStream, IntBinaryOperator intBinaryOperator) {
        return intStream.reduce(intBinaryOperator);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.PrimitiveIterator$OfInt] */
    public static /* bridge */ /* synthetic */ PrimitiveIterator.OfInt n(java.util.stream.IntStream intStream) {
        return intStream.iterator();
    }

    public static /* bridge */ /* synthetic */ java.util.stream.BaseStream o(java.util.stream.IntStream intStream) {
        return intStream.parallel();
    }

    public static /* bridge */ /* synthetic */ java.util.stream.DoubleStream q(java.util.stream.IntStream intStream) {
        return intStream.asDoubleStream();
    }

    public static /* bridge */ /* synthetic */ java.util.stream.IntStream s(java.util.stream.IntStream intStream, IntConsumer intConsumer) {
        return intStream.peek(intConsumer);
    }

    public static /* bridge */ /* synthetic */ java.util.stream.IntStream t(java.util.stream.IntStream intStream, IntUnaryOperator intUnaryOperator) {
        return intStream.map(intUnaryOperator);
    }

    public static /* bridge */ /* synthetic */ java.util.stream.Stream x(java.util.stream.IntStream intStream, IntFunction intFunction) {
        return intStream.mapToObj(intFunction);
    }

    public static /* bridge */ /* synthetic */ boolean z(java.util.stream.IntStream intStream, IntPredicate intPredicate) {
        return intStream.noneMatch(intPredicate);
    }
}
