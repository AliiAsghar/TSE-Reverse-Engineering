package com.google.android.gms.auth.account.hubmode.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.internal.IStatusCallback;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ICommunalAuthService extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements ICommunalAuthService {
        static final int TRANSACTION_addAccountToCommunalProfile = 1;
        static final int TRANSACTION_removeAccountFromCommunalProfile = 2;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements ICommunalAuthService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.account.hubmode.internal.ICommunalAuthService");
            }

            @Override // com.google.android.gms.auth.account.hubmode.internal.ICommunalAuthService
            public void addAccountToCommunalProfile(IStatusCallback iStatusCallback, Account account) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                iax.d(obtainAndWriteInterfaceToken, account);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.account.hubmode.internal.ICommunalAuthService
            public void removeAccountFromCommunalProfile(IStatusCallback iStatusCallback, Account account) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                iax.d(obtainAndWriteInterfaceToken, account);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.account.hubmode.internal.ICommunalAuthService");
        }

        public static ICommunalAuthService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.hubmode.internal.ICommunalAuthService");
            if (queryLocalInterface instanceof ICommunalAuthService) {
                return (ICommunalAuthService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i != 2) {
                    return false;
                }
                IStatusCallback asInterface = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                Account account = (Account) iax.a(parcel, Account.CREATOR);
                enforceNoDataAvail(parcel);
                removeAccountFromCommunalProfile(asInterface, account);
            } else {
                IStatusCallback asInterface2 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                Account account2 = (Account) iax.a(parcel, Account.CREATOR);
                enforceNoDataAvail(parcel);
                addAccountToCommunalProfile(asInterface2, account2);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void addAccountToCommunalProfile(IStatusCallback iStatusCallback, Account account);

    void removeAccountFromCommunalProfile(IStatusCallback iStatusCallback, Account account);
}
