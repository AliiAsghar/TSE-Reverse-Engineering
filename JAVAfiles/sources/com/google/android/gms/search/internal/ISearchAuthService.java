package com.google.android.gms.search.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.search.internal.ISearchAuthCallbacks;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ISearchAuthService extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements ISearchAuthService {
        static final int TRANSACTION_clearToken = 2;
        static final int TRANSACTION_getGoogleNowAuth = 1;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements ISearchAuthService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.search.internal.ISearchAuthService");
            }

            @Override // com.google.android.gms.search.internal.ISearchAuthService
            public void clearToken(ISearchAuthCallbacks iSearchAuthCallbacks, String str, String str2) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iSearchAuthCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.internal.ISearchAuthService
            public void getGoogleNowAuth(ISearchAuthCallbacks iSearchAuthCallbacks, String str, String str2) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iSearchAuthCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.search.internal.ISearchAuthService");
        }

        public static ISearchAuthService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.search.internal.ISearchAuthService");
            if (queryLocalInterface instanceof ISearchAuthService) {
                return (ISearchAuthService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i != 2) {
                    return false;
                }
                ISearchAuthCallbacks asInterface = ISearchAuthCallbacks.Stub.asInterface(parcel.readStrongBinder());
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                enforceNoDataAvail(parcel);
                clearToken(asInterface, readString, readString2);
            } else {
                ISearchAuthCallbacks asInterface2 = ISearchAuthCallbacks.Stub.asInterface(parcel.readStrongBinder());
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                enforceNoDataAvail(parcel);
                getGoogleNowAuth(asInterface2, readString3, readString4);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void clearToken(ISearchAuthCallbacks iSearchAuthCallbacks, String str, String str2);

    void getGoogleNowAuth(ISearchAuthCallbacks iSearchAuthCallbacks, String str, String str2);
}
