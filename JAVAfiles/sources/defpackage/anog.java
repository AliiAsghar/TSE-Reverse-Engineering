package defpackage;

import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anog {
    public static final antv a = new antv(anof.class, anmr.class, (antu) new annq(4));
    public static final antj b = new annw(3);
    public static final antl c = new anob();
    public static final anmw d;

    static {
        anvy.a.getParserForType();
        d = new ante("type.googleapis.com/google.crypto.tink.AesGcmSivKey", anmr.class, 3);
    }

    public static boolean a() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }
}
