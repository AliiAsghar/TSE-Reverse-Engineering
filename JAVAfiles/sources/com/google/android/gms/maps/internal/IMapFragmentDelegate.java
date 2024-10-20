package com.google.android.gms.maps.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.IOnMapReadyCallback;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IMapFragmentDelegate extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IMapFragmentDelegate {
        static final int TRANSACTION_getMap = 1;
        static final int TRANSACTION_getMapAsync = 12;
        static final int TRANSACTION_isReady = 11;
        static final int TRANSACTION_onCreate = 3;
        static final int TRANSACTION_onCreateView = 4;
        static final int TRANSACTION_onDestroy = 8;
        static final int TRANSACTION_onDestroyView = 7;
        static final int TRANSACTION_onEnterAmbient = 13;
        static final int TRANSACTION_onExitAmbient = 14;
        static final int TRANSACTION_onInflate = 2;
        static final int TRANSACTION_onLowMemory = 9;
        static final int TRANSACTION_onPause = 6;
        static final int TRANSACTION_onResume = 5;
        static final int TRANSACTION_onSaveInstanceState = 10;
        static final int TRANSACTION_onStart = 15;
        static final int TRANSACTION_onStop = 16;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IMapFragmentDelegate {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.internal.IMapFragmentDelegate");
            }

            @Override // com.google.android.gms.maps.internal.IMapFragmentDelegate
            public IGoogleMapDelegate getMap() {
                Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken());
                IGoogleMapDelegate asInterface = IGoogleMapDelegate.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.maps.internal.IMapFragmentDelegate
            public void getMapAsync(IOnMapReadyCallback iOnMapReadyCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iOnMapReadyCallback);
                transactAndReadExceptionReturnVoid(12, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IMapFragmentDelegate
            public boolean isReady() {
                Parcel transactAndReadException = transactAndReadException(11, obtainAndWriteInterfaceToken());
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.maps.internal.IMapFragmentDelegate
            public void onCreate(Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, bundle);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IMapFragmentDelegate
            public IObjectWrapper onCreateView(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iObjectWrapper);
                iax.f(obtainAndWriteInterfaceToken, iObjectWrapper2);
                iax.d(obtainAndWriteInterfaceToken, bundle);
                Parcel transactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken);
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.maps.internal.IMapFragmentDelegate
            public void onDestroy() {
                transactAndReadExceptionReturnVoid(8, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.maps.internal.IMapFragmentDelegate
            public void onDestroyView() {
                transactAndReadExceptionReturnVoid(7, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.maps.internal.IMapFragmentDelegate
            public void onEnterAmbient(Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, bundle);
                transactAndReadExceptionReturnVoid(13, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IMapFragmentDelegate
            public void onExitAmbient() {
                transactAndReadExceptionReturnVoid(14, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.maps.internal.IMapFragmentDelegate
            public void onInflate(IObjectWrapper iObjectWrapper, GoogleMapOptions googleMapOptions, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iObjectWrapper);
                iax.d(obtainAndWriteInterfaceToken, googleMapOptions);
                iax.d(obtainAndWriteInterfaceToken, bundle);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IMapFragmentDelegate
            public void onLowMemory() {
                transactAndReadExceptionReturnVoid(9, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.maps.internal.IMapFragmentDelegate
            public void onPause() {
                transactAndReadExceptionReturnVoid(6, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.maps.internal.IMapFragmentDelegate
            public void onResume() {
                transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.maps.internal.IMapFragmentDelegate
            public void onSaveInstanceState(Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, bundle);
                Parcel transactAndReadException = transactAndReadException(10, obtainAndWriteInterfaceToken);
                if (transactAndReadException.readInt() != 0) {
                    bundle.readFromParcel(transactAndReadException);
                }
                transactAndReadException.recycle();
            }

            @Override // com.google.android.gms.maps.internal.IMapFragmentDelegate
            public void onStart() {
                transactAndReadExceptionReturnVoid(15, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.maps.internal.IMapFragmentDelegate
            public void onStop() {
                transactAndReadExceptionReturnVoid(16, obtainAndWriteInterfaceToken());
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.internal.IMapFragmentDelegate");
        }

        public static IMapFragmentDelegate asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
            if (queryLocalInterface instanceof IMapFragmentDelegate) {
                return (IMapFragmentDelegate) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    IGoogleMapDelegate map = getMap();
                    parcel2.writeNoException();
                    iax.f(parcel2, map);
                    return true;
                case 2:
                    IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    GoogleMapOptions googleMapOptions = (GoogleMapOptions) iax.a(parcel, GoogleMapOptions.CREATOR);
                    Bundle bundle = (Bundle) iax.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    onInflate(asInterface, googleMapOptions, bundle);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    Bundle bundle2 = (Bundle) iax.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    onCreate(bundle2);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    Bundle bundle3 = (Bundle) iax.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    IObjectWrapper onCreateView = onCreateView(asInterface2, asInterface3, bundle3);
                    parcel2.writeNoException();
                    iax.f(parcel2, onCreateView);
                    return true;
                case 5:
                    onResume();
                    parcel2.writeNoException();
                    return true;
                case 6:
                    onPause();
                    parcel2.writeNoException();
                    return true;
                case 7:
                    onDestroyView();
                    parcel2.writeNoException();
                    return true;
                case 8:
                    onDestroy();
                    parcel2.writeNoException();
                    return true;
                case 9:
                    onLowMemory();
                    parcel2.writeNoException();
                    return true;
                case 10:
                    Bundle bundle4 = (Bundle) iax.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    onSaveInstanceState(bundle4);
                    parcel2.writeNoException();
                    iax.e(parcel2, bundle4);
                    return true;
                case 11:
                    boolean isReady = isReady();
                    parcel2.writeNoException();
                    int i3 = iax.a;
                    parcel2.writeInt(isReady ? 1 : 0);
                    return true;
                case 12:
                    IOnMapReadyCallback asInterface4 = IOnMapReadyCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getMapAsync(asInterface4);
                    parcel2.writeNoException();
                    return true;
                case 13:
                    Bundle bundle5 = (Bundle) iax.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    onEnterAmbient(bundle5);
                    parcel2.writeNoException();
                    return true;
                case 14:
                    onExitAmbient();
                    parcel2.writeNoException();
                    return true;
                case 15:
                    onStart();
                    parcel2.writeNoException();
                    return true;
                case 16:
                    onStop();
                    parcel2.writeNoException();
                    return true;
                default:
                    return false;
            }
        }
    }

    IGoogleMapDelegate getMap();

    void getMapAsync(IOnMapReadyCallback iOnMapReadyCallback);

    boolean isReady();

    void onCreate(Bundle bundle);

    IObjectWrapper onCreateView(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, Bundle bundle);

    void onDestroy();

    void onDestroyView();

    void onEnterAmbient(Bundle bundle);

    void onExitAmbient();

    void onInflate(IObjectWrapper iObjectWrapper, GoogleMapOptions googleMapOptions, Bundle bundle);

    void onLowMemory();

    void onPause();

    void onResume();

    void onSaveInstanceState(Bundle bundle);

    void onStart();

    void onStop();
}
