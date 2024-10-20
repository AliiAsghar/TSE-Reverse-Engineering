package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mnj implements mng {
    private final armf a;
    private final armf b;

    public mnj(armf armfVar, armf armfVar2) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
    }

    @Override // defpackage.mng
    public final /* bridge */ /* synthetic */ ncq a(ConversationId conversationId) {
        anen anenVar = (anen) this.a.b();
        anenVar.getClass();
        iew iewVar = (iew) this.b.b();
        iewVar.getClass();
        return new mni(anenVar, iewVar, conversationId);
    }
}
