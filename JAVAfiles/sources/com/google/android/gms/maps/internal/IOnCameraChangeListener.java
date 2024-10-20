package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.maps.model.CameraPosition;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IOnCameraChangeListener extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IOnCameraChangeListener {
        static final int TRANSACTION_onCameraChange = 1;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IOnCameraChangeListener {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.internal.IOnCameraChangeListener");
            }

            @Override // com.google.android.gms.maps.internal.IOnCameraChangeListener
            public void onCameraChange(CameraPosition cameraPosition) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, cameraPosition);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.internal.IOnCameraChangeListener");
        }

        public static IOnCameraChangeListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnCameraChangeListener");
            if (queryLocalInterface instanceof IOnCameraChangeListener) {
                return (IOnCameraChangeListener) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                CameraPosition cameraPosition = (CameraPosition) iax.a(parcel, CameraPosition.CREATOR);
                enforceNoDataAvail(parcel);
                onCameraChange(cameraPosition);
                parcel2.writeNoException();
                return true;
            }
            return false;
        }
    }

    void onCameraChange(CameraPosition cameraPosition);
}
