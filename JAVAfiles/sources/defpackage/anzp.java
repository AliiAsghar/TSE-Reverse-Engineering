package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anzp {
    public static final ansy a;
    public static final antv b;
    public static final antv c;
    public static final antv d;
    public static final antv e;
    public static final antv f;
    public static final antv g;
    private static final aocj h;
    private static final aocj i;

    static {
        aocj b2 = anuk.b("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey");
        h = b2;
        aocj b3 = anuk.b("type.googleapis.com/google.crypto.tink.Ed25519PublicKey");
        i = b3;
        b = new antv(anyn.class, anub.class, new anoy(15));
        c = new antv(b2, anub.class, new anoz(15));
        d = new antv(anyq.class, anua.class, new anpa(19));
        f = new antv(b3, anua.class, new anpb(18));
        e = new antv(anyo.class, anua.class, new anpa(20));
        g = new antv(b2, anua.class, new anpb(19));
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        anme.v(anxp.RAW, anym.d, hashMap, hashMap2);
        anme.v(anxp.TINK, anym.a, hashMap, hashMap2);
        anme.v(anxp.CRUNCHY, anym.b, hashMap, hashMap2);
        anme.v(anxp.LEGACY, anym.c, hashMap, hashMap2);
        a = anme.u(hashMap, hashMap2);
    }

    public static anwr a(anyq anyqVar) {
        aozy createBuilder = anwr.a.createBuilder();
        aozb w = aozb.w(anyqVar.f.c());
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((anwr) createBuilder.b).c = w;
        return (anwr) createBuilder.s();
    }
}
