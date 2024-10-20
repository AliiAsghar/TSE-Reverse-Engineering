package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes5.dex */
final class D2 extends AbstractC0236z2 {
    private R2 c;

    @Override // j$.util.stream.InterfaceC0167l2, j$.util.stream.InterfaceC0182o2
    public final void accept(double d) {
        this.c.accept(d);
    }

    @Override // j$.util.stream.AbstractC0147h2, j$.util.stream.InterfaceC0182o2
    public final void k() {
        double[] dArr = (double[]) this.c.d();
        Arrays.sort(dArr);
        long length = dArr.length;
        InterfaceC0182o2 interfaceC0182o2 = this.a;
        interfaceC0182o2.l(length);
        int i = 0;
        if (!this.b) {
            int length2 = dArr.length;
            while (i < length2) {
                interfaceC0182o2.accept(dArr[i]);
                i++;
            }
        } else {
            int length3 = dArr.length;
            while (i < length3) {
                double d = dArr[i];
                if (interfaceC0182o2.n()) {
                    break;
                }
                interfaceC0182o2.accept(d);
                i++;
            }
        }
        interfaceC0182o2.k();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [j$.util.stream.R2] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    @Override // j$.util.stream.AbstractC0147h2, j$.util.stream.InterfaceC0182o2
    public final void l(long j) {
        ?? r0;
        if (j < 2147483639) {
            if (j > 0) {
                r0 = new X2((int) j);
            } else {
                r0 = new X2();
            }
            this.c = r0;
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }
}
