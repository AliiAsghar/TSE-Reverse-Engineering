package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface X509AttributeIdentifiers {
    public static final ASN1ObjectIdentifier a;

    static {
        new ASN1ObjectIdentifier("2.5.4.72");
        new ASN1ObjectIdentifier(X509ObjectIdentifiers.e, "4");
        new ASN1ObjectIdentifier(X509ObjectIdentifiers.e, "6");
        new ASN1ObjectIdentifier(X509ObjectIdentifiers.e, "10");
        new ASN1ObjectIdentifier(X509ObjectIdentifiers.f, "55");
        ASN1ObjectIdentifier aSN1ObjectIdentifier = new ASN1ObjectIdentifier(X509ObjectIdentifiers.d, "10");
        a = aSN1ObjectIdentifier;
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "1");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "2");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "3");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "4");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "6");
        new ASN1ObjectIdentifier("2.5.4.72");
        new ASN1ObjectIdentifier("2.5.1.5.55");
    }
}
