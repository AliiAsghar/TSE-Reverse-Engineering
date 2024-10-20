package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.InsertRcsMessageInTelephonyAction;
import com.google.android.apps.messaging.shared.datamodel.action.MarkAsReadAction;
import com.google.android.apps.messaging.shared.datamodel.action.MarkConversationNotYetDeliveredAction;
import com.google.android.apps.messaging.shared.datamodel.action.NoConfirmationMessageSendAction;
import com.google.android.apps.messaging.shared.datamodel.action.ParticipantFullRefreshAction;
import com.google.android.apps.messaging.shared.datamodel.action.PauseRcsFileTransferAction;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessConversationParticipantsUpdateAsyncAction;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessConversationUpdateAsyncAction;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessDeliveryReportAction;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessDownloadedMmsAction;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessExpressiveStickerAttachmentAction;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessExpressiveStickerFavoriteAction;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessFileTransferAction;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessMessageUpdateAsyncAction;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessPendingMessagesAction;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessPendingRevocationsAction;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessRcsDeliveryReportAction;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessRevocationSentAction;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessSentMessageAction;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessTelephonyChangeAction;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessUserAlertAsyncAction;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ray implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public ray(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return ((MarkAsReadAction.a) yyb.aL(MarkAsReadAction.a.class)).cQ().c(parcel);
            case 1:
                return ((InsertRcsMessageInTelephonyAction.a) yyb.aL(InsertRcsMessageInTelephonyAction.a.class)).Nq().c(parcel);
            case 2:
                return ((MarkConversationNotYetDeliveredAction.a) yyb.aL(MarkConversationNotYetDeliveredAction.a.class)).Ns().c(parcel);
            case 3:
                return ((NoConfirmationMessageSendAction.a) yyb.aL(NoConfirmationMessageSendAction.a.class)).cU().c(parcel);
            case 4:
                return ((ParticipantFullRefreshAction.a) yyb.aL(ParticipantFullRefreshAction.a.class)).Nt().c(parcel);
            case 5:
                return ((PauseRcsFileTransferAction.a) yyb.aL(PauseRcsFileTransferAction.a.class)).Nu().c(parcel);
            case 6:
                return ((ProcessConversationParticipantsUpdateAsyncAction.a) yyb.aL(ProcessConversationParticipantsUpdateAsyncAction.a.class)).Nv().c(parcel);
            case 7:
                return ((ProcessConversationUpdateAsyncAction.a) yyb.aL(ProcessConversationUpdateAsyncAction.a.class)).cW().c(parcel);
            case 8:
                return ((ProcessDeliveryReportAction.a) yyb.aL(ProcessDeliveryReportAction.a.class)).Nw().c(parcel);
            case 9:
                return ((ProcessDownloadedMmsAction.a) yyb.aL(ProcessDownloadedMmsAction.a.class)).Nx().c(parcel);
            case 10:
                return ((ProcessExpressiveStickerAttachmentAction.a) yyb.aL(ProcessExpressiveStickerAttachmentAction.a.class)).Ny().c(parcel);
            case 11:
                return ((ProcessExpressiveStickerFavoriteAction.a) yyb.aL(ProcessExpressiveStickerFavoriteAction.a.class)).Nz().c(parcel);
            case 12:
                return ((ProcessFileTransferAction.a) yyb.aL(ProcessFileTransferAction.a.class)).NA().c(parcel);
            case 13:
                return ((ProcessMessageUpdateAsyncAction.a) yyb.aL(ProcessMessageUpdateAsyncAction.a.class)).NB().c(parcel);
            case 14:
                return ((ProcessPendingMessagesAction.a) yyb.aL(ProcessPendingMessagesAction.a.class)).cX().c(parcel);
            case 15:
                return ((ProcessPendingRevocationsAction.a) yyb.aL(ProcessPendingRevocationsAction.a.class)).NC().c(parcel);
            case 16:
                return ((ProcessRcsDeliveryReportAction.a) yyb.aL(ProcessRcsDeliveryReportAction.a.class)).ND().c(parcel);
            case 17:
                return ((ProcessRevocationSentAction.a) yyb.aL(ProcessRevocationSentAction.a.class)).NE().c(parcel);
            case 18:
                return ((ProcessSentMessageAction.a) yyb.aL(ProcessSentMessageAction.a.class)).NF().c(parcel);
            case 19:
                return ((ProcessTelephonyChangeAction.a) yyb.aL(ProcessTelephonyChangeAction.a.class)).NG().c(parcel);
            default:
                return ((ProcessUserAlertAsyncAction.a) yyb.aL(ProcessUserAlertAsyncAction.a.class)).cY().c(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new MarkAsReadAction[i];
            case 1:
                return new InsertRcsMessageInTelephonyAction[i];
            case 2:
                return new MarkConversationNotYetDeliveredAction[i];
            case 3:
                return new NoConfirmationMessageSendAction[i];
            case 4:
                return new ParticipantFullRefreshAction[i];
            case 5:
                return new PauseRcsFileTransferAction[i];
            case 6:
                return new ProcessConversationParticipantsUpdateAsyncAction[i];
            case 7:
                return new ProcessConversationUpdateAsyncAction[i];
            case 8:
                return new ProcessDeliveryReportAction[i];
            case 9:
                return new ProcessDownloadedMmsAction[i];
            case 10:
                return new ProcessExpressiveStickerAttachmentAction[i];
            case 11:
                return new ProcessExpressiveStickerFavoriteAction[i];
            case 12:
                return new ProcessFileTransferAction[i];
            case 13:
                return new ProcessMessageUpdateAsyncAction[i];
            case 14:
                return new ProcessPendingMessagesAction[i];
            case 15:
                return new ProcessPendingRevocationsAction[i];
            case 16:
                return new ProcessRcsDeliveryReportAction[i];
            case 17:
                return new ProcessRevocationSentAction[i];
            case 18:
                return new ProcessSentMessageAction[i];
            case 19:
                return new ProcessTelephonyChangeAction[i];
            default:
                return new ProcessUserAlertAsyncAction[i];
        }
    }
}
