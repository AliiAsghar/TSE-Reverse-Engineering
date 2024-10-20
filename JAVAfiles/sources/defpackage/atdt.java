package defpackage;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.RSASSAPSSparams;
import org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atdt {
    public static final Hashtable a;
    public static final Hashtable b;
    public static final Set c;

    static {
        Hashtable hashtable = new Hashtable();
        a = hashtable;
        Hashtable hashtable2 = new Hashtable();
        b = hashtable2;
        HashSet hashSet = new HashSet();
        c = hashSet;
        hashtable.put("MD2WITHRSAENCRYPTION", PKCSObjectIdentifiers.fB);
        hashtable.put("MD2WITHRSA", PKCSObjectIdentifiers.fB);
        hashtable.put("MD5WITHRSAENCRYPTION", PKCSObjectIdentifiers.fC);
        hashtable.put("MD5WITHRSA", PKCSObjectIdentifiers.fC);
        hashtable.put("SHA1WITHRSAENCRYPTION", PKCSObjectIdentifiers.fD);
        hashtable.put("SHA1WITHRSA", PKCSObjectIdentifiers.fD);
        hashtable.put("SHA224WITHRSAENCRYPTION", PKCSObjectIdentifiers.k);
        hashtable.put("SHA224WITHRSA", PKCSObjectIdentifiers.k);
        hashtable.put("SHA256WITHRSAENCRYPTION", PKCSObjectIdentifiers.h);
        hashtable.put("SHA256WITHRSA", PKCSObjectIdentifiers.h);
        hashtable.put("SHA384WITHRSAENCRYPTION", PKCSObjectIdentifiers.i);
        hashtable.put("SHA384WITHRSA", PKCSObjectIdentifiers.i);
        hashtable.put("SHA512WITHRSAENCRYPTION", PKCSObjectIdentifiers.j);
        hashtable.put("SHA512WITHRSA", PKCSObjectIdentifiers.j);
        hashtable.put("SHA1WITHRSAANDMGF1", PKCSObjectIdentifiers.fG);
        hashtable.put("SHA224WITHRSAANDMGF1", PKCSObjectIdentifiers.fG);
        hashtable.put("SHA256WITHRSAANDMGF1", PKCSObjectIdentifiers.fG);
        hashtable.put("SHA384WITHRSAANDMGF1", PKCSObjectIdentifiers.fG);
        hashtable.put("SHA512WITHRSAANDMGF1", PKCSObjectIdentifiers.fG);
        hashtable.put("RIPEMD160WITHRSAENCRYPTION", TeleTrusTObjectIdentifiers.f);
        hashtable.put("RIPEMD160WITHRSA", TeleTrusTObjectIdentifiers.f);
        hashtable.put("RIPEMD128WITHRSAENCRYPTION", TeleTrusTObjectIdentifiers.g);
        hashtable.put("RIPEMD128WITHRSA", TeleTrusTObjectIdentifiers.g);
        hashtable.put("RIPEMD256WITHRSAENCRYPTION", TeleTrusTObjectIdentifiers.h);
        hashtable.put("RIPEMD256WITHRSA", TeleTrusTObjectIdentifiers.h);
        hashtable.put("SHA1WITHDSA", X9ObjectIdentifiers.L);
        hashtable.put("DSAWITHSHA1", X9ObjectIdentifiers.L);
        hashtable.put("SHA224WITHDSA", NISTObjectIdentifiers.r);
        hashtable.put("SHA256WITHDSA", NISTObjectIdentifiers.s);
        hashtable.put("SHA384WITHDSA", NISTObjectIdentifiers.t);
        hashtable.put("SHA512WITHDSA", NISTObjectIdentifiers.u);
        hashtable.put("SHA1WITHECDSA", X9ObjectIdentifiers.e);
        hashtable.put("ECDSAWITHSHA1", X9ObjectIdentifiers.e);
        hashtable.put("SHA224WITHECDSA", X9ObjectIdentifiers.h);
        hashtable.put("SHA256WITHECDSA", X9ObjectIdentifiers.i);
        hashtable.put("SHA384WITHECDSA", X9ObjectIdentifiers.j);
        hashtable.put("SHA512WITHECDSA", X9ObjectIdentifiers.k);
        hashtable.put("GOST3411WITHGOST3410", CryptoProObjectIdentifiers.c);
        hashtable.put("GOST3411WITHGOST3410-94", CryptoProObjectIdentifiers.c);
        hashtable.put("GOST3411WITHECGOST3410", CryptoProObjectIdentifiers.d);
        hashtable.put("GOST3411WITHECGOST3410-2001", CryptoProObjectIdentifiers.d);
        hashtable.put("GOST3411WITHGOST3410-2001", CryptoProObjectIdentifiers.d);
        hashSet.add(X9ObjectIdentifiers.e);
        hashSet.add(X9ObjectIdentifiers.h);
        hashSet.add(X9ObjectIdentifiers.i);
        hashSet.add(X9ObjectIdentifiers.j);
        hashSet.add(X9ObjectIdentifiers.k);
        hashSet.add(X9ObjectIdentifiers.L);
        hashSet.add(OIWObjectIdentifiers.b);
        hashSet.add(NISTObjectIdentifiers.r);
        hashSet.add(NISTObjectIdentifiers.s);
        hashSet.add(NISTObjectIdentifiers.t);
        hashSet.add(NISTObjectIdentifiers.u);
        hashSet.add(CryptoProObjectIdentifiers.c);
        hashSet.add(CryptoProObjectIdentifiers.d);
        hashtable2.put("SHA1WITHRSAANDMGF1", a(new AlgorithmIdentifier(OIWObjectIdentifiers.a, DERNull.a), 20));
        hashtable2.put("SHA224WITHRSAANDMGF1", a(new AlgorithmIdentifier(NISTObjectIdentifiers.f, DERNull.a), 28));
        hashtable2.put("SHA256WITHRSAANDMGF1", a(new AlgorithmIdentifier(NISTObjectIdentifiers.c, DERNull.a), 32));
        hashtable2.put("SHA384WITHRSAANDMGF1", a(new AlgorithmIdentifier(NISTObjectIdentifiers.d, DERNull.a), 48));
        hashtable2.put("SHA512WITHRSAANDMGF1", a(new AlgorithmIdentifier(NISTObjectIdentifiers.e, DERNull.a), 64));
    }

    private static RSASSAPSSparams a(AlgorithmIdentifier algorithmIdentifier, int i) {
        return new RSASSAPSSparams(algorithmIdentifier, new AlgorithmIdentifier(PKCSObjectIdentifiers.fE, algorithmIdentifier), new ASN1Integer(i), new ASN1Integer(1L));
    }
}
