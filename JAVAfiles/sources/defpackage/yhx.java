package defpackage;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.LocaleList;
import android.os.UserManager;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yhx {
    public static final boolean a;
    public static final boolean b;
    public static final boolean c;
    public static final boolean d;
    public static final boolean e;
    public static final boolean f;
    public static final boolean g;
    public static final boolean h;
    public static final boolean i;
    static final AtomicReference n;
    static final AtomicInteger j = new AtomicInteger(0);
    private static final AtomicInteger o = new AtomicInteger(0);
    private static final AtomicInteger p = new AtomicInteger(0);
    public static final AtomicInteger k = new AtomicInteger(0);
    public static final AtomicBoolean l = new AtomicBoolean(false);
    public static final AtomicReference m = new AtomicReference(null);

    static {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9 = false;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 27) {
            z = true;
        } else {
            z = false;
        }
        a = z;
        if (i2 >= 28) {
            z2 = true;
        } else {
            z2 = false;
        }
        b = z2;
        if (i2 >= 29) {
            z3 = true;
        } else {
            z3 = false;
        }
        c = z3;
        if (i2 >= 30) {
            z4 = true;
        } else {
            z4 = false;
        }
        d = z4;
        if (i2 >= 31) {
            z5 = true;
        } else {
            z5 = false;
        }
        e = z5;
        if (i2 >= 33) {
            z6 = true;
        } else {
            z6 = false;
        }
        f = z6;
        if (i2 == 33) {
            z7 = true;
        } else {
            z7 = false;
        }
        g = z7;
        if (i2 >= 34) {
            z8 = true;
        } else {
            z8 = false;
        }
        h = z8;
        if (Build.VERSION.CODENAME.charAt(0) == 'V' || i2 >= 35) {
            z9 = true;
        }
        i = z9;
        n = new AtomicReference();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(android.content.Context r4) {
        /*
            java.util.concurrent.atomic.AtomicReference r0 = defpackage.yhx.n     // Catch: java.lang.Throwable -> L6e java.lang.RuntimeException -> L73
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L6e java.lang.RuntimeException -> L73
            yyb r0 = (defpackage.yyb) r0     // Catch: java.lang.Throwable -> L6e java.lang.RuntimeException -> L73
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L6e java.lang.RuntimeException -> L73
            r1 = 28
            if (r0 < r1) goto L21
            java.lang.String r0 = defpackage.cok$$ExternalSyntheticApiModelOutline0.m144m()     // Catch: java.lang.Throwable -> L6e java.lang.RuntimeException -> L73
            boolean r1 = defpackage.albo.ah(r0)     // Catch: java.lang.Throwable -> L6e java.lang.RuntimeException -> L73
            if (r1 != 0) goto L19
            goto L3a
        L19:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L6e java.lang.RuntimeException -> L73
            java.lang.String r1 = "Application.getProcessName() returned Null or empty string"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L6e java.lang.RuntimeException -> L73
            throw r0     // Catch: java.lang.Throwable -> L6e java.lang.RuntimeException -> L73
        L21:
            java.lang.String r0 = "android.app.ActivityThread"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L65 java.lang.Throwable -> L6e java.lang.RuntimeException -> L73
            java.lang.String r1 = "currentProcessName"
            r2 = 0
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L5c java.lang.Throwable -> L6e java.lang.RuntimeException -> L73
            java.lang.Object r0 = r0.invoke(r2, r2)     // Catch: java.lang.IllegalAccessException -> L51 java.lang.reflect.InvocationTargetException -> L53 java.lang.Throwable -> L6e java.lang.RuntimeException -> L73
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.IllegalAccessException -> L51 java.lang.reflect.InvocationTargetException -> L53 java.lang.Throwable -> L6e java.lang.RuntimeException -> L73
            boolean r1 = defpackage.albo.ah(r0)     // Catch: java.lang.Throwable -> L6e java.lang.RuntimeException -> L73
            if (r1 != 0) goto L49
        L3a:
            boolean r1 = defpackage.albo.ah(r0)     // Catch: java.lang.Throwable -> L6e java.lang.RuntimeException -> L73
            if (r1 != 0) goto L41
            return r0
        L41:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L6e java.lang.RuntimeException -> L73
            java.lang.String r1 = "getProcessNameFromInProcessData returned null or empty string"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L6e java.lang.RuntimeException -> L73
            throw r0     // Catch: java.lang.Throwable -> L6e java.lang.RuntimeException -> L73
        L49:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L6e java.lang.RuntimeException -> L73
            java.lang.String r1 = "currentProcessName (via reflection) returned Null or empty string"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L6e java.lang.RuntimeException -> L73
            throw r0     // Catch: java.lang.Throwable -> L6e java.lang.RuntimeException -> L73
        L51:
            r0 = move-exception
            goto L54
        L53:
            r0 = move-exception
        L54:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L6e java.lang.RuntimeException -> L73
            java.lang.String r2 = "invokeCurrentProcessName"
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L6e java.lang.RuntimeException -> L73
            throw r1     // Catch: java.lang.Throwable -> L6e java.lang.RuntimeException -> L73
        L5c:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L6e java.lang.RuntimeException -> L73
            java.lang.String r2 = "getCurrentProcessNameMethod"
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L6e java.lang.RuntimeException -> L73
            throw r1     // Catch: java.lang.Throwable -> L6e java.lang.RuntimeException -> L73
        L65:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L6e java.lang.RuntimeException -> L73
            java.lang.String r2 = "getActivityThreadClass"
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L6e java.lang.RuntimeException -> L73
            throw r1     // Catch: java.lang.Throwable -> L6e java.lang.RuntimeException -> L73
        L6e:
            r0 = move-exception
            i(r0)
            goto L77
        L73:
            r0 = move-exception
            i(r0)
        L77:
            java.util.concurrent.atomic.AtomicBoolean r0 = defpackage.yhx.l
            r1 = 1
            r0.set(r1)
            java.util.concurrent.atomic.AtomicReference r0 = defpackage.yhx.n
            java.lang.Object r0 = r0.get()
            yyb r0 = (defpackage.yyb) r0
            java.lang.String r0 = "activity"
            java.lang.Object r4 = r4.getSystemService(r0)
            android.app.ActivityManager r4 = (android.app.ActivityManager) r4
            r4.getClass()
            java.util.List r4 = r4.getRunningAppProcesses()
            java.lang.String r0 = ""
            if (r4 != 0) goto L99
            goto Lb5
        L99:
            int r1 = android.os.Process.myPid()
            java.util.Iterator r4 = r4.iterator()
        La1:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto Lb5
            java.lang.Object r2 = r4.next()
            android.app.ActivityManager$RunningAppProcessInfo r2 = (android.app.ActivityManager.RunningAppProcessInfo) r2
            if (r2 == 0) goto La1
            int r3 = r2.pid
            if (r3 != r1) goto La1
            java.lang.String r0 = r2.processName
        Lb5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yhx.a(android.content.Context):java.lang.String");
    }

    public static Locale b(Context context) {
        LocaleList locales;
        int size;
        Locale locale;
        locales = context.getResources().getConfiguration().getLocales();
        size = locales.size();
        if (size <= 0) {
            return Locale.getDefault();
        }
        locale = locales.get(0);
        return locale;
    }

    public static void c(Context context) {
        context.startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:".concat(String.valueOf(context.getPackageName())))));
    }

    public static boolean d(Activity activity, boolean z) {
        boolean isInMultiWindowMode;
        isInMultiWindowMode = activity.isInMultiWindowMode();
        if (isInMultiWindowMode && !z) {
            return true;
        }
        return false;
    }

    public static boolean e(Context context) {
        AtomicInteger atomicInteger = o;
        int i2 = 1;
        if (atomicInteger.get() != 0) {
            if (atomicInteger.get() != 1) {
                return false;
            }
            return true;
        }
        Object systemService = context.getSystemService("activity");
        if (systemService == null) {
            return false;
        }
        boolean isLowRamDevice = ((ActivityManager) systemService).isLowRamDevice();
        if (true != isLowRamDevice) {
            i2 = 2;
        }
        atomicInteger.set(i2);
        return isLowRamDevice;
    }

    public static boolean f(Context context) {
        AtomicInteger atomicInteger = j;
        int i2 = atomicInteger.get();
        int i3 = 1;
        if (i2 != 0) {
            if (i2 == 1) {
                return true;
            }
            return false;
        }
        boolean equals = a(context).equals(context.getPackageName());
        if (true != equals) {
            i3 = 2;
        }
        atomicInteger.set(i3);
        return equals;
    }

    public static boolean g(Context context) {
        yib yibVar;
        AtomicInteger atomicInteger = p;
        boolean z = false;
        int i2 = 1;
        if (atomicInteger.get() != 0) {
            if (atomicInteger.get() != 1) {
                return false;
            }
            return true;
        }
        if (!"Nexus 10".equals(Build.MODEL)) {
            if (Build.VERSION.SDK_INT >= 34 && context.checkSelfPermission("android.permission.QUERY_USERS") == 0) {
                yibVar = new yib(context, 1, null);
            } else {
                yibVar = new yib(context, 0);
            }
            z = !yibVar.a();
        }
        if (true != z) {
            i2 = 2;
        }
        atomicInteger.set(i2);
        return z;
    }

    public static boolean h(Context context) {
        UserManager userManager = (UserManager) context.getSystemService("user");
        userManager.getClass();
        if (!userManager.hasUserRestriction("no_sms")) {
            return true;
        }
        return false;
    }

    private static void i(Throwable th) {
        a.bE(m, th);
    }
}
