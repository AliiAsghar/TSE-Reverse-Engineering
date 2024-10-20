package defpackage;

import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aszf extends aszy {
    @Override // defpackage.aszy
    public final astl a(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        try {
            return new aswc(atac.w(subjectPublicKeyInfo.a.a), ASN1OctetString.f(subjectPublicKeyInfo.a()).c);
        } catch (Exception unused) {
            return new aswc(atac.w(subjectPublicKeyInfo.a.a), subjectPublicKeyInfo.b.n());
        }
    }
}
