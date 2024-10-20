package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ICameraUpdateFactoryDelegate extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements ICameraUpdateFactoryDelegate {
        static final int TRANSACTION_newCameraPosition = 7;
        static final int TRANSACTION_newLatLng = 8;
        static final int TRANSACTION_newLatLngBounds = 10;
        static final int TRANSACTION_newLatLngBoundsWithSize = 11;
        static final int TRANSACTION_newLatLngZoom = 9;
        static final int TRANSACTION_scrollBy = 3;
        static final int TRANSACTION_zoomBy = 5;
        static final int TRANSACTION_zoomByWithFocus = 6;
        static final int TRANSACTION_zoomIn = 1;
        static final int TRANSACTION_zoomOut = 2;
        static final int TRANSACTION_zoomTo = 4;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements ICameraUpdateFactoryDelegate {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            }

            @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
            public IObjectWrapper newCameraPosition(CameraPosition cameraPosition) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, cameraPosition);
                Parcel transactAndReadException = transactAndReadException(7, obtainAndWriteInterfaceToken);
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
            public IObjectWrapper newLatLng(LatLng latLng) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, latLng);
                Parcel transactAndReadException = transactAndReadException(8, obtainAndWriteInterfaceToken);
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
            public IObjectWrapper newLatLngBounds(LatLngBounds latLngBounds, int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, latLngBounds);
                obtainAndWriteInterfaceToken.writeInt(i);
                Parcel transactAndReadException = transactAndReadException(10, obtainAndWriteInterfaceToken);
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
            public IObjectWrapper newLatLngBoundsWithSize(LatLngBounds latLngBounds, int i, int i2, int i3) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, latLngBounds);
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeInt(i2);
                obtainAndWriteInterfaceToken.writeInt(i3);
                Parcel transactAndReadException = transactAndReadException(11, obtainAndWriteInterfaceToken);
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
            public IObjectWrapper newLatLngZoom(LatLng latLng, float f) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, latLng);
                obtainAndWriteInterfaceToken.writeFloat(f);
                Parcel transactAndReadException = transactAndReadException(9, obtainAndWriteInterfaceToken);
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
            public IObjectWrapper scrollBy(float f, float f2) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeFloat(f);
                obtainAndWriteInterfaceToken.writeFloat(f2);
                Parcel transactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken);
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
            public IObjectWrapper zoomBy(float f) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeFloat(f);
                Parcel transactAndReadException = transactAndReadException(5, obtainAndWriteInterfaceToken);
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
            public IObjectWrapper zoomByWithFocus(float f, int i, int i2) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeFloat(f);
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeInt(i2);
                Parcel transactAndReadException = transactAndReadException(6, obtainAndWriteInterfaceToken);
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
            public IObjectWrapper zoomIn() {
                Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken());
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
            public IObjectWrapper zoomOut() {
                Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken());
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
            public IObjectWrapper zoomTo(float f) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeFloat(f);
                Parcel transactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken);
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
        }

        public static ICameraUpdateFactoryDelegate asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            if (queryLocalInterface instanceof ICameraUpdateFactoryDelegate) {
                return (ICameraUpdateFactoryDelegate) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    IObjectWrapper zoomIn = zoomIn();
                    parcel2.writeNoException();
                    iax.f(parcel2, zoomIn);
                    return true;
                case 2:
                    IObjectWrapper zoomOut = zoomOut();
                    parcel2.writeNoException();
                    iax.f(parcel2, zoomOut);
                    return true;
                case 3:
                    float readFloat = parcel.readFloat();
                    float readFloat2 = parcel.readFloat();
                    enforceNoDataAvail(parcel);
                    IObjectWrapper scrollBy = scrollBy(readFloat, readFloat2);
                    parcel2.writeNoException();
                    iax.f(parcel2, scrollBy);
                    return true;
                case 4:
                    float readFloat3 = parcel.readFloat();
                    enforceNoDataAvail(parcel);
                    IObjectWrapper zoomTo = zoomTo(readFloat3);
                    parcel2.writeNoException();
                    iax.f(parcel2, zoomTo);
                    return true;
                case 5:
                    float readFloat4 = parcel.readFloat();
                    enforceNoDataAvail(parcel);
                    IObjectWrapper zoomBy = zoomBy(readFloat4);
                    parcel2.writeNoException();
                    iax.f(parcel2, zoomBy);
                    return true;
                case 6:
                    float readFloat5 = parcel.readFloat();
                    int readInt = parcel.readInt();
                    int readInt2 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    IObjectWrapper zoomByWithFocus = zoomByWithFocus(readFloat5, readInt, readInt2);
                    parcel2.writeNoException();
                    iax.f(parcel2, zoomByWithFocus);
                    return true;
                case 7:
                    CameraPosition cameraPosition = (CameraPosition) iax.a(parcel, CameraPosition.CREATOR);
                    enforceNoDataAvail(parcel);
                    IObjectWrapper newCameraPosition = newCameraPosition(cameraPosition);
                    parcel2.writeNoException();
                    iax.f(parcel2, newCameraPosition);
                    return true;
                case 8:
                    LatLng latLng = (LatLng) iax.a(parcel, LatLng.CREATOR);
                    enforceNoDataAvail(parcel);
                    IObjectWrapper newLatLng = newLatLng(latLng);
                    parcel2.writeNoException();
                    iax.f(parcel2, newLatLng);
                    return true;
                case 9:
                    LatLng latLng2 = (LatLng) iax.a(parcel, LatLng.CREATOR);
                    float readFloat6 = parcel.readFloat();
                    enforceNoDataAvail(parcel);
                    IObjectWrapper newLatLngZoom = newLatLngZoom(latLng2, readFloat6);
                    parcel2.writeNoException();
                    iax.f(parcel2, newLatLngZoom);
                    return true;
                case 10:
                    LatLngBounds latLngBounds = (LatLngBounds) iax.a(parcel, LatLngBounds.CREATOR);
                    int readInt3 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    IObjectWrapper newLatLngBounds = newLatLngBounds(latLngBounds, readInt3);
                    parcel2.writeNoException();
                    iax.f(parcel2, newLatLngBounds);
                    return true;
                case 11:
                    LatLngBounds latLngBounds2 = (LatLngBounds) iax.a(parcel, LatLngBounds.CREATOR);
                    int readInt4 = parcel.readInt();
                    int readInt5 = parcel.readInt();
                    int readInt6 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    IObjectWrapper newLatLngBoundsWithSize = newLatLngBoundsWithSize(latLngBounds2, readInt4, readInt5, readInt6);
                    parcel2.writeNoException();
                    iax.f(parcel2, newLatLngBoundsWithSize);
                    return true;
                default:
                    return false;
            }
        }
    }

    IObjectWrapper newCameraPosition(CameraPosition cameraPosition);

    IObjectWrapper newLatLng(LatLng latLng);

    IObjectWrapper newLatLngBounds(LatLngBounds latLngBounds, int i);

    IObjectWrapper newLatLngBoundsWithSize(LatLngBounds latLngBounds, int i, int i2, int i3);

    IObjectWrapper newLatLngZoom(LatLng latLng, float f);

    IObjectWrapper scrollBy(float f, float f2);

    IObjectWrapper zoomBy(float f);

    IObjectWrapper zoomByWithFocus(float f, int i, int i2);

    IObjectWrapper zoomIn();

    IObjectWrapper zoomOut();

    IObjectWrapper zoomTo(float f);
}
