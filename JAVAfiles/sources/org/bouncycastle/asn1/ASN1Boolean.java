package org.bouncycastle.asn1;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ASN1Boolean extends ASN1Primitive {
    static final ASN1UniversalType a = new ASN1UniversalType(ASN1Boolean.class) { // from class: org.bouncycastle.asn1.ASN1Boolean.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        public final ASN1Primitive a(DEROctetString dEROctetString) {
            return ASN1Boolean.e(dEROctetString.c);
        }
    };
    public static final ASN1Boolean b = new ASN1Boolean((byte) 0);
    public static final ASN1Boolean c = new ASN1Boolean((byte) -1);
    private final byte d;

    private ASN1Boolean(byte b2) {
        this.d = b2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ASN1Boolean e(byte[] bArr) {
        if (bArr.length == 1) {
            byte b2 = bArr[0];
            if (b2 != -1) {
                if (b2 != 0) {
                    return new ASN1Boolean(b2);
                }
                return b;
            }
            return c;
        }
        throw new IllegalArgumentException("BOOLEAN value should have 1 byte in it");
    }

    public static ASN1Boolean f(Object obj) {
        if (obj != null && !(obj instanceof ASN1Boolean)) {
            if (obj instanceof byte[]) {
                try {
                    return (ASN1Boolean) a.c((byte[]) obj);
                } catch (IOException e) {
                    throw new IllegalArgumentException("failed to construct boolean from byte[]: ".concat(String.valueOf(e.getMessage())));
                }
            }
            throw new IllegalArgumentException("illegal object in getInstance: ".concat(String.valueOf(obj.getClass().getName())));
        }
        return (ASN1Boolean) obj;
    }

    public static ASN1Boolean g(boolean z) {
        if (z) {
            return c;
        }
        return b;
    }

    public static ASN1Boolean i(ASN1TaggedObject aSN1TaggedObject) {
        return (ASN1Boolean) a.d(aSN1TaggedObject, false);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final int a(boolean z) {
        return ASN1OutputStream.b(z, 1);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final void b(ASN1OutputStream aSN1OutputStream, boolean z) {
        aSN1OutputStream.m(z, 1);
        aSN1OutputStream.h(1);
        aSN1OutputStream.f(this.d);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean c(ASN1Primitive aSN1Primitive) {
        if (!(aSN1Primitive instanceof ASN1Boolean) || h() != ((ASN1Boolean) aSN1Primitive).h()) {
            return false;
        }
        return true;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean d() {
        return false;
    }

    public final boolean h() {
        if (this.d != 0) {
            return true;
        }
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Object
    public final int hashCode() {
        if (h()) {
            return 1;
        }
        return 0;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final ASN1Primitive k() {
        if (h()) {
            return c;
        }
        return b;
    }

    public final String toString() {
        if (true != h()) {
            return "FALSE";
        }
        return "TRUE";
    }
}
