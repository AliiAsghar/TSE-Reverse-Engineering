package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anvc {
    public static final ansy a;
    public static final ansy b;
    public static final antv c;
    public static final antv d;
    public static final antv e;
    public static final antv f;
    private static final aocj g;

    static {
        aocj b2 = anuk.b("type.googleapis.com/google.crypto.tink.HmacKey");
        g = b2;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        anme.v(anxp.RAW, anuu.d, hashMap, hashMap2);
        anme.v(anxp.TINK, anuu.a, hashMap, hashMap2);
        anme.v(anxp.LEGACY, anuu.c, hashMap, hashMap2);
        anme.v(anxp.CRUNCHY, anuu.b, hashMap, hashMap2);
        a = anme.u(hashMap, hashMap2);
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        anme.v(anwu.SHA1, anut.a, hashMap3, hashMap4);
        anme.v(anwu.SHA224, anut.b, hashMap3, hashMap4);
        anme.v(anwu.SHA256, anut.c, hashMap3, hashMap4);
        anme.v(anwu.SHA384, anut.d, hashMap3, hashMap4);
        anme.v(anwu.SHA512, anut.e, hashMap3, hashMap4);
        b = anme.u(hashMap3, hashMap4);
        c = new antv(anuv.class, anub.class, new anoy(13));
        d = new antv(b2, anub.class, new anoz(13));
        e = new antv(anur.class, anua.class, new anpa(16));
        f = new antv(b2, anua.class, new anpb(15));
    }

    public static anwx a(anuv anuvVar) {
        aozy createBuilder = anwx.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((anwx) createBuilder.b).c = anuvVar.f;
        anwu anwuVar = (anwu) b.a(anuvVar.h);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((anwx) createBuilder.b).b = anwuVar.a();
        return (anwx) createBuilder.s();
    }
}
