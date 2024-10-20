package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anva {
    public static final antv a;
    public static final antv b;
    public static final antv c;
    public static final antv d;
    private static final aocj e;

    static {
        aocj b2 = anuk.b("type.googleapis.com/google.crypto.tink.AesCmacKey");
        e = b2;
        a = new antv(anuo.class, anub.class, new anoy(12));
        b = new antv(b2, anub.class, new anoz(12));
        c = new antv(anul.class, anua.class, new anpa(15));
        d = new antv(b2, anua.class, new anpb(14));
    }

    public static anun a(anxp anxpVar) {
        int ordinal = anxpVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal == 4) {
                        return anun.b;
                    }
                    throw new GeneralSecurityException(hht.i(anxpVar, "Unable to parse OutputPrefixType: "));
                }
                return anun.d;
            }
            return anun.c;
        }
        return anun.a;
    }

    public static anvh b(anuo anuoVar) {
        aozy createBuilder = anvh.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((anvh) createBuilder.b).b = anuoVar.f;
        return (anvh) createBuilder.s();
    }

    public static anxp c(anun anunVar) {
        if (anun.a.equals(anunVar)) {
            return anxp.TINK;
        }
        if (anun.b.equals(anunVar)) {
            return anxp.CRUNCHY;
        }
        if (anun.d.equals(anunVar)) {
            return anxp.RAW;
        }
        if (anun.c.equals(anunVar)) {
            return anxp.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(String.valueOf(anunVar))));
    }
}
