package org.whispersystems.curve25519;

/* compiled from: PG */
/* loaded from: classes.dex */
public class Curve25519 {
    public static final String BEST = "best";
    public static final String J2ME = "j2me";
    public static final String JAVA = "java";
    public static final String NATIVE = "native";
    private final Curve25519Provider provider;

    private Curve25519(Curve25519Provider curve25519Provider) {
        this.provider = curve25519Provider;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static Curve25519Provider constructClass(String str, SecureRandomProvider secureRandomProvider) {
        char c;
        Class<?> cls;
        try {
            switch (str.hashCode()) {
                case -1052618729:
                    if (str.equals(NATIVE)) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 3020260:
                    if (str.equals(BEST)) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 3209376:
                    if (str.equals(J2ME)) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3254818:
                    if (str.equals(JAVA)) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c != 0) {
                if (c != 1) {
                    if (c != 2) {
                        if (c == 3) {
                            cls = Class.forName("org.whispersystems.curve25519.OpportunisticCurve25519Provider");
                        } else {
                            throw new NoSuchProviderException("No such provider");
                        }
                    } else {
                        cls = Class.forName("org.whispersystems.curve25519.J2meCurve25519Provider");
                    }
                } else {
                    cls = Class.forName("org.whispersystems.curve25519.JavaCurve25519Provider");
                }
            } else {
                cls = Class.forName("org.whispersystems.curve25519.NativeCurve25519Provider");
            }
            Curve25519Provider curve25519Provider = (Curve25519Provider) cls.newInstance();
            if (secureRandomProvider != null) {
                curve25519Provider.setRandomProvider(secureRandomProvider);
            }
            return curve25519Provider;
        } catch (ClassNotFoundException e) {
            throw new NoSuchProviderException(e);
        } catch (IllegalAccessException e2) {
            throw new NoSuchProviderException(e2);
        } catch (InstantiationException e3) {
            throw new NoSuchProviderException(e3);
        }
    }

    private static Curve25519Provider constructJ2meProvider(SecureRandomProvider secureRandomProvider) {
        return constructClass(J2ME, secureRandomProvider);
    }

    private static Curve25519Provider constructJavaProvider(SecureRandomProvider secureRandomProvider) {
        return constructClass(JAVA, secureRandomProvider);
    }

    private static Curve25519Provider constructNativeProvider(SecureRandomProvider secureRandomProvider) {
        return constructClass(NATIVE, secureRandomProvider);
    }

    private static Curve25519Provider constructOpportunisticProvider(SecureRandomProvider secureRandomProvider) {
        return constructClass(BEST, secureRandomProvider);
    }

    public static Curve25519 getInstance(String str) {
        return getInstance(str, null);
    }

    public byte[] calculateAgreement(byte[] bArr, byte[] bArr2) {
        if (bArr != null && bArr2 != null) {
            if (bArr.length == 32 && bArr2.length == 32) {
                return this.provider.calculateAgreement(bArr2, bArr);
            }
            throw new IllegalArgumentException("Keys must be 32 bytes!");
        }
        throw new IllegalArgumentException("Keys must not be null!");
    }

    public byte[] calculateSignature(byte[] bArr, byte[] bArr2) {
        if (bArr != null && bArr.length == 32) {
            Curve25519Provider curve25519Provider = this.provider;
            return curve25519Provider.calculateSignature(curve25519Provider.getRandom(64), bArr, bArr2);
        }
        throw new IllegalArgumentException("Invalid private key length!");
    }

    public byte[] calculateVrfSignature(byte[] bArr, byte[] bArr2) {
        if (bArr != null && bArr.length == 32) {
            Curve25519Provider curve25519Provider = this.provider;
            return curve25519Provider.calculateVrfSignature(curve25519Provider.getRandom(64), bArr, bArr2);
        }
        throw new IllegalArgumentException("Invalid private key!");
    }

    public Curve25519KeyPair generateKeyPair() {
        Curve25519Provider curve25519Provider = this.provider;
        byte[] generatePrivateKey = curve25519Provider.generatePrivateKey();
        return new Curve25519KeyPair(curve25519Provider.generatePublicKey(generatePrivateKey), generatePrivateKey);
    }

    public boolean isNative() {
        return this.provider.isNative();
    }

    public boolean verifySignature(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr != null && bArr.length == 32) {
            if (bArr2 != null && bArr3 != null && bArr3.length == 64) {
                return this.provider.verifySignature(bArr, bArr2, bArr3);
            }
            return false;
        }
        throw new IllegalArgumentException("Invalid public key!");
    }

    public byte[] verifyVrfSignature(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr != null && bArr.length == 32) {
            if (bArr2 != null && bArr3 != null && bArr3.length == 96) {
                return this.provider.verifyVrfSignature(bArr, bArr2, bArr3);
            }
            throw new VrfSignatureVerificationFailedException("Invalid message or signature format");
        }
        throw new IllegalArgumentException("Invalid public key!");
    }

    public static Curve25519 getInstance(String str, SecureRandomProvider secureRandomProvider) {
        if (NATIVE.equals(str)) {
            return new Curve25519(constructNativeProvider(secureRandomProvider));
        }
        if (JAVA.equals(str)) {
            return new Curve25519(constructJavaProvider(secureRandomProvider));
        }
        if (J2ME.equals(str)) {
            return new Curve25519(constructJ2meProvider(secureRandomProvider));
        }
        if (BEST.equals(str)) {
            return new Curve25519(constructOpportunisticProvider(secureRandomProvider));
        }
        throw new NoSuchProviderException(str);
    }
}
