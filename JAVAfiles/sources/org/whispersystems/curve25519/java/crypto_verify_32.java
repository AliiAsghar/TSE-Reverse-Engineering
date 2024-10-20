package org.whispersystems.curve25519.java;

/* compiled from: PG */
/* loaded from: classes.dex */
public class crypto_verify_32 {
    public static int crypto_verify_32(byte[] bArr, byte[] bArr2) {
        int i = 0;
        for (int i2 = 0; i2 < 32; i2++) {
            i |= bArr[i2] ^ bArr2[i2];
        }
        return i;
    }
}
