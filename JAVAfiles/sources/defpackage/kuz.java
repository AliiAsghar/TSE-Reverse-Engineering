package defpackage;

import android.view.ActionMode;
import android.view.View;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface kuz {
    Optional e();

    void f();

    void g();

    void h();

    void i(ActionMode.Callback callback, View view, String str);

    void j();

    void k(ConversationId conversationId, lrf lrfVar, boolean z);

    void l(ConversationId conversationId, MessageIdType messageIdType, lrf lrfVar, boolean z);
}
