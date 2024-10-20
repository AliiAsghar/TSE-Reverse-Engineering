package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import java.util.Map;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class asxl {
    public static final asxl a = new asxl(1, 32, 1, 265, NISTObjectIdentifiers.c);
    public static final asxl b;
    public static final asxl c;
    public static final asxl d;
    public static final asxl e;
    public static final asxl f;
    public static final asxl g;
    public static final asxl h;
    public static final asxl i;
    public static final asxl j;
    public static final asxl k;
    public static final asxl l;
    public static final asxl m;
    public static final asxl n;
    public static final asxl o;
    public static final asxl p;
    private static final Map v;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final ASN1ObjectIdentifier u;

    static {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = NISTObjectIdentifiers.c;
        b = new asxl(2, 32, 2, 133, aSN1ObjectIdentifier);
        c = new asxl(3, 32, 4, 67, aSN1ObjectIdentifier);
        d = new asxl(4, 32, 8, 34, aSN1ObjectIdentifier);
        e = new asxl(5, 24, 1, BasePaymentResult.ERROR_REQUEST_FAILED, aSN1ObjectIdentifier);
        f = new asxl(6, 24, 2, 101, aSN1ObjectIdentifier);
        g = new asxl(7, 24, 4, 51, aSN1ObjectIdentifier);
        h = new asxl(8, 24, 8, 26, aSN1ObjectIdentifier);
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = NISTObjectIdentifiers.o;
        i = new asxl(9, 32, 1, 265, aSN1ObjectIdentifier2);
        j = new asxl(10, 32, 2, 133, aSN1ObjectIdentifier2);
        k = new asxl(11, 32, 4, 67, aSN1ObjectIdentifier2);
        l = new asxl(12, 32, 8, 34, aSN1ObjectIdentifier2);
        m = new asxl(13, 24, 1, BasePaymentResult.ERROR_REQUEST_FAILED, aSN1ObjectIdentifier2);
        n = new asxl(14, 24, 2, 101, aSN1ObjectIdentifier2);
        o = new asxl(15, 24, 4, 51, aSN1ObjectIdentifier2);
        p = new asxl(16, 24, 8, 26, aSN1ObjectIdentifier2);
        v = new asxs(null);
    }

    protected asxl(int i2, int i3, int i4, int i5, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.q = i2;
        this.r = i3;
        this.s = i4;
        this.t = i5;
        this.u = aSN1ObjectIdentifier;
    }

    public static asxl a(int i2) {
        return (asxl) v.get(Integer.valueOf(i2));
    }
}
