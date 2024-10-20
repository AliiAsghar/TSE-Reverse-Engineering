package defpackage;

import java.io.IOException;
import java.math.BigInteger;
import java.security.cert.CRLException;
import java.security.cert.X509CRLEntry;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1Enumerated;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.util.ASN1Dump;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.CRLReason;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.asn1.x509.TBSCertList;
import org.bouncycastle.asn1.x509.Time;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class asty extends X509CRLEntry {
    private TBSCertList.CRLEntry a;
    private X500Name b;
    private volatile boolean c;
    private volatile int d;

    /* JADX INFO: Access modifiers changed from: protected */
    public asty(TBSCertList.CRLEntry cRLEntry, boolean z, X500Name x500Name) {
        this.a = cRLEntry;
        if (z) {
            Extension b = b(Extension.j);
            if (b != null) {
                try {
                    for (GeneralName generalName : GeneralNames.a(Extension.a(b)).b()) {
                        if (generalName.b == 4) {
                            x500Name = X500Name.b(generalName.a);
                            break;
                        }
                    }
                } catch (Exception unused) {
                }
            }
            this.b = x500Name;
        }
        x500Name = null;
        this.b = x500Name;
    }

    private final Set a(boolean z) {
        Extensions b = this.a.b();
        if (b != null) {
            HashSet hashSet = new HashSet();
            Enumeration a = b.a();
            while (a.hasMoreElements()) {
                ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) a.nextElement();
                if (z == b.b(aSN1ObjectIdentifier).t) {
                    hashSet.add(aSN1ObjectIdentifier.b);
                }
            }
            return hashSet;
        }
        return null;
    }

    private final Extension b(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        Extensions b = this.a.b();
        if (b != null) {
            return b.b(aSN1ObjectIdentifier);
        }
        return null;
    }

    @Override // java.security.cert.X509CRLEntry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof asty) {
            asty astyVar = (asty) obj;
            if (this.c && astyVar.c && this.d != astyVar.d) {
                return false;
            }
            return this.a.equals(astyVar.a);
        }
        return super.equals(this);
    }

    @Override // java.security.cert.X509CRLEntry
    public final X500Principal getCertificateIssuer() {
        X500Name x500Name = this.b;
        if (x500Name == null) {
            return null;
        }
        try {
            return new X500Principal(x500Name.s());
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.cert.X509Extension
    public final Set getCriticalExtensionOIDs() {
        return a(true);
    }

    @Override // java.security.cert.X509CRLEntry
    public final byte[] getEncoded() {
        try {
            return this.a.u();
        } catch (IOException e) {
            throw new CRLException(e.toString());
        }
    }

    @Override // java.security.cert.X509Extension
    public final byte[] getExtensionValue(String str) {
        Extension b = b(new ASN1ObjectIdentifier(str));
        if (b != null) {
            try {
                return b.u.s();
            } catch (Exception e) {
                throw new IllegalStateException("Exception encoding: ".concat(String.valueOf(e.toString())));
            }
        }
        return null;
    }

    @Override // java.security.cert.X509Extension
    public final Set getNonCriticalExtensionOIDs() {
        return a(false);
    }

    @Override // java.security.cert.X509CRLEntry
    public final Date getRevocationDate() {
        return Time.c(this.a.a.h(1)).b();
    }

    @Override // java.security.cert.X509CRLEntry
    public final BigInteger getSerialNumber() {
        return this.a.a().j();
    }

    @Override // java.security.cert.X509CRLEntry
    public final boolean hasExtensions() {
        if (this.a.b() != null) {
            return true;
        }
        return false;
    }

    @Override // java.security.cert.X509Extension
    public final boolean hasUnsupportedCriticalExtension() {
        Set criticalExtensionOIDs = getCriticalExtensionOIDs();
        if (criticalExtensionOIDs != null && !criticalExtensionOIDs.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override // java.security.cert.X509CRLEntry
    public final int hashCode() {
        if (!this.c) {
            this.d = super.hashCode();
            this.c = true;
        }
        return this.d;
    }

    @Override // java.security.cert.X509CRLEntry
    public final String toString() {
        CRLReason cRLReason;
        StringBuffer stringBuffer = new StringBuffer("      userCertificate: ");
        String str = atdg.a;
        stringBuffer.append(getSerialNumber());
        stringBuffer.append(str);
        stringBuffer.append("       revocationDate: ");
        stringBuffer.append(getRevocationDate());
        stringBuffer.append(str);
        stringBuffer.append("       certificateIssuer: ");
        stringBuffer.append(getCertificateIssuer());
        stringBuffer.append(str);
        Extensions b = this.a.b();
        if (b != null) {
            Enumeration a = b.a();
            if (a.hasMoreElements()) {
                stringBuffer.append("   crlEntryExtensions:");
                stringBuffer.append(str);
                while (a.hasMoreElements()) {
                    ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) a.nextElement();
                    Extension b2 = b.b(aSN1ObjectIdentifier);
                    ASN1OctetString aSN1OctetString = b2.u;
                    if (aSN1OctetString != null) {
                        ASN1InputStream aSN1InputStream = new ASN1InputStream(aSN1OctetString.c);
                        stringBuffer.append("                       critical(");
                        stringBuffer.append(b2.t);
                        stringBuffer.append(") ");
                        try {
                            if (aSN1ObjectIdentifier.x(Extension.g)) {
                                ASN1Enumerated g = ASN1Enumerated.g(aSN1InputStream.f());
                                int i = CRLReason.a;
                                if (g != null) {
                                    ASN1Enumerated g2 = ASN1Enumerated.g(g);
                                    byte[] bArr = g2.b;
                                    int length = bArr.length;
                                    int i2 = g2.c;
                                    if (length - i2 <= 4) {
                                        cRLReason = CRLReason.a(ASN1Integer.e(bArr, i2, -1));
                                    } else {
                                        throw new ArithmeticException("ASN.1 Enumerated out of int range");
                                        break;
                                    }
                                } else {
                                    cRLReason = null;
                                }
                                stringBuffer.append(cRLReason);
                                stringBuffer.append(str);
                            } else if (aSN1ObjectIdentifier.x(Extension.j)) {
                                stringBuffer.append("Certificate issuer: ");
                                stringBuffer.append(GeneralNames.a(aSN1InputStream.f()));
                                stringBuffer.append(str);
                            } else {
                                stringBuffer.append(aSN1ObjectIdentifier.b);
                                stringBuffer.append(" value = ");
                                stringBuffer.append(ASN1Dump.a(aSN1InputStream.f()));
                                stringBuffer.append(str);
                            }
                        } catch (Exception unused) {
                            stringBuffer.append(aSN1ObjectIdentifier.b);
                            stringBuffer.append(" value = *****");
                            stringBuffer.append(str);
                        }
                    } else {
                        stringBuffer.append(str);
                    }
                }
            }
        }
        return stringBuffer.toString();
    }
}
