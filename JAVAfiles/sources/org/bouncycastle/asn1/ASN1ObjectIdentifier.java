package org.bouncycastle.asn1;

import defpackage.a;
import defpackage.atow;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ASN1ObjectIdentifier extends ASN1Primitive {
    public static final ASN1UniversalType a = new ASN1UniversalType(ASN1ObjectIdentifier.class) { // from class: org.bouncycastle.asn1.ASN1ObjectIdentifier.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        public final ASN1Primitive a(DEROctetString dEROctetString) {
            return ASN1ObjectIdentifier.e(dEROctetString.c, false);
        }
    };
    private static final ConcurrentMap c = new ConcurrentHashMap();
    public final String b;
    private byte[] d;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public static class OidHandle {
        private final int a;
        private final byte[] b;

        public OidHandle(byte[] bArr) {
            this.a = atow.M(bArr);
            this.b = bArr;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof OidHandle) {
                return Arrays.equals(this.b, ((OidHandle) obj).b);
            }
            return false;
        }

        public final int hashCode() {
            return this.a;
        }
    }

    public ASN1ObjectIdentifier(String str) {
        char charAt;
        if (str != null) {
            if (str.length() < 3 || str.charAt(1) != '.' || (charAt = str.charAt(0)) < '0' || charAt > '2' || !ASN1RelativeOID.g(str, 2)) {
                throw new IllegalArgumentException(a.bW(str, "string ", " not an OID"));
            }
            this.b = str;
            return;
        }
        throw new NullPointerException("'identifier' cannot be null");
    }

    public static ASN1ObjectIdentifier e(byte[] bArr, boolean z) {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) c.get(new OidHandle(bArr));
        if (aSN1ObjectIdentifier == null) {
            return new ASN1ObjectIdentifier(bArr, z);
        }
        return aSN1ObjectIdentifier;
    }

    public static ASN1ObjectIdentifier f(Object obj) {
        if (obj != null && !(obj instanceof ASN1ObjectIdentifier)) {
            if (obj instanceof ASN1Encodable) {
                ASN1Primitive p = ((ASN1Encodable) obj).p();
                if (p instanceof ASN1ObjectIdentifier) {
                    return (ASN1ObjectIdentifier) p;
                }
            } else if (obj instanceof byte[]) {
                try {
                    return (ASN1ObjectIdentifier) a.c((byte[]) obj);
                } catch (IOException e) {
                    throw new IllegalArgumentException("failed to construct object identifier from byte[]: ".concat(String.valueOf(e.getMessage())));
                }
            }
            throw new IllegalArgumentException("illegal object in getInstance: ".concat(String.valueOf(obj.getClass().getName())));
        }
        return (ASN1ObjectIdentifier) obj;
    }

    private final synchronized byte[] i() {
        if (this.d == null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            OIDTokenizer oIDTokenizer = new OIDTokenizer(this.b);
            int parseInt = Integer.parseInt(oIDTokenizer.a()) * 40;
            String a2 = oIDTokenizer.a();
            long j = parseInt;
            if (a2.length() <= 18) {
                ASN1RelativeOID.e(byteArrayOutputStream, j + Long.parseLong(a2));
            } else {
                ASN1RelativeOID.f(byteArrayOutputStream, new BigInteger(a2).add(BigInteger.valueOf(j)));
            }
            while (oIDTokenizer.b()) {
                String a3 = oIDTokenizer.a();
                if (a3.length() <= 18) {
                    ASN1RelativeOID.e(byteArrayOutputStream, Long.parseLong(a3));
                } else {
                    ASN1RelativeOID.f(byteArrayOutputStream, new BigInteger(a3));
                }
            }
            this.d = byteArrayOutputStream.toByteArray();
        }
        return this.d;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final int a(boolean z) {
        return ASN1OutputStream.b(z, i().length);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final void b(ASN1OutputStream aSN1OutputStream, boolean z) {
        aSN1OutputStream.j(z, 6, i());
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean c(ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive == this) {
            return true;
        }
        if (!(aSN1Primitive instanceof ASN1ObjectIdentifier)) {
            return false;
        }
        return this.b.equals(((ASN1ObjectIdentifier) aSN1Primitive).b);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean d() {
        return false;
    }

    public final ASN1ObjectIdentifier g() {
        OidHandle oidHandle = new OidHandle(i());
        ConcurrentMap concurrentMap = c;
        ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) concurrentMap.get(oidHandle);
        if (aSN1ObjectIdentifier == null) {
            synchronized (concurrentMap) {
                if (!concurrentMap.containsKey(oidHandle)) {
                    concurrentMap.put(oidHandle, this);
                    return this;
                }
                return (ASN1ObjectIdentifier) concurrentMap.get(oidHandle);
            }
        }
        return aSN1ObjectIdentifier;
    }

    public final boolean h(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        String str = aSN1ObjectIdentifier.b;
        int length = str.length();
        String str2 = this.b;
        if (str2.length() > length && str2.charAt(str.length()) == '.' && str2.startsWith(str)) {
            return true;
        }
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Object
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return this.b;
    }

    public ASN1ObjectIdentifier(ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) {
        if (ASN1RelativeOID.g(str, 0)) {
            this.b = aSN1ObjectIdentifier.b + "." + str;
            return;
        }
        throw new IllegalArgumentException(a.bW(str, "string ", " not a valid OID branch"));
    }

    public ASN1ObjectIdentifier(byte[] bArr, boolean z) {
        long j;
        byte[] bArr2 = bArr;
        if (bArr2.length != 0) {
            StringBuilder sb = new StringBuilder();
            boolean z2 = true;
            long j2 = 0;
            BigInteger bigInteger = null;
            for (int i = 0; i != bArr2.length; i++) {
                byte b = bArr2[i];
                long j3 = b & Byte.MAX_VALUE;
                int i2 = b & 128;
                if (j2 <= 72057594037927808L) {
                    long j4 = j2 + j3;
                    if (i2 == 0) {
                        if (z2) {
                            if (j4 < 40) {
                                sb.append('0');
                            } else {
                                if (j4 < 80) {
                                    sb.append('1');
                                    j = -40;
                                } else {
                                    sb.append('2');
                                    j = -80;
                                }
                                j4 += j;
                            }
                        }
                        sb.append('.');
                        sb.append(j4);
                        z2 = false;
                        j2 = 0;
                    } else {
                        j2 = j4 << 7;
                    }
                } else {
                    BigInteger or = (bigInteger == null ? BigInteger.valueOf(j2) : bigInteger).or(BigInteger.valueOf(j3));
                    if (i2 == 0) {
                        if (z2) {
                            sb.append('2');
                            or = or.subtract(BigInteger.valueOf(80L));
                        }
                        sb.append('.');
                        sb.append(or);
                        z2 = false;
                        j2 = 0;
                        bigInteger = null;
                    } else {
                        bigInteger = or.shiftLeft(7);
                    }
                }
            }
            this.b = sb.toString();
            this.d = z ? atow.O(bArr) : bArr2;
            return;
        }
        throw new IllegalArgumentException("empty OBJECT IDENTIFIER with no sub-identifiers");
    }
}
