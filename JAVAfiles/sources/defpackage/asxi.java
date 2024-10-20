package defpackage;

import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;

/* compiled from: PG */
/* loaded from: classes.dex */
final class asxi {
    public static final /* synthetic */ int a = 0;
    private static final Map b;
    private static final Map c;

    static {
        HashMap hashMap = new HashMap();
        b = hashMap;
        HashMap hashMap2 = new HashMap();
        c = hashMap2;
        hashMap.put("SHA-256", NISTObjectIdentifiers.c);
        hashMap.put("SHA-512", NISTObjectIdentifiers.e);
        hashMap.put("SHAKE128", NISTObjectIdentifiers.m);
        hashMap.put("SHAKE256", NISTObjectIdentifiers.n);
        hashMap2.put(NISTObjectIdentifiers.c, "SHA-256");
        hashMap2.put(NISTObjectIdentifiers.e, "SHA-512");
        hashMap2.put(NISTObjectIdentifiers.m, "SHAKE128");
        hashMap2.put(NISTObjectIdentifiers.n, "SHAKE256");
    }

    public static assy a(ASN1ObjectIdentifier aSN1ObjectIdentifier, int i) {
        assy astiVar;
        if (aSN1ObjectIdentifier.x(NISTObjectIdentifiers.c)) {
            astiVar = new aste();
        } else if (aSN1ObjectIdentifier.x(NISTObjectIdentifiers.e)) {
            astiVar = new asth();
        } else if (aSN1ObjectIdentifier.x(NISTObjectIdentifiers.m)) {
            astiVar = new asti(128);
        } else if (aSN1ObjectIdentifier.x(NISTObjectIdentifiers.n)) {
            astiVar = new asti(256);
        } else if (aSN1ObjectIdentifier.x(NISTObjectIdentifiers.o)) {
            astiVar = new asti(256);
        } else {
            throw new IllegalArgumentException("unrecognized digest OID: ".concat(String.valueOf(String.valueOf(aSN1ObjectIdentifier))));
        }
        if (!aSN1ObjectIdentifier.x(NISTObjectIdentifiers.o)) {
            if (i == 24) {
                i = 24;
            } else {
                return astiVar;
            }
        }
        return new asxh(astiVar, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static assy b(asxl asxlVar) {
        return a(asxlVar.u, asxlVar.r);
    }
}
