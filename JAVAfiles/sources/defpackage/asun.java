package defpackage;

import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.gm.GMObjectIdentifiers;
import org.bouncycastle.asn1.gnu.GNUObjectIdentifiers;
import org.bouncycastle.asn1.iso.ISOIECObjectIdentifiers;
import org.bouncycastle.asn1.misc.MiscObjectIdentifiers;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asun {
    public static final Map a;
    private static final Map b;

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        HashMap hashMap2 = new HashMap();
        b = hashMap2;
        hashMap.put(PKCSObjectIdentifiers.p, "MD2");
        hashMap.put(PKCSObjectIdentifiers.q, "MD4");
        hashMap.put(PKCSObjectIdentifiers.r, "MD5");
        hashMap.put(OIWObjectIdentifiers.a, "SHA-1");
        hashMap.put(NISTObjectIdentifiers.f, "SHA-224");
        hashMap.put(NISTObjectIdentifiers.c, "SHA-256");
        hashMap.put(NISTObjectIdentifiers.d, "SHA-384");
        hashMap.put(NISTObjectIdentifiers.e, "SHA-512");
        hashMap.put(NISTObjectIdentifiers.g, "SHA-512(224)");
        hashMap.put(NISTObjectIdentifiers.h, "SHA-512(256)");
        hashMap.put(TeleTrusTObjectIdentifiers.c, "RIPEMD-128");
        hashMap.put(TeleTrusTObjectIdentifiers.b, "RIPEMD-160");
        hashMap.put(TeleTrusTObjectIdentifiers.d, "RIPEMD-128");
        hashMap.put(ISOIECObjectIdentifiers.d, "RIPEMD-128");
        hashMap.put(ISOIECObjectIdentifiers.c, "RIPEMD-160");
        hashMap.put(CryptoProObjectIdentifiers.b, "GOST3411");
        hashMap.put(GNUObjectIdentifiers.a, "Tiger");
        hashMap.put(ISOIECObjectIdentifiers.e, "Whirlpool");
        hashMap.put(NISTObjectIdentifiers.i, "SHA3-224");
        hashMap.put(NISTObjectIdentifiers.j, "SHA3-256");
        hashMap.put(NISTObjectIdentifiers.k, "SHA3-384");
        hashMap.put(NISTObjectIdentifiers.l, "SHA3-512");
        hashMap.put(NISTObjectIdentifiers.m, "SHAKE128");
        hashMap.put(NISTObjectIdentifiers.n, "SHAKE256");
        hashMap.put(GMObjectIdentifiers.f, "SM3");
        hashMap.put(MiscObjectIdentifiers.l, "BLAKE3-256");
        hashMap2.put("SHA-1", new AlgorithmIdentifier(OIWObjectIdentifiers.a, DERNull.a));
        hashMap2.put("SHA-224", new AlgorithmIdentifier(NISTObjectIdentifiers.f));
        hashMap2.put("SHA224", new AlgorithmIdentifier(NISTObjectIdentifiers.f));
        hashMap2.put("SHA-256", new AlgorithmIdentifier(NISTObjectIdentifiers.c));
        hashMap2.put("SHA256", new AlgorithmIdentifier(NISTObjectIdentifiers.c));
        hashMap2.put("SHA-384", new AlgorithmIdentifier(NISTObjectIdentifiers.d));
        hashMap2.put("SHA384", new AlgorithmIdentifier(NISTObjectIdentifiers.d));
        hashMap2.put("SHA-512", new AlgorithmIdentifier(NISTObjectIdentifiers.e));
        hashMap2.put("SHA512", new AlgorithmIdentifier(NISTObjectIdentifiers.e));
        hashMap2.put("SHA3-224", new AlgorithmIdentifier(NISTObjectIdentifiers.i));
        hashMap2.put("SHA3-256", new AlgorithmIdentifier(NISTObjectIdentifiers.j));
        hashMap2.put("SHA3-384", new AlgorithmIdentifier(NISTObjectIdentifiers.k));
        hashMap2.put("SHA3-512", new AlgorithmIdentifier(NISTObjectIdentifiers.l));
        hashMap2.put("BLAKE3-256", new AlgorithmIdentifier(MiscObjectIdentifiers.l));
    }
}
