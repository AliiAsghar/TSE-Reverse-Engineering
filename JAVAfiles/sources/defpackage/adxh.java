package defpackage;

import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adxh implements adxa {
    public byte[] a;

    @Override // defpackage.adxa
    public final void c(XmlSerializer xmlSerializer) {
        int i;
        int i2;
        char[] cArr;
        char c;
        byte[] bArr = this.a;
        int i3 = 0;
        if (bArr != null) {
            i = bArr.length;
        } else {
            i = 0;
        }
        if (i == 0) {
            cArr = new char[0];
        } else {
            int i4 = i / 3;
            int i5 = i - 1;
            int i6 = ((i5 / 3) + 1) << 2;
            char[] cArr2 = new char[i6];
            int i7 = 0;
            int i8 = 0;
            while (true) {
                i2 = i4 * 3;
                if (i7 >= i2) {
                    break;
                }
                int i9 = bArr[i7] & 255;
                int i10 = i7 + 2;
                int i11 = bArr[i7 + 1] & 255;
                i7 += 3;
                int i12 = (i11 << 8) | (i9 << 16) | (bArr[i10] & 255);
                char[] cArr3 = advk.a;
                cArr2[i8] = cArr3[i12 >>> 18];
                cArr2[i8 + 1] = cArr3[(i12 >>> 12) & 63];
                int i13 = i8 + 3;
                cArr2[i8 + 2] = cArr3[(i12 >>> 6) & 63];
                i8 += 4;
                cArr2[i13] = cArr3[i12 & 63];
            }
            int i14 = i - i2;
            if (i14 > 0) {
                int i15 = bArr[i2] & 255;
                if (i14 == 2) {
                    i3 = (bArr[i5] & 255) << 2;
                    i14 = 2;
                }
                char[] cArr4 = advk.a;
                int i16 = (i15 << 10) | i3;
                cArr2[i6 - 4] = cArr4[i16 >> 12];
                cArr2[i6 - 3] = cArr4[(i16 >>> 6) & 63];
                int i17 = i6 - 2;
                if (i14 == 2) {
                    c = cArr4[i16 & 63];
                } else {
                    c = '=';
                }
                cArr2[i17] = c;
                cArr2[i6 - 1] = '=';
            }
            cArr = cArr2;
        }
        xmlSerializer.text(new String(cArr));
    }
}
