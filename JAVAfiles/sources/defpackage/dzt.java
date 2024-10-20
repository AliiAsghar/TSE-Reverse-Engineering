package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dzt {
    public static String b;
    private static dzs f;
    public final NotificationManager d;
    private final Context g;
    public static final Object a = new Object();
    public static Set c = new HashSet();
    private static final Object e = new Object();

    public dzt(Context context) {
        this.g = context;
        this.d = (NotificationManager) context.getSystemService("notification");
    }

    public final NotificationChannel a(String str) {
        NotificationChannel notificationChannel;
        notificationChannel = this.d.getNotificationChannel(str);
        return notificationChannel;
    }

    public final NotificationChannel b(String str, String str2) {
        NotificationChannel notificationChannel;
        if (Build.VERSION.SDK_INT < 30) {
            return a(str);
        }
        notificationChannel = this.d.getNotificationChannel(str, str2);
        return notificationChannel;
    }

    public final void c(String str, int i) {
        this.d.cancel(str, i);
    }

    public final void d(NotificationChannelGroup notificationChannelGroup) {
        this.d.createNotificationChannelGroup(notificationChannelGroup);
    }

    public final void e(int i, Notification notification) {
        f(null, i, notification);
    }

    public final void f(String str, int i, Notification notification) {
        Bundle bundle = notification.extras;
        if (bundle != null && bundle.getBoolean("android.support.useSideChannel")) {
            dzq dzqVar = new dzq(this.g.getPackageName(), i, str, notification);
            synchronized (e) {
                if (f == null) {
                    f = new dzs(this.g.getApplicationContext());
                }
                f.a.obtainMessage(0, dzqVar).sendToTarget();
            }
            this.d.cancel(str, i);
            return;
        }
        this.d.notify(str, i, notification);
    }

    public final boolean g() {
        boolean areNotificationsEnabled;
        areNotificationsEnabled = this.d.areNotificationsEnabled();
        return areNotificationsEnabled;
    }
}
