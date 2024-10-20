package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.conversation2.api.OpenConversation2Arguments;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jdb implements jcu {
    public final Context a;
    public final ConversationId b;
    public final OpenConversation2Arguments c;
    public final armf d;
    public final armf e;
    public final armf f;
    public final asai g;
    public final arqw h;
    public final lkd i;
    private final arwe j;
    private final asai k;
    private final asai l;
    private final Set m;

    public jdb(Context context, arwe arweVar, asai asaiVar, ConversationId conversationId, lkd lkdVar, OpenConversation2Arguments openConversation2Arguments, asai asaiVar2, asai asaiVar3, armf armfVar, armf armfVar2, armf armfVar3, asai asaiVar4) {
        context.getClass();
        arweVar.getClass();
        asaiVar.getClass();
        conversationId.getClass();
        lkdVar.getClass();
        openConversation2Arguments.getClass();
        asaiVar2.getClass();
        asaiVar3.getClass();
        armfVar.getClass();
        armfVar3.getClass();
        asaiVar4.getClass();
        this.a = context;
        this.j = arweVar;
        this.b = conversationId;
        this.i = lkdVar;
        this.c = openConversation2Arguments;
        this.k = asaiVar3;
        this.d = armfVar;
        this.e = armfVar2;
        this.f = armfVar3;
        this.l = asaiVar4;
        this.g = arrn.Q(asaiVar, asaiVar2, asaiVar3, asaiVar4, new kkf(this, (arpe) null, 1));
        this.m = aqjn.e(khe.a);
        this.h = qkf.h(new jvq((Object) this, 1, (byte[]) null), arweVar);
    }

    @Override // defpackage.jcu
    public final Set a() {
        return this.m;
    }

    @Override // defpackage.jcu
    public final asai b() {
        return this.g;
    }
}
