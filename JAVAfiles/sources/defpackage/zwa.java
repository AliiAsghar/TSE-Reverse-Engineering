package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zwa extends agmc {
    final /* synthetic */ ConversationIdType a;
    final /* synthetic */ zwb b;

    public zwa(zwb zwbVar, ConversationIdType conversationIdType) {
        this.a = conversationIdType;
        this.b = zwbVar;
    }

    @Override // defpackage.agmc
    public final /* bridge */ /* synthetic */ void a(agoz agozVar) {
        this.b.f.q(aktp.ag(null), "SPAM_BANNER_STATE_KEY".concat(String.valueOf(String.valueOf(this.a))));
    }
}
