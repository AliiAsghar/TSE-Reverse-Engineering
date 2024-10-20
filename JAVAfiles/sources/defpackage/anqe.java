package defpackage;

import j$.util.Objects;
import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anqe {
    public static final antv a;
    public static final antv b;
    public static final antv c;
    public static final antv d;
    private static final aocj e;

    static {
        aocj b2 = anuk.b("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        e = b2;
        a = new antv(anpi.class, anub.class, new anoy(7));
        b = new antv(b2, anub.class, new anoz(7));
        c = new antv(anpf.class, anua.class, new anpa(7));
        d = new antv(b2, anua.class, new anpb(7));
    }

    public static anph a(anxp anxpVar) {
        int ordinal = anxpVar.ordinal();
        if (ordinal != 1) {
            if (ordinal == 3) {
                return anph.b;
            }
            throw new GeneralSecurityException(hht.i(anxpVar, "Unable to parse OutputPrefixType: "));
        }
        return anph.a;
    }

    public static anxp b(anph anphVar) {
        if (Objects.equals(anphVar, anph.a)) {
            return anxp.TINK;
        }
        if (Objects.equals(anphVar, anph.b)) {
            return anxp.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(anphVar.c));
    }
}
