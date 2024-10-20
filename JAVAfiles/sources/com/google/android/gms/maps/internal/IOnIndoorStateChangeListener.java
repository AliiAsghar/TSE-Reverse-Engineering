package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IOnIndoorStateChangeListener extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IOnIndoorStateChangeListener {
        static final int TRANSACTION_onIndoorBuildingFocused = 1;
        static final int TRANSACTION_onIndoorLevelActivated = 2;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IOnIndoorStateChangeListener {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.internal.IOnIndoorStateChangeListener");
            }

            @Override // com.google.android.gms.maps.internal.IOnIndoorStateChangeListener
            public void onIndoorBuildingFocused() {
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.maps.internal.IOnIndoorStateChangeListener
            public void onIndoorLevelActivated(IIndoorBuildingDelegate iIndoorBuildingDelegate) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iIndoorBuildingDelegate);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.internal.IOnIndoorStateChangeListener");
        }

        public static IOnIndoorStateChangeListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnIndoorStateChangeListener");
            if (queryLocalInterface instanceof IOnIndoorStateChangeListener) {
                return (IOnIndoorStateChangeListener) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i != 2) {
                    return false;
                }
                IIndoorBuildingDelegate asInterface = IIndoorBuildingDelegate.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                onIndoorLevelActivated(asInterface);
            } else {
                onIndoorBuildingFocused();
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void onIndoorBuildingFocused();

    void onIndoorLevelActivated(IIndoorBuildingDelegate iIndoorBuildingDelegate);
}
