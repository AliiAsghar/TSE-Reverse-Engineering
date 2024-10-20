package defpackage;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class asvo extends ASN1Object {
    public final int a;
    public final int b;
    public final AlgorithmIdentifier c;
    public final atcw d;

    public asvo(int i, int i2, atcw atcwVar, AlgorithmIdentifier algorithmIdentifier) {
        this.a = i;
        this.b = i2;
        this.d = new atcw(atcwVar.a());
        this.c = algorithmIdentifier;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.b(new ASN1Integer(this.a));
        aSN1EncodableVector.b(new ASN1Integer(this.b));
        aSN1EncodableVector.b(new DEROctetString(this.d.a()));
        aSN1EncodableVector.b(this.c);
        return new DERSequence(aSN1EncodableVector);
    }

    public asvo(ASN1Sequence aSN1Sequence) {
        this.a = ((ASN1Integer) aSN1Sequence.h(0)).f();
        this.b = ((ASN1Integer) aSN1Sequence.h(1)).f();
        this.d = new atcw(((ASN1OctetString) aSN1Sequence.h(2)).c);
        this.c = AlgorithmIdentifier.a(aSN1Sequence.h(3));
    }
}
