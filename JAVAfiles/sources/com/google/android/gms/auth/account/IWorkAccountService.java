package com.google.android.gms.auth.account;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.account.IWorkAccountCallback;
import com.google.android.gms.auth.account.internal.IBooleanResultCallback;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IWorkAccountService extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IWorkAccountService {
        static final int TRANSACTION_addWorkAccount = 2;
        static final int TRANSACTION_clearWorkAccountAppWhitelist = 5;
        static final int TRANSACTION_initWorkAuthenticator = 6;
        static final int TRANSACTION_isPackageWhitelisted = 7;
        static final int TRANSACTION_removeWorkAccount = 3;
        static final int TRANSACTION_setWorkAccountAppWhitelistFingerprint = 4;
        static final int TRANSACTION_setWorkAuthenticatorEnabled = 1;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IWorkAccountService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.account.IWorkAccountService");
            }

            @Override // com.google.android.gms.auth.account.IWorkAccountService
            public void addWorkAccount(IWorkAccountCallback iWorkAccountCallback, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWorkAccountCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.account.IWorkAccountService
            public boolean clearWorkAccountAppWhitelist() {
                Parcel transactAndReadException = transactAndReadException(5, obtainAndWriteInterfaceToken());
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.auth.account.IWorkAccountService
            public void initWorkAuthenticator() {
                transactAndReadExceptionReturnVoid(6, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.auth.account.IWorkAccountService
            public void isPackageWhitelisted(String str, IBooleanResultCallback iBooleanResultCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                iax.f(obtainAndWriteInterfaceToken, iBooleanResultCallback);
                transactOneway(7, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.account.IWorkAccountService
            public void removeWorkAccount(IWorkAccountCallback iWorkAccountCallback, Account account) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iWorkAccountCallback);
                iax.d(obtainAndWriteInterfaceToken, account);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.account.IWorkAccountService
            public boolean setWorkAccountAppWhitelistFingerprint(String str, String str2) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                Parcel transactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken);
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.auth.account.IWorkAccountService
            public void setWorkAuthenticatorEnabled(boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = iax.a;
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.account.IWorkAccountService");
        }

        public static IWorkAccountService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.IWorkAccountService");
            if (queryLocalInterface instanceof IWorkAccountService) {
                return (IWorkAccountService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    boolean g = iax.g(parcel);
                    enforceNoDataAvail(parcel);
                    setWorkAuthenticatorEnabled(g);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    IWorkAccountCallback asInterface = IWorkAccountCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString = parcel.readString();
                    enforceNoDataAvail(parcel);
                    addWorkAccount(asInterface, readString);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    IWorkAccountCallback asInterface2 = IWorkAccountCallback.Stub.asInterface(parcel.readStrongBinder());
                    Account account = (Account) iax.a(parcel, Account.CREATOR);
                    enforceNoDataAvail(parcel);
                    removeWorkAccount(asInterface2, account);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    boolean workAccountAppWhitelistFingerprint = setWorkAccountAppWhitelistFingerprint(readString2, readString3);
                    parcel2.writeNoException();
                    int i3 = iax.a;
                    parcel2.writeInt(workAccountAppWhitelistFingerprint ? 1 : 0);
                    return true;
                case 5:
                    boolean clearWorkAccountAppWhitelist = clearWorkAccountAppWhitelist();
                    parcel2.writeNoException();
                    int i4 = iax.a;
                    parcel2.writeInt(clearWorkAccountAppWhitelist ? 1 : 0);
                    return true;
                case 6:
                    initWorkAuthenticator();
                    parcel2.writeNoException();
                    return true;
                case 7:
                    String readString4 = parcel.readString();
                    IBooleanResultCallback asInterface3 = IBooleanResultCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    isPackageWhitelisted(readString4, asInterface3);
                    return true;
                default:
                    return false;
            }
        }
    }

    void addWorkAccount(IWorkAccountCallback iWorkAccountCallback, String str);

    boolean clearWorkAccountAppWhitelist();

    void initWorkAuthenticator();

    void isPackageWhitelisted(String str, IBooleanResultCallback iBooleanResultCallback);

    void removeWorkAccount(IWorkAccountCallback iWorkAccountCallback, Account account);

    boolean setWorkAccountAppWhitelistFingerprint(String str, String str2);

    void setWorkAuthenticatorEnabled(boolean z);
}
