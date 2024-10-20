package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.internal.IOnStreetViewPanoramaCameraChangeListener;
import com.google.android.gms.maps.internal.IOnStreetViewPanoramaChangeListener;
import com.google.android.gms.maps.internal.IOnStreetViewPanoramaClickListener;
import com.google.android.gms.maps.internal.IOnStreetViewPanoramaLongClickListener;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;
import com.google.android.gms.maps.model.StreetViewSource;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IStreetViewPanoramaDelegate extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IStreetViewPanoramaDelegate {
        static final int TRANSACTION_animateTo = 9;
        static final int TRANSACTION_enablePanning = 2;
        static final int TRANSACTION_enableStreetNames = 4;
        static final int TRANSACTION_enableUserNavigation = 3;
        static final int TRANSACTION_enableZoom = 1;
        static final int TRANSACTION_getPanoramaCamera = 10;
        static final int TRANSACTION_getStreetViewPanoramaLocation = 14;
        static final int TRANSACTION_isPanningGesturesEnabled = 6;
        static final int TRANSACTION_isStreetNamesEnabled = 8;
        static final int TRANSACTION_isUserNavigationEnabled = 7;
        static final int TRANSACTION_isZoomGesturesEnabled = 5;
        static final int TRANSACTION_orientationToPoint = 19;
        static final int TRANSACTION_pointToOrientation = 18;
        static final int TRANSACTION_setOnStreetViewPanoramaCameraChangeListener = 16;
        static final int TRANSACTION_setOnStreetViewPanoramaChangeListener = 15;
        static final int TRANSACTION_setOnStreetViewPanoramaClickListener = 17;
        static final int TRANSACTION_setOnStreetViewPanoramaLongClickListener = 20;
        static final int TRANSACTION_setPosition = 12;
        static final int TRANSACTION_setPositionWithID = 11;
        static final int TRANSACTION_setPositionWithRadius = 13;
        static final int TRANSACTION_setPositionWithRadiusAndSource = 22;
        static final int TRANSACTION_setPositionWithSource = 21;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IStreetViewPanoramaDelegate {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            }

            @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
            public void animateTo(StreetViewPanoramaCamera streetViewPanoramaCamera, long j) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, streetViewPanoramaCamera);
                obtainAndWriteInterfaceToken.writeLong(j);
                transactAndReadExceptionReturnVoid(9, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
            public void enablePanning(boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = iax.a;
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
            public void enableStreetNames(boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = iax.a;
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
            public void enableUserNavigation(boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = iax.a;
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
            public void enableZoom(boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = iax.a;
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
            public StreetViewPanoramaCamera getPanoramaCamera() {
                Parcel transactAndReadException = transactAndReadException(10, obtainAndWriteInterfaceToken());
                StreetViewPanoramaCamera streetViewPanoramaCamera = (StreetViewPanoramaCamera) iax.a(transactAndReadException, StreetViewPanoramaCamera.CREATOR);
                transactAndReadException.recycle();
                return streetViewPanoramaCamera;
            }

            @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
            public StreetViewPanoramaLocation getStreetViewPanoramaLocation() {
                Parcel transactAndReadException = transactAndReadException(14, obtainAndWriteInterfaceToken());
                StreetViewPanoramaLocation streetViewPanoramaLocation = (StreetViewPanoramaLocation) iax.a(transactAndReadException, StreetViewPanoramaLocation.CREATOR);
                transactAndReadException.recycle();
                return streetViewPanoramaLocation;
            }

            @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
            public boolean isPanningGesturesEnabled() {
                Parcel transactAndReadException = transactAndReadException(6, obtainAndWriteInterfaceToken());
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
            public boolean isStreetNamesEnabled() {
                Parcel transactAndReadException = transactAndReadException(8, obtainAndWriteInterfaceToken());
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
            public boolean isUserNavigationEnabled() {
                Parcel transactAndReadException = transactAndReadException(7, obtainAndWriteInterfaceToken());
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
            public boolean isZoomGesturesEnabled() {
                Parcel transactAndReadException = transactAndReadException(5, obtainAndWriteInterfaceToken());
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
            public IObjectWrapper orientationToPoint(StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, streetViewPanoramaOrientation);
                Parcel transactAndReadException = transactAndReadException(19, obtainAndWriteInterfaceToken);
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
            public StreetViewPanoramaOrientation pointToOrientation(IObjectWrapper iObjectWrapper) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iObjectWrapper);
                Parcel transactAndReadException = transactAndReadException(18, obtainAndWriteInterfaceToken);
                StreetViewPanoramaOrientation streetViewPanoramaOrientation = (StreetViewPanoramaOrientation) iax.a(transactAndReadException, StreetViewPanoramaOrientation.CREATOR);
                transactAndReadException.recycle();
                return streetViewPanoramaOrientation;
            }

            @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
            public void setOnStreetViewPanoramaCameraChangeListener(IOnStreetViewPanoramaCameraChangeListener iOnStreetViewPanoramaCameraChangeListener) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iOnStreetViewPanoramaCameraChangeListener);
                transactAndReadExceptionReturnVoid(16, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
            public void setOnStreetViewPanoramaChangeListener(IOnStreetViewPanoramaChangeListener iOnStreetViewPanoramaChangeListener) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iOnStreetViewPanoramaChangeListener);
                transactAndReadExceptionReturnVoid(15, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
            public void setOnStreetViewPanoramaClickListener(IOnStreetViewPanoramaClickListener iOnStreetViewPanoramaClickListener) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iOnStreetViewPanoramaClickListener);
                transactAndReadExceptionReturnVoid(17, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
            public void setOnStreetViewPanoramaLongClickListener(IOnStreetViewPanoramaLongClickListener iOnStreetViewPanoramaLongClickListener) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iOnStreetViewPanoramaLongClickListener);
                transactAndReadExceptionReturnVoid(20, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
            public void setPosition(LatLng latLng) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, latLng);
                transactAndReadExceptionReturnVoid(12, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
            public void setPositionWithID(String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(11, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
            public void setPositionWithRadius(LatLng latLng, int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, latLng);
                obtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(13, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
            public void setPositionWithRadiusAndSource(LatLng latLng, int i, StreetViewSource streetViewSource) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, latLng);
                obtainAndWriteInterfaceToken.writeInt(i);
                iax.d(obtainAndWriteInterfaceToken, streetViewSource);
                transactAndReadExceptionReturnVoid(22, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
            public void setPositionWithSource(LatLng latLng, StreetViewSource streetViewSource) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, latLng);
                iax.d(obtainAndWriteInterfaceToken, streetViewSource);
                transactAndReadExceptionReturnVoid(21, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
        }

        public static IStreetViewPanoramaDelegate asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            if (queryLocalInterface instanceof IStreetViewPanoramaDelegate) {
                return (IStreetViewPanoramaDelegate) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    boolean g = iax.g(parcel);
                    enforceNoDataAvail(parcel);
                    enableZoom(g);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    boolean g2 = iax.g(parcel);
                    enforceNoDataAvail(parcel);
                    enablePanning(g2);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    boolean g3 = iax.g(parcel);
                    enforceNoDataAvail(parcel);
                    enableUserNavigation(g3);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    boolean g4 = iax.g(parcel);
                    enforceNoDataAvail(parcel);
                    enableStreetNames(g4);
                    parcel2.writeNoException();
                    return true;
                case 5:
                    boolean isZoomGesturesEnabled = isZoomGesturesEnabled();
                    parcel2.writeNoException();
                    int i3 = iax.a;
                    parcel2.writeInt(isZoomGesturesEnabled ? 1 : 0);
                    return true;
                case 6:
                    boolean isPanningGesturesEnabled = isPanningGesturesEnabled();
                    parcel2.writeNoException();
                    int i4 = iax.a;
                    parcel2.writeInt(isPanningGesturesEnabled ? 1 : 0);
                    return true;
                case 7:
                    boolean isUserNavigationEnabled = isUserNavigationEnabled();
                    parcel2.writeNoException();
                    int i5 = iax.a;
                    parcel2.writeInt(isUserNavigationEnabled ? 1 : 0);
                    return true;
                case 8:
                    boolean isStreetNamesEnabled = isStreetNamesEnabled();
                    parcel2.writeNoException();
                    int i6 = iax.a;
                    parcel2.writeInt(isStreetNamesEnabled ? 1 : 0);
                    return true;
                case 9:
                    StreetViewPanoramaCamera streetViewPanoramaCamera = (StreetViewPanoramaCamera) iax.a(parcel, StreetViewPanoramaCamera.CREATOR);
                    long readLong = parcel.readLong();
                    enforceNoDataAvail(parcel);
                    animateTo(streetViewPanoramaCamera, readLong);
                    parcel2.writeNoException();
                    return true;
                case 10:
                    StreetViewPanoramaCamera panoramaCamera = getPanoramaCamera();
                    parcel2.writeNoException();
                    iax.e(parcel2, panoramaCamera);
                    return true;
                case 11:
                    String readString = parcel.readString();
                    enforceNoDataAvail(parcel);
                    setPositionWithID(readString);
                    parcel2.writeNoException();
                    return true;
                case 12:
                    LatLng latLng = (LatLng) iax.a(parcel, LatLng.CREATOR);
                    enforceNoDataAvail(parcel);
                    setPosition(latLng);
                    parcel2.writeNoException();
                    return true;
                case 13:
                    LatLng latLng2 = (LatLng) iax.a(parcel, LatLng.CREATOR);
                    int readInt = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    setPositionWithRadius(latLng2, readInt);
                    parcel2.writeNoException();
                    return true;
                case 14:
                    StreetViewPanoramaLocation streetViewPanoramaLocation = getStreetViewPanoramaLocation();
                    parcel2.writeNoException();
                    iax.e(parcel2, streetViewPanoramaLocation);
                    return true;
                case 15:
                    IOnStreetViewPanoramaChangeListener asInterface = IOnStreetViewPanoramaChangeListener.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    setOnStreetViewPanoramaChangeListener(asInterface);
                    parcel2.writeNoException();
                    return true;
                case 16:
                    IOnStreetViewPanoramaCameraChangeListener asInterface2 = IOnStreetViewPanoramaCameraChangeListener.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    setOnStreetViewPanoramaCameraChangeListener(asInterface2);
                    parcel2.writeNoException();
                    return true;
                case 17:
                    IOnStreetViewPanoramaClickListener asInterface3 = IOnStreetViewPanoramaClickListener.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    setOnStreetViewPanoramaClickListener(asInterface3);
                    parcel2.writeNoException();
                    return true;
                case 18:
                    IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    StreetViewPanoramaOrientation pointToOrientation = pointToOrientation(asInterface4);
                    parcel2.writeNoException();
                    iax.e(parcel2, pointToOrientation);
                    return true;
                case 19:
                    StreetViewPanoramaOrientation streetViewPanoramaOrientation = (StreetViewPanoramaOrientation) iax.a(parcel, StreetViewPanoramaOrientation.CREATOR);
                    enforceNoDataAvail(parcel);
                    IObjectWrapper orientationToPoint = orientationToPoint(streetViewPanoramaOrientation);
                    parcel2.writeNoException();
                    iax.f(parcel2, orientationToPoint);
                    return true;
                case 20:
                    IOnStreetViewPanoramaLongClickListener asInterface5 = IOnStreetViewPanoramaLongClickListener.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    setOnStreetViewPanoramaLongClickListener(asInterface5);
                    parcel2.writeNoException();
                    return true;
                case 21:
                    LatLng latLng3 = (LatLng) iax.a(parcel, LatLng.CREATOR);
                    StreetViewSource streetViewSource = (StreetViewSource) iax.a(parcel, StreetViewSource.CREATOR);
                    enforceNoDataAvail(parcel);
                    setPositionWithSource(latLng3, streetViewSource);
                    parcel2.writeNoException();
                    return true;
                case 22:
                    LatLng latLng4 = (LatLng) iax.a(parcel, LatLng.CREATOR);
                    int readInt2 = parcel.readInt();
                    StreetViewSource streetViewSource2 = (StreetViewSource) iax.a(parcel, StreetViewSource.CREATOR);
                    enforceNoDataAvail(parcel);
                    setPositionWithRadiusAndSource(latLng4, readInt2, streetViewSource2);
                    parcel2.writeNoException();
                    return true;
                default:
                    return false;
            }
        }
    }

    void animateTo(StreetViewPanoramaCamera streetViewPanoramaCamera, long j);

    void enablePanning(boolean z);

    void enableStreetNames(boolean z);

    void enableUserNavigation(boolean z);

    void enableZoom(boolean z);

    StreetViewPanoramaCamera getPanoramaCamera();

    StreetViewPanoramaLocation getStreetViewPanoramaLocation();

    boolean isPanningGesturesEnabled();

    boolean isStreetNamesEnabled();

    boolean isUserNavigationEnabled();

    boolean isZoomGesturesEnabled();

    IObjectWrapper orientationToPoint(StreetViewPanoramaOrientation streetViewPanoramaOrientation);

    StreetViewPanoramaOrientation pointToOrientation(IObjectWrapper iObjectWrapper);

    void setOnStreetViewPanoramaCameraChangeListener(IOnStreetViewPanoramaCameraChangeListener iOnStreetViewPanoramaCameraChangeListener);

    void setOnStreetViewPanoramaChangeListener(IOnStreetViewPanoramaChangeListener iOnStreetViewPanoramaChangeListener);

    void setOnStreetViewPanoramaClickListener(IOnStreetViewPanoramaClickListener iOnStreetViewPanoramaClickListener);

    void setOnStreetViewPanoramaLongClickListener(IOnStreetViewPanoramaLongClickListener iOnStreetViewPanoramaLongClickListener);

    void setPosition(LatLng latLng);

    void setPositionWithID(String str);

    void setPositionWithRadius(LatLng latLng, int i);

    void setPositionWithRadiusAndSource(LatLng latLng, int i, StreetViewSource streetViewSource);

    void setPositionWithSource(LatLng latLng, StreetViewSource streetViewSource);
}
