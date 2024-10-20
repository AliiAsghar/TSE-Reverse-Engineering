package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.action.SendMessageToConversationOrParticipantsAction;
import com.google.android.apps.messaging.shared.datamodel.data.common.DeviceData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsDataImpl;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class rfz implements Callable {
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ rfz(SendMessageToConversationOrParticipantsAction sendMessageToConversationOrParticipantsAction, akul akulVar, akul akulVar2, rto rtoVar, long j, int i) {
        this.f = i;
        this.b = sendMessageToConversationOrParticipantsAction;
        this.c = akulVar;
        this.d = akulVar2;
        this.e = rtoVar;
        this.a = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        DeviceData deviceData;
        int i = this.f;
        if (i != 0) {
            if (i != 1) {
                MessageUsageStatisticsDataImpl l = ((rrl) this.b).l((amgj) this.e, this.a);
                l.l = (Optional) this.c;
                l.m = (Optional) this.d;
                return l;
            }
            ?? r7 = this.b;
            long j = this.a;
            Object obj = this.d;
            Object obj2 = this.c;
            return ((SendMessageToConversationOrParticipantsAction) this.e).j.c(null, (ConversationIdType) obj2, r7.a(), r7, (String) obj, "", 0L, j, true, true, 3, null);
        }
        Optional optional = (Optional) albo.bQ(this.c);
        Optional optional2 = (Optional) albo.bQ(this.d);
        SendMessageToConversationOrParticipantsAction sendMessageToConversationOrParticipantsAction = (SendMessageToConversationOrParticipantsAction) this.b;
        Optional j2 = sendMessageToConversationOrParticipantsAction.j(optional);
        if (!j2.isEmpty() && !optional2.isEmpty()) {
            MessageCoreData messageCoreData = (MessageCoreData) optional2.get();
            int intValue = ((Integer) j2.get()).intValue();
            rhl rhlVar = sendMessageToConversationOrParticipantsAction.u;
            amgj amgjVar = amgj.OBSOLETE_WEARABLE_REPLY;
            boolean y = rhlVar.y("initiated_by_secondary_device");
            if (y) {
                deviceData = new DeviceData(amfm.WEARABLE);
            } else {
                deviceData = null;
            }
            messageCoreData.bs(((rto) this.e).g(amgjVar, deviceData, this.a));
            sendMessageToConversationOrParticipantsAction.c.a(messageCoreData, true, null, null, intValue, Optional.empty(), 0L, y).z();
        } else {
            alvw i2 = SendMessageToConversationOrParticipantsAction.a.i();
            i2.X(alwp.a, "Bugle");
            ((alvg) ((alvg) i2).h("com/google/android/apps/messaging/shared/datamodel/action/SendMessageToConversationOrParticipantsAction", "executeInner", 477, "SendMessageToConversationOrParticipantsAction.java")).q("Unable to create conversation, invalid selfIdentity.");
        }
        return null;
    }

    public /* synthetic */ rfz(SendMessageToConversationOrParticipantsAction sendMessageToConversationOrParticipantsAction, ConversationIdType conversationIdType, SelfIdentityId selfIdentityId, String str, long j, int i) {
        this.f = i;
        this.e = sendMessageToConversationOrParticipantsAction;
        this.c = conversationIdType;
        this.b = selfIdentityId;
        this.d = str;
        this.a = j;
    }

    public /* synthetic */ rfz(rrl rrlVar, amgj amgjVar, long j, Optional optional, Optional optional2, int i) {
        this.f = i;
        this.b = rrlVar;
        this.e = amgjVar;
        this.a = j;
        this.c = optional;
        this.d = optional2;
    }
}
