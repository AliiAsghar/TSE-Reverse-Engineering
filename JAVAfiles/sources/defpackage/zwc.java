package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zwc implements ieb {
    public final Context a;
    public final armf b;
    public final ConversationId c;
    private final arpi d;
    private final arwe e;

    public zwc(Context context, armf armfVar, ConversationId conversationId, arpi arpiVar, arwe arweVar) {
        context.getClass();
        armfVar.getClass();
        conversationId.getClass();
        arpiVar.getClass();
        arweVar.getClass();
        this.a = context;
        this.b = armfVar;
        this.c = conversationId;
        this.d = arpiVar;
        this.e = arweVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [asai, java.lang.Object] */
    @Override // defpackage.ieb
    public final ascv a() {
        return akec.a(armd.n(new asaa(new gds((asai) ((zlc) this.b.b()).b, (arpe) null, 8)), this.d), this.e, new ifp(this, 17, (boolean[][][]) null));
    }

    @Override // defpackage.ieb
    public final /* synthetic */ boolean b() {
        return yqt.a().booleanValue();
    }
}
