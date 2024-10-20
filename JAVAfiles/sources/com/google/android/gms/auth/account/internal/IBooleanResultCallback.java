package com.google.android.gms.auth.account.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IBooleanResultCallback extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IBooleanResultCallback {
        static final int TRANSACTION_onResult = 2;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IBooleanResultCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.account.internal.IBooleanResultCallback");
            }

            @Override // com.google.android.gms.auth.account.internal.IBooleanResultCallback
            public void onResult(int i, boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                int i2 = iax.a;
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.account.internal.IBooleanResultCallback");
        }

        public static IBooleanResultCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.internal.IBooleanResultCallback");
            if (queryLocalInterface instanceof IBooleanResultCallback) {
                return (IBooleanResultCallback) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                int readInt = parcel.readInt();
                boolean g = iax.g(parcel);
                enforceNoDataAvail(parcel);
                onResult(readInt, g);
                return true;
            }
            return false;
        }
    }

    void onResult(int i, boolean z);
}
