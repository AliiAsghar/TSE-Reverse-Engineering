package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class PolicyQualifierId extends ASN1ObjectIdentifier {
    static {
        new PolicyQualifierId("1.3.6.1.5.5.7.2.1");
        new PolicyQualifierId("1.3.6.1.5.5.7.2.2");
    }

    private PolicyQualifierId(String str) {
        super(str);
    }
}
