package org.bouncycastle.asn1;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class DLSequence extends ASN1Sequence {
    private int c;

    public DLSequence() {
        this.c = -1;
    }

    private final int r() {
        int i = this.c;
        if (i < 0) {
            int length = this.b.length;
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                i2 += this.b[i3].p().l().a(true);
            }
            this.c = i2;
            return i2;
        }
        return i;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final int a(boolean z) {
        return ASN1OutputStream.b(z, r());
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final void b(ASN1OutputStream aSN1OutputStream, boolean z) {
        aSN1OutputStream.m(z, 48);
        DLOutputStream e = aSN1OutputStream.e();
        int length = this.b.length;
        int i = 0;
        if (this.c < 0 && length <= 16) {
            ASN1Primitive[] aSN1PrimitiveArr = new ASN1Primitive[length];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                ASN1Primitive l = this.b[i3].p().l();
                aSN1PrimitiveArr[i3] = l;
                i2 += l.a(true);
            }
            this.c = i2;
            aSN1OutputStream.h(i2);
            while (i < length) {
                e.p(aSN1PrimitiveArr[i]);
                i++;
            }
            return;
        }
        aSN1OutputStream.h(r());
        while (i < length) {
            e.p(this.b[i].p());
            i++;
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence
    public final ASN1BitString g() {
        return new DLBitString(BERBitString.q(o()));
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence
    public final ASN1OctetString i() {
        return new DEROctetString(BEROctetString.h(q()));
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence
    public final ASN1Set n() {
        return new DLSet(this.b);
    }

    public DLSequence(ASN1Encodable aSN1Encodable) {
        super(aSN1Encodable);
        this.c = -1;
    }

    public DLSequence(ASN1EncodableVector aSN1EncodableVector) {
        super(aSN1EncodableVector);
        this.c = -1;
    }

    public DLSequence(ASN1Encodable[] aSN1EncodableArr) {
        super(aSN1EncodableArr, null);
        this.c = -1;
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence, org.bouncycastle.asn1.ASN1Primitive
    public final ASN1Primitive l() {
        return this;
    }
}
