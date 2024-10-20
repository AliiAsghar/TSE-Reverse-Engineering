package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class U0 extends K0 {
    @Override // j$.util.stream.I0
    public final void forEach(Consumer consumer) {
        this.a.forEach(consumer);
        this.b.forEach(consumer);
    }

    @Override // j$.util.stream.I0
    public final I0 h(long j, long j2, IntFunction intFunction) {
        if (j == 0 && j2 == count()) {
            return this;
        }
        long count = this.a.count();
        if (j >= count) {
            return this.b.h(j - count, j2 - count, intFunction);
        }
        if (j2 <= count) {
            return this.a.h(j, j2, intFunction);
        }
        return AbstractC0219w0.I(EnumC0148h3.REFERENCE, this.a.h(j, count, intFunction), this.b.h(0L, j2 - count, intFunction));
    }

    @Override // j$.util.stream.I0
    public final void i(Object[] objArr, int i) {
        objArr.getClass();
        I0 i0 = this.a;
        i0.i(objArr, i);
        this.b.i(objArr, i + ((int) i0.count()));
    }

    @Override // j$.util.stream.I0
    public final Object[] p(IntFunction intFunction) {
        long count = count();
        if (count < 2147483639) {
            Object[] objArr = (Object[]) intFunction.apply((int) count);
            i(objArr, 0);
            return objArr;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    @Override // j$.util.stream.I0
    public final Spliterator spliterator() {
        return new AbstractC0171m1(this);
    }

    public final String toString() {
        if (count() < 32) {
            return String.format("ConcNode[%s.%s]", this.a, this.b);
        }
        return String.format("ConcNode[size=%d]", Long.valueOf(count()));
    }
}
