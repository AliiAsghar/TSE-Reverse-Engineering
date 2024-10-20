package org.bouncycastle.asn1.pkcs;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERSequence;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class CertificationRequest extends ASN1Object {
    protected CertificationRequest() {
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.b(null);
        aSN1EncodableVector.b(null);
        aSN1EncodableVector.b(null);
        return new DERSequence(aSN1EncodableVector);
    }
}
