package j$.util.stream;

import j$.util.OptionalDouble;
import j$.util.OptionalLong;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.IntFunction;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.m0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC0170m0 extends AbstractC0114b implements LongStream {
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractC0170m0(AbstractC0114b abstractC0114b, int i, int i2) {
        super(abstractC0114b, i);
        this.l = i2;
    }

    @Override // j$.util.stream.AbstractC0114b
    final I0 B(AbstractC0114b abstractC0114b, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return AbstractC0219w0.H(abstractC0114b, spliterator, z);
    }

    @Override // j$.util.stream.AbstractC0114b
    final boolean D(Spliterator spliterator, InterfaceC0182o2 interfaceC0182o2) {
        LongConsumer c0145h0;
        boolean n;
        if (spliterator instanceof j$.util.c0) {
            j$.util.c0 c0Var = (j$.util.c0) spliterator;
            if (interfaceC0182o2 instanceof LongConsumer) {
                c0145h0 = (LongConsumer) interfaceC0182o2;
            } else if (!S3.a) {
                interfaceC0182o2.getClass();
                c0145h0 = new C0145h0(interfaceC0182o2);
            } else {
                S3.a(AbstractC0114b.class, "using LongStream.adapt(Sink<Long> s)");
                throw null;
            }
            do {
                n = interfaceC0182o2.n();
                if (n) {
                    break;
                }
            } while (c0Var.tryAdvance(c0145h0));
            return n;
        }
        if (S3.a) {
            S3.a(AbstractC0114b.class, "using LongStream.adapt(Spliterator<Long> s)");
            throw null;
        }
        throw new UnsupportedOperationException("LongStream.adapt(Spliterator<Long> s)");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0114b
    public final EnumC0148h3 E() {
        return EnumC0148h3.LONG_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0114b
    public final A0 J(long j, IntFunction intFunction) {
        return AbstractC0219w0.S(j);
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

    @Override // j$.util.stream.LongStream
    public final LongStream a() {
        int i = h4.a;
        throw null;
    }

    @Override // j$.util.stream.LongStream
    public final DoubleStream asDoubleStream() {
        return new C0233z(this, EnumC0143g3.n, 2);
    }

    @Override // j$.util.stream.LongStream
    public final OptionalDouble average() {
        long j = ((long[]) collect(new W(13), new W(14), new W(15)))[0];
        if (j > 0) {
            return OptionalDouble.b(r0[1] / j);
        }
        return OptionalDouble.a();
    }

    @Override // j$.util.stream.LongStream
    public final LongStream b() {
        throw null;
    }

    @Override // j$.util.stream.LongStream
    public final Stream boxed() {
        return new C0218w(this, 0, new W(12), 2);
    }

    @Override // j$.util.stream.LongStream
    public final LongStream c() {
        int i = h4.a;
        throw null;
    }

    @Override // j$.util.stream.LongStream
    public final Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        biConsumer.getClass();
        C0208u c0208u = new C0208u(biConsumer, 2);
        supplier.getClass();
        objLongConsumer.getClass();
        return v(new D1(EnumC0148h3.LONG_VALUE, c0208u, objLongConsumer, supplier, 0));
    }

    @Override // j$.util.stream.LongStream
    public final long count() {
        return ((Long) v(new F1(0))).longValue();
    }

    @Override // j$.util.stream.LongStream
    public final LongStream d(C0109a c0109a) {
        return new C0165l0(this, EnumC0143g3.p | EnumC0143g3.n | EnumC0143g3.t, c0109a, 0);
    }

    @Override // j$.util.stream.LongStream
    public final LongStream distinct() {
        return ((AbstractC0142g2) boxed()).distinct().mapToLong(new W(9));
    }

    @Override // j$.util.stream.LongStream
    public final boolean f() {
        throw null;
    }

    @Override // j$.util.stream.LongStream
    public final OptionalLong findAny() {
        return (OptionalLong) v(I.d);
    }

    @Override // j$.util.stream.LongStream
    public final OptionalLong findFirst() {
        return (OptionalLong) v(I.c);
    }

    @Override // j$.util.stream.LongStream
    public final void forEach(LongConsumer longConsumer) {
        longConsumer.getClass();
        v(new O(longConsumer, false));
    }

    @Override // j$.util.stream.LongStream
    public final void forEachOrdered(LongConsumer longConsumer) {
        longConsumer.getClass();
        v(new O(longConsumer, true));
    }

    @Override // j$.util.stream.LongStream
    public final DoubleStream j() {
        throw null;
    }

    @Override // j$.util.stream.LongStream
    public final LongStream l() {
        throw null;
    }

    @Override // j$.util.stream.LongStream
    public final LongStream limit(long j) {
        if (j >= 0) {
            return AbstractC0219w0.W(this, 0L, j);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.LongStream
    public final Stream mapToObj(LongFunction longFunction) {
        longFunction.getClass();
        return new C0218w(this, EnumC0143g3.p | EnumC0143g3.n, longFunction, 2);
    }

    @Override // j$.util.stream.LongStream
    public final OptionalLong max() {
        return reduce(new W(16));
    }

    @Override // j$.util.stream.LongStream
    public final OptionalLong min() {
        return reduce(new W(8));
    }

    @Override // j$.util.stream.LongStream
    public final boolean p() {
        throw null;
    }

    @Override // j$.util.stream.AbstractC0114b, j$.util.stream.BaseStream, j$.util.stream.DoubleStream
    public final /* bridge */ /* synthetic */ LongStream parallel() {
        switch (this.l) {
            case 0:
                parallel();
                return this;
            default:
                parallel();
                return this;
        }
    }

    @Override // j$.util.stream.LongStream
    public final LongStream peek(LongConsumer longConsumer) {
        longConsumer.getClass();
        return new C0165l0(this, longConsumer);
    }

    @Override // j$.util.stream.LongStream
    public final long reduce(long j, LongBinaryOperator longBinaryOperator) {
        longBinaryOperator.getClass();
        return ((Long) v(new C0235z1(EnumC0148h3.LONG_VALUE, longBinaryOperator, j))).longValue();
    }

    @Override // j$.util.stream.AbstractC0114b, j$.util.stream.BaseStream, j$.util.stream.DoubleStream
    public final /* bridge */ /* synthetic */ LongStream sequential() {
        switch (this.l) {
            case 0:
                sequential();
                return this;
            default:
                sequential();
                return this;
        }
    }

    @Override // j$.util.stream.LongStream
    public final LongStream skip(long j) {
        if (j >= 0) {
            if (j == 0) {
                return this;
            }
            return AbstractC0219w0.W(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.LongStream
    public final LongStream sorted() {
        return new AbstractC0170m0(this, EnumC0143g3.q | EnumC0143g3.o, 0);
    }

    @Override // j$.util.stream.LongStream
    public final long sum() {
        return reduce(0L, new W(17));
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.B summaryStatistics() {
        return (j$.util.B) collect(new C0169m(4), new W(7), new W(10));
    }

    @Override // j$.util.stream.LongStream
    public final boolean t() {
        throw null;
    }

    @Override // j$.util.stream.LongStream
    public final long[] toArray() {
        return (long[]) AbstractC0219w0.P((G0) z(new W(11))).d();
    }

    @Override // j$.util.stream.BaseStream
    public final BaseStream unordered() {
        if (!H()) {
            return this;
        }
        return new C0110a0(this, EnumC0143g3.r, 1);
    }

    @Override // j$.util.stream.LongStream
    public final IntStream w() {
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.c0] */
    @Override // j$.util.stream.BaseStream, j$.util.stream.DoubleStream
    /* renamed from: iterator, reason: merged with bridge method [inline-methods] */
    public final Iterator<Long> iterator2() {
        return Spliterators.h(spliterator());
    }

    @Override // j$.util.stream.AbstractC0114b, j$.util.stream.BaseStream
    public final Spliterator<Long> spliterator() {
        Spliterator spliterator = super.spliterator();
        if (spliterator instanceof j$.util.c0) {
            return (j$.util.c0) spliterator;
        }
        if (S3.a) {
            S3.a(AbstractC0114b.class, "using LongStream.adapt(Spliterator<Long> s)");
            throw null;
        }
        throw new UnsupportedOperationException("LongStream.adapt(Spliterator<Long> s)");
    }

    @Override // j$.util.stream.LongStream
    public final OptionalLong reduce(LongBinaryOperator longBinaryOperator) {
        longBinaryOperator.getClass();
        return (OptionalLong) v(new B1(EnumC0148h3.LONG_VALUE, longBinaryOperator, 0));
    }
}
