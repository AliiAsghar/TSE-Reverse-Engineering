package org.whispersystems.curve25519.java;

/* compiled from: PG */
/* loaded from: classes.dex */
public class open {
    public static int crypto_sign_open(Sha512 sha512, byte[] bArr, long j, byte[] bArr2, long j2, byte[] bArr3) {
        byte[] bArr4 = new byte[32];
        byte[] bArr5 = new byte[32];
        byte[] bArr6 = new byte[32];
        byte[] bArr7 = new byte[64];
        byte[] bArr8 = new byte[32];
        ge_p3 ge_p3Var = new ge_p3();
        ge_p2 ge_p2Var = new ge_p2();
        if (j2 >= 64 && (bArr2[63] & 224) == 0 && ge_frombytes.ge_frombytes_negate_vartime(ge_p3Var, bArr3) == 0) {
            sha512.calculateDigest(new byte[64], bArr3, 32L);
            System.arraycopy(bArr3, 0, bArr4, 0, 32);
            System.arraycopy(bArr2, 0, bArr5, 0, 32);
            System.arraycopy(bArr2, 32, bArr6, 0, 32);
            System.arraycopy(bArr2, 0, bArr, 0, (int) j2);
            System.arraycopy(bArr4, 0, bArr, 32, 32);
            sha512.calculateDigest(bArr7, bArr, j2);
            sc_reduce.sc_reduce(bArr7);
            ge_double_scalarmult.ge_double_scalarmult_vartime(ge_p2Var, bArr7, ge_p3Var, bArr6);
            ge_tobytes.ge_tobytes(bArr8, ge_p2Var);
            if (crypto_verify_32.crypto_verify_32(bArr8, bArr5) == 0) {
                System.arraycopy(bArr, 64, bArr, 0, (int) (j2 - 64));
                return 0;
            }
            return -1;
        }
        return -1;
    }
}
