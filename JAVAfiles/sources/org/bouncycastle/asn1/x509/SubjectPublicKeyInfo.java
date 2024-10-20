package org.bouncycastle.asn1.x509;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class SubjectPublicKeyInfo extends ASN1Object {
    public AlgorithmIdentifier a;
    public ASN1BitString b;

    public SubjectPublicKeyInfo(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.e() == 2) {
            Enumeration f = aSN1Sequence.f();
            this.a = AlgorithmIdentifier.a(f.nextElement());
            this.b = ASN1BitString.i(f.nextElement());
        } else {
            throw new IllegalArgumentException("Bad sequence size: " + aSN1Sequence.e());
        }
    }

    public static SubjectPublicKeyInfo b(Object obj) {
        if (obj instanceof SubjectPublicKeyInfo) {
            return (SubjectPublicKeyInfo) obj;
        }
        if (obj != null) {
            return new SubjectPublicKeyInfo(ASN1Sequence.j(obj));
        }
        return null;
    }

    public final ASN1Primitive a() {
        return ASN1Primitive.v(this.b.n());
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.b(this.a);
        aSN1EncodableVector.b(this.b);
        return new DERSequence(aSN1EncodableVector);
    }

    public SubjectPublicKeyInfo(AlgorithmIdentifier algorithmIdentifier, ASN1Encodable aSN1Encodable) {
        this.b = new DERBitString(aSN1Encodable);
        this.a = algorithmIdentifier;
    }

    public SubjectPublicKeyInfo(AlgorithmIdentifier algorithmIdentifier, byte[] bArr) {
        this.b = new DERBitString(bArr);
        this.a = algorithmIdentifier;
    }
}
