package defpackage;

import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aszl extends aszy {
    @Override // defpackage.aszy
    public final astl a(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        asvm asvmVar;
        asws z = atac.z(subjectPublicKeyInfo.a.a);
        try {
            ASN1Primitive a = subjectPublicKeyInfo.a();
            if (a != null) {
                asvmVar = new asvm(ASN1Sequence.j(a));
            } else {
                asvmVar = null;
            }
            return new aswu(z, atow.O(asvmVar.a), atow.O(asvmVar.b));
        } catch (Exception unused) {
            return new aswu(z, subjectPublicKeyInfo.b.n());
        }
    }
}
