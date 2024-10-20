package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zww extends agmc {
    final /* synthetic */ ConversationIdType a;
    final /* synthetic */ zwx b;

    public zww(zwx zwxVar, ConversationIdType conversationIdType) {
        this.a = conversationIdType;
        this.b = zwxVar;
    }

    @Override // defpackage.agmc
    public final /* bridge */ /* synthetic */ void a(agoz agozVar) {
        this.b.e.q(aktp.ag(null), "UNVERIFIED_SMS_BANNER_STATE_KEY".concat(this.a.toString()));
    }
}
