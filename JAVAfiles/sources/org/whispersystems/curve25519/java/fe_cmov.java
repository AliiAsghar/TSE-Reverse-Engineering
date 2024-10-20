package org.whispersystems.curve25519.java;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fe_cmov {
    public static void fe_cmov(int[] iArr, int[] iArr2, int i) {
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        int i7 = iArr[5];
        int i8 = iArr[6];
        int i9 = iArr[7];
        int i10 = iArr[8];
        int i11 = iArr[9];
        int i12 = i2 ^ iArr2[0];
        int i13 = i3 ^ iArr2[1];
        int i14 = i4 ^ iArr2[2];
        int i15 = i5 ^ iArr2[3];
        int i16 = i6 ^ iArr2[4];
        int i17 = i7 ^ iArr2[5];
        int i18 = i8 ^ iArr2[6];
        int i19 = i9 ^ iArr2[7];
        int i20 = i10 ^ iArr2[8];
        int i21 = i11 ^ iArr2[9];
        int i22 = -i;
        iArr[0] = i2 ^ (i12 & i22);
        iArr[1] = (i13 & i22) ^ i3;
        iArr[2] = (i14 & i22) ^ i4;
        iArr[3] = (i15 & i22) ^ i5;
        iArr[4] = (i16 & i22) ^ i6;
        iArr[5] = (i17 & i22) ^ i7;
        iArr[6] = (i18 & i22) ^ i8;
        iArr[7] = (i19 & i22) ^ i9;
        iArr[8] = i10 ^ (i20 & i22);
        iArr[9] = i11 ^ (i21 & i22);
    }
}
