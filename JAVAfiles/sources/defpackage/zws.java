package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zws extends agmc {
    final /* synthetic */ ConversationIdType a;
    final /* synthetic */ zwt b;

    public zws(zwt zwtVar, ConversationIdType conversationIdType) {
        this.a = conversationIdType;
        this.b = zwtVar;
    }

    @Override // defpackage.agmc
    public final /* bridge */ /* synthetic */ void a(agoz agozVar) {
        this.b.j.q(aktp.ag(null), "UNBLOCK_UNSPAM_BANNER_STATE_KEY".concat(String.valueOf(String.valueOf(this.a))));
    }
}
