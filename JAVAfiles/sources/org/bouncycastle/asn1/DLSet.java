package org.bouncycastle.asn1;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class DLSet extends ASN1Set {
    private int d;

    public DLSet() {
        this.d = -1;
    }

    private final int i() {
        int i = this.d;
        if (i < 0) {
            int length = this.b.length;
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                i2 += this.b[i3].p().l().a(true);
            }
            this.d = i2;
            return i2;
        }
        return i;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final int a(boolean z) {
        return ASN1OutputStream.b(z, i());
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final void b(ASN1OutputStream aSN1OutputStream, boolean z) {
        aSN1OutputStream.m(z, 49);
        ASN1Encodable[] aSN1EncodableArr = this.b;
        DLOutputStream e = aSN1OutputStream.e();
        int length = aSN1EncodableArr.length;
        int i = 0;
        if (this.d < 0 && length <= 16) {
            ASN1Primitive[] aSN1PrimitiveArr = new ASN1Primitive[length];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                ASN1Primitive l = this.b[i3].p().l();
                aSN1PrimitiveArr[i3] = l;
                i2 += l.a(true);
            }
            this.d = i2;
            aSN1OutputStream.h(i2);
            while (i < length) {
                e.p(aSN1PrimitiveArr[i]);
                i++;
            }
            return;
        }
        aSN1OutputStream.h(i());
        while (i < length) {
            e.p(this.b[i].p());
            i++;
        }
    }

    public DLSet(ASN1EncodableVector aSN1EncodableVector) {
        super(aSN1EncodableVector, false);
        this.d = -1;
    }

    public DLSet(ASN1Encodable[] aSN1EncodableArr) {
        super(false, aSN1EncodableArr);
        this.d = -1;
    }

    public DLSet(ASN1Encodable[] aSN1EncodableArr, ASN1Encodable[] aSN1EncodableArr2) {
        super(aSN1EncodableArr, aSN1EncodableArr2);
        this.d = -1;
    }

    @Override // org.bouncycastle.asn1.ASN1Set, org.bouncycastle.asn1.ASN1Primitive
    public final ASN1Primitive l() {
        return this;
    }
}
