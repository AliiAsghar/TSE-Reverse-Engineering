package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.receiver.CopyOtpReceiver;
import com.google.android.apps.messaging.shared.receiver.RestoreReceiver;
import com.google.android.apps.messaging.shared.receiver.SendStatusReceiver;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wld implements wnt {
    private static final Uri a = Uri.parse("content://buglesmssend");
    private final Context b;
    private final xca c;
    private final rhk d;
    private final rix e;

    public wld(Context context, xca xcaVar, rhk rhkVar, rix rixVar) {
        this.b = context;
        this.c = xcaVar;
        this.d = rhkVar;
        this.e = rixVar;
    }

    @Override // defpackage.wnt
    public final PendingIntent a(String str, Uri uri, int i, int i2, int i3, MessageIdType messageIdType, String str2, long j) {
        Intent intent = new Intent(str, Uri.withAppendedPath(a, messageIdType.a()), this.b, SendStatusReceiver.class);
        intent.putExtra("partCnt", i);
        intent.putExtra("partId", i2);
        intent.putExtra("subId", i3);
        intent.putExtra(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, uri);
        intent.putExtra("message_id", messageIdType.a());
        intent.putExtra("destination", str2);
        intent.putExtra("messageId", j);
        this.c.g(intent);
        return PendingIntent.getBroadcast(this.b, i2, intent, yhy.a);
    }

    @Override // defpackage.wnt
    public final Intent b(Uri uri, Uri uri2, Bundle bundle, long j) {
        Intent intent = new Intent("com.google.android.apps.messaging.shared.receiver.SendStatusReceiver.MMS_DOWNLOADED", uri, this.b, SendStatusReceiver.class);
        this.c.g(intent);
        intent.putExtra("content_uri", uri2);
        intent.putExtra("messageId", j);
        intent.putExtras(bundle);
        return intent;
    }

    @Override // defpackage.wnt
    public final Intent c(Context context, Uri uri, Uri uri2, boolean z, Bundle bundle, long j) {
        Intent intent = new Intent("com.google.android.apps.messaging.shared.receiver.SendStatusReceiver.MMS_SENT", uri, context, SendStatusReceiver.class);
        intent.putExtra("content_uri", uri2);
        intent.putExtra("response_important", z);
        intent.putExtra("messageId", j);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        this.c.g(intent);
        return intent;
    }

    @Override // defpackage.wnt
    public final Intent d() {
        Intent intent = new Intent("com.lge.bnr.intent.action.REQUEST_MESSAGE").setClass(this.b, RestoreReceiver.class);
        intent.putExtra("BNR_MODE", 2);
        return intent;
    }

    @Override // defpackage.wnt
    public final PendingIntent e(String str, ConversationIdType conversationIdType, MessageIdType messageIdType) {
        Context context = this.b;
        lqn f = lqn.f(context, CopyOtpReceiver.class, "android.intent.action.VIEW");
        f.c(context.getPackageName());
        Intent a2 = f.a();
        a2.setAction("com.google.android.apps.messaging.copy_otp");
        a2.addCategory(conversationIdType.a());
        a2.putExtra("otp_code", str);
        a2.putExtra("conversation_id", conversationIdType.a());
        a2.putExtra("mapi_conversation_id", new BugleConversationId(conversationIdType));
        a2.putExtra("message_id", messageIdType.a());
        PendingIntent b = aipr.b(this.b, 123, a2, yhy.a(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS));
        b.getClass();
        return b;
    }

    @Override // defpackage.wnt
    public final PendingIntent f(ConversationIdType conversationIdType) {
        Action h = this.e.h(conversationIdType, rvc.a, true);
        rhk rhkVar = this.d;
        Context context = this.b;
        return rhkVar.a(context, h, 120, false, upb.i(context, conversationIdType));
    }
}
