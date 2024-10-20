package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.SelfParticipantsRefreshAction;
import com.google.android.apps.messaging.shared.datamodel.action.SendMessageAction;
import com.google.android.apps.messaging.shared.datamodel.action.SendMessageToConversationOrParticipantsAction;
import com.google.android.apps.messaging.shared.datamodel.action.SendReportAction;
import com.google.android.apps.messaging.shared.datamodel.action.SetDittoSessionInactiveAction;
import com.google.android.apps.messaging.shared.datamodel.action.SetupExpressiveStickersAction;
import com.google.android.apps.messaging.shared.datamodel.action.SyncMessagesAction;
import com.google.android.apps.messaging.shared.datamodel.action.SyncNotificationChannelAction;
import com.google.android.apps.messaging.shared.datamodel.action.SyncTelephonyThreadsAction;
import com.google.android.apps.messaging.shared.datamodel.action.UpdateAttachmentAfterResizingAction;
import com.google.android.apps.messaging.shared.datamodel.action.UpdateCloudSyncMessageAction;
import com.google.android.apps.messaging.shared.datamodel.action.UpdateContactDisambiguationAction;
import com.google.android.apps.messaging.shared.datamodel.action.UpdateConversationEncryptionStatusAction;
import com.google.android.apps.messaging.shared.datamodel.action.UpdateConversationInteractiveTimestampAction;
import com.google.android.apps.messaging.shared.datamodel.action.UpdateConversationOptionsAction;
import com.google.android.apps.messaging.shared.datamodel.action.UpdateConversationXmsLatchAction;
import com.google.android.apps.messaging.shared.datamodel.action.UpdateMessagePartSizeAction;
import com.google.android.apps.messaging.shared.datamodel.action.UpdateParticipantColorAction;
import com.google.android.apps.messaging.shared.datamodel.action.UpdateParticipantRcsAvailableAction;
import com.google.android.apps.messaging.shared.datamodel.action.UpdateRbmBotParticipantAction;
import com.google.android.apps.messaging.shared.datamodel.action.UploadAttachmentsToBlobstoreAction;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rfw implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public rfw(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return ((rfx) yyb.aL(rfx.class)).NU().c(parcel);
            case 1:
                return ((SelfParticipantsRefreshAction.SelfParticipantsRefreshActionInjector) yyb.aL(SelfParticipantsRefreshAction.SelfParticipantsRefreshActionInjector.class)).NT().c(parcel);
            case 2:
                return ((SendMessageToConversationOrParticipantsAction.a) yyb.aL(SendMessageToConversationOrParticipantsAction.a.class)).NV().c(parcel);
            case 3:
                return ((SendReportAction.a) yyb.aL(SendReportAction.a.class)).dd().c(parcel);
            case 4:
                return ((SetDittoSessionInactiveAction.a) yyb.aL(SetDittoSessionInactiveAction.a.class)).NW().c(parcel);
            case 5:
                return ((SetupExpressiveStickersAction.a) yyb.aL(SetupExpressiveStickersAction.a.class)).NX().c(parcel);
            case 6:
                return new SyncMessagesAction(parcel, amdy.SYNC_MESSAGES_ACTION);
            case 7:
                return ((SyncNotificationChannelAction.a) yyb.aL(SyncNotificationChannelAction.a.class)).NY().c(parcel);
            case 8:
                return ((SyncTelephonyThreadsAction.SyncTelephonyThreadsActionInjector) yyb.aL(SyncTelephonyThreadsAction.SyncTelephonyThreadsActionInjector.class)).NZ().c(parcel);
            case 9:
                return ((UpdateAttachmentAfterResizingAction.a) yyb.aL(UpdateAttachmentAfterResizingAction.a.class)).Oa().c(parcel);
            case 10:
                return ((UpdateCloudSyncMessageAction.a) yyb.aL(UpdateCloudSyncMessageAction.a.class)).Ob().c(parcel);
            case 11:
                ((UpdateContactDisambiguationAction.a) yyb.aL(UpdateContactDisambiguationAction.a.class)).Pf();
                return rje.b(parcel);
            case 12:
                return ((UpdateConversationEncryptionStatusAction.a) yyb.aL(UpdateConversationEncryptionStatusAction.a.class)).Oc().c(parcel);
            case 13:
                return ((UpdateConversationInteractiveTimestampAction.a) yyb.aL(UpdateConversationInteractiveTimestampAction.a.class)).Od().c(parcel);
            case 14:
                return ((UpdateConversationOptionsAction.a) yyb.aL(UpdateConversationOptionsAction.a.class)).cL().c(parcel);
            case 15:
                return new UpdateConversationXmsLatchAction(parcel);
            case 16:
                return ((UpdateMessagePartSizeAction.a) yyb.aL(UpdateMessagePartSizeAction.a.class)).Oe().c(parcel);
            case 17:
                return ((UpdateParticipantColorAction.a) yyb.aL(UpdateParticipantColorAction.a.class)).cV().c(parcel);
            case 18:
                return new UpdateParticipantRcsAvailableAction(parcel);
            case 19:
                return ((UpdateRbmBotParticipantAction.a) yyb.aL(UpdateRbmBotParticipantAction.a.class)).Of().c(parcel);
            default:
                return ((UploadAttachmentsToBlobstoreAction.a) yyb.aL(UploadAttachmentsToBlobstoreAction.a.class)).de().c(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new SendMessageAction[i];
            case 1:
                return new SelfParticipantsRefreshAction[i];
            case 2:
                return new SendMessageToConversationOrParticipantsAction[i];
            case 3:
                return new SendReportAction[i];
            case 4:
                return new SetDittoSessionInactiveAction[i];
            case 5:
                return new SetupExpressiveStickersAction[i];
            case 6:
                return new SyncMessagesAction[i];
            case 7:
                return new SyncNotificationChannelAction[i];
            case 8:
                return new SyncTelephonyThreadsAction[i];
            case 9:
                return new UpdateAttachmentAfterResizingAction[i];
            case 10:
                return new UpdateCloudSyncMessageAction[i];
            case 11:
                return new UpdateContactDisambiguationAction[i];
            case 12:
                return new UpdateConversationEncryptionStatusAction[i];
            case 13:
                return new UpdateConversationInteractiveTimestampAction[i];
            case 14:
                return new UpdateConversationOptionsAction[i];
            case 15:
                return new UpdateConversationXmsLatchAction[i];
            case 16:
                return new UpdateMessagePartSizeAction[i];
            case 17:
                return new UpdateParticipantColorAction[i];
            case 18:
                return new UpdateParticipantRcsAvailableAction[i];
            case 19:
                return new UpdateRbmBotParticipantAction[i];
            default:
                return new UploadAttachmentsToBlobstoreAction[i];
        }
    }
}
