package org.bouncycastle.asn1.rosstandart;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface RosstandartObjectIdentifiers {
    public static final ASN1ObjectIdentifier a;
    public static final ASN1ObjectIdentifier b;
    public static final ASN1ObjectIdentifier c;
    public static final ASN1ObjectIdentifier d;
    public static final ASN1ObjectIdentifier e;
    public static final ASN1ObjectIdentifier f;
    public static final ASN1ObjectIdentifier g;
    public static final ASN1ObjectIdentifier h;
    public static final ASN1ObjectIdentifier i;

    static {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = new ASN1ObjectIdentifier("1.2.643.7");
        a = aSN1ObjectIdentifier;
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "1");
        b = aSN1ObjectIdentifier2;
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "1.2.2");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "1.2.3");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "1.4.1");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "1.4.2");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "1.1.1");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "1.1.2");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "1.3.2");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "1.3.3");
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "1.6");
        c = aSN1ObjectIdentifier3;
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier3, "1");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier3, "2");
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "2.1.1");
        d = aSN1ObjectIdentifier4;
        e = new ASN1ObjectIdentifier(aSN1ObjectIdentifier4, "1");
        ASN1ObjectIdentifier aSN1ObjectIdentifier5 = new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "2.1.2");
        f = aSN1ObjectIdentifier5;
        g = new ASN1ObjectIdentifier(aSN1ObjectIdentifier5, "1");
        h = new ASN1ObjectIdentifier(aSN1ObjectIdentifier5, "2");
        i = new ASN1ObjectIdentifier(aSN1ObjectIdentifier5, "3");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "2.5.1.1");
    }
}
