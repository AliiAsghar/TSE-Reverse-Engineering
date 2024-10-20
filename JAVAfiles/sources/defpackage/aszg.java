package defpackage;

import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aszg extends aszy {
    @Override // defpackage.aszy
    public final astl a(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        try {
            return new aswh(atac.x(subjectPublicKeyInfo.a.a), asvj.a(subjectPublicKeyInfo.a()).b());
        } catch (Exception unused) {
            return new aswh(atac.x(subjectPublicKeyInfo.a.a), subjectPublicKeyInfo.b.n());
        }
    }
}
