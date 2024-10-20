package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface tsa {
    MessageCoreData a(ConversationIdType conversationIdType, MessageIdType messageIdType);

    akul b(String str);

    alog c(int i);

    alog d(ConversationIdType conversationIdType, alog alogVar);

    Optional e(MessageIdType messageIdType);

    void f(alog alogVar, ConversationIdType conversationIdType);

    @Deprecated
    void g(uax uaxVar);

    void h(SelfIdentityId selfIdentityId);

    void i(qei qeiVar, ConversationIdType conversationIdType, int i, uax uaxVar);

    @Deprecated
    void j(ConversationIdType conversationIdType, int i, uax uaxVar);

    boolean k(ConversationIdType conversationIdType);

    boolean l(MessageIdType messageIdType);
}
