package defpackage;

import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.PSSParameterSpec;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Null;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.edec.EdECObjectIdentifiers;
import org.bouncycastle.asn1.misc.MiscObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.RSASSAPSSparams;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class asuj {
    private static final Map a;
    private static final ASN1Null b;

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        hashMap.put(EdECObjectIdentifiers.b, "Ed25519");
        hashMap.put(EdECObjectIdentifiers.c, "Ed448");
        hashMap.put(OIWObjectIdentifiers.b, "SHA1withDSA");
        hashMap.put(X9ObjectIdentifiers.L, "SHA1withDSA");
        b = DERNull.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(AlgorithmIdentifier algorithmIdentifier) {
        String f;
        String f2;
        RSASSAPSSparams rSASSAPSSparams;
        ASN1Encodable aSN1Encodable = algorithmIdentifier.b;
        if (aSN1Encodable != null && !b.w(aSN1Encodable)) {
            if (algorithmIdentifier.a.x(PKCSObjectIdentifiers.fG)) {
                boolean z = aSN1Encodable instanceof RSASSAPSSparams;
                AlgorithmIdentifier algorithmIdentifier2 = RSASSAPSSparams.a;
                if (z) {
                    rSASSAPSSparams = (RSASSAPSSparams) aSN1Encodable;
                } else {
                    rSASSAPSSparams = new RSASSAPSSparams(ASN1Sequence.j(aSN1Encodable));
                }
                return e(rSASSAPSSparams.e.a).concat("withRSAandMGF1");
            }
            if (algorithmIdentifier.a.x(X9ObjectIdentifiers.g)) {
                return e((ASN1ObjectIdentifier) ASN1Sequence.j(aSN1Encodable).h(0)).concat("withECDSA");
            }
        }
        String str = (String) a.get(algorithmIdentifier.a);
        if (str == null) {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = algorithmIdentifier.a;
            Provider provider = Security.getProvider("BC");
            if (provider == null || (f2 = f(provider, aSN1ObjectIdentifier)) == null) {
                Provider[] providers = Security.getProviders();
                for (int i = 0; i != providers.length; i++) {
                    Provider provider2 = providers[i];
                    if (provider != provider2 && (f = f(provider2, aSN1ObjectIdentifier)) != null) {
                        return f;
                    }
                }
                return aSN1ObjectIdentifier.b;
            }
            return f2;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(byte[] bArr, StringBuffer stringBuffer, String str) {
        if (bArr.length > 20) {
            stringBuffer.append("            Signature: ");
            stringBuffer.append(atdm.b(bArr, 0, 20));
            stringBuffer.append(str);
            int i = 20;
            while (true) {
                int length = bArr.length;
                if (i < length) {
                    if (i < length - 20) {
                        stringBuffer.append("                       ");
                        stringBuffer.append(atdm.b(bArr, i, 20));
                        stringBuffer.append(str);
                    } else {
                        stringBuffer.append("                       ");
                        stringBuffer.append(atdm.b(bArr, i, length - i));
                        stringBuffer.append(str);
                    }
                    i += 20;
                } else {
                    return;
                }
            }
        } else {
            stringBuffer.append("            Signature: ");
            stringBuffer.append(atdm.a(bArr));
            stringBuffer.append(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(Signature signature, ASN1Encodable aSN1Encodable) {
        if (aSN1Encodable != null && !b.w(aSN1Encodable)) {
            AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance(signature.getAlgorithm(), signature.getProvider());
            try {
                algorithmParameters.init(aSN1Encodable.p().s());
                if (signature.getAlgorithm().endsWith("MGF1")) {
                    try {
                        signature.setParameter(algorithmParameters.getParameterSpec(PSSParameterSpec.class));
                    } catch (GeneralSecurityException e) {
                        throw new SignatureException("Exception extracting parameters: ".concat(String.valueOf(e.getMessage())));
                    }
                }
            } catch (IOException e2) {
                throw new SignatureException("IOException decoding parameters: ".concat(String.valueOf(e2.getMessage())));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(AlgorithmIdentifier algorithmIdentifier) {
        return MiscObjectIdentifiers.m.x(algorithmIdentifier.a);
    }

    private static String e(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        String str = (String) asun.a.get(aSN1ObjectIdentifier);
        if (str == null) {
            str = aSN1ObjectIdentifier.b;
        }
        int indexOf = str.indexOf(45);
        if (indexOf > 0 && !str.startsWith("SHA3")) {
            return String.valueOf(str.substring(0, indexOf)).concat(String.valueOf(str.substring(indexOf + 1)));
        }
        return str;
    }

    private static String f(Provider provider, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        String property = provider.getProperty("Alg.Alias.Signature.".concat(String.valueOf(String.valueOf(aSN1ObjectIdentifier))));
        if (property != null) {
            return property;
        }
        String property2 = provider.getProperty("Alg.Alias.Signature.OID.".concat(String.valueOf(String.valueOf(aSN1ObjectIdentifier))));
        if (property2 != null) {
            return property2;
        }
        return null;
    }
}
