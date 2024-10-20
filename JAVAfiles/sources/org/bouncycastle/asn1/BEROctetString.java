package org.bouncycastle.asn1;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class BEROctetString extends ASN1OctetString {
    private final ASN1OctetString[] d;

    public BEROctetString(byte[] bArr, ASN1OctetString[] aSN1OctetStringArr) {
        super(bArr);
        this.d = aSN1OctetStringArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] h(ASN1OctetString[] aSN1OctetStringArr) {
        int length = aSN1OctetStringArr.length;
        if (length != 0) {
            if (length != 1) {
                int i = 0;
                for (ASN1OctetString aSN1OctetString : aSN1OctetStringArr) {
                    i += aSN1OctetString.c.length;
                }
                byte[] bArr = new byte[i];
                int i2 = 0;
                for (ASN1OctetString aSN1OctetString2 : aSN1OctetStringArr) {
                    byte[] bArr2 = aSN1OctetString2.c;
                    int length2 = bArr2.length;
                    System.arraycopy(bArr2, 0, bArr, i2, length2);
                    i2 += length2;
                }
                return bArr;
            }
            return aSN1OctetStringArr[0].c;
        }
        return b;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final int a(boolean z) {
        int i;
        if (true != z) {
            i = 3;
        } else {
            i = 4;
        }
        if (this.d != null) {
            int i2 = 0;
            while (true) {
                ASN1OctetString[] aSN1OctetStringArr = this.d;
                if (i2 < aSN1OctetStringArr.length) {
                    i += aSN1OctetStringArr[i2].a(true);
                    i2++;
                } else {
                    return i;
                }
            }
        } else {
            int length = this.c.length;
            int i3 = length / 1000;
            int h = i + (DEROctetString.h(1000) * i3);
            int i4 = length - (i3 * 1000);
            if (i4 > 0) {
                return h + DEROctetString.h(i4);
            }
            return h;
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final void b(ASN1OutputStream aSN1OutputStream, boolean z) {
        aSN1OutputStream.m(z, 36);
        aSN1OutputStream.f(128);
        ASN1OctetString[] aSN1OctetStringArr = this.d;
        if (aSN1OctetStringArr != null) {
            aSN1OutputStream.n(aSN1OctetStringArr);
        } else {
            int i = 0;
            while (true) {
                int length = this.c.length;
                if (i >= length) {
                    break;
                }
                int min = Math.min(length - i, 1000);
                aSN1OutputStream.k(true, 4, this.c, i, min);
                i += min;
            }
        }
        aSN1OutputStream.f(0);
        aSN1OutputStream.f(0);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean d() {
        return true;
    }

    public BEROctetString(ASN1OctetString[] aSN1OctetStringArr) {
        this(h(aSN1OctetStringArr), aSN1OctetStringArr);
    }
}
