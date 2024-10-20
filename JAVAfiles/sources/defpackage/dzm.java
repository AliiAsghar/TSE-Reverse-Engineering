package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Icon;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dzm {
    public static Notification.Action.Builder c(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
        return new Notification.Action.Builder(icon, charSequence, pendingIntent);
    }

    public static ews d(exs exsVar, Context context, boolean z) {
        return exa.m(context, alog.r(exsVar), alsx.a, z);
    }

    public static boolean f(float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[1];
        if (f != f2 || f2 != fArr[2]) {
            return false;
        }
        return true;
    }

    public static float[] g(float[] fArr) {
        return new float[]{(float) Math.log(fArr[0]), (float) Math.log(fArr[1]), (float) Math.log(fArr[2])};
    }

    public void a(int i) {
    }

    public void b(Typeface typeface) {
    }
}
