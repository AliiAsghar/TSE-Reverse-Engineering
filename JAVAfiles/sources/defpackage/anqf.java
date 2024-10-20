package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anqf {
    public static final antv a;
    public static final antv b;
    public static final antv c;
    public static final antv d;
    private static final aocj e;

    static {
        aocj b2 = anuk.b("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        e = b2;
        a = new antv(anpm.class, anub.class, new anoy(8));
        b = new antv(b2, anub.class, new anoz(8));
        c = new antv(anpj.class, anua.class, new anpa(8));
        d = new antv(b2, anua.class, new anpb(8));
    }

    public static anpl a(anxp anxpVar) {
        int ordinal = anxpVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        throw new GeneralSecurityException(hht.i(anxpVar, "Unable to parse OutputPrefixType: "));
                    }
                } else {
                    return anpl.c;
                }
            }
            return anpl.b;
        }
        return anpl.a;
    }

    public static anxp b(anpl anplVar) {
        if (anpl.a.equals(anplVar)) {
            return anxp.TINK;
        }
        if (anpl.b.equals(anplVar)) {
            return anxp.CRUNCHY;
        }
        if (anpl.c.equals(anplVar)) {
            return anxp.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(anplVar.d));
    }
}
