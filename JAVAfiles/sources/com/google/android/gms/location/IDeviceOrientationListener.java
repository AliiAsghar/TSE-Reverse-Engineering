package com.google.android.gms.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IDeviceOrientationListener extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IDeviceOrientationListener {
        static final int TRANSACTION_onDeviceOrientationChanged = 1;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IDeviceOrientationListener {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.location.IDeviceOrientationListener");
            }

            @Override // com.google.android.gms.location.IDeviceOrientationListener
            public void onDeviceOrientationChanged(DeviceOrientation deviceOrientation) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, deviceOrientation);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.location.IDeviceOrientationListener");
        }

        public static IDeviceOrientationListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.IDeviceOrientationListener");
            if (queryLocalInterface instanceof IDeviceOrientationListener) {
                return (IDeviceOrientationListener) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                DeviceOrientation deviceOrientation = (DeviceOrientation) iax.a(parcel, DeviceOrientation.CREATOR);
                enforceNoDataAvail(parcel);
                onDeviceOrientationChanged(deviceOrientation);
                return true;
            }
            return false;
        }
    }

    void onDeviceOrientationChanged(DeviceOrientation deviceOrientation);
}
