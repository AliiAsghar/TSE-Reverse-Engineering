package j$.util.stream;

import j$.util.C0243y;
import j$.util.OptionalDouble;
import j$.util.Spliterator;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* loaded from: classes5.dex */
public interface DoubleStream extends BaseStream<Double, DoubleStream> {
    DoubleStream a();

    OptionalDouble average();

    DoubleStream b();

    Stream boxed();

    DoubleStream c();

    Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer);

    long count();

    DoubleStream d(C0109a c0109a);

    DoubleStream distinct();

    OptionalDouble findAny();

    OptionalDouble findFirst();

    void forEach(DoubleConsumer doubleConsumer);

    void forEachOrdered(DoubleConsumer doubleConsumer);

    boolean g();

    LongStream h();

    @Override // 
    /* renamed from: iterator */
    Iterator<Double> iterator2();

    DoubleStream limit(long j);

    boolean m();

    DoubleStream map(DoubleUnaryOperator doubleUnaryOperator);

    Stream mapToObj(DoubleFunction doubleFunction);

    OptionalDouble max();

    OptionalDouble min();

    @Override // 
    DoubleStream parallel();

    DoubleStream peek(DoubleConsumer doubleConsumer);

    IntStream q();

    double reduce(double d, DoubleBinaryOperator doubleBinaryOperator);

    OptionalDouble reduce(DoubleBinaryOperator doubleBinaryOperator);

    @Override // 
    DoubleStream sequential();

    DoubleStream skip(long j);

    DoubleStream sorted();

    @Override // j$.util.stream.BaseStream
    Spliterator<Double> spliterator();

    double sum();

    C0243y summaryStatistics();

    double[] toArray();

    boolean x();
}
