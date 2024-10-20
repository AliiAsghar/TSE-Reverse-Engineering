package com.google.android.gms.identity.accounts.service;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.identity.accounts.api.AccountData;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IAccountDataCallbacks extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IAccountDataCallbacks {
        static final int TRANSACTION_onAccountDataDecrypted = 2;
        static final int TRANSACTION_onAccountDataEncrypted = 1;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IAccountDataCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.identity.accounts.service.IAccountDataCallbacks");
            }

            @Override // com.google.android.gms.identity.accounts.service.IAccountDataCallbacks
            public void onAccountDataDecrypted(AccountData accountData) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, accountData);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.identity.accounts.service.IAccountDataCallbacks
            public void onAccountDataEncrypted(byte[] bArr) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeByteArray(bArr);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.identity.accounts.service.IAccountDataCallbacks");
        }

        public static IAccountDataCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.identity.accounts.service.IAccountDataCallbacks");
            if (queryLocalInterface instanceof IAccountDataCallbacks) {
                return (IAccountDataCallbacks) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i != 2) {
                    return false;
                }
                AccountData accountData = (AccountData) iax.a(parcel, AccountData.CREATOR);
                enforceNoDataAvail(parcel);
                onAccountDataDecrypted(accountData);
            } else {
                byte[] createByteArray = parcel.createByteArray();
                enforceNoDataAvail(parcel);
                onAccountDataEncrypted(createByteArray);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void onAccountDataDecrypted(AccountData accountData);

    void onAccountDataEncrypted(byte[] bArr);
}
