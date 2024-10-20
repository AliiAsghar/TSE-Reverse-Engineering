package defpackage;

import java.security.cert.CRLException;
import org.bouncycastle.asn1.x509.CertificateList;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class asuc extends asub {
    private final byte[] f;
    private final CRLException g;

    public asuc(asuo asuoVar, CertificateList certificateList, String str, byte[] bArr, boolean z, byte[] bArr2, CRLException cRLException) {
        super(asuoVar, certificateList, str, bArr, z);
        this.f = bArr2;
        this.g = cRLException;
    }

    @Override // java.security.cert.X509CRL
    public final byte[] getEncoded() {
        CRLException cRLException = this.g;
        if (cRLException == null) {
            byte[] bArr = this.f;
            if (bArr != null) {
                return bArr;
            }
            throw new CRLException();
        }
        throw cRLException;
    }
}
