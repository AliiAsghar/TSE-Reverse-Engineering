package org.whispersystems.curve25519;

import org.whispersystems.curve25519.java.Sha512;
import org.whispersystems.curve25519.java.curve_sigs;
import org.whispersystems.curve25519.java.scalarmult;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class BaseJavaCurve25519Provider implements Curve25519Provider {
    private SecureRandomProvider secureRandomProvider;
    private final Sha512 sha512provider;

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseJavaCurve25519Provider(Sha512 sha512, SecureRandomProvider secureRandomProvider) {
        this.sha512provider = sha512;
        this.secureRandomProvider = secureRandomProvider;
    }

    @Override // org.whispersystems.curve25519.Curve25519Provider
    public byte[] calculateAgreement(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[32];
        scalarmult.crypto_scalarmult(bArr3, bArr, bArr2);
        return bArr3;
    }

    @Override // org.whispersystems.curve25519.Curve25519Provider
    public byte[] calculateSignature(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4 = new byte[64];
        curve_sigs.curve25519_sign(this.sha512provider, bArr4, bArr2, bArr3, bArr3.length, bArr);
        return bArr4;
    }

    @Override // org.whispersystems.curve25519.Curve25519Provider
    public byte[] calculateVrfSignature(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        throw new AssertionError("NYI");
    }

    @Override // org.whispersystems.curve25519.Curve25519Provider
    public byte[] generatePrivateKey() {
        return generatePrivateKey(getRandom(32));
    }

    @Override // org.whispersystems.curve25519.Curve25519Provider
    public byte[] generatePublicKey(byte[] bArr) {
        byte[] bArr2 = new byte[32];
        curve_sigs.curve25519_keygen(bArr2, bArr);
        return bArr2;
    }

    @Override // org.whispersystems.curve25519.Curve25519Provider
    public byte[] getRandom(int i) {
        byte[] bArr = new byte[i];
        this.secureRandomProvider.nextBytes(bArr);
        return bArr;
    }

    @Override // org.whispersystems.curve25519.Curve25519Provider
    public abstract boolean isNative();

    @Override // org.whispersystems.curve25519.Curve25519Provider
    public void setRandomProvider(SecureRandomProvider secureRandomProvider) {
        this.secureRandomProvider = secureRandomProvider;
    }

    @Override // org.whispersystems.curve25519.Curve25519Provider
    public boolean verifySignature(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (curve_sigs.curve25519_verify(this.sha512provider, bArr3, bArr, bArr2, bArr2.length) == 0) {
            return true;
        }
        return false;
    }

    @Override // org.whispersystems.curve25519.Curve25519Provider
    public byte[] verifyVrfSignature(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        throw new AssertionError("NYI");
    }

    @Override // org.whispersystems.curve25519.Curve25519Provider
    public byte[] generatePrivateKey(byte[] bArr) {
        byte[] bArr2 = new byte[32];
        System.arraycopy(bArr, 0, bArr2, 0, 32);
        bArr2[0] = (byte) (bArr2[0] & 248);
        bArr2[31] = (byte) ((bArr2[31] & Byte.MAX_VALUE) | 64);
        return bArr2;
    }
}
