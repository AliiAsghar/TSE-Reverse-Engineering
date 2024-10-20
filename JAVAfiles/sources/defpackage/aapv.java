package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.ui.mediapicker.c2o.contact.VCardContentItem;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.AttachmentQueueState;
import com.google.android.apps.messaging.ui.mediapicker.c2o.customization.CustomizationModel;
import com.google.android.apps.messaging.ui.mediapicker.c2o.expressivesticker.ExpressiveStickerContentItem;
import com.google.android.apps.messaging.ui.mediapicker.c2o.file.FileContentItem;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.CameraContentItem;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.Compose2oMessagePartDataConverter;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.data.GalleryContentItem;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gif.GifContentItem;
import com.google.android.apps.messaging.ui.mediapicker.c2o.location.LocationContentItem;
import com.google.android.apps.messaging.ui.mediaviewer.BaseMediaViewerEvent;
import com.google.android.apps.messaging.ui.mediaviewer.MediaViewerAddMoreButtonEvent;
import com.google.android.apps.messaging.ui.mediaviewer.MediaViewerButton;
import com.google.android.apps.messaging.ui.mediaviewer.MediaViewerPrimaryButtonEvent;
import com.google.android.apps.messaging.ui.mediaviewer.MediaViewerSaveButtonEvent;
import com.google.android.apps.messaging.ui.mediaviewer.data.MediaViewerItem;
import com.google.android.apps.messaging.ui.video.VideoOverlayView;
import com.google.android.apps.messaging.videotrimmer.FileInfoResult;
import com.google.android.apps.messaging.wearable.action.CheckWearableAppVersionAction;
import com.google.android.apps.messaging.wearable.action.RequestMoreMessagesAction;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aapv implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public aapv(int i) {
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r0v46, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [armf, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        String str;
        String str2 = null;
        byte b = 0;
        switch (this.a) {
            case 0:
                return new AttachmentQueueState(parcel);
            case 1:
                rtb rtbVar = (rtb) ((VCardContentItem.a) yyb.aL(VCardContentItem.a.class)).PC().a.b();
                rtbVar.getClass();
                parcel.getClass();
                return new VCardContentItem(rtbVar, parcel);
            case 2:
                return new CustomizationModel(parcel);
            case 3:
                return new ExpressiveStickerContentItem(parcel);
            case 4:
                return new FileContentItem(parcel);
            case 5:
                return new CameraContentItem(parcel);
            case 6:
                return new Compose2oMessagePartDataConverter();
            case 7:
                String readString = parcel.readString();
                readString.getClass();
                int readInt = parcel.readInt();
                int readInt2 = parcel.readInt();
                apdj apdjVar = (apdj) parcel.readParcelable(ampy.class.getClassLoader());
                apdjVar.getClass();
                return new aast(readString, readInt, readInt2, (ampy) apdjVar.a(ampy.a, aozs.a()), parcel.readLong());
            case 8:
                return new GalleryContentItem(parcel);
            case 9:
                return new GifContentItem(parcel);
            case 10:
                return new LocationContentItem(parcel);
            case 11:
                return new BaseMediaViewerEvent();
            case 12:
                return new MediaViewerAddMoreButtonEvent(null);
            case 13:
                aawz e = MediaViewerButton.e();
                e.e(parcel.readInt());
                e.b(parcel.readInt());
                e.d(parcel.readInt());
                e.c((BaseMediaViewerEvent) parcel.readParcelable(getClass().getClassLoader()));
                return e.a();
            case 14:
                return new MediaViewerPrimaryButtonEvent(null);
            case 15:
                return new MediaViewerSaveButtonEvent(null);
            case 16:
                Uri uri = (Uri) parcel.readParcelable(MediaViewerItem.class.getClassLoader());
                Uri uri2 = (Uri) parcel.readParcelable(MediaViewerItem.class.getClassLoader());
                String readString2 = parcel.readString();
                if (parcel.readInt() == 0) {
                    str = parcel.readString();
                } else {
                    str = null;
                }
                if (parcel.readInt() == 0) {
                    str2 = parcel.readString();
                }
                return new aaxl(uri, uri2, readString2, str, str2, (ConversationIdType) parcel.readParcelable(MediaViewerItem.class.getClassLoader()), (ConversationId) parcel.readParcelable(MediaViewerItem.class.getClassLoader()), (MessageIdType) parcel.readParcelable(MediaViewerItem.class.getClassLoader()), (MessageId) parcel.readParcelable(MediaViewerItem.class.getClassLoader()));
            case 17:
                Context context = (Context) ((VideoOverlayView.GetMediaDurationAction.a) yyb.aL(VideoOverlayView.GetMediaDurationAction.a.class)).Rf().a.b();
                context.getClass();
                parcel.getClass();
                return new VideoOverlayView.GetMediaDurationAction(context, parcel);
            case 18:
                parcel.getClass();
                return new FileInfoResult(parcel, (arrj) (b == true ? 1 : 0));
            case 19:
                return new CheckWearableAppVersionAction(parcel);
            default:
                return new RequestMoreMessagesAction(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new AttachmentQueueState[i];
            case 1:
                return new VCardContentItem[i];
            case 2:
                return new CustomizationModel[i];
            case 3:
                return new ExpressiveStickerContentItem[i];
            case 4:
                return new FileContentItem[i];
            case 5:
                return new CameraContentItem[i];
            case 6:
                return new Compose2oMessagePartDataConverter[i];
            case 7:
                return new aast[i];
            case 8:
                return new GalleryContentItem[i];
            case 9:
                return new GifContentItem[i];
            case 10:
                return new LocationContentItem[i];
            case 11:
                return new BaseMediaViewerEvent[i];
            case 12:
                return new MediaViewerAddMoreButtonEvent[i];
            case 13:
                return new MediaViewerButton[i];
            case 14:
                return new MediaViewerPrimaryButtonEvent[i];
            case 15:
                return new MediaViewerSaveButtonEvent[i];
            case 16:
                return new aaxl[i];
            case 17:
                return new VideoOverlayView.GetMediaDurationAction[i];
            case 18:
                return new FileInfoResult[i];
            case 19:
                return new CheckWearableAppVersionAction[i];
            default:
                return new RequestMoreMessagesAction[i];
        }
    }
}
