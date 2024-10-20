package defpackage;

import java.lang.reflect.Array;
import java.security.SecureRandom;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class asyn extends SecureRandom {
    private byte[] a;
    private byte[] b;
    private byte[] c;
    private assy d;

    public asyn(byte[] bArr, assy assyVar) {
        this.a = bArr;
        this.d = assyVar;
        int length = bArr.length;
        if (length >= 48) {
            b(bArr);
            return;
        }
        int i = 48 - length;
        int b = assyVar.b();
        assyVar.e(bArr, 0, length);
        byte[] bArr2 = new byte[b];
        assyVar.a(bArr2, 0);
        if (i != b) {
            if (i < b) {
                bArr2 = atow.R(bArr2, i);
            } else {
                byte[] R = atow.R(bArr2, b);
                while (true) {
                    i -= b;
                    if (i < b) {
                        break;
                    }
                    assyVar.e(bArr2, 0, b);
                    bArr2 = new byte[b];
                    assyVar.a(bArr2, 0);
                    R = atow.Q(R, bArr2);
                }
                if (i > 0) {
                    assyVar.e(bArr2, 0, b);
                    byte[] bArr3 = new byte[b];
                    assyVar.a(bArr3, 0);
                    int length2 = R.length;
                    R = atow.R(R, length2 + i);
                    System.arraycopy(bArr3, 0, R, length2, i);
                }
                bArr2 = R;
            }
        }
        b(atow.Q(this.a, bArr2));
    }

    private static final void a(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        byte[] bArr4 = bArr2;
        try {
            byte[] bArr5 = astk.a;
            assw.a();
            int length = bArr.length;
            byte[] bArr6 = new byte[32];
            int i2 = 0;
            System.arraycopy(bArr, 0, bArr6, 0, 32);
            char c = 2;
            int i3 = 1;
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 15, 4);
            int D = atow.D(bArr6, 0);
            iArr[0][0] = D;
            int D2 = atow.D(bArr6, 4);
            iArr[0][1] = D2;
            int i4 = 8;
            int D3 = atow.D(bArr6, 8);
            iArr[0][2] = D3;
            int D4 = atow.D(bArr6, 12);
            char c2 = 3;
            iArr[0][3] = D4;
            int D5 = atow.D(bArr6, 16);
            iArr[1][0] = D5;
            int D6 = atow.D(bArr6, 20);
            iArr[1][1] = D6;
            int D7 = atow.D(bArr6, 24);
            iArr[1][2] = D7;
            int D8 = atow.D(bArr6, 28);
            iArr[1][3] = D8;
            int i5 = 2;
            int i6 = 1;
            while (true) {
                int b = astk.b(astk.a(D8, i4)) ^ i6;
                i6 += i6;
                D ^= b;
                int[] iArr2 = iArr[i5];
                iArr2[i2] = D;
                D2 ^= D;
                iArr2[i3] = D2;
                D3 ^= D2;
                iArr2[c] = D3;
                D4 ^= D3;
                iArr2[c2] = D4;
                int i7 = i5 + 1;
                if (i7 >= 15) {
                    break;
                }
                D5 ^= astk.b(D4);
                int[] iArr3 = iArr[i7];
                iArr3[0] = D5;
                D6 ^= D5;
                i3 = 1;
                iArr3[1] = D6;
                D7 ^= D6;
                iArr3[2] = D7;
                D8 ^= D7;
                iArr3[3] = D8;
                i5 += 2;
                i2 = 0;
                c = 2;
                c2 = 3;
                i4 = 8;
                bArr4 = bArr2;
            }
            byte[] O = atow.O(astk.a);
            assw.a();
            int i8 = i2;
            while (true) {
                int length2 = bArr4.length;
                if (i8 != 16) {
                    int i9 = i + i8;
                    if (i8 <= 0) {
                        if (i9 <= bArr3.length - 16) {
                            int D9 = atow.D(bArr4, i8);
                            int D10 = atow.D(bArr4, i8 + 4);
                            int D11 = atow.D(bArr4, i8 + 8);
                            int D12 = atow.D(bArr4, i8 + 12);
                            int[] iArr4 = iArr[i2];
                            int i10 = D9 ^ iArr4[i2];
                            int i11 = D10 ^ iArr4[i3];
                            int i12 = D11 ^ iArr4[c];
                            int i13 = D12 ^ iArr4[3];
                            int i14 = i3;
                            while (i14 < 13) {
                                int[] iArr5 = astk.b;
                                int a = ((astk.a(iArr5[(i11 >> 8) & 255], 24) ^ iArr5[i10 & 255]) ^ astk.a(iArr5[(i12 >> 16) & 255], 16)) ^ astk.a(iArr5[(i13 >> 24) & 255], 8);
                                int[] iArr6 = iArr[i14];
                                int i15 = a ^ iArr6[i2];
                                int a2 = ((astk.a(iArr5[(i13 >> 16) & 255], 16) ^ (iArr5[i11 & 255] ^ astk.a(iArr5[(i12 >> 8) & 255], 24))) ^ astk.a(iArr5[(i10 >> 24) & 255], 8)) ^ iArr6[1];
                                int i16 = i8;
                                int a3 = (((iArr5[i12 & 255] ^ astk.a(iArr5[(i13 >> 8) & 255], 24)) ^ astk.a(iArr5[(i10 >> 16) & 255], 16)) ^ astk.a(iArr5[(i11 >> 24) & 255], 8)) ^ iArr6[2];
                                int a4 = (((iArr5[i13 & 255] ^ astk.a(iArr5[(i10 >> 8) & 255], 24)) ^ astk.a(iArr5[(i11 >> 16) & 255], 16)) ^ astk.a(iArr5[(i12 >> 24) & 255], 8)) ^ iArr6[3];
                                int a5 = ((iArr5[i15 & 255] ^ astk.a(iArr5[(a2 >> 8) & 255], 24)) ^ astk.a(iArr5[(a3 >> 16) & 255], 16)) ^ astk.a(iArr5[(a4 >> 24) & 255], 8);
                                int[] iArr7 = iArr[i14 + 1];
                                int i17 = a5 ^ iArr7[0];
                                i11 = (((iArr5[a2 & 255] ^ astk.a(iArr5[(a3 >> 8) & 255], 24)) ^ astk.a(iArr5[(a4 >> 16) & 255], 16)) ^ astk.a(iArr5[(i15 >> 24) & 255], 8)) ^ iArr7[1];
                                i12 = (((iArr5[a3 & 255] ^ astk.a(iArr5[(a4 >> 8) & 255], 24)) ^ astk.a(iArr5[(i15 >> 16) & 255], 16)) ^ astk.a(iArr5[(a2 >> 24) & 255], 8)) ^ iArr7[2];
                                i14 += 2;
                                i13 = (((astk.a(iArr5[(i15 >> 8) & 255], 24) ^ iArr5[a4 & 255]) ^ astk.a(iArr5[(a2 >> 16) & 255], 16)) ^ astk.a(iArr5[(a3 >> 24) & 255], 8)) ^ iArr7[3];
                                i10 = i17;
                                i8 = i16;
                                i2 = 0;
                            }
                            int i18 = i8;
                            int[] iArr8 = astk.b;
                            int a6 = ((iArr8[i10 & 255] ^ astk.a(iArr8[(i11 >> 8) & 255], 24)) ^ astk.a(iArr8[(i12 >> 16) & 255], 16)) ^ astk.a(iArr8[(i13 >> 24) & 255], 8);
                            int[] iArr9 = iArr[i14];
                            int i19 = a6 ^ iArr9[0];
                            int a7 = (((iArr8[i11 & 255] ^ astk.a(iArr8[(i12 >> 8) & 255], 24)) ^ astk.a(iArr8[(i13 >> 16) & 255], 16)) ^ astk.a(iArr8[(i10 >> 24) & 255], 8)) ^ iArr9[1];
                            int a8 = (((iArr8[i12 & 255] ^ astk.a(iArr8[(i13 >> 8) & 255], 24)) ^ astk.a(iArr8[(i10 >> 16) & 255], 16)) ^ astk.a(iArr8[(i11 >> 24) & 255], 8)) ^ iArr9[2];
                            int a9 = (astk.a(iArr8[(i12 >> 24) & 255], 8) ^ ((astk.a(iArr8[(i10 >> 8) & 255], 24) ^ iArr8[i13 & 255]) ^ astk.a(iArr8[(i11 >> 16) & 255], 16))) ^ iArr9[3];
                            byte[] bArr7 = astk.a;
                            int i20 = (((bArr7[i19 & 255] & 255) ^ ((bArr7[(a7 >> 8) & 255] & 255) << 8)) ^ ((O[(a8 >> 16) & 255] & 255) << 16)) ^ (O[(a9 >> 24) & 255] << 24);
                            int[] iArr10 = iArr[i14 + 1];
                            int i21 = i20 ^ iArr10[0];
                            int i22 = ((((O[a7 & 255] & 255) ^ ((bArr7[(a8 >> 8) & 255] & 255) << 8)) ^ ((bArr7[(a9 >> 16) & 255] & 255) << 16)) ^ (O[(i19 >> 24) & 255] << 24)) ^ iArr10[1];
                            int i23 = ((((O[a8 & 255] & 255) ^ ((bArr7[(a9 >> 8) & 255] & 255) << 8)) ^ ((bArr7[(i19 >> 16) & 255] & 255) << 16)) ^ (bArr7[(a7 >> 24) & 255] << 24)) ^ iArr10[2];
                            int i24 = ((((O[a9 & 255] & 255) ^ ((O[(i19 >> 8) & 255] & 255) << 8)) ^ ((O[(a7 >> 16) & 255] & 255) << 16)) ^ (bArr7[(a8 >> 24) & 255] << 24)) ^ iArr10[3];
                            atow.H(i21, bArr3, i9);
                            atow.H(i22, bArr3, i9 + 4);
                            atow.H(i23, bArr3, i9 + 8);
                            atow.H(i24, bArr3, i9 + 12);
                            i8 = i18 + 16;
                            bArr4 = bArr2;
                            c = 2;
                            i2 = 0;
                            i3 = 1;
                        } else {
                            throw new assz();
                        }
                    } else {
                        throw new assx("input buffer too short");
                    }
                } else {
                    return;
                }
            }
        } catch (Throwable th) {
            throw new IllegalStateException("drbg failure: ".concat(String.valueOf(th.getMessage())), th);
        }
    }

    private final void b(byte[] bArr) {
        byte[] bArr2 = new byte[48];
        System.arraycopy(bArr, 0, bArr2, 0, 48);
        byte[] bArr3 = new byte[32];
        this.b = bArr3;
        byte[] bArr4 = new byte[16];
        this.c = bArr4;
        c(bArr2, bArr3, bArr4);
    }

    private static final void c(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4 = new byte[48];
        for (int i = 0; i < 3; i++) {
            int i2 = 15;
            while (true) {
                if (i2 >= 0) {
                    byte b = bArr3[i2];
                    if ((b & 255) == 255) {
                        bArr3[i2] = 0;
                        i2--;
                    } else {
                        bArr3[i2] = (byte) (b + 1);
                        break;
                    }
                }
            }
            a(bArr2, bArr3, bArr4, i * 16);
        }
        if (bArr != null) {
            for (int i3 = 0; i3 < 48; i3++) {
                bArr4[i3] = (byte) (bArr4[i3] ^ bArr[i3]);
            }
        }
        int length = bArr2.length;
        System.arraycopy(bArr4, 0, bArr2, 0, 32);
        int length2 = bArr3.length;
        System.arraycopy(bArr4, 32, bArr3, 0, 16);
    }

    @Override // java.security.SecureRandom, java.util.Random
    public final void nextBytes(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int length = bArr.length;
        int i = 0;
        while (length > 0) {
            int i2 = 15;
            while (true) {
                if (i2 < 0) {
                    break;
                }
                byte[] bArr3 = this.c;
                byte b = bArr3[i2];
                if ((b & 255) == 255) {
                    bArr3[i2] = 0;
                    i2--;
                } else {
                    bArr3[i2] = (byte) (b + 1);
                    break;
                }
            }
            a(this.b, this.c, bArr2, 0);
            if (length > 15) {
                System.arraycopy(bArr2, 0, bArr, i, 16);
                i += 16;
                length -= 16;
            } else {
                System.arraycopy(bArr2, 0, bArr, i, length);
                length = 0;
            }
        }
        c(null, this.b, this.c);
    }
}
