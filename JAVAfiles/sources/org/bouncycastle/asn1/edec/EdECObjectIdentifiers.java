package org.bouncycastle.asn1.edec;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface EdECObjectIdentifiers {
    public static final ASN1ObjectIdentifier a;
    public static final ASN1ObjectIdentifier b;
    public static final ASN1ObjectIdentifier c;

    static {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = new ASN1ObjectIdentifier("1.3.101");
        a = aSN1ObjectIdentifier;
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "110").g();
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "111").g();
        b = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "112").g();
        c = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "113").g();
    }
}
