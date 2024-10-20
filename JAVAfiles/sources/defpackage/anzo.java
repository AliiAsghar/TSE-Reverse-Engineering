package defpackage;

import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anzo {
    public static final antv a;
    public static final antv b;
    public static final antv c;
    public static final antv d;
    public static final antv e;
    public static final antv f;
    private static final aocj g;
    private static final aocj h;

    static {
        aocj b2 = anuk.b("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey");
        g = b2;
        aocj b3 = anuk.b("type.googleapis.com/google.crypto.tink.EcdsaPublicKey");
        h = b3;
        a = new antv(anyi.class, anub.class, new anoy(14));
        b = new antv(b2, anub.class, new anoz(14));
        c = new antv(anyk.class, anua.class, new anpa(17));
        e = new antv(b3, anua.class, new anpb(16));
        d = new antv(anyj.class, anua.class, new anpa(18));
        f = new antv(b2, anua.class, new anpb(17));
    }

    public static int a(anye anyeVar) {
        if (anye.a.equals(anyeVar)) {
            return 33;
        }
        if (anye.b.equals(anyeVar)) {
            return 49;
        }
        if (anye.c.equals(anyeVar)) {
            return 67;
        }
        throw new GeneralSecurityException("Unable to serialize CurveType ".concat(anyeVar.d));
    }

    public static anwg b(anyi anyiVar) {
        anwu anwuVar;
        anws anwsVar;
        int i;
        aozy createBuilder = anwg.a.createBuilder();
        anyf anyfVar = anyf.a;
        anyf anyfVar2 = anyiVar.g;
        if (anyfVar.equals(anyfVar2)) {
            anwuVar = anwu.SHA256;
        } else if (anyf.b.equals(anyfVar2)) {
            anwuVar = anwu.SHA384;
        } else if (anyf.c.equals(anyfVar2)) {
            anwuVar = anwu.SHA512;
        } else {
            throw new GeneralSecurityException("Unable to serialize HashType ".concat(anyfVar2.d));
        }
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((anwg) createBuilder.b).b = anwuVar.a();
        anye anyeVar = anyiVar.f;
        if (anye.a.equals(anyeVar)) {
            anwsVar = anws.NIST_P256;
        } else if (anye.b.equals(anyeVar)) {
            anwsVar = anws.NIST_P384;
        } else if (anye.c.equals(anyeVar)) {
            anwsVar = anws.NIST_P521;
        } else {
            throw new GeneralSecurityException("Unable to serialize CurveType ".concat(anyeVar.d));
        }
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((anwg) createBuilder.b).c = anwsVar.a();
        anyg anygVar = anyiVar.e;
        if (anyg.a.equals(anygVar)) {
            i = 3;
        } else if (anyg.b.equals(anygVar)) {
            i = 4;
        } else {
            throw new GeneralSecurityException("Unable to serialize SignatureEncoding ".concat(anygVar.c));
        }
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((anwg) createBuilder.b).d = a.an(i);
        return (anwg) createBuilder.s();
    }

    public static anwi c(anyk anykVar) {
        int a2 = a(anykVar.e.f);
        aozy createBuilder = anwi.a.createBuilder();
        anwg b2 = b(anykVar.e);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ECPoint eCPoint = anykVar.f;
        anwi anwiVar = (anwi) createBuilder.b;
        b2.getClass();
        anwiVar.d = b2;
        anwiVar.b |= 1;
        aozb w = aozb.w(anme.x(eCPoint.getAffineX(), a2));
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((anwi) createBuilder.b).e = w;
        aozb w2 = aozb.w(anme.x(eCPoint.getAffineY(), a2));
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((anwi) createBuilder.b).f = w2;
        return (anwi) createBuilder.s();
    }

    public static anxp d(anyh anyhVar) {
        if (anyh.a.equals(anyhVar)) {
            return anxp.TINK;
        }
        if (anyh.b.equals(anyhVar)) {
            return anxp.CRUNCHY;
        }
        if (anyh.d.equals(anyhVar)) {
            return anxp.RAW;
        }
        if (anyh.c.equals(anyhVar)) {
            return anxp.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(anyhVar.e));
    }

    public static anye e(anws anwsVar) {
        int ordinal = anwsVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return anye.c;
                }
                throw new GeneralSecurityException("Unable to parse EllipticCurveType: " + anwsVar.a());
            }
            return anye.b;
        }
        return anye.a;
    }

    public static anyf f(anwu anwuVar) {
        int ordinal = anwuVar.ordinal();
        if (ordinal != 2) {
            if (ordinal != 3) {
                if (ordinal == 4) {
                    return anyf.c;
                }
                throw new GeneralSecurityException("Unable to parse HashType: " + anwuVar.a());
            }
            return anyf.a;
        }
        return anyf.b;
    }

    public static anyh g(anxp anxpVar) {
        int ordinal = anxpVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal == 4) {
                        return anyh.b;
                    }
                    throw new GeneralSecurityException(hht.i(anxpVar, "Unable to parse OutputPrefixType: "));
                }
                return anyh.d;
            }
            return anyh.c;
        }
        return anyh.a;
    }

    public static anyg h(int i) {
        int i2 = i - 2;
        if (i2 != 1) {
            if (i2 == 2) {
                return anyg.b;
            }
            throw new GeneralSecurityException("Unable to parse EcdsaSignatureEncoding: " + a.an(i));
        }
        return anyg.a;
    }
}
