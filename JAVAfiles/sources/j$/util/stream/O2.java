package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes5.dex */
final class O2 extends C2 {
    private Object[] d;
    private int e;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        Object[] objArr = this.d;
        int i = this.e;
        this.e = i + 1;
        objArr[i] = obj;
    }

    @Override // j$.util.stream.AbstractC0162k2, j$.util.stream.InterfaceC0182o2
    public final void k() {
        int i = 0;
        Arrays.sort(this.d, 0, this.e, this.b);
        long j = this.e;
        InterfaceC0182o2 interfaceC0182o2 = this.a;
        interfaceC0182o2.l(j);
        if (!this.c) {
            while (i < this.e) {
                interfaceC0182o2.accept((InterfaceC0182o2) this.d[i]);
                i++;
            }
        } else {
            while (i < this.e && !interfaceC0182o2.n()) {
                interfaceC0182o2.accept((InterfaceC0182o2) this.d[i]);
                i++;
            }
        }
        interfaceC0182o2.k();
        this.d = null;
    }

    @Override // j$.util.stream.AbstractC0162k2, j$.util.stream.InterfaceC0182o2
    public final void l(long j) {
        if (j < 2147483639) {
            this.d = new Object[(int) j];
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }
}
