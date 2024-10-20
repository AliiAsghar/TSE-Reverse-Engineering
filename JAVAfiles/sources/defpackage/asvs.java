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
public final class asvs extends ASN1Object {
    private final byte[] a;
    private final byte[] b;

    public asvs(byte[] bArr, byte[] bArr2) {
        this.a = bArr;
        this.b = bArr2;
    }

    public final byte[] a() {
        return atow.O(this.b);
    }

    public final byte[] b() {
        return atow.O(this.a);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.b(new DEROctetString(this.a));
        aSN1EncodableVector.b(new DEROctetString(this.b));
        return new DERSequence(aSN1EncodableVector);
    }

    public asvs(ASN1Sequence aSN1Sequence) {
        this.a = atow.O(ASN1OctetString.f(aSN1Sequence.h(0)).c);
        this.b = atow.O(ASN1OctetString.f(aSN1Sequence.h(1)).c);
    }
}
