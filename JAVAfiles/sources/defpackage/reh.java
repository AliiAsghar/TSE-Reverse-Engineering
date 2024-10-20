package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class reh {
    private static final alwo c = alwo.o("Bugle");
    private static final alwo d = alwo.o("BugleNotifications");
    public final anen a;
    public final yyt b;
    private final armf e;
    private final armf f;
    private final armf g;
    private final armf h;
    private final armf i;

    public reh(armf armfVar, armf armfVar2, armf armfVar3, yyt yytVar, armf armfVar4, armf armfVar5, anen anenVar) {
        this.e = armfVar;
        this.f = armfVar2;
        this.g = armfVar3;
        this.b = yytVar;
        this.h = armfVar4;
        this.i = armfVar5;
        this.a = anenVar;
    }

    private final reg d(MessageIdType messageIdType) {
        MessageCoreData u = ((rwd) this.e.b()).u(messageIdType);
        if (u == null) {
            alwl alwlVar = (alwl) c.i();
            alwlVar.X(ydl.a, messageIdType.a());
            ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/datamodel/action/ReceiveSmartSuggestionsActionHelper", "getLatestMessageId", 153, "ReceiveSmartSuggestionsActionHelper.java")).q("Couldn't add Smart suggestions to conversation: target message ID not found.");
            return null;
        }
        armf armfVar = this.e;
        ConversationIdType z = u.z();
        MessageCoreData k = ((rwd) armfVar.b()).k(z);
        if (k == null) {
            ((alwl) ((alwl) c.i()).h("com/google/android/apps/messaging/shared/datamodel/action/ReceiveSmartSuggestionsActionHelper", "getLatestMessageId", 160, "ReceiveSmartSuggestionsActionHelper.java")).q("Couldn't add Smart suggestions to conversation: latest message in conversation was null.");
            return null;
        }
        MessageIdType B = k.B();
        if (B != null) {
            if (z != null) {
                return new reg(B, z);
            }
            throw new NullPointerException("Null conversationId");
        }
        throw new NullPointerException("Null lastMessageId");
    }

    public final akul a(MessageIdType messageIdType, Supplier supplier) {
        Object obj;
        reg d2 = d(messageIdType);
        if (((Boolean) ((utz) ier.h.get()).e()).booleanValue() && d2 != null && !((Optional) ((apxx) this.g).a).isEmpty()) {
            lfh lfhVar = (lfh) ((Optional) ((apxx) this.g).a).get();
            obj = supplier.get();
            return lfhVar.a();
        }
        return aktp.ag(false);
    }

    public final akul b(MessageIdType messageIdType, Supplier supplier) {
        Object obj;
        if (d(messageIdType) != null && yig.e() && !((Optional) ((apxx) this.f).a).isEmpty()) {
            uzk uzkVar = (uzk) ((Optional) ((apxx) this.f).a).get();
            obj = supplier.get();
            return uzkVar.b();
        }
        return aktp.ag(false);
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [armf, java.lang.Object] */
    public final void c(MessageIdType messageIdType) {
        reg d2 = d(messageIdType);
        if (d2 == null) {
            return;
        }
        yyt yytVar = this.b;
        d2.a.getClass();
        d2.b.getClass();
        ((xze) yytVar.a).m("Smart suggestions are not enabled");
        if (((ple) this.i.b()).a()) {
            ((alwl) ((alwl) d.g()).h("com/google/android/apps/messaging/shared/datamodel/action/ReceiveSmartSuggestionsActionHelper", "refreshNotificationActions", 188, "ReceiveSmartSuggestionsActionHelper.java")).q("Using system replies, not refreshing for smart replies");
        }
    }
}
