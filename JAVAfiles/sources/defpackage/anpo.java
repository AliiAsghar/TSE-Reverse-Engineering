package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anpo {
    public static final antv a;
    public static final antv b;
    public static final antv c;
    public static final antv d;
    private static final aocj e;

    static {
        aocj b2 = anuk.b("type.googleapis.com/google.crypto.tink.AesEaxKey");
        e = b2;
        a = new antv(annz.class, anub.class, new anoy(3));
        b = new antv(b2, anub.class, new anoz(3));
        c = new antv(annv.class, anua.class, new anpa(3));
        d = new antv(b2, anua.class, new anpb(3));
    }

    public static anny a(anxp anxpVar) {
        int ordinal = anxpVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        throw new GeneralSecurityException(hht.i(anxpVar, "Unable to parse OutputPrefixType: "));
                    }
                } else {
                    return anny.c;
                }
            }
            return anny.b;
        }
        return anny.a;
    }

    public static anvs b(annz annzVar) {
        int i = annzVar.g;
        aozy createBuilder = anvs.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((anvs) createBuilder.b).b = annzVar.f;
        return (anvs) createBuilder.s();
    }

    public static anxp c(anny annyVar) {
        if (anny.a.equals(annyVar)) {
            return anxp.TINK;
        }
        if (anny.b.equals(annyVar)) {
            return anxp.CRUNCHY;
        }
        if (anny.c.equals(annyVar)) {
            return anxp.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(String.valueOf(annyVar))));
    }
}
