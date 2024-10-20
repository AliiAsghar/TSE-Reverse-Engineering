package org.bouncycastle.asn1;

import defpackage.atdg;
import defpackage.atdo;
import defpackage.atow;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ASN1UTF8String extends ASN1Primitive implements ASN1String {
    final byte[] a;

    /* compiled from: PG */
    /* renamed from: org.bouncycastle.asn1.ASN1UTF8String$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    class AnonymousClass1 extends ASN1UniversalType {
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        public final ASN1Primitive a(DEROctetString dEROctetString) {
            throw null;
        }
    }

    public ASN1UTF8String(byte[] bArr) {
        this.a = bArr;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final int a(boolean z) {
        return ASN1OutputStream.b(z, this.a.length);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final void b(ASN1OutputStream aSN1OutputStream, boolean z) {
        aSN1OutputStream.j(z, 12, this.a);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean c(ASN1Primitive aSN1Primitive) {
        if (!(aSN1Primitive instanceof ASN1UTF8String)) {
            return false;
        }
        return Arrays.equals(this.a, ((ASN1UTF8String) aSN1Primitive).a);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean d() {
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1String
    public final String e() {
        int i;
        String str = atdg.a;
        byte[] bArr = this.a;
        int length = bArr.length;
        char[] cArr = new char[length];
        short[] sArr = atdo.a;
        int i2 = 0;
        int i3 = 0;
        loop0: while (i2 < length) {
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                if (i3 >= length) {
                    i3 = -1;
                    break;
                }
                i = i3 + 1;
                cArr[i3] = (char) b;
                i2 = i4;
                i3 = i;
            } else {
                short s = atdo.a[b & Byte.MAX_VALUE];
                int i5 = s >>> 8;
                byte b2 = (byte) s;
                while (true) {
                    if (b2 >= 0) {
                        if (i4 >= length) {
                            break loop0;
                        }
                        int i6 = i4 + 1;
                        byte b3 = bArr[i4];
                        b2 = atdo.b[b2 + ((b3 & 255) >>> 4)];
                        i5 = (i5 << 6) | (b3 & 63);
                        i4 = i6;
                    } else if (b2 != -2) {
                        if (i5 <= 65535) {
                            if (i3 < length) {
                                i = i3 + 1;
                                cArr[i3] = (char) i5;
                            }
                        } else if (i3 < length - 1) {
                            int i7 = i3 + 1;
                            cArr[i3] = (char) ((i5 >>> 10) + 55232);
                            i3 += 2;
                            cArr[i7] = (char) ((i5 & 1023) | 56320);
                            i2 = i4;
                        }
                    }
                }
                i3 = -1;
                break;
            }
        }
        if (i3 >= 0) {
            return new String(cArr, 0, i3);
        }
        throw new IllegalArgumentException("Invalid UTF-8 input");
    }

    @Override // org.bouncycastle.asn1.ASN1Object
    public final int hashCode() {
        return atow.M(this.a);
    }

    public final String toString() {
        return e();
    }
}
