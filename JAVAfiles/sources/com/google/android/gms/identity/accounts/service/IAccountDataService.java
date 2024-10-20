package com.google.android.gms.identity.accounts.service;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.identity.accounts.api.AccountData;
import com.google.android.gms.identity.accounts.service.IAccountDataCallbacks;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IAccountDataService extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IAccountDataService {
        static final int TRANSACTION_decryptAccountData = 2;
        static final int TRANSACTION_encryptAccountData = 1;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IAccountDataService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.identity.accounts.service.IAccountDataService");
            }

            @Override // com.google.android.gms.identity.accounts.service.IAccountDataService
            public void decryptAccountData(IAccountDataCallbacks iAccountDataCallbacks, byte[] bArr) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iAccountDataCallbacks);
                obtainAndWriteInterfaceToken.writeByteArray(bArr);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.identity.accounts.service.IAccountDataService
            public void encryptAccountData(IAccountDataCallbacks iAccountDataCallbacks, AccountData accountData) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iAccountDataCallbacks);
                iax.d(obtainAndWriteInterfaceToken, accountData);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.identity.accounts.service.IAccountDataService");
        }

        public static IAccountDataService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.identity.accounts.service.IAccountDataService");
            if (queryLocalInterface instanceof IAccountDataService) {
                return (IAccountDataService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i != 2) {
                    return false;
                }
                IAccountDataCallbacks asInterface = IAccountDataCallbacks.Stub.asInterface(parcel.readStrongBinder());
                byte[] createByteArray = parcel.createByteArray();
                enforceNoDataAvail(parcel);
                decryptAccountData(asInterface, createByteArray);
            } else {
                IAccountDataCallbacks asInterface2 = IAccountDataCallbacks.Stub.asInterface(parcel.readStrongBinder());
                AccountData accountData = (AccountData) iax.a(parcel, AccountData.CREATOR);
                enforceNoDataAvail(parcel);
                encryptAccountData(asInterface2, accountData);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void decryptAccountData(IAccountDataCallbacks iAccountDataCallbacks, byte[] bArr);

    void encryptAccountData(IAccountDataCallbacks iAccountDataCallbacks, AccountData accountData);
}
