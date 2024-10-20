package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vxi implements iin {
    private static final alwo a = alwo.o("BugleGroupManagement");
    private final vxk b;

    public vxi(vxk vxkVar) {
        this.b = vxkVar;
    }

    @Override // defpackage.iin
    public final void a(rrl rrlVar) {
        if (!rrlVar.b.d()) {
            ((alwl) a.m().h("com/google/android/apps/messaging/shared/rcs/groups/recovery/RecoverDisabledRcsGroupOnConversationOpenedHandler", "onConversationOpened", 48, "RecoverDisabledRcsGroupOnConversationOpenedHandler.java")).q("Recover disabled RCS group disabled because this conversation is not a RCS group conversation.");
            return;
        }
        vxk vxkVar = this.b;
        ConversationIdType conversationIdType = rrlVar.c;
        ikl iklVar = rrlVar.b;
        vxkVar.a(conversationIdType, iklVar.g, iklVar.t);
    }
}
