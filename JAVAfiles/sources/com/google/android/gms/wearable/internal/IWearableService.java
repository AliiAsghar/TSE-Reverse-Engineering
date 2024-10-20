package com.google.android.gms.wearable.internal;

import android.accounts.Account;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.android.vcard.VCardConstants;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.internal.IGmsServiceBroker;
import com.google.android.gms.wearable.AppRecommendationsRequest;
import com.google.android.gms.wearable.AppTheme;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.ConnectionConfiguration;
import com.google.android.gms.wearable.ConnectionDelayConfig;
import com.google.android.gms.wearable.MessageOptions;
import com.google.android.gms.wearable.PutDataRequest;
import com.google.android.gms.wearable.internal.IChannelStreamCallbacks;
import com.google.android.gms.wearable.internal.IWearableCallbacks;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IWearableService extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IWearableService {
        static final int TRANSACTION_acceptRingingCall = 26;
        static final int TRANSACTION_acceptTerms = 94;
        static final int TRANSACTION_addAccountToConsent = 66;
        static final int TRANSACTION_addListener = 16;
        static final int TRANSACTION_addLocalCapability = 46;
        static final int TRANSACTION_addSupervisedAccount = 70;
        static final int TRANSACTION_associateDeviceAndAccountWithFastPair = 64;
        static final int TRANSACTION_awaitDataSyncCompletion = 93;
        static final int TRANSACTION_cancelMigration = 76;
        static final int TRANSACTION_clearStorage = 19;
        static final int TRANSACTION_closeChannel = 32;
        static final int TRANSACTION_closeChannelWithError = 33;
        static final int TRANSACTION_deleteDataItems = 11;
        static final int TRANSACTION_deleteDataItemsByUriFilter = 41;
        static final int TRANSACTION_disableConnection = 5;
        static final int TRANSACTION_disableDeviceConnection = 24;
        static final int TRANSACTION_doAncsNegativeAction = 29;
        static final int TRANSACTION_doAncsPositiveAction = 28;
        static final int TRANSACTION_enableConnection = 4;
        static final int TRANSACTION_enableDeviceConnection = 23;
        static final int TRANSACTION_endCall = 25;
        static final int TRANSACTION_flushBatchedData = 103;
        static final int TRANSACTION_flushLogs = 109;
        static final int TRANSACTION_getAllCapabilities = 43;
        static final int TRANSACTION_getAppTheme = 78;
        static final int TRANSACTION_getBackupEnabled = 91;
        static final int TRANSACTION_getBackupSettingsSupported = 79;
        static final int TRANSACTION_getCapability = 42;
        static final int TRANSACTION_getChannelInputStream = 34;
        static final int TRANSACTION_getChannelOutputStream = 35;
        static final int TRANSACTION_getCloudSyncOptInOutDone = 49;
        static final int TRANSACTION_getCloudSyncOptInStatus = 52;
        static final int TRANSACTION_getCloudSyncSetting = 51;
        static final int TRANSACTION_getCompanionPackageForNode = 63;
        static final int TRANSACTION_getConfig = 3;
        static final int TRANSACTION_getConfigs = 22;
        static final int TRANSACTION_getConnectedNodes = 15;
        static final int TRANSACTION_getDataItem = 7;
        static final int TRANSACTION_getDataItems = 8;
        static final int TRANSACTION_getDataItemsByUri = 9;
        static final int TRANSACTION_getDataItemsByUriFilter = 40;
        static final int TRANSACTION_getEapId = 61;
        static final int TRANSACTION_getFastpairAccountKeyByAccount = 97;
        static final int TRANSACTION_getFastpairAccountKeys = 92;
        static final int TRANSACTION_getFdForAsset = 13;
        static final int TRANSACTION_getLocalNode = 14;
        static final int TRANSACTION_getNodeId = 67;
        static final int TRANSACTION_getPhoneSwitchingEnabled = 85;
        static final int TRANSACTION_getRecommendedApps = 68;
        static final int TRANSACTION_getRelatedConfigs = 73;
        static final int TRANSACTION_getRestoreState = 87;
        static final int TRANSACTION_getRestoreSupported = 80;
        static final int TRANSACTION_getStorageInformation = 18;
        static final int TRANSACTION_getTerms = 96;
        static final int TRANSACTION_getUserConsentStatus = 65;
        static final int TRANSACTION_getUserConsentStatusForWatch = 104;
        static final int TRANSACTION_injectAncsNotificationForTesting = 27;
        static final int TRANSACTION_isNodeActiveNetworkMetered = 90;
        static final int TRANSACTION_logCounter = 106;
        static final int TRANSACTION_logEvent = 107;
        static final int TRANSACTION_logTimer = 108;
        static final int TRANSACTION_migrateToConsentsPerWatch = 102;
        static final int TRANSACTION_openChannel = 31;
        static final int TRANSACTION_optInCloudSync = 48;
        static final int TRANSACTION_performEapAka = 62;
        static final int TRANSACTION_putConfig = 20;
        static final int TRANSACTION_putData = 6;
        static final int TRANSACTION_readChannelOutputFromFileDescriptor = 39;
        static final int TRANSACTION_recordConsentUntetheredSupervisedAccountTransfer = 105;
        static final int TRANSACTION_recordOptIn = 71;
        static final int TRANSACTION_recordSwaadlOptIn = 84;
        static final int TRANSACTION_recordTermConsent = 95;
        static final int TRANSACTION_removeConfig = 21;
        static final int TRANSACTION_removeListener = 17;
        static final int TRANSACTION_removeLocalCapability = 47;
        static final int TRANSACTION_retryDeviceConnection = 69;
        static final int TRANSACTION_saveRestoreState = 86;
        static final int TRANSACTION_sendAmsRemoteCommand = 53;
        static final int TRANSACTION_sendMessage = 12;
        static final int TRANSACTION_sendMessageWithOptions = 59;
        static final int TRANSACTION_sendRequest = 58;
        static final int TRANSACTION_sendRequestWithOptions = 60;
        static final int TRANSACTION_setCloudSyncSetting = 50;
        static final int TRANSACTION_setCloudSyncSettingByNode = 75;
        static final int TRANSACTION_setConfig = 2;
        static final int TRANSACTION_setThemeForApp = 77;
        static final int TRANSACTION_silenceRinger = 30;
        static final int TRANSACTION_startRestoreSession = 82;
        static final int TRANSACTION_syncConnectedWifiCredential = 89;
        static final int TRANSACTION_syncWifiCredential = 88;
        static final int TRANSACTION_syncWifiCredentials = 37;
        static final int TRANSACTION_updateConfig = 74;
        static final int TRANSACTION_updateConnectionStrategy = 72;
        static final int TRANSACTION_updateDelayConfig = 101;
        static final int TRANSACTION_writeChannelInputToFileDescriptor = 38;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IWearableService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.wearable.internal.IWearableService");
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void acceptRingingCall(IWearableCallbacks iWearableCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                transactAndReadExceptionReturnVoid(26, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void acceptTerms(IWearableCallbacks iWearableCallbacks, AcceptTermsRequest acceptTermsRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                iax.d(obtainAndWriteInterfaceToken, acceptTermsRequest);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_acceptTerms, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void addAccountToConsent(IWearableCallbacks iWearableCallbacks, AddAccountToConsentRequest addAccountToConsentRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                iax.d(obtainAndWriteInterfaceToken, addAccountToConsentRequest);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_addAccountToConsent, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void addListener(IWearableCallbacks iWearableCallbacks, AddListenerRequest addListenerRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                iax.d(obtainAndWriteInterfaceToken, addListenerRequest);
                transactAndReadExceptionReturnVoid(16, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void addLocalCapability(IWearableCallbacks iWearableCallbacks, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(46, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void addSupervisedAccount(IWearableCallbacks iWearableCallbacks, AddSupervisedAccountRequest addSupervisedAccountRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                iax.d(obtainAndWriteInterfaceToken, addSupervisedAccountRequest);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_addSupervisedAccount, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void associateDeviceAndAccountWithFastPair(IWearableCallbacks iWearableCallbacks, String str, Account account, String str2, String str3) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                iax.d(obtainAndWriteInterfaceToken, account);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeString(str3);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_associateDeviceAndAccountWithFastPair, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void awaitDataSyncCompletion(IWearableCallbacks iWearableCallbacks, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_awaitDataSyncCompletion, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void cancelMigration(IWearableCallbacks iWearableCallbacks, ConnectionConfiguration connectionConfiguration) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                iax.d(obtainAndWriteInterfaceToken, connectionConfiguration);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_cancelMigration, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void clearStorage(IWearableCallbacks iWearableCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                transactAndReadExceptionReturnVoid(19, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void closeChannel(IWearableCallbacks iWearableCallbacks, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(32, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void closeChannelWithError(IWearableCallbacks iWearableCallbacks, String str, int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(33, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void deleteDataItems(IWearableCallbacks iWearableCallbacks, Uri uri) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                iax.d(obtainAndWriteInterfaceToken, uri);
                transactAndReadExceptionReturnVoid(11, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void deleteDataItemsByUriFilter(IWearableCallbacks iWearableCallbacks, Uri uri, int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                iax.d(obtainAndWriteInterfaceToken, uri);
                obtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(41, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void disableConnection(IWearableCallbacks iWearableCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void disableDeviceConnection(IWearableCallbacks iWearableCallbacks, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(24, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void doAncsNegativeAction(IWearableCallbacks iWearableCallbacks, int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                obtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(29, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void doAncsPositiveAction(IWearableCallbacks iWearableCallbacks, int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                obtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(28, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void enableConnection(IWearableCallbacks iWearableCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void enableDeviceConnection(IWearableCallbacks iWearableCallbacks, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(23, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void endCall(IWearableCallbacks iWearableCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                transactAndReadExceptionReturnVoid(25, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void flushBatchedData(IWearableCallbacks iWearableCallbacks, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_flushBatchedData, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void flushLogs(IWearableCallbacks iWearableCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_flushLogs, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void getAllCapabilities(IWearableCallbacks iWearableCallbacks, int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                obtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(43, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void getAppTheme(IWearableCallbacks iWearableCallbacks, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getAppTheme, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void getBackupEnabled(IWearableCallbacks iWearableCallbacks, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getBackupEnabled, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void getBackupSettingsSupported(IWearableCallbacks iWearableCallbacks, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getBackupSettingsSupported, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void getCapability(IWearableCallbacks iWearableCallbacks, String str, int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(42, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void getChannelInputStream(IWearableCallbacks iWearableCallbacks, IChannelStreamCallbacks iChannelStreamCallbacks, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                iax.f(obtainAndWriteInterfaceToken, iChannelStreamCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(34, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void getChannelOutputStream(IWearableCallbacks iWearableCallbacks, IChannelStreamCallbacks iChannelStreamCallbacks, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                iax.f(obtainAndWriteInterfaceToken, iChannelStreamCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(35, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void getCloudSyncOptInOutDone(IWearableCallbacks iWearableCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getCloudSyncOptInOutDone, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void getCloudSyncOptInStatus(IWearableCallbacks iWearableCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getCloudSyncOptInStatus, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void getCloudSyncSetting(IWearableCallbacks iWearableCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getCloudSyncSetting, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void getCompanionPackageForNode(IWearableCallbacks iWearableCallbacks, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getCompanionPackageForNode, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void getConfig(IWearableCallbacks iWearableCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void getConfigs(IWearableCallbacks iWearableCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                transactAndReadExceptionReturnVoid(22, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void getConnectedNodes(IWearableCallbacks iWearableCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                transactAndReadExceptionReturnVoid(15, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void getDataItem(IWearableCallbacks iWearableCallbacks, Uri uri) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                iax.d(obtainAndWriteInterfaceToken, uri);
                transactAndReadExceptionReturnVoid(7, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void getDataItems(IWearableCallbacks iWearableCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                transactAndReadExceptionReturnVoid(8, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void getDataItemsByUri(IWearableCallbacks iWearableCallbacks, Uri uri) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                iax.d(obtainAndWriteInterfaceToken, uri);
                transactAndReadExceptionReturnVoid(9, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void getDataItemsByUriFilter(IWearableCallbacks iWearableCallbacks, Uri uri, int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                iax.d(obtainAndWriteInterfaceToken, uri);
                obtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(40, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void getEapId(IWearableCallbacks iWearableCallbacks, int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                obtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getEapId, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void getFastpairAccountKeyByAccount(IWearableCallbacks iWearableCallbacks, Account account) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                iax.d(obtainAndWriteInterfaceToken, account);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getFastpairAccountKeyByAccount, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void getFastpairAccountKeys(IWearableCallbacks iWearableCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getFastpairAccountKeys, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void getFdForAsset(IWearableCallbacks iWearableCallbacks, Asset asset) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                iax.d(obtainAndWriteInterfaceToken, asset);
                transactAndReadExceptionReturnVoid(13, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void getLocalNode(IWearableCallbacks iWearableCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                transactAndReadExceptionReturnVoid(14, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void getNodeId(IWearableCallbacks iWearableCallbacks, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getNodeId, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void getPhoneSwitchingEnabled(IWearableCallbacks iWearableCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getPhoneSwitchingEnabled, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void getRecommendedApps(IWearableCallbacks iWearableCallbacks, AppRecommendationsRequest appRecommendationsRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                iax.d(obtainAndWriteInterfaceToken, appRecommendationsRequest);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getRecommendedApps, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void getRelatedConfigs(IWearableCallbacks iWearableCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getRelatedConfigs, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void getRestoreState(IWearableCallbacks iWearableCallbacks, GetRestoreStateRequest getRestoreStateRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                iax.d(obtainAndWriteInterfaceToken, getRestoreStateRequest);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getRestoreState, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void getRestoreSupported(IWearableCallbacks iWearableCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getRestoreSupported, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void getStorageInformation(IWearableCallbacks iWearableCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                transactAndReadExceptionReturnVoid(18, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void getTerms(IWearableCallbacks iWearableCallbacks, int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                obtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getTerms, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void getUserConsentStatus(IWearableCallbacks iWearableCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getUserConsentStatus, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void getUserConsentStatusForWatch(IWearableCallbacks iWearableCallbacks, ConsentStatusRequest consentStatusRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                iax.d(obtainAndWriteInterfaceToken, consentStatusRequest);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getUserConsentStatusForWatch, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void injectAncsNotificationForTesting(IWearableCallbacks iWearableCallbacks, AncsNotificationParcelable ancsNotificationParcelable) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                iax.d(obtainAndWriteInterfaceToken, ancsNotificationParcelable);
                transactAndReadExceptionReturnVoid(27, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void isNodeActiveNetworkMetered(IWearableCallbacks iWearableCallbacks, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_isNodeActiveNetworkMetered, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void logCounter(IWearableCallbacks iWearableCallbacks, LogCounterRequest logCounterRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                iax.d(obtainAndWriteInterfaceToken, logCounterRequest);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_logCounter, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void logEvent(IWearableCallbacks iWearableCallbacks, LogEventRequest logEventRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                iax.d(obtainAndWriteInterfaceToken, logEventRequest);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_logEvent, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void logTimer(IWearableCallbacks iWearableCallbacks, LogTimerRequest logTimerRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                iax.d(obtainAndWriteInterfaceToken, logTimerRequest);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_logTimer, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void migrateToConsentsPerWatch(IWearableCallbacks iWearableCallbacks, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_migrateToConsentsPerWatch, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void openChannel(IWearableCallbacks iWearableCallbacks, String str, String str2) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                transactAndReadExceptionReturnVoid(31, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void optInCloudSync(IWearableCallbacks iWearableCallbacks, boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_optInCloudSync, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void performEapAka(IWearableCallbacks iWearableCallbacks, int i, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_performEapAka, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void putConfig(IWearableCallbacks iWearableCallbacks, ConnectionConfiguration connectionConfiguration) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                iax.d(obtainAndWriteInterfaceToken, connectionConfiguration);
                transactAndReadExceptionReturnVoid(20, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void putData(IWearableCallbacks iWearableCallbacks, PutDataRequest putDataRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                iax.d(obtainAndWriteInterfaceToken, putDataRequest);
                transactAndReadExceptionReturnVoid(6, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void readChannelOutputFromFileDescriptor(IWearableCallbacks iWearableCallbacks, String str, ParcelFileDescriptor parcelFileDescriptor, long j, long j2) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                iax.d(obtainAndWriteInterfaceToken, parcelFileDescriptor);
                obtainAndWriteInterfaceToken.writeLong(j);
                obtainAndWriteInterfaceToken.writeLong(j2);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_readChannelOutputFromFileDescriptor, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void recordConsentUntetheredSupervisedAccountTransfer(IWearableCallbacks iWearableCallbacks, RecordUntetheredSupervisedAccountTransferRequest recordUntetheredSupervisedAccountTransferRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                iax.d(obtainAndWriteInterfaceToken, recordUntetheredSupervisedAccountTransferRequest);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_recordConsentUntetheredSupervisedAccountTransfer, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void recordOptIn(IWearableCallbacks iWearableCallbacks, PrivacyRecordOptinRequest privacyRecordOptinRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                iax.d(obtainAndWriteInterfaceToken, privacyRecordOptinRequest);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_recordOptIn, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void recordSwaadlOptIn(IWearableCallbacks iWearableCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_recordSwaadlOptIn, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void recordTermConsent(IWearableCallbacks iWearableCallbacks, RecordTermConsentRequest recordTermConsentRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                iax.d(obtainAndWriteInterfaceToken, recordTermConsentRequest);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_recordTermConsent, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void removeConfig(IWearableCallbacks iWearableCallbacks, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(21, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void removeListener(IWearableCallbacks iWearableCallbacks, RemoveListenerRequest removeListenerRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                iax.d(obtainAndWriteInterfaceToken, removeListenerRequest);
                transactAndReadExceptionReturnVoid(17, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void removeLocalCapability(IWearableCallbacks iWearableCallbacks, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(47, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void retryDeviceConnection(IWearableCallbacks iWearableCallbacks, String str, boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_retryDeviceConnection, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void saveRestoreState(IWearableCallbacks iWearableCallbacks, SaveRestoreStateRequest saveRestoreStateRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                iax.d(obtainAndWriteInterfaceToken, saveRestoreStateRequest);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_saveRestoreState, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void sendAmsRemoteCommand(IWearableCallbacks iWearableCallbacks, byte b) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                obtainAndWriteInterfaceToken.writeByte(b);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_sendAmsRemoteCommand, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void sendMessage(IWearableCallbacks iWearableCallbacks, String str, String str2, byte[] bArr) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeByteArray(bArr);
                transactAndReadExceptionReturnVoid(12, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void sendMessageWithOptions(IWearableCallbacks iWearableCallbacks, String str, String str2, byte[] bArr, MessageOptions messageOptions) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeByteArray(bArr);
                iax.d(obtainAndWriteInterfaceToken, messageOptions);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_sendMessageWithOptions, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void sendRequest(IWearableCallbacks iWearableCallbacks, String str, String str2, byte[] bArr) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeByteArray(bArr);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_sendRequest, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void sendRequestWithOptions(IWearableCallbacks iWearableCallbacks, String str, String str2, byte[] bArr, MessageOptions messageOptions) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeByteArray(bArr);
                iax.d(obtainAndWriteInterfaceToken, messageOptions);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_sendRequestWithOptions, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void setCloudSyncSetting(IWearableCallbacks iWearableCallbacks, boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_setCloudSyncSetting, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void setCloudSyncSettingByNode(IWearableCallbacks iWearableCallbacks, String str, boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_setCloudSyncSettingByNode, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void setConfig(IWearableCallbacks iWearableCallbacks, ConnectionConfiguration connectionConfiguration) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                iax.d(obtainAndWriteInterfaceToken, connectionConfiguration);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void setThemeForApp(IWearableCallbacks iWearableCallbacks, AppTheme appTheme) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                iax.d(obtainAndWriteInterfaceToken, appTheme);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_setThemeForApp, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void silenceRinger(IWearableCallbacks iWearableCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                transactAndReadExceptionReturnVoid(30, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void startRestoreSession(IWearableCallbacks iWearableCallbacks, StartRestoreSessionRequest startRestoreSessionRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                iax.d(obtainAndWriteInterfaceToken, startRestoreSessionRequest);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_startRestoreSession, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void syncConnectedWifiCredential(IWearableCallbacks iWearableCallbacks, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_syncConnectedWifiCredential, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void syncWifiCredential(IWearableCallbacks iWearableCallbacks, String str, String str2) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_syncWifiCredential, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void syncWifiCredentials(IWearableCallbacks iWearableCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                transactAndReadExceptionReturnVoid(37, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void updateConfig(IWearableCallbacks iWearableCallbacks, ConnectionConfiguration connectionConfiguration) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                iax.d(obtainAndWriteInterfaceToken, connectionConfiguration);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_updateConfig, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void updateConnectionStrategy(IWearableCallbacks iWearableCallbacks, String str, int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_updateConnectionStrategy, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void updateDelayConfig(IWearableCallbacks iWearableCallbacks, ConnectionDelayConfig connectionDelayConfig) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                iax.d(obtainAndWriteInterfaceToken, connectionDelayConfig);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_updateDelayConfig, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void writeChannelInputToFileDescriptor(IWearableCallbacks iWearableCallbacks, String str, ParcelFileDescriptor parcelFileDescriptor) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWearableCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                iax.d(obtainAndWriteInterfaceToken, parcelFileDescriptor);
                transactAndReadExceptionReturnVoid(38, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.wearable.internal.IWearableService");
        }

        public static IWearableService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
            if (queryLocalInterface instanceof IWearableService) {
                return (IWearableService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 2:
                    IWearableCallbacks asInterface = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ConnectionConfiguration connectionConfiguration = (ConnectionConfiguration) iax.a(parcel, ConnectionConfiguration.CREATOR);
                    enforceNoDataAvail(parcel);
                    setConfig(asInterface, connectionConfiguration);
                    break;
                case 3:
                    IWearableCallbacks asInterface2 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getConfig(asInterface2);
                    break;
                case 4:
                    IWearableCallbacks asInterface3 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    enableConnection(asInterface3);
                    break;
                case 5:
                    IWearableCallbacks asInterface4 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    disableConnection(asInterface4);
                    break;
                case 6:
                    IWearableCallbacks asInterface5 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    PutDataRequest putDataRequest = (PutDataRequest) iax.a(parcel, PutDataRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    putData(asInterface5, putDataRequest);
                    break;
                case 7:
                    IWearableCallbacks asInterface6 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    Uri uri = (Uri) iax.a(parcel, Uri.CREATOR);
                    enforceNoDataAvail(parcel);
                    getDataItem(asInterface6, uri);
                    break;
                case 8:
                    IWearableCallbacks asInterface7 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getDataItems(asInterface7);
                    break;
                case 9:
                    IWearableCallbacks asInterface8 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    Uri uri2 = (Uri) iax.a(parcel, Uri.CREATOR);
                    enforceNoDataAvail(parcel);
                    getDataItemsByUri(asInterface8, uri2);
                    break;
                case 10:
                case IGmsServiceBroker.Stub.TRANSACTION_GET_DEVICE_MANAGER_SERVICE /* 36 */:
                case IGmsServiceBroker.Stub.TRANSACTION_GET_DEVICE_CONNECTION_SERVICE /* 44 */:
                case IGmsServiceBroker.Stub.TRANSACTION_GET_KIDS_SERVICE /* 45 */:
                case 54:
                case 55:
                case 56:
                case 57:
                case 81:
                case 83:
                case 98:
                case 99:
                case VCardConstants.DEFAULT_PREF /* 100 */:
                default:
                    return false;
                case 11:
                    IWearableCallbacks asInterface9 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    Uri uri3 = (Uri) iax.a(parcel, Uri.CREATOR);
                    enforceNoDataAvail(parcel);
                    deleteDataItems(asInterface9, uri3);
                    break;
                case 12:
                    IWearableCallbacks asInterface10 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    byte[] createByteArray = parcel.createByteArray();
                    enforceNoDataAvail(parcel);
                    sendMessage(asInterface10, readString, readString2, createByteArray);
                    break;
                case 13:
                    IWearableCallbacks asInterface11 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    Asset asset = (Asset) iax.a(parcel, Asset.CREATOR);
                    enforceNoDataAvail(parcel);
                    getFdForAsset(asInterface11, asset);
                    break;
                case 14:
                    IWearableCallbacks asInterface12 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getLocalNode(asInterface12);
                    break;
                case 15:
                    IWearableCallbacks asInterface13 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getConnectedNodes(asInterface13);
                    break;
                case 16:
                    IWearableCallbacks asInterface14 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    AddListenerRequest addListenerRequest = (AddListenerRequest) iax.a(parcel, AddListenerRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    addListener(asInterface14, addListenerRequest);
                    break;
                case 17:
                    IWearableCallbacks asInterface15 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    RemoveListenerRequest removeListenerRequest = (RemoveListenerRequest) iax.a(parcel, RemoveListenerRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    removeListener(asInterface15, removeListenerRequest);
                    break;
                case 18:
                    IWearableCallbacks asInterface16 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getStorageInformation(asInterface16);
                    break;
                case 19:
                    IWearableCallbacks asInterface17 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    clearStorage(asInterface17);
                    break;
                case 20:
                    IWearableCallbacks asInterface18 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ConnectionConfiguration connectionConfiguration2 = (ConnectionConfiguration) iax.a(parcel, ConnectionConfiguration.CREATOR);
                    enforceNoDataAvail(parcel);
                    putConfig(asInterface18, connectionConfiguration2);
                    break;
                case 21:
                    IWearableCallbacks asInterface19 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String readString3 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    removeConfig(asInterface19, readString3);
                    break;
                case 22:
                    IWearableCallbacks asInterface20 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getConfigs(asInterface20);
                    break;
                case 23:
                    IWearableCallbacks asInterface21 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String readString4 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    enableDeviceConnection(asInterface21, readString4);
                    break;
                case 24:
                    IWearableCallbacks asInterface22 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String readString5 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    disableDeviceConnection(asInterface22, readString5);
                    break;
                case 25:
                    IWearableCallbacks asInterface23 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    endCall(asInterface23);
                    break;
                case 26:
                    IWearableCallbacks asInterface24 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    acceptRingingCall(asInterface24);
                    break;
                case 27:
                    IWearableCallbacks asInterface25 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    AncsNotificationParcelable ancsNotificationParcelable = (AncsNotificationParcelable) iax.a(parcel, AncsNotificationParcelable.CREATOR);
                    enforceNoDataAvail(parcel);
                    injectAncsNotificationForTesting(asInterface25, ancsNotificationParcelable);
                    break;
                case 28:
                    IWearableCallbacks asInterface26 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    int readInt = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    doAncsPositiveAction(asInterface26, readInt);
                    break;
                case 29:
                    IWearableCallbacks asInterface27 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    int readInt2 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    doAncsNegativeAction(asInterface27, readInt2);
                    break;
                case 30:
                    IWearableCallbacks asInterface28 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    silenceRinger(asInterface28);
                    break;
                case 31:
                    IWearableCallbacks asInterface29 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String readString6 = parcel.readString();
                    String readString7 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    openChannel(asInterface29, readString6, readString7);
                    break;
                case 32:
                    IWearableCallbacks asInterface30 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String readString8 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    closeChannel(asInterface30, readString8);
                    break;
                case 33:
                    IWearableCallbacks asInterface31 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String readString9 = parcel.readString();
                    int readInt3 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    closeChannelWithError(asInterface31, readString9, readInt3);
                    break;
                case 34:
                    IWearableCallbacks asInterface32 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    IChannelStreamCallbacks asInterface33 = IChannelStreamCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String readString10 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    getChannelInputStream(asInterface32, asInterface33, readString10);
                    break;
                case 35:
                    IWearableCallbacks asInterface34 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    IChannelStreamCallbacks asInterface35 = IChannelStreamCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String readString11 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    getChannelOutputStream(asInterface34, asInterface35, readString11);
                    break;
                case 37:
                    IWearableCallbacks asInterface36 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    syncWifiCredentials(asInterface36);
                    break;
                case 38:
                    IWearableCallbacks asInterface37 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String readString12 = parcel.readString();
                    ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) iax.a(parcel, ParcelFileDescriptor.CREATOR);
                    enforceNoDataAvail(parcel);
                    writeChannelInputToFileDescriptor(asInterface37, readString12, parcelFileDescriptor);
                    break;
                case TRANSACTION_readChannelOutputFromFileDescriptor /* 39 */:
                    IWearableCallbacks asInterface38 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String readString13 = parcel.readString();
                    ParcelFileDescriptor parcelFileDescriptor2 = (ParcelFileDescriptor) iax.a(parcel, ParcelFileDescriptor.CREATOR);
                    long readLong = parcel.readLong();
                    long readLong2 = parcel.readLong();
                    enforceNoDataAvail(parcel);
                    readChannelOutputFromFileDescriptor(asInterface38, readString13, parcelFileDescriptor2, readLong, readLong2);
                    break;
                case 40:
                    IWearableCallbacks asInterface39 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    Uri uri4 = (Uri) iax.a(parcel, Uri.CREATOR);
                    int readInt4 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    getDataItemsByUriFilter(asInterface39, uri4, readInt4);
                    break;
                case 41:
                    IWearableCallbacks asInterface40 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    Uri uri5 = (Uri) iax.a(parcel, Uri.CREATOR);
                    int readInt5 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    deleteDataItemsByUriFilter(asInterface40, uri5, readInt5);
                    break;
                case 42:
                    IWearableCallbacks asInterface41 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String readString14 = parcel.readString();
                    int readInt6 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    getCapability(asInterface41, readString14, readInt6);
                    break;
                case 43:
                    IWearableCallbacks asInterface42 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    int readInt7 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    getAllCapabilities(asInterface42, readInt7);
                    break;
                case 46:
                    IWearableCallbacks asInterface43 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String readString15 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    addLocalCapability(asInterface43, readString15);
                    break;
                case 47:
                    IWearableCallbacks asInterface44 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String readString16 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    removeLocalCapability(asInterface44, readString16);
                    break;
                case TRANSACTION_optInCloudSync /* 48 */:
                    IWearableCallbacks asInterface45 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    boolean g = iax.g(parcel);
                    enforceNoDataAvail(parcel);
                    optInCloudSync(asInterface45, g);
                    break;
                case TRANSACTION_getCloudSyncOptInOutDone /* 49 */:
                    IWearableCallbacks asInterface46 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getCloudSyncOptInOutDone(asInterface46);
                    break;
                case TRANSACTION_setCloudSyncSetting /* 50 */:
                    IWearableCallbacks asInterface47 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    boolean g2 = iax.g(parcel);
                    enforceNoDataAvail(parcel);
                    setCloudSyncSetting(asInterface47, g2);
                    break;
                case TRANSACTION_getCloudSyncSetting /* 51 */:
                    IWearableCallbacks asInterface48 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getCloudSyncSetting(asInterface48);
                    break;
                case TRANSACTION_getCloudSyncOptInStatus /* 52 */:
                    IWearableCallbacks asInterface49 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getCloudSyncOptInStatus(asInterface49);
                    break;
                case TRANSACTION_sendAmsRemoteCommand /* 53 */:
                    IWearableCallbacks asInterface50 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    byte readByte = parcel.readByte();
                    enforceNoDataAvail(parcel);
                    sendAmsRemoteCommand(asInterface50, readByte);
                    break;
                case TRANSACTION_sendRequest /* 58 */:
                    IWearableCallbacks asInterface51 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String readString17 = parcel.readString();
                    String readString18 = parcel.readString();
                    byte[] createByteArray2 = parcel.createByteArray();
                    enforceNoDataAvail(parcel);
                    sendRequest(asInterface51, readString17, readString18, createByteArray2);
                    break;
                case TRANSACTION_sendMessageWithOptions /* 59 */:
                    IWearableCallbacks asInterface52 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String readString19 = parcel.readString();
                    String readString20 = parcel.readString();
                    byte[] createByteArray3 = parcel.createByteArray();
                    MessageOptions messageOptions = (MessageOptions) iax.a(parcel, MessageOptions.CREATOR);
                    enforceNoDataAvail(parcel);
                    sendMessageWithOptions(asInterface52, readString19, readString20, createByteArray3, messageOptions);
                    break;
                case TRANSACTION_sendRequestWithOptions /* 60 */:
                    IWearableCallbacks asInterface53 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String readString21 = parcel.readString();
                    String readString22 = parcel.readString();
                    byte[] createByteArray4 = parcel.createByteArray();
                    MessageOptions messageOptions2 = (MessageOptions) iax.a(parcel, MessageOptions.CREATOR);
                    enforceNoDataAvail(parcel);
                    sendRequestWithOptions(asInterface53, readString21, readString22, createByteArray4, messageOptions2);
                    break;
                case TRANSACTION_getEapId /* 61 */:
                    IWearableCallbacks asInterface54 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    int readInt8 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    getEapId(asInterface54, readInt8);
                    break;
                case TRANSACTION_performEapAka /* 62 */:
                    IWearableCallbacks asInterface55 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    int readInt9 = parcel.readInt();
                    String readString23 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    performEapAka(asInterface55, readInt9, readString23);
                    break;
                case TRANSACTION_getCompanionPackageForNode /* 63 */:
                    IWearableCallbacks asInterface56 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String readString24 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    getCompanionPackageForNode(asInterface56, readString24);
                    break;
                case TRANSACTION_associateDeviceAndAccountWithFastPair /* 64 */:
                    IWearableCallbacks asInterface57 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String readString25 = parcel.readString();
                    Account account = (Account) iax.a(parcel, Account.CREATOR);
                    String readString26 = parcel.readString();
                    String readString27 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    associateDeviceAndAccountWithFastPair(asInterface57, readString25, account, readString26, readString27);
                    break;
                case TRANSACTION_getUserConsentStatus /* 65 */:
                    IWearableCallbacks asInterface58 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getUserConsentStatus(asInterface58);
                    break;
                case TRANSACTION_addAccountToConsent /* 66 */:
                    IWearableCallbacks asInterface59 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    AddAccountToConsentRequest addAccountToConsentRequest = (AddAccountToConsentRequest) iax.a(parcel, AddAccountToConsentRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    addAccountToConsent(asInterface59, addAccountToConsentRequest);
                    break;
                case TRANSACTION_getNodeId /* 67 */:
                    IWearableCallbacks asInterface60 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String readString28 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    getNodeId(asInterface60, readString28);
                    break;
                case TRANSACTION_getRecommendedApps /* 68 */:
                    IWearableCallbacks asInterface61 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    AppRecommendationsRequest appRecommendationsRequest = (AppRecommendationsRequest) iax.a(parcel, AppRecommendationsRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    getRecommendedApps(asInterface61, appRecommendationsRequest);
                    break;
                case TRANSACTION_retryDeviceConnection /* 69 */:
                    IWearableCallbacks asInterface62 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String readString29 = parcel.readString();
                    boolean g3 = iax.g(parcel);
                    enforceNoDataAvail(parcel);
                    retryDeviceConnection(asInterface62, readString29, g3);
                    break;
                case TRANSACTION_addSupervisedAccount /* 70 */:
                    IWearableCallbacks asInterface63 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    AddSupervisedAccountRequest addSupervisedAccountRequest = (AddSupervisedAccountRequest) iax.a(parcel, AddSupervisedAccountRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    addSupervisedAccount(asInterface63, addSupervisedAccountRequest);
                    break;
                case TRANSACTION_recordOptIn /* 71 */:
                    IWearableCallbacks asInterface64 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    PrivacyRecordOptinRequest privacyRecordOptinRequest = (PrivacyRecordOptinRequest) iax.a(parcel, PrivacyRecordOptinRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    recordOptIn(asInterface64, privacyRecordOptinRequest);
                    break;
                case TRANSACTION_updateConnectionStrategy /* 72 */:
                    IWearableCallbacks asInterface65 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String readString30 = parcel.readString();
                    int readInt10 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    updateConnectionStrategy(asInterface65, readString30, readInt10);
                    break;
                case TRANSACTION_getRelatedConfigs /* 73 */:
                    IWearableCallbacks asInterface66 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getRelatedConfigs(asInterface66);
                    break;
                case TRANSACTION_updateConfig /* 74 */:
                    IWearableCallbacks asInterface67 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ConnectionConfiguration connectionConfiguration3 = (ConnectionConfiguration) iax.a(parcel, ConnectionConfiguration.CREATOR);
                    enforceNoDataAvail(parcel);
                    updateConfig(asInterface67, connectionConfiguration3);
                    break;
                case TRANSACTION_setCloudSyncSettingByNode /* 75 */:
                    IWearableCallbacks asInterface68 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String readString31 = parcel.readString();
                    boolean g4 = iax.g(parcel);
                    enforceNoDataAvail(parcel);
                    setCloudSyncSettingByNode(asInterface68, readString31, g4);
                    break;
                case TRANSACTION_cancelMigration /* 76 */:
                    IWearableCallbacks asInterface69 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ConnectionConfiguration connectionConfiguration4 = (ConnectionConfiguration) iax.a(parcel, ConnectionConfiguration.CREATOR);
                    enforceNoDataAvail(parcel);
                    cancelMigration(asInterface69, connectionConfiguration4);
                    break;
                case TRANSACTION_setThemeForApp /* 77 */:
                    IWearableCallbacks asInterface70 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    AppTheme appTheme = (AppTheme) iax.a(parcel, AppTheme.CREATOR);
                    enforceNoDataAvail(parcel);
                    setThemeForApp(asInterface70, appTheme);
                    break;
                case TRANSACTION_getAppTheme /* 78 */:
                    IWearableCallbacks asInterface71 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String readString32 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    getAppTheme(asInterface71, readString32);
                    break;
                case TRANSACTION_getBackupSettingsSupported /* 79 */:
                    IWearableCallbacks asInterface72 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String readString33 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    getBackupSettingsSupported(asInterface72, readString33);
                    break;
                case TRANSACTION_getRestoreSupported /* 80 */:
                    IWearableCallbacks asInterface73 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getRestoreSupported(asInterface73);
                    break;
                case TRANSACTION_startRestoreSession /* 82 */:
                    IWearableCallbacks asInterface74 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    StartRestoreSessionRequest startRestoreSessionRequest = (StartRestoreSessionRequest) iax.a(parcel, StartRestoreSessionRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    startRestoreSession(asInterface74, startRestoreSessionRequest);
                    break;
                case TRANSACTION_recordSwaadlOptIn /* 84 */:
                    IWearableCallbacks asInterface75 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    recordSwaadlOptIn(asInterface75);
                    break;
                case TRANSACTION_getPhoneSwitchingEnabled /* 85 */:
                    IWearableCallbacks asInterface76 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getPhoneSwitchingEnabled(asInterface76);
                    break;
                case TRANSACTION_saveRestoreState /* 86 */:
                    IWearableCallbacks asInterface77 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    SaveRestoreStateRequest saveRestoreStateRequest = (SaveRestoreStateRequest) iax.a(parcel, SaveRestoreStateRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    saveRestoreState(asInterface77, saveRestoreStateRequest);
                    break;
                case TRANSACTION_getRestoreState /* 87 */:
                    IWearableCallbacks asInterface78 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    GetRestoreStateRequest getRestoreStateRequest = (GetRestoreStateRequest) iax.a(parcel, GetRestoreStateRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    getRestoreState(asInterface78, getRestoreStateRequest);
                    break;
                case TRANSACTION_syncWifiCredential /* 88 */:
                    IWearableCallbacks asInterface79 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String readString34 = parcel.readString();
                    String readString35 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    syncWifiCredential(asInterface79, readString34, readString35);
                    break;
                case TRANSACTION_syncConnectedWifiCredential /* 89 */:
                    IWearableCallbacks asInterface80 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String readString36 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    syncConnectedWifiCredential(asInterface80, readString36);
                    break;
                case TRANSACTION_isNodeActiveNetworkMetered /* 90 */:
                    IWearableCallbacks asInterface81 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String readString37 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    isNodeActiveNetworkMetered(asInterface81, readString37);
                    break;
                case TRANSACTION_getBackupEnabled /* 91 */:
                    IWearableCallbacks asInterface82 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String readString38 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    getBackupEnabled(asInterface82, readString38);
                    break;
                case TRANSACTION_getFastpairAccountKeys /* 92 */:
                    IWearableCallbacks asInterface83 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getFastpairAccountKeys(asInterface83);
                    break;
                case TRANSACTION_awaitDataSyncCompletion /* 93 */:
                    IWearableCallbacks asInterface84 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String readString39 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    awaitDataSyncCompletion(asInterface84, readString39);
                    break;
                case TRANSACTION_acceptTerms /* 94 */:
                    IWearableCallbacks asInterface85 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    AcceptTermsRequest acceptTermsRequest = (AcceptTermsRequest) iax.a(parcel, AcceptTermsRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    acceptTerms(asInterface85, acceptTermsRequest);
                    break;
                case TRANSACTION_recordTermConsent /* 95 */:
                    IWearableCallbacks asInterface86 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    RecordTermConsentRequest recordTermConsentRequest = (RecordTermConsentRequest) iax.a(parcel, RecordTermConsentRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    recordTermConsent(asInterface86, recordTermConsentRequest);
                    break;
                case TRANSACTION_getTerms /* 96 */:
                    IWearableCallbacks asInterface87 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    int readInt11 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    getTerms(asInterface87, readInt11);
                    break;
                case TRANSACTION_getFastpairAccountKeyByAccount /* 97 */:
                    IWearableCallbacks asInterface88 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    Account account2 = (Account) iax.a(parcel, Account.CREATOR);
                    enforceNoDataAvail(parcel);
                    getFastpairAccountKeyByAccount(asInterface88, account2);
                    break;
                case TRANSACTION_updateDelayConfig /* 101 */:
                    IWearableCallbacks asInterface89 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ConnectionDelayConfig connectionDelayConfig = (ConnectionDelayConfig) iax.a(parcel, ConnectionDelayConfig.CREATOR);
                    enforceNoDataAvail(parcel);
                    updateDelayConfig(asInterface89, connectionDelayConfig);
                    break;
                case TRANSACTION_migrateToConsentsPerWatch /* 102 */:
                    IWearableCallbacks asInterface90 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String readString40 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    migrateToConsentsPerWatch(asInterface90, readString40);
                    break;
                case TRANSACTION_flushBatchedData /* 103 */:
                    IWearableCallbacks asInterface91 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String readString41 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    flushBatchedData(asInterface91, readString41);
                    break;
                case TRANSACTION_getUserConsentStatusForWatch /* 104 */:
                    IWearableCallbacks asInterface92 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ConsentStatusRequest consentStatusRequest = (ConsentStatusRequest) iax.a(parcel, ConsentStatusRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    getUserConsentStatusForWatch(asInterface92, consentStatusRequest);
                    break;
                case TRANSACTION_recordConsentUntetheredSupervisedAccountTransfer /* 105 */:
                    IWearableCallbacks asInterface93 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    RecordUntetheredSupervisedAccountTransferRequest recordUntetheredSupervisedAccountTransferRequest = (RecordUntetheredSupervisedAccountTransferRequest) iax.a(parcel, RecordUntetheredSupervisedAccountTransferRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    recordConsentUntetheredSupervisedAccountTransfer(asInterface93, recordUntetheredSupervisedAccountTransferRequest);
                    break;
                case TRANSACTION_logCounter /* 106 */:
                    IWearableCallbacks asInterface94 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    LogCounterRequest logCounterRequest = (LogCounterRequest) iax.a(parcel, LogCounterRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    logCounter(asInterface94, logCounterRequest);
                    break;
                case TRANSACTION_logEvent /* 107 */:
                    IWearableCallbacks asInterface95 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    LogEventRequest logEventRequest = (LogEventRequest) iax.a(parcel, LogEventRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    logEvent(asInterface95, logEventRequest);
                    break;
                case TRANSACTION_logTimer /* 108 */:
                    IWearableCallbacks asInterface96 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    LogTimerRequest logTimerRequest = (LogTimerRequest) iax.a(parcel, LogTimerRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    logTimer(asInterface96, logTimerRequest);
                    break;
                case TRANSACTION_flushLogs /* 109 */:
                    IWearableCallbacks asInterface97 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    flushLogs(asInterface97);
                    break;
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void acceptRingingCall(IWearableCallbacks iWearableCallbacks);

    void acceptTerms(IWearableCallbacks iWearableCallbacks, AcceptTermsRequest acceptTermsRequest);

    void addAccountToConsent(IWearableCallbacks iWearableCallbacks, AddAccountToConsentRequest addAccountToConsentRequest);

    void addListener(IWearableCallbacks iWearableCallbacks, AddListenerRequest addListenerRequest);

    void addLocalCapability(IWearableCallbacks iWearableCallbacks, String str);

    void addSupervisedAccount(IWearableCallbacks iWearableCallbacks, AddSupervisedAccountRequest addSupervisedAccountRequest);

    void associateDeviceAndAccountWithFastPair(IWearableCallbacks iWearableCallbacks, String str, Account account, String str2, String str3);

    void awaitDataSyncCompletion(IWearableCallbacks iWearableCallbacks, String str);

    void cancelMigration(IWearableCallbacks iWearableCallbacks, ConnectionConfiguration connectionConfiguration);

    void clearStorage(IWearableCallbacks iWearableCallbacks);

    void closeChannel(IWearableCallbacks iWearableCallbacks, String str);

    void closeChannelWithError(IWearableCallbacks iWearableCallbacks, String str, int i);

    void deleteDataItems(IWearableCallbacks iWearableCallbacks, Uri uri);

    void deleteDataItemsByUriFilter(IWearableCallbacks iWearableCallbacks, Uri uri, int i);

    void disableConnection(IWearableCallbacks iWearableCallbacks);

    void disableDeviceConnection(IWearableCallbacks iWearableCallbacks, String str);

    void doAncsNegativeAction(IWearableCallbacks iWearableCallbacks, int i);

    void doAncsPositiveAction(IWearableCallbacks iWearableCallbacks, int i);

    void enableConnection(IWearableCallbacks iWearableCallbacks);

    void enableDeviceConnection(IWearableCallbacks iWearableCallbacks, String str);

    void endCall(IWearableCallbacks iWearableCallbacks);

    void flushBatchedData(IWearableCallbacks iWearableCallbacks, String str);

    void flushLogs(IWearableCallbacks iWearableCallbacks);

    void getAllCapabilities(IWearableCallbacks iWearableCallbacks, int i);

    void getAppTheme(IWearableCallbacks iWearableCallbacks, String str);

    void getBackupEnabled(IWearableCallbacks iWearableCallbacks, String str);

    void getBackupSettingsSupported(IWearableCallbacks iWearableCallbacks, String str);

    void getCapability(IWearableCallbacks iWearableCallbacks, String str, int i);

    void getChannelInputStream(IWearableCallbacks iWearableCallbacks, IChannelStreamCallbacks iChannelStreamCallbacks, String str);

    void getChannelOutputStream(IWearableCallbacks iWearableCallbacks, IChannelStreamCallbacks iChannelStreamCallbacks, String str);

    void getCloudSyncOptInOutDone(IWearableCallbacks iWearableCallbacks);

    void getCloudSyncOptInStatus(IWearableCallbacks iWearableCallbacks);

    void getCloudSyncSetting(IWearableCallbacks iWearableCallbacks);

    void getCompanionPackageForNode(IWearableCallbacks iWearableCallbacks, String str);

    void getConfig(IWearableCallbacks iWearableCallbacks);

    void getConfigs(IWearableCallbacks iWearableCallbacks);

    void getConnectedNodes(IWearableCallbacks iWearableCallbacks);

    void getDataItem(IWearableCallbacks iWearableCallbacks, Uri uri);

    void getDataItems(IWearableCallbacks iWearableCallbacks);

    void getDataItemsByUri(IWearableCallbacks iWearableCallbacks, Uri uri);

    void getDataItemsByUriFilter(IWearableCallbacks iWearableCallbacks, Uri uri, int i);

    void getEapId(IWearableCallbacks iWearableCallbacks, int i);

    void getFastpairAccountKeyByAccount(IWearableCallbacks iWearableCallbacks, Account account);

    void getFastpairAccountKeys(IWearableCallbacks iWearableCallbacks);

    void getFdForAsset(IWearableCallbacks iWearableCallbacks, Asset asset);

    void getLocalNode(IWearableCallbacks iWearableCallbacks);

    void getNodeId(IWearableCallbacks iWearableCallbacks, String str);

    void getPhoneSwitchingEnabled(IWearableCallbacks iWearableCallbacks);

    void getRecommendedApps(IWearableCallbacks iWearableCallbacks, AppRecommendationsRequest appRecommendationsRequest);

    void getRelatedConfigs(IWearableCallbacks iWearableCallbacks);

    void getRestoreState(IWearableCallbacks iWearableCallbacks, GetRestoreStateRequest getRestoreStateRequest);

    void getRestoreSupported(IWearableCallbacks iWearableCallbacks);

    void getStorageInformation(IWearableCallbacks iWearableCallbacks);

    void getTerms(IWearableCallbacks iWearableCallbacks, int i);

    void getUserConsentStatus(IWearableCallbacks iWearableCallbacks);

    void getUserConsentStatusForWatch(IWearableCallbacks iWearableCallbacks, ConsentStatusRequest consentStatusRequest);

    void injectAncsNotificationForTesting(IWearableCallbacks iWearableCallbacks, AncsNotificationParcelable ancsNotificationParcelable);

    void isNodeActiveNetworkMetered(IWearableCallbacks iWearableCallbacks, String str);

    void logCounter(IWearableCallbacks iWearableCallbacks, LogCounterRequest logCounterRequest);

    void logEvent(IWearableCallbacks iWearableCallbacks, LogEventRequest logEventRequest);

    void logTimer(IWearableCallbacks iWearableCallbacks, LogTimerRequest logTimerRequest);

    void migrateToConsentsPerWatch(IWearableCallbacks iWearableCallbacks, String str);

    void openChannel(IWearableCallbacks iWearableCallbacks, String str, String str2);

    void optInCloudSync(IWearableCallbacks iWearableCallbacks, boolean z);

    void performEapAka(IWearableCallbacks iWearableCallbacks, int i, String str);

    void putConfig(IWearableCallbacks iWearableCallbacks, ConnectionConfiguration connectionConfiguration);

    void putData(IWearableCallbacks iWearableCallbacks, PutDataRequest putDataRequest);

    void readChannelOutputFromFileDescriptor(IWearableCallbacks iWearableCallbacks, String str, ParcelFileDescriptor parcelFileDescriptor, long j, long j2);

    void recordConsentUntetheredSupervisedAccountTransfer(IWearableCallbacks iWearableCallbacks, RecordUntetheredSupervisedAccountTransferRequest recordUntetheredSupervisedAccountTransferRequest);

    void recordOptIn(IWearableCallbacks iWearableCallbacks, PrivacyRecordOptinRequest privacyRecordOptinRequest);

    void recordSwaadlOptIn(IWearableCallbacks iWearableCallbacks);

    void recordTermConsent(IWearableCallbacks iWearableCallbacks, RecordTermConsentRequest recordTermConsentRequest);

    void removeConfig(IWearableCallbacks iWearableCallbacks, String str);

    void removeListener(IWearableCallbacks iWearableCallbacks, RemoveListenerRequest removeListenerRequest);

    void removeLocalCapability(IWearableCallbacks iWearableCallbacks, String str);

    void retryDeviceConnection(IWearableCallbacks iWearableCallbacks, String str, boolean z);

    void saveRestoreState(IWearableCallbacks iWearableCallbacks, SaveRestoreStateRequest saveRestoreStateRequest);

    void sendAmsRemoteCommand(IWearableCallbacks iWearableCallbacks, byte b);

    void sendMessage(IWearableCallbacks iWearableCallbacks, String str, String str2, byte[] bArr);

    void sendMessageWithOptions(IWearableCallbacks iWearableCallbacks, String str, String str2, byte[] bArr, MessageOptions messageOptions);

    void sendRequest(IWearableCallbacks iWearableCallbacks, String str, String str2, byte[] bArr);

    void sendRequestWithOptions(IWearableCallbacks iWearableCallbacks, String str, String str2, byte[] bArr, MessageOptions messageOptions);

    void setCloudSyncSetting(IWearableCallbacks iWearableCallbacks, boolean z);

    void setCloudSyncSettingByNode(IWearableCallbacks iWearableCallbacks, String str, boolean z);

    void setConfig(IWearableCallbacks iWearableCallbacks, ConnectionConfiguration connectionConfiguration);

    void setThemeForApp(IWearableCallbacks iWearableCallbacks, AppTheme appTheme);

    void silenceRinger(IWearableCallbacks iWearableCallbacks);

    void startRestoreSession(IWearableCallbacks iWearableCallbacks, StartRestoreSessionRequest startRestoreSessionRequest);

    void syncConnectedWifiCredential(IWearableCallbacks iWearableCallbacks, String str);

    void syncWifiCredential(IWearableCallbacks iWearableCallbacks, String str, String str2);

    void syncWifiCredentials(IWearableCallbacks iWearableCallbacks);

    void updateConfig(IWearableCallbacks iWearableCallbacks, ConnectionConfiguration connectionConfiguration);

    void updateConnectionStrategy(IWearableCallbacks iWearableCallbacks, String str, int i);

    void updateDelayConfig(IWearableCallbacks iWearableCallbacks, ConnectionDelayConfig connectionDelayConfig);

    void writeChannelInputToFileDescriptor(IWearableCallbacks iWearableCallbacks, String str, ParcelFileDescriptor parcelFileDescriptor);
}
