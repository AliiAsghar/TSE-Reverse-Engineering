package com.google.android.apps.tachyon.clientapi;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IGetMeetApiAvailabilityCallback extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IGetMeetApiAvailabilityCallback {
        static final int TRANSACTION_onResult = 1;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IGetMeetApiAvailabilityCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.tachyon.clientapi.IGetMeetApiAvailabilityCallback");
            }

            @Override // com.google.android.apps.tachyon.clientapi.IGetMeetApiAvailabilityCallback
            public void onResult(byte[] bArr) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeByteArray(bArr);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.apps.tachyon.clientapi.IGetMeetApiAvailabilityCallback");
        }

        public static IGetMeetApiAvailabilityCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.tachyon.clientapi.IGetMeetApiAvailabilityCallback");
            if (queryLocalInterface instanceof IGetMeetApiAvailabilityCallback) {
                return (IGetMeetApiAvailabilityCallback) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                byte[] createByteArray = parcel.createByteArray();
                enforceNoDataAvail(parcel);
                onResult(createByteArray);
                return true;
            }
            return false;
        }
    }

    void onResult(byte[] bArr);
}
