package defpackage;

import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anpq {
    private static final ThreadLocal a = new anpp();

    public static AlgorithmParameterSpec a(byte[] bArr) {
        return b(bArr, 0, bArr.length);
    }

    public static AlgorithmParameterSpec b(byte[] bArr, int i, int i2) {
        Integer c = anuk.c();
        if (c != null) {
            c.intValue();
        }
        return new GCMParameterSpec(128, bArr, i, i2);
    }

    public static Cipher c() {
        return (Cipher) a.get();
    }

    public static SecretKey d(byte[] bArr) {
        aoci.a(bArr.length);
        return new SecretKeySpec(bArr, "AES");
    }
}
