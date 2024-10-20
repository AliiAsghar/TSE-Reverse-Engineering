package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arqd {
    public static final arqd a = new arqd(false, false);
    private static final byte[] b = {13, 10};
    private final boolean c;
    private final boolean d;

    static {
        new arqd(true, false);
        new arqd(false, true);
    }

    public arqd() {
        this(false, false);
    }

    public static /* synthetic */ String b(arqd arqdVar, byte[] bArr) {
        byte[] bArr2;
        int i;
        int i2;
        int length = bArr.length;
        arqdVar.a(length, length);
        int c = arqdVar.c(length);
        byte[] bArr3 = new byte[c];
        arqdVar.a(length, length);
        int c2 = arqdVar.c(length);
        if (c2 <= c) {
            if (arqdVar.c) {
                bArr2 = arqe.b;
            } else {
                bArr2 = arqe.a;
            }
            if (true != arqdVar.d) {
                i = Integer.MAX_VALUE;
            } else {
                i = 19;
            }
            int i3 = 0;
            int i4 = 0;
            while (true) {
                i2 = length - i3;
                if (i3 + 2 >= length) {
                    break;
                }
                int min = Math.min(i2 / 3, i);
                for (int i5 = 0; i5 < min; i5++) {
                    int i6 = bArr[i3] & 255;
                    int i7 = i3 + 2;
                    int i8 = bArr[i3 + 1] & 255;
                    i3 += 3;
                    int i9 = (i8 << 8) | (i6 << 16) | (bArr[i7] & 255);
                    bArr3[i4] = bArr2[i9 >>> 18];
                    bArr3[i4 + 1] = bArr2[(i9 >>> 12) & 63];
                    int i10 = i4 + 3;
                    bArr3[i4 + 2] = bArr2[(i9 >>> 6) & 63];
                    i4 += 4;
                    bArr3[i10] = bArr2[i9 & 63];
                }
                if (min == i && i3 != length) {
                    byte[] bArr4 = b;
                    bArr3[i4] = bArr4[0];
                    bArr3[i4 + 1] = bArr4[1];
                    i4 += 2;
                }
            }
            if (i2 != 1) {
                if (i2 == 2) {
                    int i11 = i3 + 1;
                    int i12 = bArr[i3] & 255;
                    i3 += 2;
                    int i13 = ((bArr[i11] & 255) << 2) | (i12 << 10);
                    bArr3[i4] = bArr2[i13 >>> 12];
                    bArr3[i4 + 1] = bArr2[(i13 >>> 6) & 63];
                    bArr3[i4 + 2] = bArr2[i13 & 63];
                    bArr3[i4 + 3] = 61;
                }
            } else {
                int i14 = (bArr[i3] & 255) << 4;
                bArr3[i4] = bArr2[i14 >>> 6];
                bArr3[i4 + 1] = bArr2[i14 & 63];
                bArr3[i4 + 2] = 61;
                bArr3[i4 + 3] = 61;
                i3++;
            }
            if (i3 == length) {
                return new String(bArr3, arul.b);
            }
            throw new IllegalStateException("Check failed.");
        }
        throw new IndexOutOfBoundsException(a.bU(c2, c, "The destination array does not have enough capacity, destination offset: 0, destination size: ", ", capacity needed: "));
    }

    private final int c(int i) {
        int i2;
        int i3 = (i + 2) / 3;
        if (this.d) {
            i2 = (i3 - 1) / 19;
        } else {
            i2 = 0;
        }
        int i4 = (i3 * 4) + i2 + i2;
        if (i4 >= 0) {
            return i4;
        }
        throw new IllegalArgumentException("Input is too big");
    }

    public final void a(int i, int i2) {
        aqil.L(0, i2, i);
    }

    public arqd(boolean z, boolean z2) {
        this.c = z;
        this.d = z2;
        if (z && z2) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }
}
