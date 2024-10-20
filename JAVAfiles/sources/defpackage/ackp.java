package defpackage;

import android.os.Parcelable;
import com.google.android.gms.wearable.internal.AppRecommendationsResponse;
import com.google.android.gms.wearable.internal.AppWearDetailsParcelable;
import com.google.android.gms.wearable.internal.BooleanResponse;
import com.google.android.gms.wearable.internal.CapabilityInfoParcelable;
import com.google.android.gms.wearable.internal.ChannelEventParcelable;
import com.google.android.gms.wearable.internal.ChannelImpl;
import com.google.android.gms.wearable.internal.ChannelReceiveFileResponse;
import com.google.android.gms.wearable.internal.ChannelSendFileResponse;
import com.google.android.gms.wearable.internal.CloseChannelResponse;
import com.google.android.gms.wearable.internal.ConnectionStateEventParcelable;
import com.google.android.gms.wearable.internal.ConsentResponse;
import com.google.android.gms.wearable.internal.ConsentStatusRequest;
import com.google.android.gms.wearable.internal.DataItemAssetParcelable;
import com.google.android.gms.wearable.internal.DataItemParcelable;
import com.google.android.gms.wearable.internal.DeleteDataItemsResponse;
import com.google.android.gms.wearable.internal.FastPairAccountKeyParcelable;
import com.google.android.gms.wearable.internal.GetAllCapabilitiesResponse;
import com.google.android.gms.wearable.internal.GetAppThemeResponse;
import com.google.android.gms.wearable.internal.GetBackupSettingsSupportedResponse;
import com.google.android.gms.wearable.internal.GetCapabilityResponse;
import com.google.android.gms.wearable.internal.GetChannelInputStreamResponse;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ackp implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public ackp(int i) {
        this.a = i;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 436
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r20) {
        /*
            Method dump skipped, instructions count: 1118
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ackp.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new AppWearDetailsParcelable[i];
            case 1:
                return new AppRecommendationsResponse[i];
            case 2:
                return new BooleanResponse[i];
            case 3:
                return new CapabilityInfoParcelable[i];
            case 4:
                return new ChannelEventParcelable[i];
            case 5:
                return new ChannelImpl[i];
            case 6:
                return new ChannelReceiveFileResponse[i];
            case 7:
                return new ChannelSendFileResponse[i];
            case 8:
                return new CloseChannelResponse[i];
            case 9:
                return new ConnectionStateEventParcelable[i];
            case 10:
                return new ConsentResponse[i];
            case 11:
                return new ConsentStatusRequest[i];
            case 12:
                return new DataItemAssetParcelable[i];
            case 13:
                return new DataItemParcelable[i];
            case 14:
                return new DeleteDataItemsResponse[i];
            case 15:
                return new FastPairAccountKeyParcelable[i];
            case 16:
                return new GetAllCapabilitiesResponse[i];
            case 17:
                return new GetAppThemeResponse[i];
            case 18:
                return new GetBackupSettingsSupportedResponse[i];
            case 19:
                return new GetCapabilityResponse[i];
            default:
                return new GetChannelInputStreamResponse[i];
        }
    }
}
