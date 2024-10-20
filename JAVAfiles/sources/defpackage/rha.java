package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.WaitForRcsServiceConnectionAction;
import com.google.android.apps.messaging.shared.datamodel.action.WriteDraftMessageAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.action.common.ActionParameters;
import com.google.android.apps.messaging.shared.datamodel.action.execution.DeferBackgroundWorkAction;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.MessagePartData;
import com.google.android.apps.messaging.shared.datamodel.data.PendingAttachmentData;
import com.google.android.apps.messaging.shared.datamodel.data.common.DeviceData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.common.ParticipantColor;
import com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData;
import com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsDataImpl;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.RbmSuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.AnnotationSearchResult;
import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.MediaSearchResult;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rha implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public rha(int i) {
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v17, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v19, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v21, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v23, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v28, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v30, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [armf, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        arrj arrjVar = null;
        switch (this.a) {
            case 0:
                return ((WriteDraftMessageAction.a) yyb.aL(WriteDraftMessageAction.a.class)).cN().c(parcel);
            case 1:
                return ((WaitForRcsServiceConnectionAction.a) yyb.aL(WaitForRcsServiceConnectionAction.a.class)).Og().c(parcel);
            case 2:
                return new Action.ParcelableStackTraceElement(parcel);
            case 3:
                return new ActionParameters(parcel);
            case 4:
                return ((DeferBackgroundWorkAction.a) yyb.aL(DeferBackgroundWorkAction.a.class)).Na().c(parcel);
            case 5:
                return ((MessageData.a) yyb.aL(MessageData.a.class)).dm().b(parcel);
            case 6:
                rtb dh = ((MessagePartData.a) yyb.aL(MessagePartData.a.class)).dh();
                uff uffVar = (uff) dh.a.b();
                uffVar.getClass();
                xav xavVar = (xav) dh.c.b();
                xavVar.getClass();
                rtb rtbVar = (rtb) dh.d.b();
                rtbVar.getClass();
                yfo yfoVar = (yfo) dh.e.b();
                yfoVar.getClass();
                xnv xnvVar = (xnv) dh.f.b();
                xnvVar.getClass();
                zxy zxyVar = (zxy) dh.g.b();
                zxyVar.getClass();
                Context context = (Context) dh.h.b();
                context.getClass();
                ydk ydkVar = (ydk) dh.i.b();
                ydkVar.getClass();
                ydy ydyVar = (ydy) dh.j.b();
                ydyVar.getClass();
                Optional optional = (Optional) ((apxx) dh.k).a;
                wfh wfhVar = (wfh) dh.l.b();
                wfhVar.getClass();
                anen anenVar = (anen) dh.m.b();
                anenVar.getClass();
                parcel.getClass();
                return new MessagePartData(uffVar, (armf) dh.b, xavVar, rtbVar, yfoVar, xnvVar, zxyVar, context, ydkVar, ydyVar, optional, wfhVar, anenVar, parcel);
            case 7:
                rtg di = ((PendingAttachmentData.a) yyb.aL(PendingAttachmentData.a.class)).di();
                wfh wfhVar2 = (wfh) di.a.b();
                wfhVar2.getClass();
                Context context2 = (Context) di.b.b();
                context2.getClass();
                ydf ydfVar = (ydf) di.c.b();
                ydfVar.getClass();
                xbf xbfVar = (xbf) di.d.b();
                xbfVar.getClass();
                ydk ydkVar2 = (ydk) di.e.b();
                ydkVar2.getClass();
                rtb rtbVar2 = (rtb) di.f.b();
                rtbVar2.getClass();
                uff uffVar2 = (uff) di.g.b();
                uffVar2.getClass();
                armf armfVar = di.h;
                xav xavVar2 = (xav) di.i.b();
                xavVar2.getClass();
                rtg rtgVar = (rtg) di.t.b();
                rtgVar.getClass();
                yfo yfoVar2 = (yfo) di.j.b();
                yfoVar2.getClass();
                xnv xnvVar2 = (xnv) di.k.b();
                xnvVar2.getClass();
                zxy zxyVar2 = (zxy) di.l.b();
                zxyVar2.getClass();
                ydy ydyVar2 = (ydy) di.m.b();
                ydyVar2.getClass();
                Optional optional2 = (Optional) ((apxx) di.n).a;
                wfh wfhVar3 = (wfh) di.o.b();
                wfhVar3.getClass();
                anen anenVar2 = (anen) di.p.b();
                anenVar2.getClass();
                parcel.getClass();
                return new PendingAttachmentData(wfhVar2, context2, ydfVar, xbfVar, ydkVar2, rtbVar2, uffVar2, armfVar, xavVar2, rtgVar, yfoVar2, xnvVar2, zxyVar2, ydyVar2, optional2, wfhVar3, anenVar2, parcel);
            case 8:
                return new DeviceData(parcel);
            case 9:
                return new ParticipantColor(parcel);
            case 10:
                return new MessageUsageStatisticsDataImpl(parcel);
            case 11:
                return new ConversationIdType(parcel.readLong());
            case 12:
                return new MessageIdType(parcel.readLong());
            case 13:
                parcel.getClass();
                return new RbmSuggestionData(parcel, arrjVar);
            case 14:
                parcel.getClass();
                return new SmartSuggestionItemSuggestionData(parcel, arrjVar);
            case 15:
                return new AnnotationSearchResult(parcel);
            case 16:
                return new saa(parcel);
            case 17:
                return new sce(parcel);
            case 18:
                return new scf(parcel);
            case 19:
                return new sch(parcel);
            default:
                return new MediaSearchResult(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new WriteDraftMessageAction[i];
            case 1:
                return new WaitForRcsServiceConnectionAction[i];
            case 2:
                return new Action.ParcelableStackTraceElement[i];
            case 3:
                return new ActionParameters[i];
            case 4:
                return new DeferBackgroundWorkAction[i];
            case 5:
                return new MessageCoreData[i];
            case 6:
                return new MessagePartCoreData[i];
            case 7:
                return new PendingAttachmentData[i];
            case 8:
                return new DeviceData[i];
            case 9:
                return new ParticipantColor[i];
            case 10:
                return new MessageUsageStatisticsData[i];
            case 11:
                return new ConversationIdType[i];
            case 12:
                return new MessageIdType[i];
            case 13:
                return new RbmSuggestionData[i];
            case 14:
                return new SmartSuggestionItemSuggestionData[i];
            case 15:
                return new AnnotationSearchResult[i];
            case 16:
                return new saa[i];
            case 17:
                return new sce[i];
            case 18:
                return new scf[i];
            case 19:
                return new sch[i];
            default:
                return new MediaSearchResult[i];
        }
    }
}
