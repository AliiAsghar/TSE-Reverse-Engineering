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
public final class asvr extends ASN1Object {
    public byte[] a;
    public byte[] b;
    public asvs c;
    private final int d;

    public asvr(ASN1Sequence aSN1Sequence) {
        asvs asvsVar;
        int f = ASN1Integer.m(aSN1Sequence.h(0)).f();
        this.d = f;
        if (f == 0) {
            this.a = atow.O(ASN1OctetString.f(aSN1Sequence.h(1)).c);
            this.b = atow.O(ASN1OctetString.f(aSN1Sequence.h(2)).c);
            if (aSN1Sequence.e() == 4) {
                ASN1Encodable h = aSN1Sequence.h(3);
                if (h instanceof asvs) {
                    asvsVar = (asvs) h;
                } else if (h != null) {
                    asvsVar = new asvs(ASN1Sequence.j(h));
                } else {
                    asvsVar = null;
                }
                this.c = asvsVar;
                return;
            }
            return;
        }
        throw new IllegalArgumentException("unrecognized version");
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.b(new ASN1Integer(this.d));
        aSN1EncodableVector.b(new DEROctetString(this.a));
        aSN1EncodableVector.b(new DEROctetString(this.b));
        asvs asvsVar = this.c;
        if (asvsVar != null) {
            aSN1EncodableVector.b(new asvs(asvsVar.b(), this.c.a()));
        }
        return new DERSequence(aSN1EncodableVector);
    }
}
