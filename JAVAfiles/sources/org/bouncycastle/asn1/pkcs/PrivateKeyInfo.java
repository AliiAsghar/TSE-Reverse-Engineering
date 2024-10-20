package org.bouncycastle.asn1.pkcs;

import defpackage.atdb;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class PrivateKeyInfo extends ASN1Object {
    public AlgorithmIdentifier a;
    public ASN1Set b;
    public ASN1BitString c;
    private ASN1Integer d;
    private ASN1OctetString e;

    private PrivateKeyInfo(ASN1Sequence aSN1Sequence) {
        Enumeration f = aSN1Sequence.f();
        ASN1Integer m = ASN1Integer.m(f.nextElement());
        this.d = m;
        int f2 = m.f();
        if (f2 >= 0 && f2 <= 1) {
            this.a = AlgorithmIdentifier.a(f.nextElement());
            this.e = ASN1OctetString.f(f.nextElement());
            int i = -1;
            while (f.hasMoreElements()) {
                ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) f.nextElement();
                int i2 = aSN1TaggedObject.c;
                if (i2 <= i) {
                    throw new IllegalArgumentException("invalid optional field in private key info");
                }
                if (i2 == 0) {
                    this.b = ASN1Set.h(aSN1TaggedObject);
                } else {
                    if (i2 != 1) {
                        throw new IllegalArgumentException("unknown optional field in private key info");
                    }
                    if (f2 > 0) {
                        this.c = ASN1BitString.o(aSN1TaggedObject);
                    } else {
                        throw new IllegalArgumentException("'publicKey' requires version v2(1) or later");
                    }
                }
                i = i2;
            }
            return;
        }
        throw new IllegalArgumentException("invalid version for private key info");
    }

    public static PrivateKeyInfo b(Object obj) {
        if (obj instanceof PrivateKeyInfo) {
            return (PrivateKeyInfo) obj;
        }
        if (obj != null) {
            return new PrivateKeyInfo(ASN1Sequence.j(obj));
        }
        return null;
    }

    public final ASN1Encodable a() {
        return ASN1Primitive.v(this.e.c);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(5);
        aSN1EncodableVector.b(this.d);
        aSN1EncodableVector.b(this.a);
        aSN1EncodableVector.b(this.e);
        ASN1Set aSN1Set = this.b;
        if (aSN1Set != null) {
            aSN1EncodableVector.b(new DERTaggedObject(false, 0, aSN1Set));
        }
        ASN1BitString aSN1BitString = this.c;
        if (aSN1BitString != null) {
            aSN1EncodableVector.b(new DERTaggedObject(false, 1, aSN1BitString));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public PrivateKeyInfo(AlgorithmIdentifier algorithmIdentifier, ASN1Encodable aSN1Encodable) {
        this(algorithmIdentifier, aSN1Encodable, null, null);
    }

    public PrivateKeyInfo(AlgorithmIdentifier algorithmIdentifier, ASN1Encodable aSN1Encodable, ASN1Set aSN1Set) {
        this(algorithmIdentifier, aSN1Encodable, aSN1Set, null);
    }

    public PrivateKeyInfo(AlgorithmIdentifier algorithmIdentifier, ASN1Encodable aSN1Encodable, ASN1Set aSN1Set, byte[] bArr) {
        this.d = new ASN1Integer(bArr != null ? atdb.b : atdb.a);
        this.a = algorithmIdentifier;
        this.e = new DEROctetString(aSN1Encodable);
        this.b = aSN1Set;
        this.c = bArr == null ? null : new DERBitString(bArr);
    }
}
