package org.bouncycastle.asn1;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class BERSequence extends ASN1Sequence {
    public BERSequence() {
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final int a(boolean z) {
        int i;
        int length = this.b.length;
        if (true != z) {
            i = 3;
        } else {
            i = 4;
        }
        for (int i2 = 0; i2 < length; i2++) {
            i += this.b[i2].p().a(true);
        }
        return i;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final void b(ASN1OutputStream aSN1OutputStream, boolean z) {
        aSN1OutputStream.l(z, 48, this.b);
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence
    public final ASN1BitString g() {
        return new BERBitString(o());
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence
    public final ASN1OctetString i() {
        return new BEROctetString(q());
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence
    public final ASN1Set n() {
        return new BERSet(this.b);
    }

    public BERSequence(ASN1Encodable aSN1Encodable) {
        super(aSN1Encodable);
    }

    public BERSequence(ASN1EncodableVector aSN1EncodableVector) {
        super(aSN1EncodableVector);
    }
}
