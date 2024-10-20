package defpackage;

import java.math.BigInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
final class asvb implements Cloneable {
    public long[] b;
    private static final short[] c = {0, 1, 4, 5, 16, 17, 20, 21, 64, 65, 68, 69, 80, 81, 84, 85, 256, 257, 260, 261, 272, 273, 276, 277, 320, 321, 324, 325, 336, 337, 340, 341, 1024, 1025, 1028, 1029, 1040, 1041, 1044, 1045, 1088, 1089, 1092, 1093, 1104, 1105, 1108, 1109, 1280, 1281, 1284, 1285, 1296, 1297, 1300, 1301, 1344, 1345, 1348, 1349, 1360, 1361, 1364, 1365, 4096, 4097, 4100, 4101, 4112, 4113, 4116, 4117, 4160, 4161, 4164, 4165, 4176, 4177, 4180, 4181, 4352, 4353, 4356, 4357, 4368, 4369, 4372, 4373, 4416, 4417, 4420, 4421, 4432, 4433, 4436, 4437, 5120, 5121, 5124, 5125, 5136, 5137, 5140, 5141, 5184, 5185, 5188, 5189, 5200, 5201, 5204, 5205, 5376, 5377, 5380, 5381, 5392, 5393, 5396, 5397, 5440, 5441, 5444, 5445, 5456, 5457, 5460, 5461, 16384, 16385, 16388, 16389, 16400, 16401, 16404, 16405, 16448, 16449, 16452, 16453, 16464, 16465, 16468, 16469, 16640, 16641, 16644, 16645, 16656, 16657, 16660, 16661, 16704, 16705, 16708, 16709, 16720, 16721, 16724, 16725, 17408, 17409, 17412, 17413, 17424, 17425, 17428, 17429, 17472, 17473, 17476, 17477, 17488, 17489, 17492, 17493, 17664, 17665, 17668, 17669, 17680, 17681, 17684, 17685, 17728, 17729, 17732, 17733, 17744, 17745, 17748, 17749, 20480, 20481, 20484, 20485, 20496, 20497, 20500, 20501, 20544, 20545, 20548, 20549, 20560, 20561, 20564, 20565, 20736, 20737, 20740, 20741, 20752, 20753, 20756, 20757, 20800, 20801, 20804, 20805, 20816, 20817, 20820, 20821, 21504, 21505, 21508, 21509, 21520, 21521, 21524, 21525, 21568, 21569, 21572, 21573, 21584, 21585, 21588, 21589, 21760, 21761, 21764, 21765, 21776, 21777, 21780, 21781, 21824, 21825, 21828, 21829, 21840, 21841, 21844, 21845};
    static final byte[] a = {0, 1, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8};

    public asvb(int i) {
        this.b = new long[i];
    }

