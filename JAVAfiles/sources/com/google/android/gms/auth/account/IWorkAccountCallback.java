package com.google.android.gms.auth.account;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IWorkAccountCallback extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IWorkAccountCallback {
        static final int TRANSACTION_onAccountAdded = 1;
        static final int TRANSACTION_onAccountRemoved = 2;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IWorkAccountCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.account.IWorkAccountCallback");
            }

            @Override // com.google.android.gms.auth.account.IWorkAccountCallback
            public void onAccountAdded(Account account) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, account);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.account.IWorkAccountCallback
            public void onAccountRemoved(boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = iax.a;
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.account.IWorkAccountCallback");
        }

        public static IWorkAccountCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.IWorkAccountCallback");
            if (queryLocalInterface instanceof IWorkAccountCallback) {
                return (IWorkAccountCallback) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i != 2) {
                    return false;
                }
                boolean g = iax.g(parcel);
                enforceNoDataAvail(parcel);
                onAccountRemoved(g);
            } else {
                Account account = (Account) iax.a(parcel, Account.CREATOR);
                enforceNoDataAvail(parcel);
                onAccountAdded(account);
            }
            return true;
        }
    }

    void onAccountAdded(Account account);

    void onAccountRemoved(boolean z);
}
