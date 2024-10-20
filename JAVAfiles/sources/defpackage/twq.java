package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class twq implements rwo {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/downgrade/DowngradeOnUnencryptedMessageListener");
    private final armf b;
    private final armf c;
    private final izc d;

    public twq(armf armfVar, izc izcVar, armf armfVar2) {
        this.c = armfVar;
        this.d = izcVar;
        this.b = armfVar2;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v17, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6, types: [msh, java.lang.Object] */
    @Override // defpackage.rwo
    public final void c(MessageCoreData messageCoreData) {
        String ag = messageCoreData.ag();
        Optional ac = messageCoreData.ac();
        if (messageCoreData.cn()) {
            try {
                String aw = messageCoreData.aw();
                if (aw != null) {
                    ((uof) this.d.a.b()).e("downgrade_on_unencrypted_message", aw);
                    return;
                }
                return;
            } catch (IndexOutOfBoundsException unused) {
                alvw g = a.g();
                g.X(alwp.a, "BugleDataModel");
                ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/downgrade/DowngradeOnUnencryptedMessageListener", "afterMessageInserted", 68, "DowngradeOnUnencryptedMessageListener.java")).q("Nothing to cancel in DowngradeOnUnencryptedMessageQueue");
                return;
            }
        }
        if (!messageCoreData.cs() && ag != null) {
            if (ajru.b.f(ag) || ajru.e.f(ag) || ajru.c.f(ag)) {
                aozy createBuilder = twr.a.createBuilder();
                String conversationIdType = messageCoreData.z().toString();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                twr twrVar = (twr) createBuilder.b;
                conversationIdType.getClass();
                twrVar.c = conversationIdType;
                long q = messageCoreData.q();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                ((twr) createBuilder.b).d = q;
                if (((okg) this.c.b()).a()) {
                    qei w = messageCoreData.w();
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    twr twrVar2 = (twr) createBuilder.b;
                    w.getClass();
                    twrVar2.h = w;
                    twrVar2.b |= 2;
                }
                String str = messageCoreData.E().b;
                if (str != null) {
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    ((twr) createBuilder.b).e = str;
                }
                String valueOf = String.valueOf(String.valueOf(messageCoreData.z()));
                if (ac.isPresent() && ac.get().e().isPresent()) {
                    qei qeiVar = (qei) ac.get().e().get();
                    String str2 = qeiVar.d;
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    apag apagVar = createBuilder.b;
                    twr twrVar3 = (twr) apagVar;
                    twrVar3.g = qeiVar;
                    twrVar3.b |= 1;
                    if (!apagVar.isMutable()) {
                        createBuilder.u();
                    }
                    String concat = "etouffee-downgrade-conversation-".concat(valueOf);
                    twr twrVar4 = (twr) createBuilder.b;
                    str2.getClass();
                    twrVar4.f = str2;
                    twr twrVar5 = (twr) createBuilder.s();
                    String str3 = concat + "-" + messageCoreData.aw();
                    ((uof) this.d.a.b()).b(upk.b("downgrade_on_unencrypted_message", twrVar5, new uta(null, str3, null, str3, null, null)));
                    return;
                }
                alvw i = a.i();
                i.X(alwp.a, "BugleDataModel");
                ((alvg) ((alvg) i).h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/downgrade/DowngradeOnUnencryptedMessageListener", "afterMessageInserted", 95, "DowngradeOnUnencryptedMessageListener.java")).q("SenderIdentity not found. Unable to downgrade.");
                ((mbl) this.b.b()).e("Bugle.Etouffee.Conversation.Encryption.Update", uax.SKIP_DOWNGRADE_DUE_TO_MISSING_SENDER_IDENTITY.t);
            }
        }
    }

    @Override // defpackage.rwo
    public final /* synthetic */ void g() {
    }

    @Override // defpackage.rwo
    public final void d(MessageCoreData messageCoreData) {
    }

    @Override // defpackage.rwo
    public final void e(MessageCoreData messageCoreData) {
    }
}
