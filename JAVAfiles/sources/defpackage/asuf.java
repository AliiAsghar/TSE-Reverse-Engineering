package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1IA5String;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1String;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.asn1.misc.MiscObjectIdentifiers;
import org.bouncycastle.asn1.misc.NetscapeCertType;
import org.bouncycastle.asn1.misc.NetscapeRevocationURL;
import org.bouncycastle.asn1.misc.VerisignCzagExtension;
import org.bouncycastle.asn1.util.ASN1Dump;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x500.X500NameStyle;
import org.bouncycastle.asn1.x500.style.RFC4519Style;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.BasicConstraints;
import org.bouncycastle.asn1.x509.Certificate;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.KeyUsage;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class asuf extends X509Certificate {
    protected final Certificate a;
    protected final BasicConstraints b;
    protected final boolean[] c;
    protected final String d;
    protected final byte[] e;
    protected final asuo f;

    public asuf(asuo asuoVar, Certificate certificate, BasicConstraints basicConstraints, boolean[] zArr, String str, byte[] bArr) {
        this.f = asuoVar;
        this.a = certificate;
        this.b = basicConstraints;
        this.c = zArr;
        this.d = str;
        this.e = bArr;
    }

    protected static ASN1OctetString a(Certificate certificate, String str) {
        Extension b;
        Extensions extensions = certificate.b.l;
        if (extensions != null && (b = extensions.b(new ASN1ObjectIdentifier(str))) != null) {
            return b.u;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static byte[] b(Certificate certificate, String str) {
        ASN1OctetString a = a(certificate, str);
        if (a != null) {
            return a.c;
        }
        return null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0033. Please report as an issue. */
    private static Collection c(Certificate certificate, String str) {
        X500Name x500Name;
        byte[] b = b(certificate, str);
        if (b == null) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            Enumeration f = ASN1Sequence.j(b).f();
            while (f.hasMoreElements()) {
                GeneralName a = GeneralName.a(f.nextElement());
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Integer.valueOf(a.b));
                int i = a.b;
                switch (i) {
                    case 0:
                    case 3:
                    case 5:
                        arrayList2.add(a.s());
                        arrayList.add(DesugarCollections.unmodifiableList(arrayList2));
                    case 1:
                    case 2:
                    case 6:
                        arrayList2.add(((ASN1String) a.a).e());
                        arrayList.add(DesugarCollections.unmodifiableList(arrayList2));
                    case 4:
                        X500NameStyle x500NameStyle = RFC4519Style.R;
                        ASN1Encodable aSN1Encodable = a.a;
                        int i2 = X500Name.b;
                        if (aSN1Encodable instanceof X500Name) {
                            x500Name = new X500Name(x500NameStyle, (X500Name) aSN1Encodable);
                        } else if (aSN1Encodable != null) {
                            x500Name = new X500Name(x500NameStyle, ASN1Sequence.j(aSN1Encodable));
                        } else {
                            x500Name = null;
                        }
                        arrayList2.add(x500Name.toString());
                        arrayList.add(DesugarCollections.unmodifiableList(arrayList2));
                    case 7:
                        try {
                            arrayList2.add(InetAddress.getByAddress(DEROctetString.f(a.a).c).getHostAddress());
                            arrayList.add(DesugarCollections.unmodifiableList(arrayList2));
                        } catch (UnknownHostException unused) {
                        }
                    case 8:
                        arrayList2.add(ASN1ObjectIdentifier.f(a.a).b);
                        arrayList.add(DesugarCollections.unmodifiableList(arrayList2));
                    default:
                        throw new IOException(a.bV(i, "Bad tag number: "));
                }
            }
            if (arrayList.size() == 0) {
                return null;
            }
            return DesugarCollections.unmodifiableCollection(arrayList);
        } catch (Exception e) {
            throw new CertificateParsingException(e.getMessage());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        if (r0.equals(org.bouncycastle.asn1.DERNull.a) == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0035, code lost:
    
        if (r2.equals(org.bouncycastle.asn1.DERNull.a) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004c, code lost:
    
        if (r0 != false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void d(java.security.PublicKey r5, java.security.Signature r6, org.bouncycastle.asn1.ASN1Encodable r7, byte[] r8) {
        /*
            r4 = this;
            org.bouncycastle.asn1.x509.Certificate r0 = r4.a
            org.bouncycastle.asn1.x509.AlgorithmIdentifier r1 = r0.c
            org.bouncycastle.asn1.x509.TBSCertificate r0 = r0.b
            org.bouncycastle.asn1.x509.AlgorithmIdentifier r0 = r0.d
            org.bouncycastle.asn1.ASN1ObjectIdentifier r2 = r1.a
            org.bouncycastle.asn1.ASN1ObjectIdentifier r3 = r0.a
            boolean r2 = r2.x(r3)
            if (r2 == 0) goto L84
            java.lang.String r2 = "org.bouncycastle.x509.allow_absent_equiv_NULL"
            boolean r2 = defpackage.atde.b(r2)
            if (r2 == 0) goto L38
            org.bouncycastle.asn1.ASN1Encodable r2 = r1.b
            if (r2 != 0) goto L2b
            org.bouncycastle.asn1.ASN1Encodable r0 = r0.b
            if (r0 == 0) goto L4e
            org.bouncycastle.asn1.DERNull r1 = org.bouncycastle.asn1.DERNull.a
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L84
            goto L4e
        L2b:
            org.bouncycastle.asn1.ASN1Encodable r3 = r0.b
            if (r3 != 0) goto L38
            org.bouncycastle.asn1.DERNull r0 = org.bouncycastle.asn1.DERNull.a
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L84
            goto L4e
        L38:
            org.bouncycastle.asn1.ASN1Encodable r1 = r1.b
            if (r1 == 0) goto L43
            org.bouncycastle.asn1.ASN1Encodable r0 = r0.b
            boolean r0 = r1.equals(r0)
            goto L4c
        L43:
            org.bouncycastle.asn1.ASN1Encodable r0 = r0.b
            if (r0 == 0) goto L4e
            r1 = 0
            boolean r0 = r0.equals(r1)
        L4c:
            if (r0 == 0) goto L84
        L4e:
            defpackage.asuj.c(r6, r7)
            r6.initVerify(r5)
            java.io.BufferedOutputStream r5 = new java.io.BufferedOutputStream     // Catch: java.io.IOException -> L79
            asts r7 = new asts     // Catch: java.io.IOException -> L79
            r7.<init>(r6)     // Catch: java.io.IOException -> L79
            r0 = 512(0x200, float:7.17E-43)
            r5.<init>(r7, r0)     // Catch: java.io.IOException -> L79
            org.bouncycastle.asn1.x509.Certificate r7 = r4.a     // Catch: java.io.IOException -> L79
            org.bouncycastle.asn1.x509.TBSCertificate r7 = r7.b     // Catch: java.io.IOException -> L79
            r7.t(r5)     // Catch: java.io.IOException -> L79
            r5.close()     // Catch: java.io.IOException -> L79
            boolean r5 = r6.verify(r8)
            if (r5 == 0) goto L71
            return
        L71:
            java.security.SignatureException r5 = new java.security.SignatureException
            java.lang.String r6 = "certificate does not verify with supplied key"
            r5.<init>(r6)
            throw r5
        L79:
            r5 = move-exception
            java.security.cert.CertificateEncodingException r6 = new java.security.cert.CertificateEncodingException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        L84:
            java.security.cert.CertificateException r5 = new java.security.cert.CertificateException
            java.lang.String r6 = "signature algorithm in TBS cert not same as outer cert"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asuf.d(java.security.PublicKey, java.security.Signature, org.bouncycastle.asn1.ASN1Encodable, byte[]):void");
    }

    private final void e(PublicKey publicKey, astx astxVar) {
        boolean z = publicKey instanceof astr;
        if (z && asuj.d(this.a.c)) {
            throw null;
        }
        if (asuj.d(this.a.c)) {
            ASN1Sequence j = ASN1Sequence.j(this.a.c.b);
            ASN1Sequence j2 = ASN1Sequence.j(ASN1BitString.i(this.a.d).m());
            boolean z2 = false;
            for (int i = 0; i != j2.e(); i++) {
                AlgorithmIdentifier a = AlgorithmIdentifier.a(j.h(i));
                try {
                    d(publicKey, astxVar.a(asuj.a(a)), a.b, ASN1BitString.i(j2.h(i)).m());
                    z2 = true;
                } catch (InvalidKeyException | NoSuchAlgorithmException unused) {
                } catch (SignatureException e) {
                    e = e;
                }
                e = null;
                if (e != null) {
                    throw e;
                }
            }
            if (z2) {
                return;
            } else {
                throw new InvalidKeyException("no matching key found");
            }
        }
        Signature a2 = astxVar.a(asuj.a(this.a.c));
        if (!z) {
            d(publicKey, a2, this.a.c.b, getSignature());
        } else {
            throw null;
        }
    }

    @Override // java.security.cert.X509Certificate
    public final void checkValidity() {
        checkValidity(new Date());
    }

    @Override // java.security.cert.X509Certificate
    public final int getBasicConstraints() {
        BasicConstraints basicConstraints = this.b;
        if (basicConstraints != null && basicConstraints.b()) {
            ASN1Integer aSN1Integer = basicConstraints.b;
            if (aSN1Integer == null) {
                return Integer.MAX_VALUE;
            }
            byte[] bArr = aSN1Integer.b;
            int length = bArr.length;
            int i = aSN1Integer.c;
            int i2 = length - i;
            if (i2 <= 4 && (i2 != 4 || (bArr[i] & 128) == 0)) {
                return ASN1Integer.e(bArr, i, 255);
            }
            throw new ArithmeticException("ASN.1 Integer out of positive int range");
        }
        return -1;
    }

    @Override // java.security.cert.X509Extension
    public final Set getCriticalExtensionOIDs() {
        if (getVersion() == 3) {
            HashSet hashSet = new HashSet();
            Extensions extensions = this.a.b.l;
            if (extensions != null) {
                Enumeration a = extensions.a();
                while (a.hasMoreElements()) {
                    ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) a.nextElement();
                    if (extensions.b(aSN1ObjectIdentifier).t) {
                        hashSet.add(aSN1ObjectIdentifier.b);
                    }
                }
                return hashSet;
            }
            return null;
        }
        return null;
    }

    @Override // java.security.cert.X509Certificate
    public final List getExtendedKeyUsage() {
        byte[] b = b(this.a, "2.5.29.37");
        if (b == null) {
            return null;
        }
        try {
            ASN1Sequence j = ASN1Sequence.j(ASN1Primitive.v(b));
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i != j.e(); i++) {
                arrayList.add(((ASN1ObjectIdentifier) j.h(i)).b);
            }
            return DesugarCollections.unmodifiableList(arrayList);
        } catch (Exception unused) {
            throw new CertificateParsingException("error processing extended key usage extension");
        }
    }

    @Override // java.security.cert.X509Extension
    public final byte[] getExtensionValue(String str) {
        ASN1OctetString a = a(this.a, str);
        if (a != null) {
            try {
                return a.s();
            } catch (Exception e) {
                throw new IllegalStateException("error parsing ".concat(String.valueOf(e.getMessage())), e);
            }
        }
        return null;
    }

    @Override // java.security.cert.X509Certificate
    public final Collection getIssuerAlternativeNames() {
        return c(this.a, Extension.d.b);
    }

    @Override // java.security.cert.X509Certificate
    public final Principal getIssuerDN() {
        return new asup(this.a.a());
    }

    @Override // java.security.cert.X509Certificate
    public final boolean[] getIssuerUniqueID() {
        boolean z;
        ASN1BitString aSN1BitString = this.a.b.j;
        if (aSN1BitString != null) {
            byte[] m = aSN1BitString.m();
            int length = (m.length * 8) - aSN1BitString.f();
            boolean[] zArr = new boolean[length];
            for (int i = 0; i != length; i++) {
                if ((m[i / 8] & (128 >>> (i % 8))) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                zArr[i] = z;
            }
            return zArr;
        }
        return null;
    }

    @Override // java.security.cert.X509Certificate
    public X500Principal getIssuerX500Principal() {
        try {
            return new X500Principal(this.a.a().u());
        } catch (IOException unused) {
            throw new IllegalStateException("can't encode issuer DN");
        }
    }

    @Override // java.security.cert.X509Certificate
    public final boolean[] getKeyUsage() {
        boolean[] zArr = this.c;
        if (zArr == null) {
            return null;
        }
        return (boolean[]) zArr.clone();
    }

    @Override // java.security.cert.X509Extension
    public final Set getNonCriticalExtensionOIDs() {
        if (getVersion() == 3) {
            HashSet hashSet = new HashSet();
            Extensions extensions = this.a.b.l;
            if (extensions != null) {
                Enumeration a = extensions.a();
                while (a.hasMoreElements()) {
                    ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) a.nextElement();
                    if (!extensions.b(aSN1ObjectIdentifier).t) {
                        hashSet.add(aSN1ObjectIdentifier.b);
                    }
                }
                return hashSet;
            }
            return null;
        }
        return null;
    }

    @Override // java.security.cert.X509Certificate
    public final Date getNotAfter() {
        return this.a.d().b();
    }

    @Override // java.security.cert.X509Certificate
    public final Date getNotBefore() {
        return this.a.e().b();
    }

    @Override // java.security.cert.Certificate
    public PublicKey getPublicKey() {
        asum asumVar;
        try {
            SubjectPublicKeyInfo subjectPublicKeyInfo = this.a.b.i;
            Logger logger = asus.a;
            if (subjectPublicKeyInfo.a.a.h(BCObjectIdentifiers.am)) {
                new atbm(6, (float[]) null);
                return new atcf(subjectPublicKeyInfo);
            }
            ASN1ObjectIdentifier aSN1ObjectIdentifier = subjectPublicKeyInfo.a.a;
            synchronized (asus.b) {
                asumVar = (asum) asus.b.get(aSN1ObjectIdentifier);
            }
            if (asumVar == null) {
                return null;
            }
            return asumVar.b(subjectPublicKeyInfo);
        } catch (IOException e) {
            throw new IllegalStateException("failed to recover public key: ".concat(String.valueOf(e.getMessage())), e);
        }
    }

    @Override // java.security.cert.X509Certificate
    public final BigInteger getSerialNumber() {
        return this.a.b.c.j();
    }

    @Override // java.security.cert.X509Certificate
    public final String getSigAlgName() {
        return this.d;
    }

    @Override // java.security.cert.X509Certificate
    public final String getSigAlgOID() {
        return this.a.c.a.b;
    }

    @Override // java.security.cert.X509Certificate
    public final byte[] getSigAlgParams() {
        return atow.O(this.e);
    }

    @Override // java.security.cert.X509Certificate
    public final byte[] getSignature() {
        return this.a.d.n();
    }

    @Override // java.security.cert.X509Certificate
    public final Collection getSubjectAlternativeNames() {
        return c(this.a, Extension.c.b);
    }

    @Override // java.security.cert.X509Certificate
    public final Principal getSubjectDN() {
        return new asup(this.a.b());
    }

    @Override // java.security.cert.X509Certificate
    public final boolean[] getSubjectUniqueID() {
        boolean z;
        ASN1BitString aSN1BitString = this.a.b.k;
        if (aSN1BitString != null) {
            byte[] m = aSN1BitString.m();
            int length = (m.length * 8) - aSN1BitString.f();
            boolean[] zArr = new boolean[length];
            for (int i = 0; i != length; i++) {
                if ((m[i / 8] & (128 >>> (i % 8))) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                zArr[i] = z;
            }
            return zArr;
        }
        return null;
    }

    @Override // java.security.cert.X509Certificate
    public X500Principal getSubjectX500Principal() {
        try {
            return new X500Principal(this.a.b().u());
        } catch (IOException unused) {
            throw new IllegalStateException("can't encode subject DN");
        }
    }

    @Override // java.security.cert.X509Certificate
    public final byte[] getTBSCertificate() {
        try {
            return this.a.b.u();
        } catch (IOException e) {
            throw new CertificateEncodingException(e.toString());
        }
    }

    @Override // java.security.cert.X509Certificate
    public final int getVersion() {
        return this.a.b.b.f() + 1;
    }

    @Override // java.security.cert.X509Extension
    public final boolean hasUnsupportedCriticalExtension() {
        Extensions extensions;
        if (getVersion() == 3 && (extensions = this.a.b.l) != null) {
            Enumeration a = extensions.a();
            while (a.hasMoreElements()) {
                ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) a.nextElement();
                if (!aSN1ObjectIdentifier.x(Extension.b) && !aSN1ObjectIdentifier.x(Extension.m) && !aSN1ObjectIdentifier.x(Extension.n) && !aSN1ObjectIdentifier.x(Extension.r) && !aSN1ObjectIdentifier.x(Extension.l) && !aSN1ObjectIdentifier.x(Extension.i) && !aSN1ObjectIdentifier.x(Extension.h) && !aSN1ObjectIdentifier.x(Extension.o) && !aSN1ObjectIdentifier.x(Extension.e) && !aSN1ObjectIdentifier.x(Extension.c) && !aSN1ObjectIdentifier.x(Extension.k) && extensions.b(aSN1ObjectIdentifier).t) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // java.security.cert.Certificate
    public final String toString() {
        KeyUsage keyUsage;
        StringBuffer stringBuffer = new StringBuffer();
        String str = atdg.a;
        stringBuffer.append("  [0]         Version: ");
        stringBuffer.append(getVersion());
        stringBuffer.append(str);
        stringBuffer.append("         SerialNumber: ");
        stringBuffer.append(getSerialNumber());
        stringBuffer.append(str);
        stringBuffer.append("             IssuerDN: ");
        stringBuffer.append(getIssuerDN());
        stringBuffer.append(str);
        stringBuffer.append("           Start Date: ");
        stringBuffer.append(getNotBefore());
        stringBuffer.append(str);
        stringBuffer.append("           Final Date: ");
        stringBuffer.append(getNotAfter());
        stringBuffer.append(str);
        stringBuffer.append("            SubjectDN: ");
        stringBuffer.append(getSubjectDN());
        stringBuffer.append(str);
        stringBuffer.append("           Public Key: ");
        stringBuffer.append(getPublicKey());
        stringBuffer.append(str);
        stringBuffer.append("  Signature Algorithm: ");
        stringBuffer.append(this.d);
        stringBuffer.append(str);
        asuj.b(getSignature(), stringBuffer, str);
        Extensions extensions = this.a.b.l;
        if (extensions != null) {
            Enumeration a = extensions.a();
            if (a.hasMoreElements()) {
                stringBuffer.append("       Extensions: \n");
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
                        if (aSN1ObjectIdentifier.x(Extension.e)) {
                            stringBuffer.append(BasicConstraints.a(aSN1InputStream.f()));
                            stringBuffer.append(str);
                        } else if (aSN1ObjectIdentifier.x(Extension.b)) {
                            ASN1Primitive f = aSN1InputStream.f();
                            if (f != null) {
                                keyUsage = new KeyUsage(ASN1BitString.i(f));
                            } else {
                                keyUsage = null;
                            }
                            stringBuffer.append(keyUsage);
                            stringBuffer.append(str);
                        } else if (aSN1ObjectIdentifier.x(MiscObjectIdentifiers.b)) {
                            stringBuffer.append(new NetscapeCertType(ASN1BitString.i(aSN1InputStream.f())));
                            stringBuffer.append(str);
                        } else if (aSN1ObjectIdentifier.x(MiscObjectIdentifiers.c)) {
                            stringBuffer.append(new NetscapeRevocationURL(ASN1IA5String.f(aSN1InputStream.f())));
                            stringBuffer.append(str);
                        } else if (aSN1ObjectIdentifier.x(MiscObjectIdentifiers.e)) {
                            stringBuffer.append(new VerisignCzagExtension(ASN1IA5String.f(aSN1InputStream.f())));
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
        return stringBuffer.toString();
    }

    @Override // java.security.cert.Certificate
    public final void verify(PublicKey publicKey) {
        e(publicKey, new astz(this, 2));
    }

    @Override // java.security.cert.X509Certificate
    public void checkValidity(Date date) {
        if (date.getTime() > getNotAfter().getTime()) {
            throw new CertificateExpiredException("certificate expired on ".concat(this.a.d().a()));
        }
        if (date.getTime() < getNotBefore().getTime()) {
            throw new CertificateNotYetValidException("certificate not valid till ".concat(this.a.e().a()));
        }
    }

    @Override // java.security.cert.Certificate
    public final void verify(PublicKey publicKey, String str) {
        e(publicKey, new astz(str, 3));
    }

    @Override // java.security.cert.X509Certificate, java.security.cert.Certificate
    public final void verify(PublicKey publicKey, Provider provider) {
        try {
            e(publicKey, new astz(provider, 4));
        } catch (NoSuchProviderException e) {
            throw new NoSuchAlgorithmException("provider issue: ".concat(String.valueOf(e.getMessage())));
        }
    }
}
