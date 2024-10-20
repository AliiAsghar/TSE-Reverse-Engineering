package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.internal.AuthAccountRequest;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.IResolveAccountCallbacks;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.signin.internal.ISignInCallbacks;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ISignInService extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements ISignInService {
        static final int TRANSACTION_authAccount = 2;
        static final int TRANSACTION_clearAccountFromSessionStore = 7;
        static final int TRANSACTION_getCurrentAccount = 11;
        static final int TRANSACTION_onCheckServerAuthorization = 3;
        static final int TRANSACTION_onUploadServerAuthCode = 4;
        static final int TRANSACTION_recordConsent = 10;
        static final int TRANSACTION_recordConsentByConsentResult = 14;
        static final int TRANSACTION_resolveAccount = 5;
        static final int TRANSACTION_saveAccountToSessionStore = 8;
        static final int TRANSACTION_saveDefaultAccountToSharedPref = 9;
        static final int TRANSACTION_setGamesHasBeenGreeted = 13;
        static final int TRANSACTION_signIn = 12;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements ISignInService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
            }

            @Override // com.google.android.gms.signin.internal.ISignInService
            public void authAccount(AuthAccountRequest authAccountRequest, ISignInCallbacks iSignInCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, authAccountRequest);
                iax.f(obtainAndWriteInterfaceToken, iSignInCallbacks);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.signin.internal.ISignInService
            public void clearAccountFromSessionStore(int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(7, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.signin.internal.ISignInService
            public void getCurrentAccount(ISignInCallbacks iSignInCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iSignInCallbacks);
                transactAndReadExceptionReturnVoid(11, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.signin.internal.ISignInService
            public void onCheckServerAuthorization(CheckServerAuthResult checkServerAuthResult) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, checkServerAuthResult);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.signin.internal.ISignInService
            public void onUploadServerAuthCode(boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = iax.a;
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.signin.internal.ISignInService
            public void recordConsent(RecordConsentRequest recordConsentRequest, ISignInCallbacks iSignInCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, recordConsentRequest);
                iax.f(obtainAndWriteInterfaceToken, iSignInCallbacks);
                transactAndReadExceptionReturnVoid(10, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.signin.internal.ISignInService
            public void recordConsentByConsentResult(RecordConsentByConsentResultRequest recordConsentByConsentResultRequest, ISignInCallbacks iSignInCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, recordConsentByConsentResultRequest);
                iax.f(obtainAndWriteInterfaceToken, iSignInCallbacks);
                transactAndReadExceptionReturnVoid(14, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.signin.internal.ISignInService
            public void resolveAccount(ResolveAccountRequest resolveAccountRequest, IResolveAccountCallbacks iResolveAccountCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, resolveAccountRequest);
                iax.f(obtainAndWriteInterfaceToken, iResolveAccountCallbacks);
                transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.signin.internal.ISignInService
            public void saveAccountToSessionStore(int i, Account account, ISignInCallbacks iSignInCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                iax.d(obtainAndWriteInterfaceToken, account);
                iax.f(obtainAndWriteInterfaceToken, iSignInCallbacks);
                transactAndReadExceptionReturnVoid(8, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.signin.internal.ISignInService
            public void saveDefaultAccountToSharedPref(IAccountAccessor iAccountAccessor, int i, boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iAccountAccessor);
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(9, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.signin.internal.ISignInService
            public void setGamesHasBeenGreeted(boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = iax.a;
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(13, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.signin.internal.ISignInService
            public void signIn(SignInRequest signInRequest, ISignInCallbacks iSignInCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, signInRequest);
                iax.f(obtainAndWriteInterfaceToken, iSignInCallbacks);
                transactAndReadExceptionReturnVoid(12, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.signin.internal.ISignInService");
        }

        public static ISignInService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
            if (queryLocalInterface instanceof ISignInService) {
                return (ISignInService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 2:
                    AuthAccountRequest authAccountRequest = (AuthAccountRequest) iax.a(parcel, AuthAccountRequest.CREATOR);
                    ISignInCallbacks asInterface = ISignInCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    authAccount(authAccountRequest, asInterface);
                    break;
                case 3:
                    CheckServerAuthResult checkServerAuthResult = (CheckServerAuthResult) iax.a(parcel, CheckServerAuthResult.CREATOR);
                    enforceNoDataAvail(parcel);
                    onCheckServerAuthorization(checkServerAuthResult);
                    break;
                case 4:
                    boolean g = iax.g(parcel);
                    enforceNoDataAvail(parcel);
                    onUploadServerAuthCode(g);
                    break;
                case 5:
                    ResolveAccountRequest resolveAccountRequest = (ResolveAccountRequest) iax.a(parcel, ResolveAccountRequest.CREATOR);
                    IResolveAccountCallbacks asInterface2 = IResolveAccountCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    resolveAccount(resolveAccountRequest, asInterface2);
                    break;
                case 6:
                default:
                    return false;
                case 7:
                    int readInt = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    clearAccountFromSessionStore(readInt);
                    break;
                case 8:
                    int readInt2 = parcel.readInt();
                    Account account = (Account) iax.a(parcel, Account.CREATOR);
                    ISignInCallbacks asInterface3 = ISignInCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    saveAccountToSessionStore(readInt2, account, asInterface3);
                    break;
                case 9:
                    IAccountAccessor asInterface4 = IAccountAccessor.Stub.asInterface(parcel.readStrongBinder());
                    int readInt3 = parcel.readInt();
                    boolean g2 = iax.g(parcel);
                    enforceNoDataAvail(parcel);
                    saveDefaultAccountToSharedPref(asInterface4, readInt3, g2);
                    break;
                case 10:
                    RecordConsentRequest recordConsentRequest = (RecordConsentRequest) iax.a(parcel, RecordConsentRequest.CREATOR);
                    ISignInCallbacks asInterface5 = ISignInCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    recordConsent(recordConsentRequest, asInterface5);
                    break;
                case 11:
                    ISignInCallbacks asInterface6 = ISignInCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getCurrentAccount(asInterface6);
                    break;
                case 12:
                    SignInRequest signInRequest = (SignInRequest) iax.a(parcel, SignInRequest.CREATOR);
                    ISignInCallbacks asInterface7 = ISignInCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    signIn(signInRequest, asInterface7);
                    break;
                case 13:
                    boolean g3 = iax.g(parcel);
                    enforceNoDataAvail(parcel);
                    setGamesHasBeenGreeted(g3);
                    break;
                case 14:
                    RecordConsentByConsentResultRequest recordConsentByConsentResultRequest = (RecordConsentByConsentResultRequest) iax.a(parcel, RecordConsentByConsentResultRequest.CREATOR);
                    ISignInCallbacks asInterface8 = ISignInCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    recordConsentByConsentResult(recordConsentByConsentResultRequest, asInterface8);
                    break;
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void authAccount(AuthAccountRequest authAccountRequest, ISignInCallbacks iSignInCallbacks);

    void clearAccountFromSessionStore(int i);

    void getCurrentAccount(ISignInCallbacks iSignInCallbacks);

    void onCheckServerAuthorization(CheckServerAuthResult checkServerAuthResult);

    void onUploadServerAuthCode(boolean z);

    void recordConsent(RecordConsentRequest recordConsentRequest, ISignInCallbacks iSignInCallbacks);

    void recordConsentByConsentResult(RecordConsentByConsentResultRequest recordConsentByConsentResultRequest, ISignInCallbacks iSignInCallbacks);

    void resolveAccount(ResolveAccountRequest resolveAccountRequest, IResolveAccountCallbacks iResolveAccountCallbacks);

    void saveAccountToSessionStore(int i, Account account, ISignInCallbacks iSignInCallbacks);

    void saveDefaultAccountToSharedPref(IAccountAccessor iAccountAccessor, int i, boolean z);

    void setGamesHasBeenGreeted(boolean z);

    void signIn(SignInRequest signInRequest, ISignInCallbacks iSignInCallbacks);
}
