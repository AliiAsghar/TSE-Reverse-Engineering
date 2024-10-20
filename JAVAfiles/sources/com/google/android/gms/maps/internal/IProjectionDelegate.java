package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.VisibleRegion;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IProjectionDelegate extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IProjectionDelegate {
        static final int TRANSACTION_fromScreenLocation = 1;
        static final int TRANSACTION_getVisibleRegion = 3;
        static final int TRANSACTION_toScreenLocation = 2;
        static final int TRANSACTION_toScreenLocationWithAltitude = 4;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IProjectionDelegate {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.internal.IProjectionDelegate");
            }

            @Override // com.google.android.gms.maps.internal.IProjectionDelegate
            public LatLng fromScreenLocation(IObjectWrapper iObjectWrapper) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iObjectWrapper);
                Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
                LatLng latLng = (LatLng) iax.a(transactAndReadException, LatLng.CREATOR);
                transactAndReadException.recycle();
                return latLng;
            }

            @Override // com.google.android.gms.maps.internal.IProjectionDelegate
            public VisibleRegion getVisibleRegion() {
                Parcel transactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken());
                VisibleRegion visibleRegion = (VisibleRegion) iax.a(transactAndReadException, VisibleRegion.CREATOR);
                transactAndReadException.recycle();
                return visibleRegion;
            }

            @Override // com.google.android.gms.maps.internal.IProjectionDelegate
            public IObjectWrapper toScreenLocation(LatLng latLng) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, latLng);
                Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken);
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.maps.internal.IProjectionDelegate
            public IObjectWrapper toScreenLocationWithAltitude(LatLng latLng, float f) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, latLng);
                obtainAndWriteInterfaceToken.writeFloat(f);
                Parcel transactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken);
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.internal.IProjectionDelegate");
        }

        public static IProjectionDelegate asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
            if (queryLocalInterface instanceof IProjectionDelegate) {
                return (IProjectionDelegate) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return false;
                        }
                        LatLng latLng = (LatLng) iax.a(parcel, LatLng.CREATOR);
                        float readFloat = parcel.readFloat();
                        enforceNoDataAvail(parcel);
                        IObjectWrapper screenLocationWithAltitude = toScreenLocationWithAltitude(latLng, readFloat);
                        parcel2.writeNoException();
                        iax.f(parcel2, screenLocationWithAltitude);
                    } else {
                        VisibleRegion visibleRegion = getVisibleRegion();
                        parcel2.writeNoException();
                        iax.e(parcel2, visibleRegion);
                    }
                } else {
                    LatLng latLng2 = (LatLng) iax.a(parcel, LatLng.CREATOR);
                    enforceNoDataAvail(parcel);
                    IObjectWrapper screenLocation = toScreenLocation(latLng2);
                    parcel2.writeNoException();
                    iax.f(parcel2, screenLocation);
                }
            } else {
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                LatLng fromScreenLocation = fromScreenLocation(asInterface);
                parcel2.writeNoException();
                iax.e(parcel2, fromScreenLocation);
            }
            return true;
        }
    }

    LatLng fromScreenLocation(IObjectWrapper iObjectWrapper);

    VisibleRegion getVisibleRegion();

    IObjectWrapper toScreenLocation(LatLng latLng);

    IObjectWrapper toScreenLocationWithAltitude(LatLng latLng, float f);
}
