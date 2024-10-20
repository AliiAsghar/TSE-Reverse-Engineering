package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.Context;
import android.media.AudioAttributes;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yhu {
    private static final alwo c = alwo.o("BugleNotifications");
    public final apwt a;
    public final Context b;
    private final apwt d;
    private final armf e;

    public yhu(Context context, apwt apwtVar, armf armfVar, apwt apwtVar2) {
        this.b = context;
        this.d = apwtVar;
        this.e = armfVar;
        this.a = apwtVar2;
    }

    public static wfh k(String str, String str2, String str3, NotificationChannel notificationChannel) {
        int importance;
        int importance2;
        boolean shouldShowLights;
        int lightColor;
        long[] vibrationPattern;
        boolean shouldVibrate;
        Uri sound;
        importance = notificationChannel.getImportance();
        if (importance != -1000) {
            importance2 = notificationChannel.getImportance();
        } else {
            importance2 = 4;
        }
        wfh wfhVar = new wfh(str, str2, importance2);
        shouldShowLights = notificationChannel.shouldShowLights();
        wfhVar.H(shouldShowLights);
        lightColor = notificationChannel.getLightColor();
        bl$$ExternalSyntheticApiModelOutline0.m(wfhVar.a).setLightColor(lightColor);
        vibrationPattern = notificationChannel.getVibrationPattern();
        bl$$ExternalSyntheticApiModelOutline0.m(wfhVar.a).setVibrationPattern(vibrationPattern);
        shouldVibrate = notificationChannel.shouldVibrate();
        wfhVar.I(shouldVibrate);
        sound = notificationChannel.getSound();
        wfhVar.K(sound, new AudioAttributes.Builder().setUsage(8).build());
        if (str3 != null) {
            wfhVar.J(str3);
        }
        return wfhVar;
    }

    private static String l() {
        return yht.DEFAULT_SETTINGS.e;
    }

    private final String m() {
        return this.b.getString(R.string.bugle_notification_default_incoming_message_channel_name);
    }

    private final void n(yht yhtVar) {
        ((NotificationManager) this.a.b()).createNotificationChannelGroup(new NotificationChannelGroup(yhtVar.e, this.b.getString(yhtVar.f)));
    }

    public final NotificationChannel a(boolean z, String str) {
        return c("bugle_default_channel", m(), l(), z, str);
    }

    public final NotificationChannel b() {
        NotificationChannel notificationChannel;
        CharSequence name;
        notificationChannel = ((NotificationManager) this.a.b()).getNotificationChannel("bugle_broadcast_receiver_channel");
        String string = this.b.getResources().getString(R.string.bugle_notification_foreground_service_channel_name);
        if (notificationChannel != null) {
            name = notificationChannel.getName();
            if (TextUtils.equals(name, string)) {
                return notificationChannel;
            }
        }
        NotificationChannel notificationChannel2 = new NotificationChannel("bugle_broadcast_receiver_channel", string, 2);
        notificationChannel2.enableLights(false);
        notificationChannel2.enableVibration(false);
        notificationChannel2.setShowBadge(false);
        j(notificationChannel2);
        return notificationChannel2;
    }

    public final NotificationChannel c(String str, String str2, String str3, boolean z, String str4) {
        wfh wfhVar = new wfh(str, str2, 4);
        if (!TextUtils.isEmpty(str4)) {
            wfhVar.K(Uri.parse(str4), new AudioAttributes.Builder().setUsage(8).build());
        }
        wfhVar.H(true);
        wfhVar.I(z);
        if (str3 != null) {
            wfhVar.J(str3);
        }
        Object obj = wfhVar.a;
        j(bl$$ExternalSyntheticApiModelOutline0.m(obj));
        return bl$$ExternalSyntheticApiModelOutline0.m(obj);
    }

    public final NotificationChannel d() {
        NotificationChannel notificationChannel;
        CharSequence name;
        notificationChannel = ((NotificationManager) this.a.b()).getNotificationChannel("bugle_report_issue_channel");
        String string = this.b.getResources().getString(R.string.bugle_notification_report_issue_channel_name);
        if (notificationChannel != null) {
            name = notificationChannel.getName();
            if (TextUtils.equals(name, string)) {
                return notificationChannel;
            }
        }
        NotificationChannel notificationChannel2 = new NotificationChannel("bugle_report_issue_channel", string, 3);
        notificationChannel2.enableVibration(true);
        notificationChannel2.enableLights(false);
        notificationChannel2.setShowBadge(false);
        j(notificationChannel2);
        return notificationChannel2;
    }

    public final NotificationChannel e() {
        NotificationChannel notificationChannel;
        notificationChannel = ((NotificationManager) this.a.b()).getNotificationChannel("bugle_default_channel");
        if (notificationChannel == null) {
            if (!i()) {
                return null;
            }
            boolean n = ((znj) this.d.b()).n();
            Context context = this.b;
            armf armfVar = this.e;
            return a(n, ((ykw) armfVar.b()).f(context.getString(R.string.notification_sound_pref_key), null));
        }
        return g("bugle_default_channel", m(), l());
    }

    public final NotificationChannel f(NotificationChannel notificationChannel, String str, String str2) {
        CharSequence name;
        String id;
        String id2;
        String group;
        if (notificationChannel == null) {
            return null;
        }
        name = notificationChannel.getName();
        boolean contentEquals = str.contentEquals(name);
        boolean z = !contentEquals;
        boolean z2 = false;
        if (str2 != null) {
            group = notificationChannel.getGroup();
            if (group == null) {
                z2 = true;
            }
        }
        if (contentEquals && !z2) {
            return notificationChannel;
        }
        alvw m = c.m();
        alvz alvzVar = vjh.k;
        id = notificationChannel.getId();
        m.X(alvzVar, id);
        m.X(vjh.l, Boolean.valueOf(z));
        m.X(vjh.m, Boolean.valueOf(z2));
        ((alwl) m.h("com/google/android/apps/messaging/shared/util/notifications/NotificationChannelUtil", "shouldRefreshChannel", 930, "NotificationChannelUtil.java")).q("NotificationChannel should be refreshed");
        id2 = notificationChannel.getId();
        Object obj = k(id2, str, str2, notificationChannel).a;
        j(bl$$ExternalSyntheticApiModelOutline0.m(obj));
        return bl$$ExternalSyntheticApiModelOutline0.m(obj);
    }

    public final NotificationChannel g(String str, String str2, String str3) {
        NotificationChannel notificationChannel;
        notificationChannel = ((NotificationManager) this.a.b()).getNotificationChannel(str);
        return f(notificationChannel, str2, str3);
    }

    public final boolean h(boolean z) {
        NotificationChannel notificationChannel;
        boolean areNotificationsEnabled;
        notificationChannel = ((NotificationManager) this.a.b()).getNotificationChannel("bugle_default_channel");
        if (notificationChannel == null && !z) {
            return false;
        }
        areNotificationsEnabled = ((NotificationManager) this.a.b()).areNotificationsEnabled();
        return areNotificationsEnabled;
    }

    public final boolean i() {
        Context context = this.b;
        return ((ykw) this.e.b()).q(context.getString(R.string.notifications_enabled_pref_key), context.getResources().getBoolean(R.bool.notifications_enabled_pref_default));
    }

    public final void j(NotificationChannel notificationChannel) {
        int importance;
        String id;
        n(yht.CONVERSATIONS);
        n(yht.WEB_SETTINGS);
        if (abal.b()) {
            n(yht.REMINDERS);
        }
        n(yht.DEFAULT_SETTINGS);
        importance = notificationChannel.getImportance();
        if (importance < 0 || importance > 5) {
            notificationChannel.setImportance(3);
        }
        try {
            ((NotificationManager) this.a.b()).createNotificationChannel(notificationChannel);
        } catch (RuntimeException e) {
            alwl alwlVar = (alwl) c.i();
            alvz alvzVar = vjh.k;
            id = notificationChannel.getId();
            alwlVar.X(alvzVar, id);
            ((alwl) ((alwl) alwlVar.g(e)).h("com/google/android/apps/messaging/shared/util/notifications/NotificationChannelUtil", "createNotificationChannel", 170, "NotificationChannelUtil.java")).q("Error creating legacy notification channel");
        }
    }
}
