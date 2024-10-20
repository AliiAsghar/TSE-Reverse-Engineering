package com.google.android.apps.tycho.psd.api;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IFiProductSpecificDataCallback extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IFiProductSpecificDataCallback {
        static final int TRANSACTION_onError = 2;
        static final int TRANSACTION_onSuccess = 1;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IFiProductSpecificDataCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.tycho.psd.api.IFiProductSpecificDataCallback");
            }

            @Override // com.google.android.apps.tycho.psd.api.IFiProductSpecificDataCallback
            public void onError(String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.tycho.psd.api.IFiProductSpecificDataCallback
            public void onSuccess(Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, bundle);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.apps.tycho.psd.api.IFiProductSpecificDataCallback");
        }

        public static IFiProductSpecificDataCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.tycho.psd.api.IFiProductSpecificDataCallback");
            if (queryLocalInterface instanceof IFiProductSpecificDataCallback) {
                return (IFiProductSpecificDataCallback) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i != 2) {
                    return false;
                }
                String readString = parcel.readString();
                enforceNoDataAvail(parcel);
                onError(readString);
            } else {
                Bundle bundle = (Bundle) iax.a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                onSuccess(bundle);
            }
            return true;
        }
    }

    void onError(String str);

    void onSuccess(Bundle bundle);
}
