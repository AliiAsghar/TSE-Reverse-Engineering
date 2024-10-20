package defpackage;

import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aszn extends aszy {
    @Override // defpackage.aszy
    public final astl a(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        asvo asvoVar;
        ASN1Primitive a = subjectPublicKeyInfo.a();
        if (a != null) {
            asvoVar = new asvo(ASN1Sequence.j(a));
        } else {
            asvoVar = null;
        }
        return new atcr(asvoVar.a, asvoVar.b, asvoVar.d, atac.b(asvoVar.c.a));
    }
}
