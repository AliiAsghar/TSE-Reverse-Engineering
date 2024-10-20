package com.google.android.gms.fido.fido2.api;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.fido.common.nfc.INfcReaderCallback;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IResponseHandler extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IResponseHandler {
        static final int TRANSACTION_onDisableNfcReaderMode = 5;
        static final int TRANSACTION_onEnableNfcReaderMode = 4;
        static final int TRANSACTION_onFailure = 2;
        static final int TRANSACTION_onFingerprintDisallowed = 6;
        static final int TRANSACTION_onSuccess = 3;
        static final int TRANSACTION_onViewSelected = 1;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IResponseHandler {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.fido.fido2.api.IResponseHandler");
            }

            @Override // com.google.android.gms.fido.fido2.api.IResponseHandler
            public void onDisableNfcReaderMode() {
                transactOneway(5, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.fido.fido2.api.IResponseHandler
            public void onEnableNfcReaderMode(INfcReaderCallback iNfcReaderCallback, int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iNfcReaderCallback);
                obtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.fido2.api.IResponseHandler
            public void onFailure(AuthenticatorErrorResponse authenticatorErrorResponse) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, authenticatorErrorResponse);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.fido2.api.IResponseHandler
            public void onFingerprintDisallowed() {
                transactOneway(6, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.fido.fido2.api.IResponseHandler
            public void onSuccess(PublicKeyCredential publicKeyCredential) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, publicKeyCredential);
                transactOneway(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.fido2.api.IResponseHandler
            public void onViewSelected(String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.fido.fido2.api.IResponseHandler");
        }

        public static IResponseHandler asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.fido2.api.IResponseHandler");
            if (queryLocalInterface instanceof IResponseHandler) {
                return (IResponseHandler) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    String readString = parcel.readString();
                    enforceNoDataAvail(parcel);
                    onViewSelected(readString);
                    return true;
                case 2:
                    AuthenticatorErrorResponse authenticatorErrorResponse = (AuthenticatorErrorResponse) iax.a(parcel, AuthenticatorErrorResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onFailure(authenticatorErrorResponse);
                    return true;
                case 3:
                    PublicKeyCredential publicKeyCredential = (PublicKeyCredential) iax.a(parcel, PublicKeyCredential.CREATOR);
                    enforceNoDataAvail(parcel);
                    onSuccess(publicKeyCredential);
                    return true;
                case 4:
                    INfcReaderCallback asInterface = INfcReaderCallback.Stub.asInterface(parcel.readStrongBinder());
                    int readInt = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    onEnableNfcReaderMode(asInterface, readInt);
                    return true;
                case 5:
                    onDisableNfcReaderMode();
                    return true;
                case 6:
                    onFingerprintDisallowed();
                    return true;
                default:
                    return false;
            }
        }
    }

    void onDisableNfcReaderMode();

    void onEnableNfcReaderMode(INfcReaderCallback iNfcReaderCallback, int i);

    void onFailure(AuthenticatorErrorResponse authenticatorErrorResponse);

    void onFingerprintDisallowed();

    void onSuccess(PublicKeyCredential publicKeyCredential);

    void onViewSelected(String str);
}
