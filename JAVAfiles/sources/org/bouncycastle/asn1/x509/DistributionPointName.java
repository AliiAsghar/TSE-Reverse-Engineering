package org.bouncycastle.asn1.x509;

import defpackage.aotl;
import defpackage.atdg;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERTaggedObject;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class DistributionPointName extends ASN1Object implements ASN1Choice {
    final ASN1Encodable a;
    final int b;

    public DistributionPointName(ASN1TaggedObject aSN1TaggedObject) {
        int i = aSN1TaggedObject.c;
        this.b = i;
        if (i == 0) {
            this.a = GeneralNames.c(aSN1TaggedObject);
        } else {
            this.a = ASN1Set.h(aSN1TaggedObject);
        }
    }

    public static DistributionPointName a(ASN1TaggedObject aSN1TaggedObject) {
        if (aSN1TaggedObject.b == 128) {
            if (aSN1TaggedObject.n()) {
                ASN1Primitive p = aSN1TaggedObject.d.p();
                if (p instanceof ASN1TaggedObject) {
                    ASN1TaggedObject aSN1TaggedObject2 = (ASN1TaggedObject) p;
                    if (aSN1TaggedObject2 != null) {
                        return new DistributionPointName(aSN1TaggedObject2);
                    }
                    return null;
                }
                throw new IllegalStateException("unexpected object: ".concat(String.valueOf(p.getClass().getName())));
            }
            throw new IllegalStateException("object implicit - explicit expected.");
        }
        throw new IllegalStateException("this method only valid for CONTEXT_SPECIFIC tags");
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        return new DERTaggedObject(false, this.b, this.a);
    }

    public final String toString() {
        String str = atdg.a;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("DistributionPointName: [");
        stringBuffer.append(str);
        if (this.b == 0) {
            aotl.L(stringBuffer, str, "fullName", this.a.toString());
        } else {
            aotl.L(stringBuffer, str, "nameRelativeToCRLIssuer", this.a.toString());
        }
        stringBuffer.append("]");
        stringBuffer.append(str);
        return stringBuffer.toString();
    }
}
