package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.StreetViewPanoramaOptions;
import com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate;
import com.google.android.gms.maps.internal.IMapFragmentDelegate;
import com.google.android.gms.maps.internal.IMapViewDelegate;
import com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate;
import com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate;
import com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ICreator extends IInterface {
    public static final int RENDERER_TYPE_LATEST = 2;
    public static final int RENDERER_TYPE_LEGACY = 1;
    public static final int RENDERER_TYPE_UNKNOWN = 0;

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements ICreator {
        static final int TRANSACTION_getRendererType = 9;
        static final int TRANSACTION_init = 1;
        static final int TRANSACTION_initV2 = 6;
        static final int TRANSACTION_logInitialization = 10;
        static final int TRANSACTION_newBitmapDescriptorFactoryDelegate = 5;
        static final int TRANSACTION_newCameraUpdateFactoryDelegate = 4;
        static final int TRANSACTION_newMapFragmentDelegate = 2;
        static final int TRANSACTION_newMapViewDelegate = 3;
        static final int TRANSACTION_newStreetViewPanoramaFragmentDelegate = 8;
        static final int TRANSACTION_newStreetViewPanoramaViewDelegate = 7;
        static final int TRANSACTION_preInit = 11;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements ICreator {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.internal.ICreator");
            }

            @Override // com.google.android.gms.maps.internal.ICreator
            public int getRendererType() {
                Parcel transactAndReadException = transactAndReadException(9, obtainAndWriteInterfaceToken());
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.gms.maps.internal.ICreator
            public void init(IObjectWrapper iObjectWrapper) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iObjectWrapper);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.ICreator
            public void initV2(IObjectWrapper iObjectWrapper, int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iObjectWrapper);
                obtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(6, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.ICreator
            public void logInitialization(IObjectWrapper iObjectWrapper, int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iObjectWrapper);
                obtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(10, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.ICreator
            public IBitmapDescriptorFactoryDelegate newBitmapDescriptorFactoryDelegate() {
                Parcel transactAndReadException = transactAndReadException(5, obtainAndWriteInterfaceToken());
                IBitmapDescriptorFactoryDelegate asInterface = IBitmapDescriptorFactoryDelegate.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.maps.internal.ICreator
            public ICameraUpdateFactoryDelegate newCameraUpdateFactoryDelegate() {
                Parcel transactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken());
                ICameraUpdateFactoryDelegate asInterface = ICameraUpdateFactoryDelegate.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.maps.internal.ICreator
            public IMapFragmentDelegate newMapFragmentDelegate(IObjectWrapper iObjectWrapper) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iObjectWrapper);
                Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken);
                IMapFragmentDelegate asInterface = IMapFragmentDelegate.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.maps.internal.ICreator
            public IMapViewDelegate newMapViewDelegate(IObjectWrapper iObjectWrapper, GoogleMapOptions googleMapOptions) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iObjectWrapper);
                iax.d(obtainAndWriteInterfaceToken, googleMapOptions);
                Parcel transactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken);
                IMapViewDelegate asInterface = IMapViewDelegate.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.maps.internal.ICreator
            public IStreetViewPanoramaFragmentDelegate newStreetViewPanoramaFragmentDelegate(IObjectWrapper iObjectWrapper) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iObjectWrapper);
                Parcel transactAndReadException = transactAndReadException(8, obtainAndWriteInterfaceToken);
                IStreetViewPanoramaFragmentDelegate asInterface = IStreetViewPanoramaFragmentDelegate.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.maps.internal.ICreator
            public IStreetViewPanoramaViewDelegate newStreetViewPanoramaViewDelegate(IObjectWrapper iObjectWrapper, StreetViewPanoramaOptions streetViewPanoramaOptions) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iObjectWrapper);
                iax.d(obtainAndWriteInterfaceToken, streetViewPanoramaOptions);
                Parcel transactAndReadException = transactAndReadException(7, obtainAndWriteInterfaceToken);
                IStreetViewPanoramaViewDelegate asInterface = IStreetViewPanoramaViewDelegate.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.maps.internal.ICreator
            public void preInit(IObjectWrapper iObjectWrapper) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iObjectWrapper);
                transactAndReadExceptionReturnVoid(11, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.internal.ICreator");
        }

        public static ICreator asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
            if (queryLocalInterface instanceof ICreator) {
                return (ICreator) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    init(asInterface);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    IMapFragmentDelegate newMapFragmentDelegate = newMapFragmentDelegate(asInterface2);
                    parcel2.writeNoException();
                    iax.f(parcel2, newMapFragmentDelegate);
                    return true;
                case 3:
                    IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    GoogleMapOptions googleMapOptions = (GoogleMapOptions) iax.a(parcel, GoogleMapOptions.CREATOR);
                    enforceNoDataAvail(parcel);
                    IMapViewDelegate newMapViewDelegate = newMapViewDelegate(asInterface3, googleMapOptions);
                    parcel2.writeNoException();
                    iax.f(parcel2, newMapViewDelegate);
                    return true;
                case 4:
                    ICameraUpdateFactoryDelegate newCameraUpdateFactoryDelegate = newCameraUpdateFactoryDelegate();
                    parcel2.writeNoException();
                    iax.f(parcel2, newCameraUpdateFactoryDelegate);
                    return true;
                case 5:
                    IBitmapDescriptorFactoryDelegate newBitmapDescriptorFactoryDelegate = newBitmapDescriptorFactoryDelegate();
                    parcel2.writeNoException();
                    iax.f(parcel2, newBitmapDescriptorFactoryDelegate);
                    return true;
                case 6:
                    IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    int readInt = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    initV2(asInterface4, readInt);
                    parcel2.writeNoException();
                    return true;
                case 7:
                    IObjectWrapper asInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    StreetViewPanoramaOptions streetViewPanoramaOptions = (StreetViewPanoramaOptions) iax.a(parcel, StreetViewPanoramaOptions.CREATOR);
                    enforceNoDataAvail(parcel);
                    IStreetViewPanoramaViewDelegate newStreetViewPanoramaViewDelegate = newStreetViewPanoramaViewDelegate(asInterface5, streetViewPanoramaOptions);
                    parcel2.writeNoException();
                    iax.f(parcel2, newStreetViewPanoramaViewDelegate);
                    return true;
                case 8:
                    IObjectWrapper asInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    IStreetViewPanoramaFragmentDelegate newStreetViewPanoramaFragmentDelegate = newStreetViewPanoramaFragmentDelegate(asInterface6);
                    parcel2.writeNoException();
                    iax.f(parcel2, newStreetViewPanoramaFragmentDelegate);
                    return true;
                case 9:
                    int rendererType = getRendererType();
                    parcel2.writeNoException();
                    parcel2.writeInt(rendererType);
                    return true;
                case 10:
                    IObjectWrapper asInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    int readInt2 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    logInitialization(asInterface7, readInt2);
                    parcel2.writeNoException();
                    return true;
                case 11:
                    IObjectWrapper asInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    preInit(asInterface8);
                    parcel2.writeNoException();
                    return true;
                default:
                    return false;
            }
        }
    }

    int getRendererType();

    void init(IObjectWrapper iObjectWrapper);

    void initV2(IObjectWrapper iObjectWrapper, int i);

    void logInitialization(IObjectWrapper iObjectWrapper, int i);

    IBitmapDescriptorFactoryDelegate newBitmapDescriptorFactoryDelegate();

    ICameraUpdateFactoryDelegate newCameraUpdateFactoryDelegate();

    IMapFragmentDelegate newMapFragmentDelegate(IObjectWrapper iObjectWrapper);

    IMapViewDelegate newMapViewDelegate(IObjectWrapper iObjectWrapper, GoogleMapOptions googleMapOptions);

    IStreetViewPanoramaFragmentDelegate newStreetViewPanoramaFragmentDelegate(IObjectWrapper iObjectWrapper);

    IStreetViewPanoramaViewDelegate newStreetViewPanoramaViewDelegate(IObjectWrapper iObjectWrapper, StreetViewPanoramaOptions streetViewPanoramaOptions);

    void preInit(IObjectWrapper iObjectWrapper);
}
