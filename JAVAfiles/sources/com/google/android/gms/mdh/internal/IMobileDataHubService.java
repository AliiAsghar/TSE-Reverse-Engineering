package com.google.android.gms.mdh.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.mdh.LatestFootprintFilter;
import com.google.android.gms.mdh.MdhBroadcastListenerKey;
import com.google.android.gms.mdh.MdhBroadcastListenerParams;
import com.google.android.gms.mdh.SyncPolicy;
import com.google.android.gms.mdh.SyncStatus;
import com.google.android.gms.mdh.TimeSeriesFootprintsReadFilter;
import com.google.android.gms.mdh.TimeSeriesFootprintsSubscriptionFilter;
import com.google.android.gms.mdh.internal.IByteArrayCallback;
import com.google.android.gms.mdh.internal.IMdhFootprintsListCallback;
import com.google.android.gms.mdh.internal.IMdhFootprintsReadResultCallback;
import com.google.android.gms.mdh.internal.IMdhFootprintsRecordingSettingCallback;
import com.google.android.gms.mdh.internal.IMdhTimeSeriesFootprintsWriteResultCallback;
import com.google.android.gms.mdh.internal.ITrivialBigtableKeyValueCallback;
import defpackage.iax;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IMobileDataHubService extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IMobileDataHubService {
        static final int TRANSACTION_deleteTrivialBigtableCell = 4;
        static final int TRANSACTION_getChannelConfigListForTesting = 7;
        static final int TRANSACTION_injectChannelConfigListForTesting = 6;
        static final int TRANSACTION_readFootprintsRecordingSettings = 18;
        static final int TRANSACTION_readLatestFootprint = 9;
        static final int TRANSACTION_readLatestFootprintWithSyncStatus = 19;
        static final int TRANSACTION_readTimeSeriesFootprints = 15;
        static final int TRANSACTION_readTimeSeriesFootprintsWithSyncStatus = 20;
        static final int TRANSACTION_readTrivialBigtableCell = 1;
        static final int TRANSACTION_readTrivialBigtableRange = 2;
        static final int TRANSACTION_refreshChannelConfigList = 27;
        static final int TRANSACTION_registerBroadcastListener = 22;
        static final int TRANSACTION_resetData = 8;
        static final int TRANSACTION_resetTesting = 5;
        static final int TRANSACTION_startImmediateTask = 26;
        static final int TRANSACTION_subscribeFootprintsRecordingSettings = 17;
        static final int TRANSACTION_subscribeLatestFootprint = 11;
        static final int TRANSACTION_subscribeTimeSeriesFootprints = 14;
        static final int TRANSACTION_unregisterBroadcastListener = 23;
        static final int TRANSACTION_writeLatestFootprint = 10;
        static final int TRANSACTION_writeLatestOnlyChannelSyncStatus = 25;
        static final int TRANSACTION_writeTimeSeriesChannel = 16;
        static final int TRANSACTION_writeTimeSeriesChannelSyncStatus = 24;
        static final int TRANSACTION_writeTimeSeriesFootprint = 21;
        static final int TRANSACTION_writeTrivialBigtableCell = 3;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IMobileDataHubService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.mdh.internal.IMobileDataHubService");
            }

            @Override // com.google.android.gms.mdh.internal.IMobileDataHubService
            public void deleteTrivialBigtableCell(IStatusCallback iStatusCallback, String str, byte[] bArr, byte[] bArr2) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeByteArray(bArr);
                obtainAndWriteInterfaceToken.writeByteArray(bArr2);
                transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdh.internal.IMobileDataHubService
            public void getChannelConfigListForTesting(IByteArrayCallback iByteArrayCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iByteArrayCallback);
                transactAndReadExceptionReturnVoid(7, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdh.internal.IMobileDataHubService
            public void injectChannelConfigListForTesting(IStatusCallback iStatusCallback, byte[] bArr) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                obtainAndWriteInterfaceToken.writeByteArray(bArr);
                transactAndReadExceptionReturnVoid(6, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdh.internal.IMobileDataHubService
            public void readFootprintsRecordingSettings(IMdhFootprintsRecordingSettingCallback iMdhFootprintsRecordingSettingCallback, Account account, int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iMdhFootprintsRecordingSettingCallback);
                iax.d(obtainAndWriteInterfaceToken, account);
                obtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(18, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdh.internal.IMobileDataHubService
            public void readLatestFootprint(IMdhFootprintsListCallback iMdhFootprintsListCallback, Account account, int i, int i2, LatestFootprintFilter latestFootprintFilter) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iMdhFootprintsListCallback);
                iax.d(obtainAndWriteInterfaceToken, account);
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeInt(i2);
                iax.d(obtainAndWriteInterfaceToken, latestFootprintFilter);
                transactAndReadExceptionReturnVoid(9, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdh.internal.IMobileDataHubService
            public void readLatestFootprintWithSyncStatus(IMdhFootprintsReadResultCallback iMdhFootprintsReadResultCallback, Account account, int i, int i2, LatestFootprintFilter latestFootprintFilter) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iMdhFootprintsReadResultCallback);
                iax.d(obtainAndWriteInterfaceToken, account);
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeInt(i2);
                iax.d(obtainAndWriteInterfaceToken, latestFootprintFilter);
                transactAndReadExceptionReturnVoid(19, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdh.internal.IMobileDataHubService
            public void readTimeSeriesFootprints(IMdhFootprintsListCallback iMdhFootprintsListCallback, Account account, int i, int i2, TimeSeriesFootprintsReadFilter timeSeriesFootprintsReadFilter) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iMdhFootprintsListCallback);
                iax.d(obtainAndWriteInterfaceToken, account);
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeInt(i2);
                iax.d(obtainAndWriteInterfaceToken, timeSeriesFootprintsReadFilter);
                transactAndReadExceptionReturnVoid(15, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdh.internal.IMobileDataHubService
            public void readTimeSeriesFootprintsWithSyncStatus(IMdhFootprintsReadResultCallback iMdhFootprintsReadResultCallback, Account account, int i, int i2, TimeSeriesFootprintsReadFilter timeSeriesFootprintsReadFilter) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iMdhFootprintsReadResultCallback);
                iax.d(obtainAndWriteInterfaceToken, account);
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeInt(i2);
                iax.d(obtainAndWriteInterfaceToken, timeSeriesFootprintsReadFilter);
                transactAndReadExceptionReturnVoid(20, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdh.internal.IMobileDataHubService
            public void readTrivialBigtableCell(IByteArrayCallback iByteArrayCallback, String str, byte[] bArr, byte[] bArr2) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iByteArrayCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeByteArray(bArr);
                obtainAndWriteInterfaceToken.writeByteArray(bArr2);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdh.internal.IMobileDataHubService
            public void readTrivialBigtableRange(ITrivialBigtableKeyValueCallback iTrivialBigtableKeyValueCallback, String str, byte[] bArr, byte[] bArr2, byte[] bArr3) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iTrivialBigtableKeyValueCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeByteArray(bArr);
                obtainAndWriteInterfaceToken.writeByteArray(bArr2);
                obtainAndWriteInterfaceToken.writeByteArray(bArr3);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdh.internal.IMobileDataHubService
            public void refreshChannelConfigList(IStatusCallback iStatusCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(27, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdh.internal.IMobileDataHubService
            public void registerBroadcastListener(IStatusCallback iStatusCallback, MdhBroadcastListenerKey mdhBroadcastListenerKey, MdhBroadcastListenerParams mdhBroadcastListenerParams) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                iax.d(obtainAndWriteInterfaceToken, mdhBroadcastListenerKey);
                iax.d(obtainAndWriteInterfaceToken, mdhBroadcastListenerParams);
                transactAndReadExceptionReturnVoid(22, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdh.internal.IMobileDataHubService
            public void resetData(IStatusCallback iStatusCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(8, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdh.internal.IMobileDataHubService
            public void resetTesting(IStatusCallback iStatusCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdh.internal.IMobileDataHubService
            public void startImmediateTask(IStatusCallback iStatusCallback, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(26, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdh.internal.IMobileDataHubService
            public void subscribeFootprintsRecordingSettings(IStatusCallback iStatusCallback, Account account, List<Integer> list, SyncPolicy syncPolicy) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                iax.d(obtainAndWriteInterfaceToken, account);
                obtainAndWriteInterfaceToken.writeList(list);
                iax.d(obtainAndWriteInterfaceToken, syncPolicy);
                transactAndReadExceptionReturnVoid(17, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdh.internal.IMobileDataHubService
            public void subscribeLatestFootprint(IStatusCallback iStatusCallback, Account account, int i, int i2, SyncPolicy syncPolicy, LatestFootprintFilter latestFootprintFilter) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                iax.d(obtainAndWriteInterfaceToken, account);
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeInt(i2);
                iax.d(obtainAndWriteInterfaceToken, syncPolicy);
                iax.d(obtainAndWriteInterfaceToken, latestFootprintFilter);
                transactAndReadExceptionReturnVoid(11, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdh.internal.IMobileDataHubService
            public void subscribeTimeSeriesFootprints(IStatusCallback iStatusCallback, Account account, int i, int i2, SyncPolicy syncPolicy, TimeSeriesFootprintsSubscriptionFilter timeSeriesFootprintsSubscriptionFilter) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                iax.d(obtainAndWriteInterfaceToken, account);
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeInt(i2);
                iax.d(obtainAndWriteInterfaceToken, syncPolicy);
                iax.d(obtainAndWriteInterfaceToken, timeSeriesFootprintsSubscriptionFilter);
                transactAndReadExceptionReturnVoid(14, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdh.internal.IMobileDataHubService
            public void unregisterBroadcastListener(IStatusCallback iStatusCallback, MdhBroadcastListenerKey mdhBroadcastListenerKey) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                iax.d(obtainAndWriteInterfaceToken, mdhBroadcastListenerKey);
                transactAndReadExceptionReturnVoid(23, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdh.internal.IMobileDataHubService
            public void writeLatestFootprint(IStatusCallback iStatusCallback, Account account, int i, int i2, byte[] bArr, ByteArraySafeParcelable byteArraySafeParcelable) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                iax.d(obtainAndWriteInterfaceToken, account);
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeInt(i2);
                obtainAndWriteInterfaceToken.writeByteArray(bArr);
                iax.d(obtainAndWriteInterfaceToken, byteArraySafeParcelable);
                transactAndReadExceptionReturnVoid(10, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdh.internal.IMobileDataHubService
            public void writeLatestOnlyChannelSyncStatus(IStatusCallback iStatusCallback, Account account, int i, int i2, LatestFootprintFilter latestFootprintFilter, SyncStatus syncStatus) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                iax.d(obtainAndWriteInterfaceToken, account);
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeInt(i2);
                iax.d(obtainAndWriteInterfaceToken, latestFootprintFilter);
                iax.d(obtainAndWriteInterfaceToken, syncStatus);
                transactAndReadExceptionReturnVoid(25, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdh.internal.IMobileDataHubService
            public void writeTimeSeriesChannel(IStatusCallback iStatusCallback, Account account, int i, int i2, MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                iax.d(obtainAndWriteInterfaceToken, account);
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeInt(i2);
                iax.d(obtainAndWriteInterfaceToken, mdhFootprintListSafeParcelable);
                transactAndReadExceptionReturnVoid(16, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdh.internal.IMobileDataHubService
            public void writeTimeSeriesChannelSyncStatus(IStatusCallback iStatusCallback, Account account, int i, int i2, TimeSeriesFootprintsSubscriptionFilter timeSeriesFootprintsSubscriptionFilter, SyncStatus syncStatus) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                iax.d(obtainAndWriteInterfaceToken, account);
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeInt(i2);
                iax.d(obtainAndWriteInterfaceToken, timeSeriesFootprintsSubscriptionFilter);
                iax.d(obtainAndWriteInterfaceToken, syncStatus);
                transactAndReadExceptionReturnVoid(24, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdh.internal.IMobileDataHubService
            public void writeTimeSeriesFootprint(IMdhTimeSeriesFootprintsWriteResultCallback iMdhTimeSeriesFootprintsWriteResultCallback, Account account, int i, int i2, ByteArraySafeParcelable byteArraySafeParcelable) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iMdhTimeSeriesFootprintsWriteResultCallback);
                iax.d(obtainAndWriteInterfaceToken, account);
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeInt(i2);
                iax.d(obtainAndWriteInterfaceToken, byteArraySafeParcelable);
                transactAndReadExceptionReturnVoid(21, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdh.internal.IMobileDataHubService
            public void writeTrivialBigtableCell(IStatusCallback iStatusCallback, String str, byte[] bArr, byte[] bArr2, byte[] bArr3) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeByteArray(bArr);
                obtainAndWriteInterfaceToken.writeByteArray(bArr2);
                obtainAndWriteInterfaceToken.writeByteArray(bArr3);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.mdh.internal.IMobileDataHubService");
        }

        public static IMobileDataHubService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.mdh.internal.IMobileDataHubService");
            if (queryLocalInterface instanceof IMobileDataHubService) {
                return (IMobileDataHubService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    IByteArrayCallback asInterface = IByteArrayCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString = parcel.readString();
                    byte[] createByteArray = parcel.createByteArray();
                    byte[] createByteArray2 = parcel.createByteArray();
                    enforceNoDataAvail(parcel);
                    readTrivialBigtableCell(asInterface, readString, createByteArray, createByteArray2);
                    break;
                case 2:
                    ITrivialBigtableKeyValueCallback asInterface2 = ITrivialBigtableKeyValueCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString2 = parcel.readString();
                    byte[] createByteArray3 = parcel.createByteArray();
                    byte[] createByteArray4 = parcel.createByteArray();
                    byte[] createByteArray5 = parcel.createByteArray();
                    enforceNoDataAvail(parcel);
                    readTrivialBigtableRange(asInterface2, readString2, createByteArray3, createByteArray4, createByteArray5);
                    break;
                case 3:
                    IStatusCallback asInterface3 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString3 = parcel.readString();
                    byte[] createByteArray6 = parcel.createByteArray();
                    byte[] createByteArray7 = parcel.createByteArray();
                    byte[] createByteArray8 = parcel.createByteArray();
                    enforceNoDataAvail(parcel);
                    writeTrivialBigtableCell(asInterface3, readString3, createByteArray6, createByteArray7, createByteArray8);
                    break;
                case 4:
                    IStatusCallback asInterface4 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString4 = parcel.readString();
                    byte[] createByteArray9 = parcel.createByteArray();
                    byte[] createByteArray10 = parcel.createByteArray();
                    enforceNoDataAvail(parcel);
                    deleteTrivialBigtableCell(asInterface4, readString4, createByteArray9, createByteArray10);
                    break;
                case 5:
                    IStatusCallback asInterface5 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    resetTesting(asInterface5);
                    break;
                case 6:
                    IStatusCallback asInterface6 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    byte[] createByteArray11 = parcel.createByteArray();
                    enforceNoDataAvail(parcel);
                    injectChannelConfigListForTesting(asInterface6, createByteArray11);
                    break;
                case 7:
                    IByteArrayCallback asInterface7 = IByteArrayCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getChannelConfigListForTesting(asInterface7);
                    break;
                case 8:
                    IStatusCallback asInterface8 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    resetData(asInterface8);
                    break;
                case 9:
                    IMdhFootprintsListCallback asInterface9 = IMdhFootprintsListCallback.Stub.asInterface(parcel.readStrongBinder());
                    Account account = (Account) iax.a(parcel, Account.CREATOR);
                    int readInt = parcel.readInt();
                    int readInt2 = parcel.readInt();
                    LatestFootprintFilter latestFootprintFilter = (LatestFootprintFilter) iax.a(parcel, LatestFootprintFilter.CREATOR);
                    enforceNoDataAvail(parcel);
                    readLatestFootprint(asInterface9, account, readInt, readInt2, latestFootprintFilter);
                    break;
                case 10:
                    IStatusCallback asInterface10 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    Account account2 = (Account) iax.a(parcel, Account.CREATOR);
                    int readInt3 = parcel.readInt();
                    int readInt4 = parcel.readInt();
                    byte[] createByteArray12 = parcel.createByteArray();
                    ByteArraySafeParcelable byteArraySafeParcelable = (ByteArraySafeParcelable) iax.a(parcel, ByteArraySafeParcelable.CREATOR);
                    enforceNoDataAvail(parcel);
                    writeLatestFootprint(asInterface10, account2, readInt3, readInt4, createByteArray12, byteArraySafeParcelable);
                    break;
                case 11:
                    IStatusCallback asInterface11 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    Account account3 = (Account) iax.a(parcel, Account.CREATOR);
                    int readInt5 = parcel.readInt();
                    int readInt6 = parcel.readInt();
                    SyncPolicy syncPolicy = (SyncPolicy) iax.a(parcel, SyncPolicy.CREATOR);
                    LatestFootprintFilter latestFootprintFilter2 = (LatestFootprintFilter) iax.a(parcel, LatestFootprintFilter.CREATOR);
                    enforceNoDataAvail(parcel);
                    subscribeLatestFootprint(asInterface11, account3, readInt5, readInt6, syncPolicy, latestFootprintFilter2);
                    break;
                case 12:
                case 13:
                default:
                    return false;
                case 14:
                    IStatusCallback asInterface12 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    Account account4 = (Account) iax.a(parcel, Account.CREATOR);
                    int readInt7 = parcel.readInt();
                    int readInt8 = parcel.readInt();
                    SyncPolicy syncPolicy2 = (SyncPolicy) iax.a(parcel, SyncPolicy.CREATOR);
                    TimeSeriesFootprintsSubscriptionFilter timeSeriesFootprintsSubscriptionFilter = (TimeSeriesFootprintsSubscriptionFilter) iax.a(parcel, TimeSeriesFootprintsSubscriptionFilter.CREATOR);
                    enforceNoDataAvail(parcel);
                    subscribeTimeSeriesFootprints(asInterface12, account4, readInt7, readInt8, syncPolicy2, timeSeriesFootprintsSubscriptionFilter);
                    break;
                case 15:
                    IMdhFootprintsListCallback asInterface13 = IMdhFootprintsListCallback.Stub.asInterface(parcel.readStrongBinder());
                    Account account5 = (Account) iax.a(parcel, Account.CREATOR);
                    int readInt9 = parcel.readInt();
                    int readInt10 = parcel.readInt();
                    TimeSeriesFootprintsReadFilter timeSeriesFootprintsReadFilter = (TimeSeriesFootprintsReadFilter) iax.a(parcel, TimeSeriesFootprintsReadFilter.CREATOR);
                    enforceNoDataAvail(parcel);
                    readTimeSeriesFootprints(asInterface13, account5, readInt9, readInt10, timeSeriesFootprintsReadFilter);
                    break;
                case 16:
                    IStatusCallback asInterface14 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    Account account6 = (Account) iax.a(parcel, Account.CREATOR);
                    int readInt11 = parcel.readInt();
                    int readInt12 = parcel.readInt();
                    MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable = (MdhFootprintListSafeParcelable) iax.a(parcel, MdhFootprintListSafeParcelable.CREATOR);
                    enforceNoDataAvail(parcel);
                    writeTimeSeriesChannel(asInterface14, account6, readInt11, readInt12, mdhFootprintListSafeParcelable);
                    break;
                case 17:
                    IStatusCallback asInterface15 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    Account account7 = (Account) iax.a(parcel, Account.CREATOR);
                    ArrayList b = iax.b(parcel);
                    SyncPolicy syncPolicy3 = (SyncPolicy) iax.a(parcel, SyncPolicy.CREATOR);
                    enforceNoDataAvail(parcel);
                    subscribeFootprintsRecordingSettings(asInterface15, account7, b, syncPolicy3);
                    break;
                case 18:
                    IMdhFootprintsRecordingSettingCallback asInterface16 = IMdhFootprintsRecordingSettingCallback.Stub.asInterface(parcel.readStrongBinder());
                    Account account8 = (Account) iax.a(parcel, Account.CREATOR);
                    int readInt13 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    readFootprintsRecordingSettings(asInterface16, account8, readInt13);
                    break;
                case 19:
                    IMdhFootprintsReadResultCallback asInterface17 = IMdhFootprintsReadResultCallback.Stub.asInterface(parcel.readStrongBinder());
                    Account account9 = (Account) iax.a(parcel, Account.CREATOR);
                    int readInt14 = parcel.readInt();
                    int readInt15 = parcel.readInt();
                    LatestFootprintFilter latestFootprintFilter3 = (LatestFootprintFilter) iax.a(parcel, LatestFootprintFilter.CREATOR);
                    enforceNoDataAvail(parcel);
                    readLatestFootprintWithSyncStatus(asInterface17, account9, readInt14, readInt15, latestFootprintFilter3);
                    break;
                case 20:
                    IMdhFootprintsReadResultCallback asInterface18 = IMdhFootprintsReadResultCallback.Stub.asInterface(parcel.readStrongBinder());
                    Account account10 = (Account) iax.a(parcel, Account.CREATOR);
                    int readInt16 = parcel.readInt();
                    int readInt17 = parcel.readInt();
                    TimeSeriesFootprintsReadFilter timeSeriesFootprintsReadFilter2 = (TimeSeriesFootprintsReadFilter) iax.a(parcel, TimeSeriesFootprintsReadFilter.CREATOR);
                    enforceNoDataAvail(parcel);
                    readTimeSeriesFootprintsWithSyncStatus(asInterface18, account10, readInt16, readInt17, timeSeriesFootprintsReadFilter2);
                    break;
                case 21:
                    IMdhTimeSeriesFootprintsWriteResultCallback asInterface19 = IMdhTimeSeriesFootprintsWriteResultCallback.Stub.asInterface(parcel.readStrongBinder());
                    Account account11 = (Account) iax.a(parcel, Account.CREATOR);
                    int readInt18 = parcel.readInt();
                    int readInt19 = parcel.readInt();
                    ByteArraySafeParcelable byteArraySafeParcelable2 = (ByteArraySafeParcelable) iax.a(parcel, ByteArraySafeParcelable.CREATOR);
                    enforceNoDataAvail(parcel);
                    writeTimeSeriesFootprint(asInterface19, account11, readInt18, readInt19, byteArraySafeParcelable2);
                    break;
                case 22:
                    IStatusCallback asInterface20 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    MdhBroadcastListenerKey mdhBroadcastListenerKey = (MdhBroadcastListenerKey) iax.a(parcel, MdhBroadcastListenerKey.CREATOR);
                    MdhBroadcastListenerParams mdhBroadcastListenerParams = (MdhBroadcastListenerParams) iax.a(parcel, MdhBroadcastListenerParams.CREATOR);
                    enforceNoDataAvail(parcel);
                    registerBroadcastListener(asInterface20, mdhBroadcastListenerKey, mdhBroadcastListenerParams);
                    break;
                case 23:
                    IStatusCallback asInterface21 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    MdhBroadcastListenerKey mdhBroadcastListenerKey2 = (MdhBroadcastListenerKey) iax.a(parcel, MdhBroadcastListenerKey.CREATOR);
                    enforceNoDataAvail(parcel);
                    unregisterBroadcastListener(asInterface21, mdhBroadcastListenerKey2);
                    break;
                case 24:
                    IStatusCallback asInterface22 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    Account account12 = (Account) iax.a(parcel, Account.CREATOR);
                    int readInt20 = parcel.readInt();
                    int readInt21 = parcel.readInt();
                    TimeSeriesFootprintsSubscriptionFilter timeSeriesFootprintsSubscriptionFilter2 = (TimeSeriesFootprintsSubscriptionFilter) iax.a(parcel, TimeSeriesFootprintsSubscriptionFilter.CREATOR);
                    SyncStatus syncStatus = (SyncStatus) iax.a(parcel, SyncStatus.CREATOR);
                    enforceNoDataAvail(parcel);
                    writeTimeSeriesChannelSyncStatus(asInterface22, account12, readInt20, readInt21, timeSeriesFootprintsSubscriptionFilter2, syncStatus);
                    break;
                case 25:
                    IStatusCallback asInterface23 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    Account account13 = (Account) iax.a(parcel, Account.CREATOR);
                    int readInt22 = parcel.readInt();
                    int readInt23 = parcel.readInt();
                    LatestFootprintFilter latestFootprintFilter4 = (LatestFootprintFilter) iax.a(parcel, LatestFootprintFilter.CREATOR);
                    SyncStatus syncStatus2 = (SyncStatus) iax.a(parcel, SyncStatus.CREATOR);
                    enforceNoDataAvail(parcel);
                    writeLatestOnlyChannelSyncStatus(asInterface23, account13, readInt22, readInt23, latestFootprintFilter4, syncStatus2);
                    break;
                case 26:
                    IStatusCallback asInterface24 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString5 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    startImmediateTask(asInterface24, readString5);
                    break;
                case 27:
                    IStatusCallback asInterface25 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    refreshChannelConfigList(asInterface25);
                    break;
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void deleteTrivialBigtableCell(IStatusCallback iStatusCallback, String str, byte[] bArr, byte[] bArr2);

    void getChannelConfigListForTesting(IByteArrayCallback iByteArrayCallback);

    void injectChannelConfigListForTesting(IStatusCallback iStatusCallback, byte[] bArr);

    void readFootprintsRecordingSettings(IMdhFootprintsRecordingSettingCallback iMdhFootprintsRecordingSettingCallback, Account account, int i);

    void readLatestFootprint(IMdhFootprintsListCallback iMdhFootprintsListCallback, Account account, int i, int i2, LatestFootprintFilter latestFootprintFilter);

    void readLatestFootprintWithSyncStatus(IMdhFootprintsReadResultCallback iMdhFootprintsReadResultCallback, Account account, int i, int i2, LatestFootprintFilter latestFootprintFilter);

    void readTimeSeriesFootprints(IMdhFootprintsListCallback iMdhFootprintsListCallback, Account account, int i, int i2, TimeSeriesFootprintsReadFilter timeSeriesFootprintsReadFilter);

    void readTimeSeriesFootprintsWithSyncStatus(IMdhFootprintsReadResultCallback iMdhFootprintsReadResultCallback, Account account, int i, int i2, TimeSeriesFootprintsReadFilter timeSeriesFootprintsReadFilter);

    void readTrivialBigtableCell(IByteArrayCallback iByteArrayCallback, String str, byte[] bArr, byte[] bArr2);

    void readTrivialBigtableRange(ITrivialBigtableKeyValueCallback iTrivialBigtableKeyValueCallback, String str, byte[] bArr, byte[] bArr2, byte[] bArr3);

    void refreshChannelConfigList(IStatusCallback iStatusCallback);

    void registerBroadcastListener(IStatusCallback iStatusCallback, MdhBroadcastListenerKey mdhBroadcastListenerKey, MdhBroadcastListenerParams mdhBroadcastListenerParams);

    void resetData(IStatusCallback iStatusCallback);

    void resetTesting(IStatusCallback iStatusCallback);

    void startImmediateTask(IStatusCallback iStatusCallback, String str);

    void subscribeFootprintsRecordingSettings(IStatusCallback iStatusCallback, Account account, List<Integer> list, SyncPolicy syncPolicy);

    void subscribeLatestFootprint(IStatusCallback iStatusCallback, Account account, int i, int i2, SyncPolicy syncPolicy, LatestFootprintFilter latestFootprintFilter);

    void subscribeTimeSeriesFootprints(IStatusCallback iStatusCallback, Account account, int i, int i2, SyncPolicy syncPolicy, TimeSeriesFootprintsSubscriptionFilter timeSeriesFootprintsSubscriptionFilter);

    void unregisterBroadcastListener(IStatusCallback iStatusCallback, MdhBroadcastListenerKey mdhBroadcastListenerKey);

    void writeLatestFootprint(IStatusCallback iStatusCallback, Account account, int i, int i2, byte[] bArr, ByteArraySafeParcelable byteArraySafeParcelable);

    void writeLatestOnlyChannelSyncStatus(IStatusCallback iStatusCallback, Account account, int i, int i2, LatestFootprintFilter latestFootprintFilter, SyncStatus syncStatus);

    void writeTimeSeriesChannel(IStatusCallback iStatusCallback, Account account, int i, int i2, MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable);

    void writeTimeSeriesChannelSyncStatus(IStatusCallback iStatusCallback, Account account, int i, int i2, TimeSeriesFootprintsSubscriptionFilter timeSeriesFootprintsSubscriptionFilter, SyncStatus syncStatus);

    void writeTimeSeriesFootprint(IMdhTimeSeriesFootprintsWriteResultCallback iMdhTimeSeriesFootprintsWriteResultCallback, Account account, int i, int i2, ByteArraySafeParcelable byteArraySafeParcelable);

    void writeTrivialBigtableCell(IStatusCallback iStatusCallback, String str, byte[] bArr, byte[] bArr2, byte[] bArr3);
}
