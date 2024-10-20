package org.bouncycastle.asn1.teletrust;

import defpackage.atdg;
import java.util.Hashtable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.x9.X9ECParametersHolder;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class TeleTrusTNamedCurves {
    static final X9ECParametersHolder a;
    static final X9ECParametersHolder b;
    static final X9ECParametersHolder c;
    static final X9ECParametersHolder d;
    static final X9ECParametersHolder e;
    static final X9ECParametersHolder f;
    static final X9ECParametersHolder g;
    static final X9ECParametersHolder h;
    static final X9ECParametersHolder i;
    static final X9ECParametersHolder j;
    static final X9ECParametersHolder k;
    static final X9ECParametersHolder l;
    static final X9ECParametersHolder m;
    static final X9ECParametersHolder n;
    static final Hashtable o;
    static final Hashtable p;
    static final Hashtable q;

    static {
        X9ECParametersHolder x9ECParametersHolder = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.teletrust.TeleTrusTNamedCurves.1
        };
        a = x9ECParametersHolder;
        X9ECParametersHolder x9ECParametersHolder2 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.teletrust.TeleTrusTNamedCurves.2
        };
        b = x9ECParametersHolder2;
        X9ECParametersHolder x9ECParametersHolder3 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.teletrust.TeleTrusTNamedCurves.3
        };
        c = x9ECParametersHolder3;
        X9ECParametersHolder x9ECParametersHolder4 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.teletrust.TeleTrusTNamedCurves.4
        };
        d = x9ECParametersHolder4;
        X9ECParametersHolder x9ECParametersHolder5 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.teletrust.TeleTrusTNamedCurves.5
        };
        e = x9ECParametersHolder5;
        X9ECParametersHolder x9ECParametersHolder6 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.teletrust.TeleTrusTNamedCurves.6
        };
        f = x9ECParametersHolder6;
        X9ECParametersHolder x9ECParametersHolder7 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.teletrust.TeleTrusTNamedCurves.7
        };
        g = x9ECParametersHolder7;
        X9ECParametersHolder x9ECParametersHolder8 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.teletrust.TeleTrusTNamedCurves.8
        };
        h = x9ECParametersHolder8;
        X9ECParametersHolder x9ECParametersHolder9 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.teletrust.TeleTrusTNamedCurves.9
        };
        i = x9ECParametersHolder9;
        X9ECParametersHolder x9ECParametersHolder10 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.teletrust.TeleTrusTNamedCurves.10
        };
        j = x9ECParametersHolder10;
        X9ECParametersHolder x9ECParametersHolder11 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.teletrust.TeleTrusTNamedCurves.11
        };
        k = x9ECParametersHolder11;
        X9ECParametersHolder x9ECParametersHolder12 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.teletrust.TeleTrusTNamedCurves.12
        };
        l = x9ECParametersHolder12;
        X9ECParametersHolder x9ECParametersHolder13 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.teletrust.TeleTrusTNamedCurves.13
        };
        m = x9ECParametersHolder13;
        X9ECParametersHolder x9ECParametersHolder14 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.teletrust.TeleTrusTNamedCurves.14
        };
        n = x9ECParametersHolder14;
        o = new Hashtable();
        p = new Hashtable();
        q = new Hashtable();
        a("brainpoolP160r1", TeleTrusTObjectIdentifiers.m, x9ECParametersHolder);
        a("brainpoolP160t1", TeleTrusTObjectIdentifiers.n, x9ECParametersHolder2);
        a("brainpoolP192r1", TeleTrusTObjectIdentifiers.o, x9ECParametersHolder3);
        a("brainpoolP192t1", TeleTrusTObjectIdentifiers.p, x9ECParametersHolder4);
        a("brainpoolP224r1", TeleTrusTObjectIdentifiers.q, x9ECParametersHolder5);
        a("brainpoolP224t1", TeleTrusTObjectIdentifiers.r, x9ECParametersHolder6);
        a("brainpoolP256r1", TeleTrusTObjectIdentifiers.s, x9ECParametersHolder7);
        a("brainpoolP256t1", TeleTrusTObjectIdentifiers.t, x9ECParametersHolder8);
        a("brainpoolP320r1", TeleTrusTObjectIdentifiers.u, x9ECParametersHolder9);
        a("brainpoolP320t1", TeleTrusTObjectIdentifiers.v, x9ECParametersHolder10);
        a("brainpoolP384r1", TeleTrusTObjectIdentifiers.w, x9ECParametersHolder11);
        a("brainpoolP384t1", TeleTrusTObjectIdentifiers.x, x9ECParametersHolder12);
        a("brainpoolP512r1", TeleTrusTObjectIdentifiers.y, x9ECParametersHolder13);
        a("brainpoolP512t1", TeleTrusTObjectIdentifiers.z, x9ECParametersHolder14);
    }

    static void a(String str, ASN1ObjectIdentifier aSN1ObjectIdentifier, X9ECParametersHolder x9ECParametersHolder) {
        o.put(atdg.b(str), aSN1ObjectIdentifier);
        q.put(aSN1ObjectIdentifier, str);
        p.put(aSN1ObjectIdentifier, x9ECParametersHolder);
    }
}
