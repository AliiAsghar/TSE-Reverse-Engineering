package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adjx {
    public static final /* synthetic */ int a = 0;
    private static final byte[] b = {59, 34, -125, 20, 30, -8, -116, 102, -13, 115, -70, 63, 119, 104, 0, -18, 52, 85, -66, -92, -39, -4, 42, 48, -105, -63, -54, -27, -100, 81, 17, -8};

    public static String a(Context context) {
        long b2 = acmd.b(context.getContentResolver(), "android_id", 0L);
        if (b2 == 0) {
            return "";
        }
        return String.valueOf(b2);
    }

    public static Cipher b(int i, String str) {
        byte[] bArr;
        if (TextUtils.isEmpty(str)) {
            bArr = b;
        } else {
            byte[] bytes = str.getBytes();
            byte[] bArr2 = new byte[32];
            System.arraycopy(b, 0, bArr2, 0, 32);
            for (int i2 = 0; i2 < 32 && i2 < bytes.length; i2++) {
                bArr2[i2] = (byte) (bArr2[i2] + bytes[i2]);
            }
            bArr = bArr2;
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES/CBC/PKCS5Padding");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(Arrays.copyOfRange(bArr, 0, 16));
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(i, secretKeySpec, ivParameterSpec);
        return cipher;
    }
}
