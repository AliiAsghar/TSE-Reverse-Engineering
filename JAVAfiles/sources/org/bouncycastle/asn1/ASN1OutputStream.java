package org.bouncycastle.asn1;

import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ASN1OutputStream {
    private final OutputStream a;

    public ASN1OutputStream(OutputStream outputStream) {
        this.a = outputStream;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i) {
        if (i >= 128) {
            int i2 = 2;
            while (true) {
                i >>>= 8;
                if (i != 0) {
                    i2++;
                } else {
                    return i2;
                }
            }
        } else {
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(boolean z, int i) {
        return (z ? 1 : 0) + a(i) + i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(int i) {
        if (i >= 31) {
            int i2 = 2;
            while (true) {
                i >>>= 7;
                if (i != 0) {
                    i2++;
                } else {
                    return i2;
                }
            }
        } else {
            return 1;
        }
    }

    public DEROutputStream d() {
        return new DEROutputStream(this.a);
    }

    public DLOutputStream e() {
        return new DLOutputStream(this.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(int i) {
        this.a.write(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(byte[] bArr, int i, int i2) {
        this.a.write(bArr, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(int i) {
        if (i < 128) {
            f(i);
            return;
        }
        int i2 = 5;
        byte[] bArr = new byte[5];
        while (true) {
            int i3 = i2 - 1;
            bArr[i3] = (byte) i;
            i >>>= 8;
            if (i == 0) {
                int i4 = i2 - 2;
                bArr[i4] = (byte) ((5 - i3) | 128);
                g(bArr, i4, 6 - i3);
                return;
            }
            i2 = i3;
        }
    }

    public void i(ASN1Encodable[] aSN1EncodableArr) {
        for (ASN1Encodable aSN1Encodable : aSN1EncodableArr) {
            aSN1Encodable.p().b(this, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j(boolean z, int i, byte[] bArr) {
        m(z, i);
        int length = bArr.length;
        h(length);
        g(bArr, 0, length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k(boolean z, int i, byte[] bArr, int i2, int i3) {
        m(z, i);
        h(i3);
        g(bArr, i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l(boolean z, int i, ASN1Encodable[] aSN1EncodableArr) {
        m(z, i);
        f(128);
        i(aSN1EncodableArr);
        f(0);
        f(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m(boolean z, int i) {
        if (z) {
            f(i);
        }
    }

    public void n(ASN1Primitive[] aSN1PrimitiveArr) {
        for (ASN1Primitive aSN1Primitive : aSN1PrimitiveArr) {
            aSN1Primitive.b(this, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void o(int i, int i2) {
        if (i2 < 31) {
            f(i | i2);
            return;
        }
        byte[] bArr = new byte[6];
        int i3 = 5;
        bArr[5] = (byte) (i2 & 127);
        while (true) {
            i3--;
            if (i2 > 127) {
                i2 >>>= 7;
                bArr[i3] = (byte) ((i2 & 127) | 128);
            } else {
                bArr[i3] = (byte) (i | 31);
                g(bArr, i3, 6 - i3);
                return;
            }
        }
    }

    public void p(ASN1Primitive aSN1Primitive) {
        throw null;
    }
}
