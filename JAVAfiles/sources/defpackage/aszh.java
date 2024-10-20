package defpackage;

import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aszh extends aszy {
    public static aswp b(aswn aswnVar, ASN1BitString aSN1BitString) {
        try {
            ASN1Primitive v = ASN1Primitive.v(aSN1BitString.n());
            if (v instanceof ASN1Sequence) {
                ASN1Sequence j = ASN1Sequence.j(v);
                return new aswp(aswnVar, ASN1OctetString.f(j.h(0)).c, ASN1OctetString.f(j.h(1)).c);
            }
            return new aswp(aswnVar, ASN1OctetString.f(v).c);
        } catch (Exception unused) {
            return new aswp(aswnVar, aSN1BitString.n());
        }
    }

    @Override // defpackage.aszy
    public final astl a(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        return b(atac.y(subjectPublicKeyInfo.a.a), subjectPublicKeyInfo.b);
    }
}
