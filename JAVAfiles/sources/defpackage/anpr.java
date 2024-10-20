package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anpr {
    public static final antv a;
    public static final antv b;
    public static final antv c;
    public static final antv d;
    private static final aocj e;

    static {
        aocj b2 = anuk.b("type.googleapis.com/google.crypto.tink.AesGcmKey");
        e = b2;
        a = new antv(anoe.class, anub.class, new anoy(4));
        b = new antv(b2, anub.class, new anoz(4));
        c = new antv(anoa.class, anua.class, new anpa(4));
        d = new antv(b2, anua.class, new anpb(4));
    }

    public static anod a(anxp anxpVar) {
        int ordinal = anxpVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        throw new GeneralSecurityException(hht.i(anxpVar, "Unable to parse OutputPrefixType: "));
                    }
                } else {
                    return anod.c;
                }
            }
            return anod.b;
        }
        return anod.a;
    }

    public static anxp b(anod anodVar) {
        if (anod.a.equals(anodVar)) {
            return anxp.TINK;
        }
        if (anod.b.equals(anodVar)) {
            return anxp.CRUNCHY;
        }
        if (anod.c.equals(anodVar)) {
            return anxp.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(String.valueOf(anodVar))));
    }

    public static void c(anoe anoeVar) {
        int i = anoeVar.g;
        int i2 = anoeVar.f;
    }
}
