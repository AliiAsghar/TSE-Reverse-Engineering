package com.google.android.gms.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ILocationCallback extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements ILocationCallback {
        static final int TRANSACTION_onLocationAvailability = 2;
        static final int TRANSACTION_onLocationResult = 1;
        static final int TRANSACTION_onRemoved = 3;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements ILocationCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.location.ILocationCallback");
            }

            @Override // com.google.android.gms.location.ILocationCallback
            public void onLocationAvailability(LocationAvailability locationAvailability) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, locationAvailability);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.ILocationCallback
            public void onLocationResult(LocationResult locationResult) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, locationResult);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.ILocationCallback
            public void onRemoved() {
                transactOneway(3, obtainAndWriteInterfaceToken());
            }
        }

        public Stub() {
            super("com.google.android.gms.location.ILocationCallback");
        }

        public static ILocationCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
            if (queryLocalInterface instanceof ILocationCallback) {
                return (ILocationCallback) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return false;
                    }
                    onRemoved();
                } else {
                    LocationAvailability locationAvailability = (LocationAvailability) iax.a(parcel, LocationAvailability.CREATOR);
                    enforceNoDataAvail(parcel);
                    onLocationAvailability(locationAvailability);
                }
            } else {
                LocationResult locationResult = (LocationResult) iax.a(parcel, LocationResult.CREATOR);
                enforceNoDataAvail(parcel);
                onLocationResult(locationResult);
            }
            return true;
        }
    }

    void onLocationAvailability(LocationAvailability locationAvailability);

    void onLocationResult(LocationResult locationResult);

    void onRemoved();
}
