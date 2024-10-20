package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anps {
    public static final antv a;
    public static final antv b;
    public static final antv c;
    public static final antv d;
    private static final aocj e;

    static {
        aocj b2 = anuk.b("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        e = b2;
        a = new antv(anoi.class, anub.class, new anoy(5));
        b = new antv(b2, anub.class, new anoz(5));
        c = new antv(anof.class, anua.class, new anpa(5));
        d = new antv(b2, anua.class, new anpb(5));
    }

    public static anoh a(anxp anxpVar) {
        int ordinal = anxpVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        throw new GeneralSecurityException(hht.i(anxpVar, "Unable to parse OutputPrefixType: "));
                    }
                } else {
                    return anoh.c;
                }
            }
            return anoh.b;
        }
        return anoh.a;
    }

    public static anxp b(anoh anohVar) {
        if (anoh.a.equals(anohVar)) {
            return anxp.TINK;
        }
        if (anoh.b.equals(anohVar)) {
            return anxp.CRUNCHY;
        }
        if (anoh.c.equals(anohVar)) {
            return anxp.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(String.valueOf(anohVar))));
    }
}
