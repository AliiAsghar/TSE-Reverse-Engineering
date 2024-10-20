package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.android.rcs.client.messaging.data.ChatMessage;
import com.google.android.rcs.client.messaging.data.ContentType;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajrs implements ajsi {
    public static final ContentType a;

    static {
        aoad g = ContentType.g();
        g.C(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT);
        g.B("plain");
        a = g.y();
    }

    @Override // defpackage.ajsi
    public final /* synthetic */ ajqz a(ajrt ajrtVar) {
        ajur ajurVar = new ajur(null);
        ajurVar.m(ajrtVar.a);
        ajurVar.n(ajrtVar.b);
        return ajurVar.l();
    }

    @Override // defpackage.ajsi
    public final /* synthetic */ ajrt b(ajqz ajqzVar) {
        ChatMessage chatMessage = (ChatMessage) ajqzVar;
        ajur ajurVar = new ajur(null);
        ajurVar.f(chatMessage.b());
        ajurVar.g(chatMessage.a());
        return ajurVar.e();
    }
}
