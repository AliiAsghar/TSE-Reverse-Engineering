package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atcx {
    public int[] a;

    public atcx(byte[] bArr) {
        int length = bArr.length;
        if (length > 4) {
            int X = atow.X(bArr, 0);
            int a = atcv.a(X - 1);
            if (length == (X * a) + 4) {
                this.a = new int[X];
                for (int i = 0; i < X; i++) {
                    int[] iArr = this.a;
                    int i2 = (i * a) + 4;
                    int i3 = 0;
                    for (int i4 = a - 1; i4 >= 0; i4--) {
                        i3 |= (bArr[i2 + i4] & 255) << (i4 * 8);
                    }
                    iArr[i] = i3;
                }
                int[] iArr2 = this.a;
                int length2 = iArr2.length;
                boolean[] zArr = new boolean[length2];
                for (int i5 : iArr2) {
                    if (i5 >= 0 && i5 < length2 && !zArr[i5]) {
                        zArr[i5] = true;
                    } else {
                        throw new IllegalArgumentException("invalid encoding");
                    }
                }
                return;
            }
            throw new IllegalArgumentException("invalid encoding");
        }
        throw new IllegalArgumentException("invalid encoding");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof atcx)) {
            return false;
        }
        return atow.Z(this.a, ((atcx) obj).a);
    }

    public final int hashCode() {
        return atow.N(this.a);
    }

    public final String toString() {
        String str = "[" + this.a[0];
        int i = 1;
        while (true) {
            int[] iArr = this.a;
            if (i < iArr.length) {
                str = str + ", " + iArr[i];
                i++;
            } else {
                return str.concat("]");
            }
        }
    }
}
