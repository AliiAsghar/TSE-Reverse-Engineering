package com.google.android.gms.auth.account.device.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.account.device.AddCastCertificateToDeviceAccountRequest;
import com.google.android.gms.auth.account.device.internal.IDeviceAccountCallbacks;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IDeviceAccountService extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IDeviceAccountService {
        static final int TRANSACTION_addCastCertificateToDeviceAccount = 1;
        static final int TRANSACTION_getDeviceAccountJwt = 3;
        static final int TRANSACTION_getIddid = 2;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IDeviceAccountService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.account.device.internal.IDeviceAccountService");
            }

            @Override // com.google.android.gms.auth.account.device.internal.IDeviceAccountService
            public void addCastCertificateToDeviceAccount(IDeviceAccountCallbacks iDeviceAccountCallbacks, AddCastCertificateToDeviceAccountRequest addCastCertificateToDeviceAccountRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iDeviceAccountCallbacks);
                iax.d(obtainAndWriteInterfaceToken, addCastCertificateToDeviceAccountRequest);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.account.device.internal.IDeviceAccountService
            public void getDeviceAccountJwt(IDeviceAccountCallbacks iDeviceAccountCallbacks, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iDeviceAccountCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.account.device.internal.IDeviceAccountService
            public void getIddid(IDeviceAccountCallbacks iDeviceAccountCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iDeviceAccountCallbacks);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.account.device.internal.IDeviceAccountService");
        }

        public static IDeviceAccountService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.device.internal.IDeviceAccountService");
            if (queryLocalInterface instanceof IDeviceAccountService) {
                return (IDeviceAccountService) queryLocalInterface;
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
                    IDeviceAccountCallbacks asInterface = IDeviceAccountCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String readString = parcel.readString();
                    enforceNoDataAvail(parcel);
                    getDeviceAccountJwt(asInterface, readString);
                } else {
                    IDeviceAccountCallbacks asInterface2 = IDeviceAccountCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getIddid(asInterface2);
                }
            } else {
                IDeviceAccountCallbacks asInterface3 = IDeviceAccountCallbacks.Stub.asInterface(parcel.readStrongBinder());
                AddCastCertificateToDeviceAccountRequest addCastCertificateToDeviceAccountRequest = (AddCastCertificateToDeviceAccountRequest) iax.a(parcel, AddCastCertificateToDeviceAccountRequest.CREATOR);
                enforceNoDataAvail(parcel);
                addCastCertificateToDeviceAccount(asInterface3, addCastCertificateToDeviceAccountRequest);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void addCastCertificateToDeviceAccount(IDeviceAccountCallbacks iDeviceAccountCallbacks, AddCastCertificateToDeviceAccountRequest addCastCertificateToDeviceAccountRequest);

    void getDeviceAccountJwt(IDeviceAccountCallbacks iDeviceAccountCallbacks, String str);

    void getIddid(IDeviceAccountCallbacks iDeviceAccountCallbacks);
}
