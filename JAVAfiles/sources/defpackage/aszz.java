package defpackage;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aszz extends aszy {
    @Override // defpackage.aszy
    public final astl a(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        asvt a = asvt.a(subjectPublicKeyInfo.a.b);
        if (a != null) {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = a.b.a;
            asvy a2 = asvy.a(subjectPublicKeyInfo.a());
            atbf atbfVar = new atbf(new atbc(a.a, atac.v(aSN1ObjectIdentifier)));
            atbfVar.b = atow.ak(a2.b());
            atbfVar.a = atow.ak(a2.c());
            return new atbg(atbfVar);
        }
        byte[] bArr = ASN1OctetString.f(subjectPublicKeyInfo.a()).c;
        atbf atbfVar2 = new atbf((atbc) atbc.a.get(Integer.valueOf(atow.C(bArr, 0))));
        atbfVar2.c = atow.ak(bArr);
        return new atbg(atbfVar2);
    }
}
