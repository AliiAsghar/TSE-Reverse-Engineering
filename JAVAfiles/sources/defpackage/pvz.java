package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ChatMessage;
import com.google.android.rcs.client.messaging.data.ContentType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class pvz {
    private static final pwb a = new pwb();

    public static final qej a(ChatMessage chatMessage) {
        aozy createBuilder = qej.a.createBuilder();
        qel qelVar = (qel) a.m().fu(ContentType.d(chatMessage.getContentType()));
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qej qejVar = (qej) createBuilder.b;
        qelVar.getClass();
        qejVar.c = qelVar;
        qejVar.b |= 1;
        aozb w = aozb.w(chatMessage.getContent());
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qej qejVar2 = (qej) createBuilder.b;
        qejVar2.b |= 2;
        qejVar2.d = w;
        return (qej) createBuilder.s();
    }
}
