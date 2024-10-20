package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface miw {
    Conversation a(ConversationId conversationId, miv mivVar);

    ConversationId b(mpi mpiVar);

    ConversationId c(byte[] bArr);

    ncq d(ConversationId conversationId);

    ncq e(int i, boolean z);

    akul f(ConversationId conversationId, amfe amfeVar);

    akul g(ConversationId conversationId);

    akul h(mqy mqyVar);

    @Deprecated
    akul i(alog alogVar);

    akul j();

    akul k(alog alogVar, String str);

    akul l(Optional optional, alog alogVar, String str);

    akul m(ConversationId conversationId, mnk mnkVar, Recipient recipient);

    akul n(ConversationId conversationId);

    akul o(ConversationId conversationId, mnk mnkVar);

    akul p(Recipient recipient);

    akul q(ConversationId conversationId, String str);

    akul r(ConversationId conversationId, nfw nfwVar);

    akul s(ConversationId conversationId, String str, String str2, mxf mxfVar);

    akul t(ConversationId conversationId, mmy mmyVar);

    akul u(ConversationId conversationId, amfe amfeVar);

    akul v(ConversationId conversationId);

    akul w(ConversationId conversationId, amfe amfeVar);

    akul x(alog alogVar);

    akul y(alog alogVar);
}
