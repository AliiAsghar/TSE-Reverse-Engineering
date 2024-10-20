package org.bouncycastle.asn1;

import defpackage.atdg;
import defpackage.atdm;
import defpackage.atow;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ASN1OctetString extends ASN1Primitive implements ASN1OctetStringParser {
    static final ASN1UniversalType a = new ASN1UniversalType(ASN1OctetString.class) { // from class: org.bouncycastle.asn1.ASN1OctetString.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        public final ASN1Primitive b(ASN1Sequence aSN1Sequence) {
            return aSN1Sequence.i();
        }

        @Override // org.bouncycastle.asn1.ASN1UniversalType
        public final ASN1Primitive a(DEROctetString dEROctetString) {
            return dEROctetString;
        }
    };
    static final byte[] b = new byte[0];
    public byte[] c;

    public ASN1OctetString(byte[] bArr) {
        if (bArr != null) {
            this.c = bArr;
            return;
        }
        throw new NullPointerException("'string' cannot be null");
    }

    public static ASN1OctetString f(Object obj) {
        if (obj != null && !(obj instanceof ASN1OctetString)) {
            if (obj instanceof ASN1Encodable) {
                ASN1Primitive p = ((ASN1Encodable) obj).p();
                if (p instanceof ASN1OctetString) {
                    return (ASN1OctetString) p;
                }
            } else if (obj instanceof byte[]) {
                try {
                    return (ASN1OctetString) a.c((byte[]) obj);
                } catch (IOException e) {
                    throw new IllegalArgumentException("failed to construct OCTET STRING from byte[]: ".concat(String.valueOf(e.getMessage())));
                }
            }
            throw new IllegalArgumentException("illegal object in getInstance: ".concat(String.valueOf(obj.getClass().getName())));
        }
        return (ASN1OctetString) obj;
    }

    public static ASN1OctetString g(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return (ASN1OctetString) a.d(aSN1TaggedObject, z);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean c(ASN1Primitive aSN1Primitive) {
        if (!(aSN1Primitive instanceof ASN1OctetString)) {
            return false;
        }
        return Arrays.equals(this.c, ((ASN1OctetString) aSN1Primitive).c);
    }

    @Override // org.bouncycastle.asn1.ASN1OctetStringParser
    public final InputStream e() {
        return new ByteArrayInputStream(this.c);
    }

    @Override // org.bouncycastle.asn1.ASN1Object
    public final int hashCode() {
        return atow.M(this.c);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive k() {
        return new DEROctetString(this.c);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive l() {
        return new DEROctetString(this.c);
    }

    public final String toString() {
        return "#".concat(atdg.a(atdm.d(this.c)));
    }

    @Override // org.bouncycastle.asn1.InMemoryRepresentable
    public final ASN1Primitive j() {
        return this;
    }
}
