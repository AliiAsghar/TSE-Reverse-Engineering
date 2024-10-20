package com.google.android.ims.client.provisioning;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface IProvisioningService extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public static abstract class Stub extends BaseStub implements IProvisioningService {
        static final int TRANSACTION_getConfigurationValues = 1;
        static final int TRANSACTION_getProvisioningState = 2;

        /* compiled from: PG */
        /* loaded from: classes.dex */
        public static class Proxy extends BaseProxy implements IProvisioningService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.ims.client.provisioning.IProvisioningService");
            }

            @Override // com.google.android.ims.client.provisioning.IProvisioningService
            public Bundle getConfigurationValues(int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
                Bundle bundle = (Bundle) iax.a(transactAndReadException, Bundle.CREATOR);
                transactAndReadException.recycle();
                return bundle;
            }

            @Override // com.google.android.ims.client.provisioning.IProvisioningService
            public int getProvisioningState() {
                Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken());
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }
        }

        public Stub() {
            super("com.google.android.ims.client.provisioning.IProvisioningService");
        }

        public static IProvisioningService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.ims.client.provisioning.IProvisioningService");
            if (queryLocalInterface instanceof IProvisioningService) {
                return (IProvisioningService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i != 2) {
                    return false;
                }
                int provisioningState = getProvisioningState();
                parcel2.writeNoException();
                parcel2.writeInt(provisioningState);
            } else {
                int readInt = parcel.readInt();
                enforceNoDataAvail(parcel);
                Bundle configurationValues = getConfigurationValues(readInt);
                parcel2.writeNoException();
                iax.e(parcel2, configurationValues);
            }
            return true;
        }
    }

    Bundle getConfigurationValues(int i);

    int getProvisioningState();
}
