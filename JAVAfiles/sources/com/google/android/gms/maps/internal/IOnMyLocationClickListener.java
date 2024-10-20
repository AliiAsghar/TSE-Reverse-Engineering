package com.google.android.gms.maps.internal;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IOnMyLocationClickListener extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IOnMyLocationClickListener {
        static final int TRANSACTION_onMyLocationClick = 1;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IOnMyLocationClickListener {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.internal.IOnMyLocationClickListener");
            }

            @Override // com.google.android.gms.maps.internal.IOnMyLocationClickListener
            public void onMyLocationClick(Location location) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, location);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.internal.IOnMyLocationClickListener");
        }

        public static IOnMyLocationClickListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnMyLocationClickListener");
            if (queryLocalInterface instanceof IOnMyLocationClickListener) {
                return (IOnMyLocationClickListener) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                Location location = (Location) iax.a(parcel, Location.CREATOR);
                enforceNoDataAvail(parcel);
                onMyLocationClick(location);
                parcel2.writeNoException();
                return true;
            }
            return false;
        }
    }

    void onMyLocationClick(Location location);
}
