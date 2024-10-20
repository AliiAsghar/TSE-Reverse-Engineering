package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anpn {
    public static final antv a;
    public static final antv b;
    public static final antv c;
    public static final antv d;
    private static final aocj e;

    static {
        aocj b2 = anuk.b("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        e = b2;
        a = new antv(annu.class, anub.class, new anoy(2));
        b = new antv(b2, anub.class, new anoz(2));
        c = new antv(annp.class, anua.class, new anpa(2));
        d = new antv(b2, anua.class, new anpb(2));
    }

    public static anns a(anwu anwuVar) {
        int ordinal = anwuVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            return anns.b;
                        }
                        throw new GeneralSecurityException("Unable to parse HashType: " + anwuVar.a());
                    }
                    return anns.e;
                }
                return anns.c;
            }
            return anns.d;
        }
        return anns.a;
    }

    public static annt b(anxp anxpVar) {
        int ordinal = anxpVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        throw new GeneralSecurityException(hht.i(anxpVar, "Unable to parse OutputPrefixType: "));
                    }
                } else {
                    return annt.c;
                }
            }
            return annt.b;
        }
        return annt.a;
    }

    public static anwx c(annu annuVar) {
        anwu anwuVar;
        aozy createBuilder = anwx.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((anwx) createBuilder.b).c = annuVar.h;
        anns annsVar = annuVar.j;
        if (anns.a.equals(annsVar)) {
            anwuVar = anwu.SHA1;
        } else if (anns.b.equals(annsVar)) {
            anwuVar = anwu.SHA224;
        } else if (anns.c.equals(annsVar)) {
            anwuVar = anwu.SHA256;
        } else if (anns.d.equals(annsVar)) {
            anwuVar = anwu.SHA384;
        } else if (anns.e.equals(annsVar)) {
            anwuVar = anwu.SHA512;
        } else {
            throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(String.valueOf(annsVar))));
        }
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((anwx) createBuilder.b).b = anwuVar.a();
        return (anwx) createBuilder.s();
    }

    public static anxp d(annt anntVar) {
        if (annt.a.equals(anntVar)) {
            return anxp.TINK;
        }
        if (annt.b.equals(anntVar)) {
            return anxp.CRUNCHY;
        }
        if (annt.c.equals(anntVar)) {
            return anxp.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(String.valueOf(anntVar))));
    }
}
