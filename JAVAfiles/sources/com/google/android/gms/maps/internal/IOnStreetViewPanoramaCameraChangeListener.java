package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IOnStreetViewPanoramaCameraChangeListener extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IOnStreetViewPanoramaCameraChangeListener {
        static final int TRANSACTION_onStreetViewPanoramaCameraChange = 1;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IOnStreetViewPanoramaCameraChangeListener {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.internal.IOnStreetViewPanoramaCameraChangeListener");
            }

            @Override // com.google.android.gms.maps.internal.IOnStreetViewPanoramaCameraChangeListener
            public void onStreetViewPanoramaCameraChange(StreetViewPanoramaCamera streetViewPanoramaCamera) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, streetViewPanoramaCamera);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.internal.IOnStreetViewPanoramaCameraChangeListener");
        }

        public static IOnStreetViewPanoramaCameraChangeListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnStreetViewPanoramaCameraChangeListener");
            if (queryLocalInterface instanceof IOnStreetViewPanoramaCameraChangeListener) {
                return (IOnStreetViewPanoramaCameraChangeListener) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                StreetViewPanoramaCamera streetViewPanoramaCamera = (StreetViewPanoramaCamera) iax.a(parcel, StreetViewPanoramaCamera.CREATOR);
                enforceNoDataAvail(parcel);
                onStreetViewPanoramaCameraChange(streetViewPanoramaCamera);
                parcel2.writeNoException();
                return true;
            }
            return false;
        }
    }

    void onStreetViewPanoramaCameraChange(StreetViewPanoramaCamera streetViewPanoramaCamera);
}
