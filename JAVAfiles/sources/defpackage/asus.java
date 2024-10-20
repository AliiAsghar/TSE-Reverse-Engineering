package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.security.AccessController;
import java.security.Provider;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.logging.Logger;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class asus extends Provider {
    public static final Map b;
    public static final Class c;
    public static final String[] d;
    public static final String[] e;
    public static final asst[] f;
    public static final String[] g;
    public static final String[] h;
    public static final String[] i;
    public static final String[] j;
    public static final String[] k;
    public final Map l;
    public static final Logger a = Logger.getLogger(asus.class.getName());
    private static final String m = "BouncyCastle Security Provider v1.77";

    static {
        int i2 = asut.a;
        new ThreadLocal();
        new ThreadLocal();
        new HashSet();
        new HashMap();
        b = new HashMap();
        c = aotl.I(asus.class, "java.security.cert.PKIXRevocationChecker");
        d = new String[]{"PBEPBKDF1", "PBEPBKDF2", "PBEPKCS12", "TLSKDF", "SCRYPT"};
        e = new String[]{"SipHash", "SipHash128", "Poly1305"};
        f = new asst[]{new astj("AES", 2), new astj("ARC4", 2), new astj("ARIA", 2), new astj("Blowfish", 2), new astj("Camellia", 2), new astj("CAST5", 2), new astj("CAST6", 2), new astj("ChaCha", 2), new astj("DES", 2), new astj("DESede", 2), new astj("GOST28147", 2), new astj("Grainv1", 2), new astj("Grain128", 2), new astj("HC128", 2), new astj("HC256", 2), new astj("IDEA", 2), new astj("Noekeon", 2), new astj("RC2", 2), new astj("RC5", 2), new astj("RC6", 2), new astj("Rijndael", 2), new astj("Salsa20", 2), new astj("SEED", 2), new astj("Serpent", 2), new astj("Shacal2", 2), new astj("Skipjack", 2), new astj("SM4", 2), new astj("TEA", 2), new astj("Twofish", 2), new astj("Threefish", 2), new astj("VMPC", 2), new astj("VMPCKSA3", 2), new astj("XTEA", 2), new astj("XSalsa20", 2), new astj("OpenSSLPBKDF", 2), new astj("DSTU7624", 2), new astj("GOST3412_2015", 2), new astj("Zuc", 2)};
        g = new String[]{"X509", "IES", "COMPOSITE", "EXTERNAL"};
        h = new String[]{"DSA", "DH", "EC", "RSA", "GOST", "ECGOST", "ElGamal", "DSTU4145", "GM", "EdEC", "LMS", "SPHINCSPlus", "Dilithium", "Falcon", "NTRU"};
        i = new String[]{"GOST3411", "Keccak", "MD2", "MD4", "MD5", "SHA1", "RIPEMD128", "RIPEMD160", "RIPEMD256", "RIPEMD320", "SHA224", "SHA256", "SHA384", "SHA512", "SHA3", "Skein", "SM3", "Tiger", "Whirlpool", "Blake2b", "Blake2s", "DSTU7564", "Haraka", "Blake3"};
        j = new String[]{"BC", "BCFKS", "PKCS12"};
        k = new String[]{"DRBG"};
    }

    public asus() {
        super("BC", 1.77d, m);
        this.l = new ConcurrentHashMap();
        AccessController.doPrivileged(new asuq(this));
    }

    public static final void d(ASN1ObjectIdentifier aSN1ObjectIdentifier, asum asumVar) {
        Map map = b;
        synchronized (map) {
            map.put(aSN1ObjectIdentifier, asumVar);
        }
    }

    public static final void e(String str, String str2) {
        Class I = aotl.I(asus.class, str + str2 + "$Mappings");
        if (I != null) {
            try {
                ((asul) I.newInstance()).a();
            } catch (Exception e2) {
                throw new InternalError("cannot create instance of " + str + str2 + "$Mappings : " + e2.toString());
            }
        }
    }

    public static final void f(String str, String[] strArr) {
        for (int i2 = 0; i2 != strArr.length; i2++) {
            e(str, strArr[i2]);
        }
    }

    @Override // java.security.Provider
    public final Provider.Service getService(String str, String str2) {
        Provider.Service service;
        String co = a.co(atdg.c(str2), str, ".");
        Provider.Service service2 = (Provider.Service) this.l.get(co);
        if (service2 == null) {
            synchronized (this) {
                if (!this.l.containsKey(co)) {
                    service = (Provider.Service) AccessController.doPrivileged(new asur(this, str, str2, co));
                } else {
                    service = (Provider.Service) this.l.get(co);
                }
                service2 = service;
            }
        }
        return service2;
    }
}
