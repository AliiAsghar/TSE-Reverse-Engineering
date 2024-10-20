package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tsq implements rtx {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/datamodel/etouffee/conversationencryptionstatus/E2eeConversationCreationListener");
    public final armf b;
    public final armf c;
    private final arwe d;

    public tsq(armf armfVar, arwe arweVar, armf armfVar2) {
        armfVar.getClass();
        arweVar.getClass();
        armfVar2.getClass();
        this.b = armfVar;
        this.d = arweVar;
        this.c = armfVar2;
    }

    @Override // defpackage.rtx
    public final void a(ConversationIdType conversationIdType, int i) {
        if (i != 2) {
            return;
        }
        qjh.l(this.d, null, new rdx(this, conversationIdType, (arpe) null, 11), 3);
    }
}
