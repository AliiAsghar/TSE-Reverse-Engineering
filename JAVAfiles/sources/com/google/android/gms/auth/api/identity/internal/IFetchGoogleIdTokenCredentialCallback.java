package com.google.android.gms.auth.api.identity.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.api.identity.InternalSignInCredentialWrapper;
import com.google.android.gms.common.api.Status;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IFetchGoogleIdTokenCredentialCallback extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IFetchGoogleIdTokenCredentialCallback {
        static final int TRANSACTION_onResult = 1;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IFetchGoogleIdTokenCredentialCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.api.identity.internal.IFetchGoogleIdTokenCredentialCallback");
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IFetchGoogleIdTokenCredentialCallback
            public void onResult(Status status, InternalSignInCredentialWrapper internalSignInCredentialWrapper) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                iax.d(obtainAndWriteInterfaceToken, internalSignInCredentialWrapper);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.api.identity.internal.IFetchGoogleIdTokenCredentialCallback");
        }

        public static IFetchGoogleIdTokenCredentialCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.IFetchGoogleIdTokenCredentialCallback");
            if (queryLocalInterface instanceof IFetchGoogleIdTokenCredentialCallback) {
                return (IFetchGoogleIdTokenCredentialCallback) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                Status status = (Status) iax.a(parcel, Status.CREATOR);
                InternalSignInCredentialWrapper internalSignInCredentialWrapper = (InternalSignInCredentialWrapper) iax.a(parcel, InternalSignInCredentialWrapper.CREATOR);
                enforceNoDataAvail(parcel);
                onResult(status, internalSignInCredentialWrapper);
                return true;
            }
            return false;
        }
    }

    void onResult(Status status, InternalSignInCredentialWrapper internalSignInCredentialWrapper);
}
