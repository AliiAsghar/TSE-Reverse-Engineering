package org.bouncycastle.asn1.pkcs;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.BERSequence;
import org.bouncycastle.asn1.BERTaggedObject;
import org.bouncycastle.asn1.DLSequence;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ContentInfo extends ASN1Object implements PKCSObjectIdentifiers {
    private final ASN1ObjectIdentifier J;
    private ASN1Encodable K;
    private boolean L;

    public ContentInfo(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Encodable aSN1Encodable) {
        this.L = true;
        this.J = aSN1ObjectIdentifier;
        this.K = aSN1Encodable;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.b(this.J);
        ASN1Encodable aSN1Encodable = this.K;
        if (aSN1Encodable != null) {
            aSN1EncodableVector.b(new BERTaggedObject(aSN1Encodable));
        }
        if (this.L) {
            return new BERSequence(aSN1EncodableVector);
        }
        return new DLSequence(aSN1EncodableVector);
    }

    public ContentInfo(ASN1Sequence aSN1Sequence) {
        this.L = true;
        Enumeration f = aSN1Sequence.f();
        this.J = (ASN1ObjectIdentifier) f.nextElement();
        if (f.hasMoreElements()) {
            this.K = ((ASN1TaggedObject) f.nextElement()).f();
        }
        this.L = aSN1Sequence instanceof BERSequence;
    }
}
