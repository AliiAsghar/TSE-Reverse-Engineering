package org.bouncycastle.asn1.x509;

import defpackage.atdb;
import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class CRLNumber extends ASN1Object {
    private BigInteger a;

    public CRLNumber(BigInteger bigInteger) {
        if (atdb.a.compareTo(bigInteger) <= 0) {
            this.a = bigInteger;
            return;
        }
        throw new IllegalArgumentException("Invalid CRL number : not in (0..MAX)");
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        return new ASN1Integer(this.a);
    }

    public final String toString() {
        return "CRLNumber: ".concat(String.valueOf(String.valueOf(this.a)));
    }
}
