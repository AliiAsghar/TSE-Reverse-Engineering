package defpackage;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eub {
    private static final Object a = new Object();
    private static final eua b = eua.a;

    public static String a(String str, Throwable th) {
        String replace;
        if (th == null) {
            replace = null;
        } else {
            synchronized (a) {
                Throwable th2 = th;
                while (true) {
                    if (th2 != null) {
                        if (th2 instanceof UnknownHostException) {
                            replace = "UnknownHostException (no network)";
                            break;
                        }
                        th2 = th2.getCause();
                    } else {
                        replace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                        break;
                    }
                }
            }
        }
        if (!TextUtils.isEmpty(replace)) {
            return str + "\n  " + replace.replace("\n", "\n  ") + "\n";
        }
        return str;
    }

    public static void b(String str, String str2) {
        synchronized (a) {
            b.a(str, str2, null);
        }
    }

    public static void c(String str, String str2) {
        synchronized (a) {
            b.b(str, str2, null);
        }
    }

    public static void d(String str, String str2, Throwable th) {
        synchronized (a) {
            b.b(str, str2, th);
        }
    }

    public static void e(String str, String str2) {
        synchronized (a) {
            Log.i(str, a(str2, null));
        }
    }

    public static void f(String str, String str2) {
        synchronized (a) {
            b.c(str, str2, null);
        }
    }

    public static void g(String str, String str2, Throwable th) {
        synchronized (a) {
            b.c(str, str2, th);
        }
    }

    public static void h(Throwable th) {
        synchronized (a) {
            b.a("DefaultCodec", "MediaCodec error", th);
        }
    }
}
