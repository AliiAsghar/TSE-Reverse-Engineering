package com.google.android.gms.fido.u2f.internal.zeroparty;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.fido.u2f.api.IRegisterResponseHandler;
import com.google.android.gms.fido.u2f.api.ISignResponseHandler;
import com.google.android.gms.fido.u2f.api.StateUpdate;
import com.google.android.gms.fido.u2f.api.common.BrowserRegisterRequestParams;
import com.google.android.gms.fido.u2f.api.common.BrowserSignRequestParams;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IU2fZeroPartyService extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IU2fZeroPartyService {
        static final int TRANSACTION_headlessRegister = 2;
        static final int TRANSACTION_headlessSign = 1;
        static final int TRANSACTION_updateTransaction = 3;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IU2fZeroPartyService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.fido.u2f.internal.zeroparty.IU2fZeroPartyService");
            }

            @Override // com.google.android.gms.fido.u2f.internal.zeroparty.IU2fZeroPartyService
            public void headlessRegister(IStatusCallback iStatusCallback, BrowserRegisterRequestParams browserRegisterRequestParams, IRegisterResponseHandler iRegisterResponseHandler) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                iax.d(obtainAndWriteInterfaceToken, browserRegisterRequestParams);
                iax.f(obtainAndWriteInterfaceToken, iRegisterResponseHandler);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.u2f.internal.zeroparty.IU2fZeroPartyService
            public void headlessSign(IStatusCallback iStatusCallback, BrowserSignRequestParams browserSignRequestParams, ISignResponseHandler iSignResponseHandler) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                iax.d(obtainAndWriteInterfaceToken, browserSignRequestParams);
                iax.f(obtainAndWriteInterfaceToken, iSignResponseHandler);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.u2f.internal.zeroparty.IU2fZeroPartyService
            public void updateTransaction(IStatusCallback iStatusCallback, StateUpdate stateUpdate) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                iax.d(obtainAndWriteInterfaceToken, stateUpdate);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.fido.u2f.internal.zeroparty.IU2fZeroPartyService");
        }

        public static IU2fZeroPartyService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.u2f.internal.zeroparty.IU2fZeroPartyService");
            if (queryLocalInterface instanceof IU2fZeroPartyService) {
                return (IU2fZeroPartyService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return false;
                    }
                    IStatusCallback asInterface = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    StateUpdate stateUpdate = (StateUpdate) iax.a(parcel, StateUpdate.CREATOR);
                    enforceNoDataAvail(parcel);
                    updateTransaction(asInterface, stateUpdate);
                } else {
                    IStatusCallback asInterface2 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    BrowserRegisterRequestParams browserRegisterRequestParams = (BrowserRegisterRequestParams) iax.a(parcel, BrowserRegisterRequestParams.CREATOR);
                    IRegisterResponseHandler asInterface3 = IRegisterResponseHandler.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    headlessRegister(asInterface2, browserRegisterRequestParams, asInterface3);
                }
            } else {
                IStatusCallback asInterface4 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                BrowserSignRequestParams browserSignRequestParams = (BrowserSignRequestParams) iax.a(parcel, BrowserSignRequestParams.CREATOR);
                ISignResponseHandler asInterface5 = ISignResponseHandler.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                headlessSign(asInterface4, browserSignRequestParams, asInterface5);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void headlessRegister(IStatusCallback iStatusCallback, BrowserRegisterRequestParams browserRegisterRequestParams, IRegisterResponseHandler iRegisterResponseHandler);

    void headlessSign(IStatusCallback iStatusCallback, BrowserSignRequestParams browserSignRequestParams, ISignResponseHandler iSignResponseHandler);

    void updateTransaction(IStatusCallback iStatusCallback, StateUpdate stateUpdate);
}
