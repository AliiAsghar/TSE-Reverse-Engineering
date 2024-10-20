package defpackage;

import j$.util.DesugarCollections;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.security.NoSuchProviderException;
import java.security.cert.CertPath;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERSet;
import org.bouncycastle.asn1.pkcs.ContentInfo;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.SignedData;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class astw extends CertPath {
    static final List a;
    private List b;
    private final asuo c;

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add("PkiPath");
        arrayList.add("PEM");
        arrayList.add("PKCS7");
        a = DesugarCollections.unmodifiableList(arrayList);
    }

    public astw(InputStream inputStream, String str) {
        super("X.509");
        asuo asuoVar = new asuo();
        this.c = asuoVar;
        try {
            if (str.equalsIgnoreCase("PkiPath")) {
                ASN1Primitive f = new ASN1InputStream(inputStream).f();
                if (f instanceof ASN1Sequence) {
                    Enumeration f2 = ((ASN1Sequence) f).f();
                    this.b = new ArrayList();
                    CertificateFactory b = asuoVar.b();
                    while (f2.hasMoreElements()) {
                        this.b.add(0, b.generateCertificate(new ByteArrayInputStream(((ASN1Encodable) f2.nextElement()).p().u())));
                    }
                } else {
                    throw new CertificateException("input stream does not contain a ASN1 SEQUENCE while reading PkiPath encoded data to load CertPath");
                }
            } else {
                if (!str.equalsIgnoreCase("PKCS7") && !str.equalsIgnoreCase("PEM")) {
                    throw new CertificateException(a.cp(str, "unsupported encoding: "));
                }
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
                this.b = new ArrayList();
                CertificateFactory b2 = asuoVar.b();
                while (true) {
                    Certificate generateCertificate = b2.generateCertificate(bufferedInputStream);
                    if (generateCertificate == null) {
                        break;
                    } else {
                        this.b.add(generateCertificate);
                    }
                }
            }
            this.b = a(this.b);
        } catch (IOException e) {
            throw new CertificateException("IOException throw while decoding CertPath:\n".concat(String.valueOf(e.toString())));
        } catch (NoSuchProviderException e2) {
            throw new CertificateException("BouncyCastle provider not found while trying to get a CertificateFactory:\n".concat(String.valueOf(e2.toString())));
        }
    }

    private static final List a(List list) {
        if (list.size() < 2) {
            return list;
        }
        X500Principal issuerX500Principal = ((X509Certificate) list.get(0)).getIssuerX500Principal();
        for (int i = 1; i != list.size(); i++) {
            if (issuerX500Principal.equals(((X509Certificate) list.get(i)).getSubjectX500Principal())) {
                issuerX500Principal = ((X509Certificate) list.get(i)).getIssuerX500Principal();
            } else {
                ArrayList arrayList = new ArrayList(list.size());
                ArrayList arrayList2 = new ArrayList(list);
                for (int i2 = 0; i2 < list.size(); i2++) {
                    X509Certificate x509Certificate = (X509Certificate) list.get(i2);
                    X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
                    int i3 = 0;
                    while (true) {
                        if (i3 != list.size()) {
                            if (((X509Certificate) list.get(i3)).getIssuerX500Principal().equals(subjectX500Principal)) {
                                break;
                            }
                            i3++;
                        } else {
                            arrayList.add(x509Certificate);
                            list.remove(i2);
                            break;
                        }
                    }
                }
                if (arrayList.size() <= 1) {
                    for (int i4 = 0; i4 != arrayList.size(); i4++) {
                        X500Principal issuerX500Principal2 = ((X509Certificate) arrayList.get(i4)).getIssuerX500Principal();
                        int i5 = 0;
                        while (true) {
                            if (i5 < list.size()) {
                                X509Certificate x509Certificate2 = (X509Certificate) list.get(i5);
                                if (issuerX500Principal2.equals(x509Certificate2.getSubjectX500Principal())) {
                                    arrayList.add(x509Certificate2);
                                    list.remove(i5);
                                    break;
                                }
                                i5++;
                            }
                        }
                    }
                    if (list.size() > 0) {
                        return arrayList2;
                    }
                    return arrayList;
                }
                return arrayList2;
            }
        }
        return list;
    }

    private static final ASN1Primitive b(X509Certificate x509Certificate) {
        try {
            return new ASN1InputStream(x509Certificate.getEncoded()).f();
        } catch (Exception e) {
            throw new CertificateEncodingException("Exception while encoding certificate: ".concat(String.valueOf(e.toString())));
        }
    }

    private static final byte[] c(ASN1Encodable aSN1Encodable) {
        try {
            return aSN1Encodable.p().u();
        } catch (IOException e) {
            throw new CertificateEncodingException("Exception thrown: ".concat(e.toString()));
        }
    }

    @Override // java.security.cert.CertPath
    public final List getCertificates() {
        return DesugarCollections.unmodifiableList(new ArrayList(this.b));
    }

    @Override // java.security.cert.CertPath
    public final byte[] getEncoded() {
        Iterator encodings = getEncodings();
        if (!encodings.hasNext()) {
            return null;
        }
        Object next = encodings.next();
        if (next instanceof String) {
            return getEncoded((String) next);
        }
        return null;
    }

    @Override // java.security.cert.CertPath
    public final Iterator getEncodings() {
        return a.iterator();
    }

    @Override // java.security.cert.CertPath
    public final byte[] getEncoded(String str) {
        char[] cArr;
        int i;
        astw astwVar = this;
        if (str.equalsIgnoreCase("PkiPath")) {
            ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
            List list = astwVar.b;
            ListIterator listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                aSN1EncodableVector.b(b((X509Certificate) listIterator.previous()));
            }
            return c(new DERSequence(aSN1EncodableVector));
        }
        Throwable th = null;
        if (str.equalsIgnoreCase("PKCS7")) {
            ContentInfo contentInfo = new ContentInfo(PKCSObjectIdentifiers.s, null);
            ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
            for (int i2 = 0; i2 != astwVar.b.size(); i2++) {
                aSN1EncodableVector2.b(b((X509Certificate) astwVar.b.get(i2)));
            }
            return c(new ContentInfo(PKCSObjectIdentifiers.t, new SignedData(new ASN1Integer(1L), new DERSet(), contentInfo, new DERSet(aSN1EncodableVector2), new DERSet())));
        }
        if (str.equalsIgnoreCase("PEM")) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            atdr atdrVar = new atdr(new OutputStreamWriter(byteArrayOutputStream));
            int i3 = 0;
            while (i3 != astwVar.b.size()) {
                try {
                    List list2 = atdq.a;
                    byte[] encoded = ((X509Certificate) astwVar.b.get(i3)).getEncoded();
                    List unmodifiableList = DesugarCollections.unmodifiableList(atdq.a);
                    atdrVar.write(a.bW("CERTIFICATE", "-----BEGIN ", "-----"));
                    atdrVar.newLine();
                    if (!unmodifiableList.isEmpty()) {
                        Iterator it = unmodifiableList.iterator();
                        if (!it.hasNext()) {
                            atdrVar.newLine();
                        } else {
                            throw th;
                        }
                    }
                    atdk atdkVar = atdh.a;
                    int length = encoded.length;
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(((length + 2) / 3) * 4);
                    try {
                        atdk atdkVar2 = atdh.a;
                        byte[] bArr = new byte[72];
                        int i4 = 0;
                        while (length > 0) {
                            int min = Math.min(54, length);
                            int i5 = i4 + min;
                            int i6 = i4;
                            int i7 = 0;
                            while (i6 < i5 - 2) {
                                byte b = encoded[i6];
                                int i8 = encoded[i6 + 1] & 255;
                                byte b2 = encoded[i6 + 2];
                                int i9 = i5;
                                byte[] bArr2 = ((atdi) atdkVar2).a;
                                bArr[i7] = bArr2[(b >>> 2) & 63];
                                bArr[i7 + 1] = bArr2[((b << 4) | (i8 >>> 4)) & 63];
                                int i10 = i7 + 3;
                                bArr[i7 + 2] = bArr2[(((b2 & 255) >>> 6) | (i8 << 2)) & 63];
                                i7 += 4;
                                bArr[i10] = bArr2[b2 & 63];
                                i6 += 3;
                                i5 = i9;
                            }
                            int i11 = i5;
                            int i12 = min - (i6 - i4);
                            if (i12 == 1) {
                                int i13 = encoded[i6] & 255;
                                byte[] bArr3 = ((atdi) atdkVar2).a;
                                bArr[i7] = bArr3[i13 >>> 2];
                                bArr[i7 + 1] = bArr3[(i13 << 4) & 63];
                                int i14 = i7 + 3;
                                byte b3 = ((atdi) atdkVar2).b;
                                bArr[i7 + 2] = b3;
                                i7 += 4;
                                bArr[i14] = b3;
                            } else if (i12 == 2) {
                                int i15 = i6 + 1;
                                int i16 = encoded[i6] & 255;
                                int i17 = encoded[i15] & 255;
                                byte[] bArr4 = ((atdi) atdkVar2).a;
                                bArr[i7] = bArr4[i16 >>> 2];
                                bArr[i7 + 1] = bArr4[((i16 << 4) | (i17 >>> 4)) & 63];
                                int i18 = i7 + 3;
                                bArr[i7 + 2] = bArr4[(i17 << 2) & 63];
                                i7 += 4;
                                bArr[i18] = ((atdi) atdkVar2).b;
                            }
                            byteArrayOutputStream2.write(bArr, 0, i7);
                            length -= min;
                            i4 = i11;
                        }
                        byte[] byteArray = byteArrayOutputStream2.toByteArray();
                        for (int i19 = 0; i19 < byteArray.length; i19 += 64) {
                            int i20 = 0;
                            while (true) {
                                cArr = atdrVar.a;
                                int length2 = cArr.length;
                                if (i20 != 64 && (i = i19 + i20) < byteArray.length) {
                                    cArr[i20] = (char) byteArray[i];
                                    i20++;
                                }
                            }
                            atdrVar.write(cArr, 0, i20);
                            atdrVar.newLine();
                            int length3 = atdrVar.a.length;
                        }
                        atdrVar.write(a.bW("CERTIFICATE", "-----END ", "-----"));
                        atdrVar.newLine();
                        i3++;
                        astwVar = this;
                        th = null;
                    } catch (Exception e) {
                        throw new atdl("exception encoding base64 string: ".concat(String.valueOf(e.getMessage())), e);
                    }
                } catch (Exception unused) {
                    throw new CertificateEncodingException("can't encode certificate for PEM encoded path");
                }
            }
            atdrVar.close();
            return byteArrayOutputStream.toByteArray();
        }
        throw new CertificateEncodingException("unsupported encoding: ".concat(String.valueOf(str)));
    }

    public astw(List list) {
        super("X.509");
        this.c = new asuo();
        this.b = a(new ArrayList(list));
    }
}
