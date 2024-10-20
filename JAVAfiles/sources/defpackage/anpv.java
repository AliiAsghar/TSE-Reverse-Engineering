package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anpv {
    public static final antv a;
    public static final antv b;
    public static final antv c;
    public static final antv d;
    private static final aocj e;

    static {
        aocj b2 = anuk.b("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        e = b2;
        a = new antv(anom.class, anub.class, new anoy(6));
        b = new antv(b2, anub.class, new anoz(6));
        c = new antv(anoj.class, anua.class, new anpa(6));
        d = new antv(b2, anua.class, new anpb(6));
    }

    public static anol a(anxp anxpVar) {
        int ordinal = anxpVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        throw new GeneralSecurityException(hht.i(anxpVar, "Unable to parse OutputPrefixType: "));
                    }
                } else {
                    return anol.c;
                }
            }
            return anol.b;
        }
        return anol.a;
    }

    public static anxp b(anol anolVar) {
        if (anol.a.equals(anolVar)) {
            return anxp.TINK;
        }
        if (anol.b.equals(anolVar)) {
            return anxp.CRUNCHY;
        }
        if (anol.c.equals(anolVar)) {
            return anxp.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(anolVar.d));
    }
}
