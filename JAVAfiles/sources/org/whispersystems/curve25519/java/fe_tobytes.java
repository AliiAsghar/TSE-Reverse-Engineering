package org.whispersystems.curve25519.java;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fe_tobytes {
    public static void fe_tobytes(byte[] bArr, int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int i9 = iArr[8];
        int i10 = iArr[9];
        int i11 = i + (((i10 + ((i9 + ((i8 + ((i7 + ((i6 + ((i5 + ((i4 + ((i3 + ((i2 + ((i + (((i10 * 19) + 16777216) >> 25)) >> 26)) >> 25)) >> 26)) >> 25)) >> 26)) >> 25)) >> 26)) >> 25)) >> 26)) >> 25) * 19);
        int i12 = i11 >> 26;
        int i13 = i2 + i12;
        int i14 = i13 >> 25;
        int i15 = i3 + i14;
        int i16 = i15 >> 26;
        int i17 = i4 + i16;
        int i18 = i17 >> 25;
        int i19 = i5 + i18;
        int i20 = i19 >> 26;
        int i21 = i6 + i20;
        int i22 = i21 >> 25;
        int i23 = i7 + i22;
        int i24 = i23 >> 26;
        int i25 = i8 + i24;
        int i26 = i25 >> 25;
        int i27 = i9 + i26;
        int i28 = i27 >> 26;
        int i29 = i10 + i28;
        int i30 = i11 - (i12 << 26);
        bArr[0] = (byte) i30;
        bArr[1] = (byte) (i30 >> 8);
        bArr[2] = (byte) (i30 >> 16);
        int i31 = i13 - (i14 << 25);
        bArr[3] = (byte) ((i30 >> 24) | (i31 << 2));
        int i32 = i15 - (i16 << 26);
        int i33 = i17 - (i18 << 25);
        int i34 = i19 - (i20 << 26);
        int i35 = i21 - (i22 << 25);
        int i36 = i23 - (i24 << 26);
        int i37 = i25 - (i26 << 25);
        bArr[4] = (byte) (i31 >> 6);
        bArr[5] = (byte) (i31 >> 14);
        bArr[6] = (byte) ((i31 >> 22) | (i32 << 3));
        bArr[7] = (byte) (i32 >> 5);
        bArr[8] = (byte) (i32 >> 13);
        bArr[9] = (byte) ((i32 >> 21) | (i33 << 5));
        bArr[10] = (byte) (i33 >> 3);
        bArr[11] = (byte) (i33 >> 11);
        bArr[12] = (byte) ((i33 >> 19) | (i34 << 6));
        bArr[13] = (byte) (i34 >> 2);
        bArr[14] = (byte) (i34 >> 10);
        bArr[15] = (byte) (i34 >> 18);
        bArr[16] = (byte) i35;
        bArr[17] = (byte) (i35 >> 8);
        bArr[18] = (byte) (i35 >> 16);
        bArr[19] = (byte) ((i35 >> 24) | (i36 + i36));
        bArr[20] = (byte) (i36 >> 7);
        bArr[21] = (byte) (i36 >> 15);
        bArr[22] = (byte) ((i36 >> 23) | (i37 << 3));
        bArr[23] = (byte) (i37 >> 5);
        int i38 = i29 - ((i29 >> 25) << 25);
        int i39 = i27 - (i28 << 26);
        bArr[24] = (byte) (i37 >> 13);
        bArr[25] = (byte) ((i37 >> 21) | (i39 << 4));
        bArr[26] = (byte) (i39 >> 4);
        bArr[27] = (byte) (i39 >> 12);
        bArr[28] = (byte) ((i39 >> 20) | (i38 << 6));
        bArr[29] = (byte) (i38 >> 2);
        bArr[30] = (byte) (i38 >> 10);
        bArr[31] = (byte) (i38 >> 18);
    }
}
