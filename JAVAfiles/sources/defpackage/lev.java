package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lev implements emx {
    final /* synthetic */ lex a;
    final /* synthetic */ ConversationId b;
    final /* synthetic */ cg c;
    final /* synthetic */ MessageCoreData d;
    final /* synthetic */ lrf e;

    public lev(lex lexVar, ConversationId conversationId, cg cgVar, lrf lrfVar, MessageCoreData messageCoreData) {
        this.a = lexVar;
        this.b = conversationId;
        this.c = cgVar;
        this.e = lrfVar;
        this.d = messageCoreData;
    }

    @Override // defpackage.emx
    public final void d(enm enmVar) {
        lex lexVar = this.a;
        ConversationIdType u = lexVar.u(this.b);
        u.getClass();
        lexVar.V(u, ixd.z(this.c), this.e, this.d);
    }

    @Override // defpackage.emx
    public final void h(enm enmVar) {
        ConversationId conversationId = this.b;
        lep q = this.a.q();
        String b = conversationId.b();
        b.getClass();
        q.a(new lem(b));
    }

    @Override // defpackage.emx
    public final void i(enm enmVar) {
        this.a.q().a(new len());
    }

    @Override // defpackage.emx
    public final /* synthetic */ void f(enm enmVar) {
    }

    @Override // defpackage.emx
    public final /* synthetic */ void gF(enm enmVar) {
    }

    @Override // defpackage.emx
    public final /* synthetic */ void gG(enm enmVar) {
    }
}
