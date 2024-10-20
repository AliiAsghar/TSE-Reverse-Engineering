package org.whispersystems.curve25519;

/* compiled from: PG */
/* loaded from: classes.dex */
public class JavaCurve25519Provider extends BaseJavaCurve25519Provider {
    /* JADX INFO: Access modifiers changed from: protected */
    public JavaCurve25519Provider() {
        super(new JCESha512Provider(), new JCESecureRandomProvider());
    }

    @Override // org.whispersystems.curve25519.BaseJavaCurve25519Provider, org.whispersystems.curve25519.Curve25519Provider
    public /* bridge */ /* synthetic */ byte[] calculateAgreement(byte[] bArr, byte[] bArr2) {
        return super.calculateAgreement(bArr, bArr2);
    }

    @Override // org.whispersystems.curve25519.BaseJavaCurve25519Provider, org.whispersystems.curve25519.Curve25519Provider
    public /* bridge */ /* synthetic */ byte[] calculateSignature(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return super.calculateSignature(bArr, bArr2, bArr3);
    }

    @Override // org.whispersystems.curve25519.BaseJavaCurve25519Provider, org.whispersystems.curve25519.Curve25519Provider
    public /* bridge */ /* synthetic */ byte[] calculateVrfSignature(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return super.calculateVrfSignature(bArr, bArr2, bArr3);
    }

    @Override // org.whispersystems.curve25519.BaseJavaCurve25519Provider, org.whispersystems.curve25519.Curve25519Provider
    public /* bridge */ /* synthetic */ byte[] generatePrivateKey() {
        return super.generatePrivateKey();
    }

    @Override // org.whispersystems.curve25519.BaseJavaCurve25519Provider, org.whispersystems.curve25519.Curve25519Provider
    public /* bridge */ /* synthetic */ byte[] generatePublicKey(byte[] bArr) {
        return super.generatePublicKey(bArr);
    }

    @Override // org.whispersystems.curve25519.BaseJavaCurve25519Provider, org.whispersystems.curve25519.Curve25519Provider
    public /* bridge */ /* synthetic */ byte[] getRandom(int i) {
        return super.getRandom(i);
    }

    @Override // org.whispersystems.curve25519.BaseJavaCurve25519Provider, org.whispersystems.curve25519.Curve25519Provider
    public boolean isNative() {
        return false;
    }

    @Override // org.whispersystems.curve25519.BaseJavaCurve25519Provider, org.whispersystems.curve25519.Curve25519Provider
    public /* bridge */ /* synthetic */ void setRandomProvider(SecureRandomProvider secureRandomProvider) {
        super.setRandomProvider(secureRandomProvider);
    }

    @Override // org.whispersystems.curve25519.BaseJavaCurve25519Provider, org.whispersystems.curve25519.Curve25519Provider
    public /* bridge */ /* synthetic */ boolean verifySignature(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return super.verifySignature(bArr, bArr2, bArr3);
    }

    @Override // org.whispersystems.curve25519.BaseJavaCurve25519Provider, org.whispersystems.curve25519.Curve25519Provider
    public /* bridge */ /* synthetic */ byte[] verifyVrfSignature(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return super.verifyVrfSignature(bArr, bArr2, bArr3);
    }

    @Override // org.whispersystems.curve25519.BaseJavaCurve25519Provider, org.whispersystems.curve25519.Curve25519Provider
    public /* bridge */ /* synthetic */ byte[] generatePrivateKey(byte[] bArr) {
        return super.generatePrivateKey(bArr);
    }
}
