package defpackage;

import java.security.cert.CertificateEncodingException;
import org.bouncycastle.asn1.x509.BasicConstraints;
import org.bouncycastle.asn1.x509.Certificate;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asug extends asuf {
    private final byte[] g;
    private final CertificateEncodingException h;

    public asug(asuo asuoVar, Certificate certificate, BasicConstraints basicConstraints, boolean[] zArr, String str, byte[] bArr, byte[] bArr2, CertificateEncodingException certificateEncodingException) {
        super(asuoVar, certificate, basicConstraints, zArr, str, bArr);
        this.g = bArr2;
        this.h = certificateEncodingException;
    }

    @Override // java.security.cert.Certificate
    public final byte[] getEncoded() {
        CertificateEncodingException certificateEncodingException = this.h;
        if (certificateEncodingException == null) {
            byte[] bArr = this.g;
            if (bArr != null) {
                return bArr;
            }
            throw new CertificateEncodingException();
        }
        throw certificateEncodingException;
    }
}
