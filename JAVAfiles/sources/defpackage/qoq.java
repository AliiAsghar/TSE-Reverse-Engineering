package defpackage;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface qoq {
    boolean A(Activity activity, int i, ConversationId conversationId, Integer num, MessageCoreData messageCoreData, lrf lrfVar, boolean z);

    Intent B(Context context, ConversationId conversationId, lrf lrfVar, boolean z);

    int a(Intent intent, ConversationId conversationId);

    PendingIntent b(Context context);

    PendingIntent c(Context context, ammf ammfVar);

    Intent d(Context context);

    Intent e(Context context);

    void f(Context context);

    void g(Context context);

    void h(Context context);

    void i(Context context, Bundle bundle);

    Intent j(Context context, ConversationId conversationId);

    Intent k(Context context, ConversationId conversationId, MessageCoreData messageCoreData, boolean z, Bundle bundle);

    PendingIntent l(Context context, ConversationId conversationId, ammf ammfVar, boolean z);

    PendingIntent m(Context context, ConversationId conversationId, boolean z);

    void n(Context context, ConversationId conversationId, MessageId messageId, Uri uri);

    void o(Context context, ConversationId conversationId, MessageId messageId, Uri uri);

    void p(Context context, ConversationId conversationId, Integer num, MessageCoreData messageCoreData, boolean z, Bundle bundle);

    void q(Context context, ConversationId conversationId, Integer num, MessageCoreData messageCoreData, boolean z);

    void r(Context context, ConversationId conversationId);

    void s(Context context, Optional optional);

    void t(Context context, ConversationId conversationId, MessageCoreData messageCoreData, boolean z, Bundle bundle);

    void u(Context context, ConversationId conversationId, MessageCoreData messageCoreData, Bundle bundle, Optional optional, boolean z);

    void v(Context context, ConversationId conversationId, IncomingDraft incomingDraft, Bundle bundle, boolean z);

    Intent w(Context context, ConversationId conversationId, lrf lrfVar, boolean z, boolean z2);

    void y(Context context, ConversationId conversationId, MessageIdType messageIdType, lrf lrfVar, Optional optional, boolean z);

    boolean z(Activity activity, int i, ConversationId conversationId, IncomingDraft incomingDraft, Integer num, MessageCoreData messageCoreData, lrf lrfVar, boolean z);
}
