package defpackage;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashSet;
import java.util.Set;
import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atbx extends atck {
    private static final Set a;

    static {
        HashSet hashSet = new HashSet();
        a = hashSet;
        hashSet.add(BCObjectIdentifiers.bL);
        hashSet.add(BCObjectIdentifiers.bM);
        hashSet.add(BCObjectIdentifiers.bN);
        hashSet.add(BCObjectIdentifiers.bO);
        hashSet.add(BCObjectIdentifiers.bP);
        hashSet.add(BCObjectIdentifiers.bQ);
    }

    public atbx() {
        super(a);
    }

    @Override // defpackage.asum
    public final PrivateKey a(PrivateKeyInfo privateKeyInfo) {
        return new atbv(privateKeyInfo);
    }

    @Override // defpackage.asum
    public final PublicKey b(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        return new atbw(subjectPublicKeyInfo);
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) {
        if (key instanceof atbv) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(key.getEncoded());
            }
        } else if (key instanceof atbw) {
            if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new X509EncodedKeySpec(key.getEncoded());
            }
        } else {
            throw new InvalidKeySpecException(hht.l(key, "Unsupported key type: "));
        }
        throw new InvalidKeySpecException(hht.b(cls, "Unknown key specification: ", "."));
    }

    @Override // java.security.KeyFactorySpi
    public final Key engineTranslateKey(Key key) {
        if (!(key instanceof atbv) && !(key instanceof atbw)) {
            throw new InvalidKeyException("Unsupported key type");
        }
        return key;
    }
}
