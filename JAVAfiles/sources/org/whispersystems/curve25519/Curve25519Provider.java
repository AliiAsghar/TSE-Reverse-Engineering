package org.whispersystems.curve25519;

/* compiled from: PG */
/* loaded from: classes.dex */
interface Curve25519Provider {
    public static final int PRIVATE_KEY_LEN = 32;

    byte[] calculateAgreement(byte[] bArr, byte[] bArr2);

    byte[] calculateSignature(byte[] bArr, byte[] bArr2, byte[] bArr3);

    byte[] calculateVrfSignature(byte[] bArr, byte[] bArr2, byte[] bArr3);

    byte[] generatePrivateKey();

    byte[] generatePrivateKey(byte[] bArr);

    byte[] generatePublicKey(byte[] bArr);

    byte[] getRandom(int i);

    boolean isNative();

    void setRandomProvider(SecureRandomProvider secureRandomProvider);

    boolean verifySignature(byte[] bArr, byte[] bArr2, byte[] bArr3);

    byte[] verifyVrfSignature(byte[] bArr, byte[] bArr2, byte[] bArr3);
}
