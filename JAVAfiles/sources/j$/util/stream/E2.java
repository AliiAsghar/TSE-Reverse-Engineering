package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes5.dex */
final class E2 extends A2 {
    private T2 c;

    @Override // j$.util.stream.InterfaceC0172m2, j$.util.stream.InterfaceC0182o2
    public final void accept(int i) {
        this.c.accept(i);
    }

    @Override // j$.util.stream.AbstractC0152i2, j$.util.stream.InterfaceC0182o2
    public final void k() {
        int[] iArr = (int[]) this.c.d();
        Arrays.sort(iArr);
        long length = iArr.length;
        InterfaceC0182o2 interfaceC0182o2 = this.a;
        interfaceC0182o2.l(length);
        int i = 0;
        if (!this.b) {
            int length2 = iArr.length;
            while (i < length2) {
                interfaceC0182o2.accept(iArr[i]);
                i++;
            }
        } else {
            int length3 = iArr.length;
            while (i < length3) {
                int i2 = iArr[i];
                if (interfaceC0182o2.n()) {
                    break;
                }
                interfaceC0182o2.accept(i2);
                i++;
            }
        }
        interfaceC0182o2.k();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [j$.util.stream.T2] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    @Override // j$.util.stream.AbstractC0152i2, j$.util.stream.InterfaceC0182o2
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
