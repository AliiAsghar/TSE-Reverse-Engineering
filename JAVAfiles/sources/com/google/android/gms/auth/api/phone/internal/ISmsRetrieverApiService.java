package com.google.android.gms.auth.api.phone.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.api.phone.internal.IAutofillPermissionStateCallback;
import com.google.android.gms.auth.api.phone.internal.IOngoingSmsRequestCallback;
import com.google.android.gms.auth.api.phone.internal.ISmsRetrieverResultCallback;
import com.google.android.gms.common.api.internal.IStatusCallback;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ISmsRetrieverApiService extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements ISmsRetrieverApiService {
        static final int TRANSACTION_checkAutofillPermissionState = 4;
        static final int TRANSACTION_checkOngoingSmsRequest = 5;
        static final int TRANSACTION_startSmsCodeAutofill = 3;
        static final int TRANSACTION_startSmsCodeBrowser = 6;
        static final int TRANSACTION_startSmsRetriever = 1;
        static final int TRANSACTION_startWithConsentPrompt = 2;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements ISmsRetrieverApiService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
            }

            @Override // com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService
            public void checkAutofillPermissionState(IAutofillPermissionStateCallback iAutofillPermissionStateCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iAutofillPermissionStateCallback);
                transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService
            public void checkOngoingSmsRequest(String str, IOngoingSmsRequestCallback iOngoingSmsRequestCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                iax.f(obtainAndWriteInterfaceToken, iOngoingSmsRequestCallback);
                transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService
            public void startSmsCodeAutofill(IStatusCallback iStatusCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService
            public void startSmsCodeBrowser(IStatusCallback iStatusCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(6, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService
            public void startSmsRetriever(ISmsRetrieverResultCallback iSmsRetrieverResultCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iSmsRetrieverResultCallback);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService
            public void startWithConsentPrompt(String str, ISmsRetrieverResultCallback iSmsRetrieverResultCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                iax.f(obtainAndWriteInterfaceToken, iSmsRetrieverResultCallback);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        }

        public static ISmsRetrieverApiService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
            if (queryLocalInterface instanceof ISmsRetrieverApiService) {
                return (ISmsRetrieverApiService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    ISmsRetrieverResultCallback asInterface = ISmsRetrieverResultCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    startSmsRetriever(asInterface);
                    break;
                case 2:
                    String readString = parcel.readString();
                    ISmsRetrieverResultCallback asInterface2 = ISmsRetrieverResultCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    startWithConsentPrompt(readString, asInterface2);
                    break;
                case 3:
                    IStatusCallback asInterface3 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    startSmsCodeAutofill(asInterface3);
                    break;
                case 4:
                    IAutofillPermissionStateCallback asInterface4 = IAutofillPermissionStateCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    checkAutofillPermissionState(asInterface4);
                    break;
                case 5:
                    String readString2 = parcel.readString();
                    IOngoingSmsRequestCallback asInterface5 = IOngoingSmsRequestCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    checkOngoingSmsRequest(readString2, asInterface5);
                    break;
                case 6:
                    IStatusCallback asInterface6 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    startSmsCodeBrowser(asInterface6);
                    break;
                default:
                    return false;
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void checkAutofillPermissionState(IAutofillPermissionStateCallback iAutofillPermissionStateCallback);

    void checkOngoingSmsRequest(String str, IOngoingSmsRequestCallback iOngoingSmsRequestCallback);

    void startSmsCodeAutofill(IStatusCallback iStatusCallback);

    void startSmsCodeBrowser(IStatusCallback iStatusCallback);

    void startSmsRetriever(ISmsRetrieverResultCallback iSmsRetrieverResultCallback);

    void startWithConsentPrompt(String str, ISmsRetrieverResultCallback iSmsRetrieverResultCallback);
}
