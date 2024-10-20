package defpackage;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.main.MainActivity;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.InvalidConversationId;
import com.google.android.apps.messaging.shared.api.messaging.message.BugleMessageId;
import com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBugleMessageId;
import com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.ui.conversation.LaunchConversationActivity;
import com.google.android.apps.messaging.ui.conversation.LaunchConversationShimActivity;
import j$.util.Objects;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iio implements qoq {
    private final armf a;
    private final armf b;

    public iio(armf armfVar, armf armfVar2) {
        this.a = armfVar;
        this.b = armfVar2;
    }

    private static int C(Intent intent, ConversationId conversationId) {
        if (intent.getData() == null) {
            return conversationId.hashCode();
        }
        return 0;
    }

    private static void D(Intent intent, MessageIdType messageIdType, boolean z) {
        if (!messageIdType.b()) {
            intent.putExtra("message_id", messageIdType.a());
            if (!z) {
                intent.putExtra("mapi_message_id", new CoreBugleMessageId(messageIdType, -1L));
            }
        }
    }

    private static boolean E(Context context) {
        if (!(context instanceof Activity)) {
            return true;
        }
        return false;
    }

    private final Intent F(Context context, Class cls, ConversationId conversationId, Integer num, MessageCoreData messageCoreData, lrf lrfVar, String str, boolean z, boolean z2, boolean z3) {
        Intent intent;
        Uri t;
        if (E(context)) {
            intent = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            albo.C(intent);
        } else {
            intent = new Intent(context, (Class<?>) cls);
        }
        if (z) {
            if (conversationId != InvalidConversationId.a && num != null) {
                intent.setFlags(536870912);
            } else {
                intent.setFlags(VCardConfig.FLAG_APPEND_TYPE_PARAM);
            }
        }
        if (conversationId != InvalidConversationId.a) {
            lpg.m(conversationId, intent, z2);
        }
        if (num != null) {
            intent.putExtra("conversation_state", num);
        }
        intent.addFlags(1);
        if (messageCoreData != null) {
            intent.putExtra("draft_data", messageCoreData);
            ClipData clipData = null;
            for (MessagePartCoreData messagePartCoreData : messageCoreData.W()) {
                if (messagePartCoreData.aV() && (t = messagePartCoreData.t()) != null) {
                    if (clipData == null) {
                        clipData = ClipData.newRawUri("Attachments", t);
                    } else {
                        clipData.addItem(new ClipData.Item(t));
                    }
                }
            }
            if (clipData != null) {
                intent.setClipData(clipData);
            }
        }
        if (lrfVar != null) {
            if (intent.getExtras() == null) {
                intent.putExtra("fake", "fake");
            }
            Bundle bundle = new Bundle();
            lrfVar.n(bundle);
            intent.putExtras(bundle);
        }
        if (str != null) {
            intent.putExtra("search_text", str);
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
        }
        if (z3 && qrl.a() && !((obm) this.b.b()).a()) {
            intent.putExtra("force_conversation_1", true);
        }
        return intent;
    }

    private final Intent G(Context context, Class cls, ConversationId conversationId, MessageIdType messageIdType, Integer num, MessageCoreData messageCoreData, lrf lrfVar, boolean z) {
        Intent F = F(context, cls, conversationId, num, messageCoreData, lrfVar, null, true, true, z);
        D(F, messageIdType, true);
        return F;
    }

    private final void H(Context context, ConversationId conversationId, MessageIdType messageIdType, MessageId messageId, Uri uri, Integer num, MessageCoreData messageCoreData, lrf lrfVar, Bundle bundle, String str, boolean z, Bundle bundle2, Optional optional, boolean z2, boolean z3) {
        xyl.k(true);
        Intent F = F(context, MainActivity.class, conversationId, num, messageCoreData, lrfVar, str, z2, false, z3);
        if (messageId != null) {
            F.putExtra("mapi_message_id", messageId);
            if (messageId instanceof BugleMessageId) {
                F.putExtra("message_id", ((BugleMessageId) messageId).c().a());
            }
        } else {
            D(F, messageIdType, false);
        }
        if (uri != null) {
            F.putExtra("target_uri", uri);
        }
        if (z) {
            F.putExtra("open_keyboard", true);
        }
        if (bundle2 != null) {
            F.putExtras(bundle2);
        }
        if (kpt.a()) {
            optional.ifPresent(new ibo(F, 5));
        }
        if (bundle != null && bundle.getBoolean("via_share_intent", false)) {
            F.putExtras(bundle);
            akto.n(context, F);
        } else {
            akto.o(context, F, bundle);
        }
    }

    private final Intent I(Context context, ConversationId conversationId, Uri uri, lrf lrfVar, boolean z) {
        Intent F = F(context, MainActivity.class, conversationId, 11, null, lrfVar, null, false, false, z);
        if (uri != null) {
            F.putExtra("target_uri", uri);
        }
        F.setData(upb.k(context, conversationId));
        F.putExtra("via_notification", true);
        return F;
    }

    @Override // defpackage.qoq
    public final boolean A(Activity activity, int i, ConversationId conversationId, Integer num, MessageCoreData messageCoreData, lrf lrfVar, boolean z) {
        d.s(true);
        Intent G = G(activity, MainActivity.class, conversationId, rvc.a, num, messageCoreData, lrfVar, z);
        G.putExtra("via_share_intent", true);
        try {
            activity.startActivityForResult(G, i, null);
            return true;
        } catch (SecurityException e) {
            xyl.p("failure to start conversation for sharing", e);
            return false;
        }
    }

    @Override // defpackage.qoq
    public final Intent B(Context context, ConversationId conversationId, lrf lrfVar, boolean z) {
        Intent I = I(context, conversationId, null, lrfVar, z);
        D(I, (MessageIdType) Objects.requireNonNullElse(null, rvc.a), false);
        return I;
    }

    @Override // defpackage.qoq
    public final int a(Intent intent, ConversationId conversationId) {
        return C(intent, conversationId);
    }

    @Override // defpackage.qoq
    public final PendingIntent b(Context context) {
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        intent.putExtra("via_notification", true);
        return qop.a(context, intent, 0);
    }

    @Override // defpackage.qoq
    public final PendingIntent c(Context context, ammf ammfVar) {
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        intent.putExtra("via_notification", true);
        intent.putExtra("via_report_issue_notification", true);
        aowt.h(intent, "report_issue_event_key", ammfVar);
        return qop.a(context, intent, 0);
    }

    @Override // defpackage.qoq
    public final Intent d(Context context) {
        return new Intent(context, (Class<?>) MainActivity.class);
    }

    @Override // defpackage.qoq
    public final Intent e(Context context) {
        Intent intent = new Intent(context, (Class<?>) LaunchConversationActivity.class);
        intent.putExtra("via_share_intent", true);
        intent.setFlags(1140850689);
        return intent;
    }

    @Override // defpackage.qoq
    public final /* synthetic */ void f(Context context) {
        context.startActivity(new Intent(context, (Class<?>) MainActivity.class));
    }

    @Override // defpackage.qoq
    public final /* synthetic */ void g(Context context) {
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        intent.addFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
        context.startActivity(intent);
    }

    @Override // defpackage.qoq
    public final /* synthetic */ void h(Context context) {
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        intent.addFlags(VCardConfig.FLAG_APPEND_TYPE_PARAM);
        intent.addFlags(536870912);
        context.startActivity(intent);
    }

    @Override // defpackage.qoq
    public final void i(Context context, Bundle bundle) {
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        intent.addFlags(268468224);
        if (bundle != null) {
            intent.setAction("android.intent.action.MAIN");
            intent.putExtras(bundle);
        }
        akto.n(context, intent);
    }

    @Override // defpackage.qoq
    public final Intent j(Context context, ConversationId conversationId) {
        Intent F = F(context, MainActivity.class, conversationId, null, null, null, null, true, true, false);
        D(F, rvc.a, true);
        if (!E(context)) {
            F.setData(upb.k(context, conversationId));
        }
        F.putExtra("via_notification", false);
        F.putExtra("mapi_conversation_id", conversationId);
        return F;
    }

    @Override // defpackage.qoq
    public final Intent k(Context context, ConversationId conversationId, MessageCoreData messageCoreData, boolean z, Bundle bundle) {
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        lpg.m(conversationId, intent, false);
        if (messageCoreData != null) {
            intent.putExtra("draft_data", messageCoreData);
        }
        intent.putExtra("scroll_to_bottom", false);
        intent.putExtra("should_launch_home_on_back", true);
        intent.putExtra("open_keyboard", z);
        if (bundle != null && bundle.containsKey("FOCUS_ON_FIELD")) {
            intent.putExtra("FOCUS_ON_FIELD", bundle.getString("FOCUS_ON_FIELD"));
        }
        intent.setFlags(131072);
        return intent;
    }

    @Override // defpackage.qoq
    public final PendingIntent l(Context context, ConversationId conversationId, ammf ammfVar, boolean z) {
        Intent w = w(context, conversationId, null, true, z);
        w.putExtra("via_report_issue_notification", true);
        aowt.h(w, "report_issue_event_key", ammfVar);
        return qop.a(context, w, C(w, conversationId));
    }

    @Override // defpackage.qoq
    public final PendingIntent m(Context context, ConversationId conversationId, boolean z) {
        Intent w = w(context, conversationId, null, true, z);
        return qop.a(context, w, C(w, conversationId));
    }

    @Override // defpackage.qoq
    public final void n(Context context, ConversationId conversationId, MessageId messageId, Uri uri) {
        Intent I = I(context, conversationId, uri, null, false);
        if (messageId != null) {
            I.putExtra("mapi_message_id", messageId);
            if (messageId instanceof BugleMessageId) {
                I.putExtra("message_id", ((BugleMessageId) messageId).c().a());
            }
        }
        I.setData(upb.k(context, conversationId));
        I.addFlags(VCardConfig.FLAG_APPEND_TYPE_PARAM);
        akto.n(context, I);
    }

    @Override // defpackage.qoq
    public final void o(Context context, ConversationId conversationId, MessageId messageId, Uri uri) {
        H(context, conversationId, rvc.a, messageId, uri, null, null, null, null, null, false, null, Optional.empty(), true, false);
    }

    @Override // defpackage.qoq
    public final /* synthetic */ void p(Context context, ConversationId conversationId, Integer num, MessageCoreData messageCoreData, boolean z, Bundle bundle) {
        x(context, conversationId, rvc.a, num, messageCoreData, null, null, null, z, bundle, Optional.empty(), true, false);
    }

    @Override // defpackage.qoq
    public final /* synthetic */ void q(Context context, ConversationId conversationId, Integer num, MessageCoreData messageCoreData, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("via_share_intent", true);
        x(context, conversationId, rvc.a, num, messageCoreData, null, bundle, null, false, null, Optional.empty(), true, z);
    }

    @Override // defpackage.qoq
    public final void r(Context context, ConversationId conversationId) {
        Intent G = G(context, MainActivity.class, conversationId, rvc.a, null, null, null, false);
        G.setFlags(335544320);
        akto.n(context, G);
    }

    @Override // defpackage.qoq
    public final void s(Context context, Optional optional) {
        Intent G = G(context, MainActivity.class, InvalidConversationId.a, rvc.a, 2, null, null, false);
        if (kpt.a()) {
            optional.ifPresent(new ibo(G, 6));
        }
        G.putExtra("via_start_chat_intent", true);
        akto.n(context, G);
    }

    @Override // defpackage.qoq
    public final void t(Context context, ConversationId conversationId, MessageCoreData messageCoreData, boolean z, Bundle bundle) {
        Intent intent = new Intent(context, (Class<?>) LaunchConversationShimActivity.class);
        intent.putExtra("conversation_id", conversationId.b());
        intent.putExtra("mapi_conversation_id", conversationId);
        intent.putExtra("draft_data", messageCoreData);
        intent.putExtra("open_keyboard", z);
        if (bundle != null && bundle.containsKey("FOCUS_ON_FIELD")) {
            intent.putExtra("FOCUS_ON_FIELD", bundle.getString("FOCUS_ON_FIELD"));
        }
        intent.putExtra("force_conversation_1", false);
        intent.addFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
        akto.n(context, intent);
    }

    @Override // defpackage.qoq
    public final void u(Context context, ConversationId conversationId, MessageCoreData messageCoreData, Bundle bundle, Optional optional, boolean z) {
        H(context, conversationId, rvc.a, null, null, null, messageCoreData, null, null, null, true, bundle, optional, true, z);
    }

    @Override // defpackage.qoq
    public final /* synthetic */ void v(Context context, ConversationId conversationId, IncomingDraft incomingDraft, Bundle bundle, boolean z) {
        Optional empty = Optional.empty();
        xyl.k(true);
        Intent F = F(context, MainActivity.class, conversationId, null, null, null, null, true, false, z);
        F.putExtra("incoming_draft", incomingDraft);
        F.putExtra("open_keyboard", true);
        F.putExtras(bundle);
        if (kpt.a()) {
            empty.ifPresent(new ibo(F, 4));
        }
        akto.o(context, F, null);
    }

    @Override // defpackage.qoq
    public final Intent w(Context context, ConversationId conversationId, lrf lrfVar, boolean z, boolean z2) {
        Intent G = G(context, MainActivity.class, conversationId, rvc.a, null, null, lrfVar, z2);
        if (!E(context)) {
            G.setData(upb.k(context, conversationId));
        }
        G.putExtra("via_notification", z);
        return G;
    }

    public final void x(Context context, ConversationId conversationId, MessageIdType messageIdType, Integer num, MessageCoreData messageCoreData, lrf lrfVar, Bundle bundle, String str, boolean z, Bundle bundle2, Optional optional, boolean z2, boolean z3) {
        H(context, conversationId, messageIdType, null, null, num, messageCoreData, lrfVar, bundle, str, z, bundle2, optional, z2, z3);
    }

    @Override // defpackage.qoq
    public final void y(Context context, ConversationId conversationId, MessageIdType messageIdType, lrf lrfVar, Optional optional, boolean z) {
        x(context, conversationId, messageIdType, null, null, lrfVar, null, "", false, null, optional, false, z);
    }

    @Override // defpackage.qoq
    public final boolean z(Activity activity, int i, ConversationId conversationId, IncomingDraft incomingDraft, Integer num, MessageCoreData messageCoreData, lrf lrfVar, boolean z) {
        d.s(true);
        Intent G = G(activity, MainActivity.class, conversationId, rvc.a, num, messageCoreData, lrfVar, z);
        G.putExtra("via_share_intent", true);
        G.putExtra("incoming_draft", incomingDraft);
        try {
            activity.startActivityForResult(G, i, null);
            return true;
        } catch (SecurityException e) {
            xyl.p("failure to start conversation for sharing", e);
            return false;
        }
    }
}
