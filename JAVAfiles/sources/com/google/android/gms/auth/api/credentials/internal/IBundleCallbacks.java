package com.google.android.gms.auth.api.credentials.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IBundleCallbacks extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IBundleCallbacks {
        static final int TRANSACTION_onResult = 1;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IBundleCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.api.credentials.internal.IBundleCallbacks");
            }

            @Override // com.google.android.gms.auth.api.credentials.internal.IBundleCallbacks
            public void onResult(Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, bundle);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.api.credentials.internal.IBundleCallbacks");
        }

        public static IBundleCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.IBundleCallbacks");
            if (queryLocalInterface instanceof IBundleCallbacks) {
                return (IBundleCallbacks) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                Bundle bundle = (Bundle) iax.a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                onResult(bundle);
                return true;
            }
            return false;
        }
    }

    void onResult(Bundle bundle);
}
