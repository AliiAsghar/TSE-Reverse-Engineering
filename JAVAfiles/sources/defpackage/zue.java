package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zue extends agmc {
    final /* synthetic */ ConversationIdType a;
    final /* synthetic */ zug b;

    public zue(zug zugVar, ConversationIdType conversationIdType) {
        this.a = conversationIdType;
        this.b = zugVar;
    }

    @Override // defpackage.agmc
    public final /* bridge */ /* synthetic */ void a(agoz agozVar) {
        this.b.p.q(aktp.ag(null), "ADD_CONTACT_BANNER_STATE_KEY".concat(this.a.toString()));
    }
}
