package defpackage;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ataa extends aszy {
    @Override // defpackage.aszy
    public final astl a(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        asvu a = asvu.a(subjectPublicKeyInfo.a.b);
        if (a != null) {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = a.c.a;
            asvy a2 = asvy.a(subjectPublicKeyInfo.a());
            atbf atbfVar = new atbf(new ataw(a.a, a.b, atac.v(aSN1ObjectIdentifier)));
            atbfVar.b = atow.ak(a2.b());
            atbfVar.a = atow.ak(a2.c());
            return new ataz(atbfVar);
        }
        byte[] bArr = ASN1OctetString.f(subjectPublicKeyInfo.a()).c;
        atbf atbfVar2 = new atbf((ataw) ataw.a.get(Integer.valueOf(atow.C(bArr, 0))));
        atbfVar2.c = atow.ak(bArr);
        return new ataz(atbfVar2);
    }
}
