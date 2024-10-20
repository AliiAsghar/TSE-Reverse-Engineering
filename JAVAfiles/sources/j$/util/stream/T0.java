package j$.util.stream;

import java.util.function.IntFunction;

/* loaded from: classes5.dex */
abstract class T0 extends K0 implements H0 {
    @Override // j$.util.stream.H0
    public final Object d() {
        long count = count();
        if (count < 2147483639) {
            Object c = c((int) count);
            u(0, c);
            return c;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    @Override // j$.util.stream.H0
    public final void e(Object obj) {
        ((H0) this.a).e(obj);
        ((H0) this.b).e(obj);
    }

    @Override // j$.util.stream.I0
    public final /* synthetic */ Object[] p(IntFunction intFunction) {
        return AbstractC0219w0.m(this, intFunction);
    }

    public final String toString() {
        if (count() < 32) {
            return String.format("%s[%s.%s]", getClass().getName(), this.a, this.b);
        }
        return String.format("%s[size=%d]", getClass().getName(), Long.valueOf(count()));
    }

    @Override // j$.util.stream.H0
    public final void u(int i, Object obj) {
        I0 i0 = this.a;
        ((H0) i0).u(i, obj);
        ((H0) this.b).u(i + ((int) ((H0) i0).count()), obj);
    }
}
