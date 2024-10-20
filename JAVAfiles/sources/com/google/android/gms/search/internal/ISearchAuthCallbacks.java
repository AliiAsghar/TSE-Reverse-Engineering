package com.google.android.gms.search.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.GoogleNowAuthState;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ISearchAuthCallbacks extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements ISearchAuthCallbacks {
        static final int TRANSACTION_onClearTokenComplete = 2;
        static final int TRANSACTION_onGoogleNowAuthReceived = 1;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements ISearchAuthCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.search.internal.ISearchAuthCallbacks");
            }

            @Override // com.google.android.gms.search.internal.ISearchAuthCallbacks
            public void onClearTokenComplete(Status status) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.internal.ISearchAuthCallbacks
            public void onGoogleNowAuthReceived(Status status, GoogleNowAuthState googleNowAuthState) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                iax.d(obtainAndWriteInterfaceToken, googleNowAuthState);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.search.internal.ISearchAuthCallbacks");
        }

        public static ISearchAuthCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.search.internal.ISearchAuthCallbacks");
            if (queryLocalInterface instanceof ISearchAuthCallbacks) {
                return (ISearchAuthCallbacks) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i != 2) {
                    return false;
                }
                Status status = (Status) iax.a(parcel, Status.CREATOR);
                enforceNoDataAvail(parcel);
                onClearTokenComplete(status);
            } else {
                Status status2 = (Status) iax.a(parcel, Status.CREATOR);
                GoogleNowAuthState googleNowAuthState = (GoogleNowAuthState) iax.a(parcel, GoogleNowAuthState.CREATOR);
                enforceNoDataAvail(parcel);
                onGoogleNowAuthReceived(status2, googleNowAuthState);
            }
            return true;
        }
    }

    void onClearTokenComplete(Status status);

    void onGoogleNowAuthReceived(Status status, GoogleNowAuthState googleNowAuthState);
}
