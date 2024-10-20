package org.bouncycastle.asn1;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class DERBitString extends ASN1BitString {
    public DERBitString(ASN1Encodable aSN1Encodable) {
        super(aSN1Encodable.p().u(), 0);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final int a(boolean z) {
        return ASN1OutputStream.b(z, this.b.length);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final void b(ASN1OutputStream aSN1OutputStream, boolean z) {
        byte[] bArr = this.b;
        int i = bArr[0] & 255;
        int length = bArr.length;
        int i2 = length - 1;
        byte b = bArr[i2];
        byte b2 = (byte) ((255 << i) & b);
        if (b == b2) {
            aSN1OutputStream.j(z, 3, bArr);
            return;
        }
        aSN1OutputStream.m(z, 3);
        aSN1OutputStream.h(length);
        aSN1OutputStream.g(bArr, 0, i2);
        aSN1OutputStream.f(b2);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean d() {
        return false;
    }

    public DERBitString(byte[] bArr) {
        super(bArr, 0);
    }

    public DERBitString(byte[] bArr, int i) {
        super(bArr, i);
    }

    public DERBitString(byte[] bArr, byte[] bArr2) {
        super(bArr);
    }

    @Override // org.bouncycastle.asn1.ASN1BitString, org.bouncycastle.asn1.ASN1Primitive
    public final ASN1Primitive k() {
        return this;
    }

    @Override // org.bouncycastle.asn1.ASN1BitString, org.bouncycastle.asn1.ASN1Primitive
    public final ASN1Primitive l() {
        return this;
    }
}
