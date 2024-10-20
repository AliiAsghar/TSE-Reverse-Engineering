package defpackage;

import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aszi extends aszy {
    @Override // defpackage.aszy
    public final astl a(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        byte[] n = subjectPublicKeyInfo.b.n();
        return new aswy(atac.A(subjectPublicKeyInfo.a.a), atow.S(n, 1, n.length));
    }
}
