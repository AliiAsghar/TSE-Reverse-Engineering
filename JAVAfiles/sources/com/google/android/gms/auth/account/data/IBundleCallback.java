package com.google.android.gms.auth.account.data;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IBundleCallback extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IBundleCallback {
        static final int TRANSACTION_onResponse = 2;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IBundleCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.account.data.IBundleCallback");
            }

            @Override // com.google.android.gms.auth.account.data.IBundleCallback
            public void onResponse(Status status, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                iax.d(obtainAndWriteInterfaceToken, bundle);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.account.data.IBundleCallback");
        }

        public static IBundleCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.data.IBundleCallback");
            if (queryLocalInterface instanceof IBundleCallback) {
                return (IBundleCallback) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                Status status = (Status) iax.a(parcel, Status.CREATOR);
                Bundle bundle = (Bundle) iax.a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                onResponse(status, bundle);
                return true;
            }
            return false;
        }
    }

    void onResponse(Status status, Bundle bundle);
}
