package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atdn implements atdk {
    protected final byte[] a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    protected final byte[] b = new byte[128];

    public atdn() {
        for (int i = 0; i < 128; i++) {
            this.b[i] = -1;
        }
        for (int i2 = 0; i2 < 16; i2++) {
            this.b[this.a[i2]] = (byte) i2;
        }
        byte[] bArr = this.b;
        bArr[65] = bArr[97];
        bArr[66] = bArr[98];
        bArr[67] = bArr[99];
        bArr[68] = bArr[100];
        bArr[69] = bArr[101];
        bArr[70] = bArr[102];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final byte[] a(String str, int i, int i2) {
        if (str != null) {
            if (i2 >= 0 && i <= str.length() - i2) {
                if ((i2 & 1) == 0) {
                    int i3 = i2 >>> 1;
                    byte[] bArr = new byte[i3];
                    for (int i4 = 0; i4 < i3; i4++) {
                        int i5 = i + 1;
                        byte b = this.b[str.charAt(i)];
                        i += 2;
                        int i6 = (b << 4) | this.b[str.charAt(i5)];
                        if (i6 >= 0) {
                            bArr[i4] = (byte) i6;
                        } else {
                            throw new IOException("invalid characters encountered in Hex string");
                        }
                    }
                    return bArr;
                }
                throw new IOException("a hexadecimal encoding must have an even number of characters");
            }
            throw new IndexOutOfBoundsException("invalid offset and/or length specified");
        }
        throw new NullPointerException("'str' cannot be null");
    }
}
