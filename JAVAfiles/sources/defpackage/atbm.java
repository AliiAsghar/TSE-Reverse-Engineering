package defpackage;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atbm extends KeyFactorySpi implements asum {
    private final /* synthetic */ int a;

    public atbm(int i, byte[] bArr) {
        this.a = i;
    }

    @Override // defpackage.asum
    public final PrivateKey a(PrivateKeyInfo privateKeyInfo) {
        throw null;
    }

    @Override // defpackage.asum
    public final PublicKey b(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        switch (this.a) {
            case 0:
                return new atbl(subjectPublicKeyInfo);
            case 1:
                return new atbj(subjectPublicKeyInfo);
            case 2:
                return new atbu(subjectPublicKeyInfo);
            case 3:
                return new atbz(subjectPublicKeyInfo);
            case 4:
                return new atcb(subjectPublicKeyInfo);
            case 5:
                return new atcd(subjectPublicKeyInfo);
            case 6:
                return new atcf(subjectPublicKeyInfo);
            case 7:
                return new atch(subjectPublicKeyInfo);
            case 8:
                return new atcj(subjectPublicKeyInfo);
            case 9:
                return new atco(subjectPublicKeyInfo);
            default:
                return new atcm(subjectPublicKeyInfo);
        }
    }

    @Override // java.security.KeyFactorySpi
    public final PrivateKey engineGeneratePrivate(KeySpec keySpec) {
        switch (this.a) {
            case 0:
                if (keySpec instanceof PKCS8EncodedKeySpec) {
                    try {
                        return new atbk(PrivateKeyInfo.b(ASN1Primitive.v(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
                    } catch (Exception e) {
                        throw new InvalidKeySpecException(e.toString());
                    }
                }
                throw new InvalidKeySpecException(hht.k(keySpec, "Unsupported key specification: "));
            case 1:
                if (keySpec instanceof PKCS8EncodedKeySpec) {
                    try {
                        return new atbi(PrivateKeyInfo.b(ASN1Primitive.v(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
                    } catch (Exception e2) {
                        throw new InvalidKeySpecException(e2.toString());
                    }
                }
                throw new InvalidKeySpecException(hht.k(keySpec, "Unsupported key specification: "));
            case 2:
                if (keySpec instanceof PKCS8EncodedKeySpec) {
                    try {
                        return new atbt(PrivateKeyInfo.b(ASN1Primitive.v(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
                    } catch (Exception e3) {
                        throw new InvalidKeySpecException(e3.toString());
                    }
                }
                throw new InvalidKeySpecException(hht.k(keySpec, "Unsupported key specification: "));
            case 3:
                if (keySpec instanceof PKCS8EncodedKeySpec) {
                    try {
                        return new atby(PrivateKeyInfo.b(ASN1Primitive.v(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
                    } catch (Exception e4) {
                        throw new InvalidKeySpecException(e4.toString(), e4);
                    }
                }
                throw new InvalidKeySpecException(hht.k(keySpec, "unsupported key specification: "));
            case 4:
                if (keySpec instanceof PKCS8EncodedKeySpec) {
                    try {
                        return new atca(PrivateKeyInfo.b(ASN1Primitive.v(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
                    } catch (Exception e5) {
                        throw new InvalidKeySpecException(e5.toString());
                    }
                }
                throw new InvalidKeySpecException(hht.k(keySpec, "Unsupported key specification: "));
            case 5:
                if (keySpec instanceof PKCS8EncodedKeySpec) {
                    try {
                        return new atcc(PrivateKeyInfo.b(ASN1Primitive.v(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
                    } catch (Exception e6) {
                        throw new InvalidKeySpecException(e6.toString());
                    }
                }
                throw new InvalidKeySpecException(hht.k(keySpec, "Unsupported key specification: "));
            case 6:
                if (keySpec instanceof PKCS8EncodedKeySpec) {
                    try {
                        return new atce(PrivateKeyInfo.b(ASN1Primitive.v(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
                    } catch (Exception e7) {
                        throw new InvalidKeySpecException(e7.toString());
                    }
                }
                throw new InvalidKeySpecException(hht.k(keySpec, "Unsupported key specification: "));
            case 7:
                if (keySpec instanceof PKCS8EncodedKeySpec) {
                    try {
                        return new atcg(PrivateKeyInfo.b(ASN1Primitive.v(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
                    } catch (Exception e8) {
                        throw new InvalidKeySpecException(e8.toString());
                    }
                }
                throw new InvalidKeySpecException(hht.k(keySpec, "Unsupported key specification: "));
            case 8:
                if (keySpec instanceof PKCS8EncodedKeySpec) {
                    try {
                        return new atci(PrivateKeyInfo.b(ASN1Primitive.v(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
                    } catch (Exception e9) {
                        throw new InvalidKeySpecException(e9.toString());
                    }
                }
                throw new InvalidKeySpecException(hht.k(keySpec, "Unsupported key specification: "));
            case 9:
                if (keySpec instanceof PKCS8EncodedKeySpec) {
                    try {
                        return new atcn(PrivateKeyInfo.b(ASN1Primitive.v(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
                    } catch (Exception e10) {
                        throw new InvalidKeySpecException(e10.toString());
                    }
                }
                throw new InvalidKeySpecException(hht.k(keySpec, "unsupported key specification: "));
            default:
                if (keySpec instanceof PKCS8EncodedKeySpec) {
                    try {
                        return new atcl(PrivateKeyInfo.b(ASN1Primitive.v(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
                    } catch (Exception e11) {
                        throw new InvalidKeySpecException(e11.toString());
                    }
                }
                throw new InvalidKeySpecException(hht.k(keySpec, "unsupported key specification: "));
        }
    }

    @Override // java.security.KeyFactorySpi
    public final PublicKey engineGeneratePublic(KeySpec keySpec) {
        switch (this.a) {
            case 0:
                if (keySpec instanceof X509EncodedKeySpec) {
                    try {
                        return new atbl(SubjectPublicKeyInfo.b(((X509EncodedKeySpec) keySpec).getEncoded()));
                    } catch (Exception e) {
                        throw new InvalidKeySpecException(e.toString());
                    }
                }
                throw new InvalidKeySpecException(hht.b(keySpec, "Unknown key specification: ", "."));
            case 1:
                if (keySpec instanceof X509EncodedKeySpec) {
                    try {
                        return new atbj(SubjectPublicKeyInfo.b(((X509EncodedKeySpec) keySpec).getEncoded()));
                    } catch (Exception e2) {
                        throw new InvalidKeySpecException(e2.toString());
                    }
                }
                throw new InvalidKeySpecException(hht.b(keySpec, "Unknown key specification: ", "."));
            case 2:
                if (keySpec instanceof X509EncodedKeySpec) {
                    try {
                        return new atbu(SubjectPublicKeyInfo.b(((X509EncodedKeySpec) keySpec).getEncoded()));
                    } catch (Exception e3) {
                        throw new InvalidKeySpecException(e3.toString());
                    }
                }
                throw new InvalidKeySpecException(hht.b(keySpec, "Unknown key specification: ", "."));
            case 3:
                if (keySpec instanceof X509EncodedKeySpec) {
                    try {
                        return new atbz(SubjectPublicKeyInfo.b(((X509EncodedKeySpec) keySpec).getEncoded()));
                    } catch (Exception e4) {
                        throw new InvalidKeySpecException(e4.toString(), e4);
                    }
                }
                throw new InvalidKeySpecException(hht.b(keySpec, "unknown key specification: ", "."));
            case 4:
                if (keySpec instanceof X509EncodedKeySpec) {
                    try {
                        return new atcb(SubjectPublicKeyInfo.b(((X509EncodedKeySpec) keySpec).getEncoded()));
                    } catch (Exception e5) {
                        throw new InvalidKeySpecException(e5.toString());
                    }
                }
                throw new InvalidKeySpecException(hht.b(keySpec, "Unknown key specification: ", "."));
            case 5:
                if (keySpec instanceof X509EncodedKeySpec) {
                    try {
                        return new atcd(SubjectPublicKeyInfo.b(((X509EncodedKeySpec) keySpec).getEncoded()));
                    } catch (Exception e6) {
                        throw new InvalidKeySpecException(e6.toString());
                    }
                }
                throw new InvalidKeySpecException(hht.b(keySpec, "Unknown key specification: ", "."));
            case 6:
                if (keySpec instanceof X509EncodedKeySpec) {
                    try {
                        return new atcf(SubjectPublicKeyInfo.b(((X509EncodedKeySpec) keySpec).getEncoded()));
                    } catch (Exception e7) {
                        throw new InvalidKeySpecException(e7.toString());
                    }
                }
                throw new InvalidKeySpecException(hht.b(keySpec, "Unknown key specification: ", "."));
            case 7:
                if (keySpec instanceof X509EncodedKeySpec) {
                    try {
                        return new atch(SubjectPublicKeyInfo.b(((X509EncodedKeySpec) keySpec).getEncoded()));
                    } catch (Exception e8) {
                        throw new InvalidKeySpecException(e8.toString());
                    }
                }
                throw new InvalidKeySpecException(hht.b(keySpec, "Unknown key specification: ", "."));
            case 8:
                if (keySpec instanceof X509EncodedKeySpec) {
                    try {
                        return new atcj(SubjectPublicKeyInfo.b(((X509EncodedKeySpec) keySpec).getEncoded()));
                    } catch (Exception e9) {
                        throw new InvalidKeySpecException(e9.toString());
                    }
                }
                throw new InvalidKeySpecException(hht.b(keySpec, "Unknown key specification: ", "."));
            case 9:
                if (keySpec instanceof X509EncodedKeySpec) {
                    try {
                        return new atco(SubjectPublicKeyInfo.b(((X509EncodedKeySpec) keySpec).getEncoded()));
                    } catch (Exception e10) {
                        throw new InvalidKeySpecException(e10.toString());
                    }
                }
                throw new InvalidKeySpecException(hht.b(keySpec, "unknown key specification: ", "."));
            default:
                if (keySpec instanceof X509EncodedKeySpec) {
                    try {
                        return new atcm(SubjectPublicKeyInfo.b(((X509EncodedKeySpec) keySpec).getEncoded()));
                    } catch (Exception e11) {
                        throw new InvalidKeySpecException(e11.toString());
                    }
                }
                throw new InvalidKeySpecException(hht.b(keySpec, "unknown key specification: ", "."));
        }
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) {
        switch (this.a) {
            case 0:
                if (key instanceof atbk) {
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new PKCS8EncodedKeySpec(key.getEncoded());
                    }
                } else if (key instanceof atbl) {
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new X509EncodedKeySpec(key.getEncoded());
                    }
                } else {
                    throw new InvalidKeySpecException(hht.l(key, "Unsupported key type: "));
                }
                throw new InvalidKeySpecException(hht.b(cls, "Unknown key specification: ", "."));
            case 1:
                if (key instanceof atbi) {
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new PKCS8EncodedKeySpec(key.getEncoded());
                    }
                } else if (key instanceof atbj) {
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new X509EncodedKeySpec(key.getEncoded());
                    }
                } else {
                    throw new InvalidKeySpecException(hht.l(key, "Unsupported key type: "));
                }
                throw new InvalidKeySpecException(hht.b(cls, "Unknown key specification: ", "."));
            case 2:
                if (key instanceof atbt) {
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new PKCS8EncodedKeySpec(key.getEncoded());
                    }
                } else if (key instanceof atbu) {
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new X509EncodedKeySpec(key.getEncoded());
                    }
                } else {
                    throw new InvalidKeySpecException(hht.l(key, "Unsupported key type: "));
                }
                throw new InvalidKeySpecException(hht.b(cls, "Unknown key specification: ", "."));
            case 3:
                if (key instanceof atby) {
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new PKCS8EncodedKeySpec(key.getEncoded());
                    }
                } else if (key instanceof atbz) {
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new X509EncodedKeySpec(key.getEncoded());
                    }
                } else {
                    throw new InvalidKeySpecException(hht.l(key, "unsupported key type: "));
                }
                throw new InvalidKeySpecException(hht.b(cls, "unknown key specification: ", "."));
            case 4:
                if (key instanceof atca) {
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new PKCS8EncodedKeySpec(key.getEncoded());
                    }
                } else if (key instanceof atcb) {
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new X509EncodedKeySpec(key.getEncoded());
                    }
                } else {
                    throw new InvalidKeySpecException(hht.l(key, "Unsupported key type: "));
                }
                throw new InvalidKeySpecException(hht.b(cls, "Unknown key specification: ", "."));
            case 5:
                if (key instanceof atcc) {
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new PKCS8EncodedKeySpec(key.getEncoded());
                    }
                } else if (key instanceof atcd) {
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new X509EncodedKeySpec(key.getEncoded());
                    }
                } else {
                    throw new InvalidKeySpecException(hht.l(key, "Unsupported key type: "));
                }
                throw new InvalidKeySpecException(hht.b(cls, "Unknown key specification: ", "."));
            case 6:
                if (key instanceof atce) {
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new PKCS8EncodedKeySpec(key.getEncoded());
                    }
                } else if (key instanceof atcf) {
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new X509EncodedKeySpec(key.getEncoded());
                    }
                } else {
                    throw new InvalidKeySpecException(hht.l(key, "Unsupported key type: "));
                }
                throw new InvalidKeySpecException(hht.b(cls, "Unknown key specification: ", "."));
            case 7:
                if (key instanceof atcg) {
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new PKCS8EncodedKeySpec(key.getEncoded());
                    }
                } else if (key instanceof atch) {
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new X509EncodedKeySpec(key.getEncoded());
                    }
                } else {
                    throw new InvalidKeySpecException(hht.l(key, "Unsupported key type: "));
                }
                throw new InvalidKeySpecException(hht.b(cls, "Unknown key specification: ", "."));
            case 8:
                if (key instanceof atci) {
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new PKCS8EncodedKeySpec(key.getEncoded());
                    }
                } else if (key instanceof atcj) {
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new X509EncodedKeySpec(key.getEncoded());
                    }
                } else {
                    throw new InvalidKeySpecException(hht.l(key, "Unsupported key type: "));
                }
                throw new InvalidKeySpecException(hht.b(cls, "Unknown key specification: ", "."));
            case 9:
                if (key instanceof atcn) {
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new PKCS8EncodedKeySpec(key.getEncoded());
                    }
                } else if (key instanceof atco) {
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new X509EncodedKeySpec(key.getEncoded());
                    }
                } else {
                    throw new InvalidKeySpecException(hht.l(key, "unsupported key type: "));
                }
                throw new InvalidKeySpecException(hht.b(cls, "unknown key specification: ", "."));
            default:
                if (key instanceof atcl) {
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new PKCS8EncodedKeySpec(key.getEncoded());
                    }
                } else if (key instanceof atcm) {
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new X509EncodedKeySpec(key.getEncoded());
                    }
                } else {
                    throw new InvalidKeySpecException(hht.l(key, "unsupported key type: "));
                }
                throw new InvalidKeySpecException(hht.b(cls, "unknown key specification: ", "."));
        }
    }

    @Override // java.security.KeyFactorySpi
    public final Key engineTranslateKey(Key key) {
        switch (this.a) {
            case 0:
                if (!(key instanceof atbk) && !(key instanceof atbl)) {
                    throw new InvalidKeyException("Unsupported key type");
                }
                return key;
            case 1:
                if (!(key instanceof atbi) && !(key instanceof atbj)) {
                    throw new InvalidKeyException("Unsupported key type");
                }
                return key;
            case 2:
                if (!(key instanceof atbt) && !(key instanceof atbu)) {
                    throw new InvalidKeyException("Unsupported key type");
                }
                return key;
            case 3:
                if (!(key instanceof atby) && !(key instanceof atbz)) {
                    throw new InvalidKeyException("unsupported key type");
                }
                return key;
            case 4:
                if (!(key instanceof atca) && !(key instanceof atcb)) {
                    throw new InvalidKeyException("Unsupported key type");
                }
                return key;
            case 5:
                if (!(key instanceof atcc) && !(key instanceof atcd)) {
                    throw new InvalidKeyException("Unsupported key type");
                }
                return key;
            case 6:
                if (!(key instanceof atce) && !(key instanceof atcf)) {
                    throw new InvalidKeyException("Unsupported key type");
                }
                return key;
            case 7:
                if (!(key instanceof atcg) && !(key instanceof atch)) {
                    throw new InvalidKeyException("Unsupported key type");
                }
                return key;
            case 8:
                if (!(key instanceof atci) && !(key instanceof atcj)) {
                    throw new InvalidKeyException("Unsupported key type");
                }
                return key;
            case 9:
                if (!(key instanceof atcn) && !(key instanceof atco)) {
                    throw new InvalidKeyException("unsupported key type");
                }
                return key;
            default:
                if (!(key instanceof atcl) && !(key instanceof atcm)) {
                    throw new InvalidKeyException("unsupported key type");
                }
                return key;
        }
    }

    public atbm(int i) {
        this.a = i;
    }

    public atbm(int i, char[] cArr) {
        this.a = i;
    }

    public atbm(int i, short[] sArr) {
        this.a = i;
    }

    public atbm(int i, int[] iArr) {
        this.a = i;
    }

    public atbm(int i, boolean[] zArr) {
        this.a = i;
    }

    public atbm(int i, float[] fArr) {
        this.a = i;
    }

    public atbm(int i, byte[][] bArr) {
        this.a = i;
    }

    public atbm(int i, char[][] cArr) {
        this.a = i;
    }

    public atbm(int i, short[][] sArr) {
        this.a = i;
    }

    public atbm(int i, int[][] iArr) {
        this.a = i;
    }
}
