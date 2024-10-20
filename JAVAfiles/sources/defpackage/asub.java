package defpackage;

import j$.util.DesugarCollections;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CRLException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLEntry;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.util.ASN1Dump;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.CRLDistPoint;
import org.bouncycastle.asn1.x509.CRLNumber;
import org.bouncycastle.asn1.x509.CertificateList;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.asn1.x509.IssuingDistributionPoint;
import org.bouncycastle.asn1.x509.TBSCertList;
import org.bouncycastle.asn1.x509.Time;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class asub extends X509CRL {
    protected final CertificateList a;
    protected final String b;
    protected final byte[] c;
    protected final boolean d;
    protected final asuo e;

    public asub(asuo asuoVar, CertificateList certificateList, String str, byte[] bArr, boolean z) {
        this.e = asuoVar;
        this.a = certificateList;
        this.b = str;
        this.c = bArr;
        this.d = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static ASN1OctetString a(CertificateList certificateList, String str) {
        Extension b;
        Extensions extensions = certificateList.a.g;
        if (extensions != null && (b = extensions.b(new ASN1ObjectIdentifier(str))) != null) {
            return b.u;
        }
        return null;
    }

    private final Set b(boolean z) {
        Extensions extensions;
        if (getVersion() == 2 && (extensions = this.a.a.g) != null) {
            HashSet hashSet = new HashSet();
            Enumeration a = extensions.a();
            while (a.hasMoreElements()) {
                ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) a.nextElement();
                if (z == extensions.b(aSN1ObjectIdentifier).t) {
                    hashSet.add(aSN1ObjectIdentifier.b);
                }
            }
            return hashSet;
        }
        return null;
    }

    private final void c(PublicKey publicKey, Signature signature, ASN1Encodable aSN1Encodable, byte[] bArr) {
        if (aSN1Encodable != null) {
            asuj.c(signature, aSN1Encodable);
        }
        signature.initVerify(publicKey);
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new asts(signature), 512);
            this.a.a.t(bufferedOutputStream);
            bufferedOutputStream.close();
            if (signature.verify(bArr)) {
            } else {
                throw new SignatureException("CRL does not verify with supplied public key.");
            }
        } catch (IOException e) {
            throw new CRLException(e.toString());
        }
    }

    private final void d(PublicKey publicKey, astx astxVar) {
        CertificateList certificateList = this.a;
        if (certificateList.b.equals(certificateList.a.b)) {
            if ((publicKey instanceof astr) && asuj.d(this.a.b)) {
                throw null;
            }
            if (asuj.d(this.a.b)) {
                ASN1Sequence j = ASN1Sequence.j(this.a.b.b);
                ASN1Sequence j2 = ASN1Sequence.j(ASN1BitString.i(this.a.c).m());
                boolean z = false;
                for (int i = 0; i != j2.e(); i++) {
                    AlgorithmIdentifier a = AlgorithmIdentifier.a(j.h(i));
                    try {
                        c(publicKey, astxVar.a(asuj.a(a)), a.b, ASN1BitString.i(j2.h(i)).m());
                        z = true;
                    } catch (InvalidKeyException | NoSuchAlgorithmException unused) {
                    } catch (SignatureException e) {
                        e = e;
                    }
                    e = null;
                    if (e != null) {
                        throw e;
                    }
                }
                if (z) {
                    return;
                } else {
                    throw new InvalidKeyException("no matching key found");
                }
            }
            Signature a2 = astxVar.a(this.b);
            byte[] bArr = this.c;
            if (bArr != null) {
                try {
                    c(publicKey, a2, ASN1Primitive.v(bArr), getSignature());
                    return;
                } catch (IOException e2) {
                    throw new SignatureException("cannot decode signature parameters: ".concat(String.valueOf(e2.getMessage())));
                }
            }
            c(publicKey, a2, null, getSignature());
            return;
        }
        throw new CRLException("Signature algorithm on CertificateList does not match TBSCertList.");
    }

    @Override // java.security.cert.X509Extension
    public final Set getCriticalExtensionOIDs() {
        return b(true);
    }

    @Override // java.security.cert.X509Extension
    public final byte[] getExtensionValue(String str) {
        ASN1OctetString a = a(this.a, str);
        if (a != null) {
            try {
                return a.s();
            } catch (Exception e) {
                throw new IllegalStateException("error parsing ".concat(String.valueOf(e.toString())));
            }
        }
        return null;
    }

    @Override // java.security.cert.X509CRL
    public final Principal getIssuerDN() {
        return new asup(X500Name.b(this.a.b().a));
    }

    @Override // java.security.cert.X509CRL
    public final X500Principal getIssuerX500Principal() {
        try {
            return new X500Principal(this.a.b().s());
        } catch (IOException unused) {
            throw new IllegalStateException("can't encode issuer DN");
        }
    }

    @Override // java.security.cert.X509CRL
    public final Date getNextUpdate() {
        Time time = this.a.a.e;
        if (time == null) {
            return null;
        }
        return time.b();
    }

    @Override // java.security.cert.X509Extension
    public final Set getNonCriticalExtensionOIDs() {
        return b(false);
    }

    @Override // java.security.cert.X509CRL
    public final X509CRLEntry getRevokedCertificate(BigInteger bigInteger) {
        Extension b;
        Enumeration a = this.a.a();
        X500Name x500Name = null;
        while (a.hasMoreElements()) {
            TBSCertList.CRLEntry cRLEntry = (TBSCertList.CRLEntry) a.nextElement();
            if (cRLEntry.a().q(bigInteger)) {
                return new asty(cRLEntry, this.d, x500Name);
            }
            if (this.d && cRLEntry.d() && (b = cRLEntry.b().b(Extension.j)) != null) {
                x500Name = X500Name.b(GeneralNames.a(Extension.a(b)).b()[0].a);
            }
        }
        return null;
    }

    @Override // java.security.cert.X509CRL
    public final Set getRevokedCertificates() {
        Extension b;
        HashSet hashSet = new HashSet();
        Enumeration a = this.a.a();
        X500Name x500Name = null;
        while (a.hasMoreElements()) {
            TBSCertList.CRLEntry cRLEntry = (TBSCertList.CRLEntry) a.nextElement();
            hashSet.add(new asty(cRLEntry, this.d, x500Name));
            if (this.d && cRLEntry.d() && (b = cRLEntry.b().b(Extension.j)) != null) {
                x500Name = X500Name.b(GeneralNames.a(Extension.a(b)).b()[0].a);
            }
        }
        if (hashSet.isEmpty()) {
            return null;
        }
        return DesugarCollections.unmodifiableSet(hashSet);
    }

    @Override // java.security.cert.X509CRL
    public final String getSigAlgName() {
        return this.b;
    }

    @Override // java.security.cert.X509CRL
    public final String getSigAlgOID() {
        return this.a.b.a.b;
    }

    @Override // java.security.cert.X509CRL
    public final byte[] getSigAlgParams() {
        return atow.O(this.c);
    }

    @Override // java.security.cert.X509CRL
    public final byte[] getSignature() {
        return this.a.c.n();
    }

    @Override // java.security.cert.X509CRL
    public final byte[] getTBSCertList() {
        try {
            return this.a.a.u();
        } catch (IOException e) {
            throw new CRLException(e.toString());
        }
    }

    @Override // java.security.cert.X509CRL
    public final Date getThisUpdate() {
        return this.a.a.d.b();
    }

    @Override // java.security.cert.X509CRL
    public final int getVersion() {
        ASN1Integer aSN1Integer = this.a.a.a;
        if (aSN1Integer == null) {
            return 1;
        }
        return aSN1Integer.f() + 1;
    }

    @Override // java.security.cert.X509Extension
    public final boolean hasUnsupportedCriticalExtension() {
        Set criticalExtensionOIDs = getCriticalExtensionOIDs();
        if (criticalExtensionOIDs == null) {
            return false;
        }
        criticalExtensionOIDs.remove(Extension.i.b);
        criticalExtensionOIDs.remove(Extension.h.b);
        if (criticalExtensionOIDs.isEmpty()) {
            return false;
        }
        return true;
    }

    @Override // java.security.cert.CRL
    public final boolean isRevoked(Certificate certificate) {
        X500Name a;
        Extension b;
        if (certificate.getType().equals("X.509")) {
            CertificateList certificateList = this.a;
            Enumeration a2 = certificateList.a();
            X500Name b2 = certificateList.b();
            if (a2.hasMoreElements()) {
                X509Certificate x509Certificate = (X509Certificate) certificate;
                BigInteger serialNumber = x509Certificate.getSerialNumber();
                while (a2.hasMoreElements()) {
                    TBSCertList.CRLEntry c = TBSCertList.CRLEntry.c(a2.nextElement());
                    if (this.d && c.d() && (b = c.b().b(Extension.j)) != null) {
                        b2 = X500Name.b(GeneralNames.a(Extension.a(b)).b()[0].a);
                    }
                    if (c.a().q(serialNumber)) {
                        if (certificate instanceof X509Certificate) {
                            a = X500Name.b(x509Certificate.getIssuerX500Principal().getEncoded());
                        } else {
                            try {
                                a = org.bouncycastle.asn1.x509.Certificate.c(certificate.getEncoded()).a();
                            } catch (CertificateEncodingException e) {
                                throw new IllegalArgumentException("Cannot process certificate: ".concat(String.valueOf(e.getMessage())));
                            }
                        }
                        if (!b2.equals(a)) {
                            return false;
                        }
                        return true;
                    }
                }
            }
            return false;
        }
        throw new IllegalArgumentException("X.509 CRL used with non X.509 Cert");
    }

    @Override // java.security.cert.CRL
    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String str = atdg.a;
        stringBuffer.append("              Version: ");
        stringBuffer.append(getVersion());
        stringBuffer.append(str);
        stringBuffer.append("             IssuerDN: ");
        stringBuffer.append(getIssuerDN());
        stringBuffer.append(str);
        stringBuffer.append("          This update: ");
        stringBuffer.append(getThisUpdate());
        stringBuffer.append(str);
        stringBuffer.append("          Next update: ");
        stringBuffer.append(getNextUpdate());
        stringBuffer.append(str);
        stringBuffer.append("  Signature Algorithm: ");
        stringBuffer.append(this.b);
        stringBuffer.append(str);
        asuj.b(getSignature(), stringBuffer, str);
        Extensions extensions = this.a.a.g;
        if (extensions != null) {
            Enumeration a = extensions.a();
            if (a.hasMoreElements()) {
                stringBuffer.append("           Extensions: ");
                stringBuffer.append(str);
            }
            while (a.hasMoreElements()) {
                ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) a.nextElement();
                Extension b = extensions.b(aSN1ObjectIdentifier);
                ASN1OctetString aSN1OctetString = b.u;
                if (aSN1OctetString != null) {
                    ASN1InputStream aSN1InputStream = new ASN1InputStream(aSN1OctetString.c);
                    stringBuffer.append("                       critical(");
                    stringBuffer.append(b.t);
                    stringBuffer.append(") ");
                    try {
                        if (aSN1ObjectIdentifier.x(Extension.f)) {
                            stringBuffer.append(new CRLNumber(ASN1Integer.m(aSN1InputStream.f()).i()));
                            stringBuffer.append(str);
                        } else if (aSN1ObjectIdentifier.x(Extension.h)) {
                            stringBuffer.append("Base CRL: " + new CRLNumber(ASN1Integer.m(aSN1InputStream.f()).i()).toString());
                            stringBuffer.append(str);
                        } else if (aSN1ObjectIdentifier.x(Extension.i)) {
                            stringBuffer.append(IssuingDistributionPoint.a(aSN1InputStream.f()));
                            stringBuffer.append(str);
                        } else if (aSN1ObjectIdentifier.x(Extension.l)) {
                            stringBuffer.append(CRLDistPoint.a(aSN1InputStream.f()));
                            stringBuffer.append(str);
                        } else if (aSN1ObjectIdentifier.x(Extension.q)) {
                            stringBuffer.append(CRLDistPoint.a(aSN1InputStream.f()));
                            stringBuffer.append(str);
                        } else {
                            stringBuffer.append(aSN1ObjectIdentifier.b);
                            stringBuffer.append(" value = ");
                            stringBuffer.append(ASN1Dump.a(aSN1InputStream.f()));
                            stringBuffer.append(str);
                        }
                    } catch (Exception unused) {
                        stringBuffer.append(aSN1ObjectIdentifier.b);
                        stringBuffer.append(" value = ");
                        stringBuffer.append("*****");
                        stringBuffer.append(str);
                    }
                } else {
                    stringBuffer.append(str);
                }
            }
        }
        Set revokedCertificates = getRevokedCertificates();
        if (revokedCertificates != null) {
            Iterator it = revokedCertificates.iterator();
            while (it.hasNext()) {
                stringBuffer.append(it.next());
                stringBuffer.append(str);
            }
        }
        return stringBuffer.toString();
    }

    @Override // java.security.cert.X509CRL
    public final void verify(PublicKey publicKey) {
        d(publicKey, new astz(this, 1));
    }

    @Override // java.security.cert.X509CRL
    public final void verify(PublicKey publicKey, String str) {
        d(publicKey, new astz(str, 0));
    }

    @Override // java.security.cert.X509CRL
    public final void verify(PublicKey publicKey, Provider provider) {
        try {
            d(publicKey, new asua(this, provider));
        } catch (NoSuchProviderException e) {
            throw new NoSuchAlgorithmException("provider issue: ".concat(String.valueOf(e.getMessage())));
        }
    }
}
