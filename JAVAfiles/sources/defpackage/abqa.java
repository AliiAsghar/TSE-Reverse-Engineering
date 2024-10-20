package defpackage;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abqa extends abqb {
    private static final Object e = new Object();
    public static final abqa a = new abqa();
    public static final int b = abqb.c;

    public final Dialog a(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        return d(activity, i, new abud(i(activity, i, "d"), activity, i2), onCancelListener);
    }

    public final void b(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof cj) {
                da a2 = ((cj) activity).a();
                abqr abqrVar = new abqr();
                d.aC(dialog, "Cannot display null dialog");
                dialog.setOnCancelListener(null);
                dialog.setOnDismissListener(null);
                abqrVar.ag = dialog;
                if (onCancelListener != null) {
                    abqrVar.ah = onCancelListener;
                }
                abqrVar.p(a2, str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        abpy abpyVar = new abpy();
        d.aC(dialog, "Cannot display null dialog");
        dialog.setOnCancelListener(null);
        dialog.setOnDismissListener(null);
        abpyVar.a = dialog;
        if (onCancelListener != null) {
            abpyVar.b = onCancelListener;
        }
        abpyVar.show(fragmentManager, str);
    }

    public final void c(Context context, int i) {
        f(context, i, j(context, i, "n"));
    }

    public final Dialog d(Context context, int i, abuf abufVar, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog.Builder builder = null;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(abub.c(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String b2 = abub.b(context, i);
        if (b2 != null) {
            builder.setPositiveButton(b2, abufVar);
        }
        String d = abub.d(context, i);
        if (d != null) {
            builder.setTitle(d);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i)), new IllegalArgumentException());
        return builder.create();
    }

    public final void e(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog a2 = a(activity, i, i2, onCancelListener);
        if (a2 == null) {
            return;
        }
        b(activity, a2, "GooglePlayServicesErrorDialog", onCancelListener);
    }

    public final void f(Context context, int i, PendingIntent pendingIntent) {
        int i2;
        String d;
        String e2;
        NotificationChannel notificationChannel;
        CharSequence name;
        int i3;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i), null), new IllegalArgumentException());
        if (i == 18) {
            new abpz(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        if (i == 6) {
            d = abub.f(context, "common_google_play_services_resolution_required_title");
            i2 = 6;
        } else {
            i2 = i;
            d = abub.d(context, i);
        }
        if (d == null) {
            d = context.getResources().getString(com.google.android.apps.messaging.R.string.common_google_play_services_notification_ticker);
        }
        if (i2 != 6 && i2 != 19) {
            e2 = abub.c(context, i2);
        } else {
            e2 = abub.e(context, "common_google_play_services_resolution_required_text", abub.a(context));
        }
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        abhg.m(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        dyu dyuVar = new dyu(context, (String) null);
        dyuVar.x = true;
        dyuVar.g(true);
        dyuVar.i(d);
        dyo dyoVar = new dyo();
        dyoVar.d(e2);
        dyuVar.t(dyoVar);
        boolean a2 = abvd.a(context);
        int i4 = R.drawable.stat_sys_warning;
        if (a2) {
            abhg.h(true);
            int i5 = context.getApplicationInfo().icon;
            if (i5 != 0) {
                i4 = i5;
            }
            dyuVar.q(i4);
            dyuVar.l = 2;
            if (abvd.c(context)) {
                dyuVar.d(com.google.android.apps.messaging.R.drawable.common_full_open_on_phone, resources.getString(com.google.android.apps.messaging.R.string.common_open_on_phone), pendingIntent);
            } else {
                dyuVar.g = pendingIntent;
            }
        } else {
            dyuVar.q(R.drawable.stat_sys_warning);
            dyuVar.v(resources.getString(com.google.android.apps.messaging.R.string.common_google_play_services_notification_ticker));
            dyuVar.x(System.currentTimeMillis());
            dyuVar.g = pendingIntent;
            dyuVar.h(e2);
        }
        abhg.h(true);
        synchronized (e) {
        }
        notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
        String string = context.getResources().getString(com.google.android.apps.messaging.R.string.common_google_play_services_notification_channel_name);
        if (notificationChannel != null) {
            name = notificationChannel.getName();
            if (!string.contentEquals(name)) {
                notificationChannel.setName(string);
                notificationManager.createNotificationChannel(notificationChannel);
            }
        } else {
            notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
        }
        dyuVar.F = "com.google.android.gms.availability";
        Notification a3 = dyuVar.a();
        if (i2 != 1 && i2 != 2 && i2 != 3) {
            i3 = 39789;
        } else {
            abqp.b.set(false);
            i3 = 10436;
        }
        notificationManager.notify(i3, a3);
    }
}
