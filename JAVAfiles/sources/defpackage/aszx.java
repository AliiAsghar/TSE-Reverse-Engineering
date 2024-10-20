package defpackage;

import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aszx extends aszy {
    @Override // defpackage.aszy
    public final astl a(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        try {
            byte[] bArr = ASN1OctetString.f(subjectPublicKeyInfo.a()).c;
            return new asze(atac.J(subjectPublicKeyInfo.a.a), atow.S(bArr, 4, bArr.length));
        } catch (Exception unused) {
            return new asze(atac.J(subjectPublicKeyInfo.a.a), subjectPublicKeyInfo.b.n());
        }
    }
}
