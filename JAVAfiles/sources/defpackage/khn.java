package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class khn {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/conversation2/preload/ConversationCachedLoaderImpl");
    public final miw b;
    public ibi c = null;

    public khn(miw miwVar) {
        this.b = miwVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.apps.messaging.shared.api.messaging.Conversation, java.lang.Object] */
    public final Conversation a() {
        ibi ibiVar = this.c;
        ibiVar.getClass();
        ?? r0 = ibiVar.a;
        this.c = null;
        return r0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.apps.messaging.shared.api.messaging.Conversation, java.lang.Object] */
    public final Boolean b(ConversationId conversationId) {
        aiut.c();
        ibi ibiVar = this.c;
        boolean z = false;
        if (ibiVar != null && conversationId.equals(ibiVar.a.c())) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
