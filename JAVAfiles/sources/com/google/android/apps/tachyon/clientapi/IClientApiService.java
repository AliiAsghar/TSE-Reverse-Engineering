package com.google.android.apps.tachyon.clientapi;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.apps.tachyon.clientapi.IGetMeetApiAvailabilityCallback;
import com.google.android.apps.tachyon.clientapi.IGetRegisteredIdTypeCallback;
import com.google.android.apps.tachyon.clientapi.IGetRegistrationInfoCallback;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IClientApiService extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IClientApiService {
        static final int TRANSACTION_getMeetApiAvailabilityInfo = 4;
        static final int TRANSACTION_getRegisteredIdType = 3;
        static final int TRANSACTION_getRegistrationInfo = 2;
        static final int TRANSACTION_getSupportedApiFeatures = 1;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IClientApiService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.tachyon.clientapi.IClientApiService");
            }

            @Override // com.google.android.apps.tachyon.clientapi.IClientApiService
            public void getMeetApiAvailabilityInfo(IGetMeetApiAvailabilityCallback iGetMeetApiAvailabilityCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iGetMeetApiAvailabilityCallback);
                transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.tachyon.clientapi.IClientApiService
            public void getRegisteredIdType(IGetRegisteredIdTypeCallback iGetRegisteredIdTypeCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iGetRegisteredIdTypeCallback);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.tachyon.clientapi.IClientApiService
            public void getRegistrationInfo(IGetRegistrationInfoCallback iGetRegistrationInfoCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iGetRegistrationInfoCallback);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.tachyon.clientapi.IClientApiService
            public byte[] getSupportedApiFeatures() {
                Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken());
                byte[] createByteArray = transactAndReadException.createByteArray();
                transactAndReadException.recycle();
                return createByteArray;
            }
        }

        public Stub() {
            super("com.google.android.apps.tachyon.clientapi.IClientApiService");
        }

        public static IClientApiService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.tachyon.clientapi.IClientApiService");
            if (queryLocalInterface instanceof IClientApiService) {
                return (IClientApiService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return false;
                        }
                        IGetMeetApiAvailabilityCallback asInterface = IGetMeetApiAvailabilityCallback.Stub.asInterface(parcel.readStrongBinder());
                        enforceNoDataAvail(parcel);
                        getMeetApiAvailabilityInfo(asInterface);
                        parcel2.writeNoException();
                    } else {
                        IGetRegisteredIdTypeCallback asInterface2 = IGetRegisteredIdTypeCallback.Stub.asInterface(parcel.readStrongBinder());
                        enforceNoDataAvail(parcel);
                        getRegisteredIdType(asInterface2);
                        parcel2.writeNoException();
                    }
                } else {
                    IGetRegistrationInfoCallback asInterface3 = IGetRegistrationInfoCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getRegistrationInfo(asInterface3);
                    parcel2.writeNoException();
                }
            } else {
                byte[] supportedApiFeatures = getSupportedApiFeatures();
                parcel2.writeNoException();
                parcel2.writeByteArray(supportedApiFeatures);
            }
            return true;
        }
    }

    void getMeetApiAvailabilityInfo(IGetMeetApiAvailabilityCallback iGetMeetApiAvailabilityCallback);

    void getRegisteredIdType(IGetRegisteredIdTypeCallback iGetRegisteredIdTypeCallback);

    void getRegistrationInfo(IGetRegistrationInfoCallback iGetRegistrationInfoCallback);

    byte[] getSupportedApiFeatures();
}
