package org.bouncycastle.asn1.gm;

import defpackage.atdg;
import java.util.Hashtable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.x9.X9ECParametersHolder;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class GMNamedCurves {
    static final X9ECParametersHolder a;
    static final X9ECParametersHolder b;
    static final Hashtable c;
    static final Hashtable d;
    static final Hashtable e;

    static {
        X9ECParametersHolder x9ECParametersHolder = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.gm.GMNamedCurves.1
        };
        a = x9ECParametersHolder;
        X9ECParametersHolder x9ECParametersHolder2 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.gm.GMNamedCurves.2
        };
        b = x9ECParametersHolder2;
        c = new Hashtable();
        d = new Hashtable();
        e = new Hashtable();
        a("wapip192v1", GMObjectIdentifiers.d, x9ECParametersHolder2);
        a("wapi192v1", GMObjectIdentifiers.e, x9ECParametersHolder2);
        a("sm2p256v1", GMObjectIdentifiers.b, x9ECParametersHolder);
    }

    static void a(String str, ASN1ObjectIdentifier aSN1ObjectIdentifier, X9ECParametersHolder x9ECParametersHolder) {
        c.put(atdg.b(str), aSN1ObjectIdentifier);
        e.put(aSN1ObjectIdentifier, str);
        d.put(aSN1ObjectIdentifier, x9ECParametersHolder);
    }
}
