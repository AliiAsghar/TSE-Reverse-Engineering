package org.bouncycastle.asn1;

import java.io.OutputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public class DLOutputStream extends ASN1OutputStream {
    public DLOutputStream(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // org.bouncycastle.asn1.ASN1OutputStream
    public void i(ASN1Encodable[] aSN1EncodableArr) {
        for (ASN1Encodable aSN1Encodable : aSN1EncodableArr) {
            aSN1Encodable.p().l().b(this, true);
        }
    }

    @Override // org.bouncycastle.asn1.ASN1OutputStream
    public void n(ASN1Primitive[] aSN1PrimitiveArr) {
        for (ASN1Primitive aSN1Primitive : aSN1PrimitiveArr) {
            aSN1Primitive.l().b(this, true);
        }
    }

    @Override // org.bouncycastle.asn1.ASN1OutputStream
    public void p(ASN1Primitive aSN1Primitive) {
        aSN1Primitive.l().b(this, true);
    }

    @Override // org.bouncycastle.asn1.ASN1OutputStream
    public final DLOutputStream e() {
        return this;
    }
}
