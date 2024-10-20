package com.google.android.gms.fido.u2f.internal.privileged;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.fido.u2f.api.common.BrowserRegisterRequestParams;
import com.google.android.gms.fido.u2f.api.common.BrowserSignRequestParams;
import com.google.android.gms.fido.u2f.internal.privileged.IU2fPrivilegedCallbacks;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IU2fPrivilegedService extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IU2fPrivilegedService {
        static final int TRANSACTION_getRegisterIntent = 1;
        static final int TRANSACTION_getSignIntent = 2;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IU2fPrivilegedService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.fido.u2f.internal.privileged.IU2fPrivilegedService");
            }

            @Override // com.google.android.gms.fido.u2f.internal.privileged.IU2fPrivilegedService
            public void getRegisterIntent(IU2fPrivilegedCallbacks iU2fPrivilegedCallbacks, BrowserRegisterRequestParams browserRegisterRequestParams) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iU2fPrivilegedCallbacks);
                iax.d(obtainAndWriteInterfaceToken, browserRegisterRequestParams);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.u2f.internal.privileged.IU2fPrivilegedService
            public void getSignIntent(IU2fPrivilegedCallbacks iU2fPrivilegedCallbacks, BrowserSignRequestParams browserSignRequestParams) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iU2fPrivilegedCallbacks);
                iax.d(obtainAndWriteInterfaceToken, browserSignRequestParams);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.fido.u2f.internal.privileged.IU2fPrivilegedService");
        }

        public static IU2fPrivilegedService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.u2f.internal.privileged.IU2fPrivilegedService");
            if (queryLocalInterface instanceof IU2fPrivilegedService) {
                return (IU2fPrivilegedService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i != 2) {
                    return false;
                }
                IU2fPrivilegedCallbacks asInterface = IU2fPrivilegedCallbacks.Stub.asInterface(parcel.readStrongBinder());
                BrowserSignRequestParams browserSignRequestParams = (BrowserSignRequestParams) iax.a(parcel, BrowserSignRequestParams.CREATOR);
                enforceNoDataAvail(parcel);
                getSignIntent(asInterface, browserSignRequestParams);
            } else {
                IU2fPrivilegedCallbacks asInterface2 = IU2fPrivilegedCallbacks.Stub.asInterface(parcel.readStrongBinder());
                BrowserRegisterRequestParams browserRegisterRequestParams = (BrowserRegisterRequestParams) iax.a(parcel, BrowserRegisterRequestParams.CREATOR);
                enforceNoDataAvail(parcel);
                getRegisterIntent(asInterface2, browserRegisterRequestParams);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void getRegisterIntent(IU2fPrivilegedCallbacks iU2fPrivilegedCallbacks, BrowserRegisterRequestParams browserRegisterRequestParams);

    void getSignIntent(IU2fPrivilegedCallbacks iU2fPrivilegedCallbacks, BrowserSignRequestParams browserSignRequestParams);
}
