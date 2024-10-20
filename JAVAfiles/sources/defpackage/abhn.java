package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abhn {
    public static volatile aqux a;
    public static volatile aqux b;

    private abhn() {
    }

    public static egy a(Bundle bundle) {
        if (bundle.containsKey("authentication_result_type")) {
            return new egy(new egx(bundle.getInt("authentication_result_type")), null);
        }
        if (bundle.containsKey("authentication_error_code")) {
            return new egy(null, new egw(bundle.getInt("authentication_error_code"), bundle.getString("authentication_error_message")));
        }
        throw new IllegalArgumentException("Neither result or error is present in bundle.");
    }

    public static void b(StringBuilder sb, HashMap hashMap) {
        sb.append("{");
        boolean z = true;
        for (String str : hashMap.keySet()) {
            if (!z) {
                sb.append(",");
            }
            String str2 = (String) hashMap.get(str);
            sb.append("\"");
            sb.append(str);
            sb.append("\":");
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append("\"");
                sb.append(str2);
                sb.append("\"");
            }
            z = false;
        }
        sb.append("}");
    }

    public static int c(int i) {
        if (i == -1) {
            return -1;
        }
        return i / 1000;
    }

    public static void d(Context context) {
        try {
            abhg.m(context);
        } catch (Exception e) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e);
        }
    }

    public static String e(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 0);
    }

    public static String f(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 10);
    }

    public static String g(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }

    public static byte[] h(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 11);
    }
}
