package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uxy implements rtx {
    public final armf a;
    public final armf b;
    public final ndi c;
    private final arwe d;

    public uxy(armf armfVar, arwe arweVar, armf armfVar2, ndi ndiVar) {
        armfVar.getClass();
        arweVar.getClass();
        armfVar2.getClass();
        ndiVar.getClass();
        this.a = armfVar;
        this.d = arweVar;
        this.b = armfVar2;
        this.c = ndiVar;
    }

    @Override // defpackage.rtx
    public final void a(ConversationIdType conversationIdType, int i) {
        if (!uzz.g()) {
            return;
        }
        qjh.l(this.d, null, new uwn(this, conversationIdType, (arpe) null, 7), 3);
    }
}
