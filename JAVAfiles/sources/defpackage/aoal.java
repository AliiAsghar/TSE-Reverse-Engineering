package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoal {
    public static final antv a;
    public static final antv b;
    public static final antv c;
    public static final antv d;
    private static final aocj e;

    static {
        aocj b2 = anuk.b("type.googleapis.com/google.crypto.tink.AesCtrHmacStreamingKey");
        e = b2;
        int i = 18;
        a = new antv(aoaa.class, anub.class, new anoy(i));
        b = new antv(b2, anub.class, new anoz(i));
        c = new antv(anzx.class, anua.class, new anzr(4));
        d = new antv(b2, anua.class, new anzu(3));
    }

    public static anvm a(aoaa aoaaVar) {
        aozy createBuilder = anvm.a.createBuilder();
        int F = aoaaVar.F();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((anvm) createBuilder.b).c = F;
        int G = aoaaVar.G();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((anvm) createBuilder.b).d = G;
        anwu c2 = c(aoaaVar.e);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((anvm) createBuilder.b).e = c2.a();
        aozy createBuilder2 = anwx.a.createBuilder();
        anwu c3 = c(aoaaVar.f);
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        ((anwx) createBuilder2.b).b = c3.a();
        int H = aoaaVar.H();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        ((anwx) createBuilder2.b).c = H;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        anvm anvmVar = (anvm) createBuilder.b;
        anwx anwxVar = (anwx) createBuilder2.s();
        anwxVar.getClass();
        anvmVar.f = anwxVar;
        anvmVar.b |= 1;
        return (anvm) createBuilder.s();
    }

    public static aoaa b(anvm anvmVar, int i) {
        aqxc aqxcVar = new aqxc(null);
        aqxcVar.d(i);
        aqxcVar.c(anvmVar.d);
        aqxcVar.b(anvmVar.c);
        anwu b2 = anwu.b(anvmVar.e);
        if (b2 == null) {
            b2 = anwu.UNRECOGNIZED;
        }
        aqxcVar.f = d(b2);
        anwx anwxVar = anvmVar.f;
        if (anwxVar == null) {
            anwxVar = anwx.a;
        }
        anwu b3 = anwu.b(anwxVar.b);
        if (b3 == null) {
            b3 = anwu.UNRECOGNIZED;
        }
        aqxcVar.c = d(b3);
        anwx anwxVar2 = anvmVar.f;
        if (anwxVar2 == null) {
            anwxVar2 = anwx.a;
        }
        aqxcVar.d = Integer.valueOf(anwxVar2.c);
        return aqxcVar.a();
    }

    private static anwu c(anzz anzzVar) {
        if (anzz.a.equals(anzzVar)) {
            return anwu.SHA1;
        }
        if (anzz.b.equals(anzzVar)) {
            return anwu.SHA256;
        }
        if (anzz.c.equals(anzzVar)) {
            return anwu.SHA512;
        }
        throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(String.valueOf(anzzVar))));
    }

    private static anzz d(anwu anwuVar) {
        int ordinal = anwuVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 3) {
                if (ordinal == 4) {
                    return anzz.c;
                }
                throw new GeneralSecurityException("Unable to parse HashType: " + anwuVar.a());
            }
            return anzz.b;
        }
        return anzz.a;
    }
}
