package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.maps.model.internal.IMapCapabilitiesDelegate;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IOnMapCapabilitiesChangedListener extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IOnMapCapabilitiesChangedListener {
        static final int TRANSACTION_onMapCapabilitiesChanged = 1;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IOnMapCapabilitiesChangedListener {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.internal.IOnMapCapabilitiesChangedListener");
            }

            @Override // com.google.android.gms.maps.internal.IOnMapCapabilitiesChangedListener
            public void onMapCapabilitiesChanged(IMapCapabilitiesDelegate iMapCapabilitiesDelegate) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iMapCapabilitiesDelegate);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.internal.IOnMapCapabilitiesChangedListener");
        }

        public static IOnMapCapabilitiesChangedListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnMapCapabilitiesChangedListener");
            if (queryLocalInterface instanceof IOnMapCapabilitiesChangedListener) {
                return (IOnMapCapabilitiesChangedListener) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                IMapCapabilitiesDelegate asInterface = IMapCapabilitiesDelegate.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                onMapCapabilitiesChanged(asInterface);
                parcel2.writeNoException();
                return true;
            }
            return false;
        }
    }

    void onMapCapabilitiesChanged(IMapCapabilitiesDelegate iMapCapabilitiesDelegate);
}
