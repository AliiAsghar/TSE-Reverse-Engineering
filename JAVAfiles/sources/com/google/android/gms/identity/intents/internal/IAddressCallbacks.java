package com.google.android.gms.identity.intents.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IAddressCallbacks extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IAddressCallbacks {
        static final int TRANSACTION_onRequestUserAddressIntentReceived = 2;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IAddressCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.identity.intents.internal.IAddressCallbacks");
            }

            @Override // com.google.android.gms.identity.intents.internal.IAddressCallbacks
            public void onRequestUserAddressIntentReceived(int i, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                iax.d(obtainAndWriteInterfaceToken, bundle);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.identity.intents.internal.IAddressCallbacks");
        }

        public static IAddressCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.identity.intents.internal.IAddressCallbacks");
            if (queryLocalInterface instanceof IAddressCallbacks) {
                return (IAddressCallbacks) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                int readInt = parcel.readInt();
                Bundle bundle = (Bundle) iax.a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                onRequestUserAddressIntentReceived(readInt, bundle);
                parcel2.writeNoException();
                return true;
            }
            return false;
        }
    }

    void onRequestUserAddressIntentReceived(int i, Bundle bundle);
}
