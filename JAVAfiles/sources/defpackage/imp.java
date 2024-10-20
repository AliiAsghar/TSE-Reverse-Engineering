package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Size;
import com.google.android.apps.messaging.conversation.draft.model.GalleryContent;
import com.google.android.apps.messaging.conversation.input.compose.VideoTrimmerSource;
import com.google.android.apps.messaging.conversation.screen.ConversationActivityUiState;
import com.google.android.apps.messaging.conversation.screen.ConversationActivityUsageStatisticsState;
import com.google.android.apps.messaging.conversation.settings.dataservice.SpamReportingStatus;
import com.google.android.apps.messaging.conversation2.api.OpenConversation2Arguments;
import com.google.android.apps.messaging.conversation2.bottomcontent.composerow.draft.attachment.RichLocation;
import com.google.android.apps.messaging.datadonation.redact.RedactedSpan;
import com.google.android.apps.messaging.diagnostics.DumpDatabaseAction;
import com.google.android.apps.messaging.diagnostics.LogTelephonyDatabaseAction;
import com.google.android.apps.messaging.home.select.SelectedConversation;
import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;
import com.google.android.apps.messaging.multishare.chip.ChipData;
import com.google.android.apps.messaging.multishare.chip.ChipId;
import com.google.android.apps.messaging.navigation.targets.DirectSendResult;
import com.google.android.apps.messaging.navigation.targets.EditedMedia;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class imp implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public imp(int i) {
        this.a = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Optional ofNullable;
        String str;
        char c;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        Boolean valueOf;
        boolean z6;
        boolean z7;
        EditedMedia createFromParcel;
        EditedMedia createFromParcel2;
        switch (this.a) {
            case 0:
                String readString = parcel.readString();
                Uri uri = (Uri) parcel.readParcelable(GalleryContent.class.getClassLoader());
                ameb amebVar = (ameb) Enum.valueOf(ameb.class, parcel.readString());
                Size readSize = parcel.readSize();
                long readLong = parcel.readLong();
                int readInt = parcel.readInt();
                int readInt2 = parcel.readInt();
                Uri uri2 = (Uri) parcel.readParcelable(GalleryContent.class.getClassLoader());
                yyb yybVar = imq.n;
                parcel.getClass();
                if (parcel.readByte() == 0) {
                    ofNullable = Optional.empty();
                } else {
                    Object readValue = parcel.readValue(yybVar.getClass().getClassLoader());
                    readValue.getClass();
                    ofNullable = Optional.ofNullable(readValue);
                }
                Optional optional = ofNullable;
                tqj tqjVar = (tqj) Enum.valueOf(tqj.class, parcel.readString());
                Uri uri3 = (Uri) parcel.readParcelable(GalleryContent.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    str = parcel.readString();
                } else {
                    str = null;
                }
                String readString2 = parcel.readString();
                int i = 2;
                switch (readString2.hashCode()) {
                    case -1905220446:
                        if (readString2.equals("DISPLAY")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case -317273382:
                        if (readString2.equals("DISPLAY_AND_ALLOW_HIDING")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 449635224:
                        if (readString2.equals("HIDE_AND_REQUIRE_EXTRA_CONSENT_BEFORE_SHOWING")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 907287315:
                        if (readString2.equals("PROCESSING")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1054202442:
                        if (readString2.equals("HIDE_AND_ALLOW_SHOWING")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                if (c != 0) {
                    if (c != 1) {
                        if (c != 2) {
                            if (c != 3) {
                                if (c == 4) {
                                    i = 5;
                                } else {
                                    throw new IllegalArgumentException();
                                }
                            } else {
                                i = 4;
                            }
                        } else {
                            i = 3;
                        }
                    }
                } else {
                    i = 1;
                }
                if (readInt2 == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (readInt == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                return new imq(readString, uri, amebVar, readSize, readLong, z2, z, uri2, optional, tqjVar, uri3, str, i);
            case 1:
                String readString3 = parcel.readString();
                int readInt3 = parcel.readInt();
                int readInt4 = parcel.readInt();
                if (readInt3 == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (readInt4 == 1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                return new igk(readString3, z3, z4, parcel.readInt());
            case 2:
                parcel.getClass();
                parcel.readInt();
                return VideoTrimmerSource.a;
            case 3:
                ((ConversationActivityUiState.a) yyb.aL(ConversationActivityUiState.a.class)).s();
                return new ConversationActivityUiState(parcel);
            case 4:
                return new ConversationActivityUsageStatisticsState(parcel);
            case 5:
                return new SpamReportingStatus(parcel);
            case 6:
                parcel.getClass();
                ConversationId conversationId = (ConversationId) parcel.readParcelable(OpenConversation2Arguments.class.getClassLoader());
                MessageId messageId = (MessageId) parcel.readParcelable(OpenConversation2Arguments.class.getClassLoader());
                String readString4 = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    if (parcel.readInt() != 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    valueOf = Boolean.valueOf(z5);
                }
                if (parcel.readInt() != 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (parcel.readInt() != 0) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                return new OpenConversation2Arguments(conversationId, messageId, readString4, valueOf, z6, z7, (miv) Enum.valueOf(miv.class, parcel.readString()));
            case 7:
                parcel.getClass();
                parcel.readInt();
                return RichLocation.Source.LocationPicker.a;
            case 8:
                return new RedactedSpan(parcel);
            case 9:
                return new kmk(parcel);
            case 10:
                return new kmj(parcel);
            case 11:
                return ((DumpDatabaseAction.a) yyb.aL(DumpDatabaseAction.a.class)).u().c(parcel);
            case 12:
                return ((LogTelephonyDatabaseAction.a) yyb.aL(LogTelephonyDatabaseAction.a.class)).v().c(parcel);
            case 13:
                return new SelectedConversation(parcel);
            case 14:
                return SuperSortLabel.a(parcel.readInt());
            case 15:
                parcel.getClass();
                Bundle readBundle = parcel.readBundle(lga.class.getClassLoader());
                if (readBundle != null) {
                    Object b = ef.b(readBundle, "chip_id", ChipId.class);
                    if (b != null) {
                        ChipId chipId = (ChipId) b;
                        String string = readBundle.getString(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT);
                        if (string != null) {
                            return new ChipData(chipId, string, readBundle.getString("lookup"), (Uri) ef.b(readBundle, "photo", Uri.class), readBundle.getBoolean("clip"));
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    throw new IllegalArgumentException("Required value was null.");
                }
                throw new IllegalArgumentException("Required value was null.");
            case 16:
                parcel.getClass();
                Bundle readBundle2 = parcel.readBundle(lgb.class.getClassLoader());
                if (readBundle2 != null) {
                    Object b2 = ef.b(readBundle2, "conversation_id", ConversationId.class);
                    if (b2 != null) {
                        return new ChipId.Conversation((ConversationId) b2);
                    }
                    throw new IllegalArgumentException("Required value was null.");
                }
                throw new IllegalArgumentException("Required value was null.");
            case 17:
                parcel.getClass();
                ChipId.a aVar = (ChipId.a) yyb.aL(ChipId.a.class);
                Bundle readBundle3 = parcel.readBundle(lgc.class.getClassLoader());
                if (readBundle3 != null) {
                    lqn QF = aVar.QF();
                    Object b3 = ef.b(readBundle3, "identity", apdj.class);
                    if (b3 != null) {
                        return new ChipId.Identity(QF.k((apdj) b3));
                    }
                    throw new IllegalArgumentException("Required value was null.");
                }
                throw new IllegalArgumentException("Required value was null.");
            case 18:
                parcel.getClass();
                if (parcel.readInt() == 0) {
                    createFromParcel = null;
                } else {
                    createFromParcel = EditedMedia.CREATOR.createFromParcel(parcel);
                }
                return new DirectSendResult.Add(createFromParcel, parcel.readString());
            case 19:
                parcel.getClass();
                return new DirectSendResult.Discard(parcel.readString());
            default:
                parcel.getClass();
                if (parcel.readInt() == 0) {
                    createFromParcel2 = null;
                } else {
                    createFromParcel2 = EditedMedia.CREATOR.createFromParcel(parcel);
                }
                return new DirectSendResult.Send(createFromParcel2, parcel.readString());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new imq[i];
            case 1:
                return new igk[i];
            case 2:
                return new VideoTrimmerSource[i];
            case 3:
                return new ConversationActivityUiState[i];
            case 4:
                return new ConversationActivityUsageStatisticsState[i];
            case 5:
                return new SpamReportingStatus[i];
            case 6:
                return new OpenConversation2Arguments[i];
            case 7:
                return new RichLocation.Source.LocationPicker[i];
            case 8:
                return new RedactedSpan[i];
            case 9:
                return new kmk[i];
            case 10:
                return new kmj[i];
            case 11:
                return new DumpDatabaseAction[i];
            case 12:
                return new LogTelephonyDatabaseAction[i];
            case 13:
                return new SelectedConversation[i];
            case 14:
                return new SuperSortLabel[i];
            case 15:
                return new ChipData[i];
            case 16:
                return new ChipId.Conversation[i];
            case 17:
                return new ChipId.Identity[i];
            case 18:
                return new DirectSendResult.Add[i];
            case 19:
                return new DirectSendResult.Discard[i];
            default:
                return new DirectSendResult.Send[i];
        }
    }
}
