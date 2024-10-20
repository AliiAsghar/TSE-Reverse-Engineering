package org.bouncycastle.asn1;

import defpackage.atdg;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class DERGeneralizedTime extends ASN1GeneralizedTime {
    public DERGeneralizedTime(String str) {
        super(str);
    }

    private final byte[] j() {
        byte[] bArr = this.a;
        if (bArr[bArr.length - 1] == 90) {
            if (!h()) {
                byte[] bArr2 = this.a;
                int length = bArr2.length;
                byte[] bArr3 = new byte[length + 4];
                System.arraycopy(bArr2, 0, bArr3, 0, length - 1);
                System.arraycopy(atdg.d("0000Z"), 0, bArr3, this.a.length - 1, 5);
                return bArr3;
            }
            if (!i()) {
                byte[] bArr4 = this.a;
                int length2 = bArr4.length;
                byte[] bArr5 = new byte[length2 + 2];
                System.arraycopy(bArr4, 0, bArr5, 0, length2 - 1);
                System.arraycopy(atdg.d("00Z"), 0, bArr5, this.a.length - 1, 3);
                return bArr5;
            }
            if (g()) {
                int length3 = this.a.length - 2;
                while (length3 > 0 && this.a[length3] == 48) {
                    length3--;
                }
                int i = length3 + 1;
                byte[] bArr6 = this.a;
                if (bArr6[length3] == 46) {
                    byte[] bArr7 = new byte[i];
                    System.arraycopy(bArr6, 0, bArr7, 0, length3);
                    bArr7[length3] = 90;
                    return bArr7;
                }
                byte[] bArr8 = new byte[length3 + 2];
                System.arraycopy(bArr6, 0, bArr8, 0, i);
                bArr8[i] = 90;
                return bArr8;
            }
            return this.a;
        }
        return bArr;
    }

    @Override // org.bouncycastle.asn1.ASN1GeneralizedTime, org.bouncycastle.asn1.ASN1Primitive
    public final int a(boolean z) {
        return ASN1OutputStream.b(z, j().length);
    }

    @Override // org.bouncycastle.asn1.ASN1GeneralizedTime, org.bouncycastle.asn1.ASN1Primitive
    public final void b(ASN1OutputStream aSN1OutputStream, boolean z) {
        aSN1OutputStream.j(z, 24, j());
    }

    public DERGeneralizedTime(byte[] bArr) {
        super(bArr);
    }

    @Override // org.bouncycastle.asn1.ASN1GeneralizedTime, org.bouncycastle.asn1.ASN1Primitive
    public final ASN1Primitive k() {
        return this;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final ASN1Primitive l() {
        return this;
    }
}
