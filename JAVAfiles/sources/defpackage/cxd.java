package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cxd {
    public int a;
    private int[] b;

    public cxd(int i) {
        this.b = new int[i];
    }

    private final void f(int i, int i2) {
        int[] iArr = this.b;
        cyj.b(iArr, i, i2);
        cyj.b(iArr, i + 1, i2 + 1);
        cyj.b(iArr, i + 2, i2 + 2);
    }

    private final int[] g(int[] iArr) {
        int length = iArr.length;
        int[] copyOf = Arrays.copyOf(iArr, length + length);
        copyOf.getClass();
        this.b = copyOf;
        return copyOf;
    }

    public final int a(int i) {
        return this.b[i];
    }

    public final int b() {
        int[] iArr = this.b;
        int i = this.a - 1;
        this.a = i;
        return iArr[i];
    }

    public final void c(int i, int i2, int i3) {
        int i4 = this.a;
        int i5 = i4 + 3;
        int[] iArr = this.b;
        if (i5 >= iArr.length) {
            iArr = g(iArr);
        }
        iArr[i4] = i + i3;
        iArr[i4 + 1] = i2 + i3;
        iArr[i4 + 2] = i3;
        this.a = i5;
    }

    public final void d(int i, int i2, int i3, int i4) {
        int i5 = this.a;
        int i6 = i5 + 4;
        int[] iArr = this.b;
        if (i6 >= iArr.length) {
            iArr = g(iArr);
        }
        iArr[i5] = i;
        iArr[i5 + 1] = i2;
        iArr[i5 + 2] = i3;
        iArr[i5 + 3] = i4;
        this.a = i6;
    }

    public final void e(int i, int i2) {
        if (i < i2) {
            int i3 = i - 3;
            for (int i4 = i; i4 < i2; i4 += 3) {
                int[] iArr = this.b;
                int i5 = iArr[i4];
                int i6 = iArr[i2];
                if (i5 < i6 || (i5 == i6 && iArr[i4 + 1] <= iArr[i2 + 1])) {
                    i3 += 3;
                    f(i3, i4);
                }
            }
            f(i3 + 3, i2);
            e(i, i3);
            e(i3 + 6, i2);
        }
    }
}
