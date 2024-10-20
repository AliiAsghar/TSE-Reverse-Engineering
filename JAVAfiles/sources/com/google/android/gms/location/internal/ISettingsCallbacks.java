package com.google.android.gms.location.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.location.LocationSettingsResult;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ISettingsCallbacks extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements ISettingsCallbacks {
        static final int TRANSACTION_onCheckLocationSettingsResult = 1;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements ISettingsCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.location.internal.ISettingsCallbacks");
            }

            @Override // com.google.android.gms.location.internal.ISettingsCallbacks
            public void onCheckLocationSettingsResult(LocationSettingsResult locationSettingsResult) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, locationSettingsResult);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.location.internal.ISettingsCallbacks");
        }

        public static ISettingsCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.ISettingsCallbacks");
            if (queryLocalInterface instanceof ISettingsCallbacks) {
                return (ISettingsCallbacks) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                LocationSettingsResult locationSettingsResult = (LocationSettingsResult) iax.a(parcel, LocationSettingsResult.CREATOR);
                enforceNoDataAvail(parcel);
                onCheckLocationSettingsResult(locationSettingsResult);
                return true;
            }
            return false;
        }
    }

    void onCheckLocationSettingsResult(LocationSettingsResult locationSettingsResult);
}
