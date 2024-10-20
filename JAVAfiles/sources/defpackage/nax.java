package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.rbm.RbmConversationId;
import com.google.android.apps.messaging.shared.api.messaging.message.BugleMessageId;
import com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBugleMessageId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nax extends arpw implements arqv {
    final /* synthetic */ uja a;
    final /* synthetic */ ConversationId b;
    final /* synthetic */ nay c;
    final /* synthetic */ MessageId d;
    final /* synthetic */ Uri e;
    final /* synthetic */ long f;
    final /* synthetic */ mxr g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nax(uja ujaVar, ConversationId conversationId, nay nayVar, MessageId messageId, mxr mxrVar, Uri uri, long j, arpe arpeVar) {
        super(2, arpeVar);
        this.a = ujaVar;
        this.b = conversationId;
        this.c = nayVar;
        this.d = messageId;
        this.g = mxrVar;
        this.e = uri;
        this.f = j;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((nax) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        aqil.P(obj);
        CoreBugleMessageId coreBugleMessageId = new CoreBugleMessageId(((BugleMessageId) this.d).c(), this.g.d);
        ConversationId conversationId = this.b;
        d.s(conversationId instanceof RbmConversationId);
        ConversationIdType conversationIdType = ((RbmConversationId) conversationId).a;
        ((ujc) this.a.a).b(conversationIdType, coreBugleMessageId, this.e, this.f, new uji[0]);
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new nax(this.a, this.b, this.c, this.d, this.g, this.e, this.f, arpeVar);
    }
}
