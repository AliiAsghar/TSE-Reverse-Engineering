package com.google.android.gms.auth.account.data;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.GetHubTokenInternalResponse;
import com.google.android.gms.common.api.Status;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IGetHubTokenCallback extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IGetHubTokenCallback {
        static final int TRANSACTION_onResponse = 2;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IGetHubTokenCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.account.data.IGetHubTokenCallback");
            }

            @Override // com.google.android.gms.auth.account.data.IGetHubTokenCallback
            public void onResponse(Status status, GetHubTokenInternalResponse getHubTokenInternalResponse) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                iax.d(obtainAndWriteInterfaceToken, getHubTokenInternalResponse);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.account.data.IGetHubTokenCallback");
        }

        public static IGetHubTokenCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.data.IGetHubTokenCallback");
            if (queryLocalInterface instanceof IGetHubTokenCallback) {
                return (IGetHubTokenCallback) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                Status status = (Status) iax.a(parcel, Status.CREATOR);
                GetHubTokenInternalResponse getHubTokenInternalResponse = (GetHubTokenInternalResponse) iax.a(parcel, GetHubTokenInternalResponse.CREATOR);
                enforceNoDataAvail(parcel);
                onResponse(status, getHubTokenInternalResponse);
                return true;
            }
            return false;
        }
    }

    void onResponse(Status status, GetHubTokenInternalResponse getHubTokenInternalResponse);
}
