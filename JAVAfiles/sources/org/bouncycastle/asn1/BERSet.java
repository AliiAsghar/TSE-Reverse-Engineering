package org.bouncycastle.asn1;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class BERSet extends ASN1Set {
    public BERSet() {
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final int a(boolean z) {
        int i;
        if (true != z) {
            i = 3;
        } else {
            i = 4;
        }
        int length = this.b.length;
        for (int i2 = 0; i2 < length; i2++) {
            i += this.b[i2].p().a(true);
        }
        return i;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final void b(ASN1OutputStream aSN1OutputStream, boolean z) {
        aSN1OutputStream.l(z, 49, this.b);
    }

    public BERSet(ASN1EncodableVector aSN1EncodableVector) {
        super(aSN1EncodableVector, false);
    }

    public BERSet(ASN1Encodable[] aSN1EncodableArr) {
        super(false, aSN1EncodableArr);
    }
}
