package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.rbm.RbmConversationId;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jep implements jcu {
    public final ConversationId a;
    public final armf b;
    private final asai c;
    private final Set d;

    public jep(Context context, lkd lkdVar, ConversationId conversationId, asai asaiVar, armf armfVar) {
        asai jeoVar;
        context.getClass();
        lkdVar.getClass();
        conversationId.getClass();
        asaiVar.getClass();
        armfVar.getClass();
        this.a = conversationId;
        this.b = armfVar;
        if (!(conversationId instanceof RbmConversationId)) {
            jeoVar = new aghw(null, 9);
        } else {
            jeoVar = new jeo(asaiVar, context, this, lkdVar, 0);
        }
        this.c = jeoVar;
        this.d = aqjn.e(khe.a);
    }

    @Override // defpackage.jcu
    public final Set a() {
        return this.d;
    }

    @Override // defpackage.jcu
    public final asai b() {
        return this.c;
    }
}
