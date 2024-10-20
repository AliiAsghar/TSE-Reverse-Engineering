package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.CleanTelephonyRawMessagesAction;
import com.google.android.apps.messaging.shared.datamodel.action.ClearCloudSyncMessagesAction;
import com.google.android.apps.messaging.shared.datamodel.action.ClearSessionIdsAction;
import com.google.android.apps.messaging.shared.datamodel.action.CountryCodeDetectorAction;
import com.google.android.apps.messaging.shared.datamodel.action.DeleteConversationAction;
import com.google.android.apps.messaging.shared.datamodel.action.DeleteMessageAction;
import com.google.android.apps.messaging.shared.datamodel.action.DoNothingAction;
import com.google.android.apps.messaging.shared.datamodel.action.EnsureConnectivityStabilizedAction;
import com.google.android.apps.messaging.shared.datamodel.action.ExpireWapPushSiMessageAction;
import com.google.android.apps.messaging.shared.datamodel.action.FallbackToXmsAction;
import com.google.android.apps.messaging.shared.datamodel.action.FillPartSizeAction;
import com.google.android.apps.messaging.shared.datamodel.action.FixupMessageStatusOnStartupAction;
import com.google.android.apps.messaging.shared.datamodel.action.ForwardIncomingTypingIndicatorToTachyonAction;
import com.google.android.apps.messaging.shared.datamodel.action.GenericWorkerQueueAction;
import com.google.android.apps.messaging.shared.datamodel.action.GetFrecentConversationsAction;
import com.google.android.apps.messaging.shared.datamodel.action.GetOrCreateConversationAction;
import com.google.android.apps.messaging.shared.datamodel.action.HandleIncomingRcsGroupChatInvitationAction;
import com.google.android.apps.messaging.shared.datamodel.action.HandleLowStorageAction;
import com.google.android.apps.messaging.shared.datamodel.action.InitializeP2pConversationTrainingAction;
import com.google.android.apps.messaging.shared.datamodel.action.InitiateClientSideFallbackAction;
import com.google.android.apps.messaging.shared.datamodel.action.InsertNewMessageAction;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qyy implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public qyy(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return ((ClearCloudSyncMessagesAction.a) yyb.aL(ClearCloudSyncMessagesAction.a.class)).Ne().c(parcel);
            case 1:
                return ((CleanTelephonyRawMessagesAction.a) yyb.aL(CleanTelephonyRawMessagesAction.a.class)).Nd().c(parcel);
            case 2:
                return ((ClearSessionIdsAction.a) yyb.aL(ClearSessionIdsAction.a.class)).Pt().c(parcel);
            case 3:
                return ((CountryCodeDetectorAction.CountryCodeDetectorActionInjector) yyb.aL(CountryCodeDetectorAction.CountryCodeDetectorActionInjector.class)).Nf().c(parcel);
            case 4:
                return ((DeleteConversationAction.a) yyb.aL(DeleteConversationAction.a.class)).cM().c(parcel);
            case 5:
                return ((DeleteMessageAction.a) yyb.aL(DeleteMessageAction.a.class)).cR().c(parcel);
            case 6:
                return new DoNothingAction(parcel);
            case 7:
                return ((EnsureConnectivityStabilizedAction.a) yyb.aL(EnsureConnectivityStabilizedAction.a.class)).Ng().c(parcel);
            case 8:
                return ((ExpireWapPushSiMessageAction.a) yyb.aL(ExpireWapPushSiMessageAction.a.class)).Pu().c(parcel);
            case 9:
                return ((FallbackToXmsAction.a) yyb.aL(FallbackToXmsAction.a.class)).Nh().c(parcel);
            case 10:
                return ((FillPartSizeAction.a) yyb.aL(FillPartSizeAction.a.class)).Ni().c(parcel);
            case 11:
                return ((FixupMessageStatusOnStartupAction.a) yyb.aL(FixupMessageStatusOnStartupAction.a.class)).Nj().c(parcel);
            case 12:
                return ((ForwardIncomingTypingIndicatorToTachyonAction.a) yyb.aL(ForwardIncomingTypingIndicatorToTachyonAction.a.class)).Nk().c(parcel);
            case 13:
                return ((GenericWorkerQueueAction.a) yyb.aL(GenericWorkerQueueAction.a.class)).Nl().c(parcel);
            case 14:
                return ((GetFrecentConversationsAction.a) yyb.aL(GetFrecentConversationsAction.a.class)).cO().c(parcel);
            case 15:
                return ((GetOrCreateConversationAction.a) yyb.aL(GetOrCreateConversationAction.a.class)).cK().c(parcel);
            case 16:
                return ((HandleIncomingRcsGroupChatInvitationAction.a) yyb.aL(HandleIncomingRcsGroupChatInvitationAction.a.class)).Nm().c(parcel);
            case 17:
                return ((HandleLowStorageAction.a) yyb.aL(HandleLowStorageAction.a.class)).Nn().c(parcel);
            case 18:
                return ((InitializeP2pConversationTrainingAction.a) yyb.aL(InitializeP2pConversationTrainingAction.a.class)).No().c(parcel);
            case 19:
                return ((InitiateClientSideFallbackAction.a) yyb.aL(InitiateClientSideFallbackAction.a.class)).Np().c(parcel);
            default:
                return ((InsertNewMessageAction.a) yyb.aL(InsertNewMessageAction.a.class)).cP().c(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new ClearCloudSyncMessagesAction[i];
            case 1:
                return new CleanTelephonyRawMessagesAction[i];
            case 2:
                return new ClearSessionIdsAction[i];
            case 3:
                return new CountryCodeDetectorAction[i];
            case 4:
                return new DeleteConversationAction[i];
            case 5:
                return new DeleteMessageAction[i];
            case 6:
                return new DoNothingAction[i];
            case 7:
                return new EnsureConnectivityStabilizedAction[i];
            case 8:
                return new ExpireWapPushSiMessageAction[i];
            case 9:
                return new FallbackToXmsAction[i];
            case 10:
                return new FillPartSizeAction[i];
            case 11:
                return new FixupMessageStatusOnStartupAction[i];
            case 12:
                return new ForwardIncomingTypingIndicatorToTachyonAction[i];
            case 13:
                return new GenericWorkerQueueAction[i];
            case 14:
                return new GetFrecentConversationsAction[i];
            case 15:
                return new GetOrCreateConversationAction[i];
            case 16:
                return new HandleIncomingRcsGroupChatInvitationAction[i];
            case 17:
                return new HandleLowStorageAction[i];
            case 18:
                return new InitializeP2pConversationTrainingAction[i];
            case 19:
                return new InitiateClientSideFallbackAction[i];
            default:
                return new InsertNewMessageAction[i];
        }
    }
}
