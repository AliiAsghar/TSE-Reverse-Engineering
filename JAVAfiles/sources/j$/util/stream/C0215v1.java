package j$.util.stream;

import java.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.v1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0215v1 extends Y2 implements I0, A0 {
    @Override // j$.util.stream.A0
    public final I0 a() {
        return this;
    }

    @Override // j$.util.stream.InterfaceC0182o2
    public final /* synthetic */ void accept(double d) {
        AbstractC0219w0.a();
        throw null;
    }

    @Override // j$.util.stream.I0
    public final I0 b(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.I0
    public final /* synthetic */ I0 h(long j, long j2, IntFunction intFunction) {
        return AbstractC0219w0.w(this, j, j2, intFunction);
    }

    @Override // j$.util.stream.I0
    public final void i(Object[] objArr, int i) {
        long j = i;
        long count = count() + j;
        if (count <= objArr.length && count >= j) {
            if (this.c == 0) {
                System.arraycopy(this.e, 0, objArr, i, this.b);
                return;
            }
            for (int i2 = 0; i2 < this.c; i2++) {
                Object[] objArr2 = this.f[i2];
                System.arraycopy(objArr2, 0, objArr, i, objArr2.length);
                i += this.f[i2].length;
            }
            int i3 = this.b;
            if (i3 > 0) {
                System.arraycopy(this.e, 0, objArr, i, i3);
                return;
            }
            return;
        }
        throw new IndexOutOfBoundsException("does not fit");
    }

    @Override // j$.util.stream.InterfaceC0182o2
    public final void k() {
    }

    @Override // j$.util.stream.InterfaceC0182o2
    public final void l(long j) {
        clear();
        w(j);
    }

    @Override // j$.util.stream.InterfaceC0182o2
    public final /* synthetic */ boolean n() {
        return false;
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
    public final /* synthetic */ int t() {
        return 0;
    }

    @Override // j$.util.stream.InterfaceC0182o2
    public final /* synthetic */ void accept(int i) {
        AbstractC0219w0.k();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0182o2, j$.util.stream.InterfaceC0177n2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j) {
        AbstractC0219w0.l();
        throw null;
    }
}
