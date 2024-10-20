package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class OtherName extends ASN1Object {
    public final ASN1ObjectIdentifier a;
    public final ASN1Encodable b;

    public OtherName(ASN1Sequence aSN1Sequence) {
        this.a = ASN1ObjectIdentifier.f(aSN1Sequence.h(0));
        this.b = ASN1TaggedObject.m(aSN1Sequence.h(1)).f();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.b(this.a);
        aSN1EncodableVector.b(new DERTaggedObject(true, 0, this.b));
        return new DERSequence(aSN1EncodableVector);
    }
}
