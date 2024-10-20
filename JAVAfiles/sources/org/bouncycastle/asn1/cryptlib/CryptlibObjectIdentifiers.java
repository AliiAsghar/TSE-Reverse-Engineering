package org.bouncycastle.asn1.cryptlib;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class CryptlibObjectIdentifiers {
    public static final ASN1ObjectIdentifier a;
    public static final ASN1ObjectIdentifier b;

    static {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = new ASN1ObjectIdentifier("1.3.6.1.4.1.3029");
        a = aSN1ObjectIdentifier;
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = new ASN1ObjectIdentifier(new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "1"), "5");
        b = aSN1ObjectIdentifier2;
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "1");
    }
}
