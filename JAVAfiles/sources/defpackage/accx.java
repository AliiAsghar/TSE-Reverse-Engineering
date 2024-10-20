package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.TimeUnit;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class accx {
    private static final long a = TimeUnit.DAYS.toMillis(7);

    public static algw a(String str, String str2, aegu aeguVar) {
        byte[] bytes = String.valueOf(str).concat(String.valueOf(str2)).getBytes(StandardCharsets.UTF_8);
        try {
            long j = ByteBuffer.wrap(b(bytes, 0L)).getLong() >>> 1;
            return algw.i(b(bytes, (aeguVar.f().toEpochMilli() + ((int) (j % r2))) / a));
        } catch (InvalidKeyException | NoSuchAlgorithmException unused) {
            return alfd.a;
        }
    }

    private static byte[] b(byte[] bArr, long j) {
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(new SecretKeySpec(bArr, "HmacSHA256"));
        return mac.doFinal(albo.cn(j));
    }
}
