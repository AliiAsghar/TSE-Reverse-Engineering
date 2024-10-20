package defpackage;

import android.app.NotificationChannel;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vmm implements vml {
    private static final alwo a = alwo.o("BugleNotifications");
    private final Context b;
    private final vkt c;
    private final Optional d;

    public vmm(Context context, vkt vktVar, Optional optional) {
        this.b = context;
        this.c = vktVar;
        this.d = optional;
    }

    @Override // defpackage.vml
    public final NotificationChannel a() {
        return this.c.d(Optional.of(c()), Optional.empty());
    }

    @Override // defpackage.vml
    public final Intent b(String str, String str2, ConversationIdType conversationIdType) {
        String id;
        NotificationChannel a2;
        String id2;
        String id3;
        String group;
        String id4;
        if (yhx.d && !((xzu) this.d.get()).k(str2)) {
            alwl alwlVar = (alwl) a.i();
            alwlVar.X(vjh.t, str2);
            ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageChannelManagerImpl", "createConversationChannelAndGetSettingIntent", 89, "IncomingMessageChannelManagerImpl.java")).q("Missing shortcut, won't create conversation notification channel");
            return null;
        }
        NotificationChannel a3 = a();
        vkt vktVar = this.c;
        id = a3.getId();
        if (yhx.d) {
            a2 = vktVar.c(id, str2);
            if (a2 != null) {
                a2.setName(str);
                vktVar.i(a2);
            } else {
                NotificationChannel a4 = vktVar.b.a(id);
                if (a4 != null) {
                    String h = vkt.h(id, str2);
                    group = a4.getGroup();
                    a2 = vkt.a(h, str, a4, group);
                    a2.setConversationId(id, str2);
                    vktVar.i(a2);
                    alvw g = vkt.a.g();
                    g.X(alwp.a, "BugleNotifications");
                    alvg alvgVar = (alvg) g;
                    alvz alvzVar = vjh.k;
                    id4 = a2.getId();
                    alvgVar.X(alvzVar, id4);
                    ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/notification2o/NotificationChannelManager", "getOrCreateConversationChannelRPlus", 315, "NotificationChannelManager.java")).q("Creating R+ conversation channel");
                }
                a2 = null;
            }
        } else {
            NotificationChannel b = vktVar.b(conversationIdType);
            if (b != null) {
                b.setName(str);
                vktVar.i(b);
                a2 = b;
            } else {
                NotificationChannel a5 = vktVar.b.a(id);
                if (a5 != null) {
                    a2 = vkt.a(conversationIdType.a(), str, a5, vks.CONVERSATIONS.c);
                    vktVar.i(a2);
                    alvw g2 = vkt.a.g();
                    g2.X(alwp.a, "BugleNotifications");
                    alvg alvgVar2 = (alvg) g2;
                    alvz alvzVar2 = vjh.k;
                    id2 = a2.getId();
                    alvgVar2.X(alvzVar2, id2);
                    ((alvg) alvgVar2.h("com/google/android/apps/messaging/shared/notification2o/NotificationChannelManager", "getOrCreateConversationChannelPreR", 284, "NotificationChannelManager.java")).q("Creating pre-R conversation channel");
                }
                a2 = null;
            }
        }
        if (a2 == null) {
            return null;
        }
        Intent a6 = lqn.g("android.settings.CHANNEL_NOTIFICATION_SETTINGS").a();
        id3 = a2.getId();
        a6.putExtra("android.provider.extra.CHANNEL_ID", id3);
        a6.putExtra("android.provider.extra.APP_PACKAGE", this.b.getPackageName());
        return a6;
    }

    @Override // defpackage.vml
    public final vkr c() {
        Context context = this.b;
        String string = context.getString(R.string.im_notification_default_channel_id);
        String string2 = context.getString(R.string.im_notification_default_channel_name);
        vks vksVar = vks.DEFAULT_SETTINGS;
        Optional.empty();
        Optional.empty();
        Optional.empty();
        Optional.empty();
        Optional.empty();
        Optional.empty();
        if (string != null) {
            if (string2 != null) {
                Optional of = Optional.of(vksVar);
                Optional.of(false);
                Optional of2 = Optional.of(true);
                Optional of3 = Optional.of(true);
                Optional of4 = Optional.of(0);
                Optional empty = Optional.empty();
                Uri uri = Settings.System.DEFAULT_NOTIFICATION_URI;
                if (uri != null) {
                    return new vkr(string, string2, uri, Optional.of(true), of2, of3, empty, of4, of);
                }
                throw new NullPointerException("Null soundUri");
            }
            throw new NullPointerException("Null channelName");
        }
        throw new NullPointerException("Null channelId");
    }

    @Override // defpackage.vml
    public final void d(ConversationIdType conversationIdType) {
        NotificationChannel b;
        String id;
        if (this.d.isEmpty()) {
            ((alwl) ((alwl) a.g()).h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageChannelManagerImpl", "deleteConversationChannel", 67, "IncomingMessageChannelManagerImpl.java")).q("Not deleting conversation channel because shortcutUtil missing");
            return;
        }
        String f = ((xzu) this.d.get()).f(conversationIdType);
        vkt vktVar = this.c;
        String string = this.b.getString(R.string.im_notification_default_channel_id);
        if (yhx.d) {
            b = vktVar.c(string, f);
        } else {
            b = vktVar.b(conversationIdType);
        }
        if (b == null) {
            return;
        }
        vkt vktVar2 = this.c;
        id = b.getId();
        vktVar2.j(id);
    }
}
