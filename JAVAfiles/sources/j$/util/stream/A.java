package j$.util.stream;

import j$.util.C0243y;
import j$.util.OptionalDouble;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Iterator;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.IntFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class A extends AbstractC0114b implements DoubleStream {
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A(AbstractC0114b abstractC0114b, int i, int i2) {
        super(abstractC0114b, i);
        this.l = i2;
    }

    @Override // j$.util.stream.AbstractC0114b
    final I0 B(AbstractC0114b abstractC0114b, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return AbstractC0219w0.F(abstractC0114b, spliterator, z);
    }

    @Override // j$.util.stream.AbstractC0114b
    final boolean D(Spliterator spliterator, InterfaceC0182o2 interfaceC0182o2) {
        DoubleConsumer c0203t;
        boolean n;
        if (spliterator instanceof j$.util.V) {
            j$.util.V v = (j$.util.V) spliterator;
            if (interfaceC0182o2 instanceof DoubleConsumer) {
                c0203t = (DoubleConsumer) interfaceC0182o2;
            } else if (!S3.a) {
                interfaceC0182o2.getClass();
                c0203t = new C0203t(interfaceC0182o2);
            } else {
                S3.a(AbstractC0114b.class, "using DoubleStream.adapt(Sink<Double> s)");
                throw null;
            }
            do {
                n = interfaceC0182o2.n();
                if (n) {
                    break;
                }
            } while (v.tryAdvance(c0203t));
            return n;
        }
        if (S3.a) {
            S3.a(AbstractC0114b.class, "using DoubleStream.adapt(Spliterator<Double> s)");
            throw null;
        }
        throw new UnsupportedOperationException("DoubleStream.adapt(Spliterator<Double> s)");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0114b
    public final EnumC0148h3 E() {
        return EnumC0148h3.DOUBLE_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0114b
    public final A0 J(long j, IntFunction intFunction) {
        return AbstractC0219w0.J(j);
    }

    @Override // j$.util.stream.AbstractC0114b
    final boolean M() {
        switch (this.l) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // j$.util.stream.AbstractC0114b
    final Spliterator Q(AbstractC0114b abstractC0114b, Supplier supplier, boolean z) {
        return new AbstractC0153i3(abstractC0114b, supplier, z);
    }

    @Override // j$.util.stream.DoubleStream
    public final DoubleStream a() {
        int i = h4.a;
        throw null;
    }

    @Override // j$.util.stream.DoubleStream
    public final OptionalDouble average() {
        int i = 13;
        double[] dArr = (double[]) collect(new C0169m(i), new C0159k(12), new C0159k(i));
        if (dArr[2] > 0.0d) {
            Set set = Collectors.a;
            double d = dArr[0] + dArr[1];
            double d2 = dArr[dArr.length - 1];
            if (Double.isNaN(d) && Double.isInfinite(d2)) {
                d = d2;
            }
            return OptionalDouble.b(d / dArr[2]);
        }
        return OptionalDouble.a();
    }

    @Override // j$.util.stream.DoubleStream
    public final DoubleStream b() {
        throw null;
    }

    @Override // j$.util.stream.DoubleStream
    public final Stream boxed() {
        return new C0218w(this, 0, new C0169m(16), 0);
    }

    @Override // j$.util.stream.DoubleStream
    public final DoubleStream c() {
        int i = h4.a;
        throw null;
    }

    @Override // j$.util.stream.DoubleStream
    public final Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        biConsumer.getClass();
        C0208u c0208u = new C0208u(biConsumer, 0);
        supplier.getClass();
        objDoubleConsumer.getClass();
        return v(new D1(EnumC0148h3.DOUBLE_VALUE, c0208u, objDoubleConsumer, supplier, 1));
    }

    @Override // j$.util.stream.DoubleStream
    public final long count() {
        return ((Long) v(new F1(1))).longValue();
    }

    @Override // j$.util.stream.DoubleStream
    public final DoubleStream d(C0109a c0109a) {
        return new C0223x(this, EnumC0143g3.p | EnumC0143g3.n | EnumC0143g3.t, c0109a, 1);
    }

    @Override // j$.util.stream.DoubleStream
    public final DoubleStream distinct() {
        return ((AbstractC0142g2) boxed()).distinct().mapToDouble(new C0169m(17));
    }

    @Override // j$.util.stream.DoubleStream
    public final OptionalDouble findAny() {
        return (OptionalDouble) v(G.d);
    }

    @Override // j$.util.stream.DoubleStream
    public final OptionalDouble findFirst() {
        return (OptionalDouble) v(G.c);
    }

    @Override // j$.util.stream.DoubleStream
    public final void forEach(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        v(new M(doubleConsumer, false));
    }

    @Override // j$.util.stream.DoubleStream
    public final void forEachOrdered(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        v(new M(doubleConsumer, true));
    }

    @Override // j$.util.stream.DoubleStream
    public final boolean g() {
        throw null;
    }

    @Override // j$.util.stream.DoubleStream
    public final LongStream h() {
        throw null;
    }

    @Override // j$.util.stream.DoubleStream
    public final DoubleStream limit(long j) {
        if (j >= 0) {
            return AbstractC0219w0.T(this, 0L, j);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.DoubleStream
    public final boolean m() {
        throw null;
    }

    @Override // j$.util.stream.DoubleStream
    public final DoubleStream map(DoubleUnaryOperator doubleUnaryOperator) {
        doubleUnaryOperator.getClass();
        return new C0223x(this, EnumC0143g3.p | EnumC0143g3.n, doubleUnaryOperator, 0);
    }

    @Override // j$.util.stream.DoubleStream
    public final Stream mapToObj(DoubleFunction doubleFunction) {
        doubleFunction.getClass();
        return new C0218w(this, EnumC0143g3.p | EnumC0143g3.n, doubleFunction, 0);
    }

    @Override // j$.util.stream.DoubleStream
    public final OptionalDouble max() {
        return reduce(new C0169m(19));
    }

    @Override // j$.util.stream.DoubleStream
    public final OptionalDouble min() {
        return reduce(new C0169m(12));
    }

    @Override // j$.util.stream.AbstractC0114b, j$.util.stream.BaseStream, j$.util.stream.DoubleStream
    public final /* bridge */ /* synthetic */ DoubleStream parallel() {
        switch (this.l) {
            case 0:
                parallel();
                return this;
            default:
                parallel();
                return this;
        }
    }

    @Override // j$.util.stream.DoubleStream
    public final DoubleStream peek(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        return new C0223x(this, doubleConsumer);
    }

    @Override // j$.util.stream.DoubleStream
    public final IntStream q() {
        throw null;
    }

    @Override // j$.util.stream.DoubleStream
    public final double reduce(double d, DoubleBinaryOperator doubleBinaryOperator) {
        doubleBinaryOperator.getClass();
        return ((Double) v(new H1(EnumC0148h3.DOUBLE_VALUE, doubleBinaryOperator, d))).doubleValue();
    }

    @Override // j$.util.stream.AbstractC0114b, j$.util.stream.BaseStream, j$.util.stream.DoubleStream
    public final /* bridge */ /* synthetic */ DoubleStream sequential() {
        switch (this.l) {
            case 0:
                sequential();
                return this;
            default:
                sequential();
                return this;
        }
    }

    @Override // j$.util.stream.DoubleStream
    public final DoubleStream skip(long j) {
        if (j >= 0) {
            if (j == 0) {
                return this;
            }
            return AbstractC0219w0.T(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.DoubleStream
    public final DoubleStream sorted() {
        return new A(this, EnumC0143g3.q | EnumC0143g3.o, 0);
    }

    @Override // j$.util.stream.DoubleStream
    public final double sum() {
        double[] dArr = (double[]) collect(new C0169m(20), new C0159k(14), new C0159k(11));
        Set set = Collectors.a;
        double d = dArr[0] + dArr[1];
        double d2 = dArr[dArr.length - 1];
        if (Double.isNaN(d) && Double.isInfinite(d2)) {
            return d2;
        }
        return d;
    }

    @Override // j$.util.stream.DoubleStream
    public final C0243y summaryStatistics() {
        return (C0243y) collect(new C0159k(27), new C0169m(14), new C0169m(15));
    }

    @Override // j$.util.stream.DoubleStream
    public final double[] toArray() {
        return (double[]) AbstractC0219w0.N((C0) z(new C0169m(18))).d();
    }

    @Override // j$.util.stream.BaseStream
    public final BaseStream unordered() {
        if (!H()) {
            return this;
        }
        return new C0233z(this, EnumC0143g3.r, 0);
    }

    @Override // j$.util.stream.DoubleStream
    public final boolean x() {
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.V] */
    @Override // j$.util.stream.BaseStream, j$.util.stream.DoubleStream
    /* renamed from: iterator */
    public final Iterator<Double> iterator2() {
        return Spliterators.f(spliterator());
    }

    @Override // j$.util.stream.AbstractC0114b, j$.util.stream.BaseStream
    public final Spliterator<Double> spliterator() {
        Spliterator spliterator = super.spliterator();
        if (spliterator instanceof j$.util.V) {
            return (j$.util.V) spliterator;
        }
        if (S3.a) {
            S3.a(AbstractC0114b.class, "using DoubleStream.adapt(Spliterator<Double> s)");
            throw null;
        }
        throw new UnsupportedOperationException("DoubleStream.adapt(Spliterator<Double> s)");
    }

    @Override // j$.util.stream.DoubleStream
    public final OptionalDouble reduce(DoubleBinaryOperator doubleBinaryOperator) {
        doubleBinaryOperator.getClass();
        return (OptionalDouble) v(new B1(EnumC0148h3.DOUBLE_VALUE, doubleBinaryOperator, 1));
    }
}
