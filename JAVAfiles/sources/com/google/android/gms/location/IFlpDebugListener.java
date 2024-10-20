package com.google.android.gms.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IFlpDebugListener extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IFlpDebugListener {
        static final int TRANSACTION_onEvent = 1;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IFlpDebugListener {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.location.IFlpDebugListener");
            }

            @Override // com.google.android.gms.location.IFlpDebugListener
            public void onEvent(byte[] bArr) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeByteArray(bArr);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.location.IFlpDebugListener");
        }

        public static IFlpDebugListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.IFlpDebugListener");
            if (queryLocalInterface instanceof IFlpDebugListener) {
                return (IFlpDebugListener) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                byte[] createByteArray = parcel.createByteArray();
                enforceNoDataAvail(parcel);
                onEvent(createByteArray);
                return true;
            }
            return false;
        }
    }

    void onEvent(byte[] bArr);
}
