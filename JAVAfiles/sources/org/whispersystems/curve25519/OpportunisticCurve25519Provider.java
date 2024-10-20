package org.whispersystems.curve25519;

/* compiled from: PG */
/* loaded from: classes.dex */
public class OpportunisticCurve25519Provider implements Curve25519Provider {
    private Curve25519Provider delegate;

    OpportunisticCurve25519Provider() {
        try {
            this.delegate = new NativeCurve25519Provider();
        } catch (NoSuchProviderException unused) {
            this.delegate = new JavaCurve25519Provider();
        }
    }

    @Override // org.whispersystems.curve25519.Curve25519Provider
    public byte[] calculateAgreement(byte[] bArr, byte[] bArr2) {
        return this.delegate.calculateAgreement(bArr, bArr2);
    }

    @Override // org.whispersystems.curve25519.Curve25519Provider
    public byte[] calculateSignature(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return this.delegate.calculateSignature(bArr, bArr2, bArr3);
    }

    @Override // org.whispersystems.curve25519.Curve25519Provider
    public byte[] calculateVrfSignature(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return this.delegate.calculateVrfSignature(bArr, bArr2, bArr3);
    }

    @Override // org.whispersystems.curve25519.Curve25519Provider
    public byte[] generatePrivateKey() {
        return this.delegate.generatePrivateKey();
    }

    @Override // org.whispersystems.curve25519.Curve25519Provider
    public byte[] generatePublicKey(byte[] bArr) {
        return this.delegate.generatePublicKey(bArr);
    }

    @Override // org.whispersystems.curve25519.Curve25519Provider
    public byte[] getRandom(int i) {
        return this.delegate.getRandom(i);
    }

    @Override // org.whispersystems.curve25519.Curve25519Provider
    public boolean isNative() {
        return this.delegate.isNative();
    }

    @Override // org.whispersystems.curve25519.Curve25519Provider
    public void setRandomProvider(SecureRandomProvider secureRandomProvider) {
        this.delegate.setRandomProvider(secureRandomProvider);
    }

    @Override // org.whispersystems.curve25519.Curve25519Provider
    public boolean verifySignature(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return this.delegate.verifySignature(bArr, bArr2, bArr3);
    }

    @Override // org.whispersystems.curve25519.Curve25519Provider
    public byte[] verifyVrfSignature(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return this.delegate.verifyVrfSignature(bArr, bArr2, bArr3);
    }

    @Override // org.whispersystems.curve25519.Curve25519Provider
    public byte[] generatePrivateKey(byte[] bArr) {
        return this.delegate.generatePrivateKey(bArr);
    }
}
