package defpackage;

import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aszm extends aszy {
    @Override // defpackage.aszy
    public final astl a(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        byte[] bArr = ASN1OctetString.f(subjectPublicKeyInfo.a()).c;
        if (atow.C(bArr, 0) == 1) {
            return asxq.a(atow.S(bArr, 4, bArr.length));
        }
        if (bArr.length == 64) {
            bArr = atow.S(bArr, 4, 64);
        }
        return asxk.a(bArr);
    }
}
