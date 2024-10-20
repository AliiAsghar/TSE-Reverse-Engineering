package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.internal.IMarkerDelegate;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IInfoWindowAdapter extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IInfoWindowAdapter {
        static final int TRANSACTION_getInfoContents = 2;
        static final int TRANSACTION_getInfoWindow = 1;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IInfoWindowAdapter {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.internal.IInfoWindowAdapter");
            }

            @Override // com.google.android.gms.maps.internal.IInfoWindowAdapter
            public IObjectWrapper getInfoContents(IMarkerDelegate iMarkerDelegate) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iMarkerDelegate);
                Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken);
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.maps.internal.IInfoWindowAdapter
            public IObjectWrapper getInfoWindow(IMarkerDelegate iMarkerDelegate) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iMarkerDelegate);
                Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.internal.IInfoWindowAdapter");
        }

        public static IInfoWindowAdapter asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IInfoWindowAdapter");
            if (queryLocalInterface instanceof IInfoWindowAdapter) {
                return (IInfoWindowAdapter) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i != 2) {
                    return false;
                }
                IMarkerDelegate asInterface = IMarkerDelegate.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                IObjectWrapper infoContents = getInfoContents(asInterface);
                parcel2.writeNoException();
                iax.f(parcel2, infoContents);
            } else {
                IMarkerDelegate asInterface2 = IMarkerDelegate.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                IObjectWrapper infoWindow = getInfoWindow(asInterface2);
                parcel2.writeNoException();
                iax.f(parcel2, infoWindow);
            }
            return true;
        }
    }

    IObjectWrapper getInfoContents(IMarkerDelegate iMarkerDelegate);

    IObjectWrapper getInfoWindow(IMarkerDelegate iMarkerDelegate);
}
