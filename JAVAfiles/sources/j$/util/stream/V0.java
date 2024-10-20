package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class V0 implements C0 {
    final double[] a;
    int b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public V0(long j) {
        if (j < 2147483639) {
            this.a = new double[(int) j];
            this.b = 0;
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    @Override // j$.util.stream.I0
    public final /* bridge */ /* synthetic */ I0 b(int i) {
        b(i);
        throw null;
    }

    @Override // j$.util.stream.I0
    public final long count() {
        return this.b;
    }

    @Override // j$.util.stream.H0
    public final Object d() {
        double[] dArr = this.a;
        int length = dArr.length;
        int i = this.b;
        if (length != i) {
            return Arrays.copyOf(dArr, i);
        }
        return dArr;
    }

    @Override // j$.util.stream.H0
    public final void e(Object obj) {
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj;
        for (int i = 0; i < this.b; i++) {
            doubleConsumer.accept(this.a[i]);
        }
    }

    @Override // j$.util.stream.I0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC0219w0.q(this, consumer);
    }

    @Override // j$.util.stream.I0
    public final /* synthetic */ I0 h(long j, long j2, IntFunction intFunction) {
        return AbstractC0219w0.t(this, j, j2);
    }

    @Override // j$.util.stream.I0
    public final /* synthetic */ void i(Object[] objArr, int i) {
        AbstractC0219w0.n(this, (Double[]) objArr, i);
    }

    @Override // j$.util.stream.I0
    public final /* synthetic */ Object[] p(IntFunction intFunction) {
        return AbstractC0219w0.m(this, intFunction);
    }

    @Override // j$.util.stream.H0, j$.util.stream.I0
    public final j$.util.f0 spliterator() {
        return Spliterators.i(this.a, 0, this.b);
    }

    @Override // j$.util.stream.I0
    public final /* synthetic */ int t() {
        return 0;
    }

    public String toString() {
        double[] dArr = this.a;
        return String.format("DoubleArrayNode[%d][%s]", Integer.valueOf(dArr.length - this.b), Arrays.toString(dArr));
    }

    @Override // j$.util.stream.H0
    public final void u(int i, Object obj) {
        int i2 = this.b;
        System.arraycopy(this.a, 0, (double[]) obj, i, i2);
    }

    @Override // j$.util.stream.H0, j$.util.stream.I0
    public final H0 b(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.I0
    public final Spliterator spliterator() {
        return Spliterators.i(this.a, 0, this.b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public V0(double[] dArr) {
        this.a = dArr;
        this.b = dArr.length;
    }
}
