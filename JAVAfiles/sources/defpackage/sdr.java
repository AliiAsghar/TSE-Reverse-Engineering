package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.UrlSearchResult;
import com.google.android.apps.messaging.shared.datamodel.etouffee.info.DetailsPageE2eeInfoRequest;
import com.google.android.apps.messaging.shared.datamodel.etouffee.info.E2eeInfo;
import com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery$ContentSearchFilter;
import com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery$ConversationSearchFilter;
import com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery$FreeTextSearchFilter;
import com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery$ParticipantSearchFilter;
import com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery$SearchFilter;
import com.google.android.apps.messaging.shared.photos.client.MediaUploadStates;
import com.google.android.apps.messaging.shared.util.LegacyGroupProtocolSwitchAction;
import com.google.android.apps.messaging.startchat.chip.ChipData;
import com.google.android.apps.messaging.ui.conversation.details.CdpOpeningArguments;
import com.google.android.apps.messaging.ui.conversation.message.MessageDetails;
import com.google.android.apps.messaging.ui.conversation.richcard.RichCardVideoOverlayView;
import com.google.android.apps.messaging.ui.mediapicker.audio.AudioContentItem;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sdr implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public sdr(int i) {
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r0v45, types: [armf, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object searchQuery$FreeTextSearchFilter;
        int i = 0;
        switch (this.a) {
            case 0:
                return new sds(parcel);
            case 1:
                return new sdq(parcel);
            case 2:
                return new sen(parcel);
            case 3:
                return new UrlSearchResult(parcel);
            case 4:
                return new sxm(parcel);
            case 5:
                return new tao(parcel);
            case 6:
                return new tbf(parcel);
            case 7:
                return new tdc(parcel);
            case 8:
                return new tpt(parcel);
            case 9:
                parcel.getClass();
                return new DetailsPageE2eeInfoRequest(parcel.readString(), (Conversation) parcel.readParcelable(DetailsPageE2eeInfoRequest.class.getClassLoader()), (amkd) Enum.valueOf(amkd.class, parcel.readString()));
            case 10:
                parcel.getClass();
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                while (i != readInt) {
                    arrayList.add((uao) Enum.valueOf(uao.class, parcel.readString()));
                    i++;
                }
                return new E2eeInfo(arrayList);
            case 11:
                byte readByte = parcel.readByte();
                if (readByte != 1) {
                    if (readByte != 2) {
                        if (readByte != 3) {
                            if (readByte != 4) {
                                if (readByte == 5) {
                                    return new SearchQuery$SearchFilter() { // from class: com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery$StarSearchFilter
                                        @Override // com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery$SearchFilter
                                        protected final byte a() {
                                            return (byte) 5;
                                        }

                                        public final boolean equals(Object obj) {
                                            return obj instanceof SearchQuery$StarSearchFilter;
                                        }

                                        public final int hashCode() {
                                            return 0;
                                        }
                                    };
                                }
                                throw new IllegalStateException(a.bV(readByte, "SearchFilter#createFromParcel failed with contentsDescriptor = "));
                            }
                            searchQuery$FreeTextSearchFilter = new SearchQuery$ContentSearchFilter(parcel);
                        } else {
                            searchQuery$FreeTextSearchFilter = new SearchQuery$ConversationSearchFilter(parcel);
                        }
                    } else {
                        searchQuery$FreeTextSearchFilter = new SearchQuery$ParticipantSearchFilter(parcel);
                    }
                } else {
                    searchQuery$FreeTextSearchFilter = new SearchQuery$FreeTextSearchFilter(parcel);
                }
                return searchQuery$FreeTextSearchFilter;
            case 12:
                parcel.getClass();
                int readInt2 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(readInt2);
                while (i != readInt2) {
                    linkedHashMap.put(parcel.readString(), parcel.readParcelable(MediaUploadStates.class.getClassLoader()));
                    i++;
                }
                return new MediaUploadStates(linkedHashMap);
            case 13:
                return new wsw(parcel);
            case 14:
                return ((LegacyGroupProtocolSwitchAction.a) yyb.aL(LegacyGroupProtocolSwitchAction.a.class)).Nr().c(parcel);
            case 15:
                parcel.getClass();
                ChipData.a aVar = (ChipData.a) yyb.aL(ChipData.a.class);
                Bundle readBundle = parcel.readBundle(yzc.class.getClassLoader());
                if (readBundle != null) {
                    String string = readBundle.getString(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT);
                    if (string != null) {
                        lqn QF = aVar.QF();
                        Parcelable parcelable = readBundle.getParcelable("identity");
                        if (parcelable != null) {
                            return new ChipData(QF.k((apdj) parcelable), string, readBundle.getString("lookup"), (Uri) readBundle.getParcelable("photo"), readBundle.getBoolean("pinned", false));
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    throw new IllegalArgumentException("Required value was null.");
                }
                throw new IllegalArgumentException("Required value was null.");
            case 16:
                return new zql((MessageCoreData) parcel.readParcelable(zrz.class.getClassLoader()), parcel.readInt(), parcel.readLong(), (MessageUsageStatisticsData) parcel.readParcelable(zrz.class.getClassLoader()));
            case 17:
                parcel.getClass();
                return new CdpOpeningArguments(parcel.readInt());
            case 18:
                String readString = parcel.readString();
                readString.getClass();
                MessageIdType b = rvc.b(readString);
                String readString2 = parcel.readString();
                readString2.getClass();
                CharSequence charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
                charSequence.getClass();
                return new MessageDetails(b, readString2, charSequence);
            case 19:
                Context context = (Context) ((RichCardVideoOverlayView.GetMediaDurationAction.a) yyb.aL(RichCardVideoOverlayView.GetMediaDurationAction.a.class)).Qu().a.b();
                context.getClass();
                parcel.getClass();
                return new RichCardVideoOverlayView.GetMediaDurationAction(context, parcel);
            default:
                return new AudioContentItem(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new sds[i];
            case 1:
                return new sdq[i];
            case 2:
                return new sen[i];
            case 3:
                return new UrlSearchResult[i];
            case 4:
                return new sxm[i];
            case 5:
                return new tao[i];
            case 6:
                return new tbf[i];
            case 7:
                return new tdc[i];
            case 8:
                return new tpt[i];
            case 9:
                return new DetailsPageE2eeInfoRequest[i];
            case 10:
                return new E2eeInfo[i];
            case 11:
                return new SearchQuery$SearchFilter[i];
            case 12:
                return new MediaUploadStates[i];
            case 13:
                return new wsw[i];
            case 14:
                return new LegacyGroupProtocolSwitchAction[i];
            case 15:
                return new ChipData[i];
            case 16:
                return new zql[i];
            case 17:
                return new CdpOpeningArguments[i];
            case 18:
                return new MessageDetails[i];
            case 19:
                return new RichCardVideoOverlayView.GetMediaDurationAction[i];
            default:
                return new AudioContentItem[i];
        }
    }
}
