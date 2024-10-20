package defpackage;

import java.security.PrivilegedAction;
import java.util.logging.Level;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.asn1.isara.IsaraObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;

/* compiled from: PG */
/* loaded from: classes.dex */
final class asuq implements PrivilegedAction {
    final /* synthetic */ asus a;

    public asuq(asus asusVar) {
        this.a = asusVar;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        asus.f("org.bouncycastle.jcajce.provider.digest.", asus.i);
        asus.f("org.bouncycastle.jcajce.provider.symmetric.", asus.d);
        asus.f("org.bouncycastle.jcajce.provider.symmetric.", asus.e);
        asst[] asstVarArr = asus.f;
        int i = 0;
        while (true) {
            int length = asstVarArr.length;
            if (i == 38) {
                break;
            }
            asst asstVar = asstVarArr[i];
            try {
                assw.a();
                asus.e("org.bouncycastle.jcajce.provider.symmetric.", asstVar.a());
            } catch (asss unused) {
                if (asus.a.isLoggable(Level.FINE)) {
                    asus.a.logp(Level.FINE, "org.bouncycastle.jce.provider.BouncyCastleProvider", "loadAlgorithms", "service for " + asstVar.a() + " ignored due to constraints");
                }
            }
            i++;
        }
        asus.f("org.bouncycastle.jcajce.provider.asymmetric.", asus.g);
        asus.f("org.bouncycastle.jcajce.provider.asymmetric.", asus.h);
        asus.f("org.bouncycastle.jcajce.provider.keystore.", asus.j);
        asus.f("org.bouncycastle.jcajce.provider.drbg.", asus.k);
        asus.d(BCObjectIdentifiers.n, new atbm(8, (char[][]) null));
        asus.d(BCObjectIdentifiers.o, new atbm(8, (char[][]) null));
        asus.d(BCObjectIdentifiers.p, new atbm(8, (char[][]) null));
        asus.d(BCObjectIdentifiers.q, new atbm(8, (char[][]) null));
        asus.d(BCObjectIdentifiers.r, new atbm(8, (char[][]) null));
        asus.d(BCObjectIdentifiers.s, new atbm(8, (char[][]) null));
        asus.d(BCObjectIdentifiers.t, new atbm(8, (char[][]) null));
        asus.d(BCObjectIdentifiers.u, new atbm(8, (char[][]) null));
        asus.d(BCObjectIdentifiers.v, new atbm(8, (char[][]) null));
        asus.d(BCObjectIdentifiers.w, new atbm(8, (char[][]) null));
        asus.d(BCObjectIdentifiers.x, new atbm(8, (char[][]) null));
        asus.d(BCObjectIdentifiers.y, new atbm(8, (char[][]) null));
        asus.d(BCObjectIdentifiers.z, new atbm(8, (char[][]) null));
        asus.d(BCObjectIdentifiers.A, new atbm(8, (char[][]) null));
        asus.d(BCObjectIdentifiers.B, new atbm(8, (char[][]) null));
        asus.d(BCObjectIdentifiers.C, new atbm(8, (char[][]) null));
        asus.d(BCObjectIdentifiers.D, new atbm(8, (char[][]) null));
        asus.d(BCObjectIdentifiers.E, new atbm(8, (char[][]) null));
        asus.d(BCObjectIdentifiers.F, new atbm(8, (char[][]) null));
        asus.d(BCObjectIdentifiers.G, new atbm(8, (char[][]) null));
        asus.d(BCObjectIdentifiers.H, new atbm(8, (char[][]) null));
        asus.d(BCObjectIdentifiers.I, new atbm(8, (char[][]) null));
        asus.d(BCObjectIdentifiers.J, new atbm(8, (char[][]) null));
        asus.d(BCObjectIdentifiers.K, new atbm(8, (char[][]) null));
        asus.d(BCObjectIdentifiers.L, new atbm(8, (char[][]) null));
        asus.d(BCObjectIdentifiers.M, new atbm(8, (char[][]) null));
        asus.d(BCObjectIdentifiers.N, new atbm(8, (char[][]) null));
        asus.d(BCObjectIdentifiers.O, new atbm(8, (char[][]) null));
        asus.d(BCObjectIdentifiers.P, new atbm(8, (char[][]) null));
        asus.d(BCObjectIdentifiers.Q, new atbm(8, (char[][]) null));
        asus.d(BCObjectIdentifiers.R, new atbm(8, (char[][]) null));
        asus.d(BCObjectIdentifiers.S, new atbm(8, (char[][]) null));
        asus.d(BCObjectIdentifiers.T, new atbm(8, (char[][]) null));
        asus.d(BCObjectIdentifiers.U, new atbm(8, (char[][]) null));
        asus.d(BCObjectIdentifiers.V, new atbm(8, (char[][]) null));
        asus.d(BCObjectIdentifiers.W, new atbm(8, (char[][]) null));
        asus.d(BCObjectIdentifiers.X, new atbm(8, (char[][]) null));
        asus.d(BCObjectIdentifiers.aa, new atbm(8, (char[][]) null));
        asus.d(BCObjectIdentifiers.ac, new atbm(8, (char[][]) null));
        asus.d(BCObjectIdentifiers.ae, new atbm(8, (char[][]) null));
        asus.d(new ASN1ObjectIdentifier("1.3.9999.6.4.10"), new atbm(8, (char[][]) null));
        asus.d(BCObjectIdentifiers.af, new atbm(8, (char[][]) null));
        asus.d(BCObjectIdentifiers.ah, new atbm(8, (char[][]) null));
        asus.d(BCObjectIdentifiers.aj, new atbm(8, (char[][]) null));
        asus.d(asvp.d, new atbm(7, (byte[][]) null));
        asus.d(asvp.e, new atbm(4, (int[]) null));
        asus.d(asvp.f, new atbm(9, (short[][]) null));
        asus.d(IsaraObjectIdentifiers.a, new atbm(9, (short[][]) null));
        asus.d(asvp.g, new atbm(10, (int[][]) null));
        asus.d(IsaraObjectIdentifiers.b, new atbm(10, (int[][]) null));
        asus.d(PKCSObjectIdentifiers.D, new atbm(3, (short[]) null));
        asus.d(BCObjectIdentifiers.am, new atbm(6, (float[]) null));
        asus.d(BCObjectIdentifiers.aA, new atbs());
        asus.d(BCObjectIdentifiers.aB, new atbs());
        asus.d(BCObjectIdentifiers.aC, new atbp());
        asus.d(BCObjectIdentifiers.aD, new atbp());
        asus.d(BCObjectIdentifiers.aE, new atbp());
        asus.d(BCObjectIdentifiers.aF, new atbp());
        asus.d(BCObjectIdentifiers.aG, new atbp());
        asus.d(BCObjectIdentifiers.aH, new atbp());
        asus.d(BCObjectIdentifiers.bL, new atbx());
        asus.d(BCObjectIdentifiers.bM, new atbx());
        asus.d(BCObjectIdentifiers.bN, new atbx());
        asus.d(BCObjectIdentifiers.aU, new atbm(0));
        asus.d(BCObjectIdentifiers.aW, new atbm(0));
        asus.d(BCObjectIdentifiers.aY, new atbm(0));
        asus.d(BCObjectIdentifiers.ba, new atbm(0));
        asus.d(BCObjectIdentifiers.bc, new atbm(0));
        asus.d(BCObjectIdentifiers.ch, new atbm(1, (byte[]) null));
        asus.d(BCObjectIdentifiers.ci, new atbm(1, (byte[]) null));
        asus.d(BCObjectIdentifiers.cj, new atbm(1, (byte[]) null));
        asus asusVar = this.a;
        asus.d(BCObjectIdentifiers.cl, new atbm(2, (char[]) null));
        asus.d(BCObjectIdentifiers.cm, new atbm(2, (char[]) null));
        asus.d(BCObjectIdentifiers.cn, new atbm(2, (char[]) null));
        asus.d(BCObjectIdentifiers.bN, new atbx());
        asus.d(BCObjectIdentifiers.bO, new atbx());
        asus.d(BCObjectIdentifiers.bP, new atbx());
        asus.d(BCObjectIdentifiers.bQ, new atbx());
        asus.d(BCObjectIdentifiers.bG, new atbm(5, (boolean[]) null));
        asus.d(BCObjectIdentifiers.bH, new atbm(5, (boolean[]) null));
        asus.d(BCObjectIdentifiers.bI, new atbm(5, (boolean[]) null));
        asus.d(BCObjectIdentifiers.bJ, new atbm(5, (boolean[]) null));
        asusVar.put("X509Store.CERTIFICATE/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCertCollection");
        asusVar.put("X509Store.ATTRIBUTECERTIFICATE/COLLECTION", "org.bouncycastle.jce.provider.X509StoreAttrCertCollection");
        asusVar.put("X509Store.CRL/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCRLCollection");
        asusVar.put("X509Store.CERTIFICATEPAIR/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCertPairCollection");
        asusVar.put("X509Store.CERTIFICATE/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCerts");
        asusVar.put("X509Store.CRL/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCRLs");
        asusVar.put("X509Store.ATTRIBUTECERTIFICATE/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPAttrCerts");
        asusVar.put("X509Store.CERTIFICATEPAIR/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCertPairs");
        asusVar.put("X509StreamParser.CERTIFICATE", "org.bouncycastle.jce.provider.X509CertParser");
        asusVar.put("X509StreamParser.ATTRIBUTECERTIFICATE", "org.bouncycastle.jce.provider.X509AttrCertParser");
        asusVar.put("X509StreamParser.CRL", "org.bouncycastle.jce.provider.X509CRLParser");
        asusVar.put("X509StreamParser.CERTIFICATEPAIR", "org.bouncycastle.jce.provider.X509CertPairParser");
        asusVar.put("Cipher.BROKENPBEWITHMD5ANDDES", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithMD5AndDES");
        asusVar.put("Cipher.BROKENPBEWITHSHA1ANDDES", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithSHA1AndDES");
        asusVar.put("Cipher.OLDPBEWITHSHAANDTWOFISH-CBC", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$OldPBEWithSHAAndTwofish");
        if (asus.c != null) {
            asusVar.put("CertPathValidator.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathValidatorSpi");
            asusVar.put("CertPathBuilder.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathBuilderSpi");
            asusVar.put("CertPathValidator.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi_8");
            asusVar.put("CertPathBuilder.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi_8");
            asusVar.put("CertPathValidator.PKIX", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi_8");
            asusVar.put("CertPathBuilder.PKIX", "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi_8");
        } else {
            asusVar.put("CertPathValidator.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathValidatorSpi");
            asusVar.put("CertPathBuilder.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathBuilderSpi");
            asusVar.put("CertPathValidator.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi");
            asusVar.put("CertPathBuilder.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi");
            asusVar.put("CertPathValidator.PKIX", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi");
            asusVar.put("CertPathBuilder.PKIX", "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi");
        }
        asusVar.put("CertStore.Collection", "org.bouncycastle.jce.provider.CertStoreCollectionSpi");
        asusVar.put("CertStore.LDAP", "org.bouncycastle.jce.provider.X509LDAPCertStoreSpi");
        asusVar.put("CertStore.Multi", "org.bouncycastle.jce.provider.MultiCertStoreSpi");
        asusVar.put("Alg.Alias.CertStore.X509LDAP", "LDAP");
        asusVar.getService("SecureRandom", "DEFAULT");
        return null;
    }
}
