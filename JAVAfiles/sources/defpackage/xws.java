package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xws {
    public static final /* synthetic */ int a = 0;
    private static final alhr b = albo.D(new xyn(1));
    private static final AtomicReference c = new AtomicReference("");

    public static int a(Context context) {
        String[] e = e(context);
        if (e.length > 2) {
            try {
                return Integer.parseInt(e[2]);
            } catch (NumberFormatException unused) {
            }
        }
        return -1;
    }

    public static int b(Context context) {
        String[] e = e(context);
        if (e.length > 0) {
            try {
                return Integer.parseInt(e[0]);
            } catch (NumberFormatException unused) {
            }
        }
        return -1;
    }

    public static int c(Context context) {
        String[] e = e(context);
        if (e.length > 1) {
            try {
                return Integer.parseInt(e[1]);
            } catch (NumberFormatException unused) {
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String d(android.content.Context r3) {
        /*
            java.lang.String r0 = "unknown_app_version"
            java.util.concurrent.atomic.AtomicReference r1 = defpackage.xws.c
            java.lang.Object r1 = r1.get()
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L40
            java.lang.String r1 = r3.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2f
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2f
            r2 = 0
            android.content.pm.PackageInfo r3 = r3.getPackageInfo(r1, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2f
            java.lang.String r1 = r3.versionName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2f
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2f
            if (r1 == 0) goto L26
            goto L33
        L26:
            java.lang.String r3 = r3.versionName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2f
            java.util.Locale r1 = java.util.Locale.US     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2f
            java.lang.String r3 = r3.toLowerCase(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2f
            goto L34
        L2f:
            r3 = move-exception
            r3.printStackTrace()
        L33:
            r3 = r0
        L34:
            boolean r0 = android.text.TextUtils.equals(r0, r3)
            if (r0 != 0) goto L3f
            java.util.concurrent.atomic.AtomicReference r0 = defpackage.xws.c
            r0.set(r3)
        L3f:
            return r3
        L40:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xws.d(android.content.Context):java.lang.String");
    }

    private static String[] e(Context context) {
        String d = d(context);
        Matcher matcher = ((Pattern) b.get()).matcher(d);
        if (matcher.matches()) {
            return new String[]{matcher.group(1), matcher.group(2), matcher.group(3)};
        }
        return d.split("[\\. ]", -1);
    }
}
