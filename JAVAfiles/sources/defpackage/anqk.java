package defpackage;

import java.security.InvalidAlgorithmParameterException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anqk {
    public static final antv a = new antv(anqj.class, anmt.class, (antu) new annq(10));
    public static final anmw b;
    public static final antl c;
    public static final antj d;

    static {
        anwa.a.getParserForType();
        b = new ante("type.googleapis.com/google.crypto.tink.AesSivKey", anmt.class, 3);
        c = new anob();
        d = new annw(9);
    }

    public static void a(anqm anqmVar) {
        int i = anqmVar.e;
        if (i == 64) {
        } else {
            throw new InvalidAlgorithmParameterException(a.cb(i, "invalid key size: ", ". Valid keys must have 64 bytes."));
        }
    }
}
