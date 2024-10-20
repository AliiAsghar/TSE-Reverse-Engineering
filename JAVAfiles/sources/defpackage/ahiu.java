package defpackage;

import android.util.Log;
import java.util.Locale;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahiu {
    static {
        new Random();
    }

    public static String a(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static void b(String str) {
        if (Log.isLoggable("MDD", 3)) {
            Log.d("MDD", a(str, "MDD Foreground Download Service"));
        }
    }

    public static void c(String str, Object obj, Object obj2) {
        if (Log.isLoggable("MDD", 3)) {
            Log.d("MDD", a(str, obj, obj2));
        }
    }

    public static void d(Throwable th, String str, Object... objArr) {
        if (Log.isLoggable("MDD", 3)) {
            Log.d("MDD", a(str, objArr), th);
        }
    }

    public static void e(Throwable th, String str, Object... objArr) {
        if (Log.isLoggable("MDD", 6)) {
            String a = a(str, objArr);
            if (Log.isLoggable("MDD", 6)) {
                if (Log.isLoggable("MDD", 3)) {
                    Log.e("MDD", a, th);
                    return;
                }
                Log.e("MDD", a + ": " + String.valueOf(th));
            }
        }
    }

    public static void f(String str, Object obj, Object obj2) {
        if (Log.isLoggable("MDD", 2)) {
            Log.v("MDD", a(str, obj, obj2));
        }
    }

    public static void g(Object... objArr) {
        if (Log.isLoggable("MDD", 2)) {
            Log.v("MDD", a("%s: Received data for uri = %s, len = %d, Counter = %d", objArr));
        }
    }
}
