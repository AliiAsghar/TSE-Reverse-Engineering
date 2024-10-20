package org.bouncycastle.asn1;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ASN1UniversalType extends ASN1Type {
    public ASN1UniversalType(Class cls) {
        super(cls);
    }

    public ASN1Primitive a(DEROctetString dEROctetString) {
        throw new IllegalStateException("unexpected implicit primitive encoding");
    }

    public ASN1Primitive b(ASN1Sequence aSN1Sequence) {
        throw new IllegalStateException("unexpected implicit constructed encoding");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ASN1Primitive c(byte[] bArr) {
        ASN1Primitive v = ASN1Primitive.v(bArr);
        e(v);
        return v;
    }

    public final ASN1Primitive d(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        ASN1Primitive b;
        if (aSN1TaggedObject.b == 128) {
            if (z) {
                if (aSN1TaggedObject.n()) {
                    b = aSN1TaggedObject.d.p();
                    e(b);
                } else {
                    throw new IllegalStateException("object explicit - implicit expected.");
                }
            } else if (aSN1TaggedObject.a != 1) {
                ASN1Primitive p = aSN1TaggedObject.d.p();
                int i = aSN1TaggedObject.a;
                if (i != 3) {
                    if (i != 4) {
                        e(p);
                        b = p;
                    } else if (p instanceof ASN1Sequence) {
                        b = b((ASN1Sequence) p);
                    } else {
                        b = a((DEROctetString) p);
                    }
                } else {
                    b = b(aSN1TaggedObject.i(p));
                }
            } else {
                throw new IllegalStateException("object explicit - implicit expected.");
            }
            e(b);
            return b;
        }
        throw new IllegalStateException("this method only valid for CONTEXT_SPECIFIC tags");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(ASN1Primitive aSN1Primitive) {
        if (this.a.isInstance(aSN1Primitive)) {
        } else {
            throw new IllegalStateException("unexpected object: ".concat(String.valueOf(aSN1Primitive.getClass().getName())));
        }
    }
}
