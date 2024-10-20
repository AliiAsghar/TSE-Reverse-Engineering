package org.bouncycastle.asn1;

import defpackage.atow;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ASN1BitString extends ASN1Primitive implements ASN1String, ASN1BitStringParser {
    static final ASN1UniversalType a = new ASN1UniversalType(ASN1BitString.class) { // from class: org.bouncycastle.asn1.ASN1BitString.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        public final ASN1Primitive a(DEROctetString dEROctetString) {
            return ASN1BitString.h(dEROctetString.c);
        }

        @Override // org.bouncycastle.asn1.ASN1UniversalType
        public final ASN1Primitive b(ASN1Sequence aSN1Sequence) {
            return aSN1Sequence.g();
        }
    };
    private static final char[] c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final byte[] b;

    public ASN1BitString(byte[] bArr) {
        this.b = bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ASN1BitString h(byte[] bArr) {
        int length = bArr.length;
        if (length > 0) {
            int i = bArr[0] & 255;
            if (i > 0) {
                if (i <= 7 && length >= 2) {
                    byte b = bArr[length - 1];
                    if (b != ((byte) ((255 << i) & b))) {
                        return new DLBitString(bArr);
                    }
                } else {
                    throw new IllegalArgumentException("invalid pad bits detected");
                }
            }
            return new DERBitString(bArr, (byte[]) null);
        }
        throw new IllegalArgumentException("truncated BIT STRING detected");
    }

    public static ASN1BitString i(Object obj) {
        if (obj != null && !(obj instanceof ASN1BitString)) {
            if (obj instanceof ASN1Encodable) {
                ASN1Primitive p = ((ASN1Encodable) obj).p();
                if (p instanceof ASN1BitString) {
                    return (ASN1BitString) p;
                }
            } else if (obj instanceof byte[]) {
                try {
                    return (ASN1BitString) a.c((byte[]) obj);
                } catch (IOException e) {
                    throw new IllegalArgumentException("failed to construct BIT STRING from byte[]: ".concat(String.valueOf(e.getMessage())));
                }
            }
            throw new IllegalArgumentException("illegal object in getInstance: ".concat(String.valueOf(obj.getClass().getName())));
        }
        return (ASN1BitString) obj;
    }

    public static ASN1BitString o(ASN1TaggedObject aSN1TaggedObject) {
        return (ASN1BitString) a.d(aSN1TaggedObject, false);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean c(ASN1Primitive aSN1Primitive) {
        if (!(aSN1Primitive instanceof ASN1BitString)) {
            return false;
        }
        byte[] bArr = this.b;
        byte[] bArr2 = ((ASN1BitString) aSN1Primitive).b;
        int length = bArr.length;
        if (bArr2.length != length) {
            return false;
        }
        if (length == 1) {
            return true;
        }
        int i = length - 1;
        for (int i2 = 0; i2 < i; i2++) {
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
        }
        int i3 = 255 << (bArr[0] & 255);
        if (((byte) (bArr[i] & i3)) != ((byte) (bArr2[i] & i3))) {
            return false;
        }
        return true;
    }

    @Override // org.bouncycastle.asn1.ASN1String
    public final String e() {
        try {
            byte[] s = s();
            int length = s.length;
            StringBuffer stringBuffer = new StringBuffer(length + length + 1);
            stringBuffer.append('#');
            for (int i = 0; i != s.length; i++) {
                byte b = s[i];
                char[] cArr = c;
                stringBuffer.append(cArr[(b >>> 4) & 15]);
                stringBuffer.append(cArr[b & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException e) {
            throw new ASN1ParsingException("Internal error encoding BitString: ".concat(String.valueOf(e.getMessage())), e);
        }
    }

    @Override // org.bouncycastle.asn1.ASN1BitStringParser
    public final int f() {
        return this.b[0] & 255;
    }

    @Override // org.bouncycastle.asn1.ASN1BitStringParser
    public final InputStream g() {
        return new ByteArrayInputStream(this.b, 1, r1.length - 1);
    }

    @Override // org.bouncycastle.asn1.ASN1Object
    public final int hashCode() {
        byte[] bArr = this.b;
        int length = bArr.length;
        if (length < 2) {
            return 1;
        }
        int i = 0;
        int i2 = length - 1;
        int i3 = (255 << (bArr[0] & 255)) & bArr[i2];
        if (bArr != null) {
            while (true) {
                i2--;
                if (i2 < 0) {
                    break;
                }
                length = (length * 257) ^ bArr[i2];
            }
            i = length;
        }
        return ((byte) i3) ^ (i * 257);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive k() {
        return new DERBitString(this.b, (byte[]) null);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive l() {
        return new DLBitString(this.b);
    }

    public final byte[] m() {
        byte[] bArr = this.b;
        int length = bArr.length;
        if (length == 1) {
            return ASN1OctetString.b;
        }
        int i = bArr[0] & 255;
        byte[] S = atow.S(bArr, 1, length);
        int length2 = S.length - 1;
        S[length2] = (byte) (S[length2] & ((byte) (255 << i)));
        return S;
    }

    public final byte[] n() {
        byte[] bArr = this.b;
        if (bArr[0] == 0) {
            return atow.S(bArr, 1, bArr.length);
        }
        throw new IllegalStateException("attempt to get non-octet aligned data from BIT STRING");
    }

    public String toString() {
        return e();
    }

    public ASN1BitString(byte[] bArr, int i) {
        if (bArr == null) {
            throw new NullPointerException("'data' cannot be null");
        }
        int length = bArr.length;
        if (length == 0 && i != 0) {
            throw new IllegalArgumentException("zero length data with non-zero pad bits");
        }
        if (i <= 7 && i >= 0) {
            byte[] bArr2 = new byte[length + 1];
            System.arraycopy(bArr, 0, bArr2, 1, length);
            bArr2[0] = (byte) i;
            this.b = bArr2;
            return;
        }
        throw new IllegalArgumentException("pad bits cannot be greater than 7 or less than 0");
    }

    @Override // org.bouncycastle.asn1.InMemoryRepresentable
    public final ASN1Primitive j() {
        return this;
    }
}
