package org.bouncycastle.asn1.x509;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class V2TBSCertListGenerator {
    private static final ASN1Sequence[] a;

    static {
        a = r0;
        ASN1Sequence[] aSN1SequenceArr = {a(0), a(1), a(2), a(3), a(4), a(5), a(6), a(7), a(8), a(9), a(10)};
    }

    public V2TBSCertListGenerator() {
        new ASN1Integer(1L);
        new ASN1EncodableVector();
    }

    private static ASN1Sequence a(int i) {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        CRLReason a2 = CRLReason.a(i);
        try {
            aSN1EncodableVector.b(Extension.g);
            aSN1EncodableVector.b(new DEROctetString(a2.s()));
            return new DERSequence(aSN1EncodableVector);
        } catch (IOException e) {
            throw new IllegalArgumentException("error encoding reason: ".concat(e.toString()));
        }
    }
}
