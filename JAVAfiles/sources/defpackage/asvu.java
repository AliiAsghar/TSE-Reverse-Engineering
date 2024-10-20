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
public final class asvu extends ASN1Object {
    public final int a;
    public final int b;
    public final AlgorithmIdentifier c;
    private final ASN1Integer d;

    public asvu(int i, int i2, AlgorithmIdentifier algorithmIdentifier) {
        this.d = new ASN1Integer(0L);
        this.a = i;
        this.b = i2;
        this.c = algorithmIdentifier;
    }

    public static asvu a(Object obj) {
        if (obj instanceof asvu) {
            return (asvu) obj;
        }
        if (obj != null) {
            return new asvu(ASN1Sequence.j(obj));
        }
        return null;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.b(this.d);
        aSN1EncodableVector.b(new ASN1Integer(this.a));
        aSN1EncodableVector.b(new ASN1Integer(this.b));
        aSN1EncodableVector.b(this.c);
        return new DERSequence(aSN1EncodableVector);
    }

    private asvu(ASN1Sequence aSN1Sequence) {
        this.d = ASN1Integer.m(aSN1Sequence.h(0));
        this.a = ASN1Integer.m(aSN1Sequence.h(1)).f();
        this.b = ASN1Integer.m(aSN1Sequence.h(2)).f();
        this.c = AlgorithmIdentifier.a(aSN1Sequence.h(3));
    }
}
