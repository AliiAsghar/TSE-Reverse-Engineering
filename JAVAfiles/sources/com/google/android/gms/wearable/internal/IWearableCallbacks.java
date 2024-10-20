package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.IGmsServiceBroker;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IWearableCallbacks extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IWearableCallbacks {
        static final int TRANSACTION_onAddLocalCapability = 26;
        static final int TRANSACTION_onAppRecommendations = 40;
        static final int TRANSACTION_onBooleanResponse = 46;
        static final int TRANSACTION_onChannelReceiveFile = 19;
        static final int TRANSACTION_onChannelSendFile = 20;
        static final int TRANSACTION_onCloseChannel = 15;
        static final int TRANSACTION_onCloseChannelWithError = 16;
        static final int TRANSACTION_onDataHolderReady = 5;
        static final int TRANSACTION_onDeleteDataItem = 6;
        static final int TRANSACTION_onGetAllCapabilities = 23;
        static final int TRANSACTION_onGetAppTheme = 41;
        static final int TRANSACTION_onGetBackupSettingsSupported = 42;
        static final int TRANSACTION_onGetCapability = 22;
        static final int TRANSACTION_onGetChannelInputStream = 17;
        static final int TRANSACTION_onGetChannelOutputStream = 18;
        static final int TRANSACTION_onGetCloudSyncOptInOutDone = 28;
        static final int TRANSACTION_onGetCloudSyncOptInStatus = 30;
        static final int TRANSACTION_onGetCloudSyncSetting = 29;
        static final int TRANSACTION_onGetCompanionPackageForNode = 37;
        static final int TRANSACTION_onGetConfig = 2;
        static final int TRANSACTION_onGetConfigs = 13;
        static final int TRANSACTION_onGetConnectedNodes = 10;
        static final int TRANSACTION_onGetDataItem = 4;
        static final int TRANSACTION_onGetEapId = 35;
        static final int TRANSACTION_onGetFastpairAccountKeyByAccount = 50;
        static final int TRANSACTION_onGetFastpairAccountKeys = 48;
        static final int TRANSACTION_onGetFdForAsset = 8;
        static final int TRANSACTION_onGetLocalNode = 9;
        static final int TRANSACTION_onGetNodeId = 39;
        static final int TRANSACTION_onGetRestoreState = 47;
        static final int TRANSACTION_onGetRestoreSupported = 43;
        static final int TRANSACTION_onGetStorageInformation = 12;
        static final int TRANSACTION_onGetTerms = 49;
        static final int TRANSACTION_onOpenChannelCompleted = 14;
        static final int TRANSACTION_onPerformEapAka = 36;
        static final int TRANSACTION_onPutData = 3;
        static final int TRANSACTION_onRemoveLocalCapability = 27;
        static final int TRANSACTION_onSendMessage = 7;
        static final int TRANSACTION_onSendRequest = 34;
        static final int TRANSACTION_onStatus = 11;
        static final int TRANSACTION_onUserConsentStatus = 38;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IWearableCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.wearable.internal.IWearableCallbacks");
            }

            @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
            public void onAddLocalCapability(AddLocalCapabilityResponse addLocalCapabilityResponse) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, addLocalCapabilityResponse);
                transactAndReadExceptionReturnVoid(26, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
            public void onAppRecommendations(AppRecommendationsResponse appRecommendationsResponse) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, appRecommendationsResponse);
                transactAndReadExceptionReturnVoid(40, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
            public void onBooleanResponse(BooleanResponse booleanResponse) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, booleanResponse);
                transactAndReadExceptionReturnVoid(46, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
            public void onChannelReceiveFile(ChannelReceiveFileResponse channelReceiveFileResponse) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, channelReceiveFileResponse);
                transactAndReadExceptionReturnVoid(19, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
            public void onChannelSendFile(ChannelSendFileResponse channelSendFileResponse) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, channelSendFileResponse);
                transactAndReadExceptionReturnVoid(20, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
            public void onCloseChannel(CloseChannelResponse closeChannelResponse) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, closeChannelResponse);
                transactAndReadExceptionReturnVoid(15, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
            public void onCloseChannelWithError(CloseChannelResponse closeChannelResponse) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, closeChannelResponse);
                transactAndReadExceptionReturnVoid(16, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
            public void onDataHolderReady(DataHolder dataHolder) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, dataHolder);
                transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
            public void onDeleteDataItem(DeleteDataItemsResponse deleteDataItemsResponse) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, deleteDataItemsResponse);
                transactAndReadExceptionReturnVoid(6, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
            public void onGetAllCapabilities(GetAllCapabilitiesResponse getAllCapabilitiesResponse) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, getAllCapabilitiesResponse);
                transactAndReadExceptionReturnVoid(23, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
            public void onGetAppTheme(GetAppThemeResponse getAppThemeResponse) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, getAppThemeResponse);
                transactAndReadExceptionReturnVoid(41, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
            public void onGetBackupSettingsSupported(GetBackupSettingsSupportedResponse getBackupSettingsSupportedResponse) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, getBackupSettingsSupportedResponse);
                transactAndReadExceptionReturnVoid(42, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
            public void onGetCapability(GetCapabilityResponse getCapabilityResponse) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, getCapabilityResponse);
                transactAndReadExceptionReturnVoid(22, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
            public void onGetChannelInputStream(GetChannelInputStreamResponse getChannelInputStreamResponse) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, getChannelInputStreamResponse);
                transactAndReadExceptionReturnVoid(17, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
            public void onGetChannelOutputStream(GetChannelOutputStreamResponse getChannelOutputStreamResponse) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, getChannelOutputStreamResponse);
                transactAndReadExceptionReturnVoid(18, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
            public void onGetCloudSyncOptInOutDone(GetCloudSyncOptInOutDoneResponse getCloudSyncOptInOutDoneResponse) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, getCloudSyncOptInOutDoneResponse);
                transactAndReadExceptionReturnVoid(28, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
            public void onGetCloudSyncOptInStatus(GetCloudSyncOptInStatusResponse getCloudSyncOptInStatusResponse) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, getCloudSyncOptInStatusResponse);
                transactAndReadExceptionReturnVoid(30, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
            public void onGetCloudSyncSetting(GetCloudSyncSettingResponse getCloudSyncSettingResponse) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, getCloudSyncSettingResponse);
                transactAndReadExceptionReturnVoid(29, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
            public void onGetCompanionPackageForNode(GetCompanionPackageForNodeResponse getCompanionPackageForNodeResponse) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, getCompanionPackageForNodeResponse);
                transactAndReadExceptionReturnVoid(37, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
            public void onGetConfig(GetConfigResponse getConfigResponse) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, getConfigResponse);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
            public void onGetConfigs(GetConfigsResponse getConfigsResponse) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, getConfigsResponse);
                transactAndReadExceptionReturnVoid(13, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
            public void onGetConnectedNodes(GetConnectedNodesResponse getConnectedNodesResponse) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, getConnectedNodesResponse);
                transactAndReadExceptionReturnVoid(10, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
            public void onGetDataItem(GetDataItemResponse getDataItemResponse) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, getDataItemResponse);
                transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
            public void onGetEapId(GetEapIdResponse getEapIdResponse) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, getEapIdResponse);
                transactAndReadExceptionReturnVoid(35, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
            public void onGetFastpairAccountKeyByAccount(GetFastpairAccountKeyByAccountResponse getFastpairAccountKeyByAccountResponse) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, getFastpairAccountKeyByAccountResponse);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_onGetFastpairAccountKeyByAccount, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
            public void onGetFastpairAccountKeys(GetFastpairAccountKeysResponse getFastpairAccountKeysResponse) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, getFastpairAccountKeysResponse);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_onGetFastpairAccountKeys, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
            public void onGetFdForAsset(GetFdForAssetResponse getFdForAssetResponse) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, getFdForAssetResponse);
                transactAndReadExceptionReturnVoid(8, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
            public void onGetLocalNode(GetLocalNodeResponse getLocalNodeResponse) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, getLocalNodeResponse);
                transactAndReadExceptionReturnVoid(9, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
            public void onGetNodeId(GetNodeIdResponse getNodeIdResponse) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, getNodeIdResponse);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_onGetNodeId, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
            public void onGetRestoreState(GetRestoreStateResponse getRestoreStateResponse) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, getRestoreStateResponse);
                transactAndReadExceptionReturnVoid(47, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
            public void onGetRestoreSupported(GetRestoreSupportedResponse getRestoreSupportedResponse) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, getRestoreSupportedResponse);
                transactAndReadExceptionReturnVoid(43, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
            public void onGetStorageInformation(StorageInfoResponse storageInfoResponse) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, storageInfoResponse);
                transactAndReadExceptionReturnVoid(12, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
            public void onGetTerms(GetTermsResponse getTermsResponse) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, getTermsResponse);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_onGetTerms, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
            public void onOpenChannelCompleted(OpenChannelResponse openChannelResponse) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, openChannelResponse);
                transactAndReadExceptionReturnVoid(14, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
            public void onPerformEapAka(PerformEapAkaResponse performEapAkaResponse) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, performEapAkaResponse);
                transactAndReadExceptionReturnVoid(36, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
            public void onPutData(PutDataResponse putDataResponse) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, putDataResponse);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
            public void onRemoveLocalCapability(RemoveLocalCapabilityResponse removeLocalCapabilityResponse) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, removeLocalCapabilityResponse);
                transactAndReadExceptionReturnVoid(27, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
            public void onSendMessage(SendMessageResponse sendMessageResponse) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, sendMessageResponse);
                transactAndReadExceptionReturnVoid(7, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
            public void onSendRequest(RpcResponse rpcResponse) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, rpcResponse);
                transactAndReadExceptionReturnVoid(34, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
            public void onStatus(Status status) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                transactAndReadExceptionReturnVoid(11, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
            public void onUserConsentStatus(ConsentResponse consentResponse) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, consentResponse);
                transactAndReadExceptionReturnVoid(38, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.wearable.internal.IWearableCallbacks");
        }

        public static IWearableCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (queryLocalInterface instanceof IWearableCallbacks) {
                return (IWearableCallbacks) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 2:
                    GetConfigResponse getConfigResponse = (GetConfigResponse) iax.a(parcel, GetConfigResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetConfig(getConfigResponse);
                    break;
                case 3:
                    PutDataResponse putDataResponse = (PutDataResponse) iax.a(parcel, PutDataResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onPutData(putDataResponse);
                    break;
                case 4:
                    GetDataItemResponse getDataItemResponse = (GetDataItemResponse) iax.a(parcel, GetDataItemResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetDataItem(getDataItemResponse);
                    break;
                case 5:
                    DataHolder dataHolder = (DataHolder) iax.a(parcel, DataHolder.CREATOR);
                    enforceNoDataAvail(parcel);
                    onDataHolderReady(dataHolder);
                    break;
                case 6:
                    DeleteDataItemsResponse deleteDataItemsResponse = (DeleteDataItemsResponse) iax.a(parcel, DeleteDataItemsResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onDeleteDataItem(deleteDataItemsResponse);
                    break;
                case 7:
                    SendMessageResponse sendMessageResponse = (SendMessageResponse) iax.a(parcel, SendMessageResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onSendMessage(sendMessageResponse);
                    break;
                case 8:
                    GetFdForAssetResponse getFdForAssetResponse = (GetFdForAssetResponse) iax.a(parcel, GetFdForAssetResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetFdForAsset(getFdForAssetResponse);
                    break;
                case 9:
                    GetLocalNodeResponse getLocalNodeResponse = (GetLocalNodeResponse) iax.a(parcel, GetLocalNodeResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetLocalNode(getLocalNodeResponse);
                    break;
                case 10:
                    GetConnectedNodesResponse getConnectedNodesResponse = (GetConnectedNodesResponse) iax.a(parcel, GetConnectedNodesResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetConnectedNodes(getConnectedNodesResponse);
                    break;
                case 11:
                    Status status = (Status) iax.a(parcel, Status.CREATOR);
                    enforceNoDataAvail(parcel);
                    onStatus(status);
                    break;
                case 12:
                    StorageInfoResponse storageInfoResponse = (StorageInfoResponse) iax.a(parcel, StorageInfoResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetStorageInformation(storageInfoResponse);
                    break;
                case 13:
                    GetConfigsResponse getConfigsResponse = (GetConfigsResponse) iax.a(parcel, GetConfigsResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetConfigs(getConfigsResponse);
                    break;
                case 14:
                    OpenChannelResponse openChannelResponse = (OpenChannelResponse) iax.a(parcel, OpenChannelResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onOpenChannelCompleted(openChannelResponse);
                    break;
                case 15:
                    CloseChannelResponse closeChannelResponse = (CloseChannelResponse) iax.a(parcel, CloseChannelResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onCloseChannel(closeChannelResponse);
                    break;
                case 16:
                    CloseChannelResponse closeChannelResponse2 = (CloseChannelResponse) iax.a(parcel, CloseChannelResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onCloseChannelWithError(closeChannelResponse2);
                    break;
                case 17:
                    GetChannelInputStreamResponse getChannelInputStreamResponse = (GetChannelInputStreamResponse) iax.a(parcel, GetChannelInputStreamResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetChannelInputStream(getChannelInputStreamResponse);
                    break;
                case 18:
                    GetChannelOutputStreamResponse getChannelOutputStreamResponse = (GetChannelOutputStreamResponse) iax.a(parcel, GetChannelOutputStreamResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetChannelOutputStream(getChannelOutputStreamResponse);
                    break;
                case 19:
                    ChannelReceiveFileResponse channelReceiveFileResponse = (ChannelReceiveFileResponse) iax.a(parcel, ChannelReceiveFileResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onChannelReceiveFile(channelReceiveFileResponse);
                    break;
                case 20:
                    ChannelSendFileResponse channelSendFileResponse = (ChannelSendFileResponse) iax.a(parcel, ChannelSendFileResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onChannelSendFile(channelSendFileResponse);
                    break;
                case 21:
                case 24:
                case 25:
                case 31:
                case 32:
                case IGmsServiceBroker.Stub.TRANSACTION_GET_CLOUD_SAVE_SERVICE /* 33 */:
                case IGmsServiceBroker.Stub.TRANSACTION_GET_DEVICE_CONNECTION_SERVICE /* 44 */:
                case IGmsServiceBroker.Stub.TRANSACTION_GET_KIDS_SERVICE /* 45 */:
                default:
                    return false;
                case 22:
                    GetCapabilityResponse getCapabilityResponse = (GetCapabilityResponse) iax.a(parcel, GetCapabilityResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetCapability(getCapabilityResponse);
                    break;
                case 23:
                    GetAllCapabilitiesResponse getAllCapabilitiesResponse = (GetAllCapabilitiesResponse) iax.a(parcel, GetAllCapabilitiesResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetAllCapabilities(getAllCapabilitiesResponse);
                    break;
                case 26:
                    AddLocalCapabilityResponse addLocalCapabilityResponse = (AddLocalCapabilityResponse) iax.a(parcel, AddLocalCapabilityResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onAddLocalCapability(addLocalCapabilityResponse);
                    break;
                case 27:
                    RemoveLocalCapabilityResponse removeLocalCapabilityResponse = (RemoveLocalCapabilityResponse) iax.a(parcel, RemoveLocalCapabilityResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onRemoveLocalCapability(removeLocalCapabilityResponse);
                    break;
                case 28:
                    GetCloudSyncOptInOutDoneResponse getCloudSyncOptInOutDoneResponse = (GetCloudSyncOptInOutDoneResponse) iax.a(parcel, GetCloudSyncOptInOutDoneResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetCloudSyncOptInOutDone(getCloudSyncOptInOutDoneResponse);
                    break;
                case 29:
                    GetCloudSyncSettingResponse getCloudSyncSettingResponse = (GetCloudSyncSettingResponse) iax.a(parcel, GetCloudSyncSettingResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetCloudSyncSetting(getCloudSyncSettingResponse);
                    break;
                case 30:
                    GetCloudSyncOptInStatusResponse getCloudSyncOptInStatusResponse = (GetCloudSyncOptInStatusResponse) iax.a(parcel, GetCloudSyncOptInStatusResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetCloudSyncOptInStatus(getCloudSyncOptInStatusResponse);
                    break;
                case 34:
                    RpcResponse rpcResponse = (RpcResponse) iax.a(parcel, RpcResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onSendRequest(rpcResponse);
                    break;
                case 35:
                    GetEapIdResponse getEapIdResponse = (GetEapIdResponse) iax.a(parcel, GetEapIdResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetEapId(getEapIdResponse);
                    break;
                case 36:
                    PerformEapAkaResponse performEapAkaResponse = (PerformEapAkaResponse) iax.a(parcel, PerformEapAkaResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onPerformEapAka(performEapAkaResponse);
                    break;
                case 37:
                    GetCompanionPackageForNodeResponse getCompanionPackageForNodeResponse = (GetCompanionPackageForNodeResponse) iax.a(parcel, GetCompanionPackageForNodeResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetCompanionPackageForNode(getCompanionPackageForNodeResponse);
                    break;
                case 38:
                    ConsentResponse consentResponse = (ConsentResponse) iax.a(parcel, ConsentResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onUserConsentStatus(consentResponse);
                    break;
                case TRANSACTION_onGetNodeId /* 39 */:
                    GetNodeIdResponse getNodeIdResponse = (GetNodeIdResponse) iax.a(parcel, GetNodeIdResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetNodeId(getNodeIdResponse);
                    break;
                case 40:
                    AppRecommendationsResponse appRecommendationsResponse = (AppRecommendationsResponse) iax.a(parcel, AppRecommendationsResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onAppRecommendations(appRecommendationsResponse);
                    break;
                case 41:
                    GetAppThemeResponse getAppThemeResponse = (GetAppThemeResponse) iax.a(parcel, GetAppThemeResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetAppTheme(getAppThemeResponse);
                    break;
                case 42:
                    GetBackupSettingsSupportedResponse getBackupSettingsSupportedResponse = (GetBackupSettingsSupportedResponse) iax.a(parcel, GetBackupSettingsSupportedResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetBackupSettingsSupported(getBackupSettingsSupportedResponse);
                    break;
                case 43:
                    GetRestoreSupportedResponse getRestoreSupportedResponse = (GetRestoreSupportedResponse) iax.a(parcel, GetRestoreSupportedResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetRestoreSupported(getRestoreSupportedResponse);
                    break;
                case 46:
                    BooleanResponse booleanResponse = (BooleanResponse) iax.a(parcel, BooleanResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onBooleanResponse(booleanResponse);
                    break;
                case 47:
                    GetRestoreStateResponse getRestoreStateResponse = (GetRestoreStateResponse) iax.a(parcel, GetRestoreStateResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetRestoreState(getRestoreStateResponse);
                    break;
                case TRANSACTION_onGetFastpairAccountKeys /* 48 */:
                    GetFastpairAccountKeysResponse getFastpairAccountKeysResponse = (GetFastpairAccountKeysResponse) iax.a(parcel, GetFastpairAccountKeysResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetFastpairAccountKeys(getFastpairAccountKeysResponse);
                    break;
                case TRANSACTION_onGetTerms /* 49 */:
                    GetTermsResponse getTermsResponse = (GetTermsResponse) iax.a(parcel, GetTermsResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetTerms(getTermsResponse);
                    break;
                case TRANSACTION_onGetFastpairAccountKeyByAccount /* 50 */:
                    GetFastpairAccountKeyByAccountResponse getFastpairAccountKeyByAccountResponse = (GetFastpairAccountKeyByAccountResponse) iax.a(parcel, GetFastpairAccountKeyByAccountResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetFastpairAccountKeyByAccount(getFastpairAccountKeyByAccountResponse);
                    break;
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void onAddLocalCapability(AddLocalCapabilityResponse addLocalCapabilityResponse);

    void onAppRecommendations(AppRecommendationsResponse appRecommendationsResponse);

    void onBooleanResponse(BooleanResponse booleanResponse);

    void onChannelReceiveFile(ChannelReceiveFileResponse channelReceiveFileResponse);

    void onChannelSendFile(ChannelSendFileResponse channelSendFileResponse);

    void onCloseChannel(CloseChannelResponse closeChannelResponse);

    void onCloseChannelWithError(CloseChannelResponse closeChannelResponse);

    void onDataHolderReady(DataHolder dataHolder);

    void onDeleteDataItem(DeleteDataItemsResponse deleteDataItemsResponse);

    void onGetAllCapabilities(GetAllCapabilitiesResponse getAllCapabilitiesResponse);

    void onGetAppTheme(GetAppThemeResponse getAppThemeResponse);

    void onGetBackupSettingsSupported(GetBackupSettingsSupportedResponse getBackupSettingsSupportedResponse);

    void onGetCapability(GetCapabilityResponse getCapabilityResponse);

    void onGetChannelInputStream(GetChannelInputStreamResponse getChannelInputStreamResponse);

    void onGetChannelOutputStream(GetChannelOutputStreamResponse getChannelOutputStreamResponse);

    void onGetCloudSyncOptInOutDone(GetCloudSyncOptInOutDoneResponse getCloudSyncOptInOutDoneResponse);

    void onGetCloudSyncOptInStatus(GetCloudSyncOptInStatusResponse getCloudSyncOptInStatusResponse);

    void onGetCloudSyncSetting(GetCloudSyncSettingResponse getCloudSyncSettingResponse);

    void onGetCompanionPackageForNode(GetCompanionPackageForNodeResponse getCompanionPackageForNodeResponse);

    void onGetConfig(GetConfigResponse getConfigResponse);

    void onGetConfigs(GetConfigsResponse getConfigsResponse);

    void onGetConnectedNodes(GetConnectedNodesResponse getConnectedNodesResponse);

    void onGetDataItem(GetDataItemResponse getDataItemResponse);

    void onGetEapId(GetEapIdResponse getEapIdResponse);

    void onGetFastpairAccountKeyByAccount(GetFastpairAccountKeyByAccountResponse getFastpairAccountKeyByAccountResponse);

    void onGetFastpairAccountKeys(GetFastpairAccountKeysResponse getFastpairAccountKeysResponse);

    void onGetFdForAsset(GetFdForAssetResponse getFdForAssetResponse);

    void onGetLocalNode(GetLocalNodeResponse getLocalNodeResponse);

    void onGetNodeId(GetNodeIdResponse getNodeIdResponse);

    void onGetRestoreState(GetRestoreStateResponse getRestoreStateResponse);

    void onGetRestoreSupported(GetRestoreSupportedResponse getRestoreSupportedResponse);

    void onGetStorageInformation(StorageInfoResponse storageInfoResponse);

    void onGetTerms(GetTermsResponse getTermsResponse);

    void onOpenChannelCompleted(OpenChannelResponse openChannelResponse);

    void onPerformEapAka(PerformEapAkaResponse performEapAkaResponse);

    void onPutData(PutDataResponse putDataResponse);

    void onRemoveLocalCapability(RemoveLocalCapabilityResponse removeLocalCapabilityResponse);

    void onSendMessage(SendMessageResponse sendMessageResponse);

    void onSendRequest(RpcResponse rpcResponse);

    void onStatus(Status status);

    void onUserConsentStatus(ConsentResponse consentResponse);
}
