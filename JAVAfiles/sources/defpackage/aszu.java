package defpackage;

import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aszu extends aszy {
    @Override // defpackage.aszy
    public final astl a(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        return new asyv(atac.I(subjectPublicKeyInfo.a.a), ASN1OctetString.f(ASN1Sequence.j(subjectPublicKeyInfo.a()).h(0)).c);
    }
}
