package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jfm implements jcu {
    public final jcu a;
    public final jcu b;
    private final asai c;
    private final asai d;
    private final Set e;

    public jfm(jcu jcuVar, jcu jcuVar2, ConversationId conversationId, asai asaiVar, armf armfVar) {
        conversationId.getClass();
        asaiVar.getClass();
        armfVar.getClass();
        this.a = jcuVar;
        this.b = jcuVar2;
        this.c = asaiVar;
        this.d = new asdn(new jra((arpe) null, this, conversationId, 1), asaiVar);
        this.e = aqjn.e(khe.a);
    }

    @Override // defpackage.jcu
    public final Set a() {
        return this.e;
    }

    @Override // defpackage.jcu
    public final asai b() {
        return this.d;
    }
}
