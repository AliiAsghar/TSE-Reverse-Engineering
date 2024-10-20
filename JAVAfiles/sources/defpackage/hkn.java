package defpackage;

import android.util.Log;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hkn {
    public static final String a = "Volley";
    public static final boolean b = Log.isLoggable(a, 2);
    private static final String c = hkn.class.getName();

    public static void a(String str, Object... objArr) {
        Log.d(a, e(str, objArr));
    }

    public static void b(String str, Object... objArr) {
        Log.e(a, e(str, objArr));
    }

    public static void c(Throwable th, String str, Object... objArr) {
        Log.e(a, e(str, objArr), th);
    }

    public static void d(String str, Object... objArr) {
        if (b) {
            Log.v(a, e(str, objArr));
        }
    }

    private static String e(String str, Object... objArr) {
        String str2;
        String format = String.format(Locale.US, str, objArr);
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i = 2;
        while (true) {
            if (i < stackTrace.length) {
                if (!stackTrace[i].getClassName().equals(c)) {
                    String className = stackTrace[i].getClassName();
                    String substring = className.substring(className.lastIndexOf(46) + 1);
                    str2 = substring.substring(substring.lastIndexOf(36) + 1) + "." + stackTrace[i].getMethodName();
                    break;
                }
                i++;
            } else {
                str2 = "<unknown>";
                break;
            }
        }
        return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), str2, format);
    }
}
