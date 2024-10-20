package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface rix extends rhp<Void> {
    Action b(int i);

    akul d(ConversationIdType conversationIdType);

    void e(ConversationIdType conversationIdType);

    void f(ConversationIdType conversationIdType);

    void g(ConversationIdType conversationIdType, Optional optional);

    Action h(ConversationIdType conversationIdType, MessageIdType messageIdType, boolean z);

    Action i(ConversationIdType[] conversationIdTypeArr, MessageIdType messageIdType);

    void j(ConversationIdType conversationIdType);
}
