package com.google.android.gms.spatula.settings.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.spatula.settings.SpatulaAvailability;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ISpatulaAvailabilityCallbacks extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements ISpatulaAvailabilityCallbacks {
        static final int TRANSACTION_onGetSpatulaAvailability = 1;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements ISpatulaAvailabilityCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.spatula.settings.internal.ISpatulaAvailabilityCallbacks");
            }

            @Override // com.google.android.gms.spatula.settings.internal.ISpatulaAvailabilityCallbacks
            public void onGetSpatulaAvailability(Status status, SpatulaAvailability spatulaAvailability) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                iax.d(obtainAndWriteInterfaceToken, spatulaAvailability);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.spatula.settings.internal.ISpatulaAvailabilityCallbacks");
        }

        public static ISpatulaAvailabilityCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.spatula.settings.internal.ISpatulaAvailabilityCallbacks");
            if (queryLocalInterface instanceof ISpatulaAvailabilityCallbacks) {
                return (ISpatulaAvailabilityCallbacks) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                Status status = (Status) iax.a(parcel, Status.CREATOR);
                SpatulaAvailability spatulaAvailability = (SpatulaAvailability) iax.a(parcel, SpatulaAvailability.CREATOR);
                enforceNoDataAvail(parcel);
                onGetSpatulaAvailability(status, spatulaAvailability);
                return true;
            }
            return false;
        }
    }

    void onGetSpatulaAvailability(Status status, SpatulaAvailability spatulaAvailability);
}
