package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Looper;
import android.os.StrictMode;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abvk {
    private static Context a;
    private static Boolean b;

    public static StrictMode.VmPolicy.Builder a(StrictMode.VmPolicy.Builder builder) {
        StrictMode.VmPolicy.Builder permitUnsafeIntentLaunch;
        permitUnsafeIntentLaunch = builder.permitUnsafeIntentLaunch();
        return permitUnsafeIntentLaunch;
    }

    public static boolean b() {
        if (Build.VERSION.SDK_INT >= 28) {
            return true;
        }
        return false;
    }

    public static boolean c() {
        if (Build.VERSION.SDK_INT >= 29) {
            return true;
        }
        return false;
    }

    public static boolean d() {
        if (Build.VERSION.SDK_INT >= 33) {
            return true;
        }
        return false;
    }

    public static boolean e() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return true;
        }
        return false;
    }

    public static boolean f(File file) {
        File[] listFiles;
        if (!file.exists()) {
            return true;
        }
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                f(file2);
            }
        }
        return file.delete();
    }

    public static File g(Context context) {
        return context.getDir("dg_cache", 0);
    }

    public static void h(File file, File file2) {
        if (file.renameTo(file2)) {
            return;
        }
        throw new abwe("Failed to rename " + String.valueOf(file) + " -> " + String.valueOf(file2) + ".");
    }

    public static final void i(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            if (!f(file)) {
                Log.e("DG", hht.b(file, "Failed to clean up temporary file ", "."));
            }
        }
        list.clear();
    }

    public static synchronized boolean j(Context context) {
        boolean isInstantApp;
        Boolean bool;
        synchronized (abvk.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = a;
            if (context2 != null && (bool = b) != null && context2 == applicationContext) {
                return bool.booleanValue();
            }
            b = null;
            isInstantApp = applicationContext.getPackageManager().isInstantApp();
            Boolean valueOf = Boolean.valueOf(isInstantApp);
            b = valueOf;
            a = applicationContext;
            return valueOf.booleanValue();
        }
    }

    public static boolean k(Context context, int i) {
        if (!l(context, i, "com.google.android.gms")) {
            return false;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
            abqq c = abqq.c(context);
            if (packageInfo == null) {
                return false;
            }
            if (!abqq.f(packageInfo, false)) {
                if (!abqq.f(packageInfo, true)) {
                    return false;
                }
                if (!abqp.d(c.a)) {
                    Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                    return false;
                }
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            if (Log.isLoggable("UidVerifier", 3)) {
                Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
            }
            return false;
        }
    }

    public static boolean l(Context context, int i, String str) {
        try {
            AppOpsManager appOpsManager = (AppOpsManager) ((Context) abvn.b(context).a).getSystemService("appops");
            if (appOpsManager != null) {
                appOpsManager.checkPackage(i, str);
                return true;
            }
            throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
        } catch (SecurityException unused) {
            return false;
        }
    }

    public static final void m(addy addyVar) {
        Object obj = addyVar.c;
        try {
            if (!((File) obj).exists() && !((File) obj).createNewFile()) {
                throw new abwe(a.bX(addyVar, "Failed to touch last-used file for ", "."));
            }
            if (((File) obj).setLastModified(System.currentTimeMillis())) {
            } else {
                throw new abwe(a.bX(addyVar, "Failed to update last-used timestamp for ", "."));
            }
        } catch (IOException e) {
            throw new abwe(a.bY(e, addyVar, "Failed to touch last-used file for ", ": "));
        }
    }

    public static final addy n(Context context, List list) {
        return p("tmp_".concat(String.valueOf(UUID.randomUUID().toString())), context);
    }

    public static final addy o(abwi abwiVar, Context context, List list) {
        addy p = p(abwiVar.a, context);
        if (!p.f()) {
            return null;
        }
        m(p);
        return p;
    }

    public static final addy p(String str, Context context) {
        abmt abmtVar = accg.a;
        File file = new File(abmt.f(g(context), str));
        acak acakVar = new acak(file, "the.apk");
        abmt abmtVar2 = accg.a;
        File file2 = new File(abmt.f(file, "opt"));
        abmt abmtVar3 = accg.a;
        return new addy(acakVar, file2, new File(abmt.f(file, "t")));
    }
}
