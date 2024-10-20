package org.whispersystems.curve25519;

/* compiled from: PG */
/* loaded from: classes.dex */
class NativeCurve25519Provider implements Curve25519Provider {
    private static Throwable libraryFailedException = null;
    private static boolean libraryPresent = false;
    private SecureRandomProvider secureRandomProvider = new JCESecureRandomProvider();

    static {
        try {
            System.loadLibrary("curve25519");
            libraryPresent = true;
        } catch (SecurityException | UnsatisfiedLinkError e) {
            libraryPresent = false;
            libraryFailedException = e;
        }
    }

    public NativeCurve25519Provider() {
        if (libraryPresent) {
            try {
                smokeCheck(31337);
                return;
            } catch (UnsatisfiedLinkError e) {
                throw new NoSuchProviderException(e);
            }
        }
        throw new NoSuchProviderException(libraryFailedException);
    }

    private native boolean smokeCheck(int i);

    @Override // org.whispersystems.curve25519.Curve25519Provider
    public native byte[] calculateAgreement(byte[] bArr, byte[] bArr2);

    @Override // org.whispersystems.curve25519.Curve25519Provider
    public native byte[] calculateSignature(byte[] bArr, byte[] bArr2, byte[] bArr3);

    @Override // org.whispersystems.curve25519.Curve25519Provider
    public native byte[] calculateVrfSignature(byte[] bArr, byte[] bArr2, byte[] bArr3);

    @Override // org.whispersystems.curve25519.Curve25519Provider
    public byte[] generatePrivateKey() {
        return generatePrivateKey(getRandom(32));
    }

    @Override // org.whispersystems.curve25519.Curve25519Provider
    public native byte[] generatePrivateKey(byte[] bArr);

    @Override // org.whispersystems.curve25519.Curve25519Provider
    public native byte[] generatePublicKey(byte[] bArr);

    @Override // org.whispersystems.curve25519.Curve25519Provider
    public byte[] getRandom(int i) {
        byte[] bArr = new byte[i];
        this.secureRandomProvider.nextBytes(bArr);
        return bArr;
    }

    @Override // org.whispersystems.curve25519.Curve25519Provider
    public boolean isNative() {
        return true;
    }

    @Override // org.whispersystems.curve25519.Curve25519Provider
    public void setRandomProvider(SecureRandomProvider secureRandomProvider) {
        this.secureRandomProvider = secureRandomProvider;
    }

    @Override // org.whispersystems.curve25519.Curve25519Provider
    public native boolean verifySignature(byte[] bArr, byte[] bArr2, byte[] bArr3);

    @Override // org.whispersystems.curve25519.Curve25519Provider
    public native byte[] verifyVrfSignature(byte[] bArr, byte[] bArr2, byte[] bArr3);
}
