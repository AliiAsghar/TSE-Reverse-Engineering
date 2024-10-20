package com.google.android.search.verification.api;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface ISearchActionVerificationService extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public static abstract class Stub extends BaseStub implements ISearchActionVerificationService {
        static final int TRANSACTION_getVersion = 2;
        static final int TRANSACTION_isSearchAction = 1;

        /* compiled from: PG */
        /* loaded from: classes4.dex */
        public static class Proxy extends BaseProxy implements ISearchActionVerificationService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.search.verification.api.ISearchActionVerificationService");
            }

            @Override // com.google.android.search.verification.api.ISearchActionVerificationService
            public int getVersion() {
                Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken());
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.search.verification.api.ISearchActionVerificationService
            public boolean isSearchAction(Intent intent, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, intent);
                iax.d(obtainAndWriteInterfaceToken, bundle);
                Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }
        }

        public Stub() {
            super("com.google.android.search.verification.api.ISearchActionVerificationService");
        }

        public static ISearchActionVerificationService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.search.verification.api.ISearchActionVerificationService");
            if (queryLocalInterface instanceof ISearchActionVerificationService) {
                return (ISearchActionVerificationService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i != 2) {
                    return false;
                }
                int version = getVersion();
                parcel2.writeNoException();
                parcel2.writeInt(version);
            } else {
                Intent intent = (Intent) iax.a(parcel, Intent.CREATOR);
                Bundle bundle = (Bundle) iax.a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                boolean isSearchAction = isSearchAction(intent, bundle);
                parcel2.writeNoException();
                parcel2.writeInt(isSearchAction ? 1 : 0);
            }
            return true;
        }
    }

    int getVersion();

    boolean isSearchAction(Intent intent, Bundle bundle);
}
