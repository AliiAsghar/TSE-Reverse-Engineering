package com.google.android.gms.auth.api.identity.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.api.identity.CompleteSignInResult;
import com.google.android.gms.common.api.Status;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ICompleteSignInCallback extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements ICompleteSignInCallback {
        static final int TRANSACTION_onResult = 1;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements ICompleteSignInCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.api.identity.internal.ICompleteSignInCallback");
            }

            @Override // com.google.android.gms.auth.api.identity.internal.ICompleteSignInCallback
            public void onResult(Status status, CompleteSignInResult completeSignInResult) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                iax.d(obtainAndWriteInterfaceToken, completeSignInResult);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.api.identity.internal.ICompleteSignInCallback");
        }

        public static ICompleteSignInCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ICompleteSignInCallback");
            if (queryLocalInterface instanceof ICompleteSignInCallback) {
                return (ICompleteSignInCallback) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                Status status = (Status) iax.a(parcel, Status.CREATOR);
                CompleteSignInResult completeSignInResult = (CompleteSignInResult) iax.a(parcel, CompleteSignInResult.CREATOR);
                enforceNoDataAvail(parcel);
                onResult(status, completeSignInResult);
                return true;
            }
            return false;
        }
    }

    void onResult(Status status, CompleteSignInResult completeSignInResult);
}
