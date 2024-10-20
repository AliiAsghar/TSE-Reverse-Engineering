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
public final class asvj extends ASN1Object {
    private final byte[] a;

    public asvj(byte[] bArr) {
        this.a = bArr;
    }

    public static asvj a(Object obj) {
        if (obj instanceof asvj) {
            return (asvj) obj;
        }
        if (obj != null) {
            return new asvj(ASN1Sequence.j(obj));
        }
        return null;
    }

    public final byte[] b() {
        return atow.O(this.a);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.b(new DEROctetString(this.a));
        return new DERSequence(aSN1EncodableVector);
    }

    public asvj(ASN1Sequence aSN1Sequence) {
        this.a = atow.O(ASN1OctetString.f(aSN1Sequence.h(0)).c);
    }
}
