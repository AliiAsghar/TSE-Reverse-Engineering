package org.bouncycastle.asn1;

import defpackage.atow;
import java.math.BigInteger;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ASN1Enumerated extends ASN1Primitive {
    static final ASN1UniversalType a = new ASN1UniversalType(ASN1Enumerated.class) { // from class: org.bouncycastle.asn1.ASN1Enumerated.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        public final ASN1Primitive a(DEROctetString dEROctetString) {
            return ASN1Enumerated.f(dEROctetString.c, false);
        }
    };
    private static final ASN1Enumerated[] d = new ASN1Enumerated[12];
    public final byte[] b;
    public final int c;

    public ASN1Enumerated(int i) {
        this.b = BigInteger.valueOf(i).toByteArray();
        this.c = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ASN1Enumerated f(byte[] bArr, boolean z) {
        int length = bArr.length;
        if (length > 1) {
            return new ASN1Enumerated(bArr, z);
        }
        if (length != 0) {
            int i = bArr[0] & 255;
            if (i >= 12) {
                return new ASN1Enumerated(bArr, z);
            }
            ASN1Enumerated[] aSN1EnumeratedArr = d;
            ASN1Enumerated aSN1Enumerated = aSN1EnumeratedArr[i];
            if (aSN1Enumerated == null) {
                ASN1Enumerated aSN1Enumerated2 = new ASN1Enumerated(bArr, z);
                aSN1EnumeratedArr[i] = aSN1Enumerated2;
                return aSN1Enumerated2;
            }
            return aSN1Enumerated;
        }
        throw new IllegalArgumentException("ENUMERATED has zero length");
    }

    public static ASN1Enumerated g(Object obj) {
        if (obj != null && !(obj instanceof ASN1Enumerated)) {
            if (obj instanceof byte[]) {
                try {
                    return (ASN1Enumerated) a.c((byte[]) obj);
                } catch (Exception e) {
                    throw new IllegalArgumentException("encoding error in getInstance: ".concat(String.valueOf(e.toString())));
                }
            }
            throw new IllegalArgumentException("illegal object in getInstance: ".concat(String.valueOf(obj.getClass().getName())));
        }
        return (ASN1Enumerated) obj;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final int a(boolean z) {
        return ASN1OutputStream.b(z, this.b.length);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final void b(ASN1OutputStream aSN1OutputStream, boolean z) {
        aSN1OutputStream.j(z, 10, this.b);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean c(ASN1Primitive aSN1Primitive) {
        if (!(aSN1Primitive instanceof ASN1Enumerated)) {
            return false;
        }
        return Arrays.equals(this.b, ((ASN1Enumerated) aSN1Primitive).b);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean d() {
        return false;
    }

    public final BigInteger e() {
        return new BigInteger(this.b);
    }

    @Override // org.bouncycastle.asn1.ASN1Object
    public final int hashCode() {
        return atow.M(this.b);
    }

    public ASN1Enumerated(byte[] bArr, boolean z) {
        if (!ASN1Integer.r(bArr)) {
            if ((bArr[0] & 128) == 0) {
                this.b = z ? atow.O(bArr) : bArr;
                this.c = ASN1Integer.g(bArr);
                return;
            }
            throw new IllegalArgumentException("enumerated must be non-negative");
        }
        throw new IllegalArgumentException("malformed enumerated");
    }
}
