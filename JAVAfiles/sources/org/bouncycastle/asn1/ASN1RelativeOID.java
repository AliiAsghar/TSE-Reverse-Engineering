package org.bouncycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.math.BigInteger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ASN1RelativeOID extends ASN1Primitive {
    public final String a;
    private byte[] b;

    /* compiled from: PG */
    /* renamed from: org.bouncycastle.asn1.ASN1RelativeOID$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    class AnonymousClass1 extends ASN1UniversalType {
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        public final ASN1Primitive a(DEROctetString dEROctetString) {
            throw null;
        }
    }

    public ASN1RelativeOID(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        boolean z = true;
        long j = 0;
        BigInteger bigInteger = null;
        for (int i = 0; i != bArr.length; i++) {
            byte b = bArr[i];
            long j2 = b & Byte.MAX_VALUE;
            int i2 = b & 128;
            if (j <= 72057594037927808L) {
                long j3 = j + j2;
                if (i2 == 0) {
                    if (!z) {
                        stringBuffer.append('.');
                    }
                    stringBuffer.append(j3);
                    j = 0;
                    z = false;
                } else {
                    j = j3 << 7;
                }
            } else {
                BigInteger or = (bigInteger == null ? BigInteger.valueOf(j) : bigInteger).or(BigInteger.valueOf(j2));
                if (i2 == 0) {
                    if (!z) {
                        stringBuffer.append('.');
                    }
                    stringBuffer.append(or);
                    j = 0;
                    z = false;
                    bigInteger = null;
                } else {
                    bigInteger = or.shiftLeft(7);
                }
            }
        }
        this.a = stringBuffer.toString();
        this.b = bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(ByteArrayOutputStream byteArrayOutputStream, long j) {
        byte[] bArr = new byte[9];
        int i = 8;
        bArr[8] = (byte) (((int) j) & 127);
        while (j >= 128) {
            j >>= 7;
            i--;
            bArr[i] = (byte) (((int) j) | 128);
        }
        byteArrayOutputStream.write(bArr, i, 9 - i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(ByteArrayOutputStream byteArrayOutputStream, BigInteger bigInteger) {
        int bitLength = (bigInteger.bitLength() + 6) / 7;
        if (bitLength == 0) {
            byteArrayOutputStream.write(0);
            return;
        }
        int i = bitLength - 1;
        byte[] bArr = new byte[bitLength];
        for (int i2 = i; i2 >= 0; i2--) {
            bArr[i2] = (byte) (bigInteger.intValue() | 128);
            bigInteger = bigInteger.shiftRight(7);
        }
        bArr[i] = (byte) (bArr[i] & Byte.MAX_VALUE);
        byteArrayOutputStream.write(bArr, 0, bitLength);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002c, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean g(java.lang.String r8, int r9) {
        /*
            int r0 = r8.length()
            r1 = 0
            r2 = r1
        L6:
            int r3 = r0 + (-1)
            r4 = 48
            r5 = 1
            if (r3 < r9) goto L2d
            char r6 = r8.charAt(r3)
            r7 = 46
            if (r6 != r7) goto L22
            if (r2 == 0) goto L21
            if (r2 <= r5) goto L1f
            char r0 = r8.charAt(r0)
            if (r0 == r4) goto L21
        L1f:
            r2 = r1
            goto L2a
        L21:
            return r1
        L22:
            if (r6 < r4) goto L2c
            r0 = 57
            if (r6 > r0) goto L2c
            int r2 = r2 + 1
        L2a:
            r0 = r3
            goto L6
        L2c:
            return r1
        L2d:
            if (r2 == 0) goto L39
            if (r2 <= r5) goto L38
            char r8 = r8.charAt(r0)
            if (r8 != r4) goto L38
            goto L39
        L38:
            return r5
        L39:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.asn1.ASN1RelativeOID.g(java.lang.String, int):boolean");
    }

    private final synchronized byte[] h() {
        if (this.b == null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            OIDTokenizer oIDTokenizer = new OIDTokenizer(this.a);
            while (oIDTokenizer.b()) {
                String a = oIDTokenizer.a();
                if (a.length() <= 18) {
                    e(byteArrayOutputStream, Long.parseLong(a));
                } else {
                    f(byteArrayOutputStream, new BigInteger(a));
                }
            }
            this.b = byteArrayOutputStream.toByteArray();
        }
        return this.b;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final int a(boolean z) {
        return ASN1OutputStream.b(z, h().length);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final void b(ASN1OutputStream aSN1OutputStream, boolean z) {
        aSN1OutputStream.j(z, 13, h());
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean c(ASN1Primitive aSN1Primitive) {
        if (this == aSN1Primitive) {
            return true;
        }
        if (!(aSN1Primitive instanceof ASN1RelativeOID)) {
            return false;
        }
        return this.a.equals(((ASN1RelativeOID) aSN1Primitive).a);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean d() {
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Object
    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
