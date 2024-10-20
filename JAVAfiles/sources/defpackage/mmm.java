package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mmm implements mml {
    private static final alwo a = alwo.o("BugleConversation");
    private static final xny b = new xnx("SendingContext::onConversationOpened");
    private final armf c;

    public mmm(armf armfVar) {
        this.c = armfVar;
    }

    @Override // defpackage.mml
    public final akrh a() {
        return b.a();
    }

    @Override // defpackage.mml
    public final akul b(BugleConversation bugleConversation, miv mivVar) {
        akrh e = aktp.e("SendingContextOpenConversationListener::onConversationOpened::convoV2");
        try {
            ((alwl) ((alwl) a.d()).h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/SendingContextOpenConversationListener", "onConversationOpened", 52, "SendingContextOpenConversationListener.java")).q("executing SendingContextOpenConversationListener for convo v2.");
            akul a2 = ((qyj) this.c.b()).a(((DefaultConversation) bugleConversation).a.a);
            e.b(a2);
            e.close();
            return a2;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
