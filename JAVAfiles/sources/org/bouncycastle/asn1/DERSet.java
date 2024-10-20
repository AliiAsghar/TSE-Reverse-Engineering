package org.bouncycastle.asn1;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class DERSet extends ASN1Set {
    private int d;

    public DERSet() {
        this.d = -1;
    }

    private final int i() {
        int i = this.d;
        if (i < 0) {
            int length = this.b.length;
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                i2 += this.b[i3].p().k().a(true);
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
        DEROutputStream d = aSN1OutputStream.d();
        int length = this.b.length;
        int i = 0;
        if (this.d < 0 && length <= 16) {
            ASN1Primitive[] aSN1PrimitiveArr = new ASN1Primitive[length];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                ASN1Primitive k = this.b[i3].p().k();
                aSN1PrimitiveArr[i3] = k;
                i2 += k.a(true);
            }
            this.d = i2;
            aSN1OutputStream.h(i2);
            while (i < length) {
                aSN1PrimitiveArr[i].b(d, true);
                i++;
            }
            return;
        }
        aSN1OutputStream.h(i());
        while (i < length) {
            this.b[i].p().k().b(d, true);
            i++;
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Set, org.bouncycastle.asn1.ASN1Primitive
    public final ASN1Primitive k() {
        if (this.c != null) {
            return this;
        }
        return super.k();
    }

    public DERSet(ASN1EncodableVector aSN1EncodableVector) {
        super(aSN1EncodableVector, true);
        this.d = -1;
    }

    public DERSet(ASN1Encodable[] aSN1EncodableArr) {
        super(true, aSN1EncodableArr);
        this.d = -1;
    }

    @Override // org.bouncycastle.asn1.ASN1Set, org.bouncycastle.asn1.ASN1Primitive
    public final ASN1Primitive l() {
        return this;
    }
}
