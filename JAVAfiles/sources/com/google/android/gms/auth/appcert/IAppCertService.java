package com.google.android.gms.auth.appcert;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IAppCertService extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IAppCertService {
        static final int TRANSACTION_getAppCert = 2;
        static final int TRANSACTION_initializeDeviceKey = 1;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IAppCertService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.appcert.IAppCertService");
            }

            @Override // com.google.android.gms.auth.appcert.IAppCertService
            public String getAppCert(String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken);
                String readString = transactAndReadException.readString();
                transactAndReadException.recycle();
                return readString;
            }

            @Override // com.google.android.gms.auth.appcert.IAppCertService
            public boolean initializeDeviceKey() {
                Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken());
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.appcert.IAppCertService");
        }

        public static IAppCertService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.appcert.IAppCertService");
            if (queryLocalInterface instanceof IAppCertService) {
                return (IAppCertService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i != 2) {
                    return false;
                }
                String readString = parcel.readString();
                enforceNoDataAvail(parcel);
                String appCert = getAppCert(readString);
                parcel2.writeNoException();
                parcel2.writeString(appCert);
            } else {
                boolean initializeDeviceKey = initializeDeviceKey();
                parcel2.writeNoException();
                int i3 = iax.a;
                parcel2.writeInt(initializeDeviceKey ? 1 : 0);
            }
            return true;
        }
    }

    String getAppCert(String str);

    boolean initializeDeviceKey();
}
