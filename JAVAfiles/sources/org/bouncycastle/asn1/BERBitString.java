package org.bouncycastle.asn1;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class BERBitString extends ASN1BitString {
    private final ASN1BitString[] c;

    public BERBitString(byte[] bArr, int i) {
        super(bArr, i);
        this.c = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] q(ASN1BitString[] aSN1BitStringArr) {
        int length = aSN1BitStringArr.length;
        if (length != 0) {
            if (length != 1) {
                int i = length - 1;
                int i2 = 0;
                for (int i3 = 0; i3 < i; i3++) {
                    if (aSN1BitStringArr[i3].b[0] == 0) {
                        i2 += r6.length - 1;
                    } else {
                        throw new IllegalArgumentException("only the last nested bitstring can have padding");
                    }
                }
                byte[] bArr = aSN1BitStringArr[i].b;
                byte b = bArr[0];
                byte[] bArr2 = new byte[i2 + bArr.length];
                bArr2[0] = b;
                int i4 = 1;
                for (ASN1BitString aSN1BitString : aSN1BitStringArr) {
                    byte[] bArr3 = aSN1BitString.b;
                    int length2 = bArr3.length - 1;
                    System.arraycopy(bArr3, 1, bArr2, i4, length2);
                    i4 += length2;
                }
                return bArr2;
            }
            return aSN1BitStringArr[0].b;
        }
        return new byte[]{0};
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final int a(boolean z) {
        int i;
        if (d()) {
            if (true != z) {
                i = 3;
            } else {
                i = 4;
            }
            if (this.c != null) {
                int i2 = 0;
                while (true) {
                    ASN1BitString[] aSN1BitStringArr = this.c;
                    if (i2 < aSN1BitStringArr.length) {
                        i += aSN1BitStringArr[i2].a(true);
                        i2++;
                    } else {
                        return i;
                    }
                }
            } else {
                int length = this.b.length;
                if (length >= 2) {
                    int i3 = (length - 2) / 999;
                    return i + (ASN1OutputStream.b(true, 1000) * i3) + ASN1OutputStream.b(true, length - (i3 * 999));
                }
                return i;
            }
        } else {
            return ASN1OutputStream.b(z, this.b.length);
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final void b(ASN1OutputStream aSN1OutputStream, boolean z) {
        if (!d()) {
            byte[] bArr = this.b;
            aSN1OutputStream.k(z, 3, bArr, 0, bArr.length);
            return;
        }
        aSN1OutputStream.m(z, 35);
        aSN1OutputStream.f(128);
        ASN1BitString[] aSN1BitStringArr = this.c;
        if (aSN1BitStringArr != null) {
            aSN1OutputStream.n(aSN1BitStringArr);
        } else {
            byte[] bArr2 = this.b;
            int length = bArr2.length;
            if (length >= 2) {
                byte b = bArr2[0];
                int i = length - 1;
                while (i > 999) {
                    DLBitString.q(aSN1OutputStream, (byte) 0, this.b, length - i, 999);
                    i -= 999;
                }
                DLBitString.q(aSN1OutputStream, b, this.b, length - i, i);
            }
        }
        aSN1OutputStream.f(0);
        aSN1OutputStream.f(0);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean d() {
        if (this.c == null && this.b.length <= 1000) {
            return false;
        }
        return true;
    }

    public BERBitString(ASN1BitString[] aSN1BitStringArr) {
        super(q(aSN1BitStringArr));
        this.c = aSN1BitStringArr;
    }
}
