package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes5.dex */
final class L2 extends AbstractC0236z2 {
    private double[] c;
    private int d;

    @Override // j$.util.stream.InterfaceC0167l2, j$.util.stream.InterfaceC0182o2
    public final void accept(double d) {
        double[] dArr = this.c;
        int i = this.d;
        this.d = i + 1;
        dArr[i] = d;
    }

    @Override // j$.util.stream.AbstractC0147h2, j$.util.stream.InterfaceC0182o2
    public final void k() {
        int i = 0;
        Arrays.sort(this.c, 0, this.d);
        long j = this.d;
        InterfaceC0182o2 interfaceC0182o2 = this.a;
        interfaceC0182o2.l(j);
        if (!this.b) {
            while (i < this.d) {
                interfaceC0182o2.accept(this.c[i]);
                i++;
            }
        } else {
            while (i < this.d && !interfaceC0182o2.n()) {
                interfaceC0182o2.accept(this.c[i]);
                i++;
            }
        }
        interfaceC0182o2.k();
        this.c = null;
    }

    @Override // j$.util.stream.AbstractC0147h2, j$.util.stream.InterfaceC0182o2
    public final void l(long j) {
        if (j < 2147483639) {
            this.c = new double[(int) j];
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }
}
