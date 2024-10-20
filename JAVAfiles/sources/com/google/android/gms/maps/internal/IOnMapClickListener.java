package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.maps.model.LatLng;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IOnMapClickListener extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IOnMapClickListener {
        static final int TRANSACTION_onMapClick = 1;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IOnMapClickListener {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.internal.IOnMapClickListener");
            }

            @Override // com.google.android.gms.maps.internal.IOnMapClickListener
            public void onMapClick(LatLng latLng) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, latLng);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.internal.IOnMapClickListener");
        }

        public static IOnMapClickListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnMapClickListener");
            if (queryLocalInterface instanceof IOnMapClickListener) {
                return (IOnMapClickListener) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                LatLng latLng = (LatLng) iax.a(parcel, LatLng.CREATOR);
                enforceNoDataAvail(parcel);
                onMapClick(latLng);
                parcel2.writeNoException();
                return true;
            }
            return false;
        }
    }

    void onMapClick(LatLng latLng);
}
