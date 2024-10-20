package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes5.dex */
final class F2 extends B2 {
    private V2 c;

    @Override // j$.util.stream.InterfaceC0177n2, java.util.function.LongConsumer
    public final void accept(long j) {
        this.c.accept(j);
    }

    @Override // j$.util.stream.AbstractC0157j2, j$.util.stream.InterfaceC0182o2
    public final void k() {
        long[] jArr = (long[]) this.c.d();
        Arrays.sort(jArr);
        long length = jArr.length;
        InterfaceC0182o2 interfaceC0182o2 = this.a;
        interfaceC0182o2.l(length);
        int i = 0;
        if (!this.b) {
            int length2 = jArr.length;
            while (i < length2) {
                interfaceC0182o2.accept(jArr[i]);
                i++;
            }
        } else {
            int length3 = jArr.length;
            while (i < length3) {
                long j = jArr[i];
                if (interfaceC0182o2.n()) {
                    break;
                }
                interfaceC0182o2.accept(j);
                i++;
            }
        }
        interfaceC0182o2.k();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [j$.util.stream.V2] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    @Override // j$.util.stream.AbstractC0157j2, j$.util.stream.InterfaceC0182o2
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
