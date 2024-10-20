package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class crz {
    public int a;
    public long[] b = new long[2];

    public final boolean a(long j) {
        int i = this.a;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.b[i2] == j) {
                return true;
            }
        }
        return false;
    }

    public final void b(long j) {
        if (!a(j)) {
            int i = this.a;
            long[] jArr = this.b;
            int length = jArr.length;
            if (i >= length) {
                jArr = Arrays.copyOf(jArr, Math.max(i + 1, length + length));
                jArr.getClass();
                this.b = jArr;
            }
            jArr[i] = j;
            if (i >= this.a) {
                this.a = i + 1;
            }
        }
    }

    public final void c(long j) {
        int i = this.a;
        int i2 = 0;
        while (i2 < i) {
            if (j == this.b[i2]) {
                int i3 = this.a - 1;
                while (i2 < i3) {
                    long[] jArr = this.b;
                    int i4 = i2 + 1;
                    jArr[i2] = jArr[i4];
                    i2 = i4;
                }
                this.a--;
                return;
            }
            i2++;
        }
    }
}
