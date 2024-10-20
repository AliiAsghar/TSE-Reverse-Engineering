package org.whispersystems.curve25519.java;

/* compiled from: PG */
/* loaded from: classes.dex */
public class curve_sigs {
    public static void curve25519_keygen(byte[] bArr, byte[] bArr2) {
        ge_p3 ge_p3Var = new ge_p3();
        int[] iArr = new int[10];
        int[] iArr2 = new int[10];
        int[] iArr3 = new int[10];
        int[] iArr4 = new int[10];
        ge_scalarmult_base.ge_scalarmult_base(ge_p3Var, bArr2);
        fe_add.fe_add(iArr, ge_p3Var.Y, ge_p3Var.Z);
        fe_sub.fe_sub(iArr2, ge_p3Var.Z, ge_p3Var.Y);
        fe_invert.fe_invert(iArr3, iArr2);
        fe_mul.fe_mul(iArr4, iArr, iArr3);
        fe_tobytes.fe_tobytes(bArr, iArr4);
    }

    public static int curve25519_sign(Sha512 sha512, byte[] bArr, byte[] bArr2, byte[] bArr3, int i, byte[] bArr4) {
        ge_p3 ge_p3Var = new ge_p3();
        byte[] bArr5 = new byte[32];
        byte[] bArr6 = new byte[i + 128];
        ge_scalarmult_base.ge_scalarmult_base(ge_p3Var, bArr2);
        ge_p3_tobytes.ge_p3_tobytes(bArr5, ge_p3Var);
        int i2 = bArr5[31] & 128;
        sign_modified.crypto_sign_modified(sha512, bArr6, bArr3, i, bArr2, bArr5, bArr4);
        System.arraycopy(bArr6, 0, bArr, 0, 64);
        int i3 = bArr[63] & Byte.MAX_VALUE;
        bArr[63] = (byte) i3;
        bArr[63] = (byte) (((byte) i2) | i3);
        return 0;
    }

    public static int curve25519_verify(Sha512 sha512, byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        int i2 = i + 64;
        int[] iArr = new int[10];
        int[] iArr2 = new int[10];
        int[] iArr3 = new int[10];
        int[] iArr4 = new int[10];
        int[] iArr5 = new int[10];
        int[] iArr6 = new int[10];
        byte[] bArr4 = new byte[32];
        byte[] bArr5 = new byte[i2];
        fe_frombytes.fe_frombytes(iArr, bArr2);
        fe_1.fe_1(iArr5);
        fe_sub.fe_sub(iArr2, iArr, iArr5);
        fe_add.fe_add(iArr3, iArr, iArr5);
        fe_invert.fe_invert(iArr4, iArr3);
        fe_mul.fe_mul(iArr6, iArr2, iArr4);
        fe_tobytes.fe_tobytes(bArr4, iArr6);
        int i3 = bArr4[31] & Byte.MAX_VALUE;
        bArr4[31] = (byte) i3;
        bArr4[31] = (byte) (i3 | (bArr[63] & 128));
        System.arraycopy(bArr, 0, bArr5, 0, 64);
        bArr5[63] = (byte) (bArr5[63] & Byte.MAX_VALUE);
        System.arraycopy(bArr3, 0, bArr5, 64, i);
        return open.crypto_sign_open(sha512, new byte[i2], 0L, bArr5, i2, bArr4);
    }
}
