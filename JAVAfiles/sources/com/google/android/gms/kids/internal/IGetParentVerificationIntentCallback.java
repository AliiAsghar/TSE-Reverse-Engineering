package com.google.android.gms.kids.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.kids.GetParentVerificationIntentResponse;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IGetParentVerificationIntentCallback extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IGetParentVerificationIntentCallback {
        static final int TRANSACTION_onResponse = 1;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IGetParentVerificationIntentCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.kids.internal.IGetParentVerificationIntentCallback");
            }

            @Override // com.google.android.gms.kids.internal.IGetParentVerificationIntentCallback
            public void onResponse(Status status, GetParentVerificationIntentResponse getParentVerificationIntentResponse) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                iax.d(obtainAndWriteInterfaceToken, getParentVerificationIntentResponse);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.kids.internal.IGetParentVerificationIntentCallback");
        }

        public static IGetParentVerificationIntentCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.kids.internal.IGetParentVerificationIntentCallback");
            if (queryLocalInterface instanceof IGetParentVerificationIntentCallback) {
                return (IGetParentVerificationIntentCallback) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                Status status = (Status) iax.a(parcel, Status.CREATOR);
                GetParentVerificationIntentResponse getParentVerificationIntentResponse = (GetParentVerificationIntentResponse) iax.a(parcel, GetParentVerificationIntentResponse.CREATOR);
                enforceNoDataAvail(parcel);
                onResponse(status, getParentVerificationIntentResponse);
                return true;
            }
            return false;
        }
    }

    void onResponse(Status status, GetParentVerificationIntentResponse getParentVerificationIntentResponse);
}
