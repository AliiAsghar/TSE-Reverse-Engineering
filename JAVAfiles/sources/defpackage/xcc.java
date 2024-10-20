package defpackage;

import com.android.vcard.VCardConfig;
import java.io.UnsupportedEncodingException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xcc {
    public final byte[] d;
    public final int e;
    public final aegu f;
    public xcb h;
    public int a = 3;
    public int b = 0;
    public int c = 0;
    public int g = 0;

    public xcc(byte[] bArr, aegu aeguVar) {
        this.d = bArr;
        this.f = aeguVar;
        this.e = bArr.length;
    }

    private final String b(byte[] bArr, int i) {
        if (xzb.q("Bugle", 3)) {
            xzb.c("Bugle", "getStringFromBytes, charSet is " + this.a);
        }
        int i2 = this.a;
        if (i2 == 4) {
            try {
                return new String(bArr, 0, i, VCardConfig.DEFAULT_INTERMEDIATE_CHARSET);
            } catch (UnsupportedEncodingException e) {
                xzb.i("Bugle", e, " ISO-8859-1 UnsupportedEncodingException");
            }
        } else if (i2 == 106) {
            try {
                return new String(bArr, 0, i, "UTF-8");
            } catch (UnsupportedEncodingException e2) {
                xzb.i("Bugle", e2, " UTF-8 UnsupportedEncodingException");
            }
        } else {
            try {
                return new String(bArr, 0, i, "US-ASCII");
            } catch (UnsupportedEncodingException e3) {
                xzb.i("Bugle", e3, " US-ASCII UnsupportedEncodingException");
            }
        }
        return "";
    }

    public final String a() {
        int i;
        int i2;
        byte b;
        int i3;
        byte b2;
        byte[] bArr = this.d;
        int i4 = this.g;
        byte b3 = bArr[i4];
        int i5 = b3 & 255;
        int i6 = 0;
        if (i5 != 3) {
            if (i5 != 131) {
                return "";
            }
            if (xzb.q("Bugle", 3)) {
                xzb.c("Bugle", "parseStringTable, pos " + this.g + " table start " + this.b + " end " + this.c);
            }
            int i7 = this.g + 1;
            this.g = i7;
            int i8 = this.b + (this.d[i7] & 255);
            byte[] bArr2 = new byte[(this.c - i8) + 1];
            while (true) {
                i3 = this.c;
                if (i8 > i3 || (b2 = this.d[i8]) == 0) {
                    break;
                }
                bArr2[i6] = b2;
                i8++;
                i6++;
            }
            if (i8 > i3) {
                return null;
            }
            this.g++;
            return b(bArr2, i6);
        }
        byte[] bArr3 = new byte[this.e + 1];
        if (b3 == 3) {
            this.g = i4 + 1;
            while (true) {
                i = this.g;
                i2 = this.e;
                if (i >= i2 || (b = this.d[i]) == 0) {
                    break;
                }
                this.g = i + 1;
                bArr3[i6] = b;
                i6++;
            }
            if (i == i2) {
                return null;
            }
            this.g = i + 1;
        }
        return b(bArr3, i6);
    }
}
