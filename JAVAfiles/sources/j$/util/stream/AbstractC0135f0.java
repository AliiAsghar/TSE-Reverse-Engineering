package j$.util.stream;

import j$.util.C0244z;
import j$.util.OptionalDouble;
import j$.util.OptionalInt;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.f0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC0135f0 extends AbstractC0114b implements IntStream {
    /* JADX INFO: Access modifiers changed from: private */
    public static j$.util.Y V(Spliterator spliterator) {
        if (spliterator instanceof j$.util.Y) {
            return (j$.util.Y) spliterator;
        }
        if (S3.a) {
            S3.a(AbstractC0114b.class, "using IntStream.adapt(Spliterator<Integer> s)");
            throw null;
        }
        throw new UnsupportedOperationException("IntStream.adapt(Spliterator<Integer> s)");
    }

    @Override // j$.util.stream.AbstractC0114b
    final I0 B(AbstractC0114b abstractC0114b, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return AbstractC0219w0.G(abstractC0114b, spliterator, z);
    }

    @Override // j$.util.stream.AbstractC0114b
    final boolean D(Spliterator spliterator, InterfaceC0182o2 interfaceC0182o2) {
        IntConsumer v;
        boolean n;
        j$.util.Y V = V(spliterator);
        if (interfaceC0182o2 instanceof IntConsumer) {
            v = (IntConsumer) interfaceC0182o2;
        } else if (!S3.a) {
            interfaceC0182o2.getClass();
            v = new V(interfaceC0182o2);
        } else {
            S3.a(AbstractC0114b.class, "using IntStream.adapt(Sink<Integer> s)");
            throw null;
        }
        do {
            n = interfaceC0182o2.n();
            if (n) {
                break;
            }
        } while (V.tryAdvance(v));
        return n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0114b
    public final EnumC0148h3 E() {
        return EnumC0148h3.INT_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0114b
    public final A0 J(long j, IntFunction intFunction) {
        return AbstractC0219w0.R(j);
    }

    @Override // j$.util.stream.AbstractC0114b
    final Spliterator Q(AbstractC0114b abstractC0114b, Supplier supplier, boolean z) {
        return new AbstractC0153i3(abstractC0114b, supplier, z);
    }

    @Override // j$.util.stream.IntStream
    public final boolean allMatch(IntPredicate intPredicate) {
        return ((Boolean) v(AbstractC0219w0.V(EnumC0204t0.ALL, intPredicate))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final boolean anyMatch(IntPredicate intPredicate) {
        return ((Boolean) v(AbstractC0219w0.V(EnumC0204t0.ANY, intPredicate))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final DoubleStream asDoubleStream() {
        return new C0233z(this, 0, 1);
    }

    @Override // j$.util.stream.IntStream
    public final LongStream asLongStream() {
        return new C0110a0(this, 0, 0);
    }

    @Override // j$.util.stream.IntStream
    public final OptionalDouble average() {
        long j = ((long[]) collect(new W(4), new W(5), new W(6)))[0];
        if (j > 0) {
            return OptionalDouble.b(r0[1] / j);
        }
        return OptionalDouble.a();
    }

    @Override // j$.util.stream.IntStream
    public final Stream boxed() {
        return new C0218w(this, 0, new C0169m(28), 1);
    }

    @Override // j$.util.stream.IntStream
    public final Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer) {
        biConsumer.getClass();
        C0208u c0208u = new C0208u(biConsumer, 1);
        supplier.getClass();
        objIntConsumer.getClass();
        return v(new D1(EnumC0148h3.INT_VALUE, c0208u, objIntConsumer, supplier, 4));
    }

    @Override // j$.util.stream.IntStream
    public final long count() {
        return ((Long) v(new F1(3))).longValue();
    }

    @Override // j$.util.stream.IntStream
    public final IntStream distinct() {
        return ((AbstractC0142g2) boxed()).distinct().mapToInt(new C0169m(27));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream dropWhile(IntPredicate intPredicate) {
        int i = h4.a;
        intPredicate.getClass();
        return new Z3(this, h4.b, intPredicate);
    }

    @Override // j$.util.stream.IntStream
    public final DoubleStream e() {
        throw null;
    }

    @Override // j$.util.stream.IntStream
    public final IntStream filter(IntPredicate intPredicate) {
        intPredicate.getClass();
        return new Y(this, EnumC0143g3.t, intPredicate, 3);
    }

    @Override // j$.util.stream.IntStream
    public final OptionalInt findAny() {
        return (OptionalInt) v(H.d);
    }

    @Override // j$.util.stream.IntStream
    public final OptionalInt findFirst() {
        return (OptionalInt) v(H.c);
    }

    public void forEach(IntConsumer intConsumer) {
        intConsumer.getClass();
        v(new N(intConsumer, false));
    }

    public void forEachOrdered(IntConsumer intConsumer) {
        intConsumer.getClass();
        v(new N(intConsumer, true));
    }

    @Override // j$.util.stream.IntStream
    public final LongStream k() {
        throw null;
    }

    @Override // j$.util.stream.IntStream
    public final IntStream limit(long j) {
        if (j >= 0) {
            return AbstractC0219w0.U(this, 0L, j);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream map(IntUnaryOperator intUnaryOperator) {
        intUnaryOperator.getClass();
        return new Y(this, EnumC0143g3.p | EnumC0143g3.n, intUnaryOperator, 1);
    }

    @Override // j$.util.stream.IntStream
    public final Stream mapToObj(IntFunction intFunction) {
        intFunction.getClass();
        return new C0218w(this, EnumC0143g3.p | EnumC0143g3.n, intFunction, 1);
    }

    @Override // j$.util.stream.IntStream
    public final OptionalInt max() {
        return reduce(new W(3));
    }

    @Override // j$.util.stream.IntStream
    public final OptionalInt min() {
        return reduce(new C0169m(29));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream n(O0 o0) {
        return new Y(this, EnumC0143g3.p | EnumC0143g3.n | EnumC0143g3.t, o0, 2);
    }

    @Override // j$.util.stream.IntStream
    public final boolean noneMatch(IntPredicate intPredicate) {
        return ((Boolean) v(AbstractC0219w0.V(EnumC0204t0.NONE, intPredicate))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final IntStream peek(IntConsumer intConsumer) {
        intConsumer.getClass();
        return new Y(this, intConsumer);
    }

    @Override // j$.util.stream.IntStream
    public final int reduce(int i, IntBinaryOperator intBinaryOperator) {
        intBinaryOperator.getClass();
        return ((Integer) v(new O1(EnumC0148h3.INT_VALUE, intBinaryOperator, i))).intValue();
    }

    @Override // j$.util.stream.IntStream
    public final IntStream skip(long j) {
        if (j >= 0) {
            if (j == 0) {
                return this;
            }
            return AbstractC0219w0.U(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream sorted() {
        return new AbstractC0130e0(this, EnumC0143g3.q | EnumC0143g3.o, 0);
    }

    @Override // j$.util.stream.IntStream
    public final int sum() {
        return reduce(0, new W(2));
    }

    @Override // j$.util.stream.IntStream
    public final C0244z summaryStatistics() {
        return (C0244z) collect(new C0169m(1), new W(0), new W(1));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream takeWhile(IntPredicate intPredicate) {
        int i = h4.a;
        intPredicate.getClass();
        return new X3(this, h4.a, intPredicate);
    }

    @Override // j$.util.stream.IntStream
    public final int[] toArray() {
        return (int[]) AbstractC0219w0.O((E0) z(new C0169m(26))).d();
    }

    @Override // j$.util.stream.BaseStream
    public final BaseStream unordered() {
        if (!H()) {
            return this;
        }
        return new AbstractC0130e0(this, EnumC0143g3.r, 1);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.Y] */
    @Override // j$.util.stream.BaseStream, j$.util.stream.DoubleStream
    /* renamed from: iterator */
    public final Iterator<Integer> iterator2() {
        return Spliterators.g(spliterator());
    }

    @Override // j$.util.stream.AbstractC0114b, j$.util.stream.BaseStream
    public final Spliterator<Integer> spliterator() {
        return V(super.spliterator());
    }

    @Override // j$.util.stream.IntStream
    public final OptionalInt reduce(IntBinaryOperator intBinaryOperator) {
        intBinaryOperator.getClass();
        return (OptionalInt) v(new B1(EnumC0148h3.INT_VALUE, intBinaryOperator, 3));
    }
}
