package j$.util;

import java.util.Arrays;

/* loaded from: classes5.dex */
public class Base64 {

    /* loaded from: classes5.dex */
    public static class Encoder {
        private static final char[] a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};
        static final Encoder b = new Object();

        public String encodeToString(byte[] bArr) {
            int length = ((bArr.length + 2) / 3) * 4;
            byte[] bArr2 = new byte[length];
            int length2 = bArr.length;
            char[] cArr = a;
            int i = (length2 / 3) * 3;
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int min = Math.min(i2 + i, i);
                int i4 = i2;
                int i5 = i3;
                while (i4 < min) {
                    int i6 = i4 + 2;
                    int i7 = ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4] & 255) << 16);
                    i4 += 3;
                    int i8 = i7 | (bArr[i6] & 255);
                    bArr2[i5] = (byte) cArr[(i8 >>> 18) & 63];
                    bArr2[i5 + 1] = (byte) cArr[(i8 >>> 12) & 63];
                    int i9 = i5 + 3;
                    bArr2[i5 + 2] = (byte) cArr[(i8 >>> 6) & 63];
                    i5 += 4;
                    bArr2[i9] = (byte) cArr[i8 & 63];
                }
                int i10 = ((min - i2) / 3) * 4;
                i3 += i10;
                if (i10 == -1 && min < length2) {
                    throw null;
                }
                i2 = min;
            }
            if (i2 < length2) {
                int i11 = i2 + 1;
                int i12 = bArr[i2] & 255;
                int i13 = i3 + 1;
                bArr2[i3] = (byte) cArr[i12 >> 2];
                if (i11 == length2) {
                    bArr2[i13] = (byte) cArr[(i12 << 4) & 63];
                    int i14 = i3 + 3;
                    bArr2[i3 + 2] = 61;
                    i3 += 4;
                    bArr2[i14] = 61;
                } else {
                    int i15 = bArr[i11] & 255;
                    bArr2[i13] = (byte) cArr[((i12 << 4) & 63) | (i15 >> 4)];
                    int i16 = i3 + 3;
                    bArr2[i3 + 2] = (byte) cArr[(i15 << 2) & 63];
                    i3 += 4;
                    bArr2[i16] = 61;
                }
            }
            if (i3 != length) {
                bArr2 = Arrays.copyOf(bArr2, i3);
            }
            return new String(bArr2, 0, 0, bArr2.length);
        }
    }

    public static Encoder getEncoder() {
        return Encoder.b;
    }
}
