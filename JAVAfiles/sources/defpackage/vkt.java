package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.content.Context;
import android.media.AudioAttributes;
import android.net.Uri;
import android.provider.Settings;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vkt {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/notification2o/NotificationChannelManager");
    public final dzt b;
    public final armf c;
    public final armf d;
    private final Context e;

    public vkt(Context context, armf armfVar, armf armfVar2) {
        this.e = context;
        this.b = new dzt(context);
        this.c = armfVar;
        this.d = armfVar2;
    }

    public static NotificationChannel a(String str, String str2, NotificationChannel notificationChannel, String str3) {
        int importance;
        int importance2;
        boolean shouldShowLights;
        int lightColor;
        long[] vibrationPattern;
        boolean shouldVibrate;
        boolean canShowBadge;
        Uri sound;
        boolean canBubble;
        importance = notificationChannel.getImportance();
        if (importance != -1000) {
            importance2 = notificationChannel.getImportance();
        } else {
            importance2 = 3;
        }
        NotificationChannel notificationChannel2 = new NotificationChannel(str, str2, importance2);
        shouldShowLights = notificationChannel.shouldShowLights();
        notificationChannel2.enableLights(shouldShowLights);
        lightColor = notificationChannel.getLightColor();
        notificationChannel2.setLightColor(lightColor);
        vibrationPattern = notificationChannel.getVibrationPattern();
        notificationChannel2.setVibrationPattern(vibrationPattern);
        shouldVibrate = notificationChannel.shouldVibrate();
        notificationChannel2.enableVibration(shouldVibrate);
        canShowBadge = notificationChannel.canShowBadge();
        notificationChannel2.setShowBadge(canShowBadge);
        sound = notificationChannel.getSound();
        notificationChannel2.setSound(sound, new AudioAttributes.Builder().setUsage(8).build());
        if (str3 != null) {
            notificationChannel2.setGroup(str3);
        }
        if (yhx.d) {
            canBubble = notificationChannel.canBubble();
            notificationChannel2.setAllowBubbles(canBubble);
        }
        return notificationChannel2;
    }

    public static String h(String str, String str2) {
        return a.co(str2, str, " : ");
    }

    private final void l() {
        this.b.d(new NotificationChannelGroup(vks.DEFAULT_SETTINGS.c, vks.DEFAULT_SETTINGS.a(this.e)));
        vks vksVar = vks.CONVERSATIONS;
        this.b.d(new NotificationChannelGroup(vksVar.c, vksVar.a(this.e)));
    }

    private static boolean m(NotificationChannel notificationChannel, String str) {
        CharSequence name;
        name = notificationChannel.getName();
        if (TextUtils.equals(str, name)) {
            return false;
        }
        return true;
    }

    public final NotificationChannel b(ConversationIdType conversationIdType) {
        return this.b.a(conversationIdType.a());
    }

    public final NotificationChannel c(String str, String str2) {
        String conversationId;
        if (this.b.a(str) == null) {
            return null;
        }
        NotificationChannel a2 = this.b.a(h(str, str2));
        if (a2 != null) {
            return a2;
        }
        NotificationChannel b = this.b.b(str, str2);
        if (b != null) {
            conversationId = b.getConversationId();
            if (!TextUtils.isEmpty(conversationId)) {
                return b;
            }
        }
        return null;
    }

    public final NotificationChannel d(Optional optional, Optional optional2) {
        NotificationChannel b;
        NotificationChannel a2;
        String group;
        String id;
        String id2;
        String id3;
        String id4;
        l();
        if (optional.isEmpty()) {
            return g();
        }
        NotificationChannel e = e((vkr) optional.get());
        if (optional2.isPresent()) {
            Object obj = optional.get();
            vjy vjyVar = (vjy) optional2.get();
            ConversationIdType conversationIdType = vjyVar.b;
            String str = vjyVar.a;
            String str2 = vjyVar.d;
            String str3 = ((vkr) obj).a;
            if (yhx.d) {
                dzt dztVar = this.b;
                conversationIdType.getClass();
                String a3 = conversationIdType.a();
                str.getClass();
                NotificationChannel b2 = dztVar.b(a3, str);
                if (b2 != null) {
                    id3 = b2.getId();
                    if (!id3.equals(conversationIdType.a())) {
                        id4 = b2.getId();
                        j(id4);
                    }
                }
                if (c(str3, str) != null) {
                    j(conversationIdType.toString());
                } else {
                    NotificationChannel a4 = this.b.a(conversationIdType.a());
                    if (a4 != null && (a2 = this.b.a(str3)) != null) {
                        str.getClass();
                        String h = h(str3, str);
                        group = a2.getGroup();
                        NotificationChannel a5 = a(h, str2, a4, group);
                        a5.setConversationId(str3, str);
                        i(a5);
                        alvi alviVar = a;
                        alvw g = alviVar.g();
                        g.X(alwp.a, "BugleNotifications");
                        alvg alvgVar = (alvg) g;
                        alvgVar.X(vjh.k, h);
                        alvgVar.X(vjh.t, str);
                        ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/notification2o/NotificationChannelManager", "migrateAndDeletePreRConversationChannel", 382, "NotificationChannelManager.java")).q("Migrated pre-R conversation channel to R+ channel");
                        id = a4.getId();
                        j(id);
                        alvw g2 = alviVar.g();
                        g2.X(alwp.a, "BugleNotifications");
                        alvg alvgVar2 = (alvg) g2;
                        alvz alvzVar = vjh.k;
                        id2 = a4.getId();
                        alvgVar2.X(alvzVar, id2);
                        ((alvg) alvgVar2.h("com/google/android/apps/messaging/shared/notification2o/NotificationChannelManager", "migrateAndDeletePreRConversationChannel", 388, "NotificationChannelManager.java")).q("Deleted pre-R channel");
                    }
                }
                b = c(str3, str);
            } else {
                b = b(conversationIdType);
            }
            if (b != null) {
                return b;
            }
        }
        return e;
    }

    public final NotificationChannel e(vkr vkrVar) {
        int i;
        String id;
        NotificationChannel a2 = this.b.a(vkrVar.a);
        if (a2 == null) {
            String str = vkrVar.a;
            String str2 = vkrVar.b;
            int i2 = vkrVar.j - 1;
            if (i2 != 0) {
                if (i2 != 1) {
                    i = 2;
                    if (i2 != 2) {
                        i = 3;
                        if (i2 != 3 && i2 == 4) {
                            i = 4;
                        }
                    }
                } else {
                    i = 1;
                }
            } else {
                i = 0;
            }
            NotificationChannel notificationChannel = new NotificationChannel(str, str2, i);
            notificationChannel.setSound(vkrVar.c, new AudioAttributes.Builder().setUsage(8).build());
            vkrVar.d.isPresent();
            ((Boolean) vkrVar.d.get()).booleanValue();
            notificationChannel.enableLights(true);
            vkrVar.f.isPresent();
            ((Boolean) vkrVar.f.get()).booleanValue();
            notificationChannel.setShowBadge(true);
            vkrVar.g.isPresent();
            vkrVar.e.isPresent();
            ((Boolean) vkrVar.e.get()).booleanValue();
            notificationChannel.enableVibration(true);
            vkrVar.h.isPresent();
            ((Integer) vkrVar.h.get()).intValue();
            notificationChannel.setLightColor(0);
            vkrVar.i.isPresent();
            notificationChannel.setGroup(((vks) vkrVar.i.get()).c);
            alvw g = a.g();
            g.X(alwp.a, "BugleNotifications");
            alvg alvgVar = (alvg) g;
            alvz alvzVar = vjh.k;
            id = notificationChannel.getId();
            alvgVar.X(alvzVar, id);
            ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/notification2o/NotificationChannelManager", "getOrCreateChannelForChannelInfo", 254, "NotificationChannelManager.java")).q("Creating notification channel from channel info");
            i(notificationChannel);
            return notificationChannel;
        }
        a2.setName(vkrVar.b);
        vkrVar.i.isPresent();
        a2.setGroup(((vks) vkrVar.i.get()).c);
        i(a2);
        return a2;
    }

    public final NotificationChannel f() {
        Context context = this.e;
        NotificationChannel a2 = this.b.a("bugle_broadcast_receiver_channel");
        String string = context.getString(R.string.notification2o_foreground_service_channel);
        if (a2 != null && !m(a2, string)) {
            return a2;
        }
        NotificationChannel notificationChannel = new NotificationChannel("bugle_broadcast_receiver_channel", string, 2);
        notificationChannel.enableLights(false);
        notificationChannel.enableVibration(false);
        notificationChannel.setShowBadge(false);
        notificationChannel.setLightColor(0);
        i(notificationChannel);
        alvw g = a.g();
        g.X(alwp.a, "BugleNotifications");
        ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/notification2o/NotificationChannelManager", "getOrCreateForegroundServiceChannel", 571, "NotificationChannelManager.java")).q("Foreground service channel created");
        return notificationChannel;
    }

    public final NotificationChannel g() {
        Context context = this.e;
        NotificationChannel a2 = this.b.a("bugle_misc_channel");
        String string = context.getString(R.string.notification2o_misc_channel);
        if (a2 != null && !m(a2, string)) {
            return a2;
        }
        NotificationChannel notificationChannel = new NotificationChannel("bugle_misc_channel", string, 3);
        notificationChannel.enableLights(false);
        notificationChannel.enableVibration(true);
        notificationChannel.setShowBadge(true);
        notificationChannel.setLightColor(0);
        notificationChannel.setSound(Settings.System.DEFAULT_NOTIFICATION_URI, new AudioAttributes.Builder().setUsage(8).build());
        i(notificationChannel);
        alvw g = a.g();
        g.X(alwp.a, "BugleNotifications");
        ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/notification2o/NotificationChannelManager", "getOrCreateMiscellaneousChannel", 545, "NotificationChannelManager.java")).q("Miscellaneous channel created");
        return notificationChannel;
    }

    public final void i(NotificationChannel notificationChannel) {
        int importance;
        String id;
        l();
        importance = notificationChannel.getImportance();
        if (importance < 0 || importance > 5) {
            notificationChannel.setImportance(3);
        }
        try {
            this.b.d.createNotificationChannel(notificationChannel);
        } catch (RuntimeException e) {
            alvw i = a.i();
            i.X(alwp.a, "BugleNotifications");
            alvg alvgVar = (alvg) i;
            alvz alvzVar = vjh.k;
            id = notificationChannel.getId();
            alvgVar.X(alvzVar, id);
            ((alvg) ((alvg) alvgVar.g(e)).h("com/google/android/apps/messaging/shared/notification2o/NotificationChannelManager", "commitChannel", 455, "NotificationChannelManager.java")).q("Error creating notification channel");
        }
    }

    public final void j(String str) {
        if (TextUtils.isEmpty(str)) {
            alvw i = a.i();
            i.X(alwp.a, "BugleNotifications");
            ((alvg) ((alvg) i).h("com/google/android/apps/messaging/shared/notification2o/NotificationChannelManager", "deleteChannel", 171, "NotificationChannelManager.java")).q("channel id is null/empty, ignoring request to delete null notification channel");
        } else {
            if (this.b.a(str) != null) {
                alvw g = a.g();
                g.X(alwp.a, "BugleNotifications");
                alvg alvgVar = (alvg) g;
                alvgVar.X(vjh.k, str);
                ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/notification2o/NotificationChannelManager", "deleteChannel", 181, "NotificationChannelManager.java")).t("Deleting notification channel: %s", str);
                this.b.d.deleteNotificationChannel(str);
                return;
            }
            alvw g2 = a.g();
            g2.X(alwp.a, "BugleNotifications");
            alvg alvgVar2 = (alvg) g2;
            alvgVar2.X(vjh.k, str);
            ((alvg) alvgVar2.h("com/google/android/apps/messaging/shared/notification2o/NotificationChannelManager", "deleteChannel", 187, "NotificationChannelManager.java")).q("No notification channel to delete");
        }
    }

    public final boolean k(NotificationChannel notificationChannel) {
        int importance;
        importance = notificationChannel.getImportance();
        if (importance == 0) {
            return true;
        }
        return false;
    }
}
