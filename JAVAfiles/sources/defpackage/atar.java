package defpackage;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atar {
    public final int a;
    public final int b;
    public final ASN1ObjectIdentifier c;
    private final atbb d;
    private final int e;

    /* JADX INFO: Access modifiers changed from: protected */
    public atar(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        int b;
        if (aSN1ObjectIdentifier != null) {
            this.c = aSN1ObjectIdentifier;
            assy b2 = atai.b(aSN1ObjectIdentifier);
            String c = b2.c();
            if (c.equals("SHAKE128")) {
                b = 32;
            } else if (c.equals("SHAKE256")) {
                b = 64;
            } else {
                b = b2.b();
            }
            this.a = b;
            int ceil = (int) Math.ceil((b * 8) / atow.af(16));
            this.e = ceil;
            int floor = ceil + ((int) Math.floor(atow.af(ceil * 15) / atow.af(16))) + 1;
            this.b = floor;
            ataq ataqVar = (ataq) ataq.a.get(ataq.a(b2.c(), b, floor));
            this.d = ataqVar;
            if (ataqVar != null) {
                return;
            } else {
                throw new IllegalArgumentException("cannot find OID for digest algorithm: ".concat(b2.c()));
            }
        }
        throw new NullPointerException("treeDigest == null");
    }
}
