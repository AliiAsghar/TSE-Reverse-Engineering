package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.internal.IWearableCallbacks;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class AbstractWearableCallbacks extends IWearableCallbacks.Stub {
    @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
    public void onAddLocalCapability(AddLocalCapabilityResponse addLocalCapabilityResponse) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
    public void onAppRecommendations(AppRecommendationsResponse appRecommendationsResponse) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
    public void onBooleanResponse(BooleanResponse booleanResponse) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
    public void onChannelReceiveFile(ChannelReceiveFileResponse channelReceiveFileResponse) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
    public void onChannelSendFile(ChannelSendFileResponse channelSendFileResponse) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
    public void onCloseChannel(CloseChannelResponse closeChannelResponse) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
    public void onCloseChannelWithError(CloseChannelResponse closeChannelResponse) {
        throw new UnsupportedOperationException();
    }

    public void onDataHolderReady(DataHolder dataHolder) {
        throw new UnsupportedOperationException();
    }

    public void onDeleteDataItem(DeleteDataItemsResponse deleteDataItemsResponse) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
    public void onGetAllCapabilities(GetAllCapabilitiesResponse getAllCapabilitiesResponse) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
    public void onGetAppTheme(GetAppThemeResponse getAppThemeResponse) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
    public void onGetBackupSettingsSupported(GetBackupSettingsSupportedResponse getBackupSettingsSupportedResponse) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
    public void onGetCapability(GetCapabilityResponse getCapabilityResponse) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
    public void onGetChannelInputStream(GetChannelInputStreamResponse getChannelInputStreamResponse) {
        throw new UnsupportedOperationException();
    }

    public void onGetChannelOutputStream(GetChannelOutputStreamResponse getChannelOutputStreamResponse) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
    @Deprecated
    public void onGetCloudSyncOptInOutDone(GetCloudSyncOptInOutDoneResponse getCloudSyncOptInOutDoneResponse) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
    public void onGetCloudSyncOptInStatus(GetCloudSyncOptInStatusResponse getCloudSyncOptInStatusResponse) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
    public void onGetCloudSyncSetting(GetCloudSyncSettingResponse getCloudSyncSettingResponse) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
    public void onGetCompanionPackageForNode(GetCompanionPackageForNodeResponse getCompanionPackageForNodeResponse) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
    public void onGetConfig(GetConfigResponse getConfigResponse) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
    public void onGetConfigs(GetConfigsResponse getConfigsResponse) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
    public void onGetConnectedNodes(GetConnectedNodesResponse getConnectedNodesResponse) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
    public void onGetDataItem(GetDataItemResponse getDataItemResponse) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
    public void onGetEapId(GetEapIdResponse getEapIdResponse) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
    public void onGetFastpairAccountKeyByAccount(GetFastpairAccountKeyByAccountResponse getFastpairAccountKeyByAccountResponse) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
    public void onGetFastpairAccountKeys(GetFastpairAccountKeysResponse getFastpairAccountKeysResponse) {
        throw new UnsupportedOperationException();
    }

    public void onGetFdForAsset(GetFdForAssetResponse getFdForAssetResponse) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
    public void onGetLocalNode(GetLocalNodeResponse getLocalNodeResponse) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
    public void onGetNodeId(GetNodeIdResponse getNodeIdResponse) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
    public void onGetRestoreState(GetRestoreStateResponse getRestoreStateResponse) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
    public void onGetRestoreSupported(GetRestoreSupportedResponse getRestoreSupportedResponse) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
    public void onGetStorageInformation(StorageInfoResponse storageInfoResponse) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
    public void onGetTerms(GetTermsResponse getTermsResponse) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
    public void onOpenChannelCompleted(OpenChannelResponse openChannelResponse) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
    public void onPerformEapAka(PerformEapAkaResponse performEapAkaResponse) {
        throw new UnsupportedOperationException();
    }

    public void onPutData(PutDataResponse putDataResponse) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
    public void onRemoveLocalCapability(RemoveLocalCapabilityResponse removeLocalCapabilityResponse) {
        throw new UnsupportedOperationException();
    }

    public void onSendMessage(SendMessageResponse sendMessageResponse) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
    public void onSendRequest(RpcResponse rpcResponse) {
        throw new UnsupportedOperationException();
    }

    public void onStatus(Status status) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
    public void onUserConsentStatus(ConsentResponse consentResponse) {
        throw new UnsupportedOperationException();
    }
}
