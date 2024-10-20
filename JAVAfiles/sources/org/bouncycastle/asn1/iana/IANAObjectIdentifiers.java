package org.bouncycastle.asn1.iana;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface IANAObjectIdentifiers {
    public static final ASN1ObjectIdentifier a;
    public static final ASN1ObjectIdentifier b;
    public static final ASN1ObjectIdentifier c;
    public static final ASN1ObjectIdentifier d;
    public static final ASN1ObjectIdentifier e;

    static {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = new ASN1ObjectIdentifier("1.3.6.1");
        a = aSN1ObjectIdentifier;
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "1");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "2");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "3");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "4");
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "5");
        b = aSN1ObjectIdentifier2;
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "6");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "7");
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "5");
        c = aSN1ObjectIdentifier3;
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "6");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier3, "6");
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = new ASN1ObjectIdentifier(aSN1ObjectIdentifier3, "8");
        d = aSN1ObjectIdentifier4;
        ASN1ObjectIdentifier aSN1ObjectIdentifier5 = new ASN1ObjectIdentifier(aSN1ObjectIdentifier4, "1");
        e = aSN1ObjectIdentifier5;
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier5, "1");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier5, "2");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier5, "3");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier5, "4");
    }
}
