package com.google.android.apps.messaging.shared.notification2o;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.messaging.R;
import defpackage.akrc;
import defpackage.aksr;
import defpackage.aktp;
import defpackage.akul;
import defpackage.alvg;
import defpackage.alvw;
import defpackage.alvz;
import defpackage.alwl;
import defpackage.alwo;
import defpackage.alwp;
import defpackage.andi;
import defpackage.armf;
import defpackage.isn;
import defpackage.uzg;
import defpackage.vcr;
import defpackage.vil;
import defpackage.vjh;
import defpackage.vkb;
import defpackage.vkc;
import defpackage.vkf;
import defpackage.vkh;
import defpackage.vko;
import defpackage.vkp;
import defpackage.vkr;
import defpackage.vkt;
import defpackage.vkv;
import defpackage.vlm;
import defpackage.yht;
import defpackage.yhu;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class NotificationsReceiver extends vkb {
    public static final alwo a = alwo.o("BugleNotifications");
    public armf b;
    public armf c;
    public armf d;
    public armf e;

    private final void m(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null && extras.containsKey("extra_notification_type")) {
            vlm b = vlm.b(extras.getInt("extra_notification_type", vlm.NT_UNKNOWN.i));
            b.getClass();
            Optional ofNullable = Optional.ofNullable(extras.getString("extra_notification_tag"));
            boolean z = extras.getBoolean("extra_is_summary_notification", false);
            Bundle bundle = extras.getBundle("extra_notification_bundle");
            if (bundle == null) {
                bundle = new Bundle();
            }
            vkv vkvVar = new vkv(b, ofNullable, bundle, z);
            vkf b2 = vkf.b(intent.getIntExtra("extra_notification_action_type", vkf.NAT_UNKNOWN.o));
            b2.getClass();
            if (b2 == vkf.NAT_UNKNOWN) {
                alwl alwlVar = (alwl) a.g();
                alwlVar.X(vjh.n, vkvVar.a);
                alwlVar.X(vjh.d, (String) vkvVar.b.orElse(null));
                ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/notification2o/NotificationsReceiver", "runActionCallbacks", 113, "NotificationsReceiver.java")).q("Unknown notification action type, not creating callback");
            } else {
                Bundle extras2 = intent.getExtras();
                if (extras2 == null) {
                    extras2 = new Bundle();
                }
                akul ag = aktp.ag(null);
                if (((Map) this.c.b()).containsKey(vkf.NAT_DIRECTOR)) {
                    vkc vkcVar = (vkc) ((Map) this.c.b()).get(vkf.NAT_DIRECTOR);
                    vkcVar.getClass();
                    ag = vkcVar.a(this, intent, extras2, vkvVar);
                }
                akul ag2 = aktp.ag(null);
                if (((Map) this.c.b()).containsKey(b2)) {
                    vkc vkcVar2 = (vkc) ((Map) this.c.b()).get(b2);
                    vkcVar2.getClass();
                    ag2 = vkcVar2.a(this, intent, extras2, vkvVar);
                } else {
                    alwl alwlVar2 = (alwl) a.g();
                    alwlVar2.X(vjh.p, b2);
                    ((alwl) alwlVar2.h("com/google/android/apps/messaging/shared/notification2o/NotificationsReceiver", "runActionCallbacks", 140, "NotificationsReceiver.java")).q("No action callback, only running on director");
                }
                aktp.aa(aktp.ap(ag2, ag).h(new vcr(8), andi.a), new isn(b2, 10), andi.a);
            }
            Bundle extras3 = intent.getExtras();
            if (extras3 != null && extras3.containsKey("extra_notification_callback_type")) {
                String string = extras3.getString("extra_notification_callback_type", vko.NOTIFICATION_CALLBACK_UNKNOWN.name());
                vko vkoVar = vko.NOTIFICATION_CALLBACK_UNKNOWN;
                try {
                    vkoVar = (vko) Enum.valueOf(vko.class, string);
                } catch (IllegalArgumentException unused) {
                }
                vlm vlmVar = vkvVar.a;
                if (intent.getExtras() == null) {
                    new Bundle();
                }
                akul ag3 = aktp.ag(null);
                akul ag4 = aktp.ag(null);
                int ordinal = vkoVar.ordinal();
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal != 4) {
                                alwl alwlVar3 = (alwl) a.i();
                                alwlVar3.X(vjh.n, vlmVar);
                                ((alwl) alwlVar3.h("com/google/android/apps/messaging/shared/notification2o/NotificationsReceiver", "runNotificationCallbacks", 248, "NotificationsReceiver.java")).q("Unknown callback type");
                            } else {
                                if (((Map) this.d.b()).containsKey(vlmVar)) {
                                    ag4 = ((vkp) ((Map) this.d.b()).get(vlmVar)).c(vkvVar);
                                }
                                vkp vkpVar = (vkp) ((Map) this.d.b()).get(vlm.NT_DIRECTOR);
                                vkpVar.getClass();
                                ag3 = vkpVar.c(vkvVar);
                            }
                        } else {
                            if (((Map) this.d.b()).containsKey(vlmVar)) {
                                ag4 = ((vkp) ((Map) this.d.b()).get(vlmVar)).d(vkvVar);
                            }
                            vkp vkpVar2 = (vkp) ((Map) this.d.b()).get(vlm.NT_DIRECTOR);
                            vkpVar2.getClass();
                            ag3 = vkpVar2.d(vkvVar);
                        }
                    } else {
                        if (((Map) this.d.b()).containsKey(vlmVar)) {
                            ag4 = ((vkp) ((Map) this.d.b()).get(vlmVar)).f(vkvVar);
                        }
                        vkp vkpVar3 = (vkp) ((Map) this.d.b()).get(vlm.NT_DIRECTOR);
                        vkpVar3.getClass();
                        ag3 = vkpVar3.f(vkvVar);
                    }
                } else {
                    if (((Map) this.d.b()).containsKey(vlmVar)) {
                        ag4 = ((vkp) ((Map) this.d.b()).get(vlmVar)).e(vkvVar);
                    }
                    vkp vkpVar4 = (vkp) ((Map) this.d.b()).get(vlm.NT_DIRECTOR);
                    vkpVar4.getClass();
                    ag3 = vkpVar4.e(vkvVar);
                }
                aktp.aa(aktp.ap(ag3, ag4).h(new vcr(7), andi.a), new isn(vkoVar, 11), andi.a);
            } else {
                ((alwl) ((alwl) a.g()).h("com/google/android/apps/messaging/shared/notification2o/NotificationsReceiver", "runNotificationCallbacks", 170, "NotificationsReceiver.java")).q("Skipping notification callbacks, missing notificationType or callbackType");
            }
            PendingIntent pendingIntent = (PendingIntent) extras.getParcelable("extra_pending_intent_to_run");
            if (pendingIntent == null) {
                return;
            }
            try {
                pendingIntent.send();
                return;
            } catch (PendingIntent.CanceledException e) {
                ((alwl) ((alwl) ((alwl) a.i()).g(e)).h("com/google/android/apps/messaging/shared/notification2o/NotificationsReceiver", "runCallbacks", '`', "NotificationsReceiver.java")).q("Error running pending intent for notification action");
                return;
            }
        }
        ((alwl) ((alwl) a.i()).h("com/google/android/apps/messaging/shared/notification2o/NotificationsReceiver", "runCallbacks", 61, "NotificationsReceiver.java")).q("Skipping notification callbacks, missing notificationType or extras");
    }

    @Override // defpackage.wng
    public final akrc a() {
        return ((aksr) this.b.b()).b("NotificationsReceiver receive broadcast");
    }

    @Override // defpackage.wng
    public final String b() {
        return "Bugle.Broadcast.Notification2o.Latency";
    }

    @Override // defpackage.wng
    protected final int e() {
        return 18;
    }

    @Override // defpackage.wna
    public final String f() {
        return "Bugle.Broadcast.ForegroundService.Notification2o.Latency";
    }

    @Override // defpackage.wna
    public final void g(Context context, Intent intent) {
        List notificationChannels;
        String id;
        String id2;
        NotificationChannel notificationChannel;
        String id3;
        ((alwl) ((alwl) a.g()).h("com/google/android/apps/messaging/shared/notification2o/NotificationsReceiver", "doInBackground", 47, "NotificationsReceiver.java")).q("Notifications receiver do in background");
        if (Objects.equals(intent.getAction(), "android.intent.action.LOCALE_CHANGED")) {
            vkt vktVar = (vkt) this.e.b();
            notificationChannels = vktVar.b.d.getNotificationChannels();
            HashSet hashSet = (HashSet) Collection.EL.stream(notificationChannels).map(new vil(9)).collect(Collectors.toCollection(new uzg(12)));
            for (vkh vkhVar : ((Map) vktVar.d.b()).values()) {
                Optional f = vkhVar.f();
                if (!f.isEmpty() && hashSet.contains(((vkr) f.get()).a)) {
                    NotificationChannel e = vktVar.e((vkr) f.get());
                    alvw g = vkt.a.g();
                    g.X(alwp.a, "BugleNotifications");
                    alvg alvgVar = (alvg) g;
                    alvgVar.X(vjh.n, vkhVar.d());
                    alvz alvzVar = vjh.k;
                    id3 = e.getId();
                    alvgVar.X(alvzVar, id3);
                    ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/notification2o/NotificationChannelManager", "refreshExistingNotificationChannelNames", 103, "NotificationChannelManager.java")).q("Updating channel for locale change");
                } else {
                    alvw g2 = vkt.a.g();
                    g2.X(alwp.a, "BugleNotifications");
                    alvg alvgVar2 = (alvg) g2;
                    alvgVar2.X(new alvz("channel_builder_empty", Boolean.class, false, false), Boolean.valueOf(f.isEmpty()));
                    alvgVar2.X(vjh.k, (String) f.map(new vil(10)).orElse(null));
                    ((alvg) alvgVar2.h("com/google/android/apps/messaging/shared/notification2o/NotificationChannelManager", "refreshExistingNotificationChannelNames", 92, "NotificationChannelManager.java")).q("Channel does not exist or builder info is empty for blueprint, not refreshing channel name");
                }
            }
            NotificationChannel g3 = vktVar.g();
            alvw g4 = vkt.a.g();
            g4.X(alwp.a, "BugleNotifications");
            alvg alvgVar3 = (alvg) g4;
            alvz alvzVar2 = vjh.k;
            id = g3.getId();
            alvgVar3.X(alvzVar2, id);
            ((alvg) alvgVar3.h("com/google/android/apps/messaging/shared/notification2o/NotificationChannelManager", "refreshExistingNotificationChannelNames", 110, "NotificationChannelManager.java")).q("Updating misc channels for locale change");
            NotificationChannel f2 = vktVar.f();
            alvw g5 = vkt.a.g();
            g5.X(alwp.a, "BugleNotifications");
            alvg alvgVar4 = (alvg) g5;
            alvz alvzVar3 = vjh.k;
            id2 = f2.getId();
            alvgVar4.X(alvzVar3, id2);
            ((alvg) alvgVar4.h("com/google/android/apps/messaging/shared/notification2o/NotificationChannelManager", "refreshExistingNotificationChannelNames", 115, "NotificationChannelManager.java")).q("Updating foreground channel for locale change");
            yhu yhuVar = (yhu) vktVar.c.b();
            yhuVar.g("bugle_reminder_channel", yhuVar.b.getString(R.string.bugle_notification_reminders_channel_name), yht.REMINDERS.e);
            notificationChannel = ((NotificationManager) yhuVar.a.b()).getNotificationChannel("download-notification-channel-id");
            if (notificationChannel != null) {
                Context context2 = yhuVar.b;
                ((NotificationManager) context2.getSystemService(NotificationManager.class)).createNotificationChannel(new NotificationChannel("download-notification-channel-id", context2.getResources().getString(R.string.mdd_download_notification_channel_name), 3));
            }
            yhuVar.g("bugle_while_using_web_channel_v1", yhuVar.b.getString(R.string.bugle_notification_silent_default_channel_name), yht.WEB_SETTINGS.e);
            yhuVar.g("bugle_connected_to_web_channel_v1", yhuVar.b.getResources().getString(R.string.bugle_notification_ditto_channel_name), yht.WEB_SETTINGS.e);
            yhuVar.g("bugle_report_issue_channel", yhuVar.b.getResources().getString(R.string.bugle_notification_report_issue_channel_name), null);
            yhuVar.g("bugle_auto_moved_spam_channel", yhuVar.b.getString(R.string.automoved_spam_notification_channel_name), null);
            yhuVar.g("bugle_rcs_not_delivered_channel", yhuVar.b.getResources().getString(R.string.rcs_not_delivered_notification_channel_name), yht.DEFAULT_SETTINGS.e);
            yhuVar.g("bugle_business_messages_channel", yhuVar.b.getResources().getString(R.string.bugle_notification_business_messages_channel_name), yht.DEFAULT_SETTINGS.e);
            alvw g6 = vkt.a.g();
            g6.X(alwp.a, "BugleNotifications");
            ((alvg) ((alvg) g6).h("com/google/android/apps/messaging/shared/notification2o/NotificationChannelManager", "refreshExistingNotificationChannelNames", 118, "NotificationChannelManager.java")).q("Updating legacy channels for locale change");
        }
        m(intent);
    }

    @Override // defpackage.wna
    public final boolean i(Intent intent) {
        return true;
    }

    @Override // defpackage.wna
    public final String k(Context context, Intent intent) {
        return context.getString(R.string.notification2o_receiver_update_message);
    }
}
