package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IOnStreetViewPanoramaReadyCallback extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IOnStreetViewPanoramaReadyCallback {
        static final int TRANSACTION_onStreetViewPanoramaReady = 1;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IOnStreetViewPanoramaReadyCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.internal.IOnStreetViewPanoramaReadyCallback");
            }

            @Override // com.google.android.gms.maps.internal.IOnStreetViewPanoramaReadyCallback
            public void onStreetViewPanoramaReady(IStreetViewPanoramaDelegate iStreetViewPanoramaDelegate) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStreetViewPanoramaDelegate);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.internal.IOnStreetViewPanoramaReadyCallback");
        }

        public static IOnStreetViewPanoramaReadyCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnStreetViewPanoramaReadyCallback");
            if (queryLocalInterface instanceof IOnStreetViewPanoramaReadyCallback) {
                return (IOnStreetViewPanoramaReadyCallback) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                IStreetViewPanoramaDelegate asInterface = IStreetViewPanoramaDelegate.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                onStreetViewPanoramaReady(asInterface);
                parcel2.writeNoException();
                return true;
            }
            return false;
        }
    }

    void onStreetViewPanoramaReady(IStreetViewPanoramaDelegate iStreetViewPanoramaDelegate);
}
