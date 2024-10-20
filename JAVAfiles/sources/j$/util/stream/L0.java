package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class L0 implements I0 {
    final Object[] a;
    int b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public L0(long j, IntFunction intFunction) {
        if (j < 2147483639) {
            this.a = (Object[]) intFunction.apply((int) j);
            this.b = 0;
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    @Override // j$.util.stream.I0
    public final I0 b(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.I0
    public final long count() {
        return this.b;
    }

    @Override // j$.util.stream.I0
    public final void forEach(Consumer consumer) {
        for (int i = 0; i < this.b; i++) {
            consumer.q(this.a[i]);
        }
    }

    @Override // j$.util.stream.I0
    public final /* synthetic */ I0 h(long j, long j2, IntFunction intFunction) {
        return AbstractC0219w0.w(this, j, j2, intFunction);
    }

    @Override // j$.util.stream.I0
    public final void i(Object[] objArr, int i) {
        System.arraycopy(this.a, 0, objArr, i, this.b);
    }

    @Override // j$.util.stream.I0
    public final Object[] p(IntFunction intFunction) {
        Object[] objArr = this.a;
        if (objArr.length == this.b) {
            return objArr;
        }
        throw new IllegalStateException();
    }

    @Override // j$.util.stream.I0
    public final Spliterator spliterator() {
        return Spliterators.l(this.a, 0, this.b, 1040);
    }

    @Override // j$.util.stream.I0
    public final /* synthetic */ int t() {
        return 0;
    }

    public String toString() {
        Object[] objArr = this.a;
        return String.format("ArrayNode[%d][%s]", Integer.valueOf(objArr.length - this.b), Arrays.toString(objArr));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public L0(Object[] objArr) {
        this.a = objArr;
        this.b = objArr.length;
    }
}
