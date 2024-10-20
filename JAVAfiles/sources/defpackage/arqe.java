package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arqe {
    public static final byte[] a = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    public static final byte[] b;

    static {
        int[] iArr = new int[256];
        aqil.C(iArr, -1, iArr.length);
        iArr[61] = -2;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < 64) {
            iArr[a[i2]] = i3;
            i2++;
            i3++;
        }
        byte[] bArr = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
        b = bArr;
        int[] iArr2 = new int[256];
        aqil.C(iArr2, -1, iArr2.length);
        iArr2[61] = -2;
        int i4 = 0;
        while (i < 64) {
            iArr2[bArr[i]] = i4;
            i++;
            i4++;
        }
    }
}
