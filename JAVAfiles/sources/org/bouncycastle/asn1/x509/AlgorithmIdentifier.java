package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class AlgorithmIdentifier extends ASN1Object {
    public ASN1ObjectIdentifier a;
    public ASN1Encodable b;

    public AlgorithmIdentifier(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.a = aSN1ObjectIdentifier;
    }

    public static AlgorithmIdentifier a(Object obj) {
        if (obj instanceof AlgorithmIdentifier) {
            return (AlgorithmIdentifier) obj;
        }
        if (obj != null) {
            return new AlgorithmIdentifier(ASN1Sequence.j(obj));
        }
        return null;
    }

    public static AlgorithmIdentifier b(ASN1TaggedObject aSN1TaggedObject) {
        return a(ASN1Sequence.m(aSN1TaggedObject, true));
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.b(this.a);
        ASN1Encodable aSN1Encodable = this.b;
        if (aSN1Encodable != null) {
            aSN1EncodableVector.b(aSN1Encodable);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public AlgorithmIdentifier(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Encodable aSN1Encodable) {
        this.a = aSN1ObjectIdentifier;
        this.b = aSN1Encodable;
    }

    private AlgorithmIdentifier(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.e() > 0 && aSN1Sequence.e() <= 2) {
            this.a = ASN1ObjectIdentifier.f(aSN1Sequence.h(0));
            this.b = aSN1Sequence.e() == 2 ? aSN1Sequence.h(1) : null;
        } else {
            throw new IllegalArgumentException("Bad sequence size: " + aSN1Sequence.e());
        }
    }
}
