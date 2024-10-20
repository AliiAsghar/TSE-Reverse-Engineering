package com.google.android.gms.auth.account.data;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.AccountChangeEventsResponse;
import com.google.android.gms.common.api.Status;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IGetAccountChangeEventsCallback extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IGetAccountChangeEventsCallback {
        static final int TRANSACTION_onResponse = 2;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IGetAccountChangeEventsCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.account.data.IGetAccountChangeEventsCallback");
            }

            @Override // com.google.android.gms.auth.account.data.IGetAccountChangeEventsCallback
            public void onResponse(Status status, AccountChangeEventsResponse accountChangeEventsResponse) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                iax.d(obtainAndWriteInterfaceToken, accountChangeEventsResponse);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.account.data.IGetAccountChangeEventsCallback");
        }

        public static IGetAccountChangeEventsCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.data.IGetAccountChangeEventsCallback");
            if (queryLocalInterface instanceof IGetAccountChangeEventsCallback) {
                return (IGetAccountChangeEventsCallback) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                Status status = (Status) iax.a(parcel, Status.CREATOR);
                AccountChangeEventsResponse accountChangeEventsResponse = (AccountChangeEventsResponse) iax.a(parcel, AccountChangeEventsResponse.CREATOR);
                enforceNoDataAvail(parcel);
                onResponse(status, accountChangeEventsResponse);
                return true;
            }
            return false;
        }
    }

    void onResponse(Status status, AccountChangeEventsResponse accountChangeEventsResponse);
}
