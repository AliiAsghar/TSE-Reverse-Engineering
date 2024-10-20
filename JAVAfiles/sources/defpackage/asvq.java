package defpackage;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class asvq extends ASN1Object {
    public final AlgorithmIdentifier a;
    private final ASN1Integer b;

    private asvq(ASN1Sequence aSN1Sequence) {
        this.b = ASN1Integer.m(aSN1Sequence.h(0));
        this.a = AlgorithmIdentifier.a(aSN1Sequence.h(1));
    }

    public static final asvq a(Object obj) {
        if (obj instanceof asvq) {
            return (asvq) obj;
        }
        if (obj != null) {
            return new asvq(ASN1Sequence.j(obj));
        }
        return null;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.b(this.b);
        aSN1EncodableVector.b(this.a);
        return new DERSequence(aSN1EncodableVector);
    }

    public asvq(AlgorithmIdentifier algorithmIdentifier) {
        this.b = new ASN1Integer(0L);
        this.a = algorithmIdentifier;
    }
}
