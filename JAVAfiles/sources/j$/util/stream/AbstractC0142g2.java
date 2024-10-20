package j$.util.stream;

import j$.util.Optional;
import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.stream.Collector;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.g2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC0142g2 extends AbstractC0114b implements Stream {
    @Override // j$.util.stream.Stream
    public final IntStream A(C0179o c0179o) {
        return new Y(this, EnumC0143g3.p | EnumC0143g3.n | EnumC0143g3.t, c0179o, 5);
    }

    @Override // j$.util.stream.AbstractC0114b
    final I0 B(AbstractC0114b abstractC0114b, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return AbstractC0219w0.E(abstractC0114b, spliterator, z, intFunction);
    }

    @Override // j$.util.stream.AbstractC0114b
    final boolean D(Spliterator spliterator, InterfaceC0182o2 interfaceC0182o2) {
        boolean n;
        do {
            n = interfaceC0182o2.n();
            if (n) {
                break;
            }
        } while (spliterator.tryAdvance(interfaceC0182o2));
        return n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0114b
    public final EnumC0148h3 E() {
        return EnumC0148h3.REFERENCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0114b
    public final A0 J(long j, IntFunction intFunction) {
        return AbstractC0219w0.D(j, intFunction);
    }

    @Override // j$.util.stream.AbstractC0114b
    final Spliterator Q(AbstractC0114b abstractC0114b, Supplier supplier, boolean z) {
        return new AbstractC0153i3(abstractC0114b, supplier, z);
    }

    @Override // j$.util.stream.Stream
    public final boolean allMatch(Predicate predicate) {
        return ((Boolean) v(AbstractC0219w0.X(EnumC0204t0.ALL, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final boolean anyMatch(Predicate predicate) {
        return ((Boolean) v(AbstractC0219w0.X(EnumC0204t0.ANY, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        supplier.getClass();
        biConsumer.getClass();
        biConsumer2.getClass();
        return v(new D1(EnumC0148h3.REFERENCE, biConsumer2, biConsumer, supplier, 3));
    }

    @Override // j$.util.stream.Stream
    public final long count() {
        return ((Long) v(new F1(2))).longValue();
    }

    @Override // j$.util.stream.Stream
    public final Stream distinct() {
        return new AbstractC0137f2(this, EnumC0143g3.m | EnumC0143g3.t, 0);
    }

    @Override // j$.util.stream.Stream
    public final Stream dropWhile(Predicate predicate) {
        int i = h4.a;
        predicate.getClass();
        return new V3(this, h4.b, predicate);
    }

    @Override // j$.util.stream.Stream
    public final Stream filter(Predicate predicate) {
        predicate.getClass();
        return new C0218w(this, EnumC0143g3.t, predicate, 4);
    }

    @Override // j$.util.stream.Stream
    public final Optional findAny() {
        return (Optional) v(J.d);
    }

    @Override // j$.util.stream.Stream
    public final Optional findFirst() {
        return (Optional) v(J.c);
    }

    @Override // j$.util.stream.Stream
    public final Stream flatMap(Function function) {
        function.getClass();
        return new C0127d2(this, EnumC0143g3.p | EnumC0143g3.n | EnumC0143g3.t, function, 1);
    }

    public void forEach(Consumer consumer) {
        consumer.getClass();
        v(new P(consumer, false));
    }

    public void forEachOrdered(Consumer consumer) {
        consumer.getClass();
        v(new P(consumer, true));
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.DoubleStream
    /* renamed from: iterator */
    public final Iterator iterator2() {
        return Spliterators.iterator(spliterator());
    }

    @Override // j$.util.stream.Stream
    public final Stream limit(long j) {
        if (j >= 0) {
            return AbstractC0219w0.Y(this, 0L, j);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.Stream
    public final Stream map(Function function) {
        function.getClass();
        return new C0127d2(this, EnumC0143g3.p | EnumC0143g3.n, function, 0);
    }

    @Override // j$.util.stream.Stream
    public final DoubleStream mapToDouble(ToDoubleFunction toDoubleFunction) {
        toDoubleFunction.getClass();
        return new C0223x(this, EnumC0143g3.p | EnumC0143g3.n, toDoubleFunction, 3);
    }

    @Override // j$.util.stream.Stream
    public final IntStream mapToInt(ToIntFunction toIntFunction) {
        toIntFunction.getClass();
        return new Y(this, EnumC0143g3.p | EnumC0143g3.n, toIntFunction, 4);
    }

    @Override // j$.util.stream.Stream
    public final LongStream mapToLong(ToLongFunction toLongFunction) {
        toLongFunction.getClass();
        return new C0165l0(this, EnumC0143g3.p | EnumC0143g3.n, toLongFunction, 3);
    }

    @Override // j$.util.stream.Stream
    public final Optional max(Comparator comparator) {
        comparator.getClass();
        return reduce(new j$.util.function.b(comparator, 0));
    }

    @Override // j$.util.stream.Stream
    public final Optional min(Comparator comparator) {
        comparator.getClass();
        return reduce(new j$.util.function.b(comparator, 1));
    }

    @Override // j$.util.stream.Stream
    public final boolean noneMatch(Predicate predicate) {
        return ((Boolean) v(AbstractC0219w0.X(EnumC0204t0.NONE, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final Stream peek(Consumer consumer) {
        consumer.getClass();
        return new C0218w(this, consumer);
    }

    @Override // j$.util.stream.Stream
    public final Optional reduce(BinaryOperator binaryOperator) {
        binaryOperator.getClass();
        return (Optional) v(new B1(EnumC0148h3.REFERENCE, binaryOperator, 2));
    }

    @Override // j$.util.stream.Stream
    public final Stream skip(long j) {
        if (j >= 0) {
            if (j == 0) {
                return this;
            }
            return AbstractC0219w0.Y(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.Stream
    public final Stream sorted() {
        return new J2(this);
    }

    @Override // j$.util.stream.Stream
    public final Stream takeWhile(Predicate predicate) {
        int i = h4.a;
        predicate.getClass();
        return new T3(this, h4.a, predicate);
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray(IntFunction intFunction) {
        return AbstractC0219w0.M(z(intFunction), intFunction).p(intFunction);
    }

    @Override // j$.util.stream.Stream
    public final LongStream u(C0179o c0179o) {
        return new C0165l0(this, EnumC0143g3.p | EnumC0143g3.n | EnumC0143g3.t, c0179o, 2);
    }

    @Override // j$.util.stream.BaseStream
    public final BaseStream unordered() {
        if (!H()) {
            return this;
        }
        return new AbstractC0137f2(this, EnumC0143g3.r, 1);
    }

    @Override // j$.util.stream.Stream
    public final DoubleStream y(C0179o c0179o) {
        return new C0223x(this, EnumC0143g3.p | EnumC0143g3.n | EnumC0143g3.t, c0179o, 4);
    }

    @Override // j$.util.stream.Stream
    public final Stream sorted(Comparator comparator) {
        return new J2(this, comparator);
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray() {
        return toArray(new W(20));
    }

    @Override // j$.util.stream.Stream
    public final Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        biFunction.getClass();
        binaryOperator.getClass();
        return v(new D1(EnumC0148h3.REFERENCE, binaryOperator, biFunction, obj, 2));
    }

    @Override // j$.util.stream.Stream
    public final Object collect(Collector collector) {
        Object v;
        if (isParallel() && collector.characteristics().contains(Collector.Characteristics.CONCURRENT) && (!H() || collector.characteristics().contains(Collector.Characteristics.UNORDERED))) {
            v = collector.supplier().get();
            forEach(new C0164l(6, collector.accumulator(), v));
        } else {
            collector.getClass();
            Supplier supplier = collector.supplier();
            v = v(new K1(EnumC0148h3.REFERENCE, collector.combiner(), collector.accumulator(), supplier, collector));
        }
        return collector.characteristics().contains(Collector.Characteristics.IDENTITY_FINISH) ? v : collector.finisher().apply(v);
    }

    @Override // j$.util.stream.Stream
    public final Object reduce(Object obj, BinaryOperator binaryOperator) {
        binaryOperator.getClass();
        return v(new D1(EnumC0148h3.REFERENCE, binaryOperator, binaryOperator, obj, 2));
    }
}
