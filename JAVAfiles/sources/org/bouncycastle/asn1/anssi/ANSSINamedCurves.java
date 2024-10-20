package org.bouncycastle.asn1.anssi;

import defpackage.atdg;
import java.util.Hashtable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.x9.X9ECParametersHolder;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ANSSINamedCurves {
    static final X9ECParametersHolder a;
    static final Hashtable b;
    static final Hashtable c;
    static final Hashtable d;

    static {
        X9ECParametersHolder x9ECParametersHolder = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.anssi.ANSSINamedCurves.1
        };
        a = x9ECParametersHolder;
        Hashtable hashtable = new Hashtable();
        b = hashtable;
        Hashtable hashtable2 = new Hashtable();
        c = hashtable2;
        Hashtable hashtable3 = new Hashtable();
        d = hashtable3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier = ANSSIObjectIdentifiers.a;
        hashtable.put(atdg.b("FRP256v1"), aSN1ObjectIdentifier);
        hashtable3.put(aSN1ObjectIdentifier, "FRP256v1");
        hashtable2.put(aSN1ObjectIdentifier, x9ECParametersHolder);
    }
}
