package defpackage;

import java.util.Map;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class asxt {
    public static final asxt a = new asxt(5, 32, 5, NISTObjectIdentifiers.c);
    public static final asxt b;
    public static final asxt c;
    public static final asxt d;
    public static final asxt e;
    public static final asxt f;
    public static final asxt g;
    public static final asxt h;
    public static final asxt i;
    public static final asxt j;
    public static final asxt k;
    public static final asxt l;
    public static final asxt m;
    public static final asxt n;
    public static final asxt o;
    public static final asxt p;
    public static final asxt q;
    public static final asxt r;
    public static final asxt s;
    public static final asxt t;
    private static final Map y;
    public final int u;
    public final int v;
    public final int w;
    public final ASN1ObjectIdentifier x;

    static {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = NISTObjectIdentifiers.c;
        b = new asxt(6, 32, 10, aSN1ObjectIdentifier);
        c = new asxt(7, 32, 15, aSN1ObjectIdentifier);
        d = new asxt(8, 32, 20, aSN1ObjectIdentifier);
        e = new asxt(9, 32, 25, aSN1ObjectIdentifier);
        f = new asxt(10, 24, 5, aSN1ObjectIdentifier);
        g = new asxt(11, 24, 10, aSN1ObjectIdentifier);
        h = new asxt(12, 24, 15, aSN1ObjectIdentifier);
        i = new asxt(13, 24, 20, aSN1ObjectIdentifier);
        j = new asxt(14, 24, 25, aSN1ObjectIdentifier);
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = NISTObjectIdentifiers.o;
        k = new asxt(15, 32, 5, aSN1ObjectIdentifier2);
        l = new asxt(16, 32, 10, aSN1ObjectIdentifier2);
        m = new asxt(17, 32, 15, aSN1ObjectIdentifier2);
        n = new asxt(18, 32, 20, aSN1ObjectIdentifier2);
        o = new asxt(19, 32, 25, aSN1ObjectIdentifier2);
        p = new asxt(20, 24, 5, aSN1ObjectIdentifier2);
        q = new asxt(21, 24, 10, aSN1ObjectIdentifier2);
        r = new asxt(22, 24, 15, aSN1ObjectIdentifier2);
        s = new asxt(23, 24, 20, aSN1ObjectIdentifier2);
        t = new asxt(24, 24, 25, aSN1ObjectIdentifier2);
        y = new asxs();
    }

    protected asxt(int i2, int i3, int i4, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.u = i2;
        this.v = i3;
        this.w = i4;
        this.x = aSN1ObjectIdentifier;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static asxt a(int i2) {
        return (asxt) y.get(Integer.valueOf(i2));
    }
}
