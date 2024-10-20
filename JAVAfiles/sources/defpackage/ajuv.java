package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajuv {
    private static final String e = "ajuv";
    public final String a;
    public final String b;
    public final int c;
    public final Resources d;

    public ajuv(String str, String str2, int i, Resources resources) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = resources;
    }

    public static ajuv a(Context context, Bundle bundle) {
        if (bundle.containsKey("packageName") && bundle.containsKey("resourceName") && bundle.containsKey("resourceId")) {
            String string = bundle.getString("packageName");
            String string2 = bundle.getString("resourceName");
            int i = bundle.getInt("resourceId");
            try {
                PackageManager packageManager = context.getPackageManager();
                return new ajuv(string, string2, i, packageManager.getResourcesForApplication(packageManager.getApplicationInfo(string, 512)));
            } catch (PackageManager.NameNotFoundException unused) {
                Bundle bundle2 = bundle.getBundle("fallbackConfig");
                if (bundle2 != null) {
                    Log.w(e, string + " not found, " + string2 + " fallback to default value");
                    return a(context, bundle2);
                }
            }
        }
        return null;
    }
}
