package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.e1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C0131e1 implements E0 {
    final int[] a;
    int b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0131e1(long j) {
        if (j < 2147483639) {
            this.a = new int[(int) j];
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
        int[] iArr = this.a;
        int length = iArr.length;
        int i = this.b;
        if (length != i) {
            return Arrays.copyOf(iArr, i);
        }
        return iArr;
    }

    @Override // j$.util.stream.H0
    public final void e(Object obj) {
        IntConsumer intConsumer = (IntConsumer) obj;
        for (int i = 0; i < this.b; i++) {
            intConsumer.accept(this.a[i]);
        }
    }

    @Override // j$.util.stream.I0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC0219w0.r(this, consumer);
    }

    @Override // j$.util.stream.I0
    public final /* synthetic */ I0 h(long j, long j2, IntFunction intFunction) {
        return AbstractC0219w0.u(this, j, j2);
    }

    @Override // j$.util.stream.I0
    public final /* synthetic */ void i(Object[] objArr, int i) {
        AbstractC0219w0.o(this, (Integer[]) objArr, i);
    }

    @Override // j$.util.stream.I0
    public final /* synthetic */ Object[] p(IntFunction intFunction) {
        return AbstractC0219w0.m(this, intFunction);
    }

    @Override // j$.util.stream.H0, j$.util.stream.I0
    public final j$.util.f0 spliterator() {
        return Spliterators.j(this.a, 0, this.b);
    }

    @Override // j$.util.stream.I0
    public final /* synthetic */ int t() {
        return 0;
    }

    public String toString() {
        int[] iArr = this.a;
        return String.format("IntArrayNode[%d][%s]", Integer.valueOf(iArr.length - this.b), Arrays.toString(iArr));
    }

    @Override // j$.util.stream.H0
    public final void u(int i, Object obj) {
        int i2 = this.b;
        System.arraycopy(this.a, 0, (int[]) obj, i, i2);
    }

    @Override // j$.util.stream.H0, j$.util.stream.I0
    public final H0 b(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.I0
    public final Spliterator spliterator() {
        return Spliterators.j(this.a, 0, this.b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0131e1(int[] iArr) {
        this.a = iArr;
        this.b = iArr.length;
    }
}
