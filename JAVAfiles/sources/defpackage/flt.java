package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class flt {
    public static final int[] a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    public static final int[] b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    public static final int[] c = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    public static final int[] d = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};
    public static final int[] e = {5, 8, 10, 12};
    public static final int[] f = {6, 9, 12, 15};
    public static final int[] g = {2, 4, 6, 8};
    public static final int[] h = {9, 11, 13, 16};
    public static final int[] i = {5, 8, 10, 12};

    public static fjl a(byte[] bArr) {
        byte b2 = bArr[0];
        if (b2 != Byte.MAX_VALUE && b2 != 100 && b2 != 64 && b2 != 113) {
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            byte b3 = copyOf[0];
            if (b3 == -2 || b3 == -1 || b3 == 37 || b3 == -14 || b3 == -24) {
                for (int i2 = 0; i2 < copyOf.length - 1; i2 += 2) {
                    byte b4 = copyOf[i2];
                    int i3 = i2 + 1;
                    copyOf[i2] = copyOf[i3];
                    copyOf[i3] = b4;
                }
            }
            fjl fjlVar = new fjl(copyOf, (byte[]) null);
            if (copyOf[0] == 31) {
                fjl fjlVar2 = new fjl(copyOf, (byte[]) null);
                while (fjlVar2.f() >= 16) {
                    fjlVar2.s(2);
                    int i4 = fjlVar2.i(14) & 16383;
                    int min = Math.min(8 - fjlVar.b, 14);
                    int i5 = fjlVar.b;
                    int i6 = (8 - i5) - min;
                    Object obj = fjlVar.c;
                    int i7 = fjlVar.a;
                    byte[] bArr2 = (byte[]) obj;
                    byte b5 = (byte) (((65280 >> i5) | ((1 << i6) - 1)) & bArr2[i7]);
                    bArr2[i7] = b5;
                    int i8 = 14 - min;
                    bArr2[i7] = (byte) (b5 | ((i4 >>> i8) << i6));
                    int i9 = i7 + 1;
                    while (i8 > 8) {
                        i8 -= 8;
                        ((byte[]) fjlVar.c)[i9] = (byte) (i4 >>> i8);
                        i9++;
                    }
                    byte[] bArr3 = (byte[]) fjlVar.c;
                    byte b6 = (byte) (bArr3[i9] & ((1 << r6) - 1));
                    bArr3[i9] = b6;
                    bArr3[i9] = (byte) (((i4 & ((1 << i8) - 1)) << (8 - i8)) | b6);
                    fjlVar.s(14);
                    fjlVar.l();
                }
            }
            fjlVar.o(copyOf);
            return fjlVar;
        }
        return new fjl(bArr, (byte[]) null);
    }

    public static int b(fjl fjlVar, int[] iArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < 3 && fjlVar.u(); i3++) {
            i2++;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            i4 += 1 << iArr[i5];
        }
        return i4 + fjlVar.i(iArr[i2]);
    }
}
