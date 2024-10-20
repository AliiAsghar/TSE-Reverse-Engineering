package defpackage;

import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahjl {
    private static final String a = "ahjl";

    public static InputStream a(String str) {
        d.s(b(str));
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            String substring = str.substring(indexOf + 1);
            String[] split = str.substring(5, indexOf).split(";");
            boolean z = false;
            for (int i = 1; i < split.length; i++) {
                String str2 = split[i];
                if (str2.equals("base64")) {
                    z = true;
                } else if (!str2.startsWith("charset=")) {
                    Log.e(a, a.cg(str, str2, "Unknown data-URI option '", "' in "));
                    throw new ahjk(2);
                }
            }
            if (z) {
                try {
                    byte[] decode = Base64.decode(substring, 0);
                    Log.i(a, "Successfully decoded data uri: ".concat(String.valueOf(str)));
                    return new ByteArrayInputStream(decode);
                } catch (IllegalArgumentException unused) {
                    Log.e(a, "Invalid base64 payload in data URI: ".concat(String.valueOf(str)));
                    throw new ahjk(4);
                }
            }
            Log.e(a, "We only understand base64-encoded data URIs: ".concat(String.valueOf(str)));
            throw new ahjk(3);
        }
        Log.e(a, "Comma not found in data URI: ".concat(String.valueOf(str)));
        throw new ahjk(1);
    }

    public static boolean b(String str) {
        return str.startsWith("data:");
    }
}
