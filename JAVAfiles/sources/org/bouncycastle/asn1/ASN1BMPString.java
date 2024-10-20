package org.bouncycastle.asn1;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ASN1BMPString extends ASN1Primitive implements ASN1String {
    final char[] a;

    /* compiled from: PG */
    /* renamed from: org.bouncycastle.asn1.ASN1BMPString$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    class AnonymousClass1 extends ASN1UniversalType {
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        public final ASN1Primitive a(DEROctetString dEROctetString) {
            throw null;
        }
    }

    public ASN1BMPString(char[] cArr) {
        this.a = cArr;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final int a(boolean z) {
        int length = this.a.length;
        return ASN1OutputStream.b(z, length + length);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final void b(ASN1OutputStream aSN1OutputStream, boolean z) {
        aSN1OutputStream.m(z, 30);
        int length = this.a.length;
        aSN1OutputStream.h(length + length);
        byte[] bArr = new byte[8];
        int i = 0;
        while (i < (length & (-4))) {
            char[] cArr = this.a;
            int i2 = i + 1;
            int i3 = i + 2;
            int i4 = i + 3;
            int i5 = i + 4;
            char c = cArr[i];
            char c2 = cArr[i2];
            char c3 = cArr[i3];
            char c4 = cArr[i4];
            bArr[0] = (byte) (c >> '\b');
            bArr[1] = (byte) c;
            bArr[2] = (byte) (c2 >> '\b');
            bArr[3] = (byte) c2;
            bArr[4] = (byte) (c3 >> '\b');
            bArr[5] = (byte) c3;
            bArr[6] = (byte) (c4 >> '\b');
            bArr[7] = (byte) c4;
            aSN1OutputStream.g(bArr, 0, 8);
            i = i5;
        }
        if (i < length) {
            int i6 = 0;
            while (true) {
                int i7 = i + 1;
                int i8 = i6 + 1;
                char c5 = this.a[i];
                bArr[i6] = (byte) (c5 >> '\b');
                i6 += 2;
                bArr[i8] = (byte) c5;
                if (i7 < length) {
                    i = i7;
                } else {
                    aSN1OutputStream.g(bArr, 0, i6);
                    return;
                }
            }
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean c(ASN1Primitive aSN1Primitive) {
        if (!(aSN1Primitive instanceof ASN1BMPString)) {
            return false;
        }
        return Arrays.equals(this.a, ((ASN1BMPString) aSN1Primitive).a);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean d() {
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1String
    public final String e() {
        return new String(this.a);
    }

    @Override // org.bouncycastle.asn1.ASN1Object
    public final int hashCode() {
        char[] cArr = this.a;
        int length = cArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length >= 0) {
                i = (i * 257) ^ cArr[length];
            } else {
                return i;
            }
        }
    }

    public final String toString() {
        return e();
    }
}
