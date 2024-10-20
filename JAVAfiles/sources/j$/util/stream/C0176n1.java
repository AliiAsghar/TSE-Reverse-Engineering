package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.n1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C0176n1 implements G0 {
    final long[] a;
    int b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0176n1(long j) {
        if (j < 2147483639) {
            this.a = new long[(int) j];
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
        long[] jArr = this.a;
        int length = jArr.length;
        int i = this.b;
        if (length != i) {
            return Arrays.copyOf(jArr, i);
        }
        return jArr;
    }

    @Override // j$.util.stream.H0
    public final void e(Object obj) {
        LongConsumer longConsumer = (LongConsumer) obj;
        for (int i = 0; i < this.b; i++) {
            longConsumer.accept(this.a[i]);
        }
    }

    @Override // j$.util.stream.I0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC0219w0.s(this, consumer);
    }

    @Override // j$.util.stream.I0
    public final /* synthetic */ I0 h(long j, long j2, IntFunction intFunction) {
        return AbstractC0219w0.v(this, j, j2);
    }

    @Override // j$.util.stream.I0
    public final /* synthetic */ void i(Object[] objArr, int i) {
        AbstractC0219w0.p(this, (Long[]) objArr, i);
    }

    @Override // j$.util.stream.I0
    public final /* synthetic */ Object[] p(IntFunction intFunction) {
        return AbstractC0219w0.m(this, intFunction);
    }

    @Override // j$.util.stream.H0, j$.util.stream.I0
    public final j$.util.f0 spliterator() {
        return Spliterators.k(this.a, 0, this.b);
    }

    @Override // j$.util.stream.I0
    public final /* synthetic */ int t() {
        return 0;
    }

    public String toString() {
        long[] jArr = this.a;
        return String.format("LongArrayNode[%d][%s]", Integer.valueOf(jArr.length - this.b), Arrays.toString(jArr));
    }

    @Override // j$.util.stream.H0
    public final void u(int i, Object obj) {
        int i2 = this.b;
        System.arraycopy(this.a, 0, (long[]) obj, i, i2);
    }

    @Override // j$.util.stream.H0, j$.util.stream.I0
    public final H0 b(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.I0
    public final Spliterator spliterator() {
        return Spliterators.k(this.a, 0, this.b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0176n1(long[] jArr) {
        this.a = jArr;
        this.b = jArr.length;
    }
}
