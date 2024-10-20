package org.bouncycastle.asn1.pkcs;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class RSASSAPSSparams extends ASN1Object {
    public static final AlgorithmIdentifier a;
    public static final AlgorithmIdentifier b;
    public static final ASN1Integer c;
    public static final ASN1Integer d;
    public AlgorithmIdentifier e;
    private AlgorithmIdentifier f;
    private ASN1Integer g;
    private ASN1Integer h;

    static {
        AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(OIWObjectIdentifiers.a, DERNull.a);
        a = algorithmIdentifier;
        b = new AlgorithmIdentifier(PKCSObjectIdentifiers.fE, algorithmIdentifier);
        c = new ASN1Integer(20L);
        d = new ASN1Integer(1L);
    }

    public RSASSAPSSparams() {
        this.e = a;
        this.f = b;
        this.g = c;
        this.h = d;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(4);
        if (!this.e.equals(a)) {
            aSN1EncodableVector.b(new DERTaggedObject(true, 0, this.e));
        }
        if (!this.f.equals(b)) {
            aSN1EncodableVector.b(new DERTaggedObject(true, 1, this.f));
        }
        if (!this.g.x(c)) {
            aSN1EncodableVector.b(new DERTaggedObject(true, 2, this.g));
        }
        if (!this.h.x(d)) {
            aSN1EncodableVector.b(new DERTaggedObject(true, 3, this.h));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public RSASSAPSSparams(AlgorithmIdentifier algorithmIdentifier, AlgorithmIdentifier algorithmIdentifier2, ASN1Integer aSN1Integer, ASN1Integer aSN1Integer2) {
        this.e = algorithmIdentifier;
        this.f = algorithmIdentifier2;
        this.g = aSN1Integer;
        this.h = aSN1Integer2;
    }

    public RSASSAPSSparams(ASN1Sequence aSN1Sequence) {
        this.e = a;
        this.f = b;
        this.g = c;
        this.h = d;
        for (int i = 0; i != aSN1Sequence.e(); i++) {
            ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) aSN1Sequence.h(i);
            int i2 = aSN1TaggedObject.c;
            if (i2 == 0) {
                this.e = AlgorithmIdentifier.b(aSN1TaggedObject);
            } else if (i2 == 1) {
                this.f = AlgorithmIdentifier.b(aSN1TaggedObject);
            } else if (i2 == 2) {
                this.g = ASN1Integer.n(aSN1TaggedObject, true);
            } else if (i2 == 3) {
                this.h = ASN1Integer.n(aSN1TaggedObject, true);
            } else {
                throw new IllegalArgumentException("unknown tag");
            }
        }
    }
}
