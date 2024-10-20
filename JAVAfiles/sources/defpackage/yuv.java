package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yuv {
    private static final alvi c = alvi.m("com/google/android/apps/messaging/shared/util/version/VersionUtil");
    private static final Object d = new Object();
    private static yuv e;
    public final String a;
    public final int b;

    private yuv(Context context) {
        int i;
        int i2 = -1;
        try {
            PackageManager packageManager = context.getPackageManager();
            try {
                i = packageManager.getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e2) {
                xyl.p("couldn't get package info for Bugle package with name " + context.getPackageName(), e2);
                i = -1;
            }
            try {
                int i3 = packageManager.getPackageInfo("com.google.android.ims", 0).versionCode;
            } catch (PackageManager.NameNotFoundException e3) {
                alvw g = c.g();
                g.X(alwp.a, "BugleRcs");
                ((alvg) ((alvg) ((alvg) g).g(e3)).h("com/google/android/apps/messaging/shared/util/version/VersionUtil", "<init>", 73, "VersionUtil.java")).t("couldn't get package info for carrier services package with name %s", "com.google.android.ims");
            }
            i2 = i;
        } catch (NullPointerException e4) {
            alvw h = c.h();
            h.X(alwp.a, "BugleRcs");
            ((alvg) ((alvg) ((alvg) h).g(e4)).h("com/google/android/apps/messaging/shared/util/version/VersionUtil", "<init>", 'O', "VersionUtil.java")).q("found null pointer trying to get version info");
        }
        this.b = i2;
        int i4 = i2 / 1000;
        this.a = String.format(Locale.US, "%d.%d.%03d", Integer.valueOf(i4 / 10000), Integer.valueOf((i4 / 1000) % 10), Integer.valueOf(i4 % 1000));
    }

    public static yuv a(Context context) {
        synchronized (d) {
            if (e == null) {
                e = new yuv(context);
            }
        }
        return e;
    }

    public final String toString() {
        return this.a;
    }
}
