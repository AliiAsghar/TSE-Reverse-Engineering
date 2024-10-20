package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sgf extends agps {
    public sgf() {
        super("business_conversations_metadata");
    }

    public final boolean b(ConversationIdType conversationIdType) {
        sgg sggVar = new sgg();
        sggVar.b(conversationIdType);
        return ae(new agpw(sggVar), "business_conversations_metadata-buildAndUpdateForConversationId");
    }

    @Override // defpackage.agps
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final agpr a() {
        ac();
        String str = this.c;
        agpt agptVar = this.e;
        return new agpr(str, this.a, this.b, this.d.g(), agptVar.a());
    }

    public final void d(psk pskVar) {
        Integer valueOf;
        Integer valueOf2;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 59050) {
            agnc.t("conversation_toolstone_state", intValue2);
        }
        if (intValue >= 59050) {
            if (pskVar == null) {
                this.a.putNull("conversation_toolstone_state");
            } else {
                this.a.put("conversation_toolstone_state", Integer.valueOf(pskVar.a()));
            }
        }
    }
}
