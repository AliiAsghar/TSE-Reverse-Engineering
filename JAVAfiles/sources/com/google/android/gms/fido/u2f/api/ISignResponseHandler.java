package com.google.android.gms.fido.u2f.api;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.fido.common.nfc.INfcReaderCallback;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.google.android.gms.fido.u2f.api.common.SignResponseData;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ISignResponseHandler extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements ISignResponseHandler {
        static final int TRANSACTION_onDisableNfcReaderMode = 5;
        static final int TRANSACTION_onEnableNfcReaderMode = 4;
        static final int TRANSACTION_onFailure = 2;
        static final int TRANSACTION_onSuccess = 3;
        static final int TRANSACTION_onViewSelected = 1;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements ISignResponseHandler {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.fido.u2f.api.ISignResponseHandler");
            }

            @Override // com.google.android.gms.fido.u2f.api.ISignResponseHandler
            public void onDisableNfcReaderMode() {
                transactOneway(5, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.fido.u2f.api.ISignResponseHandler
            public void onEnableNfcReaderMode(INfcReaderCallback iNfcReaderCallback, int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iNfcReaderCallback);
                obtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.u2f.api.ISignResponseHandler
            public void onFailure(ErrorResponseData errorResponseData) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, errorResponseData);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.u2f.api.ISignResponseHandler
            public void onSuccess(SignResponseData signResponseData) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, signResponseData);
                transactOneway(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.u2f.api.ISignResponseHandler
            public void onViewSelected(String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.fido.u2f.api.ISignResponseHandler");
        }

        public static ISignResponseHandler asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.u2f.api.ISignResponseHandler");
            if (queryLocalInterface instanceof ISignResponseHandler) {
                return (ISignResponseHandler) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return false;
                            }
                            onDisableNfcReaderMode();
                        } else {
                            INfcReaderCallback asInterface = INfcReaderCallback.Stub.asInterface(parcel.readStrongBinder());
                            int readInt = parcel.readInt();
                            enforceNoDataAvail(parcel);
                            onEnableNfcReaderMode(asInterface, readInt);
                        }
                    } else {
                        SignResponseData signResponseData = (SignResponseData) iax.a(parcel, SignResponseData.CREATOR);
                        enforceNoDataAvail(parcel);
                        onSuccess(signResponseData);
                    }
                } else {
                    ErrorResponseData errorResponseData = (ErrorResponseData) iax.a(parcel, ErrorResponseData.CREATOR);
                    enforceNoDataAvail(parcel);
                    onFailure(errorResponseData);
                }
            } else {
                String readString = parcel.readString();
                enforceNoDataAvail(parcel);
                onViewSelected(readString);
            }
            return true;
        }
    }

    void onDisableNfcReaderMode();

    void onEnableNfcReaderMode(INfcReaderCallback iNfcReaderCallback, int i);

    void onFailure(ErrorResponseData errorResponseData);

    void onSuccess(SignResponseData signResponseData);

    void onViewSelected(String str);
}
