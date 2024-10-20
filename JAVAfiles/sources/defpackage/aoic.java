package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoic {
    public static final /* synthetic */ int a = 0;
    private static final AtomicInteger b = new AtomicInteger((int) SystemClock.elapsedRealtime());

    public static int a() {
        return b.incrementAndGet();
    }

    public static Integer b(Context context, String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
                Log.w("FirebaseMessaging", a.bW(str, "Color is invalid: ", ". Notification will use default color."));
            }
        }
        int i = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i != 0) {
            try {
                return Integer.valueOf(context.getColor(i));
            } catch (Resources.NotFoundException unused2) {
                Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
                return null;
            }
        }
        return null;
    }

    public static boolean c(Resources resources, int i) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!bl$$ExternalSyntheticApiModelOutline0.m107m((Object) resources.getDrawable(i, null))) {
                return true;
            }
            Log.e("FirebaseMessaging", a.bV(i, "Adaptive icons cannot be used in notifications. Ignoring icon id: "));
            return false;
        } catch (Resources.NotFoundException unused) {
            Log.e("FirebaseMessaging", a.cb(i, "Couldn't find resource ", ", treating it as an invalid icon"));
            return false;
        }
    }

    public static boolean d(aojh aojhVar) {
        return aojhVar.n("google.c.a.e");
    }
}
