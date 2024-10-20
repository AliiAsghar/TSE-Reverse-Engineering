package org.whispersystems.curve25519.java;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fe_frombytes {
    public static void fe_frombytes(int[] iArr, byte[] bArr) {
        long load_4 = load_4(bArr, 0);
        long load_3 = load_3(bArr, 4) << 6;
        long load_32 = load_3(bArr, 7) << 5;
        long load_33 = load_3(bArr, 10) << 3;
        long load_34 = load_3(bArr, 13) << 2;
        long load_42 = load_4(bArr, 16);
        long load_35 = load_3(bArr, 20) << 7;
        long load_36 = load_3(bArr, 23) << 5;
        long load_37 = load_3(bArr, 26) << 4;
        long load_38 = (load_3(bArr, 29) & 8388607) << 2;
        long j = (load_38 + 16777216) >> 25;
        long j2 = load_4 + (19 * j);
        long j3 = (load_42 + 16777216) >> 25;
        long j4 = (j2 + 33554432) >> 26;
        iArr[0] = (int) (j2 - (j4 << 26));
        long j5 = (load_3 + 16777216) >> 25;
        iArr[1] = (int) ((load_3 - (j5 << 25)) + j4);
        long j6 = load_32 + j5;
        long j7 = (j6 + 33554432) >> 26;
        iArr[2] = (int) (j6 - (j7 << 26));
        long j8 = (load_33 + 16777216) >> 25;
        iArr[3] = (int) ((load_33 - (j8 << 25)) + j7);
        long j9 = load_34 + j8;
        long j10 = (j9 + 33554432) >> 26;
        iArr[4] = (int) (j9 - (j10 << 26));
        iArr[5] = (int) ((load_42 - (j3 << 25)) + j10);
        long j11 = load_35 + j3;
        long j12 = (j11 + 33554432) >> 26;
        iArr[6] = (int) (j11 - (j12 << 26));
        long j13 = (load_36 + 16777216) >> 25;
        iArr[7] = (int) ((load_36 - (j13 << 25)) + j12);
        long j14 = load_37 + j13;
        long j15 = (j14 + 33554432) >> 26;
        iArr[8] = (int) (j14 - (j15 << 26));
        iArr[9] = (int) ((load_38 - (j << 25)) + j15);
    }

    public static long load_3(byte[] bArr, int i) {
        return ((bArr[i + 2] << 16) & 16711680) | (bArr[i] & 255) | ((bArr[i + 1] << 8) & 65280);
    }

    public static long load_4(byte[] bArr, int i) {
        return ((bArr[i + 3] << 24) & 4278190080L) | (bArr[i] & 255) | ((bArr[i + 1] << 8) & 65280) | (16711680 & (bArr[i + 2] << 16));
    }
}
