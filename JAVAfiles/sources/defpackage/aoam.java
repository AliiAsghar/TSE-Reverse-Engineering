package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoam {
    public static final antv a;
    public static final antv b;
    public static final antv c;
    public static final antv d;
    private static final aocj e;

    static {
        aocj b2 = anuk.b("type.googleapis.com/google.crypto.tink.AesGcmHkdfStreamingKey");
        e = b2;
        int i = 19;
        a = new antv(aoaf.class, anub.class, new anoy(i));
        b = new antv(b2, anub.class, new anoz(i));
        c = new antv(aoab.class, anua.class, new anzr(5));
        d = new antv(b2, anua.class, new anzu(4));
    }

    public static anvv a(aoaf aoafVar) {
        anwu anwuVar;
        aozy createBuilder = anvv.a.createBuilder();
        int F = aoafVar.F();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((anvv) createBuilder.b).b = F;
        int G = aoafVar.G();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((anvv) createBuilder.b).c = G;
        aoae aoaeVar = aoafVar.e;
        if (aoae.a.equals(aoaeVar)) {
            anwuVar = anwu.SHA1;
        } else if (aoae.b.equals(aoaeVar)) {
            anwuVar = anwu.SHA256;
        } else if (aoae.c.equals(aoaeVar)) {
            anwuVar = anwu.SHA512;
        } else {
            throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(String.valueOf(aoaeVar))));
        }
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((anvv) createBuilder.b).d = anwuVar.a();
        return (anvv) createBuilder.s();
    }

    public static aoaf b(anvv anvvVar, int i) {
        aoae aoaeVar;
        aoad aoadVar = new aoad();
        aoadVar.d(i);
        aoadVar.c(anvvVar.c);
        aoadVar.b(anvvVar.b);
        anwu b2 = anwu.b(anvvVar.d);
        if (b2 == null) {
            b2 = anwu.UNRECOGNIZED;
        }
        int ordinal = b2.ordinal();
        if (ordinal != 1) {
            if (ordinal != 3) {
                if (ordinal == 4) {
                    aoaeVar = aoae.c;
                } else {
                    throw new GeneralSecurityException("Unable to parse HashType: " + b2.a());
                }
            } else {
                aoaeVar = aoae.b;
            }
        } else {
            aoaeVar = aoae.a;
        }
        aoadVar.a = aoaeVar;
        return aoadVar.a();
    }
}
