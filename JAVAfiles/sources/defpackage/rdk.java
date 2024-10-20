package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.ReadDraftDataAction;
import com.google.android.apps.messaging.shared.datamodel.action.RebuildShortcutsAction;
import com.google.android.apps.messaging.shared.datamodel.action.ReceiveCloudSyncMessageAction;
import com.google.android.apps.messaging.shared.datamodel.action.ReceiveMmsMessageAction;
import com.google.android.apps.messaging.shared.datamodel.action.ReceiveP2pSuggestionsAction;
import com.google.android.apps.messaging.shared.datamodel.action.ReceiveRbmSuggestionsAction;
import com.google.android.apps.messaging.shared.datamodel.action.ReceiveRcsMessageAction;
import com.google.android.apps.messaging.shared.datamodel.action.ReceiveSmsMessageAction;
import com.google.android.apps.messaging.shared.datamodel.action.ReceiveWapPushSiMessageAction;
import com.google.android.apps.messaging.shared.datamodel.action.RecurringTelemetryUploaderAction;
import com.google.android.apps.messaging.shared.datamodel.action.RedownloadMessageAction;
import com.google.android.apps.messaging.shared.datamodel.action.RefreshNotificationIfOtpFoundAction;
import com.google.android.apps.messaging.shared.datamodel.action.RefreshStatefulNotificationsAction;
import com.google.android.apps.messaging.shared.datamodel.action.ReloadCequintParticipantAction;
import com.google.android.apps.messaging.shared.datamodel.action.RemoveSelfNumberFromConversationsAction;
import com.google.android.apps.messaging.shared.datamodel.action.ReplaceSmsMessageAction;
import com.google.android.apps.messaging.shared.datamodel.action.RequestSmartSuggestionsAction;
import com.google.android.apps.messaging.shared.datamodel.action.ResendMessageAction;
import com.google.android.apps.messaging.shared.datamodel.action.ResetGroupRcsSessionIdAction;
import com.google.android.apps.messaging.shared.datamodel.action.ResumeRcsFileTransferAction;
import com.google.android.apps.messaging.shared.datamodel.action.SanitizeParticipantsAction;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rdk implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public rdk(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return ((RebuildShortcutsAction.a) yyb.aL(RebuildShortcutsAction.a.class)).NH().c(parcel);
            case 1:
                return ((ReadDraftDataAction.a) yyb.aL(ReadDraftDataAction.a.class)).Py().c(parcel);
            case 2:
                return ((ReceiveCloudSyncMessageAction.a) yyb.aL(ReceiveCloudSyncMessageAction.a.class)).NI().c(parcel);
            case 3:
                return ((ReceiveMmsMessageAction.a) yyb.aL(ReceiveMmsMessageAction.a.class)).NJ().c(parcel);
            case 4:
                return ((ReceiveP2pSuggestionsAction.a) yyb.aL(ReceiveP2pSuggestionsAction.a.class)).NK().c(parcel);
            case 5:
                return ((ReceiveRbmSuggestionsAction.a) yyb.aL(ReceiveRbmSuggestionsAction.a.class)).NL().c(parcel);
            case 6:
                return ((ReceiveRcsMessageAction.a) yyb.aL(ReceiveRcsMessageAction.a.class)).NM().c(parcel);
            case 7:
                return ((ReceiveSmsMessageAction.a) yyb.aL(ReceiveSmsMessageAction.a.class)).NN().c(parcel);
            case 8:
                return ((ReceiveWapPushSiMessageAction.a) yyb.aL(ReceiveWapPushSiMessageAction.a.class)).Pv().c(parcel);
            case 9:
                return ((RecurringTelemetryUploaderAction.a) yyb.aL(RecurringTelemetryUploaderAction.a.class)).NO().c(parcel);
            case 10:
                return ((RedownloadMessageAction.a) yyb.aL(RedownloadMessageAction.a.class)).cS().c(parcel);
            case 11:
                return ((RefreshNotificationIfOtpFoundAction.a) yyb.aL(RefreshNotificationIfOtpFoundAction.a.class)).NP().c(parcel);
            case 12:
                return ((RefreshStatefulNotificationsAction.a) yyb.aL(RefreshStatefulNotificationsAction.a.class)).cZ().c(parcel);
            case 13:
                return ((ReloadCequintParticipantAction.a) yyb.aL(ReloadCequintParticipantAction.a.class)).da().c(parcel);
            case 14:
                return ((RemoveSelfNumberFromConversationsAction.a) yyb.aL(RemoveSelfNumberFromConversationsAction.a.class)).NQ().c(parcel);
            case 15:
                return ((ReplaceSmsMessageAction.a) yyb.aL(ReplaceSmsMessageAction.a.class)).NR().c(parcel);
            case 16:
                return ((RequestSmartSuggestionsAction.a) yyb.aL(RequestSmartSuggestionsAction.a.class)).Pw().c(parcel);
            case 17:
                return ((ResendMessageAction.a) yyb.aL(ResendMessageAction.a.class)).cT().c(parcel);
            case 18:
                return ((ResetGroupRcsSessionIdAction.a) yyb.aL(ResetGroupRcsSessionIdAction.a.class)).NS().c(parcel);
            case 19:
                return ((ResumeRcsFileTransferAction.a) yyb.aL(ResumeRcsFileTransferAction.a.class)).db().c(parcel);
            default:
                return ((rfs) ((SanitizeParticipantsAction.a) yyb.aL(SanitizeParticipantsAction.a.class)).dc()).c(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new RebuildShortcutsAction[i];
            case 1:
                return new ReadDraftDataAction[i];
            case 2:
                return new ReceiveCloudSyncMessageAction[i];
            case 3:
                return new ReceiveMmsMessageAction[i];
            case 4:
                return new ReceiveP2pSuggestionsAction[i];
            case 5:
                return new ReceiveRbmSuggestionsAction[i];
            case 6:
                return new ReceiveRcsMessageAction[i];
            case 7:
                return new ReceiveSmsMessageAction[i];
            case 8:
                return new ReceiveWapPushSiMessageAction[i];
            case 9:
                return new RecurringTelemetryUploaderAction[i];
            case 10:
                return new RedownloadMessageAction[i];
            case 11:
                return new RefreshNotificationIfOtpFoundAction[i];
            case 12:
                return new RefreshStatefulNotificationsAction[i];
            case 13:
                return new ReloadCequintParticipantAction[i];
            case 14:
                return new RemoveSelfNumberFromConversationsAction[i];
            case 15:
                return new ReplaceSmsMessageAction[i];
            case 16:
                return new RequestSmartSuggestionsAction[i];
            case 17:
                return new ResendMessageAction[i];
            case 18:
                return new ResetGroupRcsSessionIdAction[i];
            case 19:
                return new ResumeRcsFileTransferAction[i];
            default:
                return new SanitizeParticipantsAction[i];
        }
    }
}
