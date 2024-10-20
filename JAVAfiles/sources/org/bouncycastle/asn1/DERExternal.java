package org.bouncycastle.asn1;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class DERExternal extends ASN1External {
    public DERExternal(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Integer aSN1Integer, ASN1Primitive aSN1Primitive, int i, ASN1Primitive aSN1Primitive2) {
        super(aSN1ObjectIdentifier, aSN1Integer, aSN1Primitive, i, aSN1Primitive2);
    }

    @Override // org.bouncycastle.asn1.ASN1External
    public final ASN1Sequence e() {
        boolean z;
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(4);
        ASN1ObjectIdentifier aSN1ObjectIdentifier = this.a;
        if (aSN1ObjectIdentifier != null) {
            aSN1EncodableVector.b(aSN1ObjectIdentifier);
        }
        ASN1Integer aSN1Integer = this.b;
        if (aSN1Integer != null) {
            aSN1EncodableVector.b(aSN1Integer);
        }
        ASN1Primitive aSN1Primitive = this.c;
        if (aSN1Primitive != null) {
            aSN1EncodableVector.b(aSN1Primitive.k());
        }
        int i = this.d;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        aSN1EncodableVector.b(new DERTaggedObject(z, i, this.e));
        return new DERSequence(aSN1EncodableVector);
    }

    @Override // org.bouncycastle.asn1.ASN1External, org.bouncycastle.asn1.ASN1Primitive
    public final ASN1Primitive k() {
        return this;
    }

    @Override // org.bouncycastle.asn1.ASN1External, org.bouncycastle.asn1.ASN1Primitive
    public final ASN1Primitive l() {
        return this;
    }
}
