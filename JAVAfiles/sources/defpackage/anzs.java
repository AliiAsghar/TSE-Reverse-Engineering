package defpackage;

import java.math.BigInteger;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anzs {
    public static final ansy a;
    public static final ansy b;
    public static final antv c;
    public static final antv d;
    public static final antv e;
    public static final antv f;
    public static final antv g;
    public static final antv h;
    private static final aocj i;
    private static final aocj j;

    static {
        aocj b2 = anuk.b("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey");
        i = b2;
        aocj b3 = anuk.b("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey");
        j = b3;
        c = new antv(anyz.class, anub.class, new anoy(16));
        d = new antv(b2, anub.class, new anoz(16));
        int i2 = 1;
        e = new antv(anzb.class, anua.class, new anzr(i2));
        g = new antv(b3, anua.class, new anpb(20));
        f = new antv(anza.class, anua.class, new anzr(0));
        h = new antv(b2, anua.class, new anzu(i2));
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        anme.v(anxp.RAW, anyy.d, hashMap, hashMap2);
        anme.v(anxp.TINK, anyy.a, hashMap, hashMap2);
        anme.v(anxp.CRUNCHY, anyy.b, hashMap, hashMap2);
        anme.v(anxp.LEGACY, anyy.c, hashMap, hashMap2);
        a = anme.u(hashMap, hashMap2);
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        anme.v(anwu.SHA256, anyx.a, hashMap3, hashMap4);
        anme.v(anwu.SHA384, anyx.b, hashMap3, hashMap4);
        anme.v(anwu.SHA512, anyx.c, hashMap3, hashMap4);
        b = anme.u(hashMap3, hashMap4);
    }

    public static anxs a(anyz anyzVar) {
        aozy createBuilder = anxs.a.createBuilder();
        anwu anwuVar = (anwu) b.a(anyzVar.i);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((anxs) createBuilder.b).b = anwuVar.a();
        return (anxs) createBuilder.s();
    }

    public static anxu b(anzb anzbVar) {
        aozy createBuilder = anxu.a.createBuilder();
        anxs a2 = a(anzbVar.e);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        anxu anxuVar = (anxu) createBuilder.b;
        a2.getClass();
        anxuVar.d = a2;
        anxuVar.b |= 1;
        aozb c2 = c(anzbVar.f);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((anxu) createBuilder.b).e = c2;
        aozb c3 = c(anzbVar.e.g);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((anxu) createBuilder.b).f = c3;
        return (anxu) createBuilder.s();
    }

    public static aozb c(BigInteger bigInteger) {
        return aozb.w(anme.w(bigInteger));
    }

    public static BigInteger d(aozb aozbVar) {
        return new BigInteger(1, aozbVar.H());
    }

    public static ahmn e(aozb aozbVar) {
        return new ahmn(new BigInteger(1, aozbVar.H()), null);
    }

    public static aozb f(ahmn ahmnVar) {
        return c((BigInteger) ahmnVar.a);
    }
}
