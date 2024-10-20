package com.google.android.gms.auth.api.fido.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IPendingIntentCallback extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IPendingIntentCallback {
        static final int TRANSACTION_onResult = 1;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IPendingIntentCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.api.fido.internal.IPendingIntentCallback");
            }

            @Override // com.google.android.gms.auth.api.fido.internal.IPendingIntentCallback
            public void onResult(Status status, PendingIntent pendingIntent) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                iax.d(obtainAndWriteInterfaceToken, pendingIntent);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.api.fido.internal.IPendingIntentCallback");
        }

        public static IPendingIntentCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.fido.internal.IPendingIntentCallback");
            if (queryLocalInterface instanceof IPendingIntentCallback) {
                return (IPendingIntentCallback) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                Status status = (Status) iax.a(parcel, Status.CREATOR);
                PendingIntent pendingIntent = (PendingIntent) iax.a(parcel, PendingIntent.CREATOR);
                enforceNoDataAvail(parcel);
                onResult(status, pendingIntent);
                return true;
            }
            return false;
        }
    }

    void onResult(Status status, PendingIntent pendingIntent);
}
