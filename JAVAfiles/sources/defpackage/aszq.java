package defpackage;

import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aszq extends aszy {
    @Override // defpackage.aszy
    public final astl a(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        return new asxz(atac.D(subjectPublicKeyInfo.a.a), ASN1OctetString.f(subjectPublicKeyInfo.a()).c);
    }
}
