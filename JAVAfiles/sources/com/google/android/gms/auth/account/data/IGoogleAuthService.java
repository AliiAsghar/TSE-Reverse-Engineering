package com.google.android.gms.auth.account.data;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.GetAccountsRequest;
import com.google.android.gms.auth.GetHubTokenRequest;
import com.google.android.gms.auth.HasCapabilitiesRequest;
import com.google.android.gms.auth.account.data.IBundleCallback;
import com.google.android.gms.auth.account.data.IGetAccountChangeEventsCallback;
import com.google.android.gms.auth.account.data.IGetAccountsCallback;
import com.google.android.gms.auth.account.data.IGetHubTokenCallback;
import com.google.android.gms.auth.account.data.IGetTokenWithDetailsCallback;
import com.google.android.gms.auth.account.data.IHasCapabilitiesCallback;
import com.google.android.gms.auth.firstparty.dataservice.ClearTokenRequest;
import com.google.android.gms.common.api.internal.IStatusCallback;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IGoogleAuthService extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IGoogleAuthService {
        static final int TRANSACTION_clearToken = 2;
        static final int TRANSACTION_getAccountChangeEvents = 4;
        static final int TRANSACTION_getAccounts = 5;
        static final int TRANSACTION_getHubToken = 8;
        static final int TRANSACTION_getTokenWithDetails = 1;
        static final int TRANSACTION_hasCapabilities = 7;
        static final int TRANSACTION_removeAccount = 6;
        static final int TRANSACTION_requestGoogleAccountsAccess = 3;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IGoogleAuthService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.account.data.IGoogleAuthService");
            }

            @Override // com.google.android.gms.auth.account.data.IGoogleAuthService
            public void clearToken(IStatusCallback iStatusCallback, ClearTokenRequest clearTokenRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                iax.d(obtainAndWriteInterfaceToken, clearTokenRequest);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.account.data.IGoogleAuthService
            public void getAccountChangeEvents(IGetAccountChangeEventsCallback iGetAccountChangeEventsCallback, AccountChangeEventsRequest accountChangeEventsRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iGetAccountChangeEventsCallback);
                iax.d(obtainAndWriteInterfaceToken, accountChangeEventsRequest);
                transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.account.data.IGoogleAuthService
            public void getAccounts(IGetAccountsCallback iGetAccountsCallback, GetAccountsRequest getAccountsRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iGetAccountsCallback);
                iax.d(obtainAndWriteInterfaceToken, getAccountsRequest);
                transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.account.data.IGoogleAuthService
            public void getHubToken(IGetHubTokenCallback iGetHubTokenCallback, GetHubTokenRequest getHubTokenRequest, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iGetHubTokenCallback);
                iax.d(obtainAndWriteInterfaceToken, getHubTokenRequest);
                iax.d(obtainAndWriteInterfaceToken, bundle);
                transactAndReadExceptionReturnVoid(8, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.account.data.IGoogleAuthService
            public void getTokenWithDetails(IGetTokenWithDetailsCallback iGetTokenWithDetailsCallback, Account account, String str, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iGetTokenWithDetailsCallback);
                iax.d(obtainAndWriteInterfaceToken, account);
                obtainAndWriteInterfaceToken.writeString(str);
                iax.d(obtainAndWriteInterfaceToken, bundle);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.account.data.IGoogleAuthService
            public void hasCapabilities(IHasCapabilitiesCallback iHasCapabilitiesCallback, HasCapabilitiesRequest hasCapabilitiesRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iHasCapabilitiesCallback);
                iax.d(obtainAndWriteInterfaceToken, hasCapabilitiesRequest);
                transactAndReadExceptionReturnVoid(7, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.account.data.IGoogleAuthService
            public void removeAccount(IBundleCallback iBundleCallback, Account account) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iBundleCallback);
                iax.d(obtainAndWriteInterfaceToken, account);
                transactAndReadExceptionReturnVoid(6, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.account.data.IGoogleAuthService
            public void requestGoogleAccountsAccess(IBundleCallback iBundleCallback, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iBundleCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.account.data.IGoogleAuthService");
        }

        public static IGoogleAuthService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.data.IGoogleAuthService");
            if (queryLocalInterface instanceof IGoogleAuthService) {
                return (IGoogleAuthService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    IGetTokenWithDetailsCallback asInterface = IGetTokenWithDetailsCallback.Stub.asInterface(parcel.readStrongBinder());
                    Account account = (Account) iax.a(parcel, Account.CREATOR);
                    String readString = parcel.readString();
                    Bundle bundle = (Bundle) iax.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    getTokenWithDetails(asInterface, account, readString, bundle);
                    break;
                case 2:
                    IStatusCallback asInterface2 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    ClearTokenRequest clearTokenRequest = (ClearTokenRequest) iax.a(parcel, ClearTokenRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    clearToken(asInterface2, clearTokenRequest);
                    break;
                case 3:
                    IBundleCallback asInterface3 = IBundleCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString2 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    requestGoogleAccountsAccess(asInterface3, readString2);
                    break;
                case 4:
                    IGetAccountChangeEventsCallback asInterface4 = IGetAccountChangeEventsCallback.Stub.asInterface(parcel.readStrongBinder());
                    AccountChangeEventsRequest accountChangeEventsRequest = (AccountChangeEventsRequest) iax.a(parcel, AccountChangeEventsRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    getAccountChangeEvents(asInterface4, accountChangeEventsRequest);
                    break;
                case 5:
                    IGetAccountsCallback asInterface5 = IGetAccountsCallback.Stub.asInterface(parcel.readStrongBinder());
                    GetAccountsRequest getAccountsRequest = (GetAccountsRequest) iax.a(parcel, GetAccountsRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    getAccounts(asInterface5, getAccountsRequest);
                    break;
                case 6:
                    IBundleCallback asInterface6 = IBundleCallback.Stub.asInterface(parcel.readStrongBinder());
                    Account account2 = (Account) iax.a(parcel, Account.CREATOR);
                    enforceNoDataAvail(parcel);
                    removeAccount(asInterface6, account2);
                    break;
                case 7:
                    IHasCapabilitiesCallback asInterface7 = IHasCapabilitiesCallback.Stub.asInterface(parcel.readStrongBinder());
                    HasCapabilitiesRequest hasCapabilitiesRequest = (HasCapabilitiesRequest) iax.a(parcel, HasCapabilitiesRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    hasCapabilities(asInterface7, hasCapabilitiesRequest);
                    break;
                case 8:
                    IGetHubTokenCallback asInterface8 = IGetHubTokenCallback.Stub.asInterface(parcel.readStrongBinder());
                    GetHubTokenRequest getHubTokenRequest = (GetHubTokenRequest) iax.a(parcel, GetHubTokenRequest.CREATOR);
                    Bundle bundle2 = (Bundle) iax.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    getHubToken(asInterface8, getHubTokenRequest, bundle2);
                    break;
                default:
                    return false;
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void clearToken(IStatusCallback iStatusCallback, ClearTokenRequest clearTokenRequest);

    void getAccountChangeEvents(IGetAccountChangeEventsCallback iGetAccountChangeEventsCallback, AccountChangeEventsRequest accountChangeEventsRequest);

    void getAccounts(IGetAccountsCallback iGetAccountsCallback, GetAccountsRequest getAccountsRequest);

    void getHubToken(IGetHubTokenCallback iGetHubTokenCallback, GetHubTokenRequest getHubTokenRequest, Bundle bundle);

    void getTokenWithDetails(IGetTokenWithDetailsCallback iGetTokenWithDetailsCallback, Account account, String str, Bundle bundle);

    void hasCapabilities(IHasCapabilitiesCallback iHasCapabilitiesCallback, HasCapabilitiesRequest hasCapabilitiesRequest);

    void removeAccount(IBundleCallback iBundleCallback, Account account);

    void requestGoogleAccountsAccess(IBundleCallback iBundleCallback, String str);
}
