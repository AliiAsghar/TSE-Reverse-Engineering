package org.bouncycastle.asn1;

import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
class DEROutputStream extends DLOutputStream {
    public DEROutputStream(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // org.bouncycastle.asn1.DLOutputStream, org.bouncycastle.asn1.ASN1OutputStream
    public final void i(ASN1Encodable[] aSN1EncodableArr) {
        for (ASN1Encodable aSN1Encodable : aSN1EncodableArr) {
            aSN1Encodable.p().k().b(this, true);
        }
    }

    @Override // org.bouncycastle.asn1.DLOutputStream, org.bouncycastle.asn1.ASN1OutputStream
    public final void n(ASN1Primitive[] aSN1PrimitiveArr) {
        for (ASN1Primitive aSN1Primitive : aSN1PrimitiveArr) {
            aSN1Primitive.k().b(this, true);
        }
    }

    @Override // org.bouncycastle.asn1.DLOutputStream, org.bouncycastle.asn1.ASN1OutputStream
    public final void p(ASN1Primitive aSN1Primitive) {
        aSN1Primitive.k().b(this, true);
    }

    @Override // org.bouncycastle.asn1.ASN1OutputStream
    public final DEROutputStream d() {
        return this;
    }
}
