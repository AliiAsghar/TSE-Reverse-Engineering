package j$.util.stream;

import j$.util.OptionalDouble;
import j$.util.OptionalLong;
import j$.util.Spliterator;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* loaded from: classes5.dex */
public interface LongStream extends BaseStream<Long, LongStream> {
    LongStream a();

    DoubleStream asDoubleStream();

    OptionalDouble average();

    LongStream b();

    Stream boxed();

    LongStream c();

    Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer);

    long count();

    LongStream d(C0109a c0109a);

    LongStream distinct();

    boolean f();

    OptionalLong findAny();

    OptionalLong findFirst();

    void forEach(LongConsumer longConsumer);

    void forEachOrdered(LongConsumer longConsumer);

    @Override // j$.util.stream.BaseStream, j$.util.stream.DoubleStream
    /* renamed from: iterator */
    Iterator<Long> iterator2();

    DoubleStream j();

    LongStream l();

    LongStream limit(long j);

    Stream mapToObj(LongFunction longFunction);

    OptionalLong max();

    OptionalLong min();

    boolean p();

    @Override // j$.util.stream.BaseStream, j$.util.stream.DoubleStream
    LongStream parallel();

    LongStream peek(LongConsumer longConsumer);

    long reduce(long j, LongBinaryOperator longBinaryOperator);

    OptionalLong reduce(LongBinaryOperator longBinaryOperator);

    @Override // j$.util.stream.BaseStream, j$.util.stream.DoubleStream
    LongStream sequential();

    LongStream skip(long j);

    LongStream sorted();

    @Override // j$.util.stream.BaseStream
    Spliterator<Long> spliterator();

    long sum();

    j$.util.B summaryStatistics();

    boolean t();

    long[] toArray();

    IntStream w();
}
