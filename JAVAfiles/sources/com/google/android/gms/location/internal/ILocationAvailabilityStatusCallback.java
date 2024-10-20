package com.google.android.gms.location.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationAvailability;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ILocationAvailabilityStatusCallback extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements ILocationAvailabilityStatusCallback {
        static final int TRANSACTION_onResult = 1;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements ILocationAvailabilityStatusCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.location.internal.ILocationAvailabilityStatusCallback");
            }

            @Override // com.google.android.gms.location.internal.ILocationAvailabilityStatusCallback
            public void onResult(Status status, LocationAvailability locationAvailability) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                iax.d(obtainAndWriteInterfaceToken, locationAvailability);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.location.internal.ILocationAvailabilityStatusCallback");
        }

        public static ILocationAvailabilityStatusCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.ILocationAvailabilityStatusCallback");
            if (queryLocalInterface instanceof ILocationAvailabilityStatusCallback) {
                return (ILocationAvailabilityStatusCallback) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                Status status = (Status) iax.a(parcel, Status.CREATOR);
                LocationAvailability locationAvailability = (LocationAvailability) iax.a(parcel, LocationAvailability.CREATOR);
                enforceNoDataAvail(parcel);
                onResult(status, locationAvailability);
                return true;
            }
            return false;
        }
    }

    void onResult(Status status, LocationAvailability locationAvailability);
}
