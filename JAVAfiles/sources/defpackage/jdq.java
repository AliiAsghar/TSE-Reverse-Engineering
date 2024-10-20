package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jdq implements jcu {
    private final jcu a;
    private final asai b;
    private final Set c;

    public jdq(jcu jcuVar, ConversationId conversationId, armf armfVar) {
        conversationId.getClass();
        armfVar.getClass();
        this.a = jcuVar;
        this.b = ((jdp) jcuVar).i;
        this.c = ((jdp) jcuVar).j;
    }

    @Override // defpackage.jcu
    public final Set a() {
        return this.c;
    }

    @Override // defpackage.jcu
    public final asai b() {
        return this.b;
    }
}
