package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.LongConsumer;
import java.util.function.Predicate;

/* renamed from: j$.util.stream.w0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC0219w0 implements P3 {
    private static final C0116b1 a = new Object();
    private static final E0 b = new Object();
    private static final G0 c = new Object();
    private static final C0 d = new Object();
    private static final int[] e = new int[0];
    private static final long[] f = new long[0];
    private static final double[] g = new double[0];

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long A(long j, long j2, long j3) {
        if (j < 0) {
            return -1L;
        }
        return Math.max(-1L, Math.min(j - j2, j3));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long B(long j, long j2) {
        long j3 = j2 >= 0 ? j + j2 : Long.MAX_VALUE;
        if (j3 >= 0) {
            return j3;
        }
        return Long.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Spliterator C(EnumC0148h3 enumC0148h3, Spliterator spliterator, long j, long j2) {
        long j3;
        long j4;
        if (j2 >= 0) {
            j3 = j + j2;
        } else {
            j3 = Long.MAX_VALUE;
        }
        if (j3 >= 0) {
            j4 = j3;
        } else {
            j4 = Long.MAX_VALUE;
        }
        int i = AbstractC0226x2.a[enumC0148h3.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return new A3((j$.util.V) spliterator, j, j4);
                    }
                    throw new IllegalStateException("Unknown shape ".concat(String.valueOf(enumC0148h3)));
                }
                return new A3((j$.util.c0) spliterator, j, j4);
            }
            return new A3((j$.util.Y) spliterator, j, j4);
        }
        return new B3(spliterator, j, j4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r0v1, types: [j$.util.stream.Y2, j$.util.stream.A0] */
    /* JADX WARN: Type inference failed for: r0v3, types: [j$.util.stream.L0, j$.util.stream.A0] */
    public static A0 D(long j, IntFunction intFunction) {
        if (j >= 0 && j < 2147483639) {
            return new L0(j, intFunction);
        }
        return new Y2();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.function.LongFunction, java.lang.Object, j$.util.stream.O0] */
    public static I0 E(AbstractC0114b abstractC0114b, Spliterator spliterator, boolean z, IntFunction intFunction) {
        long C = abstractC0114b.C(spliterator);
        if (C >= 0 && spliterator.hasCharacteristics(16384)) {
            if (C < 2147483639) {
                Object[] objArr = (Object[]) intFunction.apply((int) C);
                new C0205t1(spliterator, abstractC0114b, objArr).invoke();
                return new L0(objArr);
            }
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        ?? obj = new Object();
        obj.a = intFunction;
        I0 i0 = (I0) new P0(abstractC0114b, spliterator, obj, new C0159k(25)).invoke();
        if (z) {
            return M(i0, intFunction);
        }
        return i0;
    }

    public static C0 F(AbstractC0114b abstractC0114b, Spliterator spliterator, boolean z) {
        long C = abstractC0114b.C(spliterator);
        if (C >= 0 && spliterator.hasCharacteristics(16384)) {
            if (C < 2147483639) {
                double[] dArr = new double[(int) C];
                new C0191q1(spliterator, abstractC0114b, dArr).invoke();
                return new V0(dArr);
            }
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        C0 c0 = (C0) new P0(abstractC0114b, spliterator, new C0159k(19), new C0159k(20)).invoke();
        if (z) {
            return N(c0);
        }
        return c0;
    }

    public static E0 G(AbstractC0114b abstractC0114b, Spliterator spliterator, boolean z) {
        long C = abstractC0114b.C(spliterator);
        if (C >= 0 && spliterator.hasCharacteristics(16384)) {
            if (C < 2147483639) {
                int[] iArr = new int[(int) C];
                new C0195r1(spliterator, abstractC0114b, iArr).invoke();
                return new C0131e1(iArr);
            }
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        E0 e0 = (E0) new P0(abstractC0114b, spliterator, new C0159k(21), new C0159k(22)).invoke();
        if (z) {
            return O(e0);
        }
        return e0;
    }

    public static G0 H(AbstractC0114b abstractC0114b, Spliterator spliterator, boolean z) {
        long C = abstractC0114b.C(spliterator);
        if (C >= 0 && spliterator.hasCharacteristics(16384)) {
            if (C < 2147483639) {
                long[] jArr = new long[(int) C];
                new C0200s1(spliterator, abstractC0114b, jArr).invoke();
                return new C0176n1(jArr);
            }
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        G0 g0 = (G0) new P0(abstractC0114b, spliterator, new C0159k(23), new C0159k(24)).invoke();
        if (z) {
            return P(g0);
        }
        return g0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static K0 I(EnumC0148h3 enumC0148h3, I0 i0, I0 i02) {
        int i = J0.a[enumC0148h3.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return new K0((C0) i0, (C0) i02);
                    }
                    throw new IllegalStateException("Unknown shape ".concat(String.valueOf(enumC0148h3)));
                }
                return new K0((G0) i0, (G0) i02);
            }
            return new K0((E0) i0, (E0) i02);
        }
        return new K0(i0, i02);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r0v1, types: [j$.util.stream.x0, j$.util.stream.X2] */
    /* JADX WARN: Type inference failed for: r0v3, types: [j$.util.stream.x0, j$.util.stream.V0] */
    public static InterfaceC0224x0 J(long j) {
        if (j >= 0 && j < 2147483639) {
            return new V0(j);
        }
        return new X2();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AbstractC0121c1 K(EnumC0148h3 enumC0148h3) {
        int i = J0.a[enumC0148h3.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return (AbstractC0121c1) d;
                    }
                    throw new IllegalStateException("Unknown shape ".concat(String.valueOf(enumC0148h3)));
                }
                return (AbstractC0121c1) c;
            }
            return (AbstractC0121c1) b;
        }
        return a;
    }

    private static int L(long j) {
        int i;
        int i2 = EnumC0143g3.t;
        if (j != -1) {
            i = EnumC0143g3.u;
        } else {
            i = 0;
        }
        return i | i2;
    }

    public static I0 M(I0 i0, IntFunction intFunction) {
        if (i0.t() > 0) {
            long count = i0.count();
            if (count < 2147483639) {
                Object[] objArr = (Object[]) intFunction.apply((int) count);
                new C0225x1(i0, objArr, 1).invoke();
                return new L0(objArr);
            }
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        return i0;
    }

    public static C0 N(C0 c0) {
        if (c0.t() > 0) {
            long count = c0.count();
            if (count < 2147483639) {
                double[] dArr = new double[(int) count];
                new C0225x1(c0, dArr, 0).invoke();
                return new V0(dArr);
            }
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        return c0;
    }

    public static E0 O(E0 e0) {
        if (e0.t() > 0) {
            long count = e0.count();
            if (count < 2147483639) {
                int[] iArr = new int[(int) count];
                new C0225x1(e0, iArr, 0).invoke();
                return new C0131e1(iArr);
            }
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        return e0;
    }

    public static G0 P(G0 g0) {
        if (g0.t() > 0) {
            long count = g0.count();
            if (count < 2147483639) {
                long[] jArr = new long[(int) count];
                new C0225x1(g0, jArr, 0).invoke();
                return new C0176n1(jArr);
            }
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        return g0;
    }

    public static C0179o Q(Function function) {
        C0179o c0179o = new C0179o();
        c0179o.b = function;
        return c0179o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r0v1, types: [j$.util.stream.y0, j$.util.stream.X2] */
    /* JADX WARN: Type inference failed for: r0v3, types: [j$.util.stream.y0, j$.util.stream.e1] */
    public static InterfaceC0229y0 R(long j) {
        if (j >= 0 && j < 2147483639) {
            return new C0131e1(j);
        }
        return new X2();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r0v1, types: [j$.util.stream.z0, j$.util.stream.X2] */
    /* JADX WARN: Type inference failed for: r0v3, types: [j$.util.stream.z0, j$.util.stream.n1] */
    public static InterfaceC0234z0 S(long j) {
        if (j >= 0 && j < 2147483639) {
            return new C0176n1(j);
        }
        return new X2();
    }

    public static DoubleStream T(A a2, long j, long j2) {
        if (j >= 0) {
            return new C0221w2(a2, L(j2), j, j2);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j);
    }

    public static IntStream U(AbstractC0135f0 abstractC0135f0, long j, long j2) {
        if (j >= 0) {
            return new C0201s2(abstractC0135f0, L(j2), j, j2);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j);
    }

    public static C0209u0 V(EnumC0204t0 enumC0204t0, IntPredicate intPredicate) {
        intPredicate.getClass();
        enumC0204t0.getClass();
        return new C0209u0(EnumC0148h3.INT_VALUE, enumC0204t0, new C0164l(2, enumC0204t0, intPredicate));
    }

    public static LongStream W(AbstractC0170m0 abstractC0170m0, long j, long j2) {
        if (j >= 0) {
            return new C0211u2(abstractC0170m0, L(j2), j, j2);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j);
    }

    public static C0209u0 X(EnumC0204t0 enumC0204t0, Predicate predicate) {
        predicate.getClass();
        enumC0204t0.getClass();
        return new C0209u0(EnumC0148h3.REFERENCE, enumC0204t0, new C0164l(3, enumC0204t0, predicate));
    }

    public static Stream Y(AbstractC0142g2 abstractC0142g2, long j, long j2) {
        if (j >= 0) {
            return new C0192q2(abstractC0142g2, L(j2), j, j2);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j);
    }

    public static void a() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static void e(InterfaceC0167l2 interfaceC0167l2, Double d2) {
        if (!S3.a) {
            interfaceC0167l2.accept(d2.doubleValue());
        } else {
            S3.a(interfaceC0167l2.getClass(), "{0} calling Sink.OfDouble.accept(Double)");
            throw null;
        }
    }

    public static void g(InterfaceC0172m2 interfaceC0172m2, Integer num) {
        if (!S3.a) {
            interfaceC0172m2.accept(num.intValue());
        } else {
            S3.a(interfaceC0172m2.getClass(), "{0} calling Sink.OfInt.accept(Integer)");
            throw null;
        }
    }

    public static void i(InterfaceC0177n2 interfaceC0177n2, Long l) {
        if (!S3.a) {
            interfaceC0177n2.accept(l.longValue());
        } else {
            S3.a(interfaceC0177n2.getClass(), "{0} calling Sink.OfLong.accept(Long)");
            throw null;
        }
    }

    public static void k() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static void l() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static Object[] m(H0 h0, IntFunction intFunction) {
        if (!S3.a) {
            if (h0.count() < 2147483639) {
                Object[] objArr = (Object[]) intFunction.apply((int) h0.count());
                h0.i(objArr, 0);
                return objArr;
            }
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        S3.a(h0.getClass(), "{0} calling Node.OfPrimitive.asArray");
        throw null;
    }

    public static void n(C0 c0, Double[] dArr, int i) {
        if (!S3.a) {
            double[] dArr2 = (double[]) c0.d();
            for (int i2 = 0; i2 < dArr2.length; i2++) {
                dArr[i + i2] = Double.valueOf(dArr2[i2]);
            }
            return;
        }
        S3.a(c0.getClass(), "{0} calling Node.OfDouble.copyInto(Double[], int)");
        throw null;
    }

    public static void o(E0 e0, Integer[] numArr, int i) {
        if (!S3.a) {
            int[] iArr = (int[]) e0.d();
            for (int i2 = 0; i2 < iArr.length; i2++) {
                numArr[i + i2] = Integer.valueOf(iArr[i2]);
            }
            return;
        }
        S3.a(e0.getClass(), "{0} calling Node.OfInt.copyInto(Integer[], int)");
        throw null;
    }

    public static void p(G0 g0, Long[] lArr, int i) {
        if (!S3.a) {
            long[] jArr = (long[]) g0.d();
            for (int i2 = 0; i2 < jArr.length; i2++) {
                lArr[i + i2] = Long.valueOf(jArr[i2]);
            }
            return;
        }
        S3.a(g0.getClass(), "{0} calling Node.OfInt.copyInto(Long[], int)");
        throw null;
    }

    public static void q(C0 c0, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            c0.e((DoubleConsumer) consumer);
        } else if (!S3.a) {
            ((j$.util.V) c0.spliterator()).forEachRemaining(consumer);
        } else {
            S3.a(c0.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
            throw null;
        }
    }

    public static void r(E0 e0, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            e0.e((IntConsumer) consumer);
        } else if (!S3.a) {
            ((j$.util.Y) e0.spliterator()).forEachRemaining(consumer);
        } else {
            S3.a(e0.getClass(), "{0} calling Node.OfInt.forEachRemaining(Consumer)");
            throw null;
        }
    }

    public static void s(G0 g0, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            g0.e((LongConsumer) consumer);
        } else if (!S3.a) {
            ((j$.util.c0) g0.spliterator()).forEachRemaining(consumer);
        } else {
            S3.a(g0.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
            throw null;
        }
    }

    public static C0 t(C0 c0, long j, long j2) {
        if (j == 0 && j2 == c0.count()) {
            return c0;
        }
        long j3 = j2 - j;
        j$.util.V v = (j$.util.V) c0.spliterator();
        InterfaceC0224x0 J = J(j3);
        J.l(j3);
        for (int i = 0; i < j && v.tryAdvance((DoubleConsumer) new B0(0)); i++) {
        }
        if (j2 == c0.count()) {
            v.forEachRemaining((DoubleConsumer) J);
        } else {
            for (int i2 = 0; i2 < j3 && v.tryAdvance((DoubleConsumer) J); i2++) {
            }
        }
        J.k();
        return J.a();
    }

    public static E0 u(E0 e0, long j, long j2) {
        if (j == 0 && j2 == e0.count()) {
            return e0;
        }
        long j3 = j2 - j;
        j$.util.Y y = (j$.util.Y) e0.spliterator();
        InterfaceC0229y0 R = R(j3);
        R.l(j3);
        for (int i = 0; i < j && y.tryAdvance((IntConsumer) new D0(0)); i++) {
        }
        if (j2 == e0.count()) {
            y.forEachRemaining((IntConsumer) R);
        } else {
            for (int i2 = 0; i2 < j3 && y.tryAdvance((IntConsumer) R); i2++) {
            }
        }
        R.k();
        return R.a();
    }

    public static G0 v(G0 g0, long j, long j2) {
        if (j == 0 && j2 == g0.count()) {
            return g0;
        }
        long j3 = j2 - j;
        j$.util.c0 c0Var = (j$.util.c0) g0.spliterator();
        InterfaceC0234z0 S = S(j3);
        S.l(j3);
        for (int i = 0; i < j && c0Var.tryAdvance((LongConsumer) new F0(0)); i++) {
        }
        if (j2 == g0.count()) {
            c0Var.forEachRemaining((LongConsumer) S);
        } else {
            for (int i2 = 0; i2 < j3 && c0Var.tryAdvance((LongConsumer) S); i2++) {
            }
        }
        S.k();
        return S.a();
    }

    public static I0 w(I0 i0, long j, long j2, IntFunction intFunction) {
        if (j == 0 && j2 == i0.count()) {
            return i0;
        }
        Spliterator spliterator = i0.spliterator();
        long j3 = j2 - j;
        A0 D = D(j3, intFunction);
        D.l(j3);
        for (int i = 0; i < j && spliterator.tryAdvance(new W(18)); i++) {
        }
        if (j2 == i0.count()) {
            spliterator.forEachRemaining(D);
        } else {
            for (int i2 = 0; i2 < j3 && spliterator.tryAdvance(D); i2++) {
            }
        }
        D.k();
        return D.a();
    }

    public abstract T1 Z();

    @Override // j$.util.stream.P3
    public Object b(AbstractC0114b abstractC0114b, Spliterator spliterator) {
        T1 Z = Z();
        abstractC0114b.o(spliterator, abstractC0114b.S(Z));
        return Z.get();
    }

    @Override // j$.util.stream.P3
    public Object c(AbstractC0114b abstractC0114b, Spliterator spliterator) {
        return ((T1) new C0112a2(this, abstractC0114b, spliterator).invoke()).get();
    }

    @Override // j$.util.stream.P3
    public /* synthetic */ int d() {
        return 0;
    }
}
