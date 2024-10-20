package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IOnStreetViewPanoramaClickListener extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IOnStreetViewPanoramaClickListener {
        static final int TRANSACTION_onStreetViewPanoramaClick = 1;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IOnStreetViewPanoramaClickListener {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.internal.IOnStreetViewPanoramaClickListener");
            }

            @Override // com.google.android.gms.maps.internal.IOnStreetViewPanoramaClickListener
            public void onStreetViewPanoramaClick(StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, streetViewPanoramaOrientation);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.internal.IOnStreetViewPanoramaClickListener");
        }

        public static IOnStreetViewPanoramaClickListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnStreetViewPanoramaClickListener");
            if (queryLocalInterface instanceof IOnStreetViewPanoramaClickListener) {
                return (IOnStreetViewPanoramaClickListener) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                StreetViewPanoramaOrientation streetViewPanoramaOrientation = (StreetViewPanoramaOrientation) iax.a(parcel, StreetViewPanoramaOrientation.CREATOR);
                enforceNoDataAvail(parcel);
                onStreetViewPanoramaClick(streetViewPanoramaOrientation);
                parcel2.writeNoException();
                return true;
            }
            return false;
        }
    }

    void onStreetViewPanoramaClick(StreetViewPanoramaOrientation streetViewPanoramaOrientation);
}
