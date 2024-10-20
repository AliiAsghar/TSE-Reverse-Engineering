package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.x500.X500Name;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class Certificate extends ASN1Object {
    final ASN1Sequence a;
    public TBSCertificate b;
    public AlgorithmIdentifier c;
    public ASN1BitString d;

    private Certificate(ASN1Sequence aSN1Sequence) {
        this.a = aSN1Sequence;
        if (aSN1Sequence.e() == 3) {
            this.b = TBSCertificate.a(aSN1Sequence.h(0));
            this.c = AlgorithmIdentifier.a(aSN1Sequence.h(1));
            this.d = ASN1BitString.i(aSN1Sequence.h(2));
            return;
        }
        throw new IllegalArgumentException("sequence wrong size for a certificate");
    }

    public static Certificate c(Object obj) {
        if (obj instanceof Certificate) {
            return (Certificate) obj;
        }
        if (obj != null) {
            return new Certificate(ASN1Sequence.j(obj));
        }
        return null;
    }

    public final X500Name a() {
        return this.b.e;
    }

    public final X500Name b() {
        return this.b.h;
    }

    public final Time d() {
        return this.b.g;
    }

    public final Time e() {
        return this.b.f;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        return this.a;
    }
}
