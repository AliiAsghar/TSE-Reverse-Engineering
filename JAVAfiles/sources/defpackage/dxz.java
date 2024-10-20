package defpackage;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dxz extends egl {
    public static void a(Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            new Handler(activity.getMainLooper()).post(new ou(activity, 13, null));
        }
    }
}
