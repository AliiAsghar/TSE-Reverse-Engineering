package defpackage;

import android.os.Parcelable;
import com.google.android.gms.wearable.internal.GetChannelOutputStreamResponse;
import com.google.android.gms.wearable.internal.GetCloudSyncOptInOutDoneResponse;
import com.google.android.gms.wearable.internal.GetCloudSyncOptInStatusResponse;
import com.google.android.gms.wearable.internal.GetCloudSyncSettingResponse;
import com.google.android.gms.wearable.internal.GetCompanionPackageForNodeResponse;
import com.google.android.gms.wearable.internal.GetConfigResponse;
import com.google.android.gms.wearable.internal.GetConfigsResponse;
import com.google.android.gms.wearable.internal.GetConnectedNodesResponse;
import com.google.android.gms.wearable.internal.GetDataItemResponse;
import com.google.android.gms.wearable.internal.GetEapIdResponse;
import com.google.android.gms.wearable.internal.GetFastpairAccountKeyByAccountResponse;
import com.google.android.gms.wearable.internal.GetFastpairAccountKeysResponse;
import com.google.android.gms.wearable.internal.GetFdForAssetResponse;
import com.google.android.gms.wearable.internal.GetLocalNodeResponse;
import com.google.android.gms.wearable.internal.GetNodeIdResponse;
import com.google.android.gms.wearable.internal.GetRestoreStateRequest;
import com.google.android.gms.wearable.internal.GetRestoreStateResponse;
import com.google.android.gms.wearable.internal.GetRestoreSupportedResponse;
import com.google.android.gms.wearable.internal.GetTermsResponse;
import com.google.android.gms.wearable.internal.LogCounterRequest;
import com.google.android.gms.wearable.internal.WebIconParcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aclk implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public aclk(int i) {
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
            Method dump skipped, instructions count: 1108
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aclk.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new GetCloudSyncOptInOutDoneResponse[i];
            case 1:
                return new GetChannelOutputStreamResponse[i];
            case 2:
                return new GetCloudSyncOptInStatusResponse[i];
            case 3:
                return new GetCloudSyncSettingResponse[i];
            case 4:
                return new GetCompanionPackageForNodeResponse[i];
            case 5:
                return new GetConfigResponse[i];
            case 6:
                return new GetConfigsResponse[i];
            case 7:
                return new GetConnectedNodesResponse[i];
            case 8:
                return new GetDataItemResponse[i];
            case 9:
                return new GetEapIdResponse[i];
            case 10:
                return new GetFastpairAccountKeyByAccountResponse[i];
            case 11:
                return new GetFastpairAccountKeysResponse[i];
            case 12:
                return new GetFdForAssetResponse[i];
            case 13:
                return new GetLocalNodeResponse[i];
            case 14:
                return new GetNodeIdResponse[i];
            case 15:
                return new GetRestoreStateRequest[i];
            case 16:
                return new GetRestoreStateResponse[i];
            case 17:
                return new GetRestoreSupportedResponse[i];
            case 18:
                return new GetTermsResponse[i];
            case 19:
                return new WebIconParcelable[i];
            default:
                return new LogCounterRequest[i];
        }
    }
}
