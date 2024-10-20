package org.bouncycastle.asn1.iso;

import com.android.vcard.VCardConstants;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface ISOIECObjectIdentifiers {
    public static final ASN1ObjectIdentifier a;
    public static final ASN1ObjectIdentifier b;
    public static final ASN1ObjectIdentifier c;
    public static final ASN1ObjectIdentifier d;
    public static final ASN1ObjectIdentifier e;
    public static final ASN1ObjectIdentifier f;

    static {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = new ASN1ObjectIdentifier("1.0.10118");
        a = aSN1ObjectIdentifier;
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, VCardConstants.VERSION_V30);
        b = aSN1ObjectIdentifier2;
        c = new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "49");
        d = new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "50");
        e = new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "55");
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = new ASN1ObjectIdentifier("1.0.18033.2");
        f = aSN1ObjectIdentifier3;
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier3, "1.2");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier3, "2.4");
    }
}
