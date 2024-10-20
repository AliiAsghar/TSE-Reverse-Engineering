package defpackage;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.security.cert.CRL;
import java.security.cert.CRLException;
import java.security.cert.CertPath;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactorySpi;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.StreamUtil;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.SignedData;
import org.bouncycastle.asn1.x509.CertificateList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class astu extends CertificateFactorySpi {
    private static final asuo h = new asuo("CERTIFICATE");
    private static final asuo i = new asuo("CRL");
    private final asuo g = new asuo();
    private ASN1Set a = null;
    private int b = 0;
    private InputStream c = null;
    private ASN1Set d = null;
    private int e = 0;
    private InputStream f = null;

    static {
        new asuo("PKCS7");
    }

    private final CRL b(InputStream inputStream, boolean z) {
        InputStream inputStream2 = this.f;
        if (inputStream2 == null) {
            this.f = inputStream;
            this.d = null;
            this.e = 0;
        } else if (inputStream2 != inputStream) {
            this.f = inputStream;
            this.d = null;
            this.e = 0;
        }
        try {
            ASN1Set aSN1Set = this.d;
            if (aSN1Set != null) {
                if (this.e != aSN1Set.e()) {
                    return c();
                }
                this.d = null;
                this.e = 0;
                return null;
            }
            if (!inputStream.markSupported()) {
                inputStream = new ByteArrayInputStream(atow.A(inputStream));
            }
            inputStream.mark(1);
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            inputStream.reset();
            if (read != 48) {
                return d(i.c(inputStream, z));
            }
            return d(ASN1Sequence.j(new ASN1InputStream(inputStream, StreamUtil.a(inputStream), true).f()));
        } catch (CRLException e) {
            throw e;
        } catch (Exception e2) {
            throw new CRLException(e2.toString());
        }
    }

    private final CRL c() {
        ASN1Set aSN1Set = this.d;
        if (aSN1Set != null && this.e < aSN1Set.e()) {
            ASN1Set aSN1Set2 = this.d;
            int i2 = this.e;
            this.e = i2 + 1;
            return a(CertificateList.c(aSN1Set2.f(i2)));
        }
        return null;
    }

    private final CRL d(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence == null) {
            return null;
        }
        if (aSN1Sequence.e() > 1 && (aSN1Sequence.h(0) instanceof ASN1ObjectIdentifier) && aSN1Sequence.h(0).equals(PKCSObjectIdentifiers.t)) {
            this.d = SignedData.a(ASN1Sequence.m((ASN1TaggedObject) aSN1Sequence.h(1), true)).K;
            return c();
        }
        return a(CertificateList.c(aSN1Sequence));
    }

    private final Certificate e(InputStream inputStream, boolean z) {
        InputStream inputStream2 = this.c;
        if (inputStream2 == null) {
            this.c = inputStream;
            this.a = null;
            this.b = 0;
        } else if (inputStream2 != inputStream) {
            this.c = inputStream;
            this.a = null;
            this.b = 0;
        }
        try {
            ASN1Set aSN1Set = this.a;
            if (aSN1Set != null) {
                if (this.b != aSN1Set.e()) {
                    return f();
                }
                this.a = null;
                this.b = 0;
                return null;
            }
            if (!inputStream.markSupported()) {
                inputStream = new ByteArrayInputStream(atow.A(inputStream));
            }
            inputStream.mark(1);
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            inputStream.reset();
            if (read != 48) {
                return g(h.c(inputStream, z));
            }
            return g(ASN1Sequence.j(new ASN1InputStream(inputStream).f()));
        } catch (Exception e) {
            throw new astt("parsing issue: ".concat(String.valueOf(e.getMessage())), e);
        }
    }

    private final Certificate f() {
        if (this.a == null) {
            return null;
        }
        while (this.b < this.a.e()) {
            ASN1Set aSN1Set = this.a;
            int i2 = this.b;
            this.b = i2 + 1;
            ASN1Encodable f = aSN1Set.f(i2);
            if (f instanceof ASN1Sequence) {
                return new asui(this.g, org.bouncycastle.asn1.x509.Certificate.c(f));
            }
        }
        return null;
    }

    private final Certificate g(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence == null) {
            return null;
        }
        if (aSN1Sequence.e() > 1 && (aSN1Sequence.h(0) instanceof ASN1ObjectIdentifier) && aSN1Sequence.h(0).equals(PKCSObjectIdentifiers.t)) {
            this.a = SignedData.a(ASN1Sequence.m((ASN1TaggedObject) aSN1Sequence.h(1), true)).J;
            return f();
        }
        return new asui(this.g, org.bouncycastle.asn1.x509.Certificate.c(aSN1Sequence));
    }

    protected final CRL a(CertificateList certificateList) {
        return new asue(this.g, certificateList);
    }

    @Override // java.security.cert.CertificateFactorySpi
    public final CRL engineGenerateCRL(InputStream inputStream) {
        return b(inputStream, true);
    }

    @Override // java.security.cert.CertificateFactorySpi
    public final Collection engineGenerateCRLs(InputStream inputStream) {
        ArrayList arrayList = new ArrayList();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        while (true) {
            CRL b = b(bufferedInputStream, arrayList.isEmpty());
            if (b != null) {
                arrayList.add(b);
            } else {
                return arrayList;
            }
        }
    }

    @Override // java.security.cert.CertificateFactorySpi
    public final CertPath engineGenerateCertPath(InputStream inputStream) {
        return new astw(inputStream, "PkiPath");
    }

    @Override // java.security.cert.CertificateFactorySpi
    public final Certificate engineGenerateCertificate(InputStream inputStream) {
        return e(inputStream, true);
    }

    @Override // java.security.cert.CertificateFactorySpi
    public final Collection engineGenerateCertificates(InputStream inputStream) {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        ArrayList arrayList = new ArrayList();
        while (true) {
            Certificate e = e(bufferedInputStream, arrayList.isEmpty());
            if (e != null) {
                arrayList.add(e);
            } else {
                return arrayList;
            }
        }
    }

    @Override // java.security.cert.CertificateFactorySpi
    public final Iterator engineGetCertPathEncodings() {
        return astw.a.iterator();
    }

    @Override // java.security.cert.CertificateFactorySpi
    public final CertPath engineGenerateCertPath(InputStream inputStream, String str) {
        return new astw(inputStream, str);
    }

    @Override // java.security.cert.CertificateFactorySpi
    public final CertPath engineGenerateCertPath(List list) {
        for (Object obj : list) {
            if (obj != null && !(obj instanceof X509Certificate)) {
                throw new CertificateException("list contains non X509Certificate object while creating CertPath\n".concat(String.valueOf(obj.toString())));
            }
        }
        return new astw(list);
    }
}
