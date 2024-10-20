package defpackage;

import java.math.BigInteger;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anzv {
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
        aocj b2 = anuk.b("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey");
        i = b2;
        aocj b3 = anuk.b("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey");
        j = b3;
        c = new antv(anzg.class, anub.class, new anoy(17));
        d = new antv(b2, anub.class, new anoz(17));
        int i2 = 2;
        e = new antv(anzj.class, anua.class, new anzr(i2));
        g = new antv(b3, anua.class, new anzu(0));
        f = new antv(anzi.class, anua.class, new anzr(3));
        h = new antv(b2, anua.class, new anzu(i2));
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        anme.v(anxp.RAW, anzf.d, hashMap, hashMap2);
        anme.v(anxp.TINK, anzf.a, hashMap, hashMap2);
        anme.v(anxp.CRUNCHY, anzf.b, hashMap, hashMap2);
        anme.v(anxp.LEGACY, anzf.c, hashMap, hashMap2);
        a = anme.u(hashMap, hashMap2);
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        anme.v(anwu.SHA256, anze.a, hashMap3, hashMap4);
        anme.v(anwu.SHA384, anze.b, hashMap3, hashMap4);
        anme.v(anwu.SHA512, anze.c, hashMap3, hashMap4);
        b = anme.u(hashMap3, hashMap4);
    }

    public static anxw a(anzg anzgVar) {
        aozy createBuilder = anxw.a.createBuilder();
        ansy ansyVar = b;
        anwu anwuVar = (anwu) ansyVar.a(anzgVar.i);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((anxw) createBuilder.b).b = anwuVar.a();
        anwu anwuVar2 = (anwu) ansyVar.a(anzgVar.j);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((anxw) createBuilder.b).c = anwuVar2.a();
        int i2 = anzgVar.k;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((anxw) createBuilder.b).d = i2;
        return (anxw) createBuilder.s();
    }

    public static anxy b(anzj anzjVar) {
        aozy createBuilder = anxy.a.createBuilder();
        anxw a2 = a(anzjVar.e);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        anxy anxyVar = (anxy) createBuilder.b;
        a2.getClass();
        anxyVar.d = a2;
        anxyVar.b |= 1;
        aozb c2 = c(anzjVar.f);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((anxy) createBuilder.b).e = c2;
        aozb c3 = c(anzjVar.e.g);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        ((anxy) apagVar).f = c3;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        ((anxy) createBuilder.b).c = 0;
        return (anxy) createBuilder.s();
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