    public static long d(long[] jArr, int i, long[] jArr2, int i2, int i3, int i4) {
        long j = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            long j2 = jArr2[i2 + i5];
            int i6 = i + i5;
            jArr[i6] = (j | (j2 << i4)) ^ jArr[i6];
            j = j2 >>> (64 - i4);
        }
        return j;
    }

    public static long e(int i) {
        short[] sArr = c;
        return ((sArr[i & 255] | (sArr[(i >>> 8) & 255] << 16)) & 4294967295L) | ((((sArr[i >>> 24] << 16) | sArr[(i >>> 16) & 255]) & 4294967295L) << 32);
    }

    public static void f(long[] jArr, int i, long[] jArr2, int i2, long[] jArr3, int i3, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            jArr3[i3 + i5] = jArr[i + i5] ^ jArr2[i2 + i5];
        }
    }

    public static void g(long[] jArr, int i, long[] jArr2, int i2, long[] jArr3, int i3, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = i + i5;
            jArr[i6] = jArr[i6] ^ (jArr2[i2 + i5] ^ jArr3[i3 + i5]);
        }
    }

    public static void o(long j, long[] jArr, int i, long[] jArr2) {
        if ((j & 1) != 0) {
            u(jArr2, 0, jArr, 0, i);
        }
        long j2 = j;
        int i2 = 1;
        while (true) {
            long j3 = j2 >>> 1;
            if (j3 != 0) {
                if ((j3 & 1) != 0) {
                    long d = d(jArr2, 0, jArr, 0, i, i2);
                    if (d != 0) {
                        jArr2[i] = d ^ jArr2[i];
                    }
                }
                i2++;
                j2 = j3;
            } else {
                return;
            }
        }
    }

    public static void p(long[] jArr, int i, int i2, int[] iArr) {
        v(jArr, i);
        int length = iArr.length;
        while (true) {
            int i3 = i - i2;
            length--;
            if (length >= 0) {
                v(jArr, iArr[length] + i3);
            } else {
                v(jArr, i3);
                return;
            }
        }
    }

    public static int q(long[] jArr, int i, int i2, int[] iArr) {
        int i3;
        int i4;
        int i5 = i;
        int i6 = (i2 + 63) >>> 6;
        if (i5 < i6) {
            return i5;
        }
        int i7 = i5 << 6;
        int min = Math.min(i7, (i2 + i2) - 1);
        int i8 = i7 - min;
        while (i8 >= 64) {
            i5--;
            i8 -= 64;
        }
        int length = iArr.length;
        int i9 = iArr[length - 1];
        if (length > 1) {
            i3 = iArr[length - 2];
        } else {
            i3 = 0;
        }
        int max = Math.max(i2, i9 + 64);
        int min2 = (i8 + Math.min(min - max, i2 - i3)) >> 6;
        if (min2 > 1) {
            int i10 = i5 - min2;
            int i11 = i5 - i10;
            int i12 = i10 << 6;
            int i13 = i12 - i2;
            while (true) {
                length--;
                if (length < 0) {
                    break;
                }
                w(jArr, jArr, i10, i11, iArr[length] + i13);
            }
            w(jArr, jArr, i10, i11, i13);
            while (i5 > i10) {
                i5--;
                jArr[i5] = 0;
            }
            min = i12;
        }
        if (min > max) {
            while (true) {
                i4 = max >>> 6;
                int i14 = i5 - 1;
                if (i14 <= i4) {
                    break;
                }
                long j = jArr[i14];
                if (j != 0) {
                    jArr[i14] = 0;
                    y(jArr, i14 << 6, j, i2, iArr);
                }
                i5 = i14;
            }
            int i15 = max & 63;
            long j2 = jArr[i4];
            long j3 = j2 >>> i15;
            if (j3 != 0) {
                jArr[i4] = j2 ^ (j3 << i15);
                y(jArr, max, j3, i2, iArr);
            }
        } else {
            max = min;
        }
        if (max > i2) {
            while (true) {
                max--;
                if (max < i2) {
                    break;
                }
                if ((jArr[max >>> 6] & (1 << (max & 63))) != 0) {
                    p(jArr, max, i2, iArr);
                }
            }
        }
        return i6;
    }

    public static asvb r(long[] jArr, int i, int i2, int[] iArr) {
        return new asvb(jArr, q(jArr, i, i2, iArr));
    }

    public static void s(long[] jArr, int i, long[] jArr2, int i2, int i3, int i4) {
        long j = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            long j2 = jArr[i + i5];
            jArr2[i2 + i5] = j | (j2 << i4);
            j = j2 >>> (64 - i4);
        }
    }

    private static int t(long j) {
        int i;
        int i2 = 32;
        int i3 = (int) (j >>> 32);
        if (i3 == 0) {
            i3 = (int) j;
            i2 = 0;
        }
        int i4 = i3 >>> 16;
        if (i4 == 0) {
            int i5 = i3 >>> 8;
            if (i5 == 0) {
                i = a[i3];
            } else {
                i = a[i5] + 8;
            }
        } else {
            int i6 = i3 >>> 24;
            if (i6 == 0) {
                i = a[i4] + 16;
            } else {
                i = a[i6] + 24;
            }
        }
        return i2 + i;
    }

    private static void u(long[] jArr, int i, long[] jArr2, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i + i4;
            jArr[i5] = jArr[i5] ^ jArr2[i2 + i4];
        }
    }

    private static void v(long[] jArr, int i) {
        int i2 = i >>> 6;
        jArr[i2] = jArr[i2] ^ (1 << (i & 63));
    }

    private static void w(long[] jArr, long[] jArr2, int i, int i2, int i3) {
        int i4 = i3 & 63;
        int i5 = i3 >>> 6;
        int i6 = i2;
        if (i4 == 0) {
            u(jArr, i5, jArr2, i, i6);
            return;
        }
        int i7 = i5 + 1;
        int i8 = 64 - i4;
        long j = 0;
        while (true) {
            i6--;
            if (i6 >= 0) {
                long j2 = jArr2[i + i6];
                int i9 = i7 + i6;
                jArr[i9] = (j | (j2 >>> i8)) ^ jArr[i9];
                j = j2 << (64 - i8);
            } else {
                jArr[i5] = jArr[i5] ^ j;
                return;
            }
        }
    }

    private static void x(long[] jArr, int i, long j) {
        int i2 = i & 63;
        int i3 = i >>> 6;
        if (i2 == 0) {
            jArr[i3] = j ^ jArr[i3];
            return;
        }
        jArr[i3] = jArr[i3] ^ (j << i2);
        long j2 = j >>> (64 - i2);
        if (j2 != 0) {
            int i4 = i3 + 1;
            jArr[i4] = j2 ^ jArr[i4];
        }
    }

    private static void y(long[] jArr, int i, long j, int i2, int[] iArr) {
        int length = iArr.length;
        while (true) {
            int i3 = i - i2;
            length--;
            if (length >= 0) {
                x(jArr, i3 + iArr[length], j);
            } else {
                x(jArr, i3, j);
                return;
            }
        }
    }

    public final int a() {
        int length = this.b.length;
        while (length != 0) {
            length--;
            long j = this.b[length];
            if (j != 0) {
                return (length << 6) + t(j);
            }
        }
        return 0;
    }

    public final int b(int i) {
        int i2 = (i + 62) >>> 6;
        while (i2 != 0) {
            i2--;
            long j = this.b[i2];
            if (j != 0) {
                return (i2 << 6) + t(j);
            }
        }
        return 0;
    }

    public final int c() {
        long[] jArr = this.b;
        int length = jArr.length;
        int min = Math.min(length, length);
        if (min <= 0) {
            return 0;
        }
        if (jArr[0] == 0) {
            while (true) {
                int i = min - 1;
                if (jArr[i] != 0) {
                    break;
                }
                if (i <= 0) {
                    return 0;
                }
                min = i;
            }
        } else {
            while (true) {
                int i2 = min - 1;
                if (jArr[i2] != 0) {
                    break;
                }
                min = i2;
            }
        }
        return min;
    }

    public final Object clone() {
        long[] jArr;
        long[] jArr2 = this.b;
        if (jArr2 == null) {
            jArr = null;
        } else {
            jArr = (long[]) jArr2.clone();
        }
        return new asvb(jArr);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof asvb)) {
            return false;
        }
        asvb asvbVar = (asvb) obj;
        int c2 = c();
        if (asvbVar.c() != c2) {
            return false;
        }
        for (int i = 0; i < c2; i++) {
            if (this.b[i] != asvbVar.b[i]) {
                return false;
            }
        }
        return true;
    }

    public final void h(asvb asvbVar, int i, int i2) {
        int i3 = (i + 63) >>> 6;
        int i4 = i2 & 63;
        int i5 = i2 >>> 6;
        long[] jArr = this.b;
        if (i4 == 0) {
            u(jArr, i5, asvbVar.b, 0, i3);
            return;
        }
        long d = d(jArr, i5, asvbVar.b, 0, i3, i4);
        if (d != 0) {
            long[] jArr2 = this.b;
            int i6 = i3 + i5;
            jArr2[i6] = d ^ jArr2[i6];
        }
    }

    public final int hashCode() {
        int c2 = c();
        int i = 1;
        for (int i2 = 0; i2 < c2; i2++) {
            long j = this.b[i2];
            i = (((i * 31) ^ ((int) j)) * 31) ^ ((int) (j >>> 32));
        }
        return i;
    }

    public final void i(int i, int[] iArr) {
        long[] jArr = this.b;
        int length = jArr.length;
        int q = q(jArr, length, i, iArr);
        if (q < length) {
            long[] jArr2 = new long[q];
            this.b = jArr2;
            System.arraycopy(jArr, 0, jArr2, 0, q);
        }
    }

    public final boolean j() {
        long[] jArr = this.b;
        if (jArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < jArr.length; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public final boolean k() {
        for (long j : this.b) {
            if (j != 0) {
                return false;
            }
        }
        return true;
    }

    public final long[] l(int i) {
        long[] jArr = new long[i];
        long[] jArr2 = this.b;
        System.arraycopy(jArr2, 0, jArr, 0, Math.min(jArr2.length, i));
        return jArr;
    }

    public final void m(asvb asvbVar) {
        int c2 = asvbVar.c();
        if (c2 == 0) {
            return;
        }
        if (c2 > this.b.length) {
            this.b = l(c2);
        }
        u(this.b, 0, asvbVar.b, 0, c2);
    }

    public final asvb n(asvb asvbVar) {
        asvb asvbVar2;
        asvb asvbVar3;
        int i;
        long[] jArr;
        int[] iArr;
        int i2;
        int a2 = a();
        if (a2 == 0) {
            return this;
        }
        int a3 = asvbVar.a();
        if (a3 == 0) {
            return asvbVar;
        }
        if (a2 > a3) {
            asvbVar2 = this;
        } else {
            asvbVar2 = asvbVar;
        }
        if (a2 <= a3) {
            asvbVar3 = this;
        } else {
            asvbVar3 = asvbVar;
        }
        if (a2 > a3) {
            i = a2;
        } else {
            i = a3;
        }
        if (a2 > a3) {
            a2 = a3;
        }
        int i3 = a2 + i + 62;
        int i4 = (a2 + 63) >>> 6;
        int i5 = i3 >>> 6;
        int i6 = (i + 63) >>> 6;
        if (i4 == 1) {
            long j = asvbVar3.b[0];
            if (j == 1) {
                return asvbVar2;
            }
            long[] jArr2 = new long[i5];
            o(j, asvbVar2.b, i6, jArr2);
            return new asvb(jArr2, i5);
        }
        int i7 = (i + 70) >>> 6;
        int i8 = i7 << 4;
        int i9 = 16;
        int[] iArr2 = new int[16];
        long[] jArr3 = new long[i8];
        iArr2[1] = i7;
        System.arraycopy(asvbVar2.b, 0, jArr3, i7, i6);
        int i10 = 2;
        int i11 = i7;
        while (i10 < i9) {
            i11 += i7;
            iArr2[i10] = i11;
            if ((i10 & 1) == 0) {
                jArr = jArr3;
                iArr = iArr2;
                s(jArr3, i11 >>> 1, jArr3, i11, i7, 1);
                i2 = i9;
            } else {
                jArr = jArr3;
                iArr = iArr2;
                i2 = i9;
                f(jArr, i7, jArr, i11 - i7, jArr3, i11, i7);
            }
            i10++;
            i9 = i2;
            jArr3 = jArr;
            iArr2 = iArr;
        }
        long[] jArr4 = jArr3;
        int[] iArr3 = iArr2;
        long[] jArr5 = new long[i8];
        s(jArr4, 0, jArr5, 0, i8, 4);
        long[] jArr6 = asvbVar3.b;
        int i12 = i5 << 3;
        long[] jArr7 = new long[i12];
        for (int i13 = 0; i13 < i4; i13++) {
            long j2 = jArr6[i13];
            int i14 = i13;
            while (true) {
                g(jArr7, i14, jArr4, iArr3[((int) j2) & 15], jArr5, iArr3[((int) (j2 >>> 4)) & 15], i7);
                j2 >>>= 8;
                if (j2 == 0) {
                    break;
                }
                i14 += i5;
            }
        }
        while (true) {
            i12 -= i5;
            if (i12 != 0) {
                d(jArr7, i12 - i5, jArr7, i12, i5, 8);
            } else {
                return new asvb(jArr7, i5);
            }
        }
    }

    public final String toString() {
        int c2 = c();
        if (c2 == 0) {
            return "0";
        }
        int i = c2 - 1;
        StringBuffer stringBuffer = new StringBuffer(Long.toBinaryString(this.b[i]));
        while (true) {
            i--;
            if (i >= 0) {
                String binaryString = Long.toBinaryString(this.b[i]);
                int length = binaryString.length();
                if (length < 64) {
                    stringBuffer.append("0000000000000000000000000000000000000000000000000000000000000000".substring(length));
                }
                stringBuffer.append(binaryString);
            } else {
                return stringBuffer.toString();
            }
        }
    }

    public asvb(long[] jArr) {
        this.b = jArr;
    }

    public asvb(BigInteger bigInteger) {
        if (bigInteger.signum() >= 0) {
            int i = 1;
            if (bigInteger.signum() == 0) {
                this.b = new long[]{0};
                return;
            }
            byte[] byteArray = bigInteger.toByteArray();
            int length = byteArray.length;
            if (byteArray[0] == 0) {
                length--;
            } else {
                i = 0;
            }
            int i2 = (length + 7) / 8;
            this.b = new long[i2];
            int i3 = i2 - 1;
            int i4 = (length % 8) + i;
            if (i < i4) {
                long j = 0;
                while (i < i4) {
                    j = (j << 8) | (byteArray[i] & 255);
                    i++;
                }
                this.b[i3] = j;
                i3 = i2 - 2;
            }
            while (i3 >= 0) {
                long j2 = 0;
                int i5 = 0;
                while (i5 < 8) {
                    j2 = (j2 << 8) | (byteArray[i] & 255);
                    i5++;
                    i++;
                }
                this.b[i3] = j2;
                i3--;
            }
            return;
        }
        throw new IllegalArgumentException("invalid F2m field value");
    }

    public asvb(long[] jArr, int i) {
        if (i == jArr.length) {
            this.b = jArr;
            return;
        }
        long[] jArr2 = new long[i];
        this.b = jArr2;
        System.arraycopy(jArr, 0, jArr2, 0, i);
    }
}
