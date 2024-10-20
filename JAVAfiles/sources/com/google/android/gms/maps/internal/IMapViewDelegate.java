package com.google.android.gms.maps.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.IOnMapReadyCallback;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IMapViewDelegate extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IMapViewDelegate {
        static final int TRANSACTION_getMap = 1;
        static final int TRANSACTION_getMapAsync = 9;
        static final int TRANSACTION_getView = 8;
        static final int TRANSACTION_onCreate = 2;
        static final int TRANSACTION_onDestroy = 5;
        static final int TRANSACTION_onEnterAmbient = 10;
        static final int TRANSACTION_onExitAmbient = 11;
        static final int TRANSACTION_onLowMemory = 6;
        static final int TRANSACTION_onPause = 4;
        static final int TRANSACTION_onResume = 3;
        static final int TRANSACTION_onSaveInstanceState = 7;
        static final int TRANSACTION_onStart = 12;
        static final int TRANSACTION_onStop = 13;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IMapViewDelegate {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.internal.IMapViewDelegate");
            }

            @Override // com.google.android.gms.maps.internal.IMapViewDelegate
            public IGoogleMapDelegate getMap() {
                Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken());
                IGoogleMapDelegate asInterface = IGoogleMapDelegate.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.maps.internal.IMapViewDelegate
            public void getMapAsync(IOnMapReadyCallback iOnMapReadyCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iOnMapReadyCallback);
                transactAndReadExceptionReturnVoid(9, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IMapViewDelegate
            public IObjectWrapper getView() {
                Parcel transactAndReadException = transactAndReadException(8, obtainAndWriteInterfaceToken());
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.maps.internal.IMapViewDelegate
            public void onCreate(Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, bundle);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IMapViewDelegate
            public void onDestroy() {
                transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.maps.internal.IMapViewDelegate
            public void onEnterAmbient(Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, bundle);
                transactAndReadExceptionReturnVoid(10, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IMapViewDelegate
            public void onExitAmbient() {
                transactAndReadExceptionReturnVoid(11, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.maps.internal.IMapViewDelegate
            public void onLowMemory() {
                transactAndReadExceptionReturnVoid(6, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.maps.internal.IMapViewDelegate
            public void onPause() {
                transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.maps.internal.IMapViewDelegate
            public void onResume() {
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.maps.internal.IMapViewDelegate
            public void onSaveInstanceState(Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, bundle);
                Parcel transactAndReadException = transactAndReadException(7, obtainAndWriteInterfaceToken);
                if (transactAndReadException.readInt() != 0) {
                    bundle.readFromParcel(transactAndReadException);
                }
                transactAndReadException.recycle();
            }

            @Override // com.google.android.gms.maps.internal.IMapViewDelegate
            public void onStart() {
                transactAndReadExceptionReturnVoid(12, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.maps.internal.IMapViewDelegate
            public void onStop() {
                transactAndReadExceptionReturnVoid(13, obtainAndWriteInterfaceToken());
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.internal.IMapViewDelegate");
        }

        public static IMapViewDelegate asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            if (queryLocalInterface instanceof IMapViewDelegate) {
                return (IMapViewDelegate) queryLocalInterface;
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
                    Bundle bundle = (Bundle) iax.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    onCreate(bundle);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    onResume();
                    parcel2.writeNoException();
                    return true;
                case 4:
                    onPause();
                    parcel2.writeNoException();
                    return true;
                case 5:
                    onDestroy();
                    parcel2.writeNoException();
                    return true;
                case 6:
                    onLowMemory();
                    parcel2.writeNoException();
                    return true;
                case 7:
                    Bundle bundle2 = (Bundle) iax.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    onSaveInstanceState(bundle2);
                    parcel2.writeNoException();
                    iax.e(parcel2, bundle2);
                    return true;
                case 8:
                    IObjectWrapper view = getView();
                    parcel2.writeNoException();
                    iax.f(parcel2, view);
                    return true;
                case 9:
                    IOnMapReadyCallback asInterface = IOnMapReadyCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getMapAsync(asInterface);
                    parcel2.writeNoException();
                    return true;
                case 10:
                    Bundle bundle3 = (Bundle) iax.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    onEnterAmbient(bundle3);
                    parcel2.writeNoException();
                    return true;
                case 11:
                    onExitAmbient();
                    parcel2.writeNoException();
                    return true;
                case 12:
                    onStart();
                    parcel2.writeNoException();
                    return true;
                case 13:
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

    IObjectWrapper getView();

    void onCreate(Bundle bundle);

    void onDestroy();

    void onEnterAmbient(Bundle bundle);

    void onExitAmbient();

    void onLowMemory();

    void onPause();

    void onResume();

    void onSaveInstanceState(Bundle bundle);

    void onStart();

    void onStop();
}
