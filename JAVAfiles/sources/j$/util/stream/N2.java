package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes5.dex */
final class N2 extends B2 {
    private long[] c;
    private int d;

    @Override // j$.util.stream.InterfaceC0177n2, java.util.function.LongConsumer
    public final void accept(long j) {
        long[] jArr = this.c;
        int i = this.d;
        this.d = i + 1;
        jArr[i] = j;
    }

    @Override // j$.util.stream.AbstractC0157j2, j$.util.stream.InterfaceC0182o2
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

    @Override // j$.util.stream.AbstractC0157j2, j$.util.stream.InterfaceC0182o2
    public final void l(long j) {
        if (j < 2147483639) {
            this.c = new long[(int) j];
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }
}
