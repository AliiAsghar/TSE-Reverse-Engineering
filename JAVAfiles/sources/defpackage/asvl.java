package defpackage;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class asvl extends ASN1Object {
    public final byte[] a;

    public asvl(byte[] bArr) {
        this.a = bArr;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.b(new DEROctetString(this.a));
        return new DERSequence(aSN1EncodableVector);
    }

    public asvl(ASN1Sequence aSN1Sequence) {
        this.a = atow.O(ASN1OctetString.f(aSN1Sequence.h(0)).c);
    }
}
