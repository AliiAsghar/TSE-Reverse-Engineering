package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.CheckActiveDesktopIsAliveAsyncAction;
import com.google.android.apps.messaging.shared.datamodel.action.GenericWorkerQueueAction;
import com.google.android.apps.messaging.shared.datamodel.action.InsertNewMessageAction;
import com.google.android.apps.messaging.shared.datamodel.action.InsertRcsMessageInTelephonyAction;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessConversationParticipantsUpdateAsyncAction;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessConversationUpdateAsyncAction;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessMessageUpdateAsyncAction;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessUserAlertAsyncAction;
import com.google.android.apps.messaging.shared.datamodel.action.ReceiveSmsMessageAction;
import com.google.android.apps.messaging.shared.datamodel.action.SendMessageToConversationOrParticipantsAction;
import com.google.android.apps.messaging.shared.datamodel.action.SetupExpressiveStickersAction;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class qyv implements algk {
    private final /* synthetic */ int a;

    public /* synthetic */ qyv(int i) {
        this.a = i;
    }

    @Override // defpackage.algk
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                CheckActiveDesktopIsAliveAsyncAction.a.r("Action failed.", (Throwable) obj);
                return null;
            case 1:
                xze xzeVar = CheckActiveDesktopIsAliveAsyncAction.a;
                return null;
            case 2:
                xyo d = GenericWorkerQueueAction.d.d();
                d.H("Work done");
                d.q();
                return null;
            case 3:
                MessageCoreData messageCoreData = (MessageCoreData) obj;
                alwo alwoVar = InsertNewMessageAction.a;
                return messageCoreData;
            case 4:
                uuf uufVar = InsertRcsMessageInTelephonyAction.a;
                return null;
            case 5:
                ProcessConversationParticipantsUpdateAsyncAction.a.r("Action failed.", (Throwable) obj);
                int i = alog.d;
                return alsx.a;
            case 6:
                ProcessConversationUpdateAsyncAction.a.r("Action failed.", (Throwable) obj);
                return null;
            case 7:
                xze xzeVar2 = ProcessConversationUpdateAsyncAction.a;
                return null;
            case 8:
                return ((angj) obj).c;
            case 9:
                ProcessMessageUpdateAsyncAction.a.r("Action failed.", (Throwable) obj);
                return null;
            case 10:
                xze xzeVar3 = ProcessUserAlertAsyncAction.a;
                return null;
            case 11:
                ProcessUserAlertAsyncAction.a.r("Action failed.", (Throwable) obj);
                return null;
            case 12:
                xze xzeVar4 = ProcessUserAlertAsyncAction.a;
                return null;
            case 13:
                ReceiveSmsMessageAction.a.n("Fail to insert to telephony", (Exception) obj);
                return null;
            case 14:
                ReceiveSmsMessageAction.a.k("SMS receiving END");
                return null;
            case 15:
                alhr alhrVar = rfa.a;
                return ((Optional) obj).map(new rbs(9));
            case 16:
                return null;
            case 17:
                Optional optional = (Optional) obj;
                alvi alviVar = SendMessageToConversationOrParticipantsAction.a;
                if (optional.isEmpty()) {
                    alvw i2 = SendMessageToConversationOrParticipantsAction.a.i();
                    i2.X(alwp.a, "Bugle");
                    ((alvg) ((alvg) i2).h("com/google/android/apps/messaging/shared/datamodel/action/SendMessageToConversationOrParticipantsAction", "getSelfIdentity", 576, "SendMessageToConversationOrParticipantsAction.java")).q("Invalid selfId when creating conversation.");
                    return Optional.empty();
                }
                return optional.map(new rbs(14));
            case 18:
                return Optional.of((MessageCoreData) obj);
            case 19:
                SetupExpressiveStickersAction.a.n("Failed to setup expressive stickers.", (Exception) obj);
                return null;
            default:
                List list = (List) obj;
                xze xzeVar5 = SetupExpressiveStickersAction.a;
                if (list != null && !list.isEmpty()) {
                    return null;
                }
                throw new IllegalStateException("No sticker metadata available");
        }
    }
}
