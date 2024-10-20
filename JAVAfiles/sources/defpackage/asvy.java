package defpackage;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class asvy extends ASN1Object {
    private final byte[] a;
    private final byte[] b;

    private asvy(ASN1Sequence aSN1Sequence) {
        if (ASN1Integer.m(aSN1Sequence.h(0)).o(0)) {
            this.a = atow.O(DEROctetString.f(aSN1Sequence.h(1)).c);
            this.b = atow.O(DEROctetString.f(aSN1Sequence.h(2)).c);
            return;
        }
        throw new IllegalArgumentException("unknown version of sequence");
    }

    public static asvy a(Object obj) {
        if (obj != null) {
            return new asvy(ASN1Sequence.j(obj));
        }
        return null;
    }

    public final byte[] b() {
        return atow.O(this.a);
    }

    public final byte[] c() {
        return atow.O(this.b);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.b(new ASN1Integer(0L));
        aSN1EncodableVector.b(new DEROctetString(this.a));
        aSN1EncodableVector.b(new DEROctetString(this.b));
        return new DERSequence(aSN1EncodableVector);
    }

    public asvy(byte[] bArr, byte[] bArr2) {
        this.a = atow.O(bArr);
        this.b = atow.O(bArr2);
    }
}
