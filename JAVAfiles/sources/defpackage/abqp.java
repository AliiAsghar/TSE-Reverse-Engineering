package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abqp {
    static boolean a = false;
    public static final /* synthetic */ int c = 0;
    private static boolean d = false;

    @Deprecated
    static final AtomicBoolean b = new AtomicBoolean();
    private static final AtomicBoolean e = new AtomicBoolean();

    /* JADX WARN: Removed duplicated region for block: B:53:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00be A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int a(android.content.Context r9, int r10) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abqp.a(android.content.Context, int):int");
    }

    public static Context b(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Deprecated
    public static void c(Context context, int i) {
        int h = abqb.d.h(context, i);
        if (h != 0) {
            Intent i2 = abqb.d.i(context, h, "e");
            Log.e("GooglePlayServicesUtil", a.bV(h, "GooglePlayServices not available due to error "));
            if (i2 == null) {
                throw new abqn(h);
            }
            throw new abqo(h, "Google Play Services not available", i2);
        }
    }

    public static boolean d(Context context) {
        try {
            if (!a) {
                PackageInfo e2 = abvn.b(context).e("com.google.android.gms", 64);
                abqq.c(context);
                if (e2 != null && !abqq.f(e2, false) && abqq.f(e2, true)) {
                    d = true;
                } else {
                    d = false;
                }
            }
        } catch (PackageManager.NameNotFoundException e3) {
            Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e3);
        } finally {
            a = true;
        }
        if (!d && "user".equals(Build.TYPE)) {
            return false;
        }
        return true;
    }

    @Deprecated
    public static boolean e(Context context, int i) {
        if (i == 1) {
            return g(context);
        }
        return false;
    }

    @Deprecated
    public static boolean f(int i) {
        if (i == 1 || i == 2 || i == 3 || i == 9) {
            return true;
        }
        return false;
    }

    public static boolean g(Context context) {
        try {
            Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            while (it.hasNext()) {
                if ("com.google.android.gms".equals(it.next().getAppPackageName())) {
                    return true;
                }
            }
            return context.getPackageManager().getApplicationInfo("com.google.android.gms", 8192).enabled;
        } catch (PackageManager.NameNotFoundException | Exception unused) {
            return false;
        }
    }
}
