package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anum {
    public static final antj a = new annw(13);
    public static final antv b = new antv(anul.class, anup.class, (antu) new annq(18));
    public static final antv c = new antv(anul.class, anne.class, (antu) new annq(19));
    public static final anmw d;

    static {
        anvf.a.getParserForType();
        d = new ante("type.googleapis.com/google.crypto.tink.AesCmacKey", anne.class, 3);
    }

    public static void a(anuo anuoVar) {
        if (anuoVar.e == 32) {
        } else {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }
}
