package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class leg {
    public static final xze a = xze.g("Bugle", "GoogleLocationSettingHelper");
    public static final Uri b = Uri.parse("content://com.google.settings/partner");
    private static Boolean c = null;

    public static synchronized boolean a(Context context) {
        boolean booleanValue;
        boolean z;
        synchronized (leg.class) {
            if (c == null) {
                if (context.getPackageManager().resolveActivity(new Intent("com.google.android.gsf.GOOGLE_APPS_LOCATION_SETTINGS"), 65536) != null) {
                    z = true;
                } else {
                    z = false;
                }
                c = Boolean.valueOf(z);
            }
            booleanValue = c.booleanValue();
        }
        return booleanValue;
    }
}
