package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mvm implements mto {
    private final arwe a;
    private final muj b;

    public mvm(arwe arweVar, muj mujVar, armf armfVar) {
        arweVar.getClass();
        armfVar.getClass();
        this.a = arweVar;
        this.b = mujVar;
    }

    @Override // defpackage.mto
    public final mtn a(BugleConversationId bugleConversationId, ncq ncqVar, ncq ncqVar2, ncq ncqVar3, mtc mtcVar, boolean z, boolean z2) {
        ncqVar.getClass();
        ncqVar2.getClass();
        ncqVar3.getClass();
        return new mvl(this.a, this.b.a(bugleConversationId, ncqVar, ncqVar2, ncqVar3, mtcVar, z, z2));
    }
}
