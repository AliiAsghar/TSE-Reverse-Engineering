package com.google.android.gms.auth.account.data;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import defpackage.iax;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IGetAccountsCallback extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IGetAccountsCallback {
        static final int TRANSACTION_onResponse = 2;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IGetAccountsCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.account.data.IGetAccountsCallback");
            }

            @Override // com.google.android.gms.auth.account.data.IGetAccountsCallback
            public void onResponse(Status status, List<Account> list) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                obtainAndWriteInterfaceToken.writeTypedList(list);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.account.data.IGetAccountsCallback");
        }

        public static IGetAccountsCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.data.IGetAccountsCallback");
            if (queryLocalInterface instanceof IGetAccountsCallback) {
                return (IGetAccountsCallback) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                Status status = (Status) iax.a(parcel, Status.CREATOR);
                ArrayList createTypedArrayList = parcel.createTypedArrayList(Account.CREATOR);
                enforceNoDataAvail(parcel);
                onResponse(status, createTypedArrayList);
                return true;
            }
            return false;
        }
    }

    void onResponse(Status status, List<Account> list);
}
