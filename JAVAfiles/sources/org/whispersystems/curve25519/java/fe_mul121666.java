package org.whispersystems.curve25519.java;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fe_mul121666 {
    public static void fe_mul121666(int[] iArr, int[] iArr2) {
        long j = iArr2[0];
        long j2 = iArr2[1];
        long j3 = iArr2[2];
        long j4 = iArr2[3];
        long j5 = iArr2[4];
        long j6 = iArr2[5];
        long j7 = iArr2[6];
        long j8 = iArr2[7];
        long j9 = iArr2[8];
        long j10 = iArr2[9] * 121666;
        long j11 = (j10 + 16777216) >> 25;
        long j12 = (j * 121666) + (19 * j11);
        long j13 = (j12 + 33554432) >> 26;
        iArr[0] = (int) (j12 - (j13 << 26));
        long j14 = j2 * 121666;
        long j15 = (j14 + 16777216) >> 25;
        iArr[1] = (int) ((j14 - (j15 << 25)) + j13);
        long j16 = (j3 * 121666) + j15;
        long j17 = (j16 + 33554432) >> 26;
        iArr[2] = (int) (j16 - (j17 << 26));
        long j18 = j4 * 121666;
        long j19 = (j18 + 16777216) >> 25;
        iArr[3] = (int) ((j18 - (j19 << 25)) + j17);
        long j20 = (j5 * 121666) + j19;
        long j21 = (j20 + 33554432) >> 26;
        iArr[4] = (int) (j20 - (j21 << 26));
        long j22 = j6 * 121666;
        long j23 = (j22 + 16777216) >> 25;
        iArr[5] = (int) ((j22 - (j23 << 25)) + j21);
        long j24 = (j7 * 121666) + j23;
        long j25 = (j24 + 33554432) >> 26;
        iArr[6] = (int) (j24 - (j25 << 26));
        long j26 = j8 * 121666;
        long j27 = (j26 + 16777216) >> 25;
        iArr[7] = (int) ((j26 - (j27 << 25)) + j25);
        long j28 = (j9 * 121666) + j27;
        long j29 = (j28 + 33554432) >> 26;
        iArr[8] = (int) (j28 - (j29 << 26));
        iArr[9] = (int) ((j10 - (j11 << 25)) + j29);
    }
}
