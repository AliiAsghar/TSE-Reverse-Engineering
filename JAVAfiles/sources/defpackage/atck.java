package defpackage;

import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Set;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class atck extends KeyFactorySpi implements asum {
    private final Set a;

    /* JADX INFO: Access modifiers changed from: protected */
    public atck(Set set) {
        this.a = set;
    }

    private final void c(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        if (this.a.contains(aSN1ObjectIdentifier)) {
        } else {
            throw new InvalidKeySpecException("incorrect algorithm OID for key: ".concat(String.valueOf(String.valueOf(aSN1ObjectIdentifier))));
        }
    }

    @Override // java.security.KeyFactorySpi
    public final PrivateKey engineGeneratePrivate(KeySpec keySpec) {
        if (keySpec instanceof PKCS8EncodedKeySpec) {
            try {
                PrivateKeyInfo b = PrivateKeyInfo.b(((PKCS8EncodedKeySpec) keySpec).getEncoded());
                c(b.a.a);
                return a(b);
            } catch (Exception e) {
                throw new InvalidKeySpecException(e.toString());
            }
        }
        throw new InvalidKeySpecException(hht.k(keySpec, "Unsupported key specification: "));
    }

    @Override // java.security.KeyFactorySpi
    public final PublicKey engineGeneratePublic(KeySpec keySpec) {
        if (keySpec instanceof X509EncodedKeySpec) {
            try {
                SubjectPublicKeyInfo b = SubjectPublicKeyInfo.b(((X509EncodedKeySpec) keySpec).getEncoded());
                c(b.a.a);
                return b(b);
            } catch (Exception e) {
                throw new InvalidKeySpecException(e.toString());
            }
        }
        throw new InvalidKeySpecException(hht.b(keySpec, "Unknown key specification: ", "."));
    }
}
