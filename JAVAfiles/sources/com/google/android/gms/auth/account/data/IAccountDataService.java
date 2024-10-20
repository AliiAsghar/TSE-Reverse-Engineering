package com.google.android.gms.auth.account.data;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.account.data.IClearTokenCallback;
import com.google.android.gms.auth.account.data.IGetAccountChangeEventsCallback;
import com.google.android.gms.auth.account.data.IGetAccountExportDataCallback;
import com.google.android.gms.auth.account.data.IGetAccountIdCallback;
import com.google.android.gms.auth.account.data.IGetDeviceManagementInfoCallback;
import com.google.android.gms.auth.account.data.IGetGoogleAccountDataCallback;
import com.google.android.gms.auth.account.data.IGetStringValueCallback;
import com.google.android.gms.auth.account.data.IGetTokenCallback;
import com.google.android.gms.auth.account.data.IGetTokenHandleCallback;
import com.google.android.gms.auth.firstparty.dataservice.ClearTokenRequest;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;
import com.google.android.gms.common.api.internal.IStatusCallback;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IAccountDataService extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IAccountDataService {
        static final int TRANSACTION_clearToken = 5;
        static final int TRANSACTION_getAccountChangeEvents = 8;
        static final int TRANSACTION_getAccountExportData = 9;
        static final int TRANSACTION_getAccountId = 7;
        static final int TRANSACTION_getAccountNameFromAccountId = 14;
        static final int TRANSACTION_getDeviceManagementInfo = 6;
        static final int TRANSACTION_getGoogleAccountData = 10;
        static final int TRANSACTION_getToken = 4;
        static final int TRANSACTION_getTokenHandle = 11;
        static final int TRANSACTION_updateHideDmNotifications = 1;
        static final int TRANSACTION_whitelistApplicationForGoogleAccounts = 13;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IAccountDataService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.account.data.IAccountDataService");
            }

            @Override // com.google.android.gms.auth.account.data.IAccountDataService
            public void clearToken(IClearTokenCallback iClearTokenCallback, ClearTokenRequest clearTokenRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iClearTokenCallback);
                iax.d(obtainAndWriteInterfaceToken, clearTokenRequest);
                transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.account.data.IAccountDataService
            public void getAccountChangeEvents(IGetAccountChangeEventsCallback iGetAccountChangeEventsCallback, AccountChangeEventsRequest accountChangeEventsRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iGetAccountChangeEventsCallback);
                iax.d(obtainAndWriteInterfaceToken, accountChangeEventsRequest);
                transactAndReadExceptionReturnVoid(8, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.account.data.IAccountDataService
            public void getAccountExportData(IGetAccountExportDataCallback iGetAccountExportDataCallback, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iGetAccountExportDataCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(9, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.account.data.IAccountDataService
            public void getAccountId(IGetAccountIdCallback iGetAccountIdCallback, Account account) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iGetAccountIdCallback);
                iax.d(obtainAndWriteInterfaceToken, account);
                transactAndReadExceptionReturnVoid(7, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.account.data.IAccountDataService
            public void getAccountNameFromAccountId(IGetStringValueCallback iGetStringValueCallback, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iGetStringValueCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(14, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.account.data.IAccountDataService
            public void getDeviceManagementInfo(IGetDeviceManagementInfoCallback iGetDeviceManagementInfoCallback, Account account) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iGetDeviceManagementInfoCallback);
                iax.d(obtainAndWriteInterfaceToken, account);
                transactAndReadExceptionReturnVoid(6, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.account.data.IAccountDataService
            public void getGoogleAccountData(IGetGoogleAccountDataCallback iGetGoogleAccountDataCallback, Account account) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iGetGoogleAccountDataCallback);
                iax.d(obtainAndWriteInterfaceToken, account);
                transactAndReadExceptionReturnVoid(10, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.account.data.IAccountDataService
            public void getToken(IGetTokenCallback iGetTokenCallback, TokenRequest tokenRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iGetTokenCallback);
                iax.d(obtainAndWriteInterfaceToken, tokenRequest);
                transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.account.data.IAccountDataService
            public void getTokenHandle(IGetTokenHandleCallback iGetTokenHandleCallback, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iGetTokenHandleCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(11, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.account.data.IAccountDataService
            public void updateHideDmNotifications(IStatusCallback iStatusCallback, Account account, boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                iax.d(obtainAndWriteInterfaceToken, account);
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.account.data.IAccountDataService
            public void whitelistApplicationForGoogleAccounts(IStatusCallback iStatusCallback, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(13, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.account.data.IAccountDataService");
        }

        public static IAccountDataService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.data.IAccountDataService");
            if (queryLocalInterface instanceof IAccountDataService) {
                return (IAccountDataService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    IStatusCallback asInterface = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    Account account = (Account) iax.a(parcel, Account.CREATOR);
                    boolean g = iax.g(parcel);
                    enforceNoDataAvail(parcel);
                    updateHideDmNotifications(asInterface, account, g);
                    break;
                case 2:
                case 3:
                case 12:
                default:
                    return false;
                case 4:
                    IGetTokenCallback asInterface2 = IGetTokenCallback.Stub.asInterface(parcel.readStrongBinder());
                    TokenRequest tokenRequest = (TokenRequest) iax.a(parcel, TokenRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    getToken(asInterface2, tokenRequest);
                    break;
                case 5:
                    IClearTokenCallback asInterface3 = IClearTokenCallback.Stub.asInterface(parcel.readStrongBinder());
                    ClearTokenRequest clearTokenRequest = (ClearTokenRequest) iax.a(parcel, ClearTokenRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    clearToken(asInterface3, clearTokenRequest);
                    break;
                case 6:
                    IGetDeviceManagementInfoCallback asInterface4 = IGetDeviceManagementInfoCallback.Stub.asInterface(parcel.readStrongBinder());
                    Account account2 = (Account) iax.a(parcel, Account.CREATOR);
                    enforceNoDataAvail(parcel);
                    getDeviceManagementInfo(asInterface4, account2);
                    break;
                case 7:
                    IGetAccountIdCallback asInterface5 = IGetAccountIdCallback.Stub.asInterface(parcel.readStrongBinder());
                    Account account3 = (Account) iax.a(parcel, Account.CREATOR);
                    enforceNoDataAvail(parcel);
                    getAccountId(asInterface5, account3);
                    break;
                case 8:
                    IGetAccountChangeEventsCallback asInterface6 = IGetAccountChangeEventsCallback.Stub.asInterface(parcel.readStrongBinder());
                    AccountChangeEventsRequest accountChangeEventsRequest = (AccountChangeEventsRequest) iax.a(parcel, AccountChangeEventsRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    getAccountChangeEvents(asInterface6, accountChangeEventsRequest);
                    break;
                case 9:
                    IGetAccountExportDataCallback asInterface7 = IGetAccountExportDataCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString = parcel.readString();
                    enforceNoDataAvail(parcel);
                    getAccountExportData(asInterface7, readString);
                    break;
                case 10:
                    IGetGoogleAccountDataCallback asInterface8 = IGetGoogleAccountDataCallback.Stub.asInterface(parcel.readStrongBinder());
                    Account account4 = (Account) iax.a(parcel, Account.CREATOR);
                    enforceNoDataAvail(parcel);
                    getGoogleAccountData(asInterface8, account4);
                    break;
                case 11:
                    IGetTokenHandleCallback asInterface9 = IGetTokenHandleCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString2 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    getTokenHandle(asInterface9, readString2);
                    break;
                case 13:
                    IStatusCallback asInterface10 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString3 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    whitelistApplicationForGoogleAccounts(asInterface10, readString3);
                    break;
                case 14:
                    IGetStringValueCallback asInterface11 = IGetStringValueCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString4 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    getAccountNameFromAccountId(asInterface11, readString4);
                    break;
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void clearToken(IClearTokenCallback iClearTokenCallback, ClearTokenRequest clearTokenRequest);

    void getAccountChangeEvents(IGetAccountChangeEventsCallback iGetAccountChangeEventsCallback, AccountChangeEventsRequest accountChangeEventsRequest);

    void getAccountExportData(IGetAccountExportDataCallback iGetAccountExportDataCallback, String str);

    void getAccountId(IGetAccountIdCallback iGetAccountIdCallback, Account account);

    void getAccountNameFromAccountId(IGetStringValueCallback iGetStringValueCallback, String str);

    void getDeviceManagementInfo(IGetDeviceManagementInfoCallback iGetDeviceManagementInfoCallback, Account account);

    void getGoogleAccountData(IGetGoogleAccountDataCallback iGetGoogleAccountDataCallback, Account account);

    void getToken(IGetTokenCallback iGetTokenCallback, TokenRequest tokenRequest);

    void getTokenHandle(IGetTokenHandleCallback iGetTokenHandleCallback, String str);

    void updateHideDmNotifications(IStatusCallback iStatusCallback, Account account, boolean z);

    void whitelistApplicationForGoogleAccounts(IStatusCallback iStatusCallback, String str);
}
