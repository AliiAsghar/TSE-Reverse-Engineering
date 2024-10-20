package com.google.android.gms.auth.api.accounttransfer.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.api.accounttransfer.AccountTransferMsg;
import com.google.android.gms.auth.api.accounttransfer.AuthenticatorTransferInfo;
import com.google.android.gms.auth.api.accounttransfer.DeviceMetaData;
import com.google.android.gms.common.api.Status;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IAccountTransferCallbacks extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IAccountTransferCallbacks {
        static final int TRANSACTION_onAccountTransferResult = 2;
        static final int TRANSACTION_onAccountTransferSetupResult = 3;
        static final int TRANSACTION_onDeviceMetaDataResult = 7;
        static final int TRANSACTION_onFailure = 5;
        static final int TRANSACTION_onResult = 4;
        static final int TRANSACTION_onRetrieveDataResult = 6;
        static final int TRANSACTION_onStatusResult = 1;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IAccountTransferCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferCallbacks");
            }

            @Override // com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferCallbacks
            public void onAccountTransferResult(Status status, AuthenticatorTransferInfo authenticatorTransferInfo) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                iax.d(obtainAndWriteInterfaceToken, authenticatorTransferInfo);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferCallbacks
            public void onAccountTransferSetupResult(Status status, AccountTransferMsg accountTransferMsg) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                iax.d(obtainAndWriteInterfaceToken, accountTransferMsg);
                transactOneway(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferCallbacks
            public void onDeviceMetaDataResult(DeviceMetaData deviceMetaData) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, deviceMetaData);
                transactOneway(7, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferCallbacks
            public void onFailure(Status status) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                transactOneway(5, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferCallbacks
            public void onResult() {
                transactOneway(4, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferCallbacks
            public void onRetrieveDataResult(byte[] bArr) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeByteArray(bArr);
                transactOneway(6, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferCallbacks
            public void onStatusResult(Status status) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferCallbacks");
        }

        public static IAccountTransferCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferCallbacks");
            if (queryLocalInterface instanceof IAccountTransferCallbacks) {
                return (IAccountTransferCallbacks) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    Status status = (Status) iax.a(parcel, Status.CREATOR);
                    enforceNoDataAvail(parcel);
                    onStatusResult(status);
                    return true;
                case 2:
                    Status status2 = (Status) iax.a(parcel, Status.CREATOR);
                    AuthenticatorTransferInfo authenticatorTransferInfo = (AuthenticatorTransferInfo) iax.a(parcel, AuthenticatorTransferInfo.CREATOR);
                    enforceNoDataAvail(parcel);
                    onAccountTransferResult(status2, authenticatorTransferInfo);
                    return true;
                case 3:
                    Status status3 = (Status) iax.a(parcel, Status.CREATOR);
                    AccountTransferMsg accountTransferMsg = (AccountTransferMsg) iax.a(parcel, AccountTransferMsg.CREATOR);
                    enforceNoDataAvail(parcel);
                    onAccountTransferSetupResult(status3, accountTransferMsg);
                    return true;
                case 4:
                    onResult();
                    return true;
                case 5:
                    Status status4 = (Status) iax.a(parcel, Status.CREATOR);
                    enforceNoDataAvail(parcel);
                    onFailure(status4);
                    return true;
                case 6:
                    byte[] createByteArray = parcel.createByteArray();
                    enforceNoDataAvail(parcel);
                    onRetrieveDataResult(createByteArray);
                    return true;
                case 7:
                    DeviceMetaData deviceMetaData = (DeviceMetaData) iax.a(parcel, DeviceMetaData.CREATOR);
                    enforceNoDataAvail(parcel);
                    onDeviceMetaDataResult(deviceMetaData);
                    return true;
                default:
                    return false;
            }
        }
    }

    void onAccountTransferResult(Status status, AuthenticatorTransferInfo authenticatorTransferInfo);

    void onAccountTransferSetupResult(Status status, AccountTransferMsg accountTransferMsg);

    void onDeviceMetaDataResult(DeviceMetaData deviceMetaData);

    void onFailure(Status status);

    void onResult();

    void onRetrieveDataResult(byte[] bArr);

    void onStatusResult(Status status);
}
