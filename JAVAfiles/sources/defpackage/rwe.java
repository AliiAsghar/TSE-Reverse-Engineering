package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rwe {
    public final armf a;
    public final armf b;
    public ConversationIdType c = ruy.a;
    public akul d = null;
    private final armf e;
    private final Executor f;

    public rwe(armf armfVar, armf armfVar2, armf armfVar3, anen anenVar) {
        this.a = armfVar;
        this.e = armfVar2;
        this.b = armfVar3;
        this.f = new anew(anenVar);
    }

    public final akul a(ConversationIdType conversationIdType, MessageIdType messageIdType, int i) {
        return aktp.ai(akto.k(d(new mid(this, conversationIdType, messageIdType, i, 2))), e());
    }

    public final akul b(ConversationIdType conversationIdType, int i) {
        return aktp.ai(akto.k(d(new mjw(this, conversationIdType, i, 4))), e());
    }

    public final akul c(ConversationIdType conversationIdType, MessageIdType messageIdType, int i) {
        String str;
        aiut.c();
        akul akulVar = this.d;
        if (conversationIdType.equals(this.c) && akulVar != null) {
            xzb.c("Bugle", "return preloadedMessagesFuture");
            this.c = ruy.a;
            this.d = null;
            return akulVar;
        }
        if (messageIdType != null) {
            str = "getLoadConversationMessagesAroundFuture";
        } else {
            str = "getLoadLatestConversationMessagesFuture";
        }
        xzb.d("Bugle", "return %s", str);
        if (!messageIdType.b()) {
            return a(conversationIdType, messageIdType, i);
        }
        return b(conversationIdType, i);
    }

    public final Callable d(Callable callable) {
        mgv mgvVar = (mgv) this.e.b();
        if (mgvVar == null) {
            return callable;
        }
        return new rbn(callable, mgvVar, mgvVar.a(), 2, (byte[]) null);
    }

    public final Executor e() {
        aiut.c();
        return this.f;
    }
}
