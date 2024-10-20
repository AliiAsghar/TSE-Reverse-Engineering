package com.google.android.gms.auth.account.data;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.firstparty.dataservice.DeviceManagementInfoResponse;
import com.google.android.gms.common.api.Status;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IGetDeviceManagementInfoCallback extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IGetDeviceManagementInfoCallback {
        static final int TRANSACTION_onResponse = 2;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IGetDeviceManagementInfoCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.account.data.IGetDeviceManagementInfoCallback");
            }

            @Override // com.google.android.gms.auth.account.data.IGetDeviceManagementInfoCallback
            public void onResponse(Status status, DeviceManagementInfoResponse deviceManagementInfoResponse) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                iax.d(obtainAndWriteInterfaceToken, deviceManagementInfoResponse);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.account.data.IGetDeviceManagementInfoCallback");
        }

        public static IGetDeviceManagementInfoCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.data.IGetDeviceManagementInfoCallback");
            if (queryLocalInterface instanceof IGetDeviceManagementInfoCallback) {
                return (IGetDeviceManagementInfoCallback) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                Status status = (Status) iax.a(parcel, Status.CREATOR);
                DeviceManagementInfoResponse deviceManagementInfoResponse = (DeviceManagementInfoResponse) iax.a(parcel, DeviceManagementInfoResponse.CREATOR);
                enforceNoDataAvail(parcel);
                onResponse(status, deviceManagementInfoResponse);
                return true;
            }
            return false;
        }
    }

    void onResponse(Status status, DeviceManagementInfoResponse deviceManagementInfoResponse);
}
