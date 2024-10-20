package org.bouncycastle.asn1.nist;

import java.util.Hashtable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.sec.SECObjectIdentifiers;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class NISTNamedCurves {
    static final Hashtable a = new Hashtable();
    static final Hashtable b = new Hashtable();

    static {
        a("B-571", SECObjectIdentifiers.F);
        a("B-409", SECObjectIdentifiers.D);
        a("B-283", SECObjectIdentifiers.n);
        a("B-233", SECObjectIdentifiers.t);
        a("B-163", SECObjectIdentifiers.l);
        a("K-571", SECObjectIdentifiers.E);
        a("K-409", SECObjectIdentifiers.C);
        a("K-283", SECObjectIdentifiers.m);
        a("K-233", SECObjectIdentifiers.s);
        a("K-163", SECObjectIdentifiers.b);
        a("P-521", SECObjectIdentifiers.B);
        a("P-384", SECObjectIdentifiers.A);
        a("P-256", SECObjectIdentifiers.H);
        a("P-224", SECObjectIdentifiers.z);
        a("P-192", SECObjectIdentifiers.G);
    }

    static void a(String str, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        a.put(str, aSN1ObjectIdentifier);
        b.put(aSN1ObjectIdentifier, str);
    }
}
