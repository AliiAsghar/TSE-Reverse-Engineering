package defpackage;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class asvk extends ASN1Object {
    public byte[] a;
    public byte[] b;
    public byte[] c;
    public asvl d;
    private final int e;

    public asvk(byte[] bArr, byte[] bArr2, byte[] bArr3, asvl asvlVar) {
        this.e = 0;
        this.a = bArr;
        this.b = bArr2;
        this.c = bArr3;
        this.d = asvlVar;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.b(new ASN1Integer(this.e));
        aSN1EncodableVector.b(new DEROctetString(this.a));
        aSN1EncodableVector.b(new DEROctetString(this.b));
        aSN1EncodableVector.b(new DEROctetString(this.c));
        asvl asvlVar = this.d;
        if (asvlVar != null) {
            aSN1EncodableVector.b(new asvl(asvlVar.a));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public asvk(ASN1Sequence aSN1Sequence) {
        asvl asvlVar;
        int f = ASN1Integer.m(aSN1Sequence.h(0)).f();
        this.e = f;
        if (f == 0) {
            this.a = atow.O(ASN1OctetString.f(aSN1Sequence.h(1)).c);
            this.b = atow.O(ASN1OctetString.f(aSN1Sequence.h(2)).c);
            this.c = atow.O(ASN1OctetString.f(aSN1Sequence.h(3)).c);
            if (aSN1Sequence.e() == 5) {
                ASN1Encodable h = aSN1Sequence.h(4);
                if (h instanceof asvl) {
                    asvlVar = (asvl) h;
                } else {
                    asvlVar = h != null ? new asvl(ASN1Sequence.j(h)) : null;
                }
                this.d = asvlVar;
                return;
            }
            return;
        }
        throw new IllegalArgumentException("unrecognized version");
    }
}
