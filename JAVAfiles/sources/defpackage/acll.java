package defpackage;

import android.os.Parcelable;
import com.google.android.gms.wearable.internal.LogEventRequest;
import com.google.android.gms.wearable.internal.LogTimerRequest;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
import com.google.android.gms.wearable.internal.NodeMigratedEventParcelable;
import com.google.android.gms.wearable.internal.NodeParcelable;
import com.google.android.gms.wearable.internal.OpenChannelResponse;
import com.google.android.gms.wearable.internal.PackageStorageInfo;
import com.google.android.gms.wearable.internal.PerformEapAkaResponse;
import com.google.android.gms.wearable.internal.PrivacyRecordOptinRequest;
import com.google.android.gms.wearable.internal.PutDataResponse;
import com.google.android.gms.wearable.internal.RecordTermConsentRequest;
import com.google.android.gms.wearable.internal.RecordUntetheredSupervisedAccountTransferRequest;
import com.google.android.gms.wearable.internal.RemoveListenerRequest;
import com.google.android.gms.wearable.internal.RemoveLocalCapabilityResponse;
import com.google.android.gms.wearable.internal.RestoreCompletedEventParcelable;
import com.google.android.gms.wearable.internal.RpcResponse;
import com.google.android.gms.wearable.internal.SaveRestoreStateRequest;
import com.google.android.gms.wearable.internal.SendMessageResponse;
import com.google.android.gms.wearable.internal.StartRestoreSessionRequest;
import com.google.android.gms.wearable.internal.StorageInfoResponse;
import com.google.android.ims.rcs.engine.RcsEngineLifecycleServiceResult;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acll implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public acll(int i) {
        this.a = i;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 448
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r12) {
        /*
            Method dump skipped, instructions count: 1096
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acll.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new LogTimerRequest[i];
            case 1:
                return new LogEventRequest[i];
            case 2:
                return new MessageEventParcelable[i];
            case 3:
                return new NodeMigratedEventParcelable[i];
            case 4:
                return new NodeParcelable[i];
            case 5:
                return new OpenChannelResponse[i];
            case 6:
                return new PackageStorageInfo[i];
            case 7:
                return new PerformEapAkaResponse[i];
            case 8:
                return new PrivacyRecordOptinRequest[i];
            case 9:
                return new PutDataResponse[i];
            case 10:
                return new RecordTermConsentRequest[i];
            case 11:
                return new RecordUntetheredSupervisedAccountTransferRequest[i];
            case 12:
                return new RemoveListenerRequest[i];
            case 13:
                return new RemoveLocalCapabilityResponse[i];
            case 14:
                return new RestoreCompletedEventParcelable[i];
            case 15:
                return new RpcResponse[i];
            case 16:
                return new SaveRestoreStateRequest[i];
            case 17:
                return new SendMessageResponse[i];
            case 18:
                return new StartRestoreSessionRequest[i];
            case 19:
                return new StorageInfoResponse[i];
            default:
                return new RcsEngineLifecycleServiceResult[i];
        }
    }
}
