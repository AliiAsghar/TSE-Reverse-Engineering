package defpackage;

import java.security.GeneralSecurityException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anot {
    public static final antv a;
    public static final antv b;
    public static final antv c;
    public static final antv d;
    private static final aocj e;

    static {
        aocj b2 = anuk.b("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        e = b2;
        a = new antv(anos.class, anub.class, new anoy(1));
        b = new antv(b2, anub.class, new anoz(1));
        c = new antv(anoq.class, anua.class, new anpa(1));
        d = new antv(b2, anua.class, new anpb(1));
    }

    public static anor a(anxp anxpVar) {
        int ordinal = anxpVar.ordinal();
        if (ordinal != 1) {
            if (ordinal == 3) {
                return anor.b;
            }
            throw new GeneralSecurityException(hht.i(anxpVar, "Unable to parse OutputPrefixType: "));
        }
        return anor.a;
    }

    public static anxp b(anor anorVar) {
        if (anor.a.equals(anorVar)) {
            return anxp.TINK;
        }
        if (anor.b.equals(anorVar)) {
            return anxp.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(anorVar.c));
    }
}
