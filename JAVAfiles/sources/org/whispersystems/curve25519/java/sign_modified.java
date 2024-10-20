package org.whispersystems.curve25519.java;

/* compiled from: PG */
/* loaded from: classes.dex */
public class sign_modified {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int crypto_sign_modified(Sha512 sha512, byte[] bArr, byte[] bArr2, long j, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        byte[] bArr6 = new byte[64];
        byte[] bArr7 = new byte[64];
        ge_p3 ge_p3Var = new ge_p3();
        System.arraycopy(bArr2, 0, bArr, 64, (int) j);
        System.arraycopy(bArr3, 0, bArr, 32, 32);
        bArr[0] = -2;
        for (int i = 1; i < 32; i++) {
            bArr[i] = -1;
        }
        long j2 = 64 + j;
        System.arraycopy(bArr5, 0, bArr, (int) j2, 64);
        sha512.calculateDigest(bArr6, bArr, j + 128);
        System.arraycopy(bArr4, 0, bArr, 32, 32);
        sc_reduce.sc_reduce(bArr6);
        ge_scalarmult_base.ge_scalarmult_base(ge_p3Var, bArr6);
        ge_p3_tobytes.ge_p3_tobytes(bArr, ge_p3Var);
        sha512.calculateDigest(bArr7, bArr, j2);
        sc_reduce.sc_reduce(bArr7);
        byte[] bArr8 = new byte[32];
        sc_muladd.sc_muladd(bArr8, bArr7, bArr3, bArr6);
        System.arraycopy(bArr8, 0, bArr, 32, 32);
        return 0;
    }
}
