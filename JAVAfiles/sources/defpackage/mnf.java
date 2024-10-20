package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mnf implements mng {
    private final armf a;

    public mnf(armf armfVar) {
        armfVar.getClass();
        this.a = armfVar;
    }

    @Override // defpackage.mng
    public final /* bridge */ /* synthetic */ ncq a(ConversationId conversationId) {
        Set set = (Set) this.a.b();
        set.getClass();
        return new mne(set, conversationId);
    }
}
